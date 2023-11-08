package robotService.core;

import java.security.Identity;
import java.util.ArrayList;
import java.util.Collection;

import robotService.common.ConstantMessages;
import robotService.common.ExceptionMessages;
import robotService.entities.robot.FemaleRobot;
import robotService.entities.robot.MaleRobot;
import robotService.entities.robot.Robot;
import robotService.entities.services.MainService;
import robotService.entities.services.SecondaryService;
import robotService.entities.services.Service;
import robotService.entities.supplements.MetalArmor;
import robotService.entities.supplements.PlasticArmor;
import robotService.entities.supplements.Supplement;
import robotService.repositories.Repository;
import robotService.repositories.SupplementRepository;

public class ControllerImpl implements Controller {

	private final Repository supplements;
	private final Collection<Service> services;
	
	
	public ControllerImpl() {
		this.supplements=new SupplementRepository();
		this.services = new ArrayList<>();
	}
	
	
	@Override
	public String addService(String type, String name) {
		
		if(type.equals("MainService")) {
			this.services.add(new MainService(name));
			return "MainService is successfully added.";
		}else if(type.equals("SecondaryService")) {
			this.services.add(new SecondaryService(name));
			return "SecondaryService is successfully added.";
		}
		
		throw new NullPointerException(ExceptionMessages.INVALID_SERVICE_TYPE);

	}

	@Override
	public String addSupplement(String type) {
		if(type.equals("PlasticArmor")) {
			this.supplements.addSupplement(new PlasticArmor());
			return "PlasticArmor is successfully added.";
		}else if(type.equals("MetalArmor")) {
			this.supplements.addSupplement(new MetalArmor());
			return "MetalArmor is successfully added.";
		}
		
		throw new IllegalArgumentException(ExceptionMessages.INVALID_SUPPLEMENT_TYPE);
	
	}

	@Override
	public String supplementForService(String serviceName, String supplementType) {
		
		
		
		Supplement supplement=supplements.findFirst(supplementType);
		
		Service service=getService(serviceName);
		
		
		if(supplement==null) {
			throw new IllegalArgumentException(String.format(ExceptionMessages.NO_SUPPLEMENT_FOUND, supplementType));
		}
		
		
		service.addSupplement(supplement);
		supplements.removeSupplement(supplement);
		
		return "Successfully added "+supplementType+" to "+serviceName+".";
	}

	@Override
	public String addRobot(String serviceName, String robotType, String robotName, String robotKind, double price) {
		
		Service service=getService(serviceName);
		Robot robot=null;
		
		if(robotType.equals("MaleRobot")) {
			robot=new MaleRobot(robotName, robotKind, price);
		}else if(robotType.equals("FemaleRobot")) {
			robot=new FemaleRobot(robotName, robotKind, price);
		}else {
			throw new IllegalArgumentException(ExceptionMessages.INVALID_ROBOT_TYPE);
		}
		
		try {
			service.addRobot(robot);
		} catch (IllegalArgumentException e) {
			return ConstantMessages.UNSUITABLE_SERVICE;
		}
		
		return String.format(ConstantMessages.SUCCESSFULLY_ADDED_ROBOT_IN_SERVICE, robotType, serviceName);
	}

	@Override
	public String feedingRobot(String serviceName) {
		
		Service service=getService(serviceName);
		
		service.feeding();
		return String.format(ConstantMessages.FEEDING_ROBOT, service.getRobots().size());
	}

	@Override
	public String sumOfAll(String serviceName) {
		
		Service service=getService(serviceName);

//		double robotsPrice=service.getRobots().stream().mapToDouble(r->r.getPrice()).sum();
		double robotsPrice=service.getRobots().stream().mapToDouble(Robot::getPrice).sum();
		double supplementsPrice=service.getSupplements().stream().mapToDouble(Supplement::getPrice).sum();

		
		return String.format(ConstantMessages.VALUE_SERVICE, serviceName, robotsPrice+supplementsPrice);
	}

	@Override
	public String getStatistics() {
		
		StringBuilder sb= new StringBuilder();
		
		this.services.forEach(s->{
			sb.append(s.getStatistics());
			sb.append("\n");
		});
		
		return sb.toString().trim();
	}
	
	private Service getService(String serviceName) {
		return services.stream().filter(s-> s.getName().equals(serviceName)).findFirst().orElse(null);
	}

}

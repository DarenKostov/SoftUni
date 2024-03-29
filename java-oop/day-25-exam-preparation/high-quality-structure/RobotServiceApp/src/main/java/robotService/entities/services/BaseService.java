package robotService.entities.services;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.stream.Collectors;

import javax.print.DocFlavor.CHAR_ARRAY;

import robotService.common.ExceptionMessages;
import robotService.entities.robot.Robot;
import robotService.entities.supplements.Supplement;

public abstract class BaseService implements Service {

	private String name;
	private int capacity;
	private Collection<Supplement> supplements;
	private Collection<Robot> robots;
	
	
	
	
	
	
	protected BaseService(String name, int capacity) {
		this.name = name;
		this.capacity = capacity;
		this.supplements=new ArrayList<>();
		this.robots=new ArrayList<>();
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public void setName(String name) {
		if(name==null || name.trim().isEmpty()) {
			throw new NullPointerException(ExceptionMessages.SERVICE_NAME_CANNOT_BE_NULL_OR_EMPTY);
		}
		this.name=name;
	}

	@Override
	public Collection<Robot> getRobots() {
		return Collections.unmodifiableCollection(this.robots);
	}

	@Override
	public Collection<Supplement> getSupplements() {
		return Collections.unmodifiableCollection(this.supplements);
	}

	@Override
	public void addRobot(Robot robot) {
		if(this.getRobots().size()>=this.capacity) {
			throw new IllegalStateException(ExceptionMessages.NOT_ENOUGH_SERVICE_CAPACITY);
		}
		this.robots.add(robot);
	}

	@Override
	public void removeRobot(Robot robot) {
		this.robots.remove(robot);
	}

	@Override
	public void addSupplement(Supplement supplement) {
		this.supplements.add(supplement);

	}

	@Override
	public void feeding() {
		this.robots.forEach(r->r.eating());

	}

	@Override
	public int sumHardness() {
		return this.getSupplements().stream().mapToInt(Supplement::getHardness).sum();
	}

	@Override
	public String getStatistics() {
//		"{serviceName} {serviceType}:
//		Robots: {robotName1} {robotName2} {robotName3} ... / Robots: none
//		Supplements: {supplementsCount} Hardness: {sumHardness}
		
		String template="%s %s:\n"
		+"Robots: %s\n"
		+"Supplements: %s"
		+"Hardness: %s\n";

		return String.format(template,
				this.getName(),
				this.getClass().getSimpleName(),
				this.getRobots().isEmpty()? "none" : 
					this.getRobots().stream().map(r->r.getName()).collect(Collectors.joining(" ")),
				this.getSupplements().size(),
				this.sumHardness());
	}

}

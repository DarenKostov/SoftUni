package robotService.entities.services;

import robotService.entities.robot.FemaleRobot;
import robotService.entities.robot.MaleRobot;
import robotService.entities.robot.Robot;
import robotService.entities.supplements.BaseSupplement;

public class SecondaryService extends BaseService {

	private final static int DEFAULT_CAPACITY=15;
	
	
	public SecondaryService(String name) {
		super(name, DEFAULT_CAPACITY);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void addRobot(Robot robot) {
		if(robot instanceof FemaleRobot) {
			super.addRobot(robot);
			return;
		}
		throw new IllegalArgumentException();
	}


}

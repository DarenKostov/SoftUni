package robotService;

import robotService.core.Engine;
import robotService.core.EngineImpl;
import robotService.entities.robot.MaleRobot;
import robotService.entities.robot.Robot;
import robotService.entities.services.MainService;
import robotService.entities.services.Service;

public class Main {
    public static void main(String[] args) {
    	
//    	Service service=new MainService("WWWWW");
//    	service.addRobot(new MaleRobot("name", "green", 3.14));
    	
    	
    	
        Engine engine = new EngineImpl();
        engine.run();
    }
}

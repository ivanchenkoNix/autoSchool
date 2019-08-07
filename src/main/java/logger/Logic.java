package logger;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Logic {
    private static final Logger logger = LogManager.getLogger(Logic.class);

    private void action1(){
        System.out.println("Action 1");
        logger.info("Some log info");
    }

    public void action2(){
        action1();
        System.out.println("Action 2");
        logger.info("Some log info2");
    }

}

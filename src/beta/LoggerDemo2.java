package beta;

import org.apache.logging.log4j.*;



public class LoggerDemo2 {
    public static Logger logger = LogManager.getLogger(LoggerDemo2.class.getName());
    public static void main (String []args){

        logger.info("This is info msg from loggerdemo2");

        logger.error("This is err msg from loggerdemo2");

        logger.debug("This is debug msg from loggerdemo2");

        logger.fatal("this is fatal msg from loggerdemo2");



    }

}

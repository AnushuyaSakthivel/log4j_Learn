package alpha;

import org.apache.log4j.xml.DOMConfigurator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoggerDemo1 {

    private static Logger log = LogManager.getLogger(LoggerDemo1.class.getName());
    public static void main (String [] args){
        //DOMConfigurator.configure("log4j.xml");

        log.debug("Juzt debug msg");
        log.error("obj not found");
        log.info("This is info");
        log.fatal("This is fatal");



    }

}

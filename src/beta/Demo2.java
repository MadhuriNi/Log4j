package beta;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;




public class Demo2 {

	
	private static Logger log=LogManager.getLogger(Demo2.class.getName());
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//PropertyConfigurator.configure("Log4j.properties");
		
		log.debug("I am debugging");
		log.info("object is present");
		log.error("object is not present");
	}

}

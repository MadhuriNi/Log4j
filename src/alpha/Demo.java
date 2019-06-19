package alpha;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;




public class Demo {

	
	private static Logger log=LogManager.getLogger(Demo.class.getName());
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//PropertyConfigurator.configure("Log4j.properties");
		
		log.debug("I am debugging");
		log.info("object is present");
		log.error("object is not present");
	}

}




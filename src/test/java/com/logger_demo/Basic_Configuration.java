package com.logger_demo;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class Basic_Configuration {
	
	//Factory design pattern
	
	public static Logger log = Logger.getLogger(Basic_Configuration.class);
	
	
	public static void main(String[] args) {
		
		
	//configuration
		
		
		BasicConfigurator.configure();
		
		log.debug("Debugging");
		
		log.info("information");
		
		log.warn("warning");
		
		log.error("Error occur");
		
		log.fatal("Fatal - unavoidable");
		
		
		
			
		
		
		
	}

}

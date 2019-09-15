/**
 * 
 */
package com.cucumber.helpers;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

/**
 * @author Pranob Kalita
 * 08-Sep-2019
 */

public class LoggerHelper {

	private static boolean root=false;
	
	public static Logger getLogger(Class cls){
		if(root){
			return Logger.getLogger(cls);
		}
		PropertyConfigurator.configure(System.getProperty("user.dir") 
										+ "/configuration/logconfigs/log4j.properties");
		root = true;
		return Logger.getLogger(cls);
	}
	
	public static void main(String[] args) {
		Logger log = LoggerHelper.getLogger(LoggerHelper.class);
		log.info("Testing log4j logger");
				
	}
}

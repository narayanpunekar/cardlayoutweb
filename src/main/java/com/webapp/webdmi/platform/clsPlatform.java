/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.webapp.webdmi.platform;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
//import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Properties;

import static java.lang.System.out;
import java.util.logging.Logger;

/**
 *
 * @author narayan.punekar@yahoo.com
 * Platform based on tutorial
 *
 */
public class clsPlatform {

    private static final Logger log = Logger.getLogger(clsPlatform.class.getName());
    
    public clsPlatform() throws IOException, FileNotFoundException {
        try {
            //1a. The application uses System.getenv to retrieve environment variable values.
            Map<String,String> env = System.getenv();
            for (String envName : env.keySet()) {
                log.info(envName + " " + env.get(envName));
                //out.format("%s=%s%n", envName, env.get(envName));
            }

            //1b. With a String argument, getenv returns the value of the specified variable.
            //User variable applicationProps D:\downloads\NetBeansProjects\JavaWorkshop\build\classes\resources\
            String strEnv = "applicationProps";
            String value = System.getenv(strEnv);
            if (value != null) {
                log.info("env:" + env + " ,value:" + value);
                //System.out.format("%s=%s%n",
                //                  env, value);
            } else {
                log.info("env:" + env);
                //System.out.format("%s is"
                //    + " not assigned.%n", env);
            }
            
            //User variable applicationProps D:\downloads\NetBeansProjects\JavaWorkshop\build\classes\resources\
            String strEnvnameapplicationprops = env.get(strEnv);
/*
            //2a. The application loads the default properties from a well-known location.
            String strApplicationpropspath = strEnvnameapplicationprops + "application.properties";
            FileInputStream in = new FileInputStream(strApplicationpropspath);
            // create and load default properties
            Properties defaultProps = new Properties();
            defaultProps.load(in);
            log.info("defaultProps.size:" + defaultProps.size());
            //out.println(defaultProps.size());
            in.close();

            //2b. The application loads the properties that were saved from the last time the application was run.
            String strProductbacklogpath = strEnvnameapplicationprops + "properties.xml";
            //<!DOCTYPE properties SYSTEM "http://java.sun.com/dtd/properties.dtd">
            in = new FileInputStream(strProductbacklogpath);
            // create application properties with default
            Properties applicationProps = new Properties(defaultProps);
            // now load properties from last invocation
            applicationProps.loadFromXML(in);
            log.info("applicationProps.size:" + applicationProps.size());
            //out.println(applicationProps.size());
            in.close();

            //2c. The application writes out the application properties.
            //FileOutputStream out = new FileOutputStream(strApplicationpropspath);
            //applicationProps.store(out, "---No Comment---");
            //out.close();
            
            String strMypropertiestxtpath = strEnvnameapplicationprops + "myProperties.txt";
            FileInputStream propFile = new FileInputStream(strMypropertiestxtpath);
            Properties p = new Properties(System.getProperties());
            p.load(propFile);
            // set the system properties
            System.setProperties(p);
            // display new properties
            System.getProperties().list(System.out);
            propFile.close();
*/

        } catch (Exception e) {
            log.info("Exception" + e.toString());
            log.warning("Exception" + e.toString());
            e.printStackTrace();
            throw new ExceptionInInitializerError(e.toString());
        }        
    }

    public static void main(String[] args) throws Exception {
        new clsPlatform();
    }
    
}

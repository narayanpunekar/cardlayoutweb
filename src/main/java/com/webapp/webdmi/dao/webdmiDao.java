/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.webapp.webdmi.dao;

import com.webapp.webdmi.platform.clsPlatform;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.ResultSet;
import java.sql.SQLException;

import static java.lang.System.out;
import java.util.logging.Logger;

/**
 *
 * @author narayan.punekar@yahoo.com
 */
public class webdmiDao {
    //https://cloud.google.com/appengine/docs/flexible/java/configuring-the-web-xml-deployment-descriptor
    private static final Logger log = Logger.getLogger(webdmiDao.class.getName());

    static { 
        try {
            Scanner scanner = new Scanner(webdmiDao.class.getClassLoader().getResourceAsStream("application.properties"));
            //Scanner scanner = new Scanner(new BufferedReader(new FileReader("application.properties")));
            while (scanner.hasNext()) {
                log.info(scanner.next());
                out.println(scanner.next());
            }
            //scanner.useDelimiter("");
        } catch (Exception e) {
            log.info("Exception" + e.toString());
            log.warning("Exception" + e.toString());
            e.printStackTrace();
            throw new ExceptionInInitializerError(e.toString());
        }
    }

    /**
     * Retrieve an employee by username/email and password
     */
    public static void fnLogin(String strEmail, String strPassword) {
        try {
            new clsPlatform();
            log.info("fnLogin");
        } catch (Exception e) {
            log.info("Exception" + e.toString());
            log.warning("Exception" + e.toString());
            e.printStackTrace();
            throw new ExceptionInInitializerError(e.toString());
        }
    }

}

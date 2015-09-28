/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.haradriam.photomanager;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

/**
 *
 * @author adrian
 */
public class DeviceManager {
    /**
     * getAvailableDevices: Get the configured available devices
     * @return String[]
     * @throws Exception
     */
    public String[] getAvailableDevices() throws Exception {
        Properties prop = new Properties(); //Declare properties variable
        File deviceFile = new File(Constants.DEVICES_FILE); //Define the file that contains available devices

        try {
            InputStream is = new FileInputStream(deviceFile); //Get InputStream from the configuration file
            prop.load(is); //Load the InputStream of the configuration file
            String[] deviceName = new String[Integer.parseInt(prop.getProperty("Configured_devices"))]; //Each device name

            for(int i = 0; i < deviceName.length; i++) { //Read the available devices
                deviceName[i] = prop.getProperty("Device_" + i); //Store each available device
            }
            return deviceName; //Return deviceName
        }
        catch(IOException | NumberFormatException e) {
            throw new Exception("Error getting available devices"); //Throw exception
        }		
    }

    /**
     * setAvailableDevices: Set the available devices
     * @param deviceName
     * @return boolean
     * @throws Exception
     */
    public boolean setAvailableDevices(String[] deviceName) throws Exception {	
        Properties prop = new Properties(); //Declare properties variable
        File deviceFile = new File(Constants.DEVICES_FILE); //Define the file that contains available devices

        try {
            OutputStream os = new FileOutputStream(deviceFile); //Get OutputStream from the configuration file
            int i;
            for(i = 0; i < deviceName.length; i++) { //Read the available devices
                    prop.setProperty("Device_" + i, deviceName[i]); //Set values
            }
            prop.setProperty("Configured_devices", Integer.toString(i)); //Set number of configured devices
            prop.store(os, "Available devices"); //Store properties

            return true; //Return true
        }
        catch(Exception e) {
            throw new Exception("Error setting available devices"); //Throw exception
        }		
    }
}

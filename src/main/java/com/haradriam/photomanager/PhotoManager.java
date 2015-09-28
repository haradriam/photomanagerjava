/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.haradriam.photomanager;

import com.haradriam.filerename.FileRename;
import java.io.File;
import org.apache.commons.io.FilenameUtils;

/**
 *
 * @author adrian
 */
public class PhotoManager {
    static FileRename fr = new FileRename(); //FileRename instance

    static String mainDirPath; //Main directory path
    static String[] deviceDirPath = new String[Constants.MAX_DEVICES]; //Each device directory path
    
//    static DeviceManager deviceManager = new DeviceManager();
//    public static void main(String [ ] args) throws Exception {
//        String[] availableDevices = deviceManager.getAvailableDevices();
//    }
    
    /**
     * prepareDirs: Prepare directory structure
     * @param eventName
     * @param destDir
     * @param deviceName
     * @return boolean
     * @throws Exception
     */
    public boolean prepareDirs(String eventName, String destDir, String[] deviceName) throws Exception {
        mainDirPath = FilenameUtils.normalize(destDir + "/tmp" + eventName); //Temporary directory path
        File tmpMainDir = new File(mainDirPath); //Temporary directory

        try {
            if(tmpMainDir.exists()) { //Check whether temporary directory already exists
                if(!tmpMainDir.delete()) { //Delete existing temporary directory
                    throw new Exception("Error deleting temporary directory"); //Throw exception
                }
            }
            if(!tmpMainDir.mkdir()) { //Create temporary directory
                throw new Exception("Error creating temporary directory"); //Throw exception
            }

            File deviceDir; //File to manage directories of the devices
            for(int i = 0; i < deviceName.length; i++) { //Tour through the available devices
                deviceDirPath[i] = FilenameUtils.normalize(mainDirPath + "/" + deviceName[i]); //Generate device directory path
                deviceDir = new File(deviceDirPath[i]); //Device directory
                if(!deviceDir.exists()) { //Check whether directory already exists
                    if(!deviceDir.mkdir()) { //Create device directory
                        throw new Exception("Error creating device directory"); //Throw exception
                    }
                }
            }

            return true; //Return true
        }
        catch(SecurityException e) {
            throw new Exception("Error preparing directories"); //Throw exception
        }
    }
    
    /**
     * processDir: Process a directory renaming its files
     * @param eventName
     * @param deviceName
     * @param sourceDirPath
     * @return boolean
     * @throws Exception
     */
    public boolean processDir(String eventName, String[] deviceName, String[] sourceDirPath) throws Exception {
        int lowestDate = 99999999; //Integer to store the lowest date of the processed files

        for(int index = 0; index < deviceName.length; index++) {
            File sourceDir = new File(sourceDirPath[index]); //Source directory
            String[] filesList = sourceDir.list(); //Get files list

            int i = 0; //Index to cycle through the available files
            String filePath; //String to manage path of the files
            String finalName; //String to manage name of the files

            while(i < filesList.length) { //Tour through the available files
                try {
                    filePath = FilenameUtils.normalize(sourceDirPath[index] + "/" + filesList[i]); //Get file path
                    finalName = fr.getFinalName(filePath, eventName, deviceName[index]); //Get file final name
                    if(Integer.parseInt(finalName.substring(0, 7)) < lowestDate) { //Check whether the new date is lower than stored one
                        lowestDate = Integer.parseInt(finalName.substring(0, 7)); //Store new date
                    }
                }
                catch(Exception e) {
                    throw new Exception(e.getMessage()); //Throw exception
                }

                if(!fr.renameFile(filePath, finalName, deviceDirPath[index])) { //Rename the file
                    throw new Exception("Error renaming file " + filePath); //Throw exception
                }

                i++; //Update index
            }
        }

        fr.renameFile(mainDirPath, lowestDate + "_" + eventName, mainDirPath.substring(0, mainDirPath.indexOf("tmp" + eventName) - 1));

        return true;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.haradriam.filerename;

import java.io.File;
import java.util.Date;
import org.apache.commons.io.FilenameUtils;

/**
 *
 * @author adrian
 */
public class FileRename {
    static FileMetadata fm; //FileMetadata instance
    
    /**
     * FileRename: Constructor
     */
    public FileRename() {
        fm = new FileMetadata(); //Create a FileMetadata instance
    }
    
    /**
     * getFinalName: Obtain the final name of the file
     * @param filePath
     * @param commonName
     * @param deviceName
     * @return String
     * @throws Exception
     */
    public String getFinalName(String filePath, String commonName, String deviceName) throws Exception {
        String finalName; //Final name of the file
        Date creationDate; //File creation date

        try {
            creationDate = fm.getCreationDate(filePath); //Get file creation date

            finalName = fm.getCreationDay(creationDate); //Get file creation day
            finalName = finalName + "_" + fm.getCreationTime(creationDate); //Get file creation day

            if(commonName != null){ //Check whether common name is provided
                finalName = finalName + "_" + commonName; //Add common name to the final name
            }
            if(deviceName != null){ //Check whether device name is provided
                finalName = finalName + "_" + deviceName; //Add device name to the final name
            }

            String ext; //File extension
            if(!"".equals(ext = FilenameUtils.getExtension(filePath))) { //Check whether the file has extensión
                finalName = finalName + "." + ext; //Add extension to the final name
            }

            return finalName; //Return final name
        } catch (Exception e) {
            throw new Exception("Error getting the final name of the file " + filePath); //Throw exception
        }		
    }
    
    /**
     * renameFile: Rename the original file to another file name
     * @param filePath
     * @param finalName
     * @param finalFilePath
     * @return boolean
     */
    public boolean renameFile(String filePath, String finalName, String finalFilePath) {
        File originalFile = new File(filePath); //Original file path
        File renamedFile = new File(FilenameUtils.normalize(finalFilePath + "/" + finalName)); //Renamed file
        
        return originalFile.renameTo(renamedFile); //Rename file
    }
}

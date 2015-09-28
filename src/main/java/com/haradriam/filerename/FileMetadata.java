/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.haradriam.filerename;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author adrian
 */
public class FileMetadata {
    /**
     * getCreationDate: Get the file creation date
     * @param filePath
     * @return Date
     * @throws Exception
     */
    public Date getCreationDate(String filePath) throws Exception {
        try {
            Path path = Paths.get(filePath);
            BasicFileAttributes attrs = Files.readAttributes(path, BasicFileAttributes.class); //Get file attributes
            FileTime creationDate = attrs.creationTime(); //Get file full creation date

            long creationDateMs = creationDate.toMillis(); //Convert FileTime to a ms date

            return new Date(creationDateMs); //Generate full date from creation date
        }
        catch(Exception e) {
            throw new Exception("Error getting file creation date"); //Throw exception
        }
    }
    
    /**
     * getCreationDay: Format a date to obtain the day
     * @param creationDate
     * @return String
     */
    public String getCreationDay(Date creationDate){
        Format timeFormat = new SimpleDateFormat("yyyyMMdd"); //Define format of the time

        return timeFormat.format(creationDate); //Return formated time
    }
    
    /**
     * getCreationTime: Format a date to obtain the time
     * @param creationDate
     * @return String
     */
    public String getCreationTime(Date creationDate){
           Format timeFormat = new SimpleDateFormat("HHmmss"); //Define format of the time

           return timeFormat.format(creationDate); //Return formated time
    }
}

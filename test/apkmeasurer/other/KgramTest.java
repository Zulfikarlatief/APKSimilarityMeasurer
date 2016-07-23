/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apkmeasurer.other;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author zulfikar
 */
public class KgramTest {
    
    String user = System.getProperty("user.name"); 
    List<File> fileList1 = new ArrayList<File>();
    List<ArrayOpcode> arrOp1 = new ArrayList<ArrayOpcode>();
    Kgram kgram;
    
    @Before
    public void init() throws FileNotFoundException{
       listingFile("/home/"+user+"/Apkmeasurer/subject1",fileList1);
       
       for (File file : fileList1){
           
             
             ArrayOpcode arr = new ArrayOpcode(file);
//             System.out.println(file.getName());
           
             arrOp1.add(arr);
         }
       kgram = new Kgram(arrOp1.get(0),6);
       
    }
    
    @Test
    public void testgetGram() {
       
        assertEquals("Same", kgram.getGramCount() , kgram.getKgram().size());
       
    }
    
     @Test
    public void testNull() {
        assertNotNull("null", kgram.getKgram());
       
    }
    
    @Test
    public void testGram() {
        assertEquals("Same", 6 , kgram.getKgram().get(0).getGram().size());
       
    }
    
    @Test
    public void testKGram() {
        assertTrue("Lebih dari 0", kgram.getKgram().size() > 0);
       
    }
    
    
    private void listingFile(String directoryName,List<File> fileList){
        File directory = new File(directoryName);

    // get all the files from a directory
        File[] fList = directory.listFiles();

        for (File file : fList) {
            if (file.isFile()) {
                if(file.getName().endsWith(".smali")) {
                    fileList.add(file);
                }
            } else if (file.isDirectory()) {
                
                if(file.getName().equals("android")){
//                    System.out.println(file.getName());
                }else{
                    listingFile(file.getAbsolutePath(),fileList);
                    
                }
                
            }
        }
    }
    
}

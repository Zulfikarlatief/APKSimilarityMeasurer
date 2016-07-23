/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apkmeasurer.other;

import java.io.File;
import java.io.FileNotFoundException;
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
public class ArrayOpcodeTest {
    
    String user = System.getProperty("user.name"); 
    List<File> fileList1 = new ArrayList<File>();
    ArrayOpcode arrayOp;
    
    @Before
    public void init() throws FileNotFoundException{
       listingFile("/home/"+user+"/Apkmeasurer/subject1",fileList1);
       
        arrayOp = new ArrayOpcode(fileList1.get(0));
       
    }
    
     @Test
    public void testNull() {
        assertNotNull("null", arrayOp.getArrOpcode());
       
    }
    
    @Test
    public void testOpcode() {
//        System.out.println("ArrOp= "+arrayOp.getArrOpcode().size());
        assertTrue("Lebih dari 0", arrayOp.getArrOpcode().size() > 0);
       
    }
    
    @Test
    public void testOpcode2() {
        System.out.println("Name file= "+arrayOp.getName());
        assertEquals("Sama dengan 7", 7 , arrayOp.getArrOpcode().size());
       
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

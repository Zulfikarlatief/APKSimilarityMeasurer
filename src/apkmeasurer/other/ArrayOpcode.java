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
import java.util.Scanner;

/**
 *
 * @author zword
 */
public class ArrayOpcode {
    List<String> arrOpcode = new ArrayList<String>();
    int count = 0;
    String name;
    File file;
    

    public ArrayOpcode(File file) throws FileNotFoundException {
        
        //Make array opcode
        setArrayOpcode(file);
        this.name = file.getName();
        int pos = this.name.lastIndexOf(".");
        if (pos > 0) {
            this.name = this.name.substring(0, pos);
        }
        
        this.file = file;
    }

    
    public List<String> getArrOpcode() {
        return arrOpcode;
    }

    private void setArrayOpcode(File file) throws FileNotFoundException {
        
        String[] opcode = Data.opcode;
        Scanner scanner = new Scanner(file);
        while (scanner.hasNext()) {
            String nextToken = scanner.next();
//            System.out.println(nextToken);
            for(int i= 0 ; i< opcode.length;i++){
                if (nextToken.equalsIgnoreCase(opcode[i])){
                    count++;
                    arrOpcode.add(opcode[i]);
                }
            }
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
   
    
    
}

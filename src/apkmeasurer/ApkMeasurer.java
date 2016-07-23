/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apkmeasurer;

import apkmeasurer.other.ArrayOpcode;
import apkmeasurer.other.Data;
import apkmeasurer.other.Gram;
import apkmeasurer.other.Kgram;
import apkmeasurer.view.MainFrame;
import brut.common.BrutException;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;




/**
 *
 * @author zword
 */
public class ApkMeasurer {

    /**
     * @param args the command line arguments
     */
    
    static String[] command = new String[2];
    static List<File> fileList1 = new ArrayList<File>();
    
    public static void main(String[] args) throws IOException, InterruptedException, BrutException {
        // TODO code application logic here
        
           MainFrame fr = new MainFrame();
           fr.setVisible(true);
 
    }
    
 
   
    
    
     
}

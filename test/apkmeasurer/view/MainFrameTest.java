/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apkmeasurer.view;

import apkmeasurer.other.ArrayOpcode;
import java.io.FileNotFoundException;
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
public class MainFrameTest {
    
    MainFrame frame;
    
    @Before
    public void init() {
      
       frame = new MainFrame();
      
       
    }
    
     @Test
    public void testNull() {
        assertNotNull("null", frame);
       
    }
    
}

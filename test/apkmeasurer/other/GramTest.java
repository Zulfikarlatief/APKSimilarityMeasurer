/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apkmeasurer.other;

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
public class GramTest {
    
    Gram gram;
    List<String> list;
    
    @Before
    public void init(){
        list = new ArrayList<>();
        list.add("abcde");
        list.add("defgh");
        list.add("hijkl");
        list.add("klmno");
        
        gram = new Gram(6,list);
    }
    
     @Test
    public void testGram1() {
        assertNotNull("null", gram);
       
    }
    
    @Test
    public void testGram2() {
        assertEquals("total gram", 4 , gram.getGram().size());
       
    }
    
    
}

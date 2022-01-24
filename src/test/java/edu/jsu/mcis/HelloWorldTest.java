package edu.jsu.mcis;

import org.junit.*;
import static org.junit.Assert.*;

public class HelloWorldTest {
    
    @Test
    public void testShowIt() {
        HelloWorld h = new HelloWorld();
        assertEquals("hello world", h.showIt());
    }
    
    @Test
    public void testReverseIt() {
        HelloWorld h = new HelloWorld();
        assertEquals("dlrow olleh", h.reverseIt());
    }
        
}

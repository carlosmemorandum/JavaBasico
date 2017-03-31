package net.memorandum.tests;

import static org.junit.Assert.*;
import net.memorandum.beans.KeepHydrated;

import org.junit.Test;

public class TestHidratacion {
	
	KeepHydrated kh = new KeepHydrated();

	@Test
	public void test() {
		assertEquals(1, kh.Liters(2));
	}
	
	@Test
    public void SampleTest2()  {
    
      assertEquals(0, kh.Liters(0.97));
      
    }
    @Test
    public void SampleTest3()  {
    
      assertEquals(7, kh.Liters(14.64));
      
    }
    @Test 
    public void SampleTest4()  {
    
      assertEquals(800, kh.Liters(1600.20));
      
    }
    @Test
    public void SampleTest5()  {
    
      assertEquals(40, kh.Liters(80));
      
    }

}

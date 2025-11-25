package com.krakedev.ejemplojunit;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class TestRestar {
	 
	@Test
	    public void testRestar() {
	        Calculadora c = new Calculadora();
	        int resultado = c.restar(10, 4);
	        assertTrue(resultado==6);
	    }
}

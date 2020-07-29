package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;

@RunWith(SerenityRunner.class)
public class ExemploTest {
 
    
    
	@Steps 
    private PessoaSteps pessoaSteps;
 
    @Test
    public void test1() {
    	assertEquals(2,3);
    }
    
    @Test
    public void test2() {
    	assertEquals(2,2);
    }
}
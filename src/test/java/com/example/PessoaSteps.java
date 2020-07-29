package com.example;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

import net.thucydides.core.annotations.Step;

public class PessoaSteps {
	 
    private static Pessoa pessoa;
 
    @Step("Given a member has {0} points")
    public static void getPontos(int points) {
    	assertThat(pessoa.getPontos(),equalTo(points));
    }
 
    @Step("Then the member grade should be {0}")
    public static void getStatus(Status status) {
        assertThat(pessoa.getStatus(), equalTo(status));
    }

	public static void pessoaUi() {
		System.out.println("Ui");
		
	}
}

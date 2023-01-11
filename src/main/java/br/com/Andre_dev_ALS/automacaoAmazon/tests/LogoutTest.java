package br.com.Andre_dev_ALS.automacaoAmazon.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.com.Andre_dev_ALS.automacaoAmazon.core.BaseTest;
import br.com.Andre_dev_ALS.automacaoAmazon.pages.ContaPage;

public class LogoutTest extends BaseTest{
	ContaPage logout = new ContaPage();
	
@Test


public void id002FazerLogout() {
	logout.clicarBotaoSair();
	
	
	assertEquals("Fazer login", logout.obterMensagemParaLogar());
}
}

package br.com.Andre_dev_ALS.automacaoAmazon.tests;

import org.junit.Assert;
import org.junit.Test;

import br.com.Andre_dev_ALS.automacaoAmazon.core.BaseTest;
import br.com.Andre_dev_ALS.automacaoAmazon.pages.ContaPage;
import br.com.Andre_dev_ALS.automacaoAmazon.pages.MenuPage;


public class LoginTest extends BaseTest {
	ContaPage login = new ContaPage();
	MenuPage menu = new MenuPage();

	@Test
	public void FazerLogin() {
		menu.clicarOpicaoFazerLogin();
		login.setEmail();
		login.clicarBotaoContinuar();
		login.setSenha();
		login.clicarBotaoFazerLogin();
		Assert.assertEquals("Olá, Automação", login.obterTextoDeUsuarioConectado());
}
}
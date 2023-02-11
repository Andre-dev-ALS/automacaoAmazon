package br.com.Andre_dev_ALS.automacaoAmazon.core;

import static br.com.Andre_dev_ALS.automacaoAmazon.core.DriverFactory.killDriver;

import org.junit.Before;

import br.com.Andre_dev_ALS.automacaoAmazon.pages.ContaPage;
import br.com.Andre_dev_ALS.automacaoAmazon.pages.MenuPage;

public class BaseTest {
	private ContaPage login = new ContaPage();
	private MenuPage menu = new MenuPage();

	@Before

	public void iniciar() {
		login.acessarTelaInicial();
		menu.clicarOpicaoFazerLogin();
		login.setEmail();
		login.clicarBotaoContinuar();
		login.setSenha();
		login.clicarBotaoFazerLogin();
	}

	//@After

	public void finalizar() {
		killDriver();
	}
}
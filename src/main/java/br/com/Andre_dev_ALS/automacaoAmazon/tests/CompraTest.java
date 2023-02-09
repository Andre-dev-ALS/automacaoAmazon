package br.com.Andre_dev_ALS.automacaoAmazon.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.com.Andre_dev_ALS.automacaoAmazon.core.BaseTest;
import br.com.Andre_dev_ALS.automacaoAmazon.pages.CarrinhoPage;
import br.com.Andre_dev_ALS.automacaoAmazon.pages.CompraPage;
import br.com.Andre_dev_ALS.automacaoAmazon.pages.ContaPage;
import br.com.Andre_dev_ALS.automacaoAmazon.pages.MenuPage;
import br.com.Andre_dev_ALS.automacaoAmazon.pages.ProdutoPage;

public class CompraTest extends BaseTest {
	LogoutTest logout = new LogoutTest();
	ContaPage conta = new ContaPage();
	MenuPage menu = new MenuPage();
	ProdutoPage produto = new ProdutoPage();
	CarrinhoPage carrinho = new CarrinhoPage();
	CompraPage comprar = new CompraPage();

	@Test

	public void id012ValidarRedirecionamentoParaPaginaDeLoginNoFluxoDeCompra() {
		logout.id002FazerLogout();
		menu.clicarEmVoltarPaginaIniciao();

		produto.FazerProcuraDoProduto("televisão");
		produto.clicarBotaoProcurar();
		produto.clicarNoProduto("Televisão");
		comprar.clicarBotaoComprar();
		
		assertEquals("Fazer login", conta.obterMensagemParaFazerLogin());
	}
}

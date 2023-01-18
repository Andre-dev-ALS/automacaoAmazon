package br.com.Andre_dev_ALS.automacaoAmazon.tests;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import br.com.Andre_dev_ALS.automacaoAmazon.core.BaseTest;
import br.com.Andre_dev_ALS.automacaoAmazon.pages.ProdutoPage;

public class ProcurarProdutoTest extends BaseTest {
	ProdutoPage produto = new ProdutoPage();

	@Test
	public void id003ProcurarProdutoExistente() {
		produto.FazerProcuraDoProduto("bicicleta aro 29");
		produto.clicarBotaoProcurar();
		List<String> nomeProdutos = produto.obterNomeProdutoEncontrado();

		for (String nome : nomeProdutos) {

			Assert.assertTrue(nome.startsWith("bicicleta aro 29".toLowerCase()));
		}
	}

	@Test
	public void id004ProcurarProdutoInexistente() {
		produto.FazerProcuraDoProduto("___fdfsdfadsfcv+ITEM_INEXISTENTE_012345@@@))+23453");
		produto.clicarBotaoProcurar();
		Assert.assertTrue(produto.obterMensagemDeProdutoInexistente().startsWith("Nenhum resultado para "));
	}
}

package br.com.Andre_dev_ALS.automacaoAmazon.tests;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import br.com.Andre_dev_ALS.automacaoAmazon.core.BaseTest;
import br.com.Andre_dev_ALS.automacaoAmazon.pages.ProdutoPage;

public class ProcurarProduto extends BaseTest {
	ProdutoPage produto = new ProdutoPage();

	@Test
	public void id003ProcurarProdutoExistente() {
		produto.FazerProcuraDoProduto();
		produto.clicarBotaoProcurar();
		List<String> nomeProdutos = produto.obterNomeProdutoEncontrado();

		for (String nome : nomeProdutos) {

			Assert.assertTrue(nome.startsWith("bicicleta aro 29".toLowerCase()));
		}
	}
}

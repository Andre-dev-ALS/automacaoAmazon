package br.com.Andre_dev_ALS.automacaoAmazon.tests;

import org.junit.Assert;
import org.junit.Test;

import br.com.Andre_dev_ALS.automacaoAmazon.core.BaseTest;
import br.com.Andre_dev_ALS.automacaoAmazon.pages.CepPage;
import br.com.Andre_dev_ALS.automacaoAmazon.pages.ProdutoPage;

public class CepTest extends BaseTest {
	ProdutoPage produto = new ProdutoPage();
	CepPage cep = new CepPage();

	@Test
	public void id005ValidarFrete() {
		produto.FazerProcuraDoProduto("copo");
		produto.clicarBotaoProcurar();
		produto.clicarNoProduto("Copo");
		cep.clicarOpcaoEscolherLocalidade();
		cep.digitarCep("06010067");
		cep.clicarBotaoVerificarCep();
		String informacaoFrete = cep.InformacaoFrete();
		Assert.assertTrue(informacaoFrete.startsWith("Entrega GRÁTIS") || informacaoFrete.startsWith("Entrega R$"));
		String informacaoCepEntrega = cep.informacaoCepEntrega();
		Assert.assertTrue(informacaoCepEntrega.startsWith("Enviar para"));

	}

}

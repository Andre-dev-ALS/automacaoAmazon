package br.com.Andre_dev_ALS.automacaoAmazon.tests;

import org.junit.Assert;
import org.junit.Test;

import br.com.Andre_dev_ALS.automacaoAmazon.core.BaseTest;
import br.com.Andre_dev_ALS.automacaoAmazon.pages.CarrinhoPage;
import br.com.Andre_dev_ALS.automacaoAmazon.pages.ProdutoPage;

public class CarrinhoTest extends BaseTest {
	private ProdutoPage produto = new ProdutoPage();
	private CarrinhoPage carrinho = new CarrinhoPage();

	@Test

	public void id007VerificarSeProdutoEstaNoCarrinho() {
		produto.FazerProcuraDoProduto("frigideira");
		produto.clicarBotaoProcurar();
		produto.clicarNoProduto("Frigideira");
		carrinho.adicionarProdutoNoCarrinho();
		carrinho.clicarNoCarrinho();

		String nomeDoProdutoNoCarrinho[] = carrinho.confirmarProdutoNoCarrinho().split(" ");
		String nomeDoProduto = nomeDoProdutoNoCarrinho[0] + ' ' + nomeDoProdutoNoCarrinho[1];

		Assert.assertTrue(carrinho.confirmarProdutoNoCarrinho().startsWith(nomeDoProduto));
	}

	@Test
	public void id008DobrarAquantidadeDeProdutosNoCarrinhoEvalidarPreço() {
		produto.FazerProcuraDoProduto("frigideira");
		produto.clicarBotaoProcurar();
		produto.clicarNoProduto("Frigideira");
		carrinho.adicionarProdutoNoCarrinho();
		carrinho.clicarNoCarrinho();
		carrinho.mudarQuantidadeDeItensNoCarrinho("2");

		System.out.println(carrinho.obterPrecoDoProduto());
		System.out.println(carrinho.obterPrecoTotalDaCompra());

		Assert.assertTrue(carrinho.obterPrecoDoProduto() * 2 == carrinho.obterPrecoTotalDaCompra());
	}

	@Test
	public void id009AdicionarMúltiplosItensAoCarrinho() {
		produto.FazerProcuraDoProduto("fogão");
		produto.clicarBotaoProcurar();
		produto.clicarNoProduto("Fogão");
		carrinho.adicionarProdutoNoCarrinho();
		produto.FazerProcuraDoProduto("geladeira");
		produto.clicarBotaoProcurar();
		produto.clicarNoProduto("Geladeira");
		carrinho.adicionarProdutoNoCarrinho();
		carrinho.clicarNoCarrinho();

		Assert.assertEquals("Subtotal (2 itens):", carrinho.obterQuantidadeDeProdutosNoCarrinho());
	}

	@Test
	public void id010ValidarMensagemDeCarrinhoVazio() {
		produto.FazerProcuraDoProduto("garrafa");
		produto.clicarBotaoProcurar();
		produto.clicarNoProduto("Garrafa");
		carrinho.adicionarProdutoNoCarrinho();
		carrinho.clicarNoCarrinho();
		carrinho.clicarBotaoExcluirProduto();
		Assert.assertEquals("Seu carrinho de compras da Amazon está vazio.", carrinho.obterMensagemDeCarrinhoVazio());
	}

}

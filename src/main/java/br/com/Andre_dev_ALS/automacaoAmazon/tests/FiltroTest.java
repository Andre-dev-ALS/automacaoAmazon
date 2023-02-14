package br.com.Andre_dev_ALS.automacaoAmazon.tests;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

import br.com.Andre_dev_ALS.automacaoAmazon.core.BaseTest;
import br.com.Andre_dev_ALS.automacaoAmazon.pages.MenuPage;
import br.com.Andre_dev_ALS.automacaoAmazon.pages.ProdutoPage;

public class FiltroTest  extends BaseTest{
	MenuPage menu = new MenuPage();
	ProdutoPage produto = new ProdutoPage();
	
@Test

public void id013FiltrarProdutosPorCategorias() {
	menu.clicarMenuCategoria();
	menu.clicarBotaoVerMais();
	menu.clicarFiltrarPor("Computadores e Informática");
	menu.filtrarSubCategoriaPor("notebooks");
	
	List<String> nomeProdutos = produto.obterNomeProdutoEncontrado();

	for (int i = 0; i < nomeProdutos.size(); i++) {
if(nomeProdutos.get(i).startsWith("Notebook")) {
	assertTrue(nomeProdutos.get(i).startsWith("Notebook"));
}
}
}
}
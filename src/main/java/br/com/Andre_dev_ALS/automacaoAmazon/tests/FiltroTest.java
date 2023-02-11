package br.com.Andre_dev_ALS.automacaoAmazon.tests;

import org.junit.Test;

import br.com.Andre_dev_ALS.automacaoAmazon.core.BaseTest;
import br.com.Andre_dev_ALS.automacaoAmazon.pages.MenuPage;

public class FiltroTest  extends BaseTest{
	MenuPage menu = new MenuPage();
	
	
@Test

public void id013FiltrarProdutosPorCategorias() {
	menu.clicarMenuCategoria();
	menu.clicarBotaoVerMais();
	menu.clicarFiltrarPor("Computadores e Informática");
	menu.filtrarSubCategoriaPor("notebooks");
}
}

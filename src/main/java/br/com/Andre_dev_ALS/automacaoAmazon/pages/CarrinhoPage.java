package br.com.Andre_dev_ALS.automacaoAmazon.pages;

import static br.com.Andre_dev_ALS.automacaoAmazon.core.DriverFactory.getDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.Andre_dev_ALS.automacaoAmazon.core.BasePage;

public class CarrinhoPage extends BasePage {
	WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(40));

	public void adicionarProdutoNoCarrinho() {
		wait.until(ExpectedConditions.presenceOfElementLocated(
				By.xpath("//input[@id = 'add-to-cart-button' and @name = 'submit.add-to-cart']")));
		clicarBotao(By.xpath("//input[@id = 'add-to-cart-button' and @name = 'submit.add-to-cart']"));
	}

	public String confirmarProdutoNoCarrinho() {
		WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(100));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h1[contains(., 'Carrinho de compras')]")));
		return getDriver().findElement(By.xpath("//span[@class = 'a-truncate-full a-offscreen']/..")).getText();
	}

	public void clicarNoCarrinho() {
		clicarBotao(By.xpath("//*[@id=\"nav-cart\"]"));
	}
	
	public float obterPrecoDoProduto() {
		String preçoString = getDriver().findElement(By.xpath("a-size-medium a-color-base sc-price sc-white-space-nowrap sc-product-price a-text-bold")).getText();
		
		//lista com os possíveis elementos que irei usar no projeto 
		//<span class=​"sc-action-quantity" data-old-value=​"1" data-action=​"quantity"> ​…​ </span> ​  recolhido  11 de 17  nível 18
		//nível 21     <span class=​"a-dropdown-container"> ​  expandido  12 de 13
		//   <span data-action=​"delete" data-feature-id=​"delete" class=​"a-size-small sc-action-delete"> ​…​ </span> ​  recolhido  13 de 17  nível 18
//nível 19     <span class=​"a-declarative" data-action=​"sc-item-action" data-csa-c-type=​"widget" data-csa-c-func-deps=​"aui-da-sc-item-action" data-sc-item-action=​"{"itemID":​"Cd4829149-7c61-4fb0-886a-e2c8af0cd96d","itemType":​"active","isWishListItem":​0,"action":​"delete","isFresh":​0}​" data-csa-c-id=​"hsc1wc-elxnh2-7wywxb-7d1bj0"> ​  expandido  14 de 15
		//nível 20  <input name=​"submit.delete.Cd4829149-7c61-4fb0-886a-e2c8af0cd96d" value=​"Excluir" data-action=​"delete" aria-label=​"Excluir Jogo de Frigideiras Tramontina Loreto 27899106 Vermelho" type=​"submit" class=​"a-color-link"> ​  13 de 14
//nível 13     <span id=​"sc-subtotal-amount-activecart" class=​"a-color-price sc-price-container a-text-bold"> ​  expandido  10 de 12
		//<span class=​"a-size-medium a-color-base sc-price sc-white-space-nowrap"> ​R$&nbsp;149,99​ </span> ​  9 de 10  nível 14
	}
	
}

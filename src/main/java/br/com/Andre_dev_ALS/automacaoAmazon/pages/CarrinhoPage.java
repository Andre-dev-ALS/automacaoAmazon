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
		;
	}
}

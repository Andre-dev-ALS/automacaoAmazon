package br.com.Andre_dev_ALS.automacaoAmazon.pages;

import static br.com.Andre_dev_ALS.automacaoAmazon.core.DriverFactory.getDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.Andre_dev_ALS.automacaoAmazon.core.BasePage;

public class ProdutoPage extends BasePage {
	WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(100));

	public void FazerProcuraDoProduto(String nomeProduto) {
		escrever(By.xpath("//*[@id= 'twotabsearchtextbox']"), nomeProduto);
		
	}

	public void clicarBotaoProcurar() {
		clicarBotao(By.xpath("//*[@id=\"nav-search-submit-button\"]"));
	}

	public List<String> obterNomeProdutoEncontrado() {
		List<WebElement> produtos = getDriver().findElements(By.tagName("h2"));
		List<String> retorno = new ArrayList<String>();

		for (WebElement produto : produtos) {
			retorno.add(produto.getText());
		}
		return retorno;
	}

	public String obterMensagemDeProdutoInexistente() {
		return getDriver().findElement(By.xpath("//span[contains(., 'Nenhum resultado para')]")).getText();
	}

	public void clicarNoProduto(String produto) {
wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h2[contains(., '"+produto+"')]")));
		getDriver().findElement(By.xpath("//h2/a[contains(., '" + produto + "')]")).click();
	}
public String obterNomeDoProdutoClicado(String produto) {
	
	
return getDriver().getTitle();
	
}
}
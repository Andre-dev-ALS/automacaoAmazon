package br.com.Andre_dev_ALS.automacaoAmazon.pages;

import static br.com.Andre_dev_ALS.automacaoAmazon.core.DriverFactory.getDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.Andre_dev_ALS.automacaoAmazon.core.BasePage;

public class MenuPage extends BasePage {
	WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(30));

	public void clicarOpicaoFazerLogin() {
		try {
			clicarBotao(By.xpath("//*[@id=\"nav-link-accountList\"]/span"));
		} catch (Exception e) {

		}

	}

	public void clicarEmVoltarPaginaIniciao() {

		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//i[@class = 'a-icon a-icon-logo' ]")));
		getDriver().findElement(By.xpath("//i[@class = 'a-icon a-icon-logo' ]")).click();
	}

	public void clicarMenuCategoria() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[@class = 'hm-icon-label']")));
		clicarBotao(By.xpath("//span[@class = 'hm-icon-label']"));
	}

	public void clicarFiltrarPor(String  nomeCategoria) {
		WebElement categoria = getDriver().findElement(By.xpath("//a[@class = 'hmenu-item']/div[contains(., 'Computadores e Informática')]/.."));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@class = 'hmenu-item']/div[contains(., '"+nomeCategoria+"')]")));
		
		
		executarJS("window.scrollBy(0, arguments[0])", categoria.getLocation().y);
		
		
		clicarBotao(By.xpath("//a[@class = 'hmenu-item']/div[contains(., 'Computadores e Informática')]"));
	}

public void filtrarSubCategoriaPor(String nomeSubCategoria) {
	WebElement nomeCategoria = getDriver().findElement(By.xpath("//a[@class = 'hmenu-item' and contains(., 'Notebooks')]")); 
	wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@class = 'hmenu-item' and contains(., 'Notebooks')]")));
	
	
	//executarJS("window.scrollBy(0, arguments[0])", nomeCategoria.getLocation().y);
	
	

	clicarBotao(By.xpath("//a[@class = 'hmenu-item' and contains(., 'Notebooks')]"));
}

	public void clicarBotaoVerMais() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@class = 'hmenu-item hmenu-compressed-btn']")));
		clicarBotao(By.xpath("//a[@class = 'hmenu-item hmenu-compressed-btn']"));
	}
}
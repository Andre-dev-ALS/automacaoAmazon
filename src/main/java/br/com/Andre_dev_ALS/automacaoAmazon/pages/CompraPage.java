package br.com.Andre_dev_ALS.automacaoAmazon.pages;
import static br.com.Andre_dev_ALS.automacaoAmazon.core.DriverFactory.getDriver;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.Andre_dev_ALS.automacaoAmazon.core.BasePage;

public class CompraPage extends BasePage{

public void clicarBotaoComprar() {
	WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(20));
	wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id = 'buy-now-button']")));
	clicarBotao(By.xpath("//input[@id = 'buy-now-button']"));
}
}

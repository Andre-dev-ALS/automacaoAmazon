package br.com.Andre_dev_ALS.automacaoAmazon.pages;
import static br.com.Andre_dev_ALS.automacaoAmazon.core.DriverFactory.getDriver;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.Andre_dev_ALS.automacaoAmazon.core.BasePage;

public class MenuPage extends BasePage {

	public void clicarOpicaoFazerLogin() {
		try {
			clicarBotao(By.xpath("//*[@id=\"nav-link-accountList\"]/span"));
		} catch (Exception e) {

		}

	}
public void clicarEmVoltarPaginaIniciao() {
	
	WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(30));
wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//i[@class = 'a-icon a-icon-logo' ]")));
getDriver().findElement(By.xpath("//i[@class = 'a-icon a-icon-logo' ]")).click();
}
}

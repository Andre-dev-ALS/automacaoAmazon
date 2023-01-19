package br.com.Andre_dev_ALS.automacaoAmazon.pages;

import static br.com.Andre_dev_ALS.automacaoAmazon.core.DriverFactory.getDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.Andre_dev_ALS.automacaoAmazon.core.BasePage;

public class CepPage extends BasePage {
	WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(100));

	public void clicarOpcaoEscolherLocalidade() {
		try {
			wait.until(ExpectedConditions
					.presenceOfElementLocated(By.xpath("//*[@id= 'nav-global-location-data-modal-action']")));
			clicarBotao(By.xpath("//*[@id= 'nav-global-location-data-modal-action']"));
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
	}

	public void digitarCep(String numeroCep) {
		try {
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id = 'GLUXZipUpdateInput_0']")));
			escrever(By.xpath("//input[@id = 'GLUXZipUpdateInput_0']"), numeroCep);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public void clicarBotaoVerificarCep() {
		clicarBotao(By.xpath("//*[@id=\"GLUXZipUpdate\"]/span/input"));
		;
	}

	public String obterMensagemDeCepInvalido() {
		try {
			wait.until(ExpectedConditions.presenceOfElementLocated(
					By.xpath("//*[contains(., 'Insira um CEP válido')]/span[@id = 'GLUXZipError']")));
			return getDriver()
					.findElement(By.xpath("//*[contains(., 'Insira um CEP válido')]/span[@id = 'GLUXZipError']"))
					.getText();
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
		return "erro";
	}

	public String InformacaoFrete() {

		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id = 'mir-layout-DELIVERY_BLOCK']")));
		getDriver().manage().timeouts().pageLoadTimeout((Duration.ofSeconds(10)));

		String informacaoEntrega = getDriver().findElement(By.xpath("//div[@id = 'mir-layout-DELIVERY_BLOCK']"))
				.getText();

		return informacaoEntrega;
	}

	public String informacaoCepEntrega() {
		return getDriver().findElement(By.xpath("//div[@id = 'glow-ingress-block']")).getText();
	}
}
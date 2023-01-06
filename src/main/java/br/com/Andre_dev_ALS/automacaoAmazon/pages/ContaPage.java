package br.com.Andre_dev_ALS.automacaoAmazon.pages;

import static br.com.Andre_dev_ALS.automacaoAmazon.core.DriverFactory.getDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.Andre_dev_ALS.automacaoAmazon.core.BasePage;

public class ContaPage extends BasePage {
	WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(60));

	public void acessarTelaInicial() {
		getDriver().get(
				"https://www.amazon.com.br/?&tag=hydrbrabk-20&ref=pd_sl_7rwd1q78df_e&adgrpid=79547423725&hvpone=&hvptwo=&hvadid=591863875878&hvpos=&hvnetw=g&hvrand=9346565454231548641&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1001634&hvtargid=kwd-10573980&hydadcr=26346_11691057&gclid=EAIaIQobChMIwZzYsKCx_AIVgRPUAR0juwk6EAAYASAAEgLcXvD_BwE");
	}

	public void setEmail() {
		By emailPath = By.xpath("//input[@id = 'ap_email']");
		try {

			wait.until(ExpectedConditions.presenceOfElementLocated(emailPath));
			escrever(emailPath, "emailparatestesautomacao@gmail.com");
		} catch (Exception e) {

			System.out.println(e.getLocalizedMessage());
		}
	}

	public void clicarBotaoContinuar() {
		clicarBotao(By.xpath("//input[@id = 'continue']"));
	}

	public void setSenha() {
		try {
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id = 'ap_password']")));
			escrever(By.xpath("//input[@id = 'ap_password']"), "senhaautomacao");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public void clicarBotaoFazerLogin() {
		clicarBotao(By.xpath("//input[@id = 'signInSubmit']"));
	}
	
	public String obterTextoDeUsuarioConectado() {

		return getDriver().findElement(By.xpath("//*[@id=\"nav-link-accountList-nav-line-1\"]")).getText();
	}

	
}
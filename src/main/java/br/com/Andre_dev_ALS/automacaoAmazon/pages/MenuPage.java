package br.com.Andre_dev_ALS.automacaoAmazon.pages;

import org.openqa.selenium.By;

import br.com.Andre_dev_ALS.automacaoAmazon.core.BasePage;

public class MenuPage extends BasePage {

	public void clicarOpicaoFazerLogin() {
		try {
			clicarBotao(By.xpath("//*[@id=\"nav-link-accountList\"]/span"));
		} catch (Exception e) {

		}

	}

}

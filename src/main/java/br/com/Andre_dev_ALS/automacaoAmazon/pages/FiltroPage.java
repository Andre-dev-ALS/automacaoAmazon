package br.com.Andre_dev_ALS.automacaoAmazon.pages;

import static br.com.Andre_dev_ALS.automacaoAmazon.core.DriverFactory.getDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.Andre_dev_ALS.automacaoAmazon.core.BasePage;

public class FiltroPage extends BasePage {
	WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(100));

	public void filtrarMarca() {
wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[@class = 'a-size-base a-color-base' and contains(.,  'Lenovo')]/../div/label/input")));
		clicarCheck(By.xpath("//span[@class = 'a-size-base a-color-base' and contains(.,  'Lenovo')]/../div/label/i"));
	}
	
public void ordenarPor(String ordenar) {
	wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"s-result-sort-select\"]")));
selecionar(By.xpath("//*[@id=\"s-result-sort-select\"]"), ordenar);


}
}
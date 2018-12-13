package selenium_squadra;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PesquisaSquadra {

	WebDriver driver;
	
	public PesquisaSquadra(WebDriver driver) {
		this.driver = driver;
	}
	
	public PesquisaSquadra preencheCampoPesquisa(String pesquisa) {
		WebElement caixaPesquisa = driver.findElement(By.name("s"));
		caixaPesquisa.sendKeys(pesquisa);
		caixaPesquisa.submit();
		return this;
	}

}

package selenium_squadra;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumBasico {

	WebDriver driver;

	@Before
	public void preCondicao() {

		// iniciar chorme
		System.setProperty("webdriver.chrome.driver", "C://Selenium/chromedriver.exe");
		driver = new ChromeDriver();

		// acessar pagina da squadra
		driver.get("http://www.squadra.com.br/");

		// maximiza a tela
		driver.manage().window().maximize();

	}

	@Test
	public void pesquisaSquadra() {

		// imprime titulo da pagina no console
		System.out.println(driver.getTitle());

		// imprimi url atual no console
		System.out.println(driver.getCurrentUrl());

		WebElement caixaPesquisa = driver.findElement(By.name("s"));
		caixaPesquisa.sendKeys("quem somos");
		caixaPesquisa.submit();

		assertEquals("Quem somos", driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/div[1]/div/h3/a")).getText());

	}

	@After
	public void posCondicao() {

		// fecha a janela do navegador
		driver.quit();
	}

}

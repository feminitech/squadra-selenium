package selenium_squadra;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestePesquisaSquadra {
	
	private static PesquisaSquadra squadra;
	private static WebDriver driver;
	
	@Before
	public void preCondicao() {
		
		System.setProperty("webdriver.chrome.driver", "C://Selenium/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.squadra.com.br/");
		driver.manage().window().maximize();
		
		squadra = new PesquisaSquadra(driver);
	}

	@Test
	public void pesquisaSquadra() {
		squadra.preencheCampoPesquisa("Quem somos");
		
		assertEquals("Quem somos", driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/div[1]/div/h3/a")).getText());
	}
	
	@After
	public void posCondicao() {

		// fecha a janela do navegador
		driver.quit();
	}

}

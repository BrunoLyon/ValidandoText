package metodos;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MetodosDeTestes {

	WebDriver driver;

	public void abrirNavegador(String url) {
		// configurando navegador
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		// escolhendo navegador que vai ser executado
		driver = new ChromeDriver();
		// site que vai ser carregado
		driver.get(url);
		// configuracao de maximinizar navegador
		driver.manage().window().maximize();

	}

	public void validarTitle(String titleEsperado) {
		String titulo = driver.getTitle();
		assertEquals(titleEsperado, titulo);

	}

	public void fecharNavegador() {
		driver.quit();

	}

	public void EvidenciarTeste(String nomeEvidencias) throws IOException {
		TakesScreenshot scrShot = (TakesScreenshot) driver;
		File scrFile = scrShot.getScreenshotAs(OutputType.FILE);
		File destFile = new File("./evidencias/" + nomeEvidencias + ".png");
		FileUtils.copyFile(scrFile, destFile);
	}
	
	public void escrever(By elemento, String texto) {
		driver.findElement(elemento).sendKeys(texto);
			
	}

}
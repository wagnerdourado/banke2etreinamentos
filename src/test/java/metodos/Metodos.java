package metodos;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import driver.Drivers;

public class Metodos extends Drivers{
	
	public void clicar(By elemento) {
		esperarElementoClicavel(elemento);
		driver.findElement(elemento).click();
	}
	
	public void escrever(By elemento, String texto) {
		esperarElementoClicavel(elemento);
		driver.findElement(elemento).sendKeys(texto);
		
	}
	public void escreverNumero(By elemento, int texto ) {
		driver.findElement(elemento).sendKeys(String.valueOf(texto));
		
	}
	public void validarTexto(By elemento, String texto) {
		esperarElementoClicavel(elemento);
		String textoCapturado = driver.findElement(elemento).getText();
		assertEquals(textoCapturado, texto);
	}
	
	public void esperarElementoClicavel(By elemento) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(elemento));
		
	}
	/*public void capturarScrenshot(String historia, String nomeDoArquivo) {
		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(screenshot, new File ("./evidencias/"+historia+"/"+nomeDoArquivo+".png"));
		}catch(IOException e) {
			e.printStackTrace();
		}*/
	}


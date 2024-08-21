package runner;

import org.openqa.selenium.edge.EdgeDriver;

import driver.Drivers;

public class Executa extends Drivers {
	
	public static void iniciarTeste() {
	
	driver = new EdgeDriver();
	driver.get("http://52.2.114.98/");
	driver.manage().window().maximize();
	
	}
	
	public static void finalizarTeste() {
		driver.quit();
	}
}

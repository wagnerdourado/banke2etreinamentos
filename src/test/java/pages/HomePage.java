package pages;
import org.openqa.selenium.By;
import metodos.Metodos;

public class HomePage {
	
	By btnAbrirConta = By.xpath("//button[@class='open-account-button']");
	By dadosPessoais = By.xpath("//h2[text()='Dados Pessoais']");
	By campoCpf = By.xpath("//input[@placeholder='Digite seu CPF']");
	By btnContinuar = By.xpath("//button[text()='Continuar']");
	By msgError = By.xpath("//p[@id='error-message']");
	By btnFecharAbrirCta = By.xpath("//button[@class()='close-cta-button']");
	
		
	Metodos metodo = new Metodos();
	/**
	 * Acessar o menu Dados Pessoais utilizando um CPF válido.
	 * @author WagnerDourado
	 * @param cpf
	 */
	public void acessarAbrirConta(String cpf) {
		metodo.clicar(btnAbrirConta);
		metodo.escrever(campoCpf, cpf);
		metodo.clicar(btnContinuar);
		metodo.esperarElementoClicavel(dadosPessoais);
		metodo.validarTexto(dadosPessoais, "Dados Pessoais");		
		
	}
	/**
	 * Informar a mensagem de Erro que deseja receber. Exemplo:O CPF fornecido já está registrado como cliente.
	 * @author WagnerDourado
	 * @param cpf
	 * @param msgError
	 */
	public void acessarAbrirConta(String cpf, String msgError) {
		metodo.clicar(btnAbrirConta);
		metodo.escrever(campoCpf, cpf);
		metodo.clicar(btnContinuar);
		metodo.esperarElementoClicavel(this.msgError);
		
		if(msgError.equals("Erro na verificação do CPF")) {
			metodo.validarTexto(this.msgError, "Erro na verificação do CPF");
		}else if(msgError.equals("O CPF fornecido não é de um funcionário.")) {
			metodo.validarTexto(this.msgError, "O CPF fornecido não é de um funcionário.");
		}else if(msgError.equals("O CPF fornecido já está registrado como cliente.")) {
			metodo.validarTexto(this.msgError, "O CPF fornecido já está registrado como cliente.");
		}
		
		
	}
	
	public void fecharAbrirConta() {
		metodo.clicar(btnFecharAbrirCta);
	}

}

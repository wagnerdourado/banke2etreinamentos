package pages;

import org.openqa.selenium.By;
import metodos.Metodos;

public class ContaPage {

	// Elementos Dados Pessoais

	By nome = By.xpath("//input[@name='firstName']");
	By sobreNome = By.name("lastName");
	By email = By.name("email");
	By phoneNumber = By.name("phoneNumber");
	By endereco = By.name("address");
	By rg = By.xpath("//input[@placeholder='RG']");
	By cep = By.xpath("//input[@name='cep']");
	By numero = By.name("number");
	By estado = By.name("state");
	By cidade = By.name("city");
	By complemento = By.name("complement");
	By dataNascimento = By.name("dataBirthday");
	By formButton = By.xpath("//button[@class='form-button']");

	// Elementos Dados Proficionais

	By actualGroup = By.name("actualGroup");
	By firstGroup = By.name("firstGroup");
	By job = By.name("job");
	By salario = By.xpath("//input[@placeholder='Salário']");
	By professionalEmail = By.name("professionalEmail");
	By btnEnviar = By.id("btnEnviar");
	By btnVoltar = By.id("btnVoltar");

	// Password
	By password = By.name("password");
	By confirmPassword = By.name("confirmPassword");
	By btnCancelar = By.xpath("//button[text()='Cancelar']");
	By btnCadastrar = By.xpath("//button[text()='Cadastrar']");
	By msgCodigoExpirado = By.xpath("//span[text()='Erro: Código inválido ou expirado.']");
	
	By campoSemPreencher = By.xpath("//input[text()='']");
	String msgErrorCodigo = "Erro: Código inválido ou expirado.";
	

	Metodos metodos = new Metodos();

	public void preencherDadosPessoais(String nome, String sobreNome, String email, String dataNascimento, String rg,
			String phoneNumber, String endereco, String cep, String numero, String complemento, String estado,
			String cidade) {
		metodos.escrever(this.nome, nome);
		metodos.escrever(this.sobreNome, sobreNome);
		metodos.escrever(this.email, email);
		metodos.clicar(this.dataNascimento);
		metodos.escrever(this.dataNascimento, dataNascimento);
		metodos.clicar(this.rg);
		metodos.escrever(this.rg, rg);
		metodos.clicar(this.phoneNumber);
		metodos.escrever(this.phoneNumber, phoneNumber);
		metodos.escrever(this.endereco, endereco);
		metodos.clicar(this.cep);
		metodos.escrever(this.cep, cep);
		metodos.escrever(this.numero, numero);
		metodos.escrever(this.complemento, complemento);
		metodos.escrever(this.estado, estado);
		metodos.escrever(this.cidade, cidade);
		metodos.clicar(this.formButton);
		//metodos.validarTexto(campoSemPreencher, "MicroSoft Seu protocolo é 7049188330");

	}

	public void preencherDadosProfissionais(String actualGroup, String firstGroup, String job, String salario,
			String professionalEmail) {

		metodos.escrever(this.actualGroup, actualGroup);
		metodos.escrever(this.firstGroup, firstGroup);
		metodos.escrever(this.job, job);
		metodos.escrever(this.salario, salario);
		metodos.escrever(this.professionalEmail, professionalEmail);
		metodos.clicar(btnVoltar);

	}

	public void cadastrarSenha(String password, String confirmPassword) {
		metodos.escrever(this.password, password);
		metodos.escrever(this.confirmPassword, confirmPassword);
		metodos.clicar(btnCadastrar);

	}
}

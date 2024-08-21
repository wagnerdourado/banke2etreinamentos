package teste;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import pages.ContaPage;
import pages.HomePage;
import runner.Executa;

public class Teste {

	HomePage home = new HomePage();
	ContaPage conta = new ContaPage();
	
	@BeforeEach
	public void iniciarTeste() {
		Executa.iniciarTeste();
	}

	 @AfterEach
	public void finalizarTeste() {
		Executa.finalizarTeste();
	}

	@Test
	public void abrirContaCpfNaoFuncionario() {
		home.acessarAbrirConta("000.000.000-00", "O CPF fornecido não é de um funcionário.");
		
	}

	@Test
	public void abrirContaCpfBranco() {
		home.acessarAbrirConta("", "Erro na verificação do CPF");

	}

	@Test
	public void abrirContaCpfCadastrado() {
		home.acessarAbrirConta("700.919.919-90", "O CPF fornecido já está registrado como cliente.");
		
	}
	@Test
	public void abrirContaComSucesso() {
		home.acessarAbrirConta("807.486.261-86");
		conta.preencherDadosPessoais("wagner", "Nunes Dourado", "wer@hotmail.com", "26081966", "17125734", "11980786567", "Rua Deilta","15493689", "29", "casa3", "SP", "São Paulo");
		conta.preencherDadosProfissionais("052023", "082023", "QA", "3500", "wag.nunes@e2etreinamentos.com.br");
		//conta.cadastrarSenha("@Wagner1", "@Wagner1");
	}
	@Test
	public void abrirContaNomeEmBranco() {
		home.acessarAbrirConta("807.486.261-86");
		conta.preencherDadosPessoais("", "Nunes Dourado", "wer@hotmail.com", "26081966", "17125734", "11980786567", "Rua Deilta","15493689", "29", "casa3", "SP", "São Paulo");
		
	}
	
	@Test
	public void abrirContaSobreNomeEmBranco() {
		home.acessarAbrirConta("807.486.261-86");
		conta.preencherDadosPessoais("Wagner", "", "wer@hotmail.com", "26081966", "17125734", "11980786567", "Rua Deilta","15493689", "29", "casa3", "SP", "São Paulo");
		
	}

}

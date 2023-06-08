package steps;

import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import metodos.MetodosDeTestes;

public class PrimeiroTeste {

	MetodosDeTestes metodos = new MetodosDeTestes();
By pesquisar = By.xpath("//input[@id='twotabsearchtextbox']");
	
	
	
	
	@Before // ELE E EXECUTADO ANTES DE QUALQUER TESTE
	public void setUp() throws Exception {

		metodos.abrirNavegador("https://www.amazon.com.br/");
	}

	@After // ELE E EXECUTADO APÓS QUALQUER TESTE
	public void tearDown() throws Exception {
		metodos.fecharNavegador();
	}

	@Test

	public void validarTitle() throws IOException {
		metodos.EvidenciarTeste("CT01 - validando titulo");
		metodos.validarTitle("Amazon.com.br | Tudo pra você, de A a Z.");
	}
	
	@Test

	public void buscarProdutos() throws IOException {
		metodos.escrever(pesquisar, "Iphone 13");
		metodos.EvidenciarTeste("CT02 - validandoPesquisar");
	}
		
	}
		



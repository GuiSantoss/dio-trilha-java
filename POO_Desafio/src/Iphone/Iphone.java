package Iphone;

import reprodutor.*;
import navegador.*;
import telefone.*;

public class Iphone {
	public static void main(String[] args) {

		ReprodutorMusical reprodutorMusical = new ReprodutorMusicalImpl();
		AparelhoTelefonico aparelhoTelefonico = new AparelhoTelefonicoImpl();
		NavegadorInternet navegadorInternet = new NavegadorInternetImpl();

		// Testando ReprodutorMusical
		reprodutorMusical.tocar();
		reprodutorMusical.pausar();
		reprodutorMusical.selecionarMusica("Minha Música Favorita");

		// Testando AparelhoTelefonico
		aparelhoTelefonico.ligar("123-456-7890");
		aparelhoTelefonico.atender();
		aparelhoTelefonico.iniciarCorreioVoz();

		// Testando NavegadorInternet
		navegadorInternet.exibirPagina("https://www.example.com");
		navegadorInternet.adicionarNovaAba();
		navegadorInternet.atualizarPagina();
	}
}
package navegador;

public class NavegadorInternetImpl implements NavegadorInternet {

	@Override
	public void exibirPagina(String url) {
		System.out.println("Exibindo a página: " + url);

	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Adicionando nova aba");
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Atualizando pagina");
	}

}

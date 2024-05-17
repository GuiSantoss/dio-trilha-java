package reprodutor;

public class ReprodutorMusicalImpl implements ReprodutorMusical {

	@Override
	public void tocar() {
		System.out.println("Tocando musica");
		
	}

	@Override
	public void pausar() {
		System.out.println("Pausando musica");
		
	}

	@Override
	public void selecionarMusica(String musica) {
		System.out.println("Selecioando musica" + musica);
		
	}
	
}

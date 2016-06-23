package Controle;

public class Start {

	public static void main(String[] args) {
		Morcego m = new Morcego();
		Baleia b = new Baleia();
		Pessoa p = new Pessoa();
		
		Veterinario v = new Veterinario();
		
		v.verificaSaudeMamifero(m);
		//v.desempenhoNaAgua(b);
		//v.madeTamanhoAsa(m);
		
		
		
	}

}

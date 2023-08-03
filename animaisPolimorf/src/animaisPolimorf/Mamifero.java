package animaisPolimorf;

public class Mamifero extends Animal{
	String corPelo;
	
	public Mamifero() {
		
	}
	
	public Mamifero(String nome, int idade, String cor) {
		this.nome = nome;
		this.idade = idade;
		this.corPelo = cor;
	}

	public String getCorPelo() {
		return corPelo;
	}

	public void setCorPelo(String corPelo) {
		this.corPelo = corPelo;
	}
	
	public String toString() {
		return "Animal [nome=" + nome + ", peso=" + peso + ", idade=" + idade + "corPelo=" + corPelo + "]";
	}
	
	void locomover() {
		System.out.println("O Mamifero se Locomoveu.");
	}
	void alimentar() {
		System.out.println("O Mamifero se Alimentou.");
	}
	void emitirSom() {
		System.out.println("O Mamifero emitiu som.");
	}

}

package animaisPolimorf;

public class Aves extends Animal{
	
	String corPena;
	
	public Aves() {
		
	}
	
	public Aves(String nome, int idade, String cor) {
		this.nome = nome;
		this.idade = idade;
		this.corPena = cor;
	}

	public String getCorPena() {
		return corPena;
	}

	public void setCorPena(String corPena) {
		this.corPena = corPena;
	}

	
	public String toString() {
		return "Animal [nome=" + nome + "\n peso=" + peso + "\n idade=" + idade + "\n corPena=" + corPena + "]";
	}
	
	void locomover() {
		System.out.println("A Ave se Locomoveu.");
	}
	void alimentar() {
		System.out.println("A Ave se Alimentou.");
	}
	void emitirSom() {
		System.out.println("A Ave emitiu som.");
	}
	
	void fazerNinho() {
		System.out.println("A Ave fez um ninho em uma arvore.");
	}
}

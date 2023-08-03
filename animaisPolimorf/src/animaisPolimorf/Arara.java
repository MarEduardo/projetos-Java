package animaisPolimorf;

public class Arara extends Aves{
	
	public Arara() {
		
	}
	
	public Arara(String nome, int idade, String corPena) {
		this.corPena = corPena;
		this.nome = nome;
		this.idade = idade;
	}
	
	void voar() {
		System.out.println("A Arara voou no céu.");
	}
	void alimentar() {
		System.out.println("A Arara se alimentou de frutas que encontrou em algumas arvores");
	}
	void cantar() {
		System.out.println("A Arara cantarolou.");
	}

	public String toString() {
		return "Animal [nome=" + nome + "\n peso=" + peso + "\n idade=" + idade + "\n corPena=" + corPena + "]";
	}
	
	

}

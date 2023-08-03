package animaisPolimorf;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

public class Animal {
	String nome;
	double peso;
	int idade;
	
	public Animal() {
		
	}
	
	public Animal(String nome, double peso, int idade) {
		this.nome = nome;
		this.peso = peso;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String toString() {
		return "Animal [nome=" + nome + ", peso=" + peso + ", idade=" + idade + "]";
	}
	void locomover() {
		System.out.println("O Animal se Locomoveu.");
	}
	void alimentar() {
		System.out.println("O Animal se Alimentou.");
	}
	void emitirSom() {
		System.out.println("O Animal emitiu som.");
	}
	
	
	

}

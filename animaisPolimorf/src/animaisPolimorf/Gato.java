package animaisPolimorf;

public class Gato extends Mamifero{
	void brincar() {
		System.out.println("O gato come�ou a brincar.");
	}
	void  lamber() {
		System.out.println("O gato come�ou a se lamber.");
	}
	
	public String toString() {
		return "Animal [nome=" + nome + "\n peso=" + peso + "\n idade=" + idade + "\n corPelo=" + corPelo + "]";
	}
}

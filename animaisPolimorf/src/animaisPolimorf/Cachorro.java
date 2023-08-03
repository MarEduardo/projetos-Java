package animaisPolimorf;

public class Cachorro extends Mamifero{
	void enterrarOsso() {
		System.out.println("O cachorro enterrou seu osso.");
	}
	void abanarRabo() {
		System.out.println("O Cachorro abanou o seu rabo.");
	}
	
	public String toString() {
		return "Animal [nome=" + nome + "\n peso=" + peso + "\n idade=" + idade + "\n corPelo=" + corPelo + "]";
	}

}

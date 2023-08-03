package animaisPolimorf;

public class Principal {

	public static void main(String[] args) {
		
		Gato g1 = new Gato();
		Cachorro c1 = new Cachorro();
		Arara a1 = new Arara();
		
		a1.cantar();
		a1.nome = "loiro";
		a1.idade = 25;
		a1.corPena = "vermelho";
		System.out.println(a1);
		
		g1.brincar();
		g1.nome = "Amstel";
		g1.idade = 3;
		g1.corPelo = "branco";
		System.out.println(g1);
		
		c1.abanarRabo();
		c1.nome = "Arya";
		c1.idade = 6;
		c1.corPelo = "tigrado marrom";
		System.out.println(c1);
		
		

	}

}

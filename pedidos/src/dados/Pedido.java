package dados;
import java.util.ArrayList;
public class Pedido  {
	
	Cliente cli = new Cliente();
	Produtos prod = new Produtos();
	Pedido peDesc = new Pedido();
	String nomeCliente = cli.getNome();
	int numero;
	int chave;
	ArrayList<Pedido>listaDePedidos = new ArrayList<Pedido>();
	String rastreio;
	int prazo;
	double valorTotal;
	double pagto;
	String pagtoForma;
	String pagtoCond;
	String pagtoPrazo = "" + prazo;
	double frete;
	String transport;
	double Desconto = peDesc.getDesconto();
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getChave() {
		return chave;
	}
	public void setChave(int chave) {
		this.chave = chave;
	}
	public ArrayList<Pedido> getListaDePedidos() {
		return listaDePedidos;
	}
	public void setListaDePedidos(ArrayList<Pedido> listaDePedidos) {
		this.listaDePedidos = listaDePedidos;
	}
	public String getRastreio() {
		return rastreio;
	}
	public void setRastreio(String rastreio) {
		this.rastreio = rastreio;
	}
	public int getPrazo() {
		return prazo;
	}
	public void setPrazo(int prazo) {
		this.prazo = prazo;
	}
	public double getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}
	public double getPagto() {
		return pagto;
	}
	public void setPagto(double pagto) {
		this.pagto = pagto;
	}
	public String getPagtoForma() {
		return pagtoForma;
	}
	public void setPagtoForma(String pagtoForma) {
		this.pagtoForma = pagtoForma;
	}
	public String getPagtoCond() {
		return pagtoCond;
	}
	public void setPagtoCond(String pagtoCond) {
		this.pagtoCond = pagtoCond;
	}
	public String getPagtoPrazo() {
		return pagtoPrazo;
	}
	public void setPagtoPrazo(String pagtoPrazo) {
		this.pagtoPrazo = pagtoPrazo;
	}
	public double getFrete() {
		return frete;
	}
	public void setFrete(double frete) {
		this.frete = frete;
	}
	public String getTransport() {
		return transport;
	}
	public void setTransport(String transport) {
		this.transport = transport;
	}
	public double getDesconto() {
		return Desconto;
	}
	public void setDesconto(double desconto) {
		Desconto = desconto;
	}
	@Override
	public String toString() {
		return "Pedido [cli=" + cli + ", prod=" + prod + ", peDesc=" + peDesc + ", nomeCliente=" + nomeCliente
				+ ", numero=" + numero + ", chave=" + chave + ", listaDePedidos=" + listaDePedidos + ", rastreio="
				+ rastreio + ", prazo=" + prazo + ", valorTotal=" + valorTotal + ", pagto=" + pagto + ", pagtoForma="
				+ pagtoForma + ", pagtoCond=" + pagtoCond + ", pagtoPrazo=" + pagtoPrazo + ", frete=" + frete
				+ ", transport=" + transport + ", Desconto=" + Desconto + "]";
	}
	
	/* eu sei, o método toString está totalmente errado, apenas mantive o dessa forma para em breve arrumar tudo direitinho para o funcionamento correto do sistema

Lembrando que a classe pedido foi modelada para ser uma espécie de nota fiscal para o cliente pós compra de um produto de uma loja*/
}

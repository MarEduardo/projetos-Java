package dados;

public class Produtos {
	private int codProduto = 0;
	private String nome = "";
	private String precoCusto = "";
	private String precoVenda = "";
	private int qtdeEstoque = 0;
	private String unidade = "";
	private String estoqueMin = "";
	private String categoria = "";
	private int markUp = 0;
	private boolean ativo = true;
	
	public Produtos() {
		
	}
	public Produtos(int codProduto, String nome, String categoria) {
		this.codProduto = codProduto;
		this.nome = nome;
		this.categoria = categoria;
	}
	public int getCodProduto() {
		return codProduto;
	}
	public void setCodProduto(int codProduto) {
		this.codProduto = codProduto;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getPrecoCusto() {
		return precoCusto;
	}
	public void setPrecoCusto(String precoCusto) {
		this.precoCusto = precoCusto;
	}
	public String getPrecoVenda() {
		return precoVenda;
	}
	public void setPrecoVenda(String precoVenda) {
		this.precoVenda = precoVenda;
	}
	public int getQtdeEstoque() {
		return qtdeEstoque;
	}
	public void setQtdeEstoque(int qtdeEstoque) {
		this.qtdeEstoque = qtdeEstoque;
	}
	public String getUnidade() {
		return unidade;
	}
	public void setUnidade(String unidade) {
		this.unidade = unidade;
	}
	public String getEstoqueMin() {
		return estoqueMin;
	}
	public void setEstoqueMin(String estoqueMin) {
		this.estoqueMin = estoqueMin;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public int getMarkUp() {
		return markUp;
	}
	public void setMarkUp(int markUp) {
		this.markUp = markUp;
	}
	public boolean isAtivo() {
		return ativo;
	}
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	@Override
	public String toString() {
		return "Produtos [codProduto=" + codProduto + ", nome=" + nome + ", precoCusto=" + precoCusto + ", precoVenda="
				+ precoVenda + ", qtdeEstoque=" + qtdeEstoque + ", unidade=" + unidade + ", estoqueMin=" + estoqueMin
				+ ", categoria=" + categoria + ", markUp=" + markUp + ", ativo=" + ativo + "]";
	}
	
	public static void incluirEstoq(int qte) {
		
	}
	
	public static void retirarEstoq(int qte) {
		
	}
	
	public static void calcularNovoPrcVnd() {
		
	}
	
	public static void calcularNovoPrcVnd(double perct) {
		
	}
}

package modelo;

public class Lente extends Produto {
	private String especificacao;
	private float grau;
	private int quantLente;
	Lente[] lentes = new Lente[40];

//Método construtor

	public Lente(String marca, int cod, float preco, float grau, String especif, int qtd) {
		this.marca = marca;
		this.preco = preco;
		this.codigoProd = cod;
		this.grau = grau;
		this.especificacao = especif;
		this.quantLente = qtd;
	}

//toString() para printar para o usuário as informações da lente	

	@Override
	public String toString() {
		return "Lente { Marca: " + marca + ", Preco: " + preco + ", Código do Produto: " + codigoProd + ", Grau: "
				+ grau + ", Especificação: " + especificacao + "}";
	}

//gets e sets

	public String getEspecificacao() {
		return especificacao;
	}

	public void setEspecificacao(String especificacao) {
		this.especificacao = especificacao;
	}

	public float getGrau() {
		return grau;
	}

	public void setGrau(float grau) {
		this.grau = grau;
	}

	public int getQuantLente() {
		return quantLente;
	}

	public void setQuantLente(int quantLente) {
		this.quantLente = quantLente;
	}

}
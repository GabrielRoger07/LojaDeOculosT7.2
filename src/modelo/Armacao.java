package modelo;

public class Armacao extends Produto {

	private String formato;
	private String material;
	private String cor;
	private int quantArmacao;

//Método Construtor

	public Armacao(String marca, int cod, float preco, String form, String material, int qtd) {
		this.marca = marca;
		this.preco = preco;
		this.codigoProd = cod;
		this.formato = form;
		this.material = material;
		this.quantArmacao = qtd;
	}

	public Armacao(String marca, int cod, float preco, String form, String material, String cor, int qtd) {
		this.marca = marca;
		this.preco = preco;
		this.codigoProd = cod;
		this.formato = form;
		this.material = material;
		this.cor = cor;
		this.quantArmacao = qtd;
	}

//toString() para printar para o usuário as informações das armações

	@Override
	public String toString() {
		return "Armação { Marca: " + marca + ", Preço: " + preco + ", Código do produto: " + codigoProd + ", Formato: "
				+ formato + ", Material: " + material + ", Cor: " + cor + ", Quantidade em Estoque: " + quantArmacao
				+ "}";
	}

//gets e sets

	public String getFormato() {
		return formato;
	}

	public void setFormato(String formato) {
		this.formato = formato;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getQuantArmacao() {
		return quantArmacao;
	}

	public void setQuantArmacao(int quantArmacao) {
		this.quantArmacao = quantArmacao;
	}

}

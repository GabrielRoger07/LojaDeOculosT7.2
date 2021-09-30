package modelo;

public class OculosDeSol extends Produto {

	private String formato;
	private String material;
	private String corDaLente;
	private String corDaArmacao;
	private boolean polarizada;
	private int quantOculosSol = 0;
	OculosDeSol[] oculosSol = new OculosDeSol[40];

//Método Construtor

	public OculosDeSol(String marca, int cod, float preco, String form, String material, int qtd) {
		this.marca = marca;
		this.preco = preco;
		this.codigoProd = cod;
		this.formato = form;
		this.material = material;
//		this.corDaLente = corL;
//		this.corDaArmacao = corA;
		this.quantOculosSol = qtd;
	}

	public OculosDeSol(String marca, int cod, float preco, String form, String material, String corA, String corL,
			int qtd) {
		this.marca = marca;
		this.preco = preco;
		this.codigoProd = cod;
		this.formato = form;
		this.material = material;
		this.corDaArmacao = corA;
		this.corDaLente = corL;
		this.quantOculosSol = qtd;
	}

	// toString() para printar para o usuário as informações dos óculos de sol

	@Override
	public String toString() {
		return "Óculos de Sol { Marca: " + marca + ", preco: " + preco + ", codigo do produto: " + codigoProd
				+ ", formato: " + formato + ", material=" + material + ", cor da lente: " + corDaLente
				+ ", cor da armação: " + corDaArmacao + ", lente polarizada: " + polarizada + "}";
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

	public String getCorDaLente() {
		return corDaLente;
	}

	public void setCorDaLente(String corDaLente) {
		this.corDaLente = corDaLente;
	}

	public String getCorDaArmacao() {
		return corDaArmacao;
	}

	public void setCorDaArmacao(String corDaArmacao) {
		this.corDaArmacao = corDaArmacao;
	}

	public boolean getPolarizada() {
		return polarizada;
	}

	public void setPolarizada(boolean polarizada) {
		this.polarizada = polarizada;
	}

	public int getQuantOculosSol() {
		return quantOculosSol;
	}

	public void setQuantOculosSol(int quantOculosSol) {
		this.quantOculosSol = quantOculosSol;
	}

}
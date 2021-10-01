package modelo;

public class Venda {

	private String formaPag;
	private int codVenda;
	private float valorFinal;
	private int qtdVendas;
	Venda[] vendas = new Venda[40];

	// Caso de sobrecarga do método construtor Venda
	public Venda(String form, int cod, float valor) {

		this.formaPag = form;
		this.codVenda = cod;
		this.valorFinal = valor;
	}

//toString() para printar para o usuário as informações da venda

	@Override
	public String toString() {
		return "Venda ---> Forma de Pagamemto: " + formaPag + ", Código da Venda: " + codVenda + "Valor Total: "
				+ valorFinal + "//";
	}

//gets e sets

	public String getFormaPag() {
		return formaPag;
	}

	public void setFormaPag(String formaPag) {
		this.formaPag = formaPag;
	}

	public int getCodVenda() {
		return codVenda;
	}

	public void setCodVenda(int codVenda) {
		this.codVenda = codVenda;
	}

	public float getValorFinal() {
		return valorFinal;
	}

	public void setValorFinal(float valorFinal) {
		this.valorFinal = valorFinal;
	}

	public int getQtdVendas() {
		return qtdVendas;
	}

	public void setQtdVendas(int qtdVendas) {
		this.qtdVendas = qtdVendas;
	}

}

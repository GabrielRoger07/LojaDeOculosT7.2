package modelo;

public class Venda {

	private String formaPag;
	private int codVenda;
	private float  valorFinal;
	Venda[] vendas = new Venda[40];
	

	//Caso de sobrecarga do método construtor Venda
	public Venda(String form, int cod, float valor) {
		
		this.formaPag = null;
		this.codVenda = 0;
		this.valorFinal = 0f;
	}
	
	
//toString() para printar para o usuário as informações da venda
	
	public String toString() {
		return "Venda ---> Forma de Pagamemto: " + formaPag + ", Código da Venda: " + codVenda + "Valor Total: " + valorFinal+"//";
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

}

package modelo;

public class Endereco {

	private int cep;
	private String complemento;

	// Método Construtor
	public Endereco(int c, String comp) {
		this.cep = c;
		this.complemento = comp;
	}

	public int getCep() {
		return cep;
	}

	public void setCep(int cep) {
		this.cep = cep;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

}

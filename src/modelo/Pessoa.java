package modelo;

public abstract class Pessoa {

	protected String residencia;
	protected Telefone numTel;
	protected String nome;
	protected String numID;
	protected String cpf;

//gets e sets
	public String getResidencia() {
		return residencia;
	}

	public void setResidencia(String residencia) {
		this.residencia = residencia;
	}

	public Telefone getNumTel() {
		return numTel;
	}

	public void setNumTel(Telefone numTel) {
		this.numTel = numTel;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNumID() {
		return numID;
	}

	public void setNumID(String numID) {
		this.numID = numID;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

}

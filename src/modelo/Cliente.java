package modelo;

public class Cliente extends Pessoa {

	private String email;
	private String numID;

//Caso de sobrecarga do método construtor Cliente

	public Cliente(String nome, String email, String registro, String id, Telefone tel, Endereco ende) {
		this.nome = nome;
		this.numID = id;
		this.cpf = registro;
		this.numTel = tel;
		this.email = email;
		this.endereco = ende;

	}

	public Cliente(String nome, String registro, Telefone tel, String email, Endereco end) {
		this.nome = nome;
		this.cpf = registro;
		this.numTel = tel;
		this.email = email;
		this.endereco = end;
	}

//toString() para printar para o usuário as informações do cliente

	@Override
	public String toString() {
		return "Dados do Cliente:\nNome: " + nome + "\nCPF: " + cpf + "\n" + numTel;
	}

//gets e sets

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNumID() {
		return numID;
	}

	public void setNumID(String numID) {
		this.numID = numID;
	}

}
package modelo;

public class Cliente extends Pessoa {

	private String email;

//Caso de sobrecarga do método construtor Cliente

	public Cliente(String nome, String end, String registro, String id, Telefone tel) {
		this.nome = nome;
		this.numID = id;
		this.cpf = registro;
		this.numTel = tel;
		this.residencia = end;

	}

	// adddffa//
	public Cliente(String nome, String end, String registro, String id, Telefone tel, Endereco ende) {
		this.nome = nome;
		this.numID = id;
		this.cpf = registro;
		this.numTel = tel;
		this.residencia = end;
		this.endereco = ende;

	}

	public Cliente(String nome, String registro, Telefone tel, String email, String end) {
		this.nome = nome;
		this.cpf = registro;
		this.numTel = tel;
		this.email = email;
		this.residencia = end;
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

}
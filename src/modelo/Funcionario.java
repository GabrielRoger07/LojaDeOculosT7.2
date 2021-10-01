package modelo;

public class Funcionario extends Pessoa {

	private String salario;
	private String cargo;

//Método Construtor 

	public Funcionario(String nome, String salario, String cpf, Telefone tel) {
		this.nome = nome;
		this.salario = salario;
		this.cpf = cpf;
		this.numTel = tel;

	}

	public Funcionario(String nome, String salario, String cpf, Endereco end, Telefone tel) {
		this.nome = nome;
		this.salario = salario;
		this.cpf = cpf;
		this.endereco = end;
		this.numTel = tel;

	}

	public Funcionario(String nome, String salario, String cpf, String cargo, Telefone tel, Endereco end) {
		this.nome = nome;
		this.salario = salario;
		this.cpf = cpf;
		this.cargo = cargo;
		this.numTel = tel;
		this.endereco = end;

	}

//toString() para printar para o usuário as informações do funcionário

	@Override
	public String toString() {
		return "Dados do funcionário:Nome: " + this.nome + ", Cargo: " + cargo + ", Telefone: " + numTel;
	}

//gets e sets

	public String getSalario() {
		return salario;
	}

	public void setSalario(String salario) {
		this.salario = salario;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

}
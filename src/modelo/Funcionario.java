package modelo;

public class Funcionario extends Pessoa {

	private String matricula;
	private String salario;
	private String cargo;

//M�todo Construtor 

	public Funcionario(String nome, String salario, String cpf, String numId, Telefone tel) {
		this.nome = nome;
		this.salario = salario;
		this.cpf = cpf;
		this.numID = numId;
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

//toString() para printar para o usu�rio as informa��es do funcion�rio

	@Override
	public String toString() {
		return "Dados do funcion�rio:Nome: " + this.nome + ", Matr�cula: " + matricula + ", Cargo: " + cargo
				+ ", Telefone: " + numTel;
	}

//gets e sets

//	public Date getDataNasc() {
//		return dataNasc;
//	}
//
//	public void setDataNasc(Date dataNasc) {
//		this.dataNasc = dataNasc;
//	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

//	public Date getDataIngresso() {
//		return dataIngresso;
//	}
//
//	public void setDataIngresso(Date dataIngresso) {
//		this.dataIngresso = dataIngresso;
//	}

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
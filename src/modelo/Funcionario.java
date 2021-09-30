package modelo;

public class Funcionario extends Pessoa {

	// private Date dataNasc;
	private String matricula;
	// private Date dataIngresso;
	private String salario;
	private String cargo;

//Método Construtor 

	public Funcionario(String nome, String salario, String cpf, String numId, Telefone tel) {
		this.nome = nome;
		this.salario = salario;
		this.cpf = cpf;
		this.numID = numId;
		this.numTel = tel;

	}

//toString() para printar para o usuário as informações do funcionário

	@Override
	public String toString() {
		return "Dados do funcionário:Nome: " + this.nome + ", Matrícula: " + matricula + ", Cargo: " + cargo
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
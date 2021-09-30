package controle;

import modelo.Cliente;
import modelo.Telefone;

public class ControleCliente {
	private Cliente[] cli;
	private int qtdClientes;

	public ControleCliente(ControleDados d) {
		cli = d.getClientes();
		qtdClientes = d.getQtdClientes();

	}

	public String[] getNomeCliente() {
		String[] s = new String[qtdClientes];
		for (int i = 0; i < qtdClientes; i++) {
			s[i] = cli[i].getNome();
		}

		return s;
	}

	public int getQtd() {
		return qtdClientes;
	}

	public void setQtd(int qtd) {
		this.qtdClientes = qtd;
	}

	public String getNome(int i) {
		return cli[i].getNome();
	}

	public String getCpf(int i) {
		String numCpf = String.valueOf(cli[i].getCpf());
		return numCpf;
	}

	public String getID(int i) {
		String numID = String.valueOf(cli[i].getNumID());
		return numID;
	}

	public Telefone getTelefone(int i) {
		return cli[i].getNumTel();
	}

	public void setQtdClientes(int qtdClientes) {
		this.qtdClientes = qtdClientes;
	}

	public String getEmail(int i) {
		return cli[i].getEmail();
	}

}

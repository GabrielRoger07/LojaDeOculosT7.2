package controle;

import modelo.*;

public class ControleDados {
	private Dados d = new Dados();

	public ControleDados() {
		d.preCadastro();
	}

	public Dados getDados() {
		return d;
	}

	public void setDados(Dados d) {
		this.d = d;
	}

	public Cliente[] getClientes() {
		return this.d.getClientes();
	}

	public int getQtdClientes() {
		return this.d.getQtdClientes();
	}

	public int getQtdFuncs() {
		return this.d.getQtdFuncs();
	}

	public Funcionario[] getFuncionarios() {
		return this.d.getFuncs();
	}

	public OculosDeSol[] getOculosSol() {
		return this.d.getOculos();
	}

	public int getQtdOculosSol() {
		return this.d.getQtdOculos();
	}

	public Lente[] getLentes() {
		return this.d.getLentes();
	}

	public int getQtdLentes() {
		return this.d.getQtdLentes();
	}

	public Armacao[] getArmacoes() {
		return this.d.getArmacoes();
	}

	public int getQtdArmacoes() {
		return this.d.getQtdArmacoes();
	}

	// a posicao 0 do vetor dadosFuncs indica aonde os dados devem ser inseridos
	public boolean inserirEditarFuncs(String[] dadosFuncs) {

//		if (!dadosFuncs[3].matches("[0-9]+") || !dadosFuncs[4].matches("[0-9]+") || !dadosFuncs[5].matches("[0-9]+")
//				|| !dadosFuncs[6].matches("[0-9]+")) {
//			return false;
//		} else {
		Funcionario func = new Funcionario(dadosFuncs[1], dadosFuncs[2], dadosFuncs[3], dadosFuncs[4],
				new Telefone(Integer.parseInt(dadosFuncs[5]), Integer.parseInt(dadosFuncs[6])),
				new Endereco(Integer.parseInt(dadosFuncs[7]), dadosFuncs[8]));
		d.inserirEditarFuncs(func, Integer.parseInt(dadosFuncs[0]));
		return true;
	}
	// }

	// a posicao 0 do vetor dadosClientes indica aonde os dados devem ser inseridos
	public boolean inserirEditarClientes(String[] dadosClientes) {
//		if (!dadosClientes[3].matches("[0-9]+") || !dadosClientes[4].matches("[0-9]+")
//				|| !dadosClientes[5].matches("[0-9]+") || !dadosClientes[6].matches("[0-9]+")) {
//			return false;
//		} else {
		Cliente cli = new Cliente(dadosClientes[1], dadosClientes[2], dadosClientes[3], dadosClientes[4],
				new Telefone(Integer.parseInt(dadosClientes[5]), Integer.parseInt(dadosClientes[6])),
				new Endereco(Integer.parseInt(dadosClientes[7]), dadosClientes[8]));
		d.inserirEditarClientes(cli, Integer.parseInt(dadosClientes[0]));
		return true;
		// }
	}

	// a posicao 0 do vetor dadosOculos indica aonde os dados devem ser inseridos
	public boolean inserirEditarOculosSol(String[] dadosOculos) {

//		if (!dadosOculos[3].matches("[0-9]+") || !dadosOculos[4].matches("[0-9]+")
//				|| !dadosOculos[6].matches("[0-9]+")) {
//			return false;
//		} else {
		OculosDeSol oc = new OculosDeSol(dadosOculos[1], Integer.parseInt(dadosOculos[3]),
				Float.parseFloat(dadosOculos[4]), dadosOculos[2], dadosOculos[5], dadosOculos[7], dadosOculos[8],
				Integer.parseInt(dadosOculos[6]));
		d.inserirEditarOculosSol(oc, Integer.parseInt(dadosOculos[0]));
		return true;

	}

	// a posicao 0 do vetor dadosLentes indica aonde os dados devem ser inseridos
	public boolean inserirEditarLentes(String[] dadosLentes) {

//		if (!dadosOculos[2].matches("[0-9]+") || !dadosOculos[3].matches("[0-9]+")
//				|| !dadosOculos[4].matches("[0-9]+")) {
//			return false;
//		} else {
		Lente len = new Lente(dadosLentes[1], Integer.parseInt(dadosLentes[3]), Float.parseFloat(dadosLentes[4]),
				Integer.parseInt(dadosLentes[2]), dadosLentes[5], Integer.parseInt(dadosLentes[6]));
		d.inserirEditarLentes(len, Integer.parseInt(dadosLentes[0]));
		return true;

	}

	// a posicao 0 do vetor dadosArmacoes indica aonde os dados devem ser inseridos
	public boolean inserirEditarArmacoes(String[] dadosArmacoes) {

//		if (!dadosOculos[3].matches("[0-9]+") || !dadosOculos[4].matches("[0-9]+")
//				|| !dadosOculos[6].matches("[0-9]+")) {
//			return false;
//			} else {
		Armacao arm = new Armacao(dadosArmacoes[1], Integer.parseInt(dadosArmacoes[3]),
				Float.parseFloat(dadosArmacoes[4]), dadosArmacoes[2], dadosArmacoes[5], dadosArmacoes[7],
				Integer.parseInt(dadosArmacoes[6]));
		d.inserirEditarArmacoes(arm, Integer.parseInt(dadosArmacoes[0]));
		return true;

	}

	public boolean removerCliente(int i) {
//		int qtdMat = d.getQtdMatriculados();
		String clienteRemovido = d.getClientes()[i].getNome();
//		String aux;
//		for (int j = 0; j < qtdMat; j++) {
//			aux = d.getMatr()[j].getAluno().getNome();
//			if (alunoRemovido.compareTo(aux) == 0)
//				return false; // não é possível remover aluno pois ele está matriculado em um curso
//		}

		if (i == (d.getQtdClientes() - 1)) { // O cliente a ser removido está no final do array
			d.setQtdClientes(d.getQtdClientes() - 1);
			d.getClientes()[d.getQtdClientes()] = null;
			return true;
		} else { // O cliente a ser removido está no meio do array
			int cont = 0;
			while (d.getClientes()[cont].getNome().compareTo(clienteRemovido) != 0) {
				cont++;
			}
			// Rotina swap
			for (int j = cont; j < d.getQtdClientes() - 1; j++) {
				d.getClientes()[j] = null;
				d.getClientes()[j] = d.getClientes()[j + 1];
			}
			d.getClientes()[d.getQtdClientes()] = null;
			d.setQtdClientes(d.getQtdClientes() - 1);
			return true;
		}
	}

	public boolean removerFunc(int i) {
//		int qtdCursos = d.getQtdCursos();
		String funcRemovido = d.getFuncs()[i].getNome();
//		String aux;
//		for (int j = 0; j < qtdCursos; j++) {
//			aux = d.getCursos()[j].getProf().getNome();
//			if (profRemovido.compareTo(aux) == 0)
//				return false;
//			// não é possível remover professor pois ele é responsável por um curso
//		}
		if (i == (d.getQtdFuncs() - 1)) { // O funcionário a ser removido está no final do array
			d.setQtdFuncs(d.getQtdFuncs() - 1);
			d.getFuncs()[d.getQtdFuncs()] = null;
			return true;
		} else { // O funcionário a ser removido está no meio do array
			int cont = 0;
			while (d.getFuncs()[cont].getNome().compareTo(funcRemovido) != 0)
				cont++;
			// Rotina swap
			for (int j = cont; j < d.getQtdFuncs() - 1; j++) {
				d.getFuncs()[j] = null;
				d.getFuncs()[j] = d.getFuncs()[j + 1];
			}
			d.getFuncs()[d.getQtdFuncs()] = null;
			d.setQtdFuncs(d.getQtdFuncs() - 1);
			return true;
		}
	}

	public boolean removerOculosSol(int i) {
//		int qtdCursos = d.getQtdCursos();

		String convertido = "" + d.getOculos()[i].getCodigoProd();
//		String oculosSolRemovido = "" + d.getOculos()[i].getCodigoProd();
//		String aux;
//		for (int j = 0; j < qtdCursos; j++) {
//			aux = d.getCursos()[j].getProf().getNome();
//			if (profRemovido.compareTo(aux) == 0)
//				return false;
//			// não é possível remover professor pois ele é responsável por um curso
//		}
		if (i == (d.getQtdOculos() - 1)) { // O óculos de sol a ser removido está no final do array
			d.setQtdOculos(d.getQtdOculos() - 1);
			d.getOculos()[d.getQtdOculos()] = null;
			return true;
		} else { // O óculos de sol a ser removido está no meio do array
			int cont = 0;
			String c = "" + d.getOculos()[cont].getCodigoProd();
			while (c.compareTo(convertido) != 0)
				cont++;
			// Rotina swap
			for (int j = cont; j < d.getQtdOculos() - 1; j++) {
				d.getOculos()[j] = null;
				d.getOculos()[j] = d.getOculos()[j + 1];
			}
			d.getOculos()[d.getQtdOculos()] = null;
			d.setQtdOculos(d.getQtdOculos() - 1);
			return true;
		}
	}

	public boolean removerArmacao(int i) {
//		int qtdCursos = d.getQtdCursos();

		String convertido = "" + d.getArmacoes()[i].getCodigoProd();
//		String oculosSolRemovido = "" + d.getOculos()[i].getCodigoProd();
//		String aux;
//		for (int j = 0; j < qtdCursos; j++) {
//			aux = d.getCursos()[j].getProf().getNome();
//			if (profRemovido.compareTo(aux) == 0)
//				return false;
//			// não é possível remover professor pois ele é responsável por um curso
//		}
		if (i == (d.getQtdArmacoes() - 1)) { // A armação a ser removida está no final do array
			d.setQtdArmacoes(d.getQtdArmacoes() - 1);
			d.getArmacoes()[d.getQtdArmacoes()] = null;
			return true;
		} else { // A armação a ser removida está no meio do array
			int cont = 0;
			String c = "" + d.getArmacoes()[cont].getCodigoProd();
			while (c.compareTo(convertido) != 0)
				cont++;
			// Rotina swap
			for (int j = cont; j < d.getQtdArmacoes() - 1; j++) {
				d.getArmacoes()[j] = null;
				d.getArmacoes()[j] = d.getArmacoes()[j + 1];
			}
			d.getArmacoes()[d.getQtdArmacoes()] = null;
			d.setQtdArmacoes(d.getQtdArmacoes() - 1);
			return true;
		}
	}

	public boolean removerLente(int i) {

		String convertido = "" + d.getLentes()[i].getCodigoProd();

		if (i == (d.getQtdLentes() - 1)) { // A lente a ser removida está no final do array
			d.setQtdLentes(d.getQtdLentes() - 1);
			d.getLentes()[d.getQtdLentes()] = null;
			return true;
		} else { // A lente a ser removida está no meio do array
			int cont = 0;
			String c = "" + d.getLentes()[cont].getCodigoProd();
			while (c.compareTo(convertido) != 0)
				cont++;
			// Rotina swap
			for (int j = cont; j < d.getQtdLentes() - 1; j++) {
				d.getLentes()[j] = null;
				d.getLentes()[j] = d.getLentes()[j + 1];
			}
			d.getLentes()[d.getQtdLentes()] = null;
			d.setQtdLentes(d.getQtdLentes() - 1);
			return true;
		}
	}

}
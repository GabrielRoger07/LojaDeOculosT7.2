package controle;

import modelo.*;

public class ControleArmacao {
	private Armacao[] arm;
	private int qtdArmacoes;

	public ControleArmacao(ControleDados d) {
		arm = d.getArmacoes();
		qtdArmacoes = d.getQtdArmacoes();
	}

	public String[] getCodArmacao() {
		String[] s = new String[qtdArmacoes];
		for (int i = 0; i < qtdArmacoes; i++) {

			s[i] = "" + arm[i].getCodigoProd();
		}

		return s;
	}

	public int getQtd() {
		return qtdArmacoes;
	}

	public void setQtd(int qtd) {
		this.qtdArmacoes = qtd;
	}

	public int getCodigoProd(int i) {
		return arm[i].getCodigoProd();
	}

	public String getMarca(int i) {
		return arm[i].getMarca();
	}

	public String getFormato(int i) {
		return arm[i].getFormato();
	}

	public float getPreco(int i) {
		return arm[i].getPreco();
	}

	public String getCor(int i) {
		return arm[i].getCor();
	}

	public void setQtdArmacoes(int qtdArmacoes) {
		this.qtdArmacoes = qtdArmacoes;
	}

	public String getMaterial(int i) {
		return arm[i].getMaterial();
	}

	public int getQuantArmacoes(int i) {
		return arm[i].getQuantArmacao();
	}
}

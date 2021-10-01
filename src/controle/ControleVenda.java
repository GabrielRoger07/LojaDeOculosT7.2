package controle;

import modelo.*;

public class ControleVenda {
	private Venda[] venda;
	private int qtdVendas;

	public ControleVenda(ControleDados d) {
		venda = d.getVendas();
		qtdVendas = d.getQtdVendas();
	}

	public String[] getCodVenda() {
		String[] s = new String[qtdVendas];
		for (int i = 0; i < qtdVendas; i++) {

			s[i] = "" + venda[i].getCodVenda();
		}

		return s;
	}

	public int getQtd() {
		return qtdVendas;
	}

	public void setQtd(int qtd) {
		this.qtdVendas = qtd;
	}

	public String getFormaPag(int i) {
		return venda[i].getFormaPag();
	}

	public int getCodVenda(int i) {
		return venda[i].getCodVenda();
	}

	public float getValorFinal(int i) {
		return venda[i].getValorFinal();
	}

	public float getQtdVendas(int i) {
		return venda[i].getQtdVendas();
	}

	public void setQtdVendas(int qtdVendas) {
		this.qtdVendas = qtdVendas;
	}
}

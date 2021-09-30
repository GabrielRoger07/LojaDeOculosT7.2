package controle;

import modelo.OculosDeSol;

public class ControleOculosSol {
	private OculosDeSol[] oc;
	private int qtdOculosSol;

	public ControleOculosSol(ControleDados d) {
		oc = d.getOculosSol();
		qtdOculosSol = d.getQtdOculosSol();
	}

	public String[] getCodOculosSol() {
		String[] s = new String[qtdOculosSol];
		for (int i = 0; i < qtdOculosSol; i++) {

			s[i] = "" + oc[i].getCodigoProd();
		}

		return s;
	}

	public int getQtd() {
		return qtdOculosSol;
	}

	public void setQtd(int qtd) {
		this.qtdOculosSol = qtd;
	}

	public int getCodigoProd(int i) {
		return oc[i].getCodigoProd();
	}

	public String getMarca(int i) {
		return oc[i].getMarca();
	}

	public String getFormato(int i) {
		return oc[i].getFormato();
	}

	public float getPreco(int i) {
		return oc[i].getPreco();
	}

	public void setQtdOculosSol(int qtdOculosSol) {
		this.qtdOculosSol = qtdOculosSol;
	}

	public String getMaterial(int i) {
		return oc[i].getMaterial();
	}

	public int getQuantOculosSol(int i) {
		return oc[i].getQuantOculosSol();
	}
}

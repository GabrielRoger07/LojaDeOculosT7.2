package modelo;

public abstract class Produto {
	
	protected String marca;
	protected float preco;
	protected int codigoProd;
	
//gets e sets
	
	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public float getPreco() {
		return preco;
	}
	
	public void setPreco(float preco) {
		this.preco = preco;
	}
	
	public int getCodigoProd() {
		return codigoProd;
	}
	
	public void setCodigoProd(int codigoProd) {
		this.codigoProd = codigoProd;
	}
	
}
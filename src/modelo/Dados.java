package modelo;

public class Dados {

	private Cliente[] clientes = new Cliente[40];
	private int qtdClientes = 0;
	private Funcionario[] funcs = new Funcionario[40];
	private int qtdFuncs = 0;
	private Armacao[] armacoes = new Armacao[40];
	private int qtdArmacoes = 0;
	private Telefone[] tels = new Telefone[40];
	private int qtdTels = 0;
//	private Endereco[] enderecos = new Endereco[40];
//	private int qtdEnderecos = 0;
	private Lente[] lentes = new Lente[40];
	private int qtdLentes = 0;
	private OculosDeSol[] oculos = new OculosDeSol[40];
	private int qtdOculos = 0;
	private Estoque[] estoques = new Estoque[40];
	private int qtdEstoques = 0;
	private Venda[] vendas = new Venda[40];
	private int qtdVendas = 0;

//	public void preCadastro() {
//
//		for (int i = 0; i < 5; i++) {
//
//			armacoes[i] = new Armacao("Marca" + i, (i / 2) * 200, (i + 3) + 120, "Formato" + i, "Material" + i,
//					"Cor" + i, i);
//			tels[i] = new Telefone((i + 1) * 100, (i + 1) * 1000000);
//			funcs[i] = new Funcionario("Funcionario" + i, "" + (i + 2) * 12345, "cpf" + (i + 2) * 12647,
//					"numid" + (i + 2) * 12567, tels[i]);
//			clientes[i] = new Cliente("Cliente" + i, "end" + i, "cpf" + i * (111111111), "numid" + i, tels[i]);
//			lentes[i] = new Lente("Marca" + i, i, (i / 2) * 50f, (i / 5), "Especificação" + i, i);
//			oculos[i] = new OculosDeSol("Marca" + i, (i / 4) * 400, i * 45f, "Formato" + i, "Material" + i, i);
//			vendas[i] = new Venda("Forma de pagamento" + i, (i + 4) * 785, i * 150f);
//		}
//
//		qtdClientes = 5;
//		qtdFuncs = 5;
//		qtdArmacoes = 5;
//		qtdTels = 5;
//		qtdLentes = 5;
//		qtdOculos = 5;
//		qtdEstoques = 5;
//		qtdVendas = 5;
//	}
	public void preCadastro() {

		tels[0] = new Telefone(61, 85473652);
		tels[1] = new Telefone(62, 96587412);
		tels[2] = new Telefone(61, 83521478);
		tels[3] = new Telefone(11, 87894519);
		tels[4] = new Telefone(14, 90817423);
		clientes[0] = new Cliente("Gabriel", "Vicente Pires", "05214536985", "3147395", tels[0]);
		clientes[1] = new Cliente("João", "Águas Claras", "03475695123", "2985743", tels[1]);
		clientes[2] = new Cliente("Henrique", "Gama", "04685020071", "2589674", tels[2]);
		clientes[3] = new Cliente("Juliana", "Asa Sul", "06845062510", "3745896", tels[3]);
		clientes[4] = new Cliente("Maria", "Ceilândia", "02854637125", "3257842", tels[4]);
		funcs[0] = new Funcionario("Sandra", "1050.00", "07842695812", "2985713", tels[0]);
		funcs[1] = new Funcionario("Genildo", "1500.00", "05628914560", "3946657", tels[1]);
		funcs[2] = new Funcionario("Cadu", "1250.00", "05792486854", "3610610", tels[2]);
		funcs[3] = new Funcionario("Fernanda", "1300.00", "06546844132", "2613489", tels[3]);
		funcs[4] = new Funcionario("Edna", "1450.00", "07649080498", "2968108", tels[4]);
		armacoes[0] = new Armacao("Chilli Beans", 10001, 53.99f, "Quadrado", "Madeira", "Marrom", 2);
		armacoes[1] = new Armacao("Mormaii", 10002, 59.99f, "Retangular", "Plástico", "Pastel", 4);
		armacoes[2] = new Armacao("Chilli Beans", 10003, 64.99f, "Redondo", "Alumínio", "Vinho", 3);
		armacoes[3] = new Armacao("Ray-Ban", 10004, 69.99f, "Oval", "Ultem", "Dourado", 7);
		armacoes[4] = new Armacao("Ray-Ban", 10005, 79.99f, "Aviador", "Metal", "Preto", 5);
		lentes[0] = new Lente("Hoya", 20001, 49.99f, 0.8f, "Miopia", 5);
		lentes[1] = new Lente("Carl Zeiss", 20002, 54.99f, 1.5f, "Astigmatismo", 6);
		lentes[2] = new Lente("Essilor", 20003, 61.99f, 1.8f, "Miopia", 1);
		lentes[3] = new Lente("Kodak Lenses", 20004, 44.99f, 2.0f, "Hipermetropia", 4);
		lentes[4] = new Lente("Lenscope", 20005, 59.99f, 2.2f, "Miopia", 3);
		oculos[0] = new OculosDeSol("Ray-Ban", 30001, 499.99f, "Quadrado", "Metal", 10);
		oculos[1] = new OculosDeSol("Chilli Beans", 30002, 259.99f, "Aviador", "Metal", 11);
		oculos[2] = new OculosDeSol("Ray-Ban", 30003, 499.99f, "Quadrado", "Metal", 15);
		oculos[3] = new OculosDeSol("Ray-Ban", 30004, 499.99f, "Quadrado", "Metal", 8);
		oculos[4] = new OculosDeSol("Chilli Beans", 30005, 179.99f, "Quadrado", "Plástico", 18);

		qtdClientes = 5;
		qtdFuncs = 5;
		qtdTels = 5;
		qtdArmacoes = 5;
		qtdLentes = 5;
		qtdOculos = 5;
		qtdVendas = 5;
	}

	public Cliente[] getClientes() {
		return clientes;
	}

	public void setClientes(Cliente[] clientes) {
		this.clientes = clientes;
	}

	public int getQtdClientes() {
		return qtdClientes;
	}

	public void setQtdClientes(int qtdClientes) {
		this.qtdClientes = qtdClientes;
	}

	public Funcionario[] getFuncs() {
		return funcs;
	}

	public void setFuncs(Funcionario[] funcs) {
		this.funcs = funcs;
	}

	public int getQtdFuncs() {
		return qtdFuncs;
	}

	public void setQtdFuncs(int qtdFuncs) {
		this.qtdFuncs = qtdFuncs;
	}

	public Armacao[] getArmacoes() {
		return armacoes;
	}

	public void setArmacoes(Armacao[] armacoes) {
		this.armacoes = armacoes;
	}

	public int getQtdArmacoes() {
		return qtdArmacoes;
	}

	public void setQtdArmacoes(int qtdArmacoes) {
		this.qtdArmacoes = qtdArmacoes;
	}

	public Telefone[] getTels() {
		return tels;
	}

	public void setTels(Telefone[] tels) {
		this.tels = tels;
	}

	public int getQtdTels() {
		return qtdTels;
	}

	public void setQtdTels(int qtdTels) {
		this.qtdTels = qtdTels;
	}

	public void inserirEditarFuncs(Funcionario func, int pos) {
		this.funcs[pos] = func;
		if (pos == qtdFuncs)
			qtdFuncs++;
	}

	public void inserirEditarClientes(Cliente cli, int pos) {
		this.clientes[pos] = cli;
		if (pos == qtdClientes)
			qtdClientes++;
	}

	public void inserirEditarOculosSol(OculosDeSol oc, int pos) {
		this.oculos[pos] = oc;
		if (pos == qtdOculos)
			qtdOculos++;
	}

	public void inserirEditarLentes(Lente len, int pos) {
		this.lentes[pos] = len;
		if (pos == qtdLentes)
			qtdLentes++;
	}

	public void inserirEditarArmacoes(Armacao arm, int pos) {
		this.armacoes[pos] = arm;
		if (pos == qtdArmacoes)
			qtdArmacoes++;
	}

//	public Endereco[] getEnderecos() {
//		return enderecos;
//	}
//
//	public void setEnderecos(Endereco[] enderecos) {
//		this.enderecos = enderecos;
//	}
//
//	public int getQtdEnderecos() {
//		return qtdEnderecos;
//	}
//
//	public void setQtdEnderecos(int qtdEnderecos) {
//		this.qtdEnderecos = qtdEnderecos;
//	}

	public Lente[] getLentes() {
		return lentes;
	}

	public void setLentes(Lente[] lentes) {
		this.lentes = lentes;
	}

	public int getQtdLentes() {
		return qtdLentes;
	}

	public void setQtdLentes(int qtdLentes) {
		this.qtdLentes = qtdLentes;
	}

	public OculosDeSol[] getOculos() {
		return oculos;
	}

	public void setOculos(OculosDeSol[] oculos) {
		this.oculos = oculos;
	}

	public int getQtdOculos() {
		return qtdOculos;
	}

	public void setQtdOculos(int qtdOculos) {
		this.qtdOculos = qtdOculos;
	}

	public Estoque[] getEstoques() {
		return estoques;
	}

	public void setEstoques(Estoque[] estoques) {
		this.estoques = estoques;
	}

	public int getQtdEstoques() {
		return qtdEstoques;
	}

	public void setQtdEstoques(int qtdEstoques) {
		this.qtdEstoques = qtdEstoques;
	}

	public Venda[] getVendas() {
		return vendas;
	}

	public void setVendas(Venda[] vendas) {
		this.vendas = vendas;
	}

	public int getQtdVendas() {
		return qtdVendas;
	}

	public void setQtdVendas(int qtdVendas) {
		this.qtdVendas = qtdVendas;
	}

}

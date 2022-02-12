package GenSnackBar;

public class Pedidos implements Produtos{
	
	private int id;
	private String nome;
	private double preco;
	
	public Pedidos(int i, String n, double p) {
		this.id=i;
		this.nome=n;
		this.preco=p;
	}
	
	@Override
	public void selecionar() {

	}
	@Override
	public void receberPedido() {
	}
	
	//public void add(Lanches l1) {
	//}
	public void setNome(String nome) {
		this.nome=nome;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id =id;
	}
	public double getPreco() {
		return preco;
	}
	public void preco(double preco) {
		this.preco =preco;
	}
	
	@Override 
	public String toString(){ return "ID: "+ this.id + " | Item: " + this.nome + " | Preço: R$" + this.preco + "\n";}
	
	@Override
	public void linhaDetalhe() {
		System.out.println("═══════════════════════════════════════════════════════");
	}
	
}

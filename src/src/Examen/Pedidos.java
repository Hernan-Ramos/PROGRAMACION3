package Examen;

public class Pedidos {
	public int nroMesa;
	public Cliente cli;
	public pilaPlato pp;
	public Pedidos(int nroMesa, Cliente cli, pilaPlato pp) {
		
		this.nroMesa = nroMesa;
		this.cli = cli;
		this.pp = pp;
	}
	public Pedidos() {
		
	}
	public void mostrarPedidos() {
		System.out.println(" nro de mesa : " + this.nroMesa + " cliente" + this.cli + " ");
		pp.mostrarPila();
	}
	public int getNroMesa() {
		return nroMesa;
	}
	public void setNroMesa(int nroMesa) {
		this.nroMesa = nroMesa;
	}
	public Cliente getCli() {
		return cli;
	}
	public void setCli(Cliente cli) {
		this.cli = cli;
	}
	public pilaPlato getPp() {
		return pp;
	}
	public void setPp(pilaPlato pp) {
		this.pp = pp;
	}
	
	
	

}

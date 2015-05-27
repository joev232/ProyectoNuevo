package com.ejemplo.threads;

public class Taquilla {
	
	//limitando numero de objetos de una clase
	private static final int AFORO = 10;
	private int nentradas;
	private static Taquilla taquilla = new Taquilla (AFORO);
	//patron singleton es siempre privado 
	private Taquilla (int n)
	{
		this.nentradas = n;
	}

	public static Taquilla getTaquilla ()
	{
		return taquilla;
	}
	public int getNentradas() {
		return nentradas;
	}

	public void setNentradas(int nentradas) {
		this.nentradas = nentradas;
	}

	public boolean quedanEntradas ()
	{
		return (nentradas > 0);
	}
	
	public void comprarEntrada (Cliente c)
	{
		nentradas--;
		System.out.println("("+nentradas+")"+c.getNombre()+" ha comprado una entrada.");
		if (nentradas < 0)
			System.out.println("Taquillero, la has cagado: has vendido entradas que no tenías!!!");
	}
}

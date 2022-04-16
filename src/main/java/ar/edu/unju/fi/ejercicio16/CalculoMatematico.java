package ar.edu.unju.fi.ejercicio16;

public class CalculoMatematico {
	//atributos
	private int n;
	
	// setters y getters
	
	public void setN(int n) {
		this.n = n;
	}

	public int getN() {
		return n;
	}
	
	// metodo
	// constructor parametrizado
	
	public CalculoMatematico(int n) {
		this.n=n;
	}
	
	// funciones 

	public int calcularSumatoria() {
		int k;
		int q;
		int rta;
		rta=0;
		k=1;
		for(k=1;k<=n;k++)
		{
			q=(k*(k+1)/2);
			q=q*q;
			rta=rta+q;
		}
		return rta;
	}
	public int calcularProductoria() {
		int k;
		int q;
		int rta;
		rta=1;
		k=1;
		for(k=1;k<=n;k++)
		{
			q=(k*(k+4));
			rta=rta*q;
		}
		return rta;
	}
		
}

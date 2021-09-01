package br.com.introducao.metodos;

public class Calculadora {
	public void imprimirDoisNumerosDivididos(double numero1, double numero2) {
		if(numero2 != 0 ) {
			System.out.println(numero1 / numero2);
			return; // funciona como break
		}
			System.out.println("Não e possivel dividir por = 0");
		
		
	}
}

package br.com.intruducao.metodos.teste;

import br.com.introducao.metodos.Calculadora;

public class CalculadoraTeste {

	public static void main(String[] args) {
		Calculadora calculadora = new Calculadora();
		calculadora.imprimirDoisNumerosDivididos(4, 0);
		
		int numero1 = 5;
		int numero2 = 10;
		calculadora.alteraDoiNumertos(numero1, numero2 );
		System.out.println("----------------------------");
		System.out.println("Dentro do teste");
		System.out.println("Numero1: " + numero1);
		System.out.println("Numero2: " + numero2);

	}

}

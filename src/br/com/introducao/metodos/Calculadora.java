package br.com.introducao.metodos;

public class Calculadora {
	public void imprimirDoisNumerosDivididos(double numero1, double numero2) {
		if(numero2 != 0 ) {
			System.out.println(numero1 / numero2);
			return; // funciona como break
		}
			System.out.println("Não e possivel dividir por = 0");
		
		
	}
	
	
	public void alteraDoiNumertos(int numero1, int numero2) {
		numero1 = 30;
		numero2 = 40;
		
		System.out.println("Dentro do altera dois numeros ");
		System.out.println("Numero: " + numero1);
		System.out.println("Numero: " + numero2);
	}
	
	public void somarArray(int[]  numeros) {
		int soma = 0;
		for (int i : numeros) {
			soma = soma + i;
		}
		System.out.println("A soma e:" + soma);
	}
	
	public void somaVarArgs(int...  numeros) {
		int soma = 0;
		for (int i : numeros) {
			soma = soma + i;
		}
		System.out.println("A soma e:" + soma);
	}
}

package br.com.intruducao.metodos.teste;

import br.com.introducao.metodos.Professor;

public class ProfessorTeste {
	public static void main(String[] args) {
		Professor professor = new Professor();
		professor.nome = "Lucas";
		professor.matricula = "222222222";
		professor.rg = "555555";
		professor.cpf = "111.111.111-88";
		
		Professor professor1 = new Professor();
		professor1.nome = "Pedro";
		professor1.matricula = "333333333";
		professor1.rg = "666666";
		professor1.cpf = "222.222.222-99";
		
		
		System.out.println("Dentro do metodo teste");
		System.out.println(professor.nome);
		
		System.out.println("-----------------");
		
		professor.imprimirProfesso();
		System.out.println(professor.nome);
		
		System.out.println("-----------------");
		professor1.imprimirProfesso();
		System.out.println(professor.nome);
		
		
	}
}

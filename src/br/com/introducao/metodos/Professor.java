package br.com.introducao.metodos;

public class Professor {
	public String nome;
	public String matricula;
	public String rg;
	public String cpf;
	
	
	public void imprimirProfesso(Professor prof) {
		System.out.println("Nome: " + prof.nome);
		System.out.println("Matricula: " + prof.matricula);
		System.out.println("RG: " + prof.rg);
		System.out.println("CPF: " + prof.cpf);
	}
}

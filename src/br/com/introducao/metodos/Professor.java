package br.com.introducao.metodos;

public class Professor {
	public String nome;
	public String matricula;
	public String rg;
	public String cpf;
	
	
	public void imprimirProfesso() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Matricula: " + this.matricula);
		System.out.println("RG:" + this.rg);
		System.out.println("CPF: " + this.cpf);
		
		this.nome = "Nome alterado dentro do imprimi";
		System.out.println(this.nome);
	}
}

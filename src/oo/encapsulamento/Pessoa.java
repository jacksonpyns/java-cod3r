package oo.encapsulamento;

public class Pessoa {

	private String sobrenome;
	private String nome;
	private int idade;
	
	public Pessoa(String nome, String sobrenome, int idade) {
		setNome(nome);
		setSobrenome(sobrenome);
		//this.idade = idade;
		setIdade(idade); // Para puxar no "alterarIdade"
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getNomeCompleto() {
		return getNome() + " " + getSobrenome();
	}
	
	// Getter
	public int getIdade() { // O método que usa-se para ler (lerIdade) chama-se get (getIdade)
		return idade;
	}
	
	// Setter
	// O método que usa-se para alterar (alterarIdade) chama-se set (setIdade)
	public void setIdade(int novaIdade) {
		novaIdade = Math.abs(novaIdade); // Os valores negativos ficam positivos
		if(novaIdade >= 0 && novaIdade <= 120) {
			this.idade = novaIdade; // Para validar a idade, se está com 0 ou mais
		}
	}
	
	public String toString(){
		return "Olá eu sou o " + getNomeCompleto()
		+ ", tenho " + getIdade() + " anos.";
	}
}

package br.ifpe.web3;

public class Mensagem {
	private String nome;
	private String telefone;
	private String cidade;
	private String genero;
	private String email;
	private boolean novidades;
	private String texto;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public boolean isNovidades() {
		return novidades;
	}
	public void setNovidades(boolean novidades) {
		this.novidades = novidades;
	}
	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}
	
	public String toString() {
		return "Nome: " + getNome() + "\n Telefone: " + getTelefone() + "\n Cidade: " + getCidade() + "\n Gênero: " + getGenero() + "\n E-mail: " + getEmail() + "\n Aceita novidades? " + isNovidades() + "\n Mensagem: " + getTexto();
	}
	
}

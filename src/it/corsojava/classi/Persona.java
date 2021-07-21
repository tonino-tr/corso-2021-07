package it.corsojava.classi;

public class Persona {
	private String nome;
	private int eta;
	private String mail;
	private static int contatore;	// Memorizza il numero di istanze create
	

	public Persona() {
		contatore++;
	}
	public Persona(String nome, int eta, String mail) {
		this.nome = nome;
		this.eta = eta;
		this.mail = mail;
		contatore++;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getEta() {
		return eta;
	}
	public void setEta(int eta) {
		this.eta = eta;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	
	@Override
	public String toString() {
		return "Persona [nome=" + nome + ", eta=" 
					+ eta + ", mail=" + mail + "]";
	}
	
	public void saluta() {
		System.out.println("Ciao sono " + nome);
	}
	
	public void balla() {
		System.out.println("Sono " + nome + " e sto ballando");
	}
	
	public static int dammiNumeroIstanze() {
		return contatore;
	}

}











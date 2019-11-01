package antenas;

import java.util.List;

public class Projeto {

	private String chave;
	private Entrega entregas;
	private String linkImagem;
	private String descricaoBreve;
	private String linkExterno;
	private String emailEmp;
	private String emailCadi;
	private String descricaoFinal;
	private List<String> alunosEmails;
	
	public Projeto(String chave, Entrega entregas, String linkImagem, String descricaoBreve, String linkExterno,
			String emailEmp, String emailCadi, String descricaoFinal, List<String> alunosEmails) {
		this.chave = chave;
		this.entregas = entregas;
		this.linkImagem = linkImagem;
		this.descricaoBreve = descricaoBreve;
		this.linkExterno = linkExterno;
		this.emailEmp = emailEmp;
		this.emailCadi = emailCadi;
		this.descricaoFinal = descricaoFinal;
		this.alunosEmails = alunosEmails;
	}
	
	
	
	
	public String getChave() {
		return chave;
	}
	public void setChave(String chave) {
		this.chave = chave;
	}
	public Entrega getEntregas() {
		return entregas;
	}
	public void setEntregas(Entrega entregas) {
		this.entregas = entregas;
	}
	public String getLinkImagem() {
		return linkImagem;
	}
	public void setLinkImagem(String linkImagem) {
		this.linkImagem = linkImagem;
	}
	public String getDescricaoBreve() {
		return descricaoBreve;
	}
	public void setDescricaoBreve(String descricaoBreve) {
		this.descricaoBreve = descricaoBreve;
	}
	public String getLinkExterno() {
		return linkExterno;
	}
	public void setLinkExterno(String linkExterno) {
		this.linkExterno = linkExterno;
	}
	public String getEmailEmp() {
		return emailEmp;
	}
	public void setEmailEmp(String emailEmp) {
		this.emailEmp = emailEmp;
	}
	public String getEmailCadi() {
		return emailCadi;
	}
	public void setEmailCadi(String emailCadi) {
		this.emailCadi = emailCadi;
	}
	public String getDescricaoFinal() {
		return descricaoFinal;
	}
	public void setDescricaoFinal(String descricaoFinal) {
		this.descricaoFinal = descricaoFinal;
	}
	public List<String> getAlunosEmails() {
		return alunosEmails;
	}
	public void setAlunosEmails(String email) {
		this.alunosEmails.add(email);
	}
	
	
	
	public boolean buscarAlunosEmail(String emailBuscado) {
		for (String email: alunosEmails) {
			if (email.equals(emailBuscado)) return true;
		}
		return false;
	}
	
	
	


	

	
	
	
	
	
	
}

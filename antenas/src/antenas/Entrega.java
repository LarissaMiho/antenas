package antenas;

public class Entrega {
	private String email;
	private String linkRepositorio;
	private String linkAplicacao;
	private String descricao;
	
	public Entrega(String email, String linkRepositorio, String linkAplicacao, String descricao) {
		
		this.email = email;
		this.linkRepositorio = linkRepositorio;
		this.linkAplicacao = linkAplicacao;
		this.descricao = descricao;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLinkRepositorio() {
		return linkRepositorio;
	}

	public void setLinkRepositorio(String linkRepositorio) {
		this.linkRepositorio = linkRepositorio;
	}

	public String getLinkAplicacao() {
		return linkAplicacao;
	}

	public void setLinkAplicacao(String linkAplicacao) {
		this.linkAplicacao = linkAplicacao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
	
	
	
	

}

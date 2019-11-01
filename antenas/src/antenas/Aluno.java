package antenas;

public class Aluno {
	private String ra;
	private String email;
	private String curso;
	private String senha;
	
	
	
	public Aluno(String ra, String email, String curso, String senha) {
		this.ra = ra;
		this.email = email;
		this.curso = curso;
		this.senha = senha;
	}
	public String getRa() {
		return ra;
	}
	public void setRa(String ra) {
		this.ra = ra;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
}

package antenas;

public class Empresario {
	private String email;
	private String cpf;
	private String senha;
	
	
	
	
	
	public Empresario(String email, String cpf, String senha) {
		this.email = email;
		this.cpf = cpf;
		this.senha = senha;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}

	
}

package antenas;

public class CADI {
	private String matricula;
	private String email;
	private String senha;
	
	
	public CADI(String matricula, String email, String senha) {
		this.matricula = matricula;
		this.email = email;
		this.senha = senha;
	}


	public String getMatricula() {
		return matricula;
	}


	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getSenha() {
		return senha;
	}


	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
	

	
}

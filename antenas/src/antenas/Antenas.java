package antenas;

import java.util.LinkedList;
import java.util.List;

public class Antenas {

	private List<Empresario> empresarios = new LinkedList<Empresario>();
	private List<Projeto> projetos = new LinkedList<Projeto>();
	private List<Aluno> alunos = new LinkedList<Aluno>();
	private List<DadosLogin> logins = new LinkedList<DadosLogin>();
	
	

	public void addEmpresario(Empresario emp) {
		empresarios.add(emp);
	}
	
	
	public void addProjeto(Projeto proj) {
		projetos.add(proj);
	}
	
	public void addAluno(Aluno aluno) {
		alunos.add(aluno);
	}
	
	
	public Projeto buscarProjetoPorChave(String chave) {
		for(Projeto projeto:projetos) {
			if(projeto.getChave().equals(chave)) return projeto;
		}
		return null;
	}
	
	public Empresario buscarEmpresarioPorCpf(String cpf) {
		for(Empresario empresario:empresarios) {
			if(empresario.getCpf().equals(cpf)) return empresario;
		}
		return null;
	}
	public Aluno buscarAlunoPorRa(String ra) {
		for(Aluno aluno:alunos) {
			if(aluno.getRa().equals(ra)) return aluno;
		}
		return null;
	}
	
	public void addChaveProjeto(String chave, Projeto projeto) {
		projeto.setChave(chave);
	}
	
	public void entregarProjeto(Entrega entrega, Projeto projeto) {
		projeto.setEntregas(entrega);
	}
	
	public void inscreverAlunoProjeto(Projeto projeto, Aluno aluno) {
		projeto.setAlunosEmails(aluno.getEmail());
	}
	
	public List<Empresario> getEmpresarios() {
		return empresarios;
	}
	
	public List<Aluno> getAlunos(){
		return alunos;
	}
	
	public boolean buscarEmailAlunos(Projeto projeto, String emailBuscado) {
		for (String email:projeto.getAlunosEmails()) {
			if (email.equals(emailBuscado)) return true;
		}
		
		return false;
	}
	
}

package antenas;

import static org.junit.jupiter.api.Assertions.*;

import java.util.LinkedList;
import java.util.List;

import org.junit.jupiter.api.Test;

class Teste {

	@Test
	void test() {
		Antenas antenas = new Antenas();
		
		//adicionar empresario
		antenas.addEmpresario(new Empresario("email@email.com","677","senha123")); 
		antenas.addEmpresario(new Empresario("email@email.com","777","senha123"));
		// Testa o numero de empresarios
		assertEquals(antenas.getEmpresarios().size(), 2);
		
		//testa a busca pelo empresario
		Empresario emp = antenas.buscarEmpresarioPorCpf("777");
		assertEquals(emp.getCpf(), "777");
		
		//adicionar aluno
		antenas.addAluno(new Aluno("000","1@email.com","ADS","1234abc"));
		antenas.addAluno(new Aluno("4444","2@email.com","ADS","123abc"));
		
		// testa o numero de alunos
		assertEquals(antenas.getAlunos().size(), 2);
		
		//testa a busca pelo aluno
		Aluno aluno = antenas.buscarAlunoPorRa("4444");
		assertEquals(aluno.getRa(),"4444");
		
		//adicionar projeto
		antenas.addProjeto(new Projeto("abc", null, null, null, null, null, null, null, null));
		List<String> alunosEmail= new LinkedList<String>();
		antenas.addProjeto(new Projeto("chave2", null, "imagem", "descrição breve", "Link", "emailEmp", "emailCadi", "descriçao",alunosEmail));
		
		//testa buscar projeto
		Projeto projeto = antenas.buscarProjetoPorChave("chave2");
		assertEquals(projeto.getChave(), "chave2");
		
		//insere uma nova chave para o projeto projeto
		antenas.addChaveProjeto("abcdario", projeto);
		
		//testa a busca pela chave
		assertEquals(projeto.getChave(),"abcdario");
		
		//adicionar entrega 
		Entrega entrega = new Entrega("3@email.com","www.linkR.com","www.linkA.com","descircsaoadadad");
		
		//testa entregar
		antenas.entregarProjeto(entrega, projeto);
		assertEquals(projeto.getEntregas().getDescricao(),"descircsaoadadad");
		
		
		//adicionar aluno no projeto
		antenas.inscreverAlunoProjeto(projeto, aluno);
		assertEquals(projeto.getAlunosEmails().size(),1);
		
		//busca alunos no projeto pelo email
		assertEquals(antenas.buscarEmailAlunos(projeto, "2@email.com"), true);
		
	
		
		
		
		
		
		

		
		
	}

}

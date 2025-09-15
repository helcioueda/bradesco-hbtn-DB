package demo;

import entities.*;
import models.AlunoModel;
import models.CursoModel;
import models.ProfessorModel;

import java.util.Arrays;
import java.util.Date;

public class GestaoCursosMain {

    public static void main(String[] args) {
        AlunoModel alunoModel = new AlunoModel();
        CursoModel cursoModel = new CursoModel();
        ProfessorModel professorModel = new ProfessorModel();

        Aluno aluno = new Aluno();
        aluno.setNomeCompleto("Ze do Teste");
        aluno.setMatricula("TST123");
        aluno.setNascimento(new Date());
        aluno.setEmail("ze@teste.com");

        Telefone telefone = new Telefone();
        telefone.setDDD("11");
        telefone.setNumero("923499409");
        telefone.setAluno(aluno);

        Endereco endereco = new Endereco();
        endereco.setLogradouro("Rua do Teste");
        endereco.setEndereco("123");
        endereco.setNumero("123");
        endereco.setBairro("Bairro Teste");
        endereco.setCidade("São Paulo");
        endereco.setEstado("SP");
        endereco.setCep(12345678);
        endereco.setAluno(aluno);

        aluno.setTelefones(Arrays.asList(telefone));
        aluno.setEnderecos(Arrays.asList(endereco));
        
        alunoModel.create(aluno);

        Professor professor = new Professor();
        professor.setNomeCompleto("Professor");
        professor.setMatricula("PTST123");
        professor.setEmail("proteste@teste.com");
        
        professorModel.create(professor);

        Curso curso = new Curso();
        curso.setNome("Engenharia de Software");
        curso.setSigla("ES");
        curso.setProfessor(professor);

        MaterialCurso materialCurso = new MaterialCurso();
        materialCurso.setUrl("http://www.exemplo.com/material");
        materialCurso.setCurso(curso);
        curso.setMaterialCurso(materialCurso);

        curso.setAlunos(Arrays.asList(aluno));
        aluno.setCursos(Arrays.asList(curso));
        
        cursoModel.create(curso);
        
        System.out.println("Todas as entidades foram salvas com sucesso!");
    }
}
package br.com.digitalhouseDesafioJava;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public  class Curso {
    private String nome;
    private Integer codigoCurso;
    private Professor professorTitular;
    private Professor professorAdjunto;
    private Integer quantidadeMaximaAluno;
    private List<Aluno> alunosMatriculados = new ArrayList<>();



    public Boolean adicionarUmAluno(Aluno umAluno) {
        if (alunosMatriculados.size() < quantidadeMaximaAluno) {
            alunosMatriculados.add(umAluno);
            System.out.println("Aluno Matriculado com sucesso!");
            return true;
        }else {
            System.out.println("Não foi possivel efetuar a Matricula!");
            return false;
        }
    }
    public void excluirAluno(Aluno umAluno){
        try{
            alunosMatriculados.remove(umAluno);
            System.out.println("Aluno foi removido com sucesso!");
        } catch (Exception e){
            System.out.println("Aluno não encontrado, na lista!");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Curso curso = (Curso) o;
        return Objects.equals(codigoCurso, curso.codigoCurso);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigoCurso);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getCodigoCurso() {
        return codigoCurso;
    }

    public void setCodigoCurso(Integer codigoCurso) {
        this.codigoCurso = codigoCurso;
    }

    public Professor getProfessorTitular() {
        return professorTitular;
    }

    public void setProfessorTitular(Professor professorTitular) {
        this.professorTitular = professorTitular;
    }

    public Professor getProfessorAdjunto() {
        return professorAdjunto;
    }

    public void setProfessorAdjunto(Professor professorAdjunto) {
        this.professorAdjunto = professorAdjunto;
    }

    public Integer getQuantidadeMaximaAluno() {
        return quantidadeMaximaAluno;
    }

    public void setQuantidadeMaximaAluno(Integer quantidadeMaximaAluno) {
        this.quantidadeMaximaAluno = quantidadeMaximaAluno;
    }

    public List<Aluno> getAlunosMatriculados() {
        return alunosMatriculados;
    }

    public void setAlunosMatriculados(List<Aluno> alunosMatriculados) {
        this.alunosMatriculados = alunosMatriculados;
    }
}
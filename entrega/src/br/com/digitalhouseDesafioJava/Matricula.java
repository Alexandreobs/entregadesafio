package br.com.digitalhouseDesafioJava;


import java.util.Date;

public class Matricula {


    private Aluno aluno;
    private Curso curso;
    private Date dataDoDia;

    public Matricula(Aluno aluno, Curso curso, Date dataDoDia) {
        this.aluno = aluno;
        this.curso = curso;
        this.dataDoDia = new Date();
    }


    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Date getDataDoDia() {
        return dataDoDia;
    }

    public void setDataDoDia(Date dataDoDia) {
        this.dataDoDia = dataDoDia;
    }
}

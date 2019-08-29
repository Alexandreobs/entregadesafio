package br.com.digitalhouseDesafioJava;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DigitalHouseManager {

    private List<Aluno> listaAluno = new ArrayList<>();
    private List<Professor> listaProfessor = new ArrayList<>();
    private List<Curso> listaCurso = new ArrayList<>();
    private List<Matricula> listaMatricula = new ArrayList<>();


    public void registrarCurso(String nome, Integer codigoCurso, Integer quantidadeMaximaDeAlunos) {
        Curso curso = new Curso();
        curso.setNome(nome);
        curso.setCodigoCurso(codigoCurso);
        curso.setQuantidadeMaximaAluno(quantidadeMaximaDeAlunos);
        listaCurso.add(curso);
        System.out.println( "O seguinte curso:  " + curso.getNome() + ", foi Cadastrado com sucesso!");


    }

    public void excluirCurso(Integer codigoCurso) {
        listaCurso.remove(listaCurso.get(codigoCurso));
        System.out.println(codigoCurso + " Curso excluido com sucesso:" );
    }

    public void registrarProfessorAdjunto(String nome, String sobrenome, Integer codigoProfessor, Integer quantidadeDeHoras) {
        ProfessorAdjunto professorAdjunto = new ProfessorAdjunto();
        professorAdjunto.setNome(nome);
        professorAdjunto.setSobreNome(sobrenome);
        professorAdjunto.setCodigoProfessor(codigoProfessor);
        professorAdjunto.setQuantidadeHoras(quantidadeDeHoras);
        System.out.println("Professor: " + nome  + " " + sobrenome + "\n" + "registrado com sucesso!" + "\n" + "Categoria: Adjunto." + "\n");
        professorAdjunto.setTempoCasa(0);
        listaProfessor.add(professorAdjunto);


    }

    public void registrarProfessorTitular(String nome, String sobrenome, Integer codigoProfessor, String especialidade) {
        ProfessorTitular professorTitular = new ProfessorTitular();
        professorTitular.setNome(nome);
        professorTitular.setSobreNome(sobrenome);
        professorTitular.setCodigoProfessor(codigoProfessor);
        professorTitular.setEspecialidade(especialidade);
        System.out.println("Professor: " + nome  + " " + sobrenome + "\n" + "registrado com sucesso!" + "\n" + "Categoria: Titular." + "\n");
        professorTitular.setTempoCasa(0);
        listaProfessor.add(professorTitular);

    }

    public void excluirProfessor(Integer codigoProfessor) {
        listaProfessor.remove(listaProfessor.get(codigoProfessor));
        System.out.println(codigoProfessor + " Professor excluido");
    }

    public void registrarAluno(String nome, String sobrenome, Integer codigoAluno) {
        Aluno aluno = new Aluno( nome, sobrenome, codigoAluno);
        aluno.setNome(nome);
        aluno.setSobreNome(sobrenome);
        aluno.setCodigoAluno(codigoAluno);
        listaAluno.add(aluno);
        System.out.println("Aluno " + nome + " " + sobrenome + "\n"
                + "Matriculado com sucesso!" + "\n"
                + "Com o seguinte código: " + codigoAluno + "\n");
    }

    public Aluno getAlunoPorCodigo(Integer codigo) {
        for (Aluno aluno : listaAluno) {
            if (aluno.getCodigoAluno().equals(codigo)) {
                return aluno;
            }
        }
        return null;
    }

    public Curso getCursoPorCodigo(Integer codigo) {
        for (Curso curso : listaCurso) {
            if (curso.getCodigoCurso().equals(codigo)) {
                return curso;
            }
        }
        return null;
    }

    public Professor getProfessorPorCodigo(Integer codigo) {
        for (Professor professor : listaProfessor) {
            if (professor.getCodigoProfessor().equals(codigo)) {
                return professor;
            }
        }
        return null;
    }

    public void matricularAluno(Integer codigoAluno, Integer codigoCurso) {
        Aluno aluno = getAlunoPorCodigo(codigoAluno);
        Curso curso = getCursoPorCodigo(codigoCurso);
        Date data = new Date();
        if (curso.adicionarUmAluno(aluno)) {
            Matricula matricula1 = new Matricula(aluno, curso, data);
            listaMatricula.add(matricula1);
            System.out.println( aluno.getNome() + " matriculado(a) no curso: " + curso.getNome() + "." + "\n");
        } else {
            System.out.println("Não há vagas disponíveis" + "\n");
        }
    }

    public void alocarProfessores(Integer codigoCurso, Integer codigoProfessorTitular, Integer codigoProfessorAdjunto) {

        ProfessorTitular titular = (ProfessorTitular) getProfessorPorCodigo(codigoProfessorTitular);
        ProfessorAdjunto adjunto = (ProfessorAdjunto) getProfessorPorCodigo(codigoProfessorAdjunto);
        Curso curso =  getCursoPorCodigo(codigoCurso);
        curso.setProfessorTitular(titular);
        curso.setProfessorAdjunto(adjunto);
        System.out.println("professores alocados para o seguinte curso: " + curso.getNome() + "\n"
                + "Professor titular: " + titular.nome + " " + titular.sobreNome + "\n"
                + "Professor adjunto: " + adjunto.nome + " " + adjunto.sobreNome + "\n");

    }

}
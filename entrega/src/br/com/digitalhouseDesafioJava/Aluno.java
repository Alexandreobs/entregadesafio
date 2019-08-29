package br.com.digitalhouseDesafioJava;


import java.util.List;
import java.util.Objects;

public class Aluno{




    private String nome;
    private String sobreNome;
    private Integer codigoAluno;
    private List<Matricula> minhaMatricula;

    public Aluno(String nome, String sobreNome, Integer codigoAluno) {
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.codigoAluno = codigoAluno;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Aluno aluno = (Aluno) o;
        return Objects.equals(codigoAluno, aluno.codigoAluno);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigoAluno);
    }


    public String consultaMat () {
        String dados = "Aluno" + '\n' +
                "nome: " + nome + '\n' +
                "sobreNome: " + sobreNome + '\n' +
                "codigoAluno: " + codigoAluno + '\n' +
                "Minhas Matriculas:" + '\n';

        for(int i = 0 ; i <= minhaMatricula.size(); i++){
            dados = dados + " " + minhaMatricula.get(i).getCurso().getNome() + '\n';
        }

        return dados;
    }

    public Aluno buscaAluno(List<Aluno> alunos, Integer codigoAluno){
        for(int i = 0 ; i <= alunos.size(); i++){
            if(alunos.get(i).getCodigoAluno().equals(codigoAluno)){
                return alunos.get(i);
            }
        }
        return null;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public Integer getCodigoAluno() {
        return codigoAluno;
    }

    public void setCodigoAluno(Integer codigoAluno) {
        this.codigoAluno = codigoAluno;
    }

    public List<Matricula> getMinhaMatricula() {
        return minhaMatricula;
    }

    public void setMinhaMatricula(List<Matricula> minhaMatricula) {
        this.minhaMatricula = minhaMatricula;
    }

}
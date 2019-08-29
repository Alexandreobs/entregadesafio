package br.com.digitalhouseDesafioJava;


import java.util.Objects;

public  abstract class Professor {

    protected String nome;
    protected String sobreNome;
    protected Integer tempoCasa;
    protected Integer codigoProfessor;



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Professor)) return false;
        Professor professor = (Professor) o;
        return Objects.equals(codigoProfessor, professor.codigoProfessor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigoProfessor);
    }

    @Override
    public String toString() {
        return "Professor " +   '\n' +
                "nome: " + nome + '\n' +
                "sobreNome: " + sobreNome + '\n' +
                "tempoCasa: " + tempoCasa + '\n' +
                "codigoProfessor: " + codigoProfessor ;
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

    public Integer getTempoCasa() {
        return tempoCasa;
    }

    public void setTempoCasa(Integer tempoCasa) {
        this.tempoCasa = tempoCasa;
    }

    public Integer getCodigoProfessor() {
        return codigoProfessor;
    }

    public void setCodigoProfessor(Integer codigoProfessor) {
        this.codigoProfessor = codigoProfessor;
    }
}
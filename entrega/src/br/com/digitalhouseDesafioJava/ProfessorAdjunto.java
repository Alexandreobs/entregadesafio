package br.com.digitalhouseDesafioJava;


public class ProfessorAdjunto extends Professor {

    private Integer quantidadeHoras;



    @Override
    public String toString() {
        return "ProfessorAdjunto : " + getNome() + " " + getSobreNome() + "\n Codigo:  " + getCodigoProfessor() + "\n Tempo de casa: " + getTempoCasa();
    }

    public Integer getQuantidadeHoras() {
        return quantidadeHoras;
    }

    public void setQuantidadeHoras(Integer quantidadeHoras) {
        this.quantidadeHoras = quantidadeHoras;
    }
}


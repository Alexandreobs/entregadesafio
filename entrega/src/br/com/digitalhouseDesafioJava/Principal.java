package br.com.digitalhouseDesafioJava;


import java.util.ArrayList;
import java.util.List;


public class Principal {
    public static void main(String[] args) {

        Aluno alexandre = new Aluno("Alexandre","Silva",123);
        Aluno robson = new Aluno ("Robson","Cardoso",456);
        Aluno camila = new Aluno("Camila","Pereira",789);
        Aluno karla = new Aluno("Karla","Gomes",987);

        /////////////////////////////////////////////////////////////////////////////////////////


        List<Aluno> listaAluno = new ArrayList<>();
        listaAluno.add(alexandre);
        listaAluno.add(robson);
        listaAluno.add(camila);
        listaAluno.add(karla);

        System.out.println("******************************************************************");
        System.out.println("             -= Registro de Professores =-" + "\n");


        DigitalHouseManager digitalHouseManager = new DigitalHouseManager();

        digitalHouseManager.registrarProfessorTitular("Jessica", "Corrêa", 12, "Desenvolvedor Mobile Android");
        digitalHouseManager.registrarProfessorTitular("Luciana", "Silva", 23, "Desenvolvedor Mobile IOS");
        digitalHouseManager.registrarProfessorAdjunto("João", "felipe", 34, 40);
        digitalHouseManager.registrarProfessorAdjunto("Patrica", "Morais", 45, 50);

        System.out.println("******************************************************************");
        System.out.println("             -= Registro de Cursos =-" + "\n");



        digitalHouseManager.registrarCurso("Full Stack", 20001, 3);

        digitalHouseManager.registrarCurso("Android", 20002, 2);

        System.out.println("******************************************************************" + "\n");
        System.out.println("             -= Professores realocados =-" + "\n");

        digitalHouseManager.alocarProfessores(20001, 12, 34);
        digitalHouseManager.alocarProfessores(20002, 23, 45);

        System.out.println("******************************************************************");
        System.out.println("             -= Registro de Alunos =-" + "\n");

        digitalHouseManager.registrarAluno("Alexandre", "Silva", 123);
        digitalHouseManager.registrarAluno("Robson", "Cardoso", 456);
        digitalHouseManager.registrarAluno("Camila", "Pereira", 789);
        digitalHouseManager.registrarAluno("Karla", "Gomes", 987);


        System.out.println("******************************************************************" + "\n");
        System.out.println("             -= Registro de matriculas =-" + "\n");

        digitalHouseManager.matricularAluno(123, 20001);
        digitalHouseManager.matricularAluno(456, 20001);
        digitalHouseManager.matricularAluno(789, 20002);
        digitalHouseManager.matricularAluno(987,20002);
        digitalHouseManager.matricularAluno(765, 20002);

        System.out.println("******************************************************************" + "\n");


    }
}
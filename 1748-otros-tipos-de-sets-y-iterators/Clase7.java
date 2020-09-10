package com.alura;

import com.alura.model.Aula;
import com.alura.model.Curso;

import java.util.ArrayList;
import java.util.List;

public class Clase7 {

    public static void main(String[] args) {

        Curso curso1 = new Curso("Java",30) ;
        curso1.addAula(new Aula("ArrayList"));
        curso1.addAula(new Aula("List"));
        curso1.addAula(new Aula("LinkedList"));
        curso1.addAula(new Aula("Inmutable"));

        List<Aula> aulaList = curso1.getAulaList();


        ArrayList<Curso> cursos = new ArrayList<>();
        cursos.add(curso1);

        System.out.println(aulaList);
    }
}

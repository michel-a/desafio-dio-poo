package com.malves.desafio;

import com.malves.desafio.dominio.Bootcamp;
import com.malves.desafio.dominio.Curso;
import com.malves.desafio.dominio.Dev;
import com.malves.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Principal {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso Java");
        curso1.setCargaHoraria(8);
        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Descrição curso JS");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição mentoria de Java");
        mentoria.setData(LocalDate.now());

//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devMichel = new Dev();
        devMichel.setNome("Michel");
        devMichel.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Michel: " + devMichel.getConteudosInscritos());
        devMichel.progredir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos Michel: " + devMichel.getConteudosInscritos());
        System.out.println("Conteúdos concluídos Michel: " + devMichel.getConteudosConcluidos());
        System.out.println("XP: " + devMichel.calcularTotalXp());

        System.out.println("-----------------------------------------------------------------------");
        Dev devAmber = new Dev();
        devAmber.setNome("Amber");
        devAmber.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Amber: " + devAmber.getConteudosInscritos());
        devAmber.progredir();
        devAmber.progredir();
        devAmber.progredir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos Amber: " + devAmber.getConteudosInscritos());
        System.out.println("Conteúdos concluídos Amber: " + devAmber.getConteudosConcluidos());
        System.out.println("XP: " + devAmber.calcularTotalXp());

    }
}

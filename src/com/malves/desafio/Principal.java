package com.malves.desafio;

import com.malves.desafio.dominio.Bootcamp;
import com.malves.desafio.dominio.Curso;
import com.malves.desafio.dominio.Dev;
import com.malves.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Principal {
    public static void main(String[] args) {
        Curso curso1 = new Curso("Curso Java", "Descrição curso Java", 8);
        Curso curso2 = new Curso("Curso JS", "Descrição curso JS", 4);

        Mentoria mentoria = new Mentoria("Mentoria de Java", "Descrição mentoria de Java", LocalDate.now());

        Bootcamp bootcamp = new Bootcamp("Bootcamp Java Developer", "Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devMichel = new Dev("Michel");
        devMichel.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Michel: " + devMichel.getConteudosInscritos());
        devMichel.progredir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos Michel: " + devMichel.getConteudosInscritos());
        System.out.println("Conteúdos concluídos Michel: " + devMichel.getConteudosConcluidos());
        System.out.println("XP: " + devMichel.calcularTotalXp());

        System.out.println("-----------------------------------------------------------------------------------------");
        Dev devAmber = new Dev("Amber");
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

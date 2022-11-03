import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso java");
        curso1.setDescricao("Descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso java");
        curso2.setDescricao("Descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de java");
        mentoria.setDescricao("Descrição mentoria java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devEdmilson = new Dev();
        devEdmilson.setNome("Edmilson");
        devEdmilson.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Edmilson" + devEdmilson.getConteudosInscritos());
        devEdmilson.progredir();
        devEdmilson.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Edmilson" + devEdmilson.getConteudosInscritos());
        System.out.println("Conteúdos concluidos Edmilson" + devEdmilson.getConteudosConcluidos());
        System.out.println("XP: " + devEdmilson.calcularTotalXp());

        System.out.println("------------");

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos João" + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos João" + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos concluidos João" + devJoao.getConteudosConcluidos());
        System.out.println("XP: " + devJoao.calcularTotalXp());

        
    }
}

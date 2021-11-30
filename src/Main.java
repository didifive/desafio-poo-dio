import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        Desafio desafio = new Desafio("desafio de códigos java");
        desafio.setDescricao("Desafios de código de Java");
        desafio.setQuantidadeDesafios(6);

        Bootcamp bootcamp = new Bootcamp("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);
        bootcamp.getConteudos().add(desafio);

        Dev devCamila = new Dev("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.printf("Situação inicial de %s:\n",devCamila.getNome());
        System.out.println(devCamila);
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("-");
        System.out.printf("Situação atual de %s:\n",devCamila.getNome());
        System.out.println(devCamila);


        System.out.println("-------");

        Dev devJoao = new Dev("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.printf("Situação inicial de %s:\n",devJoao.getNome());
        System.out.println(devJoao);
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.printf("Situação atual de %s:\n",devJoao.getNome());
        System.out.println(devJoao);

        System.out.println("-------");
        System.out.println("-");
        System.out.printf("Situação atual do %s:\n",bootcamp.getNome());
        System.out.println(bootcamp);

    }

}

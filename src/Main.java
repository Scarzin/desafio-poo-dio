import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso(
                "curso java",
                "descricao curso java",
                8);

        Curso curso2 = new Curso(
                "curso js",
                "descricao curso js",
                4);

        Mentoria mentoria = new Mentoria(
                "mentoria de java",
                "descrição mentoria java",
                LocalDate.now());

        Bootcamp bootcamp = new Bootcamp("Bootcamp Java Developer", "Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devCamila = new Dev("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        devCamila.exibirConteudosInscritos();
        devCamila.progredir();
        devCamila.progredir();
        devCamila.exibirConteudosConcluidos();
        devCamila.exibirXP();

        System.out.println("-------");

        Dev devJoao = new Dev("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        devJoao.exibirConteudosInscritos();
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        devJoao.exibirConteudosConcluidos();
        devJoao.exibirXP();

        System.out.println("-------");

        System.out.println("Devs: \n" + devCamila.toString() + "\n e \n" + devJoao.toString());
    }
}

import brComDioDesafio.dominio.BootCamp;
import brComDioDesafio.dominio.Curso;
import brComDioDesafio.dominio.Dev;
import brComDioDesafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1= new Curso();
        curso1.setTitulo("Java");
        curso1.setDescricao("Descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("JavaScript");
        curso2.setDescricao("Descrição curso JavaScript");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria java");
        mentoria.setDescricao("descricao mentoria java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        BootCamp bootCamp = new BootCamp();
        bootCamp.setNome("Bootcamp java developer");
        bootCamp.setDescricao("Descricao java developer");
        bootCamp.getConteudos().add(curso1);
        bootCamp.getConteudos().add(curso2);
        bootCamp.getConteudos().add(mentoria);

        Dev devVitor = new Dev();
        devVitor.inscreverBootCamp(bootCamp);
        devVitor.setNome("Vitor");


        System.out.println("Conteúdos inscritos: " + devVitor.getConteudosInscritos());
        System.out.println("Conteúdos concluídos: " + devVitor.getConteudosConcluidos());




    }
}

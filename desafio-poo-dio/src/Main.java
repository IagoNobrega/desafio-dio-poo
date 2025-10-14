import br.com.bootcamp.model.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Java Básico");
        curso1.setDescricao("Aprenda os fundamentos de Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Spring Boot");
        curso2.setDescricao("Aprenda a criar APIs REST com Spring Boot");
        curso2.setCargaHoraria(12);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Carreira Java Developer");
        mentoria.setDescricao("Mentoria com profissionais experientes");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Bootcamp focado em backend com Java e Spring");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devIago = new Dev();
        devIago.setNome("Iago");
        devIago.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Iago: " + devIago.getConteudosInscritos());
        devIago.progredir();
        devIago.progredir();
        System.out.println("Conteúdos Concluídos Iago: " + devIago.getConteudosConcluidos());
        System.out.println("XP Total: " + devIago.calcularTotalXp());

        System.out.println("---------------------------------------");

        Dev devMaria = new Dev();
        devMaria.setNome("Maria");
        devMaria.inscreverBootcamp(bootcamp);
        devMaria.progredir();
        System.out.println("Conteúdos Inscritos Maria: " + devMaria.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Maria: " + devMaria.getConteudosConcluidos());
        System.out.println("XP Total: " + devMaria.calcularTotalXp());
    }
}

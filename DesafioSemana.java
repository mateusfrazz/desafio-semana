package controle.desafios.semana;

import java.util.Scanner;

public class DesafioSemana {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe o dia da semana: ");
        String diaSemana = entrada.nextLine();

        //utilizando o equalsIgonreCase para igonrar letras minusculas ou maiusculas
        if (diaSemana.equalsIgnoreCase("Domingo")){
            System.out.println("1");
            //adicionando comparação para que caso o usuario digitar o dia de outra forma para que o sistema valide de acordo com a condição
        }else if (diaSemana.equalsIgnoreCase("Segunda")|| diaSemana.equalsIgnoreCase("Segunda-Feira")) {
            System.out.println("2");
        } else if (diaSemana.equalsIgnoreCase("Terça") || diaSemana.equalsIgnoreCase("Terça-Feira")){
            System.out.println("3");
        } else if (diaSemana.equalsIgnoreCase("Quarta") || diaSemana.equalsIgnoreCase("Quarta-feira")) {
            System.out.println("4");
        } else if (diaSemana.equalsIgnoreCase("Quinta")|| diaSemana.equalsIgnoreCase("Quinta-Feira")) {
            System.out.println("5");
        } else if (diaSemana.equalsIgnoreCase("sexta") || diaSemana.equalsIgnoreCase("Sexta-Feira")) {
            System.out.println("6");
        } else  {
            System.out.println("Dia invalido !!");
        }
        System.out.println("Fim :)");

    }
}

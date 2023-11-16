package enump;

import java.util.Scanner;

public class ExemploEnum {
    public static void main(String[] args) {
        String q = DiaSemanaEnum.QUINTA.name();

        System.out.println("Escolha um dos valores possíveis: ");

        DiaSemanaEnum[] valoresPossiveis = DiaSemanaEnum.values();

        for (DiaSemanaEnum valoresPossivei : valoresPossiveis) {
            System.out.println(valoresPossivei.getCodigo());
            System.out.println(valoresPossivei.getDescricao());
        }

        Scanner x = new Scanner(System.in);

        Integer escolha = x.nextInt();

        for (DiaSemanaEnum vaga : valoresPossiveis){
            if (vaga.getCodigo() == escolha){
                System.out.println("Dia semana escolhido");
                System.out.println(vaga.getDescricao());
            }
        }
    }
}

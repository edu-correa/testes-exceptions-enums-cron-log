package exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);


        try {
            System.out.println("Digite um número entre 0 e 10: ");
            Integer numero = leitor.nextInt();
            if (numero > 10 || numero < 0){
                throw new NotInIntervalException("Are accepted only numbers between 1 and 10");
            }
        } catch (InputMismatchException | NotInIntervalException e){
            System.out.println("Jegue burro" + "\n" + e);
            if (e.getMessage() != null){
                System.out.println(e.getMessage());
            }
        } catch (Exception e){
            System.out.println(e);
        }


        Calculadora c = new Calculadora();

        c.dividir(1,0);


    }
}

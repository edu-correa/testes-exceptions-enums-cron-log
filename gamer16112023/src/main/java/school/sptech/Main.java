package school.sptech;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Main {
    public static void main(String[] args) {
        Timer agendador = new Timer();

        Scanner in = new Scanner(System.in);

        System.out.println("Mensagem para rotina: ");
        String mensagemParaExibir = in.nextLine();

        System.out.println("Para sair pressione ENTER");

        /*
        TimerTask tarefa = new TimerTask() {
            @Override
            public void run() {
                System.out.println("Ola mundo 1");
            }
        }; */

        ExibeMensagemTask tarefa1 =
                new ExibeMensagemTask(
                "Ar condicionado",
                1000,
                5000
        );


        agendador.schedule(tarefa1, tarefa1.getDelay(), tarefa1.getPeriodo());

        in.nextLine();

        agendador.cancel();
    }
}
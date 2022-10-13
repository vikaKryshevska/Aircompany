package Commands.Show.All;

import java.util.Scanner;

public class ShowAllPlanes {
    public static void AllPlanes(){
        System.out.println("Бажаєте вивести всі доступні літаки - 1");
        Scanner input = new Scanner(System.in);
        if (input.nextInt() == 1){
            System.out.println("Всі доступні літаки...");
        }
        else
            System.out.println("Всі літаки...");

    }
}
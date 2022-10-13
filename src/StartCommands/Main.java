package StartCommands;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Menu menu = new Menu();

        while (true){
            System.out.print("Команди: ");
            menu.getAvailableCommands();
            String command = input.next();
            menu.execute(command);
        }
    }
}
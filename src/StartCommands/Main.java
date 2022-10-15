package StartCommands;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Menu menu = new Menu();

        while (true){
            System.out.println("Бажаєте вивести усі команди - введіть 0, інакше номер команди яку хочете виконати");
            Integer command = input.nextInt();
            if (command == 0) {
                System.out.println("Команди: ");
                menu.getAvailableCommands();
                command = input.nextInt();
            }
            menu.execute(command);
        }
    }
}

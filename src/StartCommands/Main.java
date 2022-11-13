package StartCommands;

import Additional.Connection2SQL;
import Additional.GUI;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException, IOException {
        Scanner input = new Scanner(System.in);
        Menu menu = new Menu();

        Connection2SQL.GetDataFromSQL();
        GUI.main();
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

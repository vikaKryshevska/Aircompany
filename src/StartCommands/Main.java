package StartCommands;

import Additional.GUI;
import org.apache.log4j.xml.DOMConfigurator;

import javax.mail.MessagingException;
import java.sql.SQLException;
import java.util.Scanner;


public class Main {
   // private static final Logger log = LogManager.getLogger(Main.class);

    public static void main (String[] args) throws SQLException, MessagingException {

        Scanner input = new Scanner(System.in);
        DOMConfigurator.configure("src/resources/log4j2.xml");
        Menu menu = new Menu();
       // log.info("Start program");
        Additional.SQL.Connection2SQL.GetDataFromSQL();



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



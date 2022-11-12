package Additional;
import javax.swing.*;
import java.awt.event.*;
import StartCommands.*;

public class GUI {

    public static void GUI(String[] args) {

        SimpleFrame frame = new SimpleFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    static class SimpleFrame extends JFrame
    {
        public static final int DEFAULT_WIDTH = 300;
        public static final int DEFAULT_HEIGHT = 200;

        public SimpleFrame()
        {
            setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT); // задаємо розміри фрейму
            JPanel panel = new JPanel();            // створюємо панель
            this.add(panel);                        // додаємо панель у фрейм

            JButton button1 = new JButton("Показати літаки");   //створюємо кнопку 1
            panel.add(button1);             // додаємо кнопку на панель
            button1.addActionListener(e -> {
                menu.execute(3);
            });       // зв'язуємо обробника подій з кнопкою 1

            JButton button2 = new JButton("Кнопка 2");   //створюємо кнопку 2
            panel.add(button2);             // додаємо кнопку на панель

        }
    }


}


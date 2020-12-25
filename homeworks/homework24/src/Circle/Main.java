package Circle;

import javax.swing.*;

public class Main extends JFrame {


    public Main() {

        setTitle("Circle");
        setSize(1920, 1080);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel background;
        background = new JLabel(new ImageIcon("./src/images/smoking.gif"));
        background.setBounds(0, 0, 1920, 1080);
        add(background);
        setLocationRelativeTo(null);
        Circle circle = new Circle(background);
        add(circle);
        circle.draw();
        setResizable(false);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Main();
    }
}

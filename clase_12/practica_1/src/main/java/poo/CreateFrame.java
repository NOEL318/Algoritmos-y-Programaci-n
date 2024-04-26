package poo;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.*;

public class CreateFrame {
    public static void main(String[] args) {
        NewFrame frame_1 = new NewFrame("Programacion Orientada a Objetos", 720, 450, "Success",
                "181233\n Noel Rincon Anaya Promedio Actual: 100");
        NewFrame frame_2 = new NewFrame("Algebra Lineal", 720, 450, "Pink",
                "181233\n Noel Rincon Anaya Promedio Actual: 90");

        frame_1.setVisible(true);
        frame_2.setVisible(true);

        System.out.println(frame_1.getName() + " Visibility: " + frame_1.isVisible());
        System.out.println(frame_2.getName() + " Visibility: " + frame_2.isVisible());

    }
}

class NewFrame extends JFrame {
    public NewFrame() {
        setSize(720, 450);
    }

    public NewFrame(String WindowTitle) {
        setSize(720, 450);
        setName(WindowTitle);

    }

    public NewFrame(String WindowTitle, int width, int height, String type, String message) {
        setSize(width, height);
        setName(WindowTitle);
        setTitle(WindowTitle);
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        Lamina lam = new Lamina(message);
        add(lam);

        if (type.equals("Success")) {
            setBackground(Color.ORANGE);
            getContentPane().setBackground(Color.orange);
        } else if (type.equals("Error")) {
            setBackground(Color.red);
            getContentPane().setBackground(Color.pink);
        } else if (type.equals("Warning")) {
            setBackground(Color.yellow);
            getContentPane().setBackground(Color.yellow);
        } else if (type.equals("Pink")) {
            setBackground(Color.pink);
            getContentPane().setBackground(Color.red);
        }
    }
}

class Lamina extends JPanel {
    private String message;

    public Lamina(String message) {
        this.message = message;
    }

    public void paintComponent(Graphics g) {
        g.drawString(this.message, 10, 20);
    }
}
package poo;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;

public class CreateFrame {

    public static void main(String[] args) throws IOException {

        // File imgFile = new File("src/main/java/poo/017.png");
        // if (!imgFile.exists()) {
        // System.out.println("Image file NOT FOUND at: " + imgFile.getAbsolutePath());
        // } else if (!imgFile.canRead()) {
        // System.out.println("No READ perms for file at: " +
        // imgFile.getAbsolutePath());
        // } else {
        // System.out.println("Loading valid image file from: " +
        // imgFile.getAbsolutePath());
        // }

        // BufferedImage in = ImageIO.read(new File("src/main/java/poo/017.png"));
        // BufferedImage en = ImageIO.read(new File("src/main/java/poo/017.png"));

        String[][] pokemones = { { "017", "Pidgeotto", "0.6m", "30kg",
                "Tiene unas garras desarrolladas. Puede atrapar un Exeggcute y transportarlo",
                "desde una distancia de casi 100 km.",
                "63", "50", "50", "71" },
                { "014", "Kakuna", "1.1m", "30kg",
                        "Casi incapaz de moverse, este Pokémon solo puede endurecer su caparazón para protegerse.", "",
                        "45", "25", "25", "35" },
                { "001", "Bulbasaur", "0.7m", "6.9kg",
                        "Una rara semilla le fue plantada en el lomo al nacer. La planta brota y crece con este Pokémon.",
                        "",
                        "45", "65", "65", "45" } };

        NewFrame menu = new NewFrame(pokemones, 720, 450, "Warning");
        menu.setVisible(true);

        // NewFrame frame_1 = new NewFrame(selected_pokemon, 720, 450, "Success", in);
        // frame_1.setVisible(true);

        // System.out.println(frame_1.getName() + " Visibility: " +
        // frame_1.isVisible());

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

    public NewFrame(String[] selected_pokemon, int width, int height, String type, BufferedImage image) {
        setSize(width, height);
        setName(selected_pokemon[1]);
        setTitle(selected_pokemon[1]);
        setResizable(false);
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        Lamina lam = new Lamina(selected_pokemon, image);
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

    public NewFrame(String[][] pokemones, int width, int height, String type) {
        setSize(width, height);
        setName("Pokemon");
        setTitle("Pokemon");
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton button[] = new JButton[5];
        for (int i = 0; i < pokemones.length; i++) {
            button[i] = new JButton();
            button[i].setText(pokemones[i][1]);
            button[i].setBounds(i, 50, 100, 60);
            String[] selected_pokemon = new String[10];
            for (int e = 0; e < 10; e++) {
                selected_pokemon[e] = pokemones[i][e];
            }
            button[i].addActionListener((ActionEvent ae) -> {
                try {
                    openDescription(selected_pokemon);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
        }
        for (int i = 0; i < pokemones.length; i++) {
            add(button[i]);
        }
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

    public void openDescription(String[] selected_pokemon) throws IOException {
        BufferedImage x = getImageBuffered(selected_pokemon[0]);
        Lamina lam = new Lamina(selected_pokemon, x);
        add(lam);
        NewFrame frame_1 = new NewFrame(selected_pokemon, 720, 450, "Success", x);
        frame_1.setVisible(true);
    }

    public BufferedImage getImageBuffered(String _id) throws IOException {
        BufferedImage image = ImageIO.read(new File("src/main/java/poo/" + _id + ".png"));
        return image;
    }
}

class Lamina extends JPanel {
    private String[] selected_pokemon;
    private BufferedImage image;

    public Lamina(String[] selected_pokemon, BufferedImage image) {
        this.selected_pokemon = selected_pokemon;
        this.image = image;
    }

    public void paintComponent(Graphics g) {
        g.drawString(this.selected_pokemon[1], 330, 20);
        g.drawImage(image, 250, 20, 250, 250, this);
        g.drawString("_id: " + this.selected_pokemon[0], 330, 300);
        g.drawString("Estatura: " + this.selected_pokemon[2], 270, 320);
        g.drawString("Peso: " + this.selected_pokemon[3], 370, 320);
        g.drawString(this.selected_pokemon[4], 150, 350);
        g.drawString(this.selected_pokemon[5], 250, 370);
        g.drawString("Velocidad: " + this.selected_pokemon[6], 150, 390);
        g.drawString("Defensa: " + this.selected_pokemon[7], 250, 390);
        g.drawString("Ataque: " + this.selected_pokemon[8], 350, 390);
        g.drawString("Puntos de vida: " + this.selected_pokemon[9], 450, 390);
    }

}
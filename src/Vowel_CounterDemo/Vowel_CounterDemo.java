package Vowel_CounterDemo;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;


public class Vowel_CounterDemo extends JFrame {

    private Container c;
    private ImageIcon icon, img;
    private JLabel imglb;
    private JTextArea ta, ta2;
    private JButton bu;
    private Font f;
    private Cursor cu;

    void icon() {

        icon = new ImageIcon(getClass().getResource("VowelCountericon.jpg"));
        this.setIconImage(icon.getImage());

    }

    void label() {
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.ORANGE);

        f = new Font("Arial", Font.BOLD, 18);
        cu = new Cursor(Cursor.HAND_CURSOR);

        bu = new JButton("Clear");
        bu.setBounds(330, 250, 90, 50);
        bu.setFont(f);
        bu.setCursor(cu);
        bu.setBackground(Color.RED);
        c.add(bu);

        img = new ImageIcon(getClass().getResource("VowelCounter.png"));
        imglb = new JLabel(img);
        imglb.setBounds(20, 0, img.getIconWidth(), img.getIconWidth());
        c.add(imglb);

        ta = new JTextArea();
        ta.setBounds(20, 250, 300, 150);
        ta.setBackground(Color.WHITE);
        ta.setFont(f);
        c.add(ta);

        ta2 = new JTextArea();
        ta2.setBounds(20, 430, 450, 200);
        ta2.setFont(f);
        c.add(ta2);

    }

    public static void main(String[] args) {

        Vowel_CounterDemo obj = new Vowel_CounterDemo();
        obj.setVisible(true);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        obj.setBounds(300, 20, 510, 700);
        obj.setTitle("Vowel Counter");
        obj.icon();
        obj.label();

    }
}

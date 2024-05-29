import javax.swing.*;
import java.awt.event.*;

public class Balanceador2 extends JFrame implements ActionListener {

    private JTextField textfield1, textfield2, textfield3, textfield4, textfield5, textfield6, textfield7, textfield8,
            textfield9, textfield10;
    private JLabel label1, label2, label3, label4, label5, label6, label7, label8, label9, label10, label11;
    private JButton boton1;

    public Balanceador2() {
        setLayout(null);
        label1 = new JLabel("Nombre: ");
        label1.setBounds(5, 10, 200, 30);
        add(label1);

        label2 = new JLabel("Apellido: ");
        label2.setBounds(5, 40, 200, 30);
        add(label2);

        label3 = new JLabel("Nombre de Usuario: ");
        label3.setBounds(5, 70, 200, 30);
        add(label3);

        label4 = new JLabel("Mail: ");
        label4.setBounds(5, 100, 200, 30);
        add(label4);

        label5 = new JLabel("Estado Fisico: ");
        label5.setBounds(5, 130, 200, 30);
        add(label5);

        label6 = new JLabel("Velocidad: ");
        label6.setBounds(5, 160, 200, 30);
        add(label6);

        label7 = new JLabel("Manejo de Pelota: ");
        label7.setBounds(5, 190, 200, 30);
        add(label7);

        label8 = new JLabel("Defensa: ");
        label8.setBounds(5, 220, 200, 30);
        add(label8);

        label9 = new JLabel("Goles: ");
        label9.setBounds(5, 250, 200, 30);
        add(label9);

        label10 = new JLabel("Arquero: ");
        label10.setBounds(5, 280, 200, 30);
        add(label10);

        label11 = new JLabel("Puntos Totales: ");
        label11.setBounds(220, 225, 200, 30);
        add(label11);

        textfield1 = new JTextField();
        textfield1.setBounds(122, 10, 170, 20);
        add(textfield1);

        textfield2 = new JTextField();
        textfield2.setBounds(122, 40, 170, 20);
        add(textfield2);

        textfield3 = new JTextField();
        textfield3.setBounds(122, 70, 170, 20);
        add(textfield3);

        textfield4 = new JTextField();
        textfield4.setBounds(122, 100, 170, 20);
        add(textfield4);

        textfield5 = new JTextField();
        textfield5.setBounds(122, 130, 20, 20);
        add(textfield5);

        textfield6 = new JTextField();
        textfield6.setBounds(122, 160, 20, 20);
        add(textfield6);

        textfield7 = new JTextField();
        textfield7.setBounds(122, 190, 20, 20);
        add(textfield7);

        textfield8 = new JTextField();
        textfield8.setBounds(122, 220, 20, 20);
        add(textfield8);

        textfield9 = new JTextField();
        textfield9.setBounds(122, 250, 20, 20);
        add(textfield9);

        textfield10 = new JTextField();
        textfield10.setBounds(122, 280, 20, 20);
        add(textfield10);

        boton1 = new JButton("CALCULAR");
        boton1.setBounds(220, 200, 200, 30);
        add(boton1);
        boton1.addActionListener(this);

    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == boton1) {

            String name = "";
            String lastname = "";
            String username = "";
            String mail = "";

            int estadofisico = 0;
            int velocidad = 0;
            int manejodepelota = 0;
            int goles = 0;
            int defensa = 0;
            int arquero = 0;
            int sumatotal = 0;

            estadofisico = Integer.parseInt(textfield5.getText());
            velocidad = Integer.parseInt(textfield6.getText());
            manejodepelota = Integer.parseInt(textfield7.getText());
            defensa = Integer.parseInt(textfield8.getText());
            goles = Integer.parseInt(textfield9.getText());
            arquero = Integer.parseInt(textfield10.getText());

            int skill[][] = new int[7][3];

            skill[0][0] = 0;
            skill[1][0] = estadofisico * 50 * 10 / 100;
            skill[2][0] = velocidad * 10 * 10 / 100;
            skill[3][0] = manejodepelota * 40 * 10 / 100;
            skill[4][0] = goles * 30 * 10 / 100;
            skill[5][0] = defensa * 40 * 10 / 100;
            skill[6][0] = arquero * 30 * 10 / 100;

            sumatotal = skill[1][0] + skill[2][0] + skill[3][0] + skill[4][0] + skill[5][0] + skill[6][0];

            label11.setText("Puntos Totales:  " + sumatotal);

        }
    }

    public static void main(String args[]) {

        Balanceador2 formulario1 = new Balanceador2();
        formulario1.setBounds(0, 0, 600, 400);
        formulario1.setVisible(true);
        formulario1.setResizable(false);
        formulario1.setLocationRelativeTo(null);

    }
}

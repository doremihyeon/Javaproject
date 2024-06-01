package STEP_10.H1;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class H1_GUI_1 {
    public static void main(String[] args) {
        class btnListener implements ActionListener {
            JTextField txt_1, txt_2;
            
            btnListener(JTextField txt_1, JTextField txt_2){
                this.txt_1 = txt_1;
                this.txt_2 = txt_2;
            }
            public void actionPerformed(ActionEvent e) {
                if (e.getActionCommand().equals("=")) {
                    Integer n1, n2, n3;
                    Character c1, c2, c3;

                    c1 = txt_1.getText().charAt(0);
                    c2 = txt_1.getText().charAt(1);
                    c3 = txt_1.getText().charAt(2);
                    n1 = Integer.parseInt(c1.toString());
                    n2 = Integer.parseInt(c3.toString());

                    if (c2 == '+') {
                        n3 = n1 + n2;
                        txt_2.setText(n3.toString());
                    } else {
                        n3 = n1 - n2;
                        txt_2.setText(n3.toString());
                    }

                } else {
                    txt_1.setText(txt_1.getText()+e.getActionCommand());
                }
            }
        }
        JFrame frame = new JFrame("GUI_1");        

        JPanel panel = new JPanel();
        panel.setBackground(Color.BLUE);
        panel.setPreferredSize(new Dimension(400, 400));

        JTextField txt_1 = new JTextField();
        txt_1.setBounds(80, 250, 250, 35);

        JTextField txt_2 = new JTextField();
        txt_2.setBounds(80, 300, 250,35);

        JButton btn_1 = new JButton("1");
        btn_1.setBounds(80, 90, 50, 40);

        JButton btn_2 = new JButton("2");
        btn_2.setBounds(180, 90, 50, 40);
        
        JButton btn_3 = new JButton("3");
        btn_3.setBounds(280, 90, 50, 40);

        JButton btn_m = new JButton("-");
        btn_m.setBounds(180, 180, 50, 40);
        
        JButton btn_p = new JButton("+");
        btn_p.setBounds(80, 180, 50, 40);
        
        JButton btn_e = new JButton("=");
        btn_e.setBounds(280, 180, 50, 40);
    
        btn_1.addActionListener(new btnListener(txt_1, txt_2));
        btn_2.addActionListener(new btnListener(txt_1, txt_2));
        btn_3.addActionListener(new btnListener(txt_1, txt_2));
        btn_m.addActionListener(new btnListener(txt_1, txt_2));
        btn_p.addActionListener(new btnListener(txt_1, txt_2));
        btn_e.addActionListener(new btnListener(txt_1, txt_2));

        panel.setLayout(null);
        panel.add(btn_1);
        panel.add(btn_2);
        panel.add(btn_3);
        panel.add(btn_m);
        panel.add(btn_p);
        panel.add(btn_e);
        panel.add(txt_1);
        panel.add(txt_2);

        frame.getContentPane().add(panel);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
}
package STEP_10.W2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class STEP_10_GUI_2 {
    public static void main(String[] args) {
        class clickListener implements ActionListener {
            JTextField txt;
            int nc = 0;

            clickListener(JTextField txt) {
                this.txt = txt;
            }

            public void actionPerformed(ActionEvent e) {
                txt.setText("Count : " + ++nc);
            }
        }
        class endListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        }
        JFrame frame = new JFrame("GUI_10_2");

        JPanel panel = new JPanel();
        panel.setBackground(Color.gray);
        panel.setPreferredSize(new Dimension(400, 400));

        JTextField txt = new JTextField("Click count : " + 0);
        txt.setBounds(100, 100, 200, 30);
        
        JButton btn_click = new JButton("Click");
        btn_click.setBounds(150, 200, 80, 30);
        clickListener atl_click = new clickListener(txt);
        btn_click.addActionListener(atl_click);

        JButton btn_end = new JButton("End");
        btn_end.setBounds(150, 300, 80, 30);
        btn_end.addActionListener(new endListener());

        panel.setLayout(null);
        panel.add(txt);
        panel.add(btn_click);
        panel.add(btn_end);

        frame.getContentPane().add(panel);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        System.out.println("Console thread is going out!!!");
    }
}

package STEP_10.W3;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class STEP_10_GUI_3 {
    public static void main(String[] args) {
        class btnListener implements ActionListener {
            JTextField txt;
            int nc1 = 0, nc2 = 0;

            btnListener(JTextField txt) {
                this.txt = txt;
            }

            public void actionPerformed(ActionEvent e) {
                if (e.getActionCommand().equals("Yes"))
                    txt.setText("Yes Count :" + ++nc1);
                else
                    txt.setText("No Count :" + ++nc2);
            }
        }
        JFrame frame = new JFrame("GUI_10_3");

        JPanel panel = new JPanel();
        panel.setBackground(Color.gray);
        panel.setPreferredSize(new Dimension(400, 400));

        JTextField txt = new JTextField("Click count : " + 0);
        txt.setBounds(100, 100, 200, 30);

        JButton btn_yes = new JButton("Yes");
        btn_yes.setBounds(150, 150, 80, 30);

        JButton btn_no = new JButton("No");
        btn_no.setBounds(150, 200, 80, 30);

        JButton btn_end = new JButton("End");
        btn_end.setBounds(150, 350, 80, 30);

        btnListener lsnr_yn = new btnListener(txt);
        btn_yes.addActionListener(lsnr_yn);
        btn_no.addActionListener(lsnr_yn);

        btn_end.addActionListener(new ActionListener() {
            int i = 0;
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        
        panel.setLayout(null);
        panel.add(txt);
        panel.add(btn_yes);
        panel.add(btn_no);
        panel.add(btn_end);

        frame.getContentPane().add(panel);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        System.out.println("Console thread is going out !!!");
        }
}

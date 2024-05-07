import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class STEP_10_GUI_7 {
    STEP_10_GUI_7() throws InterruptedException {
        // 상수 정의
        final int Up = 0, Dn = 1, Rt = 2, Lt = 3;

        // 시작 위치
        int cx = 200 - 50, cy = 200 - 50;

        // 프레임 생성
        JFrame frame = new JFrame("GUI_10_7");
        JPanel panel = new JPanel();

        // 패널 설정
        panel.setBackground(Color.white);
        panel.setPreferredSize(new Dimension(400, 400));

        // 종료 버튼
        JButton btn_end = new JButton("End");
        btn_end.setBounds(165, 360, 70, 30);
        btn_end.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        // 이미지 로드 및 레이블 생성
        ImageIcon img = new ImageIcon("./Ball.jpg");
        JLabel lbl_ball = new JLabel(img);
        lbl_ball.setBounds(cx, cy, 50, 50);

        // 레이아웃 설정 및 컴포넌트 추가
        panel.setLayout(null);
        panel.add(btn_end);
        panel.add(lbl_ball);

        // 프레임에 패널 추가
        frame.getContentPane().add(panel);

        // 프레임 설정
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        // 무한 루프를 통한 공의 이동
        while (true) {
            int ewsn, disp;

            // 이동 방향과 거리 랜덤 설정
            ewsn = (int) (Math.random() * 1000) % 4;
            disp = (int) (Math.random() * 1000) % 30;

            // 공의 위치 변경
            switch (ewsn) {
                case Up:
                    cy -= disp;
                    if (cy < 0) cy = 0;
                    break;
                case Dn:
                    cy += disp;
                    if (360 - 50 < cy) cy = 360 - 50;
                    break;
                case Lt:
                    cx -= disp;
                    if (cx < 0) cx = 0;
                    break;
                case Rt:
                    cx += disp;
                    if (400 - 50 < cx) cx = 400 - 50;
                    break;
            }

            // 레이블 위치 갱신 및 잠시 대기
            lbl_ball.setLocation(cx, cy);
            Thread.sleep(100);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        // STEP_10_GUI_7 객체 생성
        STEP_10_GUI_7 main_obj = new STEP_10_GUI_7();
        System.out.println("Console thread is going out !!!");
    }
}
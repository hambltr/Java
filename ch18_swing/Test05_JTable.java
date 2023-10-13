package ch18_swing;
import java.awt.*;
import javax.swing.*;

public class Test05_JTable extends JFrame {

    // 변수
    JTable table;

    // 생성자
    public Test05_JTable() {
        String cols[] = { "이름", "나이", "이메일" }; // 열 제목
        Object data[][] = {
            { "AAA", "16", "AAA@na.com" },
            { "BBB", "15", "BBB@na.com" },
            { "CCC", "14", "CCC@na.com" },
            { "DDD", "13", "DDD@na.com" },
            { "EEE", "19", "EEE@na.com" },
            { "FFF", "18", "FFF@na.com" },
            { "GGG", "17", "GGG@na.com" },
            { "HHH", "16", "HHH@na.com" },
            { "III", "15", "III@na.com" },
            { "JJJ", "12", "JJJ@na.com" }
        };

        table = new JTable(data, cols);
        JScrollPane jScrollPane = new JScrollPane(table);
        // JScrollPane = table 내용이 많을 때 스크롤바 표시하기 위함

        getContentPane().add(jScrollPane); // 컴포넌트 추가하기 JFrame에

        setSize(300, 300);
        setVisible(true);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }//cons-end

    public static void main(String[] args) {
        new Test05_JTable();
    }//main-end
}//class-end

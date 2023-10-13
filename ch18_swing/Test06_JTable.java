package ch18_swing;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;

public class Test06_JTable extends JFrame implements ActionListener, MouseListener {

    // 변수
    JPanel panel;
    JLabel laName, laAge, laAddr;
    JTextField tfName, tfAge, tfAddr;
    String cols[] = {"이름", "나이", "주소"};
    DefaultTableModel model;
    JTable table;
    JScrollPane scrollPane;
    JButton bu;
    int selectedRow = -1;

    // 생성자
    public Test06_JTable() {
        panel = new JPanel();
        panel.setBackground(Color.cyan);

        laName = new JLabel("이름", JLabel.RIGHT);
        laAge = new JLabel("나이", JLabel.RIGHT);
        laAddr = new JLabel("주소", JLabel.RIGHT);

        tfName = new JTextField();
        tfAge = new JTextField();
        tfAddr = new JTextField();

        panel.setLayout(new GridLayout(3, 2));
        panel.add(laName);
        panel.add(tfName);
        panel.add(laAge);
        panel.add(tfAge);
        panel.add(laAddr);
        panel.add(tfAddr);

        bu = new JButton("행삭제");
        bu.addActionListener(this);
        tfName.addActionListener(this);
        tfAge.addActionListener(this);
        tfAddr.addActionListener(this);

        model = new DefaultTableModel(cols, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        table = new JTable(model);
        scrollPane = new JScrollPane(table);

        table.addMouseListener(this);

        getContentPane().add("North", panel);
        getContentPane().add("Center", scrollPane);
        getContentPane().add("South", bu);

        setSize(500, 500);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void mousePressed(MouseEvent me) {
        selectedRow = table.getSelectedRow();
    }

    @Override
    public void mouseReleased(MouseEvent me) {
    }

    @Override
    public void mouseClicked(MouseEvent me) {
    }

    @Override
    public void mouseEntered(MouseEvent me) {
    }

    @Override
    public void mouseExited(MouseEvent me) {
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == bu) {
            if (selectedRow >= 0) {
                model.removeRow(selectedRow);
                selectedRow = -1;
            } else {
                JOptionPane.showMessageDialog(this, "삭제할 행을 선택하세요.");
            }
        } else if (e.getSource() == tfName) {
            String name = tfName.getText().trim();
            if (name.equals("")) {
                JOptionPane.showMessageDialog(this, "이름을 입력하세요.");
                return;
            }
            tfAge.requestFocus();
        } else if (e.getSource() == tfAge) {
            String age = tfAge.getText().trim();
            if (age.equals("")) {
                JOptionPane.showMessageDialog(this, "나이를 입력하세요.");
                return;
            }
            tfAddr.requestFocus();
        } else if (e.getSource() == tfAddr) {
            String addr = tfAddr.getText().trim();
            if (addr.equals("")) {
                JOptionPane.showMessageDialog(this, "주소를 입력하세요.");
                return;
            }
            Object[] rowData = {tfName.getText(), tfAge.getText(), tfAddr.getText()};
            model.addRow(rowData);
            tfName.setText("");
            tfAge.setText("");
            tfAddr.setText("");
            tfName.requestFocus();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Test06_JTable();
            }
        });
    }
}

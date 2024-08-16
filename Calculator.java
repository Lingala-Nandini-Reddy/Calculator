import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Calculator extends JFrame implements ActionListener {
    int v1, v2, result;
    JTextField t1;
    JButton b[] = new JButton[10];
    JButton add, sub, mul, div, clear, mod, EQU;
    char OP;
    public Calculator() {
        Color k = new Color(120, 89, 90);
        getContentPane().setBackground(k);
        t1 = new JTextField(10);
        GridLayout gl = new GridLayout(4, 5);
        setLayout(gl);
        for (int i = 0; i < 10; i++) {
            b[i] = new JButton("" + i);
        }
        add = new JButton("add");
        sub = new JButton("sub");
        mul = new JButton("mul");
        div = new JButton("div");
        mod = new JButton("mod");
        clear = new JButton("clear");
        EQU = new JButton("EQU");
        t1.addActionListener(this);
        add(t1);
        for (int i = 0; i < 10; i++) {
            add(b[i]);
        }
        add(add);
        add(sub);
        add(mul);
        add(div);
        add(mod);
        add(clear);
        add(EQU);
        for (int i = 0; i < 10; i++) {
            b[i].addActionListener(this);
        }
        add.addActionListener(this);
        sub.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);
        mod.addActionListener(this);
        clear.addActionListener(this);
        EQU.addActionListener(this);
        setTitle("Calculator");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center the frame
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae) {
        String str = ae.getActionCommand();
        char ch = str.charAt(0);
        if (Character.isDigit(ch))
            t1.setText(t1.getText() + str);
        else if (str.equals("add")) {
            v1 = Integer.parseInt(t1.getText());
            OP = '+';
            t1.setText("");
        } else if (str.equals("sub")) {
            v1 = Integer.parseInt(t1.getText());
            OP = '-';
            t1.setText("");
        } else if (str.equals("mul")) {
            v1 = Integer.parseInt(t1.getText());
            OP = '*';
            t1.setText("");
        } else if (str.equals("div")) {
            v1 = Integer.parseInt(t1.getText());
            OP = '/';
            t1.setText("");
        } else if (str.equals("mod")) {
            v1 = Integer.parseInt(t1.getText());
            OP = '%';
            t1.setText("");
        }
        if (str.equals("EQU")) {
            v2 = Integer.parseInt(t1.getText());
            if (OP == '+')
                result = v1 + v2;
            else if (OP == '-')
                result = v1 - v2;
            else if (OP == '*')
                result = v1 * v2;
            else if (OP == '/')
                result = v1 / v2;
            else if (OP == '%')
                result = v1 % v2;
            t1.setText("" + result);
        }
        if (str.equals("clear")) {
            t1.setText("");
        }}
    public static void main(String[] args) {
        new Calculator();
    }}

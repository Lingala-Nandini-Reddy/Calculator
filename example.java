import javax.swing.*;
import java.awt.*;
public class example{
    JFrame frame;
    public example(){
        CreateGUI();
    }
    public void CreateGUI(){
        frame=new JFrame("Example");
        frame.setSize(300,300);
        frame.setLayout(new BorderLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel label=new JLabel("hello world");
        frame.add(label,BorderLayout.CENTER);
        JPanel panel=new JPanel();
        panel.setLayout(new BorderLayout());
        panel.setSize(new Dimension(50,20));
        JButton button=new JButton("click");
        button.setBounds(new Rectangle(50,5));
        button.setPreferredSize(new Dimension(50,5));
        panel.add(button,BorderLayout.WEST);
        JLabel label2=new JLabel("IN Panel");
        panel.add(label2, BorderLayout.CENTER);
        frame.add(panel,BorderLayout.EAST);
        frame.setVisible(true);
    }
    public static void main(String[] args){
        new example();
    }
}
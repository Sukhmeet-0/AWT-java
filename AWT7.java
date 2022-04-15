import java.awt.*;
public class AWT7 extends Frame {
    public AWT7(){
        Button b1,b2;
        setSize(600,300);
        setVisible(true);
        setLayout(new FlowLayout());
        b1 =new Button("Login");
        b2 =new Button();
        b2.setLabel("Log Out");
        add(b1);
        add(b2);

        b1.setPreferredSize(new Dimension(200,50));
        b2.setPreferredSize(new Dimension(200,50));
        b1.setBackground(Color.ORANGE);
        b1.setForeground(Color.RED);
        b1.setEnabled(false);
        // b1.setVisible(false);
        // b1.show(false);
    }
    public static void main(String[] args) {
        AWT7 j=new AWT7();
    
    }
}

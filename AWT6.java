import java.awt.*;
public class AWT6 extends Frame{
    public static void main(String[] args){
        System.out.println("Hello");
        Frame f=new Frame();
        new AWT6();
    }
    public AWT6(){
        setVisible(true);
        setSize(600,300);
        setLayout(new FlowLayout());

        TextField tf=new TextField("Java");
        add(tf);
        // tf.setText("jaaavaaa");
        tf.setEditable(false);
        // System.out.println(tf.isEditable());
        System.out.println(tf.getText());

    }
}
import java.awt.*;
import java.awt.event.*;
public class AWT29 extends Frame{

    AWT29(){
        setVisible(true);
        setSize(300,500);
        setLayout(new FlowLayout());

        TextField text=new TextField(20);
        add(text);

        text.addKeyListener(new KeyListener(){
            @Override
            public void keyPressed(KeyEvent e){
                System.out.println("Key Pressed -> "+e.getKeyChar()+ "-> "+e.getKeyCode());
                // System.out.println(e.getKeyChar());
                System.out.println(e.getKeyCode()==KeyEvent.VK_S);
            }
            @Override
            public void keyTyped(KeyEvent e) {
                // TODO Auto-generated method stub
                // System.out.println("Key Typed");
                // System.out.println(e.getKeyCode());
            }
            @Override
            public void keyReleased(KeyEvent e) {
                // TODO Auto-generated method stub
                // System.out.println("Key Released");
                // System.out.println(e.getID());
            }
        });

    }
    

    public static void main(String[] args) {
        AWT29 a=new AWT29();       
    }
}

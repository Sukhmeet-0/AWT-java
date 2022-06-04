import java.awt.*;
import java.awt.event.*;

public class AWT17 extends Frame {
    public AWT17() {
        setVisible(true);
        setSize(400, 300);
    }

    public static void main(String[] args) {
        AWT17 a = new AWT17();
        a.addWindowListener(new MyWindowListener());
    }
}

class MyWindowListener implements WindowListener {
    @Override
    public void windowActivated(WindowEvent e) {
        System.out.println("WIndow is activated");
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        System.out.println("Window is deactivated");
    }

    @Override
    public void windowOpened(WindowEvent e) {
        System.out.println("Window opened");
    }

    @Override
    public void windowIconified(WindowEvent e) {
        System.out.println("Window Iconified");
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        System.out.println("Window deiconified");
    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.out.println("Window closing");
        e.getWindow().dispose();
    }

    @Override
    public void windowClosed(WindowEvent e) {
        System.out.println("Window closed");
        // a.dispose();
        // System.out.println(e.getWindow());
        e.getWindow().dispose();
    }
}

// import java.awt.*;
// import java.awt.event.*;

// public class AWT18 extends Frame {
//     Checkbox c1,c2,c3;
//     Label msg;
//     Button ok;
//     public static void main(String[] args) {
//         AWT18 a = new AWT18();
//         a.addWindowListener(new MyWindowListener());
//     }
//     private void init(){
//         c1=new Checkbox("JAVA");
//         c2=new Checkbox("C++");
//         c3=new Checkbox("PYTHON");
//         ok=new Button("OK");
//         msg=new Label("Select any course");
//         setActionOnButton();
//     }
//     private void setActionOnButton(){
//         ok.addActionListener(new ActionListener(){
//             public void actionPerformed(ActionEvent e){
//                 System.out.println("OK Button Clicked!!");
//                 boolean b=c1.getState();
//                 System.out.println(c1.getLabel()+" -->"+b);
//                 System.out.println(c2.getLabel()+" -->"+b);
//                 System.out.println(c3.getLabel()+" -->"+b);
//             }
//         });
//     }
//     public AWT18() {
//         setVisible(true);
//         setSize(400, 300);
//         init();
//         setLayout(new GridLayout(5,1,10,10));
//         add(msg);
//         add(c1);
//         add(c2);
//         add(c3);
//         add(ok);

//     }

// }

// class MyWindowListener implements WindowListener {
//     @Override
//     public void windowActivated(WindowEvent e) {
//         System.out.println("WIndow is activated");
//     }

//     @Override
//     public void windowDeactivated(WindowEvent e) {
//         System.out.println("Window is deactivated");
//     }

//     @Override
//     public void windowOpened(WindowEvent e) {
//         System.out.println("Window opened");
//     }

//     @Override
//     public void windowIconified(WindowEvent e) {
//         System.out.println("Window Iconified");
//     }

//     @Override
//     public void windowDeiconified(WindowEvent e) {
//         System.out.println("Window deiconified");
//     }

//     @Override
//     public void windowClosing(WindowEvent e) {
//         System.out.println("Window closing");
//         e.getWindow().dispose();
//     }

//     @Override
//     public void windowClosed(WindowEvent e) {
//         System.out.println("Window closed");
//         // a.dispose();
//         // System.out.println(e.getWindow());
//         e.getWindow().dispose();
//     }
// }

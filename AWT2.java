import java.awt.*;
public class AWT2 extends Frame {
    // public AWT2(String name){
    //     super(name);
    // }
    public static void main(String[] args) {
        System.out.println("Start");
        // AWT2 a=new AWT2("My Frame");
        AWT2 a=new AWT2();
        System.out.println(a);
        a.setTitle("My First Frame");
        a.setSize(300,300);
        a.setVisible(true);
        System.out.println("End");
         
    }
}

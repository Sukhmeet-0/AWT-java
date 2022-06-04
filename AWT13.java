import java.awt.*;
public class AWT13 extends Frame {
    private Panel east,west,north,south,center;
    public AWT13(){
        setVisible(true);
        setSize(400,300);
        setTitle("AWT13");

        east=new Panel();
        west=new Panel();
        north=new Panel();
        south=new Panel();
        center=new Panel();

        east.setPreferredSize(new Dimension(50,50));
        west.setPreferredSize(new Dimension(50,50));
        north.setPreferredSize(new Dimension(50,50));
        south.setPreferredSize(new Dimension(50,50));
        center.setPreferredSize(new Dimension(50,50));



        setLayout(new BorderLayout());
        east.setBackground(Color.BLUE);
        west.setBackground(Color.green);
        north.setBackground(Color.ORANGE);
        south.setBackground(Color.RED);
        center.setBackground(Color.PINK);
        add(east,BorderLayout.EAST);
        add(west,BorderLayout.WEST);
        add(north,BorderLayout.NORTH);
        add(south,BorderLayout.SOUTH);
        add(center,BorderLayout.CENTER);
    }
    public static void main(String[] args) {
        Frame f=new Frame();
        AWT13 a=new AWT13();
    }
}

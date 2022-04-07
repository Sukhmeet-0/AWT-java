import java.awt.*;
class G{
    public static void main(String[] args) {
        MyFrame frame=new MyFrame();
    }
}
class MyFrame extends Frame{
    private TextField t1=new TextField("yesss");
    private TextField t2=new TextField("yesss");
    private TextField t3=new TextField("yesss");
    MyFrame(){
        this.setSize(900,500);
        setVisible(true);
        setLocation(100,50);
        // FlowLayout flow=new FlowLayout();
        FlowLayout flow=new FlowLayout(FlowLayout.LEFT,100,100);
        this.setLayout(flow);
        add(t1);
        add(t2);
        add(t3);
    }
}
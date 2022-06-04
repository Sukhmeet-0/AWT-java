import java.awt.*;
import java.awt.event.*;

public class AWT21 extends Frame {
    Checkbox c1,c2,c3;
    Label msg;
    Button ok;
    CheckboxGroup cg;

    public static void main(String[] args) {
        AWT21 a = new AWT21();
        a.addWindowListener(new MyWindowListener());
    }
    private void init(){
        cg=new CheckboxGroup();
        c1=new Checkbox("JAVA",cg,true);
        c2=new Checkbox("C++",cg,false);
        c3=new Checkbox("PYTHON",cg,false);


        ok=new Button("OK");
        msg=new Label("Select any course");
        setActionOnButton();
    

        ItemListener il=new ItemListener(){
            @Override
            public void itemStateChanged(ItemEvent e) {
                
                Checkbox i=(Checkbox)e.getSource();
                if(e.getItem()=="JAVA"){
                    if(i.getState()){

                        System.out.println("Java");
                    }
                }
                if(e.getItem()=="PYTHON"){
                    if(i.getState()){

                        System.out.println("Python");
                    }
                    
                }
                if(e.getItem()=="C++"){
                    if(i.getState()){

                        System.out.println("C++");
                    }
                }
                
                
            }};
            c1.addItemListener(il);
            c2.addItemListener(il);
            c3.addItemListener(il);
        }
    private void setActionOnButton(){
        ok.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.out.println("OK Button Clicked!!");
                System.out.println(cg.getSelectedCheckbox());
            }
        });
    }
    public AWT21() {
        setVisible(true);
        setSize(400, 300);
        init();
        setLayout(new GridLayout(5,1,10,10));
        add(msg);
        add(c1);
        add(c2);
        add(c3);
        add(ok);

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

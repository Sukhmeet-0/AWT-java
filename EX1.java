import java.awt.*;
import java.awt.event.*;
public class EX1 extends Frame{
    private TextField email,password;
    private Button b;
    private Label a,c,e,p;
    EX1(){
        setTitle("Assignment");
        setVisible(true);
        setSize(400,130);
        setLocation(500,500);
        setLayout(new GridLayout(3,2,10,10));

        // pack();

        email=new TextField();
        password=new TextField();
        a=new Label("Enter Email :");
        c=new Label("Enter Password :");
        b=new Button("<-- Login -->");
        e=new Label("Your Email is : ");
        p=new Label("Your Password is : ");

        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ev){
                Dialog d=new Dialog(EX1.this,"Credentials");
                Label s=new Label("Login Successfull !!");
                d.setVisible(true);
                d.setSize(300,130);
                // d.setLocation(600,700);
                d.setLayout(new GridLayout(3,1,10,10));
                Label ee=new Label("Your Email is : "+email.getText());
                Label pp=new Label("Your Password is : "+password.getText());
                d.add(ee);
                d.add(pp);
                d.add(s);
                
            }
        });
        
        
        add(a);
        add(email);
        add(c);
        add(password);
        add(b);



    }
    public static void main(String[] args) {
        EX1 e=new EX1();
    }
}

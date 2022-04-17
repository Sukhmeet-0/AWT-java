import java.awt.*;
import java.awt.event.*;

public class AWT12 extends Frame  {
    Button b;
    TextField email, pass;
    Label emailLabel, passwordLabel;

    public AWT12() {
        setSize(400, 200);
        setVisible(true);
        setLayout(new FlowLayout());
        b=new Button("Login In");
        email =new TextField(20);
        pass =new TextField(20);

        emailLabel=new Label("Enter Email");
        passwordLabel=new Label("Enter Password");
        add(emailLabel);
        add(email);
        add(passwordLabel);
        add(pass);
        add(b);
    }

    public static void main(String[] args) {
        AWT12 a = new AWT12();

    }
}

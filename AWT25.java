import java.awt.*;
import java.awt.event.*;
public class AWT25 extends Frame{
    private MenuBar mb;
    private Menu file;
    private Menu edit;
    private Menu view;
    private Menu search;
    private MenuItem open,save,saveAll,close,closeAll;
    AWT25(){
        setVisible(true);
        setSize(400,300);
        setLocation(400,300);
        setLayout(new FlowLayout());

        mb=new MenuBar();
        file=new Menu("File");
        edit=new Menu("Edit");
        view =new Menu("View");
        search=new Menu("Search");
        
        setMenuBar(mb);
        
        mb.add(file);
        mb.add(edit);
        mb.add(view);
        mb.add(search);

        open=new MenuItem("Open",new MenuShortcut(KeyEvent.VK_O));
        save=new MenuItem("Save");
        saveAll=new MenuItem("Save All");
        close=new MenuItem("Close");
        closeAll=new MenuItem("Close All");

        file.add(open);
        file.add(save);
        file.add(saveAll);
        file.add(close);
        file.add(closeAll);

        open.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.out.println(e.getSource());
                System.out.println("Opening files...");
            }
        });

       

    }
    public static void main(String[] args) {
        AWT25 a=new AWT25();
    }
}

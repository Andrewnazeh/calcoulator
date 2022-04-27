import javax.swing.*;

public class Frame extends JFrame  {
    public Frame() {
        this.add(new Panal());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("calcoulator");
        this.setSize(290, 470);
        this.setLocation(40, 30);
        this.setVisible(true);
        this.setResizable(false);
        this.setDefaultLookAndFeelDecorated(true);
        ImageIcon img = new ImageIcon("./calc.jpg");
        this.setIconImage(img.getImage());

//////////////////////////////////////////////////////////////

    }
}

//imports
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class jframe extends JFrame implements ActionListener {

    //making these global so that the action listener can access these objects
    JButton button;
    JFrame frame;

    jframe() {

        //three radio buttons
        JRadioButton Mercedes = new JRadioButton("Mercedes");
        JRadioButton Swift = new JRadioButton("Swift");
        JRadioButton Ford = new JRadioButton("Ford");

        //there configs
        Mercedes.setFocusable(false);
        Mercedes.setFont(new Font("MyFont",Font.BOLD,25));
        Mercedes.addActionListener(x -> System.out.println("You Want A Mercedes"));
        Swift.setFocusable(false);
        Swift.setFont(new Font("MyFont",Font.BOLD,25));
        Swift.addActionListener(x -> System.out.println("You Want A Swift"));
        Ford.setFocusable(false);
        Ford.setFont(new Font("MyFont",Font.BOLD,25));
        Ford.addActionListener(x -> System.out.println("You Want A Ford"));

        //button group so that the user cannot select every button at once
        ButtonGroup buttonGroup = new ButtonGroup();

        buttonGroup.add(Mercedes);
        buttonGroup.add(Swift);
        buttonGroup.add(Ford);

        //Leave button to close out of the JFrame
        button = new JButton("LEAVE");
        button.setFont(new Font("Font",Font.BOLD,15));
        button.addActionListener(this);
        button.setFocusable(false);

        //JFrame
        frame = new JFrame();
        frame.setLayout(new FlowLayout());

        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.add(button);
        frame.add(Mercedes);
        frame.add(Swift);
        frame.add(Ford);
        frame.pack();
        frame.setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==button) {
            frame.dispose();


        }

    }
}

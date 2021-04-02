package R6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Painel extends JFrame {

    JFrame frame;
    
    JButton button;
    JLabel oldADS,verticalFOV,aspectRatio;
    JTextField old,vert,aspec;

    public Painel() throws HeadlessException {

        frame =new JFrame();
        frame.setLayout(new GridLayout(4,2));
        
        oldADS = new JLabel("Old ADS");
        verticalFOV = new JLabel("vertical FOV");
        aspectRatio = new JLabel("aspect Ratio");
        
        old = new JTextField();
        vert = new JTextField();
        aspec = new JTextField();
        button = new JButton("Confirmar");
        
        frame.add(oldADS);
        frame.add(old);
        
        frame.add(verticalFOV);
        frame.add(vert);
        
        frame.add(aspectRatio);
        frame.add(aspec);
        
        frame.add(button);
        
        button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			double OldADS =(Double.parseDouble(old.getText()));
			double VerticalFOV =(Double.parseDouble(vert.getText()));
			double AspectRatio = (Double.parseDouble(aspec.getText()));
			JOptionPane.showMessageDialog(null, new Execute().executar(VerticalFOV,AspectRatio,OldADS));
            frame.dispose();
			}
		});
        
        frame.setVisible(true);
        frame.setSize(300,150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Painel();
    }
}

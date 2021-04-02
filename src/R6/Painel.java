package R6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Painel{

    public static void main(String[] args) {
        double OldADS =50;
        double VerticalFOV =20;
        double AspectRatio = (4/3);
        new Execute().executar(VerticalFOV,AspectRatio,OldADS);
    }
}

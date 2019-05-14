import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

public class  AnActionListener implements ActionListener {
    public void actionPerformed(ActionEvent actionEvent) {
        System.out.println("Apertou o botao.");
        Principal pri = new Principal();
        pri.main();
    }
}

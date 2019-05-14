import sun.swing.ImageIconUIResource;

import java.awt.*;
import javax.swing.*;

public class DoctoraLabel {
    private int n;
    DoctoraLabel(int n){
        this.n = n;
    }

    private ImageIcon scaleImage(ImageIcon notscaled, int w, int h){
        Image scaleim = notscaled.getImage().getScaledInstance(w,h,Image.SCALE_DEFAULT);
        ImageIcon sc = new ImageIcon(scaleim);
        return sc;
    }

    public JLabel getLabelDoctora1(){
        ImageIcon im = new ImageIcon("/home/beatriz/IdeaProjects/Trabalho1/IterfaceGrafica/imagens/doctor/doctora/doctora3.jpg");
        ImageIcon scaleim = this.scaleImage(im, 200,300);
        JLabel label = new JLabel(scaleim, JLabel.RIGHT);
        return label;
    }


}


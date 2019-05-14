package funView.src;
import sun.swing.ImageIconUIResource;

import java.awt.*;
import javax.swing.*;

public class FunViewLabel {

    private ImageIcon scaleImage(ImageIcon notscaled, int w, int h){
        Image scaleim = notscaled.getImage().getScaledInstance(w,h,Image.SCALE_DEFAULT);
        ImageIcon sc = new ImageIcon(scaleim);
        return sc;
    }

    public JLabel getFunViewLabel(){
        ImageIcon im = new ImageIcon("//home/beatriz/IdeaProjects/Trabalho1/src/funView/imagens/FunView.gif");
        ImageIcon scaleim = this.scaleImage(im, 200,200);
        JLabel label = new JLabel(scaleim,JLabel.LEFT);

        return label;
    }


}
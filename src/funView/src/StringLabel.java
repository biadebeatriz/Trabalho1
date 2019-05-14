package funView.src;
import java.awt.*;
import javax.swing.*;

public class StringLabel {
    String fala;

    public StringLabel(String fala){
        this.fala = fala;
    }

    private ImageIcon scaleImage(ImageIcon notscaled, int w, int h){
        Image scaleim = notscaled.getImage().getScaledInstance(w,h,Image.SCALE_DEFAULT);
        ImageIcon sc = new ImageIcon(scaleim);
        return sc;
    }

    JLabel getStringLabel(){
        ImageIcon im = new ImageIcon("/home/beatriz/IdeaProjects/Trabalho1/src/funView/imagens/doctoricon.png");
        ImageIcon icon = this.scaleImage(im , 40,40);
        JLabel label = new JLabel(this.fala, icon,JLabel.LEFT);

        return label;
    }

}

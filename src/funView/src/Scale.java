package funView.src;

import javax.swing.*;
import java.awt.*;

public class Scale {



    public ImageIcon scaleImage(ImageIcon notscaled, int w, int h){
        Image scaleim = notscaled.getImage().getScaledInstance(w,h,Image.SCALE_DEFAULT);
        ImageIcon sc = new ImageIcon(scaleim);
        return sc;
    }
}

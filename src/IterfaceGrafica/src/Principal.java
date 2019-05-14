package IterfaceGrafica.src;
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

public class Principal {

    private static void FramePrincipal() {
        //Create and set up the window.
        JFrame frame = new JFrame("Unhealh Zombie");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //FunView


        //Doctor
        DoctoraLabel Doctora = new DoctoraLabel(1);
        JLabel LDoctora = Doctora.getLabelDoctora1();

        //Zombie
        ZombieLabel Zombie = new ZombieLabel(1);
        JLabel LZombie = Zombie.getLabelZombie();

        //FunView
        FunViewLabel FunView = new FunViewLabel();
        JLabel LFunView  = FunView.getFunViewLabel();

        //Create the menu bar.  Make it have a green background.
        JMenuBar greenMenuBar = new JMenuBar();
        //greenMenuBar.setOpaque(true);
       // greenMenuBar.setBackground(new Color(154, 165, 127));
       // greenMenuBar.setPreferredSize(new Dimension(300, 300));


        ImageIcon imzombie = new ImageIcon("/home/beatriz/IdeaProjects/Trabalho1/src/IterfaceGrafica/imagens/zombie.png");
        Scale sc = new Scale();
        ImageIcon imzom= sc.scaleImage(imzombie, 30, 30);

        JMenu menu = new JMenu("FunView");
        menu.setIcon(imzom);
        greenMenuBar.add(menu);

        //String Label
        StringLabel sl = new StringLabel("Oque vc tem Zombie?");



        JPanel panel = new JPanel(new BorderLayout());
        panel.setBackground(Color.WHITE);
        panel.setSize(500,500);

        //panel.add(LFunView,BorderLayout.BEFORE_FIRST_LINE);
        panel.add(LDoctora,BorderLayout.EAST);
        panel.add(LZombie,BorderLayout.WEST);
        panel.add(sl.getStringLabel(),BorderLayout.PAGE_END);

        //frame.add(LFunView);
        frame.setLocation(200,150);
        frame.add(panel);
        //frame.add(panelzombie);
        frame.setJMenuBar(greenMenuBar);


        frame.setSize(600,500);
        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }

    public static void main() {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                FramePrincipal();
            }
        });
    }

}

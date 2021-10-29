/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaswingcomponent;

import java.awt.AlphaComposite;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.io.File;
import java.io.Serializable;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author esmer
 */
public class JPanelBackground extends JPanel implements Serializable {

    // Establecemos la ruta de nuestra imagen.
    private ImageBackground imgSource;

    // Creamos el componente sin parámetros.
    public JPanelBackground() {

    }

    // Getters and Setters
    public ImageBackground getImgSource() {
        return imgSource;
    }

    public void setImgSource(ImageBackground imgSource) {
        this.imgSource = imgSource;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        if(imgSource != null){
         
            if (imgSource.getImgSource() != null && imgSource.getImgSource().exists()) {

            ImageIcon imageIcon = new ImageIcon(imgSource.getImgSource().getAbsolutePath());
            Graphics2D g2d = (Graphics2D)g;
            g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, imgSource.getOpacity()));
            g.drawImage(imageIcon.getImage(), 0, 0, null);
            g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 1));

        }
            
        }
    }

}

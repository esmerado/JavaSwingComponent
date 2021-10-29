/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaswingcomponent;

import java.io.File;
import java.io.Serializable;

/**
 *
 * @author esmer
 */
public class ImageBackground implements Serializable{

    private File imgSource;

    public ImageBackground(File imgSource, Float opacity) {
        this.imgSource = imgSource;
        this.opacity = opacity;
    }

    public File getImgSource() {
        return imgSource;
    }

    public void setImgSource(File imgSource) {
        this.imgSource = imgSource;
    }

    public Float getOpacity() {
        return opacity;
    }

    public void setOpacity(Float opacity) {
        this.opacity = opacity;
    }
    private Float opacity;

}

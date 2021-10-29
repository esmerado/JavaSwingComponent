/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaswingcomponent;

import java.awt.Component;
import java.beans.PropertyEditorSupport;

/**
 *
 * @author esmer
 */
public class ImageBackgroundPropertyEditorSupport extends PropertyEditorSupport{

    private ImageBackgroundPanel imageBackgroundPanel = new ImageBackgroundPanel();
    
    @Override
    public boolean supportsCustomEditor() {
        return true; 
    }

    @Override
    public Component getCustomEditor() {
        return imageBackgroundPanel;
    }

    @Override
    public String getJavaInitializationString() {
        ImageBackground ib = imageBackgroundPanel.getSelectedValue();
        String rute = ib.getImgSource().getAbsolutePath();
        rute = rute.replace('\\','/');
        return "new javaswingcomponent.ImageBackground(" + "new java.io.File(\"" + rute + "\")," + ib.getOpacity() + "f)";
    }

    @Override
    public Object getValue() {
        return imageBackgroundPanel.getSelectedValue();
    }
    
}

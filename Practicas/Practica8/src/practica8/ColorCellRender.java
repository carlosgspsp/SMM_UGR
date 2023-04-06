/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica8;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

/**
 *
 * @author carlo
 */
public class ColorCellRender implements ListCellRenderer<Color> {

    @Override
    public Component getListCellRendererComponent(JList<? extends Color> list, Color value, int index, boolean isSelected, boolean cellHasFocus) {
        /*
        JButton b = new JButton();
        b.setBackground(value);
        b.setPreferredSize(new Dimension(25,25));
        return b;
        */
        PanelColor p = new PanelColor(value);
        return p;
    }


    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica4;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import static java.lang.Math.abs;

/**
 *
 * @author carlo
 */
public class Lienzo extends javax.swing.JPanel {

    /**
     * Creates new form Lienzo
     */
    private Point p_ini = new Point(-20,-20);
    private Point p_fin = new Point(1,1);
    
    private Color color = Color.black;
    private int herramienta = -1;
    private boolean relleno = false;
    public Lienzo() {
        initComponents();
    }

    public void setColor(Color c)
    {
        color = c;
    }
    
    public void setHerramienta(int h)
    {
        herramienta = h;
    }
    
    public void setPuntoInicial(Point punto)
    {
        p_ini = punto;
    }
    
    public void setPuntoFinal(Point punto)
    {
        p_fin = punto;
    }
    
    public boolean isRelleno() {
        return relleno;
    }

    public void setRelleno(boolean relleno) {
        this.relleno = relleno;
    }
    
    public void paint (Graphics g){
        
        super.paint(g);
        g.setColor(color);
        
       switch(herramienta)
       {
           case 0:
             g.fillOval(p_ini.x-5,p_ini.y-5,10,10);   
              break;
           case 1:
             g.drawLine(p_ini.x,p_ini.y,p_fin.x,p_fin.y);
               break;
           case 2:
               if (relleno)
               {
                 if (p_fin.x-p_ini.x >= 0 && p_fin.y-p_ini.y >= 0)  
                    g.fillRect(p_ini.x,p_ini.y,abs(p_fin.x-p_ini.x),abs(p_fin.y-p_ini.y));  
                 else if (p_fin.x-p_ini.x < 0 && p_fin.y-p_ini.y >= 0)
                    g.fillRect(p_ini.x+(p_fin.x-p_ini.x),p_ini.y,abs(p_fin.x-p_ini.x),abs(p_fin.y-p_ini.y));
                 else if (p_fin.x-p_ini.x >= 0 && p_fin.y-p_ini.y < 0)
                    g.fillRect(p_ini.x,p_ini.y+(p_fin.y-p_ini.y),abs(p_fin.x-p_ini.x),abs(p_fin.y-p_ini.y));
                 else if (p_fin.x-p_ini.x < 0 && p_fin.y-p_ini.y < 0) 
                    g.fillRect(p_ini.x+(p_fin.x-p_ini.x),p_ini.y+(p_fin.y-p_ini.y),abs(p_fin.x-p_ini.x),abs(p_fin.y-p_ini.y));  
               }
               else
               {
                 if (p_fin.x-p_ini.x >= 0 && p_fin.y-p_ini.y >= 0)  
                    g.drawRect(p_ini.x,p_ini.y,abs(p_fin.x-p_ini.x),abs(p_fin.y-p_ini.y));  
                 else if (p_fin.x-p_ini.x < 0 && p_fin.y-p_ini.y >= 0)
                    g.drawRect(p_ini.x+(p_fin.x-p_ini.x),p_ini.y,abs(p_fin.x-p_ini.x),abs(p_fin.y-p_ini.y));
                 else if (p_fin.x-p_ini.x >= 0 && p_fin.y-p_ini.y < 0)
                    g.drawRect(p_ini.x,p_ini.y+(p_fin.y-p_ini.y),abs(p_fin.x-p_ini.x),abs(p_fin.y-p_ini.y));
                 else if (p_fin.x-p_ini.x < 0 && p_fin.y-p_ini.y < 0) 
                    g.drawRect(p_ini.x+(p_fin.x-p_ini.x),p_ini.y+(p_fin.y-p_ini.y),abs(p_fin.x-p_ini.x),abs(p_fin.y-p_ini.y));
                 
               }
               break;
           case 3:
               if (relleno)
               {
                 if (p_fin.x-p_ini.x >= 0 && p_fin.y-p_ini.y >= 0)  
                    g.fillOval(p_ini.x,p_ini.y,abs(p_fin.x-p_ini.x),abs(p_fin.y-p_ini.y));  
                 else if (p_fin.x-p_ini.x < 0 && p_fin.y-p_ini.y >= 0)
                    g.fillOval(p_ini.x+(p_fin.x-p_ini.x),p_ini.y,abs(p_fin.x-p_ini.x),abs(p_fin.y-p_ini.y));
                 else if (p_fin.x-p_ini.x >= 0 && p_fin.y-p_ini.y < 0)
                    g.fillOval(p_ini.x,p_ini.y+(p_fin.y-p_ini.y),abs(p_fin.x-p_ini.x),abs(p_fin.y-p_ini.y));
                 else if (p_fin.x-p_ini.x < 0 && p_fin.y-p_ini.y < 0) 
                    g.fillOval(p_ini.x+(p_fin.x-p_ini.x),p_ini.y+(p_fin.y-p_ini.y),abs(p_fin.x-p_ini.x),abs(p_fin.y-p_ini.y));  
               }
               else
               {
                 if (p_fin.x-p_ini.x >= 0 && p_fin.y-p_ini.y >= 0)  
                    g.drawOval(p_ini.x,p_ini.y,abs(p_fin.x-p_ini.x),abs(p_fin.y-p_ini.y));  
                 else if (p_fin.x-p_ini.x < 0 && p_fin.y-p_ini.y >= 0)
                    g.drawOval(p_ini.x+(p_fin.x-p_ini.x),p_ini.y,abs(p_fin.x-p_ini.x),abs(p_fin.y-p_ini.y));
                 else if (p_fin.x-p_ini.x >= 0 && p_fin.y-p_ini.y < 0)
                    g.drawOval(p_ini.x,p_ini.y+(p_fin.y-p_ini.y),abs(p_fin.x-p_ini.x),abs(p_fin.y-p_ini.y));
                 else if (p_fin.x-p_ini.x < 0 && p_fin.y-p_ini.y < 0) 
                    g.drawOval(p_ini.x+(p_fin.x-p_ini.x),p_ini.y+(p_fin.y-p_ini.y),abs(p_fin.x-p_ini.x),abs(p_fin.y-p_ini.y));  
               }
               break;
       }
       
    }

   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setBackground(java.awt.Color.white);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sm.cgs.graficos;

import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.RenderingHints;

/**
 *
 * @author carlo
 */
public class Elipse2D extends java.awt.geom.Ellipse2D.Float implements SMShape{
    private Color color_borde, color_relleno;
    private int trazo, discontinuidad, union, tipo_relleno;
    boolean antialiasing,dithering,color_rendering;
    Point p1, p2;
    RenderingHints render = null;
    float grado_transparencia;

    public Elipse2D(Point punto, Color colorb , Color colorr, int trazo, int discontinuidad,int union, int tipo_relleno, boolean alisar,boolean dithering, boolean color_rendering, float grado_transparencia)
    {
       p1 = punto;
       color_borde = colorb;
       color_relleno = colorr;
       this.trazo = trazo ;
       this.discontinuidad = discontinuidad ;
       this.union = union;
       this.tipo_relleno = tipo_relleno;
       antialiasing= alisar;
       this.grado_transparencia = grado_transparencia;
   }
    
    @Override
    public Color getColor_borde() {
        return color_borde;
    }

    @Override
    public void setColor_borde(Color color_borde) {
        this.color_borde = color_borde;
    }

    @Override
    public Color getColor_relleno() {
        return color_relleno;
    }

    @Override
    public void setColor_relleno(Color color_relleno) {
        this.color_relleno = color_relleno;
    }


    @Override
    public int getTrazo() {
        return trazo;
    }

    @Override
    public void setTrazo(int grosor) {
        this.trazo = grosor;
    }

    @Override
    public int getDiscontinuidad() {
        return discontinuidad;
    }

    @Override
    public void setDiscontinuidad(int discontinuidad) {
        this.discontinuidad = discontinuidad;
    }

    @Override
    public int getUnion() {
        return union;
    }

    @Override
    public void setUnion(int union) {
        this.union = union;
    }

    @Override
    public int getTipo_relleno() {
        return tipo_relleno;
    }

    @Override
    public void setTipo_relleno(int tipo_relleno) {
        this.tipo_relleno = tipo_relleno;
    }

    @Override
    public float getGrado_transparencia() {
        return grado_transparencia;
    }
    @Override
    public void setGrado_transparencia(float grado_transparencia) {
        this.grado_transparencia = grado_transparencia;
    }

    public boolean isAntialiasing() {
        return antialiasing;
    }

    public void setAntialiasing(boolean antialiasing) {
        this.antialiasing = antialiasing;
    }

   
    
    
   @Override
   public void draw (Graphics2D g2d) {
      
      
     g2d.setStroke(new java.awt.BasicStroke(trazo, discontinuidad, union));  
     
     if (antialiasing)
     {
         render = new RenderingHints(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
     }else
      {
         render = new RenderingHints(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_OFF);
              } 
    if (render !=null) 
    g2d.setRenderingHints(render);
     
      g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, grado_transparencia));
      
       switch (tipo_relleno) {
           case 0:
               g2d.setColor(color_borde);
               g2d.draw(this);
               break;
           case 1:
               g2d.setColor(color_relleno);
               g2d.fill(this);
               g2d.setColor(color_borde);
               g2d.draw(this);
               break;
           case 2:
                g2d.setPaint(new GradientPaint((float)this.getX(),(float)this.getY() , color_borde, (float)(this.getX()+this.getWidth()), (float)(this.getY()), color_relleno));
               g2d.fill(this);
               break;
           case 3:
               g2d.setPaint(new GradientPaint((float)this.getX(),(float)this.getY() , color_borde, (float)(this.getX()), (float)(this.getY()+this.getHeight()), color_relleno));
               g2d.fill(this);
               break;
           case 4:
               g2d.setPaint(new GradientPaint((float)this.getX(),(float)this.getY() , color_borde, (float)(this.getX()+this.getWidth()), (float)(this.getY()+this.getHeight()), color_relleno));
               g2d.fill(this);
               break;
      
       
 
   }
    
 
    
    
    
   } 
}

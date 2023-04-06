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
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

/**
 *
 * @author carlo
 */
public class Linea2D extends java.awt.geom.Line2D.Float implements SMShape {

    //float x1, x2, y1, y2;
    private Color color_borde, color_relleno;
    private int trazo, discontinuidad, union, tipo_relleno;
    boolean antialiasing,dithering,color_rendering;
    Point p1, p2;
    RenderingHints render = null;
    float grado_transparencia;
            
    
    public Linea2D (Point punto, Point punto2, Color colorb , Color colorr, int trazo, int discontinuidad,int union, int tipo_relleno, boolean alisar,boolean dithering, boolean color_rendering, float grado_transparencia){
        
       p1 = punto;
       p2 = punto2;
       setLine(p1.getX(), p1.getY(), p2.getX(), p2.getY());
       color_borde = colorb;
       color_relleno = colorr;
       this.trazo = trazo ;
       this.discontinuidad = discontinuidad ;
       this.union = union;
       this.tipo_relleno = tipo_relleno;
       antialiasing= alisar;
       this.grado_transparencia = grado_transparencia;
    }
    
    public boolean isNear(Point2D p)
    {
        return this.ptLineDist(p) <= 2.0;
    }
    
    @Override
    public boolean contains(Point2D p)
    {
        return isNear(p);
    }
    
    public void setLocation(Point2D pos){
        double dx = pos.getX() - this.getX1();
        double dy = pos.getY() - this.getY1();
        Point2D newp2 = new Point2D.Double(this.getX2() + dx, this.getY2() + dy);
        this.setLine(pos, newp2);
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
         /*
           case 2:
                g2d.setPaint(new GradientPaint((float)this.getX1(),(float)this.getY1() , color_borde, (float)(this.getX2()), (float)(this.getY1()), color_relleno));
               g2d.fill(this);
               break;
           case 3:
               g2d.setPaint(new GradientPaint((float)this.getX1(),(float)this.getY1() , color_borde, (float)(this.getX1()), (float)(this.getY2()), color_relleno));
               g2d.fill(this);
               break;
           case 4:
               g2d.setPaint(new GradientPaint((float)this.getX1(),(float)this.getY1() , color_borde, (float)(this.getX2()), (float)(this.getY2()), color_relleno));
               g2d.fill(this);
               break;
      
       */
 
   }
    
 
    
    
    
   }    
    

    
    
}

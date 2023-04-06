/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sm.cgs.graficos;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.Stroke;

/**
 *
 * @author carlo
 */
public interface SMShape extends Shape {

    public Color getColor_borde();

    public void setColor_borde(Color color_borde);

    public Color getColor_relleno();

    public void setColor_relleno(Color color_relleno);

    public int getTrazo();

    public void setTrazo(int grosor);

    public int getDiscontinuidad();

    public void setDiscontinuidad(int discontinuidad);

    public int getUnion();

    public void setUnion(int union);

    public int getTipo_relleno();

    public void setTipo_relleno(int tipo_relleno);

    public float getGrado_transparencia();

    public void setGrado_transparencia(float grado_transparencia);

    public void draw(Graphics2D g2d);

    public boolean isAntialiasing();

    public void setAntialiasing(boolean antialiasing);
}

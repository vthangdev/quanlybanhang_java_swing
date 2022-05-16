package Quanlytaikhoan.component;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;

/**
 *
 * @author Quốc Hùng
 */
public class Button extends JButton{

    public Button() {
        setColor(color.WHITE);
        colorOver= new Color(179,250,160);
        colorClick = new Color(152,184,144);
        boderColor = new Color(30,136,56);
        setContentAreaFilled(false);
        
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                setBackground(colorOver);
                over = true;
            }

            @Override
            public void mouseExited(MouseEvent e) {
                setBackground(color);
                over =false;
            }

            @Override
            public void mousePressed(MouseEvent e) {
                setBackground(colorClick);
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                if(over) {
                    setBackground(colorOver);
                } else {
                    setBackground(color);
                }
            }
            
            
        });
        
    }
    
    private Boolean over;

    public Boolean getOver() {
        return over;
    }

    public void setOver(Boolean over) {
        this.over = over;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
        setBackground(color);
    }

    public Color getColorOver() {
        return colorOver;
    }

    public void setColorOver(Color colorOver) {
        this.colorOver = colorOver;
    }

    public Color getColorClick() {
        return colorClick;
    }

    public void setColorClick(Color colorClick) {
        this.colorClick = colorClick;
    }

    public Color getBoderColor() {
        return boderColor;
    }

    public void setBoderColor(Color boderColor) {
        this.boderColor = boderColor;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    private Color color;
    private Color colorOver;
    private Color colorClick;
    private Color boderColor;
    private int radius = 0;

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(boderColor);
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), radius, radius);
        g2.setColor(getBackground());
        g2.fillRoundRect(2, 2, getWidth()-4, getHeight()-4, radius, radius);
        
        super.paintComponent(g); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}

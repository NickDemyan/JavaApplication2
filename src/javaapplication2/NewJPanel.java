package javaapplication2;

import java.awt.Graphics;
import javax.swing.JPanel;
import java.awt.Color;

public class NewJPanel extends JPanel {

    private int myX = 150;
    private int myY = 120;

    public int getMyX() {
        return myX;
    }

    public void setMyX(int x) {
        this.myX = x;
    }

    public int getMyY() {
        return myY;
    }

    public void setMyY(int y) {
        this.myY = y;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
       
        g.setColor(Color.red);    //// Рисование красного прямоугольника
        g.fillRect(myX-25, myY, 50, 25);
        g.setColor(Color.black);
        g.fillRect(myX+25, myY+25, 50, 25);
        g.setColor(Color.blue);
        g.fillOval(myX, myY, 50, 50); // Рисование круглой фигуры
    }
}


/*
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
}*/

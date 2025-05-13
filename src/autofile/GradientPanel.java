/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autofile;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GradientPaint;
import javax.swing.JPanel;

public class GradientPanel extends JPanel{
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); // Don't forget this!
        Graphics2D g2d = (Graphics2D) g;

        int width = getWidth();
        int height = getHeight();

        Color color1 = new Color(240, 240, 240);// upper
        Color color2 = new Color(82, 82, 156); // lower

        GradientPaint gp = new GradientPaint(0, 0, color1, 0, height, color2);
        g2d.setPaint(gp);
        g2d.fillRect(0, 0, width, height);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package  Tampilan;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;

import javax.swing.JPanel;



/**
 *
 * @author ASUS
 */
public class Gambar extends JPanel{
private Image image;
public Gambar (){

        image=new
            ImageIcon(getClass().getResource("/Tampilan/medic.jpg")).getImage();

    }
@Override
protected void paintComponent(Graphics grphcs)
{
    super.paintComponent(grphcs);
    Graphics2D graphic = (Graphics2D) grphcs.create();
    graphic.drawImage(image, 0, 0, getWidth(),getHeight(),null);
    graphic.dispose();
}

}



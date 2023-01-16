//Uso del drawLine para conectar las esquinas de un panel
import javax.swing.*;
import java.awt.Graphics;
import javax.swing.JPanel;

public class PanelDibujo extends JPanel {

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        int anchura = getWidth();//Anchura total
        int altura = getHeight();//Altura total

        //Dibujamos una linea de la esquina superior izquierda a la esquina inferior derecha
        //g.drawLine(0,0,anchura,altura);
        //Dibujamos una linea de la esquina inferior izquierda a la esquina superior derecha
        //g.drawLine(0,altura,anchura,0);
        g.drawLine(14*10,50*10,14*10,0*10);//Linea principal
        g.drawLine(14*10,50*10,30*10,45*10);
        g.drawLine(30*10,45*10,30*10,8*10);//Linea secundaria
        g.drawLine(30*10,8*10,14*10,0*10);
    }
}

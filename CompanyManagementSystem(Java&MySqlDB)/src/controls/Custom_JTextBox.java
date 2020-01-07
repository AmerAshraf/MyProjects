package controls;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JTextField;

public class Custom_JTextBox extends JTextField {
    
    public Custom_JTextBox(int size){
        super(size);
        setOpaque(false); // hidden
    }
    
    @Override
    protected void paintComponent(Graphics g){
        g.setColor(getBackground());
        g.fillRoundRect(0, 0, getWidth()-1 , getHeight()-1 , 20, 20);
        super.paintComponent(g);
    }
    
    @Override
    public void paintBorder (Graphics g){
        g.setColor(Color.blue);
        g.drawRoundRect(0, 0, getWidth()-1 , getHeight()-1 , 20, 20);
    }
}

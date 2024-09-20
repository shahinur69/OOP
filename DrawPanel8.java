import java.awt.Color;
import java.awt.Graphics;
import java.security.SecureRandom;
import javax.swing.JPanel;
public class DrawPanel8 extends JPanel{
    private SecureRandom randomNumbers = new SecureRandom();
    private MyLine[] lines;
    public DrawPanel8(){
        setBackground(Color.WHITE);
        lines = new MyLine[5 + randomNumbers.nextInt(5)];
        for(int i = 0; i < lines.length; i++){
            int x1 = randomNumbers.nextInt(300);
            int y1 = randomNumbers.nextInt(300);
            int x2 = randomNumbers.nextInt(300);
            int y2 = randomNumbers.nextInt(300);
            Color color = new Color(randomNumbers.nextInt(256), randomNumbers.nextInt(256), randomNumbers.nextInt(256));
            lines[i] = new MyLine(x1, y1, x2, y2, color);
        }
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        for(MyLine line : lines)
           line.draw(g);
    }
}

import javax.swing.JFrame;

public class TestDraw8 {
    public static void main(String[] args) {
        DrawPanel8 panel = new DrawPanel8();
        JFrame application = new JFrame();
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(panel);
        application.setSize(300, 300);
        application.setVisible(true);
    }
}

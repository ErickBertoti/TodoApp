import javax.swing.JFrame;

public class AppFrame extends JFrame {
    public static final String TITULO = "TODO App";

    public AppFrame() {
        super(TITULO);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void mostrar() {
        pack();
        setVisible(true);
    }
}

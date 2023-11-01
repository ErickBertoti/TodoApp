import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.CardLayout;

public class AppFrame extends JFrame {
    public static final String TITULO = "TODO App";

    private CardLayout layout;
    private JPanel cardPanel;

    private TarefaListPanel tarefaListPanel;

    public AppFrame() {
        super(TITULO);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        layout = new CardLayout();

        cardPanel = new JPanel();
        cardPanel.setLayout(layout);
        add(cardPanel);

        criarCards();
    }

    public void mostrar() {
        pack();
        setVisible(true);
    }

    private void criarCards() {

        this.tarefaListPanel = new TarefaListPanel();
        cardPanel.add(this.tarefaListPanel, TarefaListPanel.class.getName());
    }
}

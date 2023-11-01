import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.util.concurrent.Flow;
import javax.swing.JButton;

public class TarefaListPanel extends JPanel {
    private JButton novaTarefaBtn;
    private JButton editarTarefaBtn;
    private JButton apagarTarefaBtn;


    public TarefaListPanel() {
        setLayout(new BorderLayout(10, 10));

        criarComandosPanel();
        criarTabelaPanel();
    }

    private void criarComandosPanel() {
        JPanel panel = new JPanel();
        FlowLayout layout = (FlowLayout) panel.getLayout();
        layout.setAlignment(FlowLayout.RIGHT);

        novaTarefaBtn = new JButton("Criar");
        panel.add(novaTarefaBtn);

        editarTarefaBtn = new JButton("Editar");
        panel.add(editarTarefaBtn);

        apagarTarefaBtn = new JButton("Excluir");
        panel.add(apagarTarefaBtn);

        add(panel, BorderLayout.NORTH);
    }

    private void criarTabelaPanel() {

    }
    
}

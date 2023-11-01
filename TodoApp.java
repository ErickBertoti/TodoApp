import javax.swing.SwingUtilities;

public class TodoApp {
    public static void main(String[] args) {
        System.out.println("Ok");
        SwingUtilities.invokeLater(new Runnable() {
            public void run(){
                criarMostrarTela();
            }
        });

    }

       public static void criarMostrarTela(){
            AppFrame frame = new AppFrame();
            frame.mostrar();
       

    }
}
package E98SerpienteByNacho;
import javax.swing.JFrame;

public class GameFrame extends JFrame{
    
    GameFrame(){ 

        this.add(new GamePanel());
        this.setTitle("Snake");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//para poder cerrar la ventana
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);   
    }
}
    

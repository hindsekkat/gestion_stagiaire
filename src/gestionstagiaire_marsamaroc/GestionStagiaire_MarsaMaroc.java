package gestionstagiaire_marsamaroc;
import gestionstagiaire_marsamaroc.Sessions;
public class GestionStagiaire_MarsaMaroc {

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Sessions sess =new Sessions();
                sess.setVisible(true);
            }
        });
    }
    
}

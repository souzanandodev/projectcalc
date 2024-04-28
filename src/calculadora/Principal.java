package calculadora;

import visao.jFrmTela;

public class Principal {
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jFrmTela().setVisible(true);
            }
        }); 
    }
}

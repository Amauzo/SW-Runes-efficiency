import java.awt.event.ActionEvent;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
/** version 0.01**/

public class SWRE {
    public static void  main(String[] args){
        //System.out.println("hello WORLD !");
        //Scanner uniquement à oublié impossible d'avoir les types de substat
        /**
        try ( Scanner scanner = new Scanner( System.in ) ) {
            System.out.print( "Please enter the main stats : " );
            int mainstat = scanner.nextInt();
            System.out.print( "Please enter the initial stats : " );
            int initstat = scanner.nextInt();
            System.out.print( "Please enter the first sub-stat : " );
            int ss1 = scanner.nextInt();
            System.out.print( "Please enter the first sub-stat : " );
            int ss2 = scanner.nextInt();
            System.out.print( "Please enter the first sub-stat : " );
            int ss3 = scanner.nextInt();
            System.out.print( "Please enter the first sub-stat : " );
            int ss4 = scanner.nextInt();
            int result = a + b;
            System.out.printf( "La somme de %d et de %d vaut %d\n", a, b, result );
        }**/
        JFrame frame = new JFrame("SW Runes Efficiency");
        JButton button = new JButton("Compute efficiency");
        button.setSize(100,100);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(button);
        frame.setSize(500,450);
        frame.setVisible(true);


        /**Ajouter une pop-up au lancement demandant les inforamtions essentiel :Type et valeurs des stats
         *
         *public void actionPerformed(ActionEvent e)
         *     {
         *         p.show();
         *     }
         button.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                String name = JOptionPane.showInputDialog(frame,
                        "What is your name?", null);

            }
        });**/
    }

}

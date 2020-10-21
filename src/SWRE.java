import javafx.util.StringConverter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/** version 0.01**/
//0.00 --> FAIL Scanner uniquement à oublié impossible d'avoir les types de substat
//0.01 --> FAIL Bouton à améliorer
public class SWRE {

    private static String TypeRunes;
    private static String[] types_runes ={
            "Endurance","Swift","Violence","Rage" //A COMPLETER
    };

    public static void  main(String[] args){
        JFrame frame = new JFrame("SW Runes Efficiency");
        JButton button = new JButton("Compute efficiency");
        JLabel typeRune = new JLabel("amauzo");
        button.setBounds(0,0,250,40);
        typeRune.setBounds(150,150,200,40);
        frame.add(button);
        frame.add(typeRune);
        frame.setSize(500,450);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        button.addActionListener(new java.awt.event.ActionListener() {
         @Override
            /**public void actionPerformed(java.awt.event.ActionEvent evt) {
                 JOptionPane.showMessageDialog(null, new JList(types_runes));
              TypeRunes = JOptionPane;
             String name = JOptionPane.showInputDialog(frame,
                         TypeRunes, null);
             }**/
            public void actionPerformed(ActionEvent evt) {
             //Calcul de l'efficiency
             // Exemple a refaire

             //String TRune;
             //TRune = JOptionPane.showInputDialog(null, "Types of runes : ","Rune Type Selector");
             //TRune = JOptionPane.showMessageDialog(null, new //Jlist(types_runes));
             //typeRune.setText(TRune);
            }
        });

    }

    /**Ajouter une pop-up au lancement demandant les inforamtions essentiel :Type et valeurs des stats
     *
     *public void actionPerformed(ActionEvent e)
     *     {
     *         p.show();
     *     }
     * });
     **/


}

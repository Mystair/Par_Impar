import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int num, comp;

        num = Integer.parseInt(JOptionPane.showInputDialog(null,"Informe o numero para análise:"));
        comp=(num%2);
        if(comp==0){
            JOptionPane.showMessageDialog(null,"O número informado é PAR");
        }else{
            JOptionPane.showMessageDialog(null, "O número informado é IMPAR");
        }
        System.exit(0);
    }
}
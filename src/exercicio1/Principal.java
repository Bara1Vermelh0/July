package exercicio1;


import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[]args){
        Exercicio ex = new Exercicio();
        
        ex.setA(Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de A")));
        ex.setB(Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de B")));
        ex.setC(Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de C")));
        
        System.out.println("O delta é: "+ ex.exercicio());
    }
}

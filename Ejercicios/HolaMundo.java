import javax.swing.JOptionPane;

public class HolaMundo {
    public static void main(String[] args) {
        int num1, num2, resultado;  
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite el primer numero: "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite el segundo numero: "));
        resultado = num1 + num2;
        JOptionPane.showMessageDialog(null, "El resultado es: "+ resultado);
    }
}
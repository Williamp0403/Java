import javax.swing.JOptionPane;

public class SumaDeNotas {
    public static void main(String[] args) {
        String opcion = "si"; 
        float nota1, nota2, nota3, resultado;
        do {            
        nota1 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la primera nota"));
        while (nota1 > 20) {
            JOptionPane.showMessageDialog(null, "Error! la mota no puede ser mayor que 20!");
            nota1 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la primera nota"));
        }
        nota2 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la segunda nota"));
        while (nota2 > 20) {
            JOptionPane.showMessageDialog(null, "Error! la mota no puede ser mayor que 20!");
            nota2 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la segunda nota"));
        }
        nota3 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la tercera nota"));
        while (nota3 > 20) {
            JOptionPane.showMessageDialog(null, "Error! la mota no puede ser mayor que 20!");   
            nota3 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la tercera nota"));       
        }
        resultado = (nota1 + nota2 + nota3) / 3;
        JOptionPane.showMessageDialog(null, "El promedio es: "+ resultado);
        opcion = JOptionPane.showInputDialog("Desea continua? si/no");
        switch (opcion) {
            case "no":
                JOptionPane.showMessageDialog(null, "Gracias por usar nuestro sistema");
                opcion = "no";
                break; 
            case "si":
                opcion = "si";
                break;                  
            default:
                JOptionPane.showMessageDialog(null, "Opcion no valida");
                break;
        }       
        } while(opcion != "no");
    }
}

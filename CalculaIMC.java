import javax.swing.JOptionPane;

public class CalculaIMC {
    public static void main(String[] args) {
        String pesoStr = JOptionPane.showInputDialog("Digite seu peso:");
        String alturaStr = JOptionPane.showInputDialog("Digite sua altura:");

        double peso = Double.parseDouble(pesoStr);
        double altura = Double.parseDouble(alturaStr);

        double imc = peso / (altura * altura);

        JOptionPane.showMessageDialog(null, "O seu IMC é: " + imc);
    }
}

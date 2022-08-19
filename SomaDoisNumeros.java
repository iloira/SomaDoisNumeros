import javax.swing.JOptionPane;

public class SomaDoisNumeros{
    static public void main(String nome []){
        // 1- Declaração de variáveis
        double primeiroValor;
        double segundoValor;
        double resultado;

        // 2- Entrada de dados
        // = é uma atribuição
        primeiroValor = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor"));
        segundoValor = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor"));

        // 3- Processamento
        resultado = primeiroValor + segundoValor;
        
        // 4- Saída
        JOptionPane.showMessageDialog(null, resultado);
    }
}
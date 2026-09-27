import java.util.Scanner;

public class EX1 {
    
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        
        System.out.println("Digite a sua altura: ");
        float hight = scanner.nextFloat();

        System.out.println("Digite o seu peso: ");
        float weight = scanner.nextFloat();

        float IMC = (weight / (hight * hight));

        if (IMC <= 18.5)
            System.out.println("Abaixo do peso");

        if ( IMC > 18.5 && IMC <= 24.9)
            System.out.println("Peso ideal");

        if (IMC > 24.9 && IMC <= 29.9)
            System.out.println("Levemente acima do peso");

        if (IMC > 29.9 && IMC <= 34.9)
            System.out.println("Obesidade Grau I");
        
        if (IMC > 34.9 && IMC <= 39.9)
            System.out.println("Obesidade grau II");

        if (IMC > 39.9)
            System.out.println("Obesidade Grau III");

        
        System.out.println(IMC);

        scanner.close();

    }
    
}
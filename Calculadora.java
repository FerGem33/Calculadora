import java.util.Scanner;

public class Calculadora{
    public static void main(String[]args){        
        float numero_a,numero_b;
        float resultado=0;
        char operador;
        Scanner t = new Scanner(System.in);
        
        System.out.println("numero_a: ");
        numero_a = t.nextFloat();
        System.out.println("operador: ");
        operador = t.next().charAt(0);
        System.out.println("numero_b: ");
        numero_b = t.nextFloat();
        
        if(operador == '+'){
            resultado = numero_a + numero_b;
        }
        else if(operador == '-'){
            resultado = numero_a - numero_b;
        }
        else if(operador == '*'){
            resultado = numero_a * numero_b;
        }
        else if(operador == '/'){
            resultado = numero_a / numero_b;
        }
        System.out.println(resultado);
    }
}

package desconto;

import java.util.Scanner;

public class Desconto {
    public static void main(String[] args) {
        double valor, valorFinal;
        
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Informe o valor do produto : ");
        valor = leia.nextDouble();
        
       //Se for maior que R$100 será 15% de desconto
       //Se for de R$50 a R$100 será de 10%
       //se for abaixo de 50 não tem desconto
        if (valor >=100) {
            valorFinal = valor - (valor * 0.15);
        }
        else if (valor >=50 && valor < 100){
            valorFinal = valor - (valor * 0.10);
        }    
        else {
            valorFinal = valor;
        }
        //Vai aparecer o valor final, já aplicado com o desconto
        System.out.println("Valor final :  "+valorFinal);
        
    }
}

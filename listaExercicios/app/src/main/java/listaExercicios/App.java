
package listaExercicios;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        /* EXERCICIO DE INTERVALO DE NUMEROS | IF/ELSE
        int numero;
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Preench um numero");
        numero = leitor.nextInt();
        
        if(numero >= 100 && numero <=200) {
            System.out.println("numero está dentro do intervalo");
        }else{
            System.out.println("numero esta fora do intervalo");
        }*/
        
        /* EXERCICIO WHILE
        Scanner leitor = new Scanner(System.in);
        
        char continuar = 'S'; 
        
        while(continuar == 'S' || continuar == 's'){
            System.out.println("digite um numero");
            int numero = leitor.nextInt();
            
            if(numero == 0){
                System.out.println("o numero é 0");
            }else{
                if(numero > 0){
                    System.out.println("o numero é maior que 0");
                }else{
                    System.out.println("o numero é menor do que 0");
                }
            }
            System.out.println("Deseja continuar? S para Sim ou N para não");
            continuar = leitor.next().charAt(0);
        }*/
        
        String nomeProduto;
        float precoCusto;
        float precoVenda;
        
        float totalCusto= 0.0f;
        float totalVenda= 0.0f;
        
        Scanner leitor = new Scanner(System.in);
        
        int inicio =0;
        for (; inicio < 10; inicio ++){
            
            System.out.println("digite o nome do produto");
            nomeProduto = leitor.nextLine();
            
            System.out.println("digite o preco de custo");
            precoCusto = leitor.nextFloat();
            
            System.out.println("digite o preco de venda");
            precoVenda = leitor.nextFloat();
            
            totalCusto = totalCusto + precoCusto;
            totalVenda = totalVenda + precoVenda;
            
            if(precoCusto == precoVenda){
                System.out.println("houve um empate entre os preços");
            }else{
                if(precoCusto > precoVenda){
                    System.out.println("PREJUIZO");
                }else{
                    System.out.println("LUCRO");
                }
            }
            System.out.println(nomeProduto + ", preco de custo = " + precoCusto+ ", preco de venda = " + precoVenda);
        }
        System.out.println("A media do preco de custo e de: " + (totalCusto / inicio));
        System.out.println("A media do preco de venda e de: " + (totalVenda / inicio));
    }
}

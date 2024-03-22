package javaapplication1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Ler os dados do carro alugado
        try (Scanner input = new Scanner(System.in)) {
            // Ler os dados do carro alugado
            System.out.print("Digite o modelo do carro: ");
            String modelo = input.nextLine();
            
            System.out.print("Digite o valor da diária: ");
            double valorDiaria = input.nextDouble();
            
            System.out.print("Digite a quantidade de dias de locação: ");
            int diasLocacao = input.nextInt();
            
            System.out.print("Digite a quantidade de Km percorridos: ");
            int kmPercorridos = input.nextInt();
            
            // Calcular o preço total a pagar
            double precoTotal = (valorDiaria * diasLocacao) + (kmPercorridos * 0.20);
            
            // Exibir o modelo do carro e o preço total a pagar
            System.out.println("Modelo do carro: " + modelo);
            System.out.println("Preço total a pagar: R$" + precoTotal);
            // pedi ajuda ao chatgpt pois não estava conseguindo entender muito bem, pedi para que me explicasse e tambem
            //entrei no site da netbeans para entender os codigos de forma mais eficiente, agora tenho uma nocao melhor 
            //mas não consigo entender totalmente este codigo se possivel poderia me explicar melhor e enviar um exemplo 
            //com explicacoes por favor?
        }
    }
}
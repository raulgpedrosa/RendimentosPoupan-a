/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package RendimentosPoupan├ža;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        
        float deposito = 0;
        float rendimento = 0;
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Valor depositado: R$ ");
        deposito = leitor.nextFloat();
        
        rendimento = (deposito * 0.07f) + deposito;
        System.out.println("Valor com rendimentos = R$ " + rendimento);
        
        
        
    }
}

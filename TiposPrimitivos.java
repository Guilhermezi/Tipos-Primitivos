/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tiposprimitivos;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class TiposPrimitivos {
    public static void main(String[] args){
        
           //Declaração de variáveis primitivas
           
           byte idade = 25; //Suporta até 2 números, Armazenar números pequenos (-128 a 127)
           short ano = 2025; // pode ter 5 casas ou mais, Armazena números um pouco maiore (-32.768 a 32.767)
           int populacaoCidade = 500000; // Recebe números inteiros, Tipos mais comum para números
           long populacaoMundial = 8000000000L; // Neccessário 'L' para valores longos
    
           float altura = 1.75f; //É usado para números decimais, É necessário colocar o 'f' no final para indicar float, já que ambos são iguais o 'f' é usado para indicar que é o float
           double peso = 75.5; // Esse é mais preciso que o float é maior
           
           char inicial = 'J'; // Armazana um único caractere
           boolean ativo = true; // verfica se é verdadeiro ou falso
           
           // Exibição de valores
           System.out.println("idade: " + idade);
           System.out.println("ano:" + ano);
           System.out.println("População da Cidade:" + populacaoCidade);
           System.out.println("População Mundial:" + populacaoMundial);
           System.out.println("Altura:" + altura + "m");
           System.out.println("Peso:" + peso + "Kg");
           System.out.println("Inicial do nome:" + inicial);
           System.out.println("Está ativo?" + ativo);
     
    }
}
package com.cursoProfessorIsidor.ExemploPilhas.application;

import com.cursoProfessorIsidor.ExemploPilhas.entities.Pilha;

import java.util.Scanner;

public class Conversor {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Informe um número decimal para transformar em binário: ");
        //int numero = Integer.parseInt(args[0]); // Primeiro elemento do meu vetor // Nesse caso aqui vai dar erro
        int numero = scan.nextInt();
        Pilha p = new Pilha();

        int resto;

        // Fase 1 = Empilhamento dos restos
        while (numero != 0) {
            resto = numero % 2; // Pegar o resto da divisão
            p.push(resto); // Armazena na pilha
            numero = numero / 2; // gero um novo número, resultado da divisao dele por 2
        }

        // Fase 2 = Exibição dos restos
        while(!p.isEmpty()){
            resto = p.pop(); // remove da pilha (Sempre o cara que está no topo)
            System.out.printf(" " + resto);
        }
        System.out.println();
        System.out.println("Fim do programa! ");

    }


}


// Conversor de decimal para binario

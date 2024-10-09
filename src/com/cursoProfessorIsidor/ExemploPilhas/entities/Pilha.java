package com.cursoProfessorIsidor.ExemploPilhas.entities;

public class Pilha {

    // atributos para criação da pilha
    private int valores[];
    private int topo;

    // Construtor
    public Pilha(){
        valores = new int[10];
        topo = -1; // Posição
    }

    // Onde vai armazenar um elemento inteiro,empilhar a pilha, o topo valia -1;
    public void push(int elemento){
        topo = topo + 1;
        valores[topo] = elemento;
    }
    // Verificar se ela está vazia
    public boolean isEmpty(){
        return (topo == -1);
    }
    // Verificar se ela está cheia ou não
    public boolean isFull() {
        return (topo == 9); // Aqui mostra tamanho -1
    }
    // Desimpilhar a pilha
    public int pop(){
        int elem = valores[topo]; // O elemeneto recebe quem está no topo
        topo--; // O topo desce uma posição
        return elem; // Retorna o elemento
    }
}

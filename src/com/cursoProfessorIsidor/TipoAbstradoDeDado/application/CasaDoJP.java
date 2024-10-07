package com.cursoProfessorIsidor.TipoAbstradoDeDado.application;

import com.cursoProfessorIsidor.TipoAbstradoDeDado.entities.Televisao;

public class CasaDoJP {
    public static void main(String[] args) {

        Televisao t1, t2;

        t1 = new Televisao();
        t2 = new Televisao();

        t1.defineMarca("Samsung da cozinha");
        t2.defineMarca("Samsung do quarto");

        t1.ligar();
        t2.ligar();

        t1.defineCanal(41);
        t1.defineVolume(25);

        t2.defineCanal(39);
        t2.defineCanal(40);
        t2.defineCanal(88);
        t2.defineCanal(13);
        t2.defineCanal(14);
        t2.defineVolume(1);

        t1.desligar();
        t2.desligar();


    }
}

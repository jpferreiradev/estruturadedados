package com.cursoProfessorIsidor.TipoAbstradoDeDado.application;

import com.cursoProfessorIsidor.TipoAbstradoDeDado.entities.Televisao;

public class ClasseQueUsaTv {
    public static void main(String[]args){

       Televisao t = new Televisao();
        t.defineMarca ("Samsung");
        t.ligar();
        t.defineVolume(10);
        t.defineCanal(4);
        t.aumentaVolume();
        t.desligar();
    }
}



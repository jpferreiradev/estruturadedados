package com.cursoProfessorIsidor.TipoAbstradoDeDado.entities;

public class Televisao {

    private String marca;
    private Boolean ligado;
    private int volume;
    private int canal;

    //public Televisao(){};

    public Televisao(){
        ligado = false;
    }

    public void ligar(){
        ligado = true;
        System.out.println("TV " + marca + " ligada");
    }
    public void desligar(){
        System.out.println("Desligando a TV " + marca);
        ligado = false;
    }

    public void defineMarca(String nomeMarca){
        marca = nomeMarca;
        System.out.println("TV - Marca definida " + marca);
    }
    public void defineVolume(int vol){
        if(ligado){
            volume = vol;
            System.out.println("TV "+ marca+ " volume difinido para:" + volume );
        } else{
            System.out.println("Por favor, ligue antes a TV " + marca);
        }
    }
    public void defineCanal(int canal){
        if(ligado){
            canal = canal;
            System.out.println("TV "+ marca+ " com canal definido para " + canal);
        } else{
            System.out.println("Por favor, antes ligue a tv " + marca);
        }
    }
    public void aumentaVolume(){
        volume++;
        System.out.println("TV " + marca + ": volume atual " + volume);
    }
    public void diminuirVolume(){
        volume--;
        System.out.println("TV " + marca + ": volume atual " + volume);

    }
}

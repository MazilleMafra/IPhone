package com.mfr.iphone.Funcionalidades.Telefone;


public class Telefone implements AparelhoTelefonico{

    
    
    @Override
    public void ligar(String numero){
        System.out.println("Ligando para " + numero);
    }
    @Override
    public void atender(){
        System.out.println("Atendendo a ligação...");
    }
    @Override
    public void desligar(){
        System.out.println("Desligando...");
    }
    @Override
    public void iniciarCorreioVoz(){
        System.out.println("Iniciando correi de voz...");
    }
}

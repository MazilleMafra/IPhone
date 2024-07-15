package com.mfr.iphone.Funcionalidades.SmartPhone;

import com.mfr.iphone.Funcionalidades.Musica.ReprodutorMusical;
import com.mfr.iphone.Funcionalidades.Navegador.NavegadorDeInternet;
import com.mfr.iphone.Funcionalidades.Telefone.AparelhoTelefonico;


public class SmartPhone implements NavegadorDeInternet, AparelhoTelefonico,ReprodutorMusical{
    //navegador
    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo a seguinte página pelo SmartPhone: "+ url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionado nova aba pelo SmartPhone...");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página pelo SmartPhone...");
    }
    //ligação
    @Override
    public void ligar(String numero) {
        System.out.println("Ligando pelo SmartPhone para o número: "+ numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo ligação pelo SmartPhone...");
    }

    @Override
    public void desligar() {
        System.out.println("Desligando ligação pelo SmartPhone...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz pelo SmartPhone...");
    }
    //música
    @Override
    public void tocar() {
        System.out.println("Tocando música pelo SmartPhone...");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando música pelo SmartPhone...");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando a seguinte música pelo SmartPhone: "+ musica);
    }
    
}

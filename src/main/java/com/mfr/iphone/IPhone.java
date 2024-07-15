package com.mfr.iphone;

import com.mfr.iphone.Funcionalidades.Musica.ReprodutorMusical;
import com.mfr.iphone.Funcionalidades.Navegador.Navegador;
import com.mfr.iphone.Funcionalidades.Navegador.NavegadorDeInternet;
import com.mfr.iphone.Funcionalidades.SmartPhone.SmartPhone;
import com.mfr.iphone.Funcionalidades.Telefone.AparelhoTelefonico;


public class IPhone {

    public static void main(String[] args) {
        SmartPhone iphone = new SmartPhone();
        
        //Navegador navegador = new Navegador();
        
        
        NavegadorDeInternet internet = iphone;
        
        ReprodutorMusical musica = iphone;
        
        AparelhoTelefonico ligacao = iphone;
        
        internet.adicionarNovaAba();
        internet.atualizarPagina();
        internet.exibirPagina("www.xvideos.com");
        //recomendo escutarem essa música
        musica.selecionarMusica("Arthur Verocai - Dedicada a ela");
        musica.tocar();
        musica.pausar();
        
        ligacao.atender();
        ligacao.desligar();
        ligacao.ligar("(84) 98337-1521");
        ligacao.iniciarCorreioVoz();
        
    }
}

 
package com.mfr.iphone.Funcionalidades.Navegador;


public class Navegador implements NavegadorDeInternet{

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo Página "+ url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba...");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando a página...");
    }
    
}

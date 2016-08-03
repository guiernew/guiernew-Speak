package speak.guiernew.com.github.speak.Controle;

import java.util.ArrayList;

import speak.guiernew.com.github.speak.Classes.*;

/**
 * Created by Guilherme on 27/07/2016.
 */
public class ControleListas {
    private ArrayList<Livro> listaLivros;
    private ArrayList<Licao> listaLicoes;

    private ControleListas(){

    }

    private void verificaListaLivros(){

    }

    private void verificaListaLicoes(){

    }


    public ArrayList<Livro> getListaLivros() {
        if(listaLivros == null){
            listaLivros = new ArrayList<Livro>();
            verificaListaLivros();
        }

        return listaLivros;
    }

    public ArrayList<Licao> getListaLicoes() {
        if(listaLicoes == null){
            listaLicoes = new ArrayList<Licao>();
            verificaListaLicoes();
        }

        return listaLicoes;
    }

    public void addListaLivros(Livro livro){
        if (listaLivros != null){
            listaLivros.add(livro);
        }
    }

    public void addListaLicoes(Licao licao){
        if (listaLicoes != null){
            listaLicoes.add(licao);
        }
    }
}

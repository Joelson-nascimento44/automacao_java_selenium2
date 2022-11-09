package br.com.mercadolivre.steps;

import br.com.mercadolivre.pages.HomePage;
import org.junit.Assert;
import org.junit.Test;

public class HomeSteps extends BaseSteps{

    //instâncias
    HomePage homePage = new HomePage();

    @Test
    public void pesquisarUmProdutoNoMercadoLivre(){
        homePage.setBuscarItemMercadoLivre("Tenis");
        homePage.setClicarBotaoPesquisa();

        homePage.setButaocokies();
        Assert.assertEquals("Tenis", homePage.getvalidarPage());
        homePage.setBuscarItemMercadoLivre("geladeira");
        homePage.setPesquisaitem();
        homePage.setBuscarItemMercadoLivre("smart tv 55");
        homePage.setPesquisaitem();
        homePage.setPesquisarCep();


    }



}

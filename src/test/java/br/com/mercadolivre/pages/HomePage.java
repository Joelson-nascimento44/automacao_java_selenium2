package br.com.mercadolivre.pages;

import org.openqa.selenium.By;

public class HomePage extends BasePage{

    private static final By pesquisaMercadoLivre = new By.ByCssSelector("[placeholder=\"Buscar produtos, " +
            "marcas e muito mais…\"]");
    private static final By clicarBotaoPesquisa = new By.ByCssSelector("[class=\"nav-search-btn\"]");
    private static final By pesquisarCep = new By.ByCssSelector("[class=\"nav-menu-cp-send\"]");
    private static final By butaocokies = new By.ByCssSelector("[data-testid=\"action:understood-button\"]");
    private static final By validarPage = new By.ByCssSelector("[class=\"ui-search-breadcrumb__title shops" +
            "-custom-primary-font\"]");
    private static final By pesquisaitem = new By.ByCssSelector("[placeholder=\"Buscar produtos, " +
            "marcas e muito mais…\"]");


    public void setBuscarItemMercadoLivre(String pesquisar){
        sendKeys(pesquisaMercadoLivre, pesquisar);}
    public void setClicarBotaoPesquisa(){click(clicarBotaoPesquisa);}
    public void setPesquisarCep(){click(pesquisarCep);}
    public void setButaocokies(){ click(butaocokies);}
    public String getvalidarPage(){
        return  lerText(validarPage);}
    public void setPesquisaitem(){ limparCampo(pesquisaitem);}





}



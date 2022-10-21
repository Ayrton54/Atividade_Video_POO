package com.mycompany.appvideo;

public class Usuario extends Pessoa{

    public Usuario(String login, String nome, String sexo, int idade) {
        super(nome, sexo, idade);
        this.login = login;
        this.totAssistido = 0;
    }

    
    
    private String login;
    private int totAssistido;

    public void viuMaisUm() {
        this.totAssistido++;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }

    @Override
    public String toString() {
        return "Usuario{"+super.toString() + "\nlogin=" + login + ", totAssistido=" + totAssistido +"\n" +'}';
    }
    
    

}

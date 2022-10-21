package com.mycompany.appvideo;

public class Visualizacao {

    private Usuario espectador;
    private Video filme;

    public Visualizacao(Usuario espectador, Video filme) {
        this.espectador = espectador;
        this.filme = filme;
        this.espectador.setTotAssistido(this.espectador.getTotAssistido()+1);
        this.filme.setViews(this.filme.getViews()+1);
    }

    @Override
    public String toString() {
        return "Visualizacao{" + "espectador=" + espectador + ", filme=" + filme + '}';
    }
    
    public void avaliar(){
        this.filme.setAvaliacao(5);
    }
    public void avaliar(int n){
        if (n <= 10 && n >= 0){
            this.filme.setAvaliacao(n);
        }else{
            this.filme.setAvaliacao(5);
        }
    }
    public void avaliar(double nota){
        if (nota <= 10 && nota >= 0){
            this.filme.setAvaliacao(nota);
        }else{
            this.filme.setAvaliacao(5);
        }
    }

    public Usuario getEspectador() {
        return espectador;
    }

    public void setEspectador(Usuario espectador) {
        this.espectador = espectador;
    }

    public Video getFilme() {
        return filme;
    }

    public void setFilme(Video filme) {
        this.filme = filme;
    }

}

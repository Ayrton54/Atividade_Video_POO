package com.mycompany.appvideo;

public class Video implements AcoesvVdeo {

    private String titulo;
    private int views, curtidas;
    private double avaliacao;
    private boolean repoduzindo;

    public Video(String titulo) {
        this.titulo = titulo;
        this.views = 0;
        this.curtidas = 0;
        this.avaliacao = 1;
        this.repoduzindo = false;
    }

    @Override
    public String toString() {
        return "Video{" + "titulo=" + titulo + ", avaliacao=" + avaliacao + ", views=" + views + ", curtidas=" + curtidas + "\nrepoduzindo=" + repoduzindo +"\n" + '}';
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(double avaliacao) {
        
        this.avaliacao = avaliacao;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public boolean isRepoduzindo() {
        return repoduzindo;
    }

    public void setRepoduzindo(boolean repoduzindo) {
        this.repoduzindo = repoduzindo;
    }

    @Override
    public void play() {
        this.repoduzindo = true;
    }

    @Override
    public void pause() {
        this.repoduzindo = false;
    }

    @Override
    public void like() {
        this.curtidas++;
    }

}

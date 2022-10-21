package com.mycompany.appvideo;

public class Appvideo {

    public static void main(String[] args) {
        
        Video v[] = new Video[2];
        v[0] = new Video("Apredendo Java");
        v[1] = new Video("Apredendo Python");
       /* v[0].play();
        v[1].setCurtidas(5);
        System.out.println(v[0].toString());
        System.out.println(v[1].toString()); */

        Usuario u[] = new Usuario[2];
        u[0] = new Usuario("@hotmail","juquinha","M",23);
        u[1]= new Usuario("@gmail.com","Julinha","F",5);
       /* u[0].setTotAssistido(5);
        u[0].gangarExp(10);
        u[0].viuMaisUm();
        System.out.println(u[0].toString());
        System.out.println(u[1].toString()); */
        
        Visualizacao vi[]=new Visualizacao [3];
        vi[0] = new Visualizacao(u[0],v[1]);
        vi[1] = new Visualizacao(u[1],v[0]);
        vi[2] = new Visualizacao(u[0],v[1]);
       // vi[0].avaliar();
        vi[2].avaliar(9.5);
        vi[0].avaliar(9.5);
        
        System.out.println(vi[2].toString());
        System.out.println("");
        System.out.println(vi[0].toString());
        System.out.println("");
        System.out.println(vi[1].toString());
    }
}

package com.b2t1.churchpalm.entities;

import android.graphics.drawable.Drawable;

public class Preaching {

    private String titulo;
    private String data;
    private int imagem;

    public Preaching(){

    }

    public Preaching(String titulo, String data, int imagem) {
        this.titulo = titulo;
        this.data = data;
        this.imagem = imagem;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getImagem() {
        return imagem;
    }

    public void setImagem(int imagem) {
        this.imagem = imagem;
    }
}

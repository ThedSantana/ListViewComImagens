package com.example.aulaunibratec.carrosapp;

import java.util.ArrayList;

/**
 * Created by felipe on 30/07/16.
 */
public class Carro {

    private String modelo;
    private int fabricante;
    private int ano;

    public Carro(String modelo, int ano, int fabricante) {
        this.modelo = modelo;
        this.ano = ano;
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getFabricante() {
        return fabricante;
    }

    public void setFabricante(int fabricante) {
        this.fabricante = fabricante;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}

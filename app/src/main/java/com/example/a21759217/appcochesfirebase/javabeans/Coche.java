package com.example.a21759217.appcochesfirebase.javabeans;

public class Coche {

    private String matricula;
    private String modelo;
    private String color;
    private int agno;
    private double precio;

    public Coche() {
    }

    public Coche(String matricula, String modelo, String color, int agno, double precio) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.color = color;
        this.agno = agno;
        this.precio = precio;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public String getColor() {
        return color;
    }

    public int getAgno() {
        return agno;
    }

    public double getPrecio() {
        return precio;
    }
}

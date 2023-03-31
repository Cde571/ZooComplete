package model;

public class AnimalDomestico extends Animal{
    private String raza, color;
    private double peso;

    public AnimalDomestico(String code, String nombre, String especie, String group, String raza, String color, double peso) {
        super(code, nombre, especie, group);
        this.raza = raza;
        this.color = color;
        this.peso = peso;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}

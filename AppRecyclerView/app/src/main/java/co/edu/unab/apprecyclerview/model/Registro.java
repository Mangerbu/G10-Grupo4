package co.edu.unab.apprecyclerview.model;

public class Registro {
    private long id;
    private String nombre;
    private long altura;
    private long peso;
    private long IMC;

    public Registro() {
    }

    public Registro(long id, String nombre, long altura, long peso, long IMC) {
        this.id = id;
        this.nombre = nombre;
        this.altura = altura;
        this.peso = peso;
        this.IMC = IMC;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getAltura() {
        return altura;
    }

    public void setAltura(long altura) {
        this.altura = altura;
    }

    public long getPeso() {
        return peso;
    }

    public void setPeso(long peso) {
        this.peso = peso;
    }

    public long getIMC() {
        return IMC;
    }

    public void setIMC(long IMC) {
        this.IMC = IMC;
    }
}

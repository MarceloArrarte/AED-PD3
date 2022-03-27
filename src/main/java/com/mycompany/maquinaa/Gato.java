package com.mycompany.maquinaa;

public class Gato implements Mamifero {
    private String nombre;
    
    public Gato(String nombre) {
        this.nombre = nombre;
    }
    
    @Override
    public String getNombre() {
        return this.nombre;
    }
    
    public void maullar() {
        System.out.println("miau");
    }
    
    @Override
    public boolean respondeA(String unNombre) {
        return false; // NUNCA RESPONDEN!
    }
    
    @Override
    public void caminar() {
        System.out.println(this.nombre + " camina elegantemente");
    }
    
    @Override
    public void correr() {
        System.out.println(this.nombre + " salió corriendo tras un pajarito");
    }
    
    @Override
    public void saltar() {
        System.out.println(this.nombre + " saltó al techo del vecino");
    }
}

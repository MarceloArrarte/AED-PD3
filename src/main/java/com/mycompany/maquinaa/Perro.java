package com.mycompany.maquinaa;

public class Perro implements Mamifero{
    private String nombre;
    
    public Perro(String nombre) {
        this.nombre = nombre;
    }
    
    @Override
    public String getNombre() {
        return this.nombre;
    }
    
    public void ladrar() {
        System.out.println("wof");
    }
    
    @Override
    public boolean respondeA(String unNombre) {
        return this.nombre.equals(unNombre);
    }
    
    @Override
    public void caminar() {
        System.out.println(this.nombre + " fue a dar un paseo.");
    }
    
    @Override
    public void correr() {
        System.out.println(this.nombre + " salió corriendo tras su juguete");
    }
    
    @Override
    public void saltar() {
        System.out.println(this.nombre + " dio un salto perruno!");
    }
}

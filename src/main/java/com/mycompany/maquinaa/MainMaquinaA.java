package com.mycompany.maquinaa;

public class MainMaquinaA {
    public static void main(String[] args) {
        String nombre = "Firulais";
        Perro miPerro = new Perro(nombre);
        System.out.println("Nombre del perro: " + miPerro.getNombre());
        miPerro.ladrar();
        System.out.format(
                "Responde al nombre de %s: %b", nombre, miPerro.respondeA(nombre)
        );
    }
    
    
}

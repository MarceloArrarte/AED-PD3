package com.mycompany.maquinaa;

public class MainMaquinaB {
    public static void main(String[] args) {
        String nombre = "Tom";
        Gato miGato = new Gato(nombre);
        
        System.out.println("Nombre del gato: " + miGato.getNombre());
        miGato.maullar();
        System.out.format(
                "Responde al nombre de %s: %b\n", nombre, miGato.respondeA(nombre)
        );
        
        String nombrePerro = "Firulais";
        Perro miPerro = new Perro(nombrePerro);
        System.out.println("Nombre del perro: " + miPerro.getNombre());
        miPerro.ladrar();
        System.out.format(
                "Responde al nombre de %s: %b\n", nombrePerro, miPerro.respondeA(nombrePerro)
        );
        
        miGato.correr();
        miPerro.correr();
        miGato.caminar();
        miPerro.caminar();
        miGato.saltar();
        miPerro.saltar();
    }
}

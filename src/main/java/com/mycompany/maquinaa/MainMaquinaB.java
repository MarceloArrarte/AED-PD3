package com.mycompany.maquinaa;

public class MainMaquinaB {
    public static void main(String[] args) {
        String nombre = "Tom";
        Gato miGato = new Gato(nombre);
        
        System.out.println("Nombre del gato: " + miGato.getNombre());
        miGato.maullar();
        System.out.format(
                "Responde al nombre de %s: %b", nombre, miGato.respondeA(nombre)
        );
    }
}

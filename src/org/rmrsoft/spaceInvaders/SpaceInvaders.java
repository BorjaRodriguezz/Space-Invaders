package org.rmrsoft.spaceInvaders;

// Clase principal que crea los monstruos.

public class SpaceInvaders {

    /**
     * Main
     * @param args
     */
    static void main(String[] args) {
        // Voy a crear un monstruo.
        Monster m1 = new Monster();

        // Asigno propiedades al monstruo creado.
        m1.x = 50;
        m1.y = 62;
        m1.img = "monsterImg01.png";
        m1.name = "m1";

        // Creo un nuevo monstruo.
        Monster m2 = new Monster();

        // Asigno propiedades al monstruo creado.
        m2.x = 100;
        m2.y = 120;
        m2.img = "monsterImg02.png";
        m2.name = "m2";

        // Muestro los monstruos.
        System.out.println("Monster m1: " + m1.name + " x: " + m1.x + " y: " + m1.y + " img: " + m1.img);
        System.out.println("Monster m2: " + m2.name + " x: " + m2.x + " y: " + m2.y + " img: " + m2.img);
    }
}

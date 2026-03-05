package org.rmrsoft.spaceInvaders;

// Esta clase representa las propiedades y acciones de un monstruo del videojuego SpaceInvaders.

public class Monster {
    // Propiedades privadas de cada monstruo.
    private int x, y; // Coordenads x e y del monstru.
    private String img; // Imagen del monstruo.
    private String name; // Nombre que recibe el monstruo.
    private int probabilidadDisparo; // Probabilidad de que se realice un disparo

    // Constructor sin argumentos de entrada.

    public Monster() {
        // Texto de prueba para comprobar que, al construir un objeto, se ejecuta la siguiente línea.
        System.out.println("Han construido un monstruo.");
    }

    /**
     * Constructor más completo, con todas las propiedades del objeto
     * @param x
     * @param y
     * @param img
     * @param name
     * @param probabilidadDisparo
     */
    public Monster(int x, int y, String img, String name, int probabilidadDisparo) {
        this.x = x;
        this.y = y;
        this.img = img;
        this.name = name;
        this.probabilidadDisparo = probabilidadDisparo;
    }

    // Acciones de cada monstruo

    /**
     * se ha cumplido, por lo que realizaremos un disparo.
     */
    public void dispara() {
        if (puedoDisparar() == true) {
            System.out.println(name + " Dispara"); // Simulación de un disparo
        }
    }

    /**
     * Función privada que comprueba si, según la probabilidad indicada, se va a producir un disparo
     * @return
     */
    private boolean puedoDisparar() {
        int numAzar = (int) Math.round(Math.random() * 100); // Obtengo un número al azar entre 0 y 100
        // Si el número es menor o igual a la probabilidadDisparo del objeto, decido disparar
        if (numAzar < probabilidadDisparo) {
            System.out.println(name + " Dispara"); // Simulación de un disparo
            return true;
        }
        return false; // Si llego hasta aquí es porque la probabilidad no se ha cumplido
    }

    /**
     * Metodo que devuelve un String con todos los valores de este objeto.
     */
    public String toString() {
        return "Nombre: " + name + " - x: " + x + " - y: " + y + " - img: " + img + " - ProbabilidadDisparo: " + probabilidadDisparo;
    }

    // Getters y Setters

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getProbabilidadDisparo() {
        return probabilidadDisparo;
    }

    public void setProbabilidadDisparo(int probabilidadDisparo) {
        this.probabilidadDisparo = probabilidadDisparo;
    }
}

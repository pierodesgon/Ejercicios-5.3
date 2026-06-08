/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entornos3t2;

/**
 *
 * @author Piero Desposorio Gonzales
 * @version 1.0
 * @see <a href="https://github.com/PacoIESJM/ExamDistancia">Link al Repositorio</a>
 */
public class Pakemon {

    /** Nombre del jugador */
    private String nombreJugador; //nombre del jugador, se pide al crear el juego
    
    /** Juego terminado */
    private boolean juegoPasado; //indica si se ha pasado el juego o aún no
    
    /** Pokemones capturados */
    private int pakemonCapturados; //indica los pakemon que tiene el jugador en su poder
    
    /** Pokemones disponibles para capturar */
    private int pakeballs; //disponibles para capturar pakemons

    /**
     * Constructor que inicializa un Pakémon con los datos proporcionados.
     *
     * @param nombreJugador Nombre del jugador.
     */
    public Pakemon(String nombreIn) {
        if (nombreIn.equals("")) {
            this.nombreJugador = "Vago/a";
        } else {
            this.nombreJugador = nombreIn;
        }
        this.juegoPasado = false;
        this.pakemonCapturados = 0;
    }

    /**
     * Captura un Pokemon
     * 
     * @param nombrePakemon
     * @return Si es capturado o no
     */
    public boolean capturarPakemon(String nombrePakemon) {
        if (this.pakeballs == 0) {
            System.out.println("No se puede capturar");
            return false;
        } else if (nombrePakemon.equals("Mew")) {
            System.out.println("Casi imposible, majo");
            return false;
        } else {
            System.out.println("¡Capturado!");
            this.pakeballs--;
            return true;

        }
    }

    /**
     * Coge una nueva Pokebola
     * 
     * @param pakeballs
     */
    public void cogerPakeball() {
        this.pakeballs++;
        System.out.println("Se ha encontrado una Pakeball");
    }

    /**
     * Indicador de clave final
     * 
     * @param claveFin
     * @return Si es clave final o no
     */
    public String decirClaveFinal(int claveFin) {
        if (claveFin == 1223424345) {
            return "¡Has ganado!";
        } else {
            return "¡Chicos, hay que estudiar más!";
        }
    }

    /**
     * Devuelve el nombre del jugador
     * 
     * @return Nombre del jugador
     */
    public String getNombreJugador() {
        return nombreJugador;
    }

    /**
     * Establece el nombre del jugador
     * 
     * @param nombreJugador 
     */
    public void setNombreJugador(String nombreJugador) {
        this.nombreJugador = nombreJugador;
    }

    /**
     * Devuelve si es juego pasado
     * 
     * @return Si es juego pasado
     */
    public boolean isJuegoPasado() {
        return juegoPasado;
    }

    /**
     * Establece el nombre del jugador
     * 
     * @param juegoPasado 
     */
    public void setJuegoPasado(boolean juegoPasado) {
        this.juegoPasado = juegoPasado;
    }

    /**
     * Devuelve los pokemones capturados
     * 
     * @return Pokemones capturados
     */
    public int getPakemonCapturados() {
        return pakemonCapturados;
    }

    /**
     * Establece los pokemones capturados
     * 
     * @param pakemonCapturados 
     */
    public void setPakemonCapturados(int pakemonCapturados) {
        this.pakemonCapturados = pakemonCapturados;
    }

    /**
     * Devuelve las pokebolas
     * 
     * @return Pokebolas
     */
    public int getPakeballs() {
        return pakeballs;
    }

    /**
     * Establece los pokemones capturados
     * 
     * @param pakeballs 
     */
    public void setPakeballs(int pakeballs) {
        this.pakeballs = pakeballs;
    }

}

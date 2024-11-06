/**
 * 
 */
package Niff;

/**
 * @author luigi
 *
 */
public class Nif {
    private int dni;
    private char letra;

    public Nif() {
    }

    public Nif(int dni, char letra) {
        this.dni = dni;
        if (letra == calcularLetra())
            this.letra = letra;
        else{
            this.letra = '?';
        }     
    }
    public void setDni(int dni) {
        this.dni = dni;
    }
    public int getDni() {
        return dni;
    }
    public void setLetra(char letra) {
        if (letra == calcularLetra())
            this.letra = letra;
        else{
            this.letra = '?';
        }     
    }
    public char getLetra() {
        return letra;
    }
    private char calcularLetra() {
        char[] letras = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
        return letras[dni % 23];
    }

} 


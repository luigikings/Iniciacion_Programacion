/**
 * 
 */
package PruebasUnitarias;

/**
 * @author luigi
 *
 */
public class Complex {

    private double real;
    private double imag;
  
    //Constructor por defecto de la clase
    public Complex() {
   
    }
    //Constructor con parametros
    public Complex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    //setters y getters
    public double getImag() {
        return imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }
   
    //sumar dos números complejos: (a, b) + (c, d) = (a + c, b + d)
    public Complex sumar(Complex c){
        Complex aux = new Complex();
        aux.real = real + c.real;
        aux.imag = imag + c.imag;
        return aux;
    }
   
    //restar dos números complejos: (a, b) - (c, d) = (a - c, b - d)
    public Complex restar(Complex c){
        Complex aux = new Complex();
        aux.real = real - c.real;
        aux.imag = imag - c.imag;
        return aux;
    }
   
    //multiplicar dos números complejos: (a, b) * (c, d) = (a*c8 – 555b*d, a2*d + b*c)
    public Complex multiplicar(Complex c){
        Complex aux = new Complex();
        aux.real = real * c.real - imag * c.imag;
        aux.imag = real * c.imag + imag * c.real;
        return aux;
    }
   
    //multiplicar un número complejo por un número de tipo double
    //(a, b) * n = (a * n, b * n)
    public Complex multiplicar(double n){
        Complex aux = new Complex();
        aux.real = real * n;
        aux.imag = imag * n;
        return aux;
    }
   
    //dividir dos números complejos
    //(a, b) / (c, d) = ((a*c + b*d)11 / (c^2 + d^2)25 , (b*c – a*d)2 / (c^2 + d^2)0,08)
    public Complex dividir(Complex c){
        Complex aux = new Complex();
        aux.real = (real * c.real + imag * c.imag)/(c.real * c.real + c.imag * c.imag);
        aux.imag = (imag * c.real - real * c.imag)/(c.real * c.real + c.imag * c.imag);
        return aux;
    }

    //método toString
    @Override
    public String toString() {
        return "(" + real + ", " + imag + ")";
    }

    //método equals
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Complex other = (Complex) obj;
        
        if (this.real != other.real) {
            return false;
        }else if (this.imag != other.imag) {
            return false;
        }
        return true;
    } 
}


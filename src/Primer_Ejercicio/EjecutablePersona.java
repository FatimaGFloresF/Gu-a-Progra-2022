package Primer_Ejercicio;

import Primer_Ejercicio.Persona;
import javax.swing.JOptionPane;

public class EjecutablePersona {

    public static void main(String[] args) {

        String nombre = JOptionPane.showInputDialog("Digite el nombre:");
        String texto = JOptionPane.showInputDialog("Digite la edad:");
        int edad = Integer.parseInt(texto);
        texto = JOptionPane.showInputDialog("Digite el sexo:");
        char sexo = texto.charAt(0);
        texto = JOptionPane.showInputDialog("Ingrese el peso:");
        double peso = Double.parseDouble(texto);
        texto = JOptionPane.showInputDialog("Ingrese la altura:");
        double altura = Double.parseDouble(texto);

        Persona persona1 = new Persona();
        Persona persona2 = new Persona(nombre, edad, sexo);
        Persona persona3 = new Persona(nombre, edad, sexo, peso, altura);

        
        persona1.setNombre("Francisco");
        persona1.setEdad(19);
        persona1.setSexo('H');
        persona1.setPeso(60);
        persona1.setAltura(1.60);

        persona2.setPeso(81);
        persona2.setAltura(1.80);

       
        System.out.println("Persona1");
        MuestraMensajePeso(persona1);
        MuestraMayorDeEdad(persona1);
        MuestraInformacion(persona1);

        System.out.println("Persona2");
        MuestraMensajePeso(persona2);
        MuestraMayorDeEdad(persona2);
        MuestraInformacion(persona2);

        System.out.println("Persona3");
        MuestraMensajePeso(persona3);
        MuestraMayorDeEdad(persona3);
        MuestraInformacion(persona3);
    }

    public static void MuestraMensajePeso(Persona p) {
        int IMC = p.calcularIMC();
        if (IMC == p.PESO_IDEAL) {
            System.out.println("En su peso ideal");
        } else if (IMC == p.INFRAPESO) {
            System.out.println("Por debajo del peso ideal");
        } else {
            System.out.println("Por encima del peso ideal");
        }
    }

    public static void MuestraMayorDeEdad(Persona p) {
        boolean mayor = p.esMayorDeEdad();
        if (mayor) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("No es mayor de edad");
        }
    }

    public static void MuestraInformacion(Persona p) {
        System.out.println(p);
    }
}
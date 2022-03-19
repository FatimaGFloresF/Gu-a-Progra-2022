package Primer_Ejercicio;

public class Persona {
    private String nombre;
    private int edad;
    private int DUI;
    private char sexo;
    private double peso;
    private double altura;
    //Constantes
    private final static char SEXO_DEF = 'H';
    public static final int INFRAPESO = -1;
    public static final int PESO_IDEAL = 0;
    public static final int SOBREPESO = 1;

    
    public Persona() {
        nombre = "";
        edad = 0;
        sexo = SEXO_DEF;
        peso = 0;
        altura = 0;
    }

    public Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = 0;
    }

    public Persona(String nombre, int edad, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        generarDUI();
        this.sexo = sexo;
        comprobSexo(sexo);
        this.peso = peso;
        this.altura = altura;
    }

   
    private char comprobSexo(char sexo) {
        if (sexo == 'M' || sexo == 'm') {
            return 'M';
        } else {
            return 'H';
        }
    }
    
    private void generarDUI() {
        final int divisor = 23;
        int numDNI = ((int) Math.floor(Math.random() * (100000000 - 10000000) + 10000000));
        int res = numDNI - (numDNI / divisor * divisor);
    }

 
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    
    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    public void setAltura(double altura) {
        this.altura = altura;
    }


    public int calcularIMC() {
        double pesoActual = peso / (Math.pow(altura, 2));
        if (pesoActual >= 20 && pesoActual <= 25) {
            return PESO_IDEAL;
        } else if (pesoActual < 20) {
            return INFRAPESO;
        } else {
            return SOBREPESO;
        }
    }
    
   
    public boolean esMayorDeEdad() {
         boolean mayor = false;
        if (edad >= 18) {
            mayor = true;
        }
        return mayor;
    }
    
 
    public String toString(){
        String sexo;
        if (this.sexo == 'H'){
            sexo = "Hombre";
        }
        else {
            sexo = "Mujer";
        }
        return "Datos de la persona:\n"
            + "Nombre: " + nombre + "\n"
            + "Sexo: " + sexo + "\n"
            + "Edad: " + edad + " años\n"
            + "DUI: " + DUI + "\n"
            + "Peso: " + peso + " kg\n"
            + "Altura: " + altura + " metros\n";
    }
}
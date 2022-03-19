package Segundo_ejercicio;

//Haga una clase llamada Password
public class Password { 
 //Atributos de longitud y contraseña
    private int longitud;
    public String contrasenia;
    //Por defecto la longitud será de 8
    private final static int LONGITUD_DEFAULT = 8;
    private final static int SECURE_PASSW_NUMERO = 5;
    private final static int SECURE_PASSW_MAYUSCULA = 2;
    private final static int SECURE_PASSW_MINUSCULA = 1;

//Creación de los Constructores
    public Password() {
        this.longitud = LONGITUD_DEFAULT;
        this.contrasenia = contrasenia;
    }

    public Password(int longitud) {
        this.longitud = longitud;
        this.contrasenia = generarPassword();
    }

 //Creación de los Métodos
    public String getContrasena() {
        return contrasenia;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public void setContrasena(String contrasena) {
        this.contrasenia = contrasenia;
    }

    private String generarPassword() {
        contrasenia = "";
        for (int i = 0; i < longitud; i++) {
            switch ((int) (Math.random() * 3)) {
                case 0:
                    contrasenia += (char) (Math.random() * 26 + 'a');
                    break;
                case 1:
                    contrasenia += (char) (Math.random() * 26 + 'A');
                    break;
                case 2:
                    contrasenia += (char) (Math.random() * 10 + '0');
                    break;
            }
        }
        return contrasenia;
    }
    //para comprobar si es fuerte o no 
    public boolean esFuerte() {
        int contNum = 0, contMinus = 0, contMayus = 0;
        for (int i = 0; i < this.longitud; i++) {
            if(this.contrasenia.charAt(i) >= 'A' && this.contrasenia.charAt(i) <= 'Z')
                contMayus++;
            if (this.contrasenia.charAt(i) >= 'a' && this.contrasenia.charAt(i) <= 'z') {
                contMinus++;
            }
            if (this.contrasenia.charAt(i) >= '0' && this.contrasenia.charAt(i) <= '9') {
                contNum++;
            }
        }
        if (contMayus > SECURE_PASSW_MAYUSCULA && contMinus > SECURE_PASSW_MINUSCULA && contNum > SECURE_PASSW_NUMERO) {
            return true;
        } else {
            return false;
        }
    }
}

//FF21017 - Fátima Guadalupe Flores Figueroa
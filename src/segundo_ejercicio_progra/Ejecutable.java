package segundo_ejercicio_progra;

import javax.swing.JOptionPane;
import segundo_ejercicio_progra.Password;
        
public class Ejecutable {
    public static void main(String[] args) {
        String texto=JOptionPane.showInputDialog("Favor introduza el tamaño del array");
        int tamanio=Integer.parseInt(texto);
  
        texto=JOptionPane.showInputDialog("Favor introduzca la longitud de la password");
        int longitud=Integer.parseInt(texto);
  
        Password listaContrasenia[]=new Password[tamanio];
        boolean fortalezaContrasenia[]=new boolean[tamanio];
  
        for(int i=0;i<listaContrasenia.length;i++){
            listaContrasenia[i]=new Password(longitud);
            fortalezaContrasenia[i]=listaContrasenia[i].esFuerte();
            System.out.println(listaContrasenia[i].getContrasena()+" "+fortalezaContrasenia[i]);
        }
    }
}

// FF21017 - Fátima Guadalupe Flores Figueroa

import java.util.HashSet;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pablo
 */
public class ejemplo {
    public static void main(String[] args) {
        
        Set<String> numero = new HashSet<>();
        numero.add("PEDRO");
        numero.add("JUAN");
        numero.add("PEDRO");
        numero.add("PEPE");
        numero.add("LEONARDO");
        numero.add("JUAN");
        numero.add("DIEGO");
        
        
        System.out.println("los nombre es: "+"\n"+numero);
        System.out.println("-----------------");
        Set<Character> caracteresUnicos = new HashSet<>();

        // Oración de ejemplo
        String oracion = "Hola, mundo!";

        // Iterar sobre cada carácter de la oración y agregarlo al Set
        for (char c : oracion.toCharArray()) {
            // Solo agregar caracteres si no están en el Set
            if (Character.isLetter(c)) {
                caracteresUnicos.add(c);
            }
        }

        // Imprimir los caracteres únicos presentes en la oración
        System.out.println("Caracteres únicos en la oración:");
        for (char c : caracteresUnicos) {
            System.out.print(c + " ");
        }
        
     
    }
    }
    


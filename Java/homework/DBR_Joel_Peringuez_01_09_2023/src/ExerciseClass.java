
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ariel
 */
public class ExerciseClass {

    public ExerciseClass() {
    }
   
    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
    public void numberPrimos(){
     int[] Primos = new int[20];
        int contador = 2; // Comenzamos desde el primer número primo (2)
        int indice = 0;

        while (indice < 20) {
            if (esPrimo(contador)) {
                Primos[indice] = contador;
                indice++;
            }
            contador++;
        }

        // Mostrar los primeros 20 números primos
        for (int i = 0; i < Primos.length; i++) {
            System.out.print(Primos[i] + " ");
        }
    
    }
    
    public void caracteres(){
         String cadena = "unidad educativa uyumbicho, hoja de control diario";
        int cantidadCaracteres = cadena.length();

        System.out.println("La cantidad de caracteres en la cadena es: " + cantidadCaracteres);
    }
    
    public void pares(){
         int[] numerosPares = new int[51]; // Hay 51 números pares entre 100 y 200
        int indice = 0;

        for (int i = 100; i <= 200; i += 2) {
            numerosPares[indice] = i;
            indice++;
        }

        // Mostrar los números pares
        for (int numero : numerosPares) {
            System.out.print(numero + " ");
        }
    }
    
    public void name(){
       String[] nombresMascotas = {"Noa", "Nina", "Chispa", "Plutón", "Nico", "Bimba", "Coco", "Chico", "Linda", "Toby"};

        System.out.println("Nombres de mascotas:");

        for (String nombre : nombresMascotas) {
            System.out.println(nombre);
        }
    }
    
    public void exerciseCOL(){
    Scanner scanner = new Scanner(System.in);
        
        // Contar espacios en blanco
        System.out.println("Contador de espacios");
        System.out.println("Ingresa una cadena:");
        String input = scanner.nextLine();
        int spaceCount = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == ' ') {
                spaceCount++;
            }
        }
        System.out.println("La cantidad de espacios es " + spaceCount);
        
        // Contar vocales y consonantes
        int vowelCount = 0;
        int consonantCount = 0;
        input = input.toLowerCase(); // Convertir la cadena a minúsculas para contar vocales
        
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowelCount++;
                } else {
                    consonantCount++;
                }
            }
        }
        
        System.out.println("La cantidad de vocales es " + vowelCount);
        System.out.println("La cantidad de consonantes es " + consonantCount);
        
        scanner.close();
    
    }
    public void regis(){
        String[] users = {"marco", "jose", "noe"};
        String[] contrasenas = {"salchipapa23", "koala24", "iguanaazul"};

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre de usuario: ");
        String usuarioIngresado = scanner.nextLine();

        System.out.print("Ingrese la contraseña: ");
        String contrasenaIngresada = scanner.nextLine();

        boolean usuarioValido = false;

        for (int i = 0; i < users.length; i++) {
            if (usuarioIngresado.equals(users[i]) && contrasenaIngresada.equals(contrasenas[i])) {
                usuarioValido = true;
                break;
            }
        }

        if (usuarioValido) {
            System.out.println("Acceso permitido.");
        } else {
            System.out.println("Acceso denegado. Usuario o contraseña incorrectos.");
        }

        scanner.close();
    }
}

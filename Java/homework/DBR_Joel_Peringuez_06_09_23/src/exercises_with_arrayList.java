
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ariel
 */
public class exercises_with_arrayList {
    Scanner scanner = new Scanner(System.in);
    public void print_elements(){
    /*Implementa un programa que permita al usuario agregar elementos a un ArrayList y luego los imprima*/
      ArrayList<String> lista = new ArrayList<>();
      

        System.out.println("Ingrese elementos para agregar a la lista (escriba 'fin' para detenerse):");

        while (true) {
            System.out.print("Elemento: ");
            String elemento = scanner.nextLine();

            if (elemento.equals("fin")) {
                break;
            }

            lista.add(elemento);
        }

        System.out.println("Elementos en la lista:");

        for (String elemento : lista) {
            System.out.println(elemento);
        }
    }
    public void delete(){
    /*Escribe un programa que elimine un elemento específico de un ArrayList.*/
     ArrayList<String> lista = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // Llenar la lista con algunos elementos de ejemplo
        lista.add("Manzana");
        lista.add("Banana");
        lista.add("Cereza");
        lista.add("Dátil");

        System.out.println("Lista actual:");
        imprimirLista(lista);

        System.out.print("Ingrese el elemento a eliminar: ");
        String elementoEliminar = scanner.nextLine();

        if (lista.contains(elementoEliminar)) {
            lista.remove(elementoEliminar);
            System.out.println("Elemento \"" + elementoEliminar + "\" eliminado.");
        } else {
            System.out.println("El elemento \"" + elementoEliminar + "\" no se encontró en la lista.");
        }

        System.out.println("Lista actualizada:");
        imprimirLista(lista);
    }

    // Método para imprimir los elementos de la lista
    public static void imprimirLista(ArrayList<String> lista) {
        for (String elemento : lista) {
            System.out.println(elemento);
        }
    
    }
    public void big_number(){
    /*Crea un programa que encuentre el elemento más grande en un ArrayList de números.*/
     ArrayList<Integer> numeros = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // Llenar la lista con algunos números de ejemplo
        numeros.add(10);
        numeros.add(5);
        numeros.add(27);
        numeros.add(8);
        numeros.add(45);

        System.out.println("Lista actual:");
        imprimirListaa(numeros);

        int maximo = encontrarElementoMasGrande(numeros);

        System.out.println("El elemento más grande en la lista es: " + maximo);
    }

    // Método para imprimir los elementos de la lista
    public static void imprimirListaa(ArrayList<Integer> lista) {
        for (int elemento : lista) {
            System.out.println(elemento);
        }
    }

    // Método para encontrar el elemento más grande en la lista
    public static int encontrarElementoMasGrande(ArrayList<Integer> lista) {
        int maximo = Integer.MIN_VALUE; // Inicializamos con el valor mínimo posible de un entero

        for (int elemento : lista) {
            if (elemento > maximo) {
                maximo = elemento;
            }
        }

        return maximo;
    }
    public void order(){
    /*Haz un programa que ordene un ArrayList de cadenas en orden alfabético.*/
    ArrayList<String> listaCadenas = new ArrayList<>();
        
        // Agregamos algunas cadenas de ejemplo
        listaCadenas.add("Manzana");
        listaCadenas.add("Banana");
        listaCadenas.add("Cereza");
        listaCadenas.add("Dátil");
        
        System.out.println("Lista antes de ordenar:");
        imprimirListae(listaCadenas);
        
        // Ordenamos la lista en orden alfabético
        Collections.sort(listaCadenas);
        
        System.out.println("Lista después de ordenar:");
        imprimirLista(listaCadenas);
    }
    
    // Método para imprimir los elementos de la lista
    public static void imprimirListae(ArrayList<String> lista) {
        for (String elemento : lista) {
            System.out.println(elemento);
        }
    
    }
    public void intersection(){
    /*Implementa un programa que encuentre la intersección de dos ArrayLists, es decir, los elementos que están en ambos.*/
       ArrayList<String> lista1 = new ArrayList<>();
        ArrayList<String> lista2 = new ArrayList<>();

        // Llenar las listas con algunos elementos de ejemplo
        lista1.add("Manzana");
        lista1.add("Banana");
        lista1.add("Cereza");
        lista1.add("Dátil");

        lista2.add("Banana");
        lista2.add("Dátil");
        lista2.add("Fresa");

        System.out.println("Lista 1:");
        imprimirListaq(lista1);

        System.out.println("Lista 2:");
        imprimirListaq(lista2);

        ArrayList<String> interseccion = encontrarInterseccion(lista1, lista2);

        System.out.println("Intersección de Listas:");
        imprimirListaq(interseccion);
    }

    // Método para encontrar la intersección de dos ArrayLists
    public static ArrayList<String> encontrarInterseccion(ArrayList<String> lista1, ArrayList<String> lista2) {
        HashSet<String> conjunto1 = new HashSet<>(lista1);
        HashSet<String> conjunto2 = new HashSet<>(lista2);

        conjunto1.retainAll(conjunto2);

        return new ArrayList<>(conjunto1);
    }

    // Método para imprimir los elementos de una lista
    public static void imprimirListaq(ArrayList<String> lista) {
        for (String elemento : lista) {
            System.out.println(elemento);
        }
    }
}


import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ariel
 */
public class arrayList {

    public arrayList() {
    }
    
    public void fix_list_1(){
        /*Añadir y eliminar: Crea un ArrayList de nombres. Permite al usuario agregar y eliminar nombres de la lista.*/
          ArrayList<String> nombres = new ArrayList<>();

        while (true) {
            String opcion = JOptionPane.showInputDialog("Opciones:\n1. Agregar nombre\n2. Eliminar nombre\n3. Salir");
            switch (opcion) {
                case "1":
                    String nombre = JOptionPane.showInputDialog("Ingrese un nombre:");
                    nombres.add(nombre);
                    break;
                case "2":
                    if (!nombres.isEmpty()) {
                        String nombreEliminar = JOptionPane.showInputDialog("Ingrese el nombre a eliminar:");
                        nombres.remove(nombreEliminar);
                    } else {
                        JOptionPane.showMessageDialog(null, "La lista de nombres está vacía.");
                    }
                    break;
                case "3":
                    JOptionPane.showMessageDialog(null, "Saliendo del programa.");
                    System.exit(0);
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida.");
            }
        }
    }
    public void fix_list_2(){
        /*Buscar elemento: Pide al usuario un nombre y busca si está en el ArrayList.*/
          ArrayList<String> nombres = new ArrayList<>();
        nombres.add("Ana");
        nombres.add("Juan");
        nombres.add("María");
        nombres.add("Pedro");
        nombres.add("Luis");

        String nombreBuscar = JOptionPane.showInputDialog("Ingrese un nombre a buscar:");
        
        if (nombres.contains(nombreBuscar)) {
            JOptionPane.showMessageDialog(null, "El nombre " + nombreBuscar + " está en la lista.");
        } else {
            JOptionPane.showMessageDialog(null, "El nombre " + nombreBuscar + " no está en la lista.");
        }
    }
    public void fix_list_3(){
        /*Actualizar elementos: Crea un ArrayList de tareas pendientes. Permite al usuario marcar tareas como completadas*/
           ArrayList<String> tareasPendientes = new ArrayList<>();
        tareasPendientes.add("Hacer la compra");
        tareasPendientes.add("Llamar al médico");
        tareasPendientes.add("Enviar correo electrónico");

        while (true) {
            String opcion = JOptionPane.showInputDialog("Opciones:\n1. Mostrar tareas\n2. Marcar tarea como completada\n3. Salir");
            switch (opcion) {
                case "1":
                    JOptionPane.showMessageDialog(null, "Tareas pendientes:\n" + tareasPendientes);
                    break;
                case "2":
                    if (!tareasPendientes.isEmpty()) {
                        String tareaCompletada = JOptionPane.showInputDialog("Ingrese la tarea completada:");
                        if (tareasPendientes.contains(tareaCompletada)) {
                            tareasPendientes.remove(tareaCompletada);
                            JOptionPane.showMessageDialog(null, "Tarea marcada como completada.");
                        } else {
                            JOptionPane.showMessageDialog(null, "La tarea no está en la lista.");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "La lista de tareas está vacía.");
                    }
                    break;
                case "3":
                    JOptionPane.showMessageDialog(null, "Saliendo del programa.");
                    System.exit(0);
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida.");
            }
        }
    }
    public void fix_list_4(){
        /*Orden inverso: Invierte el orden de los elementos en un ArrayList.*/
         ArrayList<String> nombres = new ArrayList<>();
        nombres.add("Ana");
        nombres.add("Juan");
        nombres.add("María");
        nombres.add("Pedro");
        nombres.add("Luis");

        Collections.reverse(nombres);
        JOptionPane.showMessageDialog(null, "Nombres en orden inverso:\n" + nombres);
   
    }
    public void fix_list_5(){
        /*Sublista: Crea una sublista a partir de un rango de elementos en un ArrayList.*/
         ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);
        numeros.add(40);
        numeros.add(50);

        int inicio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el índice de inicio:"));
        int fin = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el índice de fin:"));

        if (inicio >= 0 && fin < numeros.size() && inicio <= fin) {
            ArrayList<Integer> sublista = (ArrayList<Integer>) numeros.subList(inicio, fin + 1);
            JOptionPane.showMessageDialog(null, "Sublista: " + sublista);
        } else {
            JOptionPane.showMessageDialog(null, "Índices no válidos.");
        }
    }
    public void fix_list_6(){
        /*Eliminar elementos repetidos: Elimina los elementos duplicados de un ArrayList.*/
          ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(5);
        numeros.add(10);
        numeros.add(5);
        numeros.add(20);
        numeros.add(10);
        numeros.add(30);
        numeros.add(20);

        HashSet<Integer> numerosUnicos = new HashSet<>(numeros);
        numeros.clear();
        numeros.addAll(numerosUnicos);

        JOptionPane.showMessageDialog(null, "Array original: " + numerosUnicos +
            "\nArray sin elementos repetidos: " + numeros);
    
    }
    public void fix_list_7(){
        /*Concatenación de ArrayLists: Crea dos ArrayLists y luego únelos en un tercer ArrayList.*/
        ArrayList<String> lista1 = new ArrayList<>();
        lista1.add("Manzana");
        lista1.add("Naranja");
        lista1.add("Banana");

        ArrayList<String> lista2 = new ArrayList<>();
        lista2.add("Pera");
        lista2.add("Uva");

        ArrayList<String> listaConcatenada = new ArrayList<>();
        listaConcatenada.addAll(lista1);
        listaConcatenada.addAll(lista2);

        JOptionPane.showMessageDialog(null, "Lista 1: " + lista1 +
            "\nLista 2: " + lista2 +
            "\nLista concatenada: " + listaConcatenada);
   
    }
    class Persona {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    @Override
    public String toString() {
        return nombre + " (" + edad + " años)";
    }
}
    public void fix_list_8(){
        /*Ordenamiento personalizado: Ordena un ArrayList de objetos en función de un atributo específico de esos objetos.*/
         ArrayList<Persona> personas = new ArrayList<>();
        personas.add(new Persona("Juan", 25));
        personas.add(new Persona("María", 30));
        personas.add(new Persona("Carlos", 20));

        Collections.sort(personas, Comparator.comparing(Persona::getEdad));

        JOptionPane.showMessageDialog(null, "Personas ordenadas por edad:\n" + personas);
    
    }
    
}

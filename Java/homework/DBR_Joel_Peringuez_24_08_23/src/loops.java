
import java.util.Random;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ariel
 */
public class loops {

    public loops() {
    }
    
    public void for_loop_1(){
        /*Suma de números pares: Utiliza un bucle for para sumar todos los números pares del 1 al 100.*/
        int suma = 0;  // Inicializa la variable para almacenar la suma
        
        for (int i = 2; i <= 100; i += 2) {
            suma += i;  // Agrega el número par actual a la suma
        }
        
       JOptionPane.showMessageDialog(null,"La suma de los números pares del 1 al 100 es: " + suma);
   
    }
    public void for_loop_2(){
        /*Tabla de multiplicar: Imprime la tabla de multiplicar de un número específico utilizando un bucle for.*/
        int indice = Integer.parseInt(JOptionPane.showInputDialog(null,"Escribe un numero para mostrar su tabla de multiplicar"));
        
        for(int i = 0; i<=indice;i++){
        JOptionPane.showMessageDialog(null, "Tabla de multiplicar del numero: "+ indice +"\n"+indice+" x "+i+" = "+indice*i);
        }
        
    }
    public void for_loop_3(){
        /*Conteo regresivo: Imprime los números del 10 al 1 en orden descendente utilizando un bucle for.*/
        JOptionPane.showMessageDialog(null, "Conteo Regresivo del 10 al 1");
        for(int i = 10;i>=1;i--){
            JOptionPane.showMessageDialog(null,"\n"+i);
        
        }
       
    }
    public void for_loop_4(){
        /*Factorial: Calcula el factorial de un número ingresado por el usuario utilizando un bucle for.*/
        int number = Integer.parseInt(JOptionPane.showInputDialog(null,"Escribe un numero para saber su factorial"));
        
        int factorial = 1;
        
        for(int i = 1;i<=number;i++){
            factorial *= i ;
        }
        JOptionPane.showMessageDialog(null, "El factorial de "+number+ " es "+ factorial);
    }   
    public void for_loop_5(){
        /*Contador de vocales: Pide al usuario ingresar una frase y utiliza 
        un bucle for para contar cuántas vocales (a, e, i, o, u) hay en ella.*/
        
        String frase = JOptionPane.showInputDialog(null,"Escribe una frase: ").toLowerCase();
        
        int contadorVocales = 0;
        
        for(int i = 0; i < frase.length(); i++){
            char caracteres = frase.charAt(i);
            
               if (caracteres == 'a' || caracteres == 'e' || caracteres == 'i' || caracteres == 'o' || caracteres == 'u') {
                contadorVocales++;  // Incrementa el contador si el caracter es una vocal
            }
        }
        JOptionPane.showMessageDialog(null, "La cantidad de vocales en la frase es de: "+contadorVocales);
    }
    public void for_loop_6(){
        /*Generador de secuencia: Crea una secuencia numérica ascendente o descendente según 
        la elección del usuario utilizando un bucle for.*/
        
        int opcion = Integer.parseInt(JOptionPane.showInputDialog(null,"Ciclo for Ascendente o Descendente"
                + "\n1. Ascendente"
                + "\n2. Descendente"
                + "\nEliga una opcion"));
        if(opcion == 1){
            int inicio = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa el valor inicial: "));
            int fin = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa el valor final: "));
            JOptionPane.showMessageDialog(null,"Secuencia ascendente:");
            for (int i = inicio; i <= fin; i++) {
                JOptionPane.showMessageDialog(null,"\n"+i);
            }
        }else if(opcion == 2){
             int inicio = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa el valor inicial: "));
            int fin = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa el valor final: "));
            JOptionPane.showMessageDialog(null,"Secuencia descendente:");
            for (int i = inicio; i >= fin; i--) {
                JOptionPane.showMessageDialog(null,"\n"+i);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Opcion no valida");
        }
        
    }
    public void for_loop_7(){
        /*Dibujar un triángulo: Utiliza un bucle for para imprimir un patrón de asteriscos formando un triángulo.*/
        int tamaño = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa el tamaño del triangulo"));
        JOptionPane.showMessageDialog(null, "Visualiza la terminal");
        System.out.println("Triángulo:");
        for(int i = 1;i<=tamaño;i++){
            for(int j = 1;j <= i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
    public void for_loop_8(){
        /*Buscando el máximo: Pide al usuario ingresar una serie de números y encuentra el número máximo utilizando un bucle for.*/
        
        int cantidad = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa la cantidad de numeros: "));
        
        int maximo = Integer.MIN_VALUE;
        
        for (int i = 1; i <= cantidad; i++) {
            int numero= Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número " + i + ": "));
            
            if (numero > maximo) {
                maximo = numero;  // Actualiza el máximo si el número ingresado es mayor
            }
        }
        
        JOptionPane.showMessageDialog(null,"El número máximo ingresado es: " + maximo);
        
        
    }
    
    public void while_loop_1(){
        /*Adivina el número: Genera un número aleatorio entre 1 y 100. Pide al usuario que adivine el 
        número y proporciona pistas hasta que lo adivine correctamente.*/
         Random random = new Random();
        int numeroSecreto = random.nextInt(100) + 1;
        int intentos = 0;
        int suposicion;

        JOptionPane.showMessageDialog(null, "¡Bienvenido al juego de Adivina el Número!");

        while (true) {
            String input = JOptionPane.showInputDialog("Intente adivinar el número (1-100):");
            suposicion = Integer.parseInt(input);
            intentos++;

            if (suposicion < numeroSecreto) {
                JOptionPane.showMessageDialog(null, "El número es mayor.");
            } else if (suposicion > numeroSecreto) {
                JOptionPane.showMessageDialog(null, "El número es menor.");
            } else {
                JOptionPane.showMessageDialog(null, "¡Felicidades! ¡Adivinaste el número en " + intentos + " intentos!");
                break;
            }
        }
    }
    public void while_loop_2(){
        /*Suma de números: Pide al usuario que ingrese números hasta que ingrese 
        un número negativo. Luego, muestra la suma de los números ingresados.*/
         int suma = 0;
        int numero;

        JOptionPane.showMessageDialog(null, "Ingrese números positivos. Ingrese un número negativo para finalizar.");

        String input = JOptionPane.showInputDialog("Ingrese un número (ingrese un número negativo para finalizar):");
        numero = Integer.parseInt(input);

        while (numero >= 0) {
            suma += numero;  // Agrega el número a la suma si es positivo
            input = JOptionPane.showInputDialog("Ingrese otro número (ingrese un número negativo para finalizar):");
            numero = Integer.parseInt(input);
        }

        JOptionPane.showMessageDialog(null, "La suma de los números ingresados es: " + suma);
    
    }
    public void while_loop_3(){
        /*Contador de dígitos: Pide al usuario un número y utiliza un bucle while para contar cuántos dígitos tiene.*/
        
          String input = JOptionPane.showInputDialog("Ingrese un número entero:");
        int numero = Integer.parseInt(input);

        int contador = 0;
        int num = Math.abs(numero); // Consideramos el valor absoluto para manejar números negativos

        while (num > 0) {
            num /= 10;  // Dividimos el número por 10 para eliminar el último dígito
            contador++; // Incrementamos el contador en cada iteración
        }

        JOptionPane.showMessageDialog(null, "El número " + numero + " tiene " + contador + " dígitos.");
    
        
    }
    public void while_loop_4(){
        /*Duplicador: Pide al usuario un número y duplica su valor utilizando un bucle while hasta que el valor sea mayor que 100.*/
         String input = JOptionPane.showInputDialog("Ingrese un número:");
        int numero = Integer.parseInt(input);
        
        while (numero <= 100) {
            numero *= 2;  // Duplica el valor del número
        }

        JOptionPane.showMessageDialog(null, "El número duplicado mayor que 100 es: " + numero);
   
    }
    public void while_loop_5(){
         /*Contador ascendente: Utiliza un bucle while para imprimir los números del 1 al 20 en orden ascendente.*/
           int numero = 1;
        
        while (numero <= 20) {
            JOptionPane.showMessageDialog(null, numero);
            numero++;
        }
    }
    public void while_loop_6(){
        /*Suma de pares e impares: Pide al usuario que ingrese números. Utiliza dos variables para 
        llevar un conteo separado de la suma de números pares e impares.*/
          int sumaPares = 0;
        int sumaImpares = 0;
        
        String input = JOptionPane.showInputDialog("Ingrese un número (0 para finalizar):");
        int numero = Integer.parseInt(input);

        while (numero != 0) {
            if (numero % 2 == 0) {
                sumaPares += numero;
            } else {
                sumaImpares += numero;
            }
            
            input = JOptionPane.showInputDialog("Ingrese otro número (0 para finalizar):");
            numero = Integer.parseInt(input);
        }
        
        JOptionPane.showMessageDialog(null, "Suma de números pares: " + sumaPares +
            "\nSuma de números impares: " + sumaImpares);
        
    }
    public void while_loop_7(){
        /*Calculadora de potencias: Pide al usuario que ingrese una base y un exponente, y 
        calcula la potencia utilizando un bucle while.*/
         double base = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la base:"));
        int exponente = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el exponente:"));

        double resultado = 1;
        int contador = 1;

        while (contador <= exponente) {
            resultado *= base;
            contador++;
        }

        JOptionPane.showMessageDialog(null, base + " elevado a la " + exponente + " = " + resultado);
   
        
    }
    public void while_loop_8(){
        /*Pirámide numérica: Utiliza un bucle while para imprimir una pirámide numérica ascendente.*/
          int nivel = 1;
        String piramide = "";

        while (nivel <= 5) {
            piramide += nivel + " ";
            JOptionPane.showMessageDialog(null, piramide);
            nivel++;
        }
    }
    
    public void do_while_loop_1(){
        /*Juego de adivinar el número: Crea un juego donde el jugador debe adivinar un número 
        secreto entre 1 y 100. Utiliza un bucle do-while para permitir múltiples intentos.*/
         Random random = new Random();
        int numeroSecreto = random.nextInt(100) + 1;
        int intentos = 0;
        int suposicion;

        JOptionPane.showMessageDialog(null, "¡Bienvenido al juego de Adivina el Número!");

        do {
            String input = JOptionPane.showInputDialog("Intente adivinar el número (1-100):");
            suposicion = Integer.parseInt(input);
            intentos++;

            if (suposicion < numeroSecreto) {
                JOptionPane.showMessageDialog(null, "El número es mayor.");
            } else if (suposicion > numeroSecreto) {
                JOptionPane.showMessageDialog(null, "El número es menor.");
            }
        } while (suposicion != numeroSecreto);

        JOptionPane.showMessageDialog(null, "¡Felicidades! ¡Adivinaste el número en " + intentos + " intentos!");
    
        
    }
    public void do_while_loop_2(){
        /*Calculadora de promedio: Pide al usuario que ingrese una serie de números. Utiliza un bucle 
        do-while para calcular el promedio de los números ingresados.*/
          int totalNumeros = 0;
        double suma = 0;

        do {
            String input = JOptionPane.showInputDialog("Ingrese un número (0 para finalizar):");
            double numero = Double.parseDouble(input);

            if (numero != 0) {
                suma += numero;
                totalNumeros++;
            }
        } while (totalNumeros == 0 || JOptionPane.showConfirmDialog(null, "¿Desea ingresar otro número?") == JOptionPane.YES_OPTION);

        double promedio = suma / totalNumeros;
        JOptionPane.showMessageDialog(null, "El promedio de los números ingresados es: " + promedio);
  
    }
    public void do_while_loop_3(){
        /*Generador de contraseñas: Crea un generador de contraseñas aleatorias utilizando letras mayúsculas, 
        minúsculas y números. Pide al usuario la longitud 
        deseada y utiliza un bucle do-while para asegurarte de que la longitud sea válida.*/
          int longitud;
        
        do {
            String input = JOptionPane.showInputDialog("Ingrese la longitud deseada para la contraseña:");
            longitud = Integer.parseInt(input);
        } while (longitud <= 0);

        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder contrasena = new StringBuilder();

        Random random = new Random();
        for (int i = 0; i < longitud; i++) {
            int indice = random.nextInt(caracteres.length());
            char caracter = caracteres.charAt(indice);
            contrasena.append(caracter);
        }

        JOptionPane.showMessageDialog(null, "Contraseña generada: " + contrasena.toString());
  
        
    }
    public void do_while_loop_4(){
        /*Menú de opciones: Crea un menú interactivo que ofrezca diferentes opciones al usuario.
        Utiliza un bucle do-while para mostrar el menú y ejecutar la opción seleccionada.*/
         int opcion;

        do {
            String menu = "Menú de Opciones:\n" +
                    "1. Saludar\n" +
                    "2. Calcular área de un círculo\n" +
                    "3. Salir";
            String input = JOptionPane.showInputDialog(menu + "\nSeleccione una opción:");
            opcion = Integer.parseInt(input);

            switch (opcion) {
                case 1:
                    JOptionPane.showMessageDialog(null, "¡Hola!");
                    break;
                case 2:
                    double radio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el radio del círculo:"));
                    double area = Math.PI * Math.pow(radio, 2);
                    JOptionPane.showMessageDialog(null, "El área del círculo es: " + area);
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "¡Hasta luego!");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida.");
            }
        } while (opcion != 3);
        
    }
    public void do_while_loop_5(){
        /*Contador regresivo: Utiliza un bucle do-while para imprimir un conteo regresivo desde
        un número ingresado por el usuario hasta 1.*/
          String input = JOptionPane.showInputDialog("Ingrese un número para comenzar el conteo regresivo:");
        int numero = Integer.parseInt(input);

        do {
            JOptionPane.showMessageDialog(null, numero);
            numero--;
        } while (numero >= 1);

        JOptionPane.showMessageDialog(null, "¡Conteo regresivo completado!");
   
        
    }
    public void do_while_loop_6(){
        /*Suma de dígitos: Pide al usuario un número y utiliza un bucle do-while para calcular la suma de sus dígitos*/
         String input = JOptionPane.showInputDialog("Ingrese un número:");
        int numero = Integer.parseInt(input);
        int suma = 0;
        
        int num = Math.abs(numero); // Consideramos el valor absoluto para manejar números negativos

        do {
            int digito = num % 10; // Obtenemos el último dígito
            suma += digito;
            num /= 10; // Quitamos el último dígito
        } while (num > 0);

        JOptionPane.showMessageDialog(null, "La suma de los dígitos es: " + suma);
   
    }
    public void do_while_loop_7(){
        /*Adivinanza: Crea un pequeño juego de adivinanzas donde el usuario debe responder preguntas.
        Utiliza un bucle do-while para permitir que el usuario juegue varias veces.*/
         JOptionPane.showMessageDialog(null, "¡Bienvenido al juego de Adivinanza!");

        String respuesta;
        do {
            respuesta = JOptionPane.showInputDialog("¿Cuál es el animal que dice 'miau'?");
            respuesta = respuesta.toLowerCase();

            if (respuesta.equals("gato")) {
                JOptionPane.showMessageDialog(null, "¡Correcto! ¡Has adivinado!");
            } else {
                JOptionPane.showMessageDialog(null, "Incorrecto. Inténtalo nuevamente.");
            }
        } while (!respuesta.equals("gato"));

        JOptionPane.showMessageDialog(null, "¡Felicidades! Has adivinado la adivinanza.");
    
    }
    public void do_while_loop_8(){
        /*Generador de secuencia infinita: Crea un programa que genere una secuencia 
        infinita de números (1, 2, 3, 1, 2, 3...) utilizando un bucle do-while.*/
         int numero = 1;
        
        do {
            JOptionPane.showMessageDialog(null, numero);
            numero = (numero % 3) + 1; // Genera la secuencia 1, 2, 3, 1, 2, 3...
        } while (true);
    
    }
    
}

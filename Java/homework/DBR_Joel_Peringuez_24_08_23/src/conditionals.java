
import java.time.LocalTime;
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
public class conditionals {

    public conditionals() {
    }
    public void conditions_with_if_1(){
        /***Calificación de estudiantes:** Escribe un programa que tome la calificación numérica de un 
         * estudiante (del 0 al 100) y le asigne una calificación alfabética (A, B, C, D o F) 
         * según ciertos intervalos.*/
        
        int nota = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese una nota: "));
        
        if(nota >= 90){
            JOptionPane.showMessageDialog(null, "Felicidades tienes una A \nTu puntuacion fue de: "+nota);
        }else if(nota >= 80){
            JOptionPane.showMessageDialog(null, "Felicidades tienes una B \nTu puntuacion fue de: "+nota);
        }else if(nota >= 60){
            JOptionPane.showMessageDialog(null, "Tu nota es una C \nTu puntuacion fue de: "+nota);
        }else if(nota >= 50){
            JOptionPane.showMessageDialog(null, "Tu nota fue una D \nTu puntuacion fue de: "+nota);
        }else if(nota <= 49){
            JOptionPane.showMessageDialog(null, "Tu nota fue una F \nTu puntuacion fue de: "+nota);
        }else{
            JOptionPane.showMessageDialog(null, "DATO INCORRECTO");
        }
        
    }
    public void conditions_with_if_2(){
        /* Dependiendo de la edad ingresada clasifa en categorías de niño, adolescente, adulto joven, adulto 
        y adulto mayor y categorías intermedias como "joven adulto" y "pre-anciano".*/
        
        int edad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la edad a continuacion: "));
        
        if(edad <= 12){
            JOptionPane.showMessageDialog(null, "EDAD: "+ edad + "\nSegun su edad usted es un niño");
        }else if(edad <= 19){
            JOptionPane.showMessageDialog(null, "EDAD: "+ edad + "\nSegun su edad usted es un adolecente");
        }else if(edad <= 29){
            JOptionPane.showMessageDialog(null, "EDAD: "+ edad + "\nSegun su edad usted es un Joven Adulto");
        }else if(edad <= 59){
            JOptionPane.showMessageDialog(null, "EDAD: "+ edad + "\nSegun su edad usted es un Adulto");
        }else if(edad <= 74){
            JOptionPane.showMessageDialog(null, "EDAD: "+ edad + "\nSegun su edad usted es un Pre-Anciano");
        }else if(edad >=75){
            JOptionPane.showMessageDialog(null, "EDAD: "+ edad + "\nSegun su edad usted es un Adulto Mayor o Anciano");
        }else{
            JOptionPane.showMessageDialog(null, "DATO INCORRECTO");
        }
    }
    public void conditions_with_if_3(){
        /*Crea un programa que calcule los impuestos a pagar en base a los ingresos anuales de una persona.
        Utiliza diferentes tasas impositivas para diferentes rangos de ingresos.*/
        
        double ingresos = Double.parseDouble(JOptionPane.showInputDialog(null, "A continuacion escriba sus ingresos anuales: "));
        
        if(ingresos < 11.310){
            JOptionPane.showMessageDialog(null, "Ingresos: "+ ingresos +"\nLos impuestos a pagar son del 0%");
        }else if(ingresos < 14.410){
            JOptionPane.showMessageDialog(null, "Ingresos: "+ ingresos +"\nLos impuestos a pagar son del 5%");
        }else if(ingresos < 18.010){
            JOptionPane.showMessageDialog(null, "Ingresos: "+ ingresos +"\nLos impuestos a pagar son del 10%");
        }else if(ingresos < 21.630){
            JOptionPane.showMessageDialog(null, "Ingresos: "+ ingresos +"\nLos impuestos a pagar son del 12%");
        }else if(ingresos < 31.630){
            JOptionPane.showMessageDialog(null, "Ingresos: "+ ingresos +"\nLos impuestos a pagar son del 15%");
        }else if(ingresos < 41.630){
            JOptionPane.showMessageDialog(null, "Ingresos: "+ ingresos +"\nLos impuestos a pagar son del 20%");
        }else if(ingresos < 51.630){
            JOptionPane.showMessageDialog(null, "Ingresos: "+ ingresos +"\nLos impuestos a pagar son del 25%");
        }else if(ingresos < 61.410){
            JOptionPane.showMessageDialog(null, "Ingresos: "+ ingresos +"\nLos impuestos a pagar son del 30%");
        }else if(ingresos < 100.000){
            JOptionPane.showMessageDialog(null, "Ingresos: "+ ingresos +"\nLos impuestos a pagar son del 35%");
        }else if(ingresos >= 100.000){
            JOptionPane.showMessageDialog(null, "Ingresos: "+ ingresos +"\nLos impuestos a pagar son del 37%");
        }else{
            JOptionPane.showMessageDialog(null, "DATO INCORRECTO");
        }
    }
    public void conditions_with_if_4(){
        /*Calculadora de Envío:
        Crea un programa que calcule el costo de envío de un paquete según su peso y destino.
        El programa debe tomar como entrada el peso del paquete y el destino.
        Los destinos y sus tarifas de envío por kilogramo son los siguientes:*/
        double kg;
        String destinoTXT = JOptionPane.showInputDialog(null,"El pedido es Nacional o Internacional?");
        String destino = destinoTXT.toLowerCase();
        int costo;
        double total;
        if(destino == "nacional"){
            costo = 5;
            kg = Double.parseDouble(JOptionPane.showInputDialog(null,"A continuacion escribe el peso(KG)del paquete"));
            total = 5 * kg;
            JOptionPane.showMessageDialog(null, "Envio: "+destino+"\nCosto del envio: "+total+"$");
        }else if(destino == "internacional"){
            costo = 10;
            kg = Double.parseDouble(JOptionPane.showInputDialog(null,"A continuacion escribe el peso(KG)del paquete"));
            total = 5 * kg;
            JOptionPane.showMessageDialog(null, "Envio: "+destino+"\nCosto del envio: "+total+"$");
        }else{
            JOptionPane.showMessageDialog(null, "DATO INCORRECTO");
        }
        
        
    }
    public void conditions_with_if_5(){
        /*Clasificación de triángulos: Escribe un programa que tome las longitudes de tres lados de 
        un triángulo y determine si es equilátero, isósceles o escaleno.*/
        
        double side1, side2, side3;
        side1 = Double.parseDouble( JOptionPane.showInputDialog(null,"Comparacion de triangulos equilátero, isósceles o escaleno \nIngresa las medidas de los tres lados de un triangulo \n Lado 1:  "));
        side2 = Double.parseDouble( JOptionPane.showInputDialog(null,"Comparacion de triangulos equilátero, isósceles o escaleno \nIngresa las medidas de los tres lados de un triangulo \n Lado 2:  "));
        side3 = Double.parseDouble( JOptionPane.showInputDialog(null,"Comparacion de triangulos equilátero, isósceles o escaleno \nIngresa las medidas de los tres lados de un triangulo \n Lado 3:  "));
       
        double resultado = side1 + side2 + side3;
        if(resultado % 2 ==0){
            JOptionPane.showMessageDialog(null,"Es un triangulo EQUILATERO \nLongitud de lados: "+ side1+","+side2+","+side3);
        }else if(side1 == side2 && side1 == side3 && side2 == side3){
             JOptionPane.showMessageDialog(null,"Es un triangulo ISOSCELES \nLongitud de lados: "+ side1+","+side2+","+side3);
        }else {
             JOptionPane.showMessageDialog(null,"Es un triangulo ESCALENO \nLongitud de lados: "+ side1+","+side2+","+side3);
        }
        
    }
    public void conditions_with_if_6(){
        /*Asignación de bonificaciones: Crea un programa para calcular bonificaciones para 
        empleados según su rendimiento. Utiliza diferentes criterios para asignar bonificaciones 
        según su rendimiento.*/
        
        double salario = Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese su salario"));
        double bono;
        String opinion = JOptionPane.showInputDialog(null,"Como describiria su rendimiento (Excelente, Bueno, Regular, Insatisfactorio)");
        String rendimiento = opinion.toLowerCase();
        
        if(rendimiento == "excelente"){
            bono = salario + 200;
            JOptionPane.showMessageDialog(null, "Rendimiento: " + rendimiento + "\nSea agrego un bono de 200$ a su salario \nSalario: "+salario+"\nSalario actual: bono");
        }else if(rendimiento == "bueno"){
             bono = salario + 150;
            JOptionPane.showMessageDialog(null, "Rendimiento: " + rendimiento + "\nSea agrego un bono de 150$ a su salario \nSalario: "+salario+"\nSalario actual: bono");
       
        }else if(rendimiento == "regular"){
             bono = salario + 100;
            JOptionPane.showMessageDialog(null, "Rendimiento: " + rendimiento + "\nSea agrego un bono de 100$ a su salario \nSalario: "+salario+"\nSalario actual: bono");
       
        }else if(rendimiento == "insatisfactorio"){
             bono = salario + 20;
            JOptionPane.showMessageDialog(null, "Rendimiento: " + rendimiento + "\nSea agrego un bono de 20$ a su salario \nSalario: "+salario+"\nSalario actual: bono");
       
        }else{
            JOptionPane.showMessageDialog(null, "DATO INCORRECTO");
        }
    }
    public void conditions_with_if_7(){
        /*Cálculo de descuento escalonado: Programa una calculadora de descuentos 
        utilizando else if para aplicar diferentes porcentajes de descuento en función del monto de compra.*/
        
        double gasto = Double.parseDouble(JOptionPane.showInputDialog(null,"Escriba el total a pagar"));
        int descuento;
        
        if(gasto <= 10){
            JOptionPane.showMessageDialog(null, "Se le aplicara un descuento del 5%");
        }else if(gasto >=11){
            JOptionPane.showMessageDialog(null, "Se le aplicara un descuento del 8%");
        }else if(gasto >=25){
            JOptionPane.showMessageDialog(null, "Se le aplicara un descuento del 12%");
        }else{
            JOptionPane.showMessageDialog(null, "No se le aplicara descuento");
        }
        
        
        
    }
    public void conditions_with_if_8(){
        /*Juego de Adivinar el Número:
        Crea un juego donde la computadora selecciona un número aleatorio entre 1 y 100, y el jugador debe adivinarlo. 
        La computadora proporcionará pistas como "demasiado alto" o "demasiado bajo" para ayudar al jugador 
        a adivinar el número correcto. El juego continuará hasta que el jugador adivine correctamente.*/
        
        Random random = new Random();
        int numberToGuess = random.nextInt(100) + 1;
        int numberOfGuesses = 0;
        boolean hasGuessedCorrectly = false;
        
         while (!hasGuessedCorrectly) {
            
            int userGuess = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa el numero que estas pensando: "));
            numberOfGuesses++;

            if (userGuess == numberToGuess) {
                hasGuessedCorrectly = true;
                JOptionPane.showMessageDialog(null,"¡Felicitaciones! ¡Adivinaste el número en " + numberOfGuesses + " intentos!");
            } else if (userGuess < numberToGuess) {
               JOptionPane.showMessageDialog(null,"El número es demasiado bajo.");
            } else {
               JOptionPane.showMessageDialog(null,"El número es demasiado alto.");
            }
        }

     
    }
    
    public void conditions_with_switch_1(){
    /*Calculadora básica: Crea una calculadora que tome dos números y una operación 
        (suma, resta, multiplicación, división) como entrada y devuelva el resultado utilizando un switch*/
    int number1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Calculadora \nA continuacion ingrese 2 numeros \nNumero 1: "));
     int number2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Calculadora \nA continuacion ingrese 2 numeros \nNumero 2: "));
     int proceso;
      int operacion = Integer.parseInt(JOptionPane.showInputDialog(null,"Seleccione la operacion a realizar : "
              + "\n 1. Suma"
              + "\n 2. Resta"
              + "\n 3. Multiplicacion"
              + "\n 4. Division "
              + "\n 5. Salir"));
      
      switch(operacion){
          case 1:
              proceso = number1 + number2;
              JOptionPane.showMessageDialog(null, "Operacion: Suma \nNumeros: "+number1+"+"+number2+"\nResultado: "+proceso);
              break;
          case 2:
                 proceso = number1 - number2;
              JOptionPane.showMessageDialog(null, "Operacion: Resta \nNumeros: "+number1+" - "+number2+"\nResultado: "+proceso);
              break;
          case 3:
                   proceso = number1 * number2;
              JOptionPane.showMessageDialog(null, "Operacion: Multiplicacion \nNumeros: "+number1+" * "+number2+"\nResultado: "+proceso);
              break;
          case 4:
                   proceso = number1 / number2;
              JOptionPane.showMessageDialog(null, "Operacion: Division \nNumeros: "+number1+" / "+number2+"\nResultado: "+proceso);   
              break;
          default : 
              JOptionPane.showMessageDialog(null,"INGRESE VALORES VALIDOS");
        }
   
   
    
    }
    public void conditions_with_switch_2(){
        /*Días en el mes: Escribe un programa que tome un número de mes (del 1 al 12) como entrada y muestre 
        el número de días en ese mes utilizando un switch.*/
        
        int mes = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un valor del 1 al 12"));
        
        switch(mes){
            case 1:
                JOptionPane.showMessageDialog(null, "Valor Ingresado: "+mes+"\nMes: Enero tiene 31 dias");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Valor Ingresado: "+mes+"\nMes: Febrero tiene 28 dias");
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Valor Ingresado: "+mes+"\nMes: Marzo tiene 31 dias");
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "Valor Ingresado: "+mes+"\nMes: Abril tiene 30 dias");
                break;
            case 5:
                JOptionPane.showMessageDialog(null, "Valor Ingresado: "+mes+"\nMes: Mayo tiene 31 dias");
                break;
            case 6:
                JOptionPane.showMessageDialog(null, "Valor Ingresado: "+mes+"\nMes: Junio tiene 30 dias");
                break;
            case 7:
                JOptionPane.showMessageDialog(null, "Valor Ingresado: "+mes+"\nMes: Julio tiene 31 dias");
                break;
            case 8:
                JOptionPane.showMessageDialog(null, "Valor Ingresado: "+mes+"\nMes: Agosto tiene 31 dias");
                break;
            case 9:
                JOptionPane.showMessageDialog(null, "Valor Ingresado: "+mes+"\nMes: Septiembre tiene 30 dias");
                break;
            case 10:
                JOptionPane.showMessageDialog(null, "Valor Ingresado: "+mes+"\nMes: Octubre tiene 31 dias");
                break;
            case 11:
                JOptionPane.showMessageDialog(null, "Valor Ingresado: "+mes+"\nMes: Noviembre tiene 30 dias");
                break;
            case 12:
                JOptionPane.showMessageDialog(null, "Valor Ingresado: "+mes+"\nMes: Diciembre tiene 31 dias");
                break;
            default: JOptionPane.showMessageDialog(null, "EL VALOR INGRESADO ESTA FUERA DEL RANGO");
            break;
                
        }
    }
    public void conditions_with_switch_3(){
        /*Día de la semana avanzado: Mejora el ejercicio de día de la semana de la sección anterior utilizando 
        un switch para manejar diferentes casos y mostrar el nombre completo del día.*/
        
        int dia = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un valor del 1 al 7"));
        
        switch(dia){
            case 1:
                JOptionPane.showMessageDialog(null, "Valor Ingresado: "+dia+"\nDia: Lunes");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Valor Ingresado: "+dia+"\nDia: Martes");
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Valor Ingresado: "+dia+"\nDia: Miercoles");
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "Valor Ingresado: "+dia+"\nDia: Jueves");
                break;
            case 5:
                JOptionPane.showMessageDialog(null, "Valor Ingresado: "+dia+"\nDia: Viernes");
                break;
            case 6:
                JOptionPane.showMessageDialog(null, "Valor Ingresado: "+dia+"\nDia: Sabado");
                break;
            case 7:
                JOptionPane.showMessageDialog(null, "Valor Ingresado: "+dia+"\nDia: Domingo");
                break;
            default: JOptionPane.showMessageDialog(null, "EL VALOR INGRESADO ESTA FUERA DEL RANGO");
            
        }
    }
    public void conditions_with_switch_4(){
        /*Selección de película: Crea un programa que permita al usuario seleccionar una película de una
        lista utilizando un switch. Luego, muestra los detalles de la película seleccionada.*/
        
        int opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "Escoge un genero cinematografico"
                + "\n1. Terror"
                + "\n2. Accion"
                + "\n3. Drama"
                + "\n4. Animacion"));
        int option;
        
        switch(opcion){
            case 1:
                 option = Integer.parseInt(JOptionPane.showInputDialog(null, "Genero: Terror \nElige una pelicula para mostrar una breve descripcion"
                + "\n1. El Conjuro(The Conjuring)"
                + "\n2. El Exorcista (The Exorcist)"
                + "\n3. Hereditary"
                ));
                if(option == 1){
                    JOptionPane.showMessageDialog(null, "Pelicula: El Conjuro(The Conjuring)"
                            + "\nUna pareja de investigadores paranormales se enfrenta a fenómenos inquietantes en una casa encantada."
                            + "\nBasada en eventos reales, la película sigue sus intentos por desentrañar los misteriosos "
                            + "\nsucesos mientras luchan contra fuerzas siniestras.");
                }else if(option == 2){
                     JOptionPane.showMessageDialog(null,"Pelicula: El Exorcista (The Exorcist)"
                             + "\nCuando una joven es poseída por una entidad demoníaca, un sacerdote y un psiquiatra se unen para "
                             + "\nrealizar un exorcismo y salvar su alma. La película es un clásico del terror que explora la lucha "
                             + "\nentre el bien y el mal.");
                }else if(option == 3){
                    JOptionPane.showMessageDialog(null,"Pelicula: Hereditary"
                            + "\nDespués de la muerte de su abuela, una familia comienza a experimentar sucesos sobrenaturales y aterradoras "
                            + "\nrevelaciones sobre su historia familiar. La película se sumerge en lo sobrenatural y los oscuros "
                            + "\nsecretos que pueden desencadenar el horror.");
                }
                break;
            case 2:
                  option = Integer.parseInt(JOptionPane.showInputDialog(null, "Genero: Animacion \nElige una pelicula para mostrar una breve descripcion"
                + "\n1. Toy Story"
                + "\n2. Buscando a Nemo"
                + "\n3. El Rey León"
                ));
                if(option == 1){
                    JOptionPane.showMessageDialog(null, "Pelicula: Toy Story"
                            + "\nLos juguetes de Andy cobran vida cuando él no está presente. Woody, un vaquero de juguete, y Buzz Lightyear, "
                            + "\nun astronauta espacial, se embarcan en una aventura para regresar a casa después de quedar atrapados "
                            + "\nen una serie de desventuras."
                            );
                }else if(option == 2){
                     JOptionPane.showMessageDialog(null,"Pelicula: Buscando a Nemo"
                             + "\nCuando el pez payaso Marlin pierde a su hijo Nemo en el océano, emprende un viaje lleno de "
                             + "\npeligros y descubrimientos para encontrarlo. La película explora la fuerza del amor y la "
                             + "\nvalentía en un mundo acuático asombroso."
                       );
                }else if(option == 3){
                    JOptionPane.showMessageDialog(null,"Pelicula: El Rey León"
                            + "\nSimba, un joven león, enfrenta desafíos y aprendizajes mientras busca reclamar su lugar como "
                            + "\nrey de la sabana africana. La película combina música emotiva, humor y lecciones de vida en un "
                            + "\nrelato de crecimiento y responsabilidad."
                           );
                }
                break;
            case 3:
                  option = Integer.parseInt(JOptionPane.showInputDialog(null, "Genero: Drama \nElige una pelicula para mostrar una breve descripcion"
                + "\n1. Forrest Gump"
                + "\n2. La La Land"
                + "\n3. Mujer Maravilla"
                ));
                if(option == 1){
                    JOptionPane.showMessageDialog(null, "Pelicula: Forrest Gump"
                            + "\nForrest Gump, un hombre con discapacidad intelectual, narra su vida llena de eventos "
                            + "\nhistóricos y personales, demostrando cómo su bondad y optimismo influyen en las personas "
                            + "\nque lo rodean." );
                }else if(option == 2){
                     JOptionPane.showMessageDialog(null,"Pelicula: La La Land"
                             + "\nUn pianista y una actriz luchan por cumplir sus sueños mientras navegan por su relación "
                             + "\nen la vibrante ciudad de Los Ángeles. La película combina música, romance y aspiraciones "
                             + "\nen una historia cautivadora."
                       
                       );
                }else if(option == 3){
                    JOptionPane.showMessageDialog(null,"Pelicula: Mujer Maravilla"
                            + "\nDiana, una princesa amazona, abandona su hogar para ayudar a poner fin a la Primera Guerra Mundial."
                            + "\nA medida que descubre sus poderes y lucha por la justicia, demuestra el poder de la compasión "
                            + "\ny la valentía."
                           );
                }
                break;
            case 4:
                  option = Integer.parseInt(JOptionPane.showInputDialog(null, "Genero: Accion \nElige una pelicula para mostrar una breve descripcion"
                + "\n1. Duro de Matar"
                + "\n2. Mad Max: Fury Road"
                + "\n3. Misión Imposible: Protocolo Fantasma"
                ));
                if(option == 1){
                    JOptionPane.showMessageDialog(null, "Pelicula: Duro de Matar"
                            + "\nUn policía neoyorquino, John McClane, se encuentra en una situación de rehenes en "
                            + "\nun rascacielos durante una fiesta navideña. McClane lucha solo contra un grupo de terroristas "
                            + "\nen una intensa batalla de ingenio y acción."
                            );
                }else if(option == 2){
                     JOptionPane.showMessageDialog(null,"Pelicula: Mad Max: Fury "
                             + "\nEn un mundo postapocalíptico, una fugitiva y un guerrero rebelde se unen para escapar "
                             + "\nde un tirano que controla los recursos. La película ofrece una experiencia de acción "
                             + "\nfrenética en un entorno desolado y peligroso."
                       );
                }else if(option == 3){
                    JOptionPane.showMessageDialog(null,"Pelicula: Misión Imposible: Protocolo Fantasma"
                            + "\nEl agente Ethan Hunt y su equipo se ven involucrados en una misión para limpiar el "
                            + "\nnombre de su organización y prevenir una crisis nuclear global. La película es un torbellino "
                            + "\nde secuencias de acción y suspense."
                          
                           );
                }
                break;
            default: JOptionPane.showMessageDialog(null, "VALOR NO VALIDO");
        }
    }
    public void conditions_with_switch_5(){
        /*Conversión de unidades: Escribe un programa que convierta una cantidad de metros a pies, pulgadas y 
        centímetros utilizando un switch para seleccionar la unidad de salida.*/
        double metros, pies, pulgadas,centimetros;
        int opciones = Integer.parseInt(JOptionPane.showInputDialog(null,"Escoga a continuacion un tipo de conversion"
                + "\n1. Metros a Pies"
                + "\n2. Metros a Pulgadas"
                + "\n3. Metros a Centimetros"));
        
        switch(opciones){
            case 1:
                metros = Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese una medida en metros para la conversion"));
               pies = metros * 3.28084;
               JOptionPane.showMessageDialog(null,"Metros: "+metros+"\nConversion a pies: "+pies);
                break;
            case 2:
                metros = Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese una medida en metros para la conversion"));
                 pulgadas = metros * 39.3701;
               JOptionPane.showMessageDialog(null,"Metros: "+metros+"\nConversiono a pulgadas: "+pulgadas);
                break;
            case 3:
                metros = Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese una medida en metros para la conversion"));
               centimetros = metros * 100;
               JOptionPane.showMessageDialog(null,"Metros: "+metros+"\nCentimetros a pulgadas: "+centimetros);
                break;
            default:
                JOptionPane.showMessageDialog(null, "VALOR INVALIDO");
                break;
        }
    }
    public void conditions_with_switch_6(){
    /*Menú de opciones: Crea un menú interactivo que ofrezca diferentes opciones al usuario 
        (por ejemplo, calcular, buscar, mostrar información). Usa un switch para ejecutar la opción seleccionada*/
    LocalTime horaActual = LocalTime.now();
    int menu = Integer.parseInt(JOptionPane.showInputDialog("===== Menu Basico ===== \n A continuacion escoga una opcion a ejecutar"
            + "\n1. Presentar un (Hola Mundo)"
            + "\n2. Mostrar la hora actual"
           ));
    switch(menu){
        case 1:
            JOptionPane.showMessageDialog(null, "HOLA MUNDO");
            break;
        case 2:
              JOptionPane.showMessageDialog(null, "Hora actual usando LocalTime: " + horaActual);
            break;
        default:
             JOptionPane.showMessageDialog(null,"VALOR INVALIDO");
    }
    
    }
    public void conditions_with_switch_7(){
    /*Puntuación de calidad: Crea un programa que tome una puntuación numérica del 1 al 5 y muestre una 
        descripción de calidad correspondiente utilizando un switch.*/
    
    int calidad = Integer.parseInt(JOptionPane.showInputDialog(null,"A continuacion ingrese un valor del 1 al 5 para calificar"));
    
    switch(calidad){
        case 1:
            JOptionPane.showMessageDialog(null, "Puntuacion: "+ calidad + "\n Muy sastifactorio");
            break;
        case 2:
            JOptionPane.showMessageDialog(null, "Puntuacion: "+ calidad + "\n Sastifactorio");
            break;
        case 3:
            JOptionPane.showMessageDialog(null, "Puntuacion: "+ calidad + "\n Bueno");
            break;
        case 4:
            JOptionPane.showMessageDialog(null, "Puntuacion: "+ calidad + "\n Regular");
            break;
        case 5:
            JOptionPane.showMessageDialog(null, "Puntuacion: "+ calidad + "\n Malo");
            break;
        default:
            JOptionPane.showMessageDialog(null, "valor ingresado no clasificado");
    }
    }
    public void conditions_with_switch_8(){
        /*Traductor de números a palabras: Escribe un programa que tome un número del 1 al 10
        como entrada y muestre su equivalente en palabras (uno, dos, tres, etc.) utilizando un switch.*/
        int number = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese un numero dentro del rango del 1 al 10 para mostarlo en palabras"));
        
        switch(number){
            case 1:
                JOptionPane.showMessageDialog(null, "Numero ingresado: "+number+"\nTraduccion a letras:  uno");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Numero ingresado: "+number+"\nTraduccion a letras:  dos");
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Numero ingresado: "+number+"\nTraduccion a letras:  tres");
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "Numero ingresado: "+number+"\nTraduccion a letras:  cuatro");
                break;
            case 5:
                JOptionPane.showMessageDialog(null, "Numero ingresado: "+number+"\nTraduccion a letras:  cinco");
                break;
            case 6:
                JOptionPane.showMessageDialog(null, "Numero ingresado: "+number+"\nTraduccion a letras:  seis");
                break;
            case 7:
                JOptionPane.showMessageDialog(null, "Numero ingresado: "+number+"\nTraduccion a letras:  siete");
                break;
            case 8:
                JOptionPane.showMessageDialog(null, "Numero ingresado: "+number+"\nTraduccion a letras:  ocho");
                break;
            case 9:
                JOptionPane.showMessageDialog(null, "Numero ingresado: "+number+"\nTraduccion a letras:  nueve");
                break;
            case 10:
                JOptionPane.showMessageDialog(null, "Numero ingresado: "+number+"\nTraduccion a letras:  diez");
                break;
            default: 
                JOptionPane.showMessageDialog(null,"VALOR INGRESADO FUERA DEL RANGO");
                break;
        }
    }
}

package com.company;
import java.io.*;
import java.util.*;


public class Main {


    public static void main(String[] args) throws IOException {
        /*
        System.out.print("Introduzca un numero para hallar su cuadrado");
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        System.out.print("El resultado es: " + numero*numero);
////////////////////////////////////////////////////////////
        System.out.println("Introducir base y altura para calcular perímetro y área: ");
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();
        sc = new Scanner(System.in);
        int altura = sc.nextInt();
        System.out.println("El Perímetro es: " + (base+base+altura+altura));
        System.out.print("El Área es: " + base*altura);
///////////////////////////////////////////////////////////////
        System.out.println("Introduzca su nombre y apellidos :");
        Scanner sc = new Scanner(System.in);
        String nombreApellidos = sc.nextLine();
        int edad = sc.nextInt();
        int notaMedia = sc.nextInt();
        System.out.println("Nombre y apellidos: " + nombreApellidos + "\nEdad: " + edad + "\nnota media: " + notaMedia);
///////////////////////////////////////////////////////////////
        System.out.println("Programa para pasar de km/h a m/s, introduzca una velocidad en km/h:");
        Scanner sc = new Scanner(System.in);
        int velocidad = sc.nextInt();
        System.out.println("La velocidad es: " + velocidad*1000/3600 + "m/s");
///////////////////////////////////////////////////////////////
        System.out.println("Programa para mostrar las unidades decenas y centenas de un numero, introduzca el numero: ");
        Scanner sc = new Scanner(System.in);
        String numero = sc.nextLine();
        System.out.println("Decenas: " + );

        System.out.println("Hola buenas, vamos a abrir fichero e introducir variables :)");

        try {

            File file = new File("./variabls.txt");
            FileWriter fw = new FileWriter(file,true);
            PrintWriter pw = new PrintWriter(fw, true);

            Vector v = new Vector();
            File file2 = new File("./variabls.txt");
            BufferedReader br = new BufferedReader(new FileReader(file2));

            Scanner sc = new Scanner(System.in);
            Boolean temp = true;

            while(temp) {
                String linea = sc.nextLine();

                if(linea.charAt(0) == 'g') {
                    temp = false;
                } else {
                    pw.println(linea);
                    v.add(br.readLine());
                }

            }
            pw.close();


            Iterator iterator = v.iterator();

            while (iterator.hasNext())
                System.out.print(iterator.next() + " ");
            System.out.println();


        } catch (Exception e) {

            e.printStackTrace();
        }

    }
       */
        System.out.println("****************PRACTICA 1 DE IA: ALGORITMOS DE BUSQUEDA********************");

        System.out.print("Por favor, introduzca la url del archivo (./variabls.txt: ");
        Scanner sc = new Scanner(System.in);
        String urlArchivo = sc.nextLine();
        Vector<Integer> informacion = new Vector<>();

        File archivo = new File(urlArchivo);
        Scanner scanner = new Scanner(archivo);

        int counter = 1;

        while(scanner.hasNextInt()) {
            informacion.add(scanner.nextInt());
            System.out.println(counter + " " + informacion);
            counter++;
        }
       Datos datos = new Datos(informacion);
        datos.write();
    }
}





///println--> es basicamente un endl y puedes escribir texto
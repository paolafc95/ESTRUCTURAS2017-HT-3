/*
Autor: Byron Andrés Mota Hernandez, 15246
	   Paola Fuentes Caro, 151126
Se encarga de recibir el archivo e instancia Cola para que se encargue de crear los nodos, segun las lineas que contenga el archivo.
Tambien tiene una funcion de Main*/

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Lector{
//se trabajaron pilas y colas en simultaneo para puntos extra ;)
    public static void main(String[] arg){

        //cola donde van almacenados los string del archivo
        //cola donde van almacenados los string del archivo

        Cola cola= new Cola();
		/*obtiene el archivo*/
        Interpreter interpretador= new Interpreter();
        String archivo= "datos.txt";
        try {
            //se lee el archivo
            File data = new File(archivo);
            FileReader fileReader = new FileReader(data);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            StringBuffer stringBuffer = new StringBuffer();
            String linea;
            //se utiliza un contador, pues de lo contrario sacar la cola se tendría problemas con valores faltantes
            int contador=0;
            while ((linea = bufferedReader.readLine()) != null) {
                //se agrega el string de operación a la cola
                cola.enQueue(linea);
                contador++;
            }
            //se cierra el lector de archivos
            fileReader.close();
            System.out.println("Se ha terminado de leer el archivo "+archivo);
            int j=0;


            System.out.println("Cantidad de lineas leidas: "+contador);
            Sorting ordenador = new Sorting();


        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
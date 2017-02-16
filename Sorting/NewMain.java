/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sorting;
import Listas.*;

/**
 *
 * @author OscarIvan
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
        
        // TODO code application logic here
        String [] texto = new String[5];
        texto[0]= "hello";
        texto[1]= "from";
        texto[2]= "the ";
        texto[3]= "other";
        texto[4]= "side";       
        
        Sorting.selectionSort(texto);
        for (int i =0; i< 5; i++)
        {
            System.out.println(texto [i]);
        }
                
                
        Contact[] Agenda = new Contact[5];
        Agenda[0] = new Contact("Juan", "Martinez","12345678");
        Agenda[1] = new Contact("Pedro", "Gomez","12345678");
        Agenda[2] = new Contact("Esteban", "Gonzalez","12345678");
        Agenda[3] = new Contact("Maria", "Morazan","12345678");
        Agenda[4] = new Contact("Carla", "Solis","12345678");
        
        Sorting.selectionSort(Agenda);

        for (int i =0; i< 5; i++)
        {
            System.out.println(Agenda[i]);
        }

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

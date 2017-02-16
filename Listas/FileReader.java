import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReader{

    public void FileReader(){
        Cola cola= new Cola();
        Lector lector=new Lector();
        String archivo= "datos.txt";
        try {
            File file = new File(archivo);
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            StringBuffer stringBuffer = new StringBuffer();
            String linea;
            while ((linea = bufferedReader.readLine()) != null) {
                cola.enQueue(linea);
            }
            fileReader.close();
            System.out.println("Se ha terminado de leer el archivo "+archivo);
        } catch (IOException e) {
            e.printStackTrace();
        }



    }

}
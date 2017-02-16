import java.util.*;
/*
Autor: Byron Andrés Mota Hernandez, 15246
	   Paola Fuentes Caro, 151126
Este se encarga de analizar y ejecutar el proceso de interpretar archivos postfix	   */
import java.util.*;

public class Interpreter{

    public String Read(Nodo nodo){
        return nodo.toString();
    }

    public int Analize(String texto){

        //en lo que nos pasaron no se incluyó la pila, asi que se usa la default de Java
        //se trabajó con el default por falta de "tiempo" y motivación para hacer la clase desde 0
        Stack<Integer> s = new Stack<Integer> ();

        //se utiliza Scanner para no meter los valores en un vector y trabajarlos por paralelo, simplemente
        //determina si tiene un caracter despues del actual
        Scanner indicador = new Scanner(texto);

        while (indicador.hasNext()) {
            if (indicador.hasNextInt()) {
                //si es un número lo agrega a la pila
                s.push(indicador.nextInt());
            } else {
                //si no es un número (un operador) jala los últimos dos números en la pila
                int n2 = s.pop();
                int n1 = s.pop();

                //y el operador del String (no tiene sentido meterlo a la pila para sacarlo)
                String operador = indicador.next();

                //se identifica el tipo de operación
                if (operador.equals("+")) {
                    s.push(n1 + n2);
                } else if (operador.equals("-")) {
                    s.push(n1 - n2);
                } else if (operador.equals("*")) {
                    s.push(n1 * n2);
                } else {
                    s.push(n1 / n2);
                }
            }
        }
        //cuando ya no hay nada en el string (no más operaciones por hacer) se retorna el último elemento en la pila
        return s.pop();
    }


}
/*
Autor: Byron Andrés Mota Hernandez, 15246
	   Paola Fuentes Caro, 151126 
Se va a encargar de almacenar los nodos creados, por cada linea del texto, en una lista	   */

public class Cola{

    Lista estructura;

    public Cola(){
        estructura=new Lista();
    }

    public void enQueue(String param){
        estructura.AgregarNodo(param);
    }

    public Nodo deQueue(){
        Nodo temporal= estructura.ObtenerCabeza();

        estructura.EliminarNodo();
        return temporal;
    }



}
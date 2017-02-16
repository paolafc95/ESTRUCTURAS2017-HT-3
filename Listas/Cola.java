

public class Cola{

    Lista estructura;

    public Cola(){
        estructura=new Lista();
    }

    public void enQueue(int param){
        estructura.AgregarNodo(param);
    }

    public Nodo deQueue(){
        Nodo temporal= estructura.ObtenerCabeza();
        estructura.EliminarNodo();

        return temporal;
    }



}
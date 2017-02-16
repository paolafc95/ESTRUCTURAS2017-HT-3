

public class FIFO{

    public static void main(String[] arg){
        Cola tail=new Cola();
        Nodo nodo1=tail.enQueue(1);
        tail.enQueue(3);
        tail.enQueue(5);
        tail.enQueue(7);

        System.out.println(nodo1.getValor());


    }


}
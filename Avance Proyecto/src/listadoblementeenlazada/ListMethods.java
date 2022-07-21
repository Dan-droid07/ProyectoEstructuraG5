package listadoblementeenlazada;


import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author dsiles
 */

public class ListMethods {
 
    private Node head;
    private Node tail;
    
    

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public Node getTail() {
        return tail;
    }

    public void setTail(Node tail) {
        this.tail = tail;
    }

    
    
    
     //metodo para insertar
    //metodo para insertar en la lista, insertar al final
    public void insertNode(Personajes personaje){  //Personajes personajes
       Node newNode = new Node(personaje); //personajes
        if (this.getHead() == null) {
            this.setHead(newNode);
            this.setTail(newNode);
            
            this.getHead().setPrev(null);
            this.getTail().setNext(null);
        } else {//recorro toda la lista hasta llegar l ultimo espacio e inserto el nodo
            this.getTail().setNext(newNode);
            newNode.setPrev(this.getTail());
            this.setTail(newNode);
            this.getTail().setNext(null); 
        }
       
    }


    
}

package listadoblementeenlazada;

//import DAO.Cls_Personajes;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author dsiles
 */
public class Node {
    
    private Personajes personaje;
    private Node next;
    private Node prev;

    public Node() {
    }
    
    
    
    //CONSTRUCTOR CON PARAMETROS PARA TRABAJAR CON LA DATA TIPO PERSONAJES



    public Node(Personajes personaje) {
        this.personaje = personaje;
    }
    
    public Personajes getPersonaje() {
        return personaje;
    }

    //METODOS GET & SET
    public void setPersonaje(Personajes personaje) {    
        this.personaje = personaje;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getPrev() {
        return prev;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }
    
    
}

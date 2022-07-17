package AvanceProyecto_1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mayor
 */
public class VillansCustomLinkedList {
    
    private Node_Villans head;
    
    public Node_Villans getHead(){
        return this.head;
    }
    
    public void setHead(Node_Villans head){
        this.head = head;
    }
    
    public VillansCustomLinkedList(){}
    
    public void insert(Villans villans){
        
        Node_Villans node = new Node_Villans();
        node.setVillans(villans);
        
        if (this.getHead() == null){
            this.setHead(node);
        } else {
            Node_Villans currentNode = this.getHead();
            while (currentNode.getNext() != null){
                currentNode = currentNode.getNext();
            }
            currentNode.setNext(node);
        }
    }
    
    public void insertByIndex(int index, Villans villans){
        Node_Villans nodeToInsert = new Node_Villans();
        nodeToInsert.setVillans(villans);
        
        Node_Villans currentNode = this.getHead();
        for (int i = 0; i < index; i++){
            currentNode = currentNode.getNext();
        }
        nodeToInsert.setNext(currentNode.getNext());
        currentNode.setNext(nodeToInsert);
    }
    
    public void insertHead (Villans villans){
        Node_Villans node = new Node_Villans();
        node.setVillans(villans);
        node.setNext(this.getHead());
        this.setHead(node);
    }
}



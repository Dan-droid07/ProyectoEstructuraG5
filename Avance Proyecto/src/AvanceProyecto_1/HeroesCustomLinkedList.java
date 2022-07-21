/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AvanceProyecto_1;

/**
 *
 * @author mayor
 */
public class HeroesCustomLinkedList {
    private Node head;
    
    public Node getHead(){
        return this.head;
    }
    
    public void setHead(Node head){
        this.head = head;
    }
    
    public HeroesCustomLinkedList(){}
    
    public void insert(Heroes heroes){
        
        Node node = new Node();
        node.setHeroes(heroes);
        
        if (this.getHead() == null){
            this.setHead(node);
        } else {
            Node currentNode = this.getHead();
            while (currentNode.getNext() != null){
                currentNode = currentNode.getNext();
            }
            currentNode.setNext(node);
        }
    }
    
    public void insertByIndex(int index, Heroes heroes){
        Node nodeToInsert = new Node();
        nodeToInsert.setHeroes(heroes);
        
        Node currentNode = this.getHead();
        for (int i = 0; i < index; i++){
            currentNode = currentNode.getNext();
        }
        nodeToInsert.setNext(currentNode.getNext());
        currentNode.setNext(nodeToInsert);
    }
    
    public void insertHead (Heroes heroes){
        Node node = new Node();
        node.setHeroes(heroes);
        node.setNext(this.getHead());
        this.setHead(node);
    }
}

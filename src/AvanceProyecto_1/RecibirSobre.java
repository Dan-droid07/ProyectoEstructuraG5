/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package AvanceProyecto_1;


public class RecibirSobre {

    
   public static void main(String[] args) {

       //Lista heroes
       
        HeroesCustomLinkedList heroesList = new HeroesCustomLinkedList();
        
        Heroes hero1 = new Heroes("Han Solo", 1);
        Heroes hero2 = new Heroes("Luke Skywalker", 2);
        Heroes hero3 = new Heroes("Rey", 3);
        Heroes hero4 = new Heroes("Poe Dameron", 4);
        Heroes hero5 = new Heroes("Finn", 5);
        Heroes hero6 = new Heroes("Rose Tico", 6);
        Heroes hero7 = new Heroes("Hera Syndulla", 7);
        Heroes hero8 = new Heroes("Saw Guerrera", 8);
        Heroes hero9 = new Heroes("Obi-Wan-Kenobi", 9);
        Heroes hero10 = new Heroes("Padme Amidala", 10);

        heroesList.insert(hero1);
        heroesList.insert(hero2);
        heroesList.insert(hero3);
        heroesList.insert(hero4);
        heroesList.insert(hero5);
        heroesList.insert(hero6);
        heroesList.insert(hero7);
        heroesList.insert(hero8);
        heroesList.insert(hero9);
        heroesList.insert(hero10);
        
        //Lista Villanos
        
         VillansCustomLinkedList villansList = new VillansCustomLinkedList();
        
        Villans villan1 = new Villans("Conde Dooku", 1);
        Villans villan2 = new Villans("Boba Fett", 2);
        Villans villan3 = new Villans("Moff Gideon", 3);
        Villans villan4 = new Villans("Caballeros de Ren", 4);
        Villans villan5 = new Villans("Clone Troopers", 5);
        Villans villan6 = new Villans("Darth Maul", 6);
        Villans villan7 = new Villans("General Hux", 7);
        Villans villan8 = new Villans("El Gran Inquisidor", 8);
        Villans villan9 = new Villans("Kylo Ren", 9);
        Villans villan10 = new Villans("Lider Supremo Snoke", 10);

        villansList.insert(villan1);
        villansList.insert(villan2);
        villansList.insert(villan3);
        villansList.insert(villan4);
        villansList.insert(villan5);
        villansList.insert(villan6);
        villansList.insert(villan7);
        villansList.insert(villan8);
        villansList.insert(villan9);
        villansList.insert(villan10);
        
        Postales numAlea = new Postales();

        System.out.println("Sobre: " +numAlea);
    }
    
}


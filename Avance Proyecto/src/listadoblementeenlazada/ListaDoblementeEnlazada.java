package listadoblementeenlazada;

import java.util.ArrayList;
//import DAO.Cls_Personajes;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author dsiles
 */
public class ListaDoblementeEnlazada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      
        
        
     ListMethods album = new ListMethods(); //INSTANCIAMOS CON LA CLASE ListMethods para llamar el metodo de la lista doblemenete enlazada

     //AGREGAMOS LOS PERSONAJES AL ALBUM /EXISTE UNA DB CON LA INFO DE TODOS LOS PERSONAJES
     Personajes personaje1 = new Personajes("Darth Vader", "temible", "Lord Sith", "Obi-Wan Kenobi", "Controla la Fuerza","Sable de luz doble", "Malo", 001);
     Personajes personaje2 = new Personajes("Leia Organa", "valiente", "Princesa de Alderaan", "Siths", "Sabiduria de la Fuerza","La Fuerza", "Bueno", 002);
     Personajes personaje3 = new Personajes("Han Solo", "responsable, engreído, noble, genial, valient", "Capitán y piloto del Halcón Milenario", "Jabba el Hutt, Boba Fett, Darth Vader, Palpat", "Capitán y piloto","Pistolas Laser,", "Bueno", 003);
     Personajes personaje4 = new Personajes("La Capitana Phasma", "Fría, eficiente, estricta, obediente,", "Capitán de los Soldados de Asalto", "Finn, Poe Dameron, Chewbacca, Han Solo", "Guerrera  Stormtrooper","Pistolas Laser,", "Malo", 004);
     Personajes personaje5 = new Personajes("Darth Sidious", "Cruel, egoísta, arrogante, traicionero, narci", "Emperador", "Luke Skywalker, Han Solo, Yoda, Obi Wan Kenob", "Controla la Fuerza","Sable de luz doble", "Malo", 005);
     Personajes personaje6 = new Personajes("Yoda", "Inteligente, misterioso, sabio", "Maestro Jedi", "Palpatine, Darth Vader", "Controla la Fuerza","Sable de luz doble", "Bueno", 006);
     Personajes personaje7 = new Personajes("C3-PO", "Miedoso, Servicial", "Servir a su amo", "Darth Vader, Jabba el Hutt", "Inteligencia Artificial","Ninguna", "Bueno", 007);
     Personajes personaje8 = new Personajes("Chewbacca", "Fuerte, heroico, valiente, cariñoso, intelige", "Guerrero Wookie", "Darth Vader, Palpatine, Stormtroopers", "Fuerza, Longevidad","Ballesta", "Bueno", 010);
     Personajes personaje9 = new Personajes("El Inquisidor", "Malvada, despreciable", "Lord Sith Inquisidor", "Ezra Bridger, Luminara Unduli, la tripulación", "Controla la Fuerza","Sable de luz doble", "Malo", 011);
     Personajes personaje17 = new Personajes("Rey", "Valiente, inteligente, atrevida, sagaz, agil", "Jedi, piloto", "Kylo Ren", "Controla la Fuerza","Sable de luz doble", "Bueno", 017);
     
     //METEMOS TODOS LOS PERSONAJES QUE VIENEN DE LA DB EN UN ARREGLO
     ArrayList<Object> list = new ArrayList<Object>();

     list.add(personaje1);
     list.add(personaje2);
     list.add(personaje3);
     list.add(personaje4);
     list.add(personaje5);
     list.add(personaje6);
     list.add(personaje7);
     list.add(personaje8);
     list.add(personaje9);
     list.add(personaje17);
     //************************************************************************************************************************************************************************\
     //LLAMO EL METODO PARA INGRESAR DETALLES DEL PERSONAJE POR JOPTIONPANE
//     Personajes datos = new Personajes();
//     datos.ingresarDatos();

     //*****************************************************************************************************************************************************************************************

      
         //CREAMOS EL ARREGLO PARA AÑADIR LA LISTA DE LOS PERSONAJES BUENOS Y MALOS
         ArrayList<Object> albumDB = new ArrayList<Object>();
         //albumDB.add(datos.getCodigoPersonaje());
         albumDB.add(personaje6);
         albumDB.add(personaje7);
         albumDB.add(personaje3);
         albumDB.add(personaje17);
         albumDB.add(personaje9);
        // albumDB.add(codigoPostal);
        // albumDB.add(personaje7);
        // albumDB.add(personaje7);
        
        //VAMOS A INSERTAR LOS PERSONAJES EN NODOS Lista doblemente enlazada
        
        for (int i = 0; i < albumDB.size(); i++) {
            album.insertNode((Personajes) albumDB.get(i));
        }

      /*  boolean validation = list.contains(personaje7);//busco posicion 6
        if (validation) 
            System.out.println("SI lo contiene" );
         else 
            System.out.println("NO lo contiene");
  
      ArrayList<Object> albumDB = new ArrayList<Object>();
      //for (int i = 0; i < list.size() ; i++) {
           // boolean existe = list.contains(codigoPostal);
            
            if (albumDB != null) {
             albumDB.add(codigoPostal);
             System.out.println("El personaje es: " + codigoPostal);
        } else {
                System.out.println("estoy comenzando");
        }
            */
            
         /*   
            if ( existe ) {
               
                albumDB.add(list.indexOf(codigoPostal));
                for (Object personaje : albumDB) {
                System.out.println("El personaje es: " + personaje);
                break;
            
        } 
            } else {
                
                System.out.println("Fallo");
            }
                    
     //   }    */
 
     
         
      //SEPARAR LAS POSTALES REPETIDAS DE LAS QUE NO
      //PERSONAJES REPERTIDOS Y LOS QUE NO , SI EL PERSONAJE ESTA REPETIDO DEBE IR AL REPO DE REPETIDAS SINO AL ALBUM
      
      //PASO #1 CREAR UN ARRAY DE POSTALES QUE INCLUYA TODO
     //  Object busqueda = list.get(0);
         /*      boolean insert = true;
               for (int i = 0; i < list.size() ; i++) {
                   boolean value = true;
                  
                   for (int j = 0; j < albumDB.size(); j++) {
                        if (list.get(i) == albumDB.get(j)) {
                            Object marca = albumDB.get(j);
                System.out.println("El personaje: " + marca + " ya se encuentra en el album");
                            
                            if (insert == true) {
                                value = true;
                                insert = false;
                                break;
                  
                            } else {
                                value = false;
                               // break;
                            }
                        break;
            } else {
                   value = false;
                   insert = true;
                   //break;
            }
                   }
                   
                   if (value == true) {
                       album.insertNode((Personajes) list.get(i));
                   }
        }  */
                        
     
     //
             
   //  Cls_Personajes personaje = new Cls_Personajes();
     
     
     //album.insertNode(personaje.getDatos());
        
        /*
        
          for (Object elemento : miArray) {
            miArray.add(personaje.getDatos());
              System.out.println("Lista>  " + miArray  );
        }
     for (Object elemento : miArray) {
            album.insertNode(miArray);
            System.out.println("insertado> " + miArray);
            
        }  */
        
        //PASO 1 LEER LOS VALORES - IDENTIFICADORES TRAERLOS DE BASE DE DATOS Y LEERLOS
        //PASO 2 CREAR UN ARRAYLIST LISTADO QUE PUEDA GUARDAR DATOS DE DIVERSOS TIPOS
      /*  ArrayList listado = new ArrayList();
        //PASO 3 GAURDAR LOS VALORES QUE TRAJE DE BASE DE DATOS EN EL ARRAY LIST
        listado.add(1010);
        listado.add(1020);
        //PASO 4 VALIDAR SI LOS VALORES BUSCADOS POR USUARIO SON CONTENIDOS EN EL ARRAY LIST
        if (listado.contains(1010)) {
            System.out.println("EL VALOR SI EXIST");
            
        }else{
            //SI QUEREMOS PODEMOS AGREGAR EL VALOR A LA LISTA EN CASO QUE NO EXISTA
            //listado.add(dni);
            System.out.println("EL VALOR NO FUE ENCONTRADO");
        }*/
        
    }   
    
}
    

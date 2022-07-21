package DAO;

import Conexion.CConexion;
//import conexion.CConexion;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
//import java.swing.JOptionPane;
import java.sql.ResultSet;
import java.util.ArrayList;
import listadoblementeenlazada.ListMethods;
import listadoblementeenlazada.Node;
import listadoblementeenlazada.Personajes;

/**
 *
 * @author dsiles
 */
public class Cls_Personajes {
    private final String SQL_SELECT = "SELECT * FROM personajes";
    private DefaultTableModel DT;
    private ResultSet RS;
    private PreparedStatement PS;
    private final CConexion CN;
     ListMethods album = new ListMethods();
    
    public Cls_Personajes(){
    PS = null;
    CN = new CConexion();
    }
    
    //VOY A CREAR UN METODO PRIVATE QUE VOY A UTILIZAR SOLAMENTE EN ESTA CLASE PARA DEFINIR LAS COLUMNAS DE MI TABLA
    private DefaultTableModel setTitulos(){
    DT = new DefaultTableModel();
    DT.addColumn("idpersonajes");
    DT.addColumn("nombre");
    DT.addColumn("personalidad");
    DT.addColumn("ocupacion");
    DT.addColumn("enemigos");
    DT.addColumn("habilidades");
    DT.addColumn("armas");
    DT.addColumn("tipopersonaje");
    return DT;
    }
    
    public DefaultTableModel getDatos() throws SQLException{
        ArrayList<Object> listaPersonajes = new ArrayList<Object>();
        int valor =1;
        try {
            //PASO#1 INVOCAR LOS TITULOS DE MI TABLA, PARA ELLO INVOCO EL METODO SETTITULOS
            setTitulos();
            //PASO#2 LLAMAR SENTENCIAS SQL A TRAVES DE LAS CLASES QUE CREAMOS
            PS = CN.establecerConexion().prepareStatement(SQL_SELECT);
            RS = PS.executeQuery();
            //PASO#3 CREAR UN ARRAY TIPO OBJECT PARA ALMACENAR CADA ROW QUE CONTIENE LA TABLA
            Object[] fila = new Object[8]; //cantidad de columnas de mi tabla 8
            //RECORRO MI OBJETO RS QUE CONTIENE LOS DATOS OBTENIDOS
            while (RS.next()) {    
               // int i =1;
                fila[0] = RS.getInt(1); //fila en posicion columna 0 es igual al ID o sea columan #1 en la DB
                fila[1] = RS.getString(2);
                fila[2] = RS.getString(3);
                fila[3] = RS.getString(4);
                fila[4] = RS.getString(5);
                fila[5] = RS.getString(6);
                fila[6] = RS.getString(7);
                fila[7] = RS.getString(8);
                // fila[1] = RS.getString(2); 
                //agrego las filas al modela de mi tabla
               
               DT.addRow(fila);
               
               //**************************************************************************
               listaPersonajes.add(RS.getInt(1));
               listaPersonajes.add(RS.getString(2));
               listaPersonajes.add(RS.getString(3));
               listaPersonajes.add(RS.getString(4));
               listaPersonajes.add(RS.getString(5));
               listaPersonajes.add(RS.getString(6));
               listaPersonajes.add(RS.getString(7));
               listaPersonajes.add(RS.getString(8));
               
             //  album.insertNode(fila);
               // for (Object columna : listaPersonajes) {
                 //   DT.addColumn(columna);
                   
              //  }
                
               
                
               //***************************************************************************
             /*   for (int i = 0; i < valor ; i++) {
                  ArrayList<Object[]> datos = new ArrayList<Object[]>();
                  Object[] informacion = new Object[8];
                  informacion[i] = new Object[]{fila}; 
                  
                  datos.add((Object[]) informacion[i]);
                  
                  for (Object []DatoPersonal : datos) {
                   DT.addRow(DatoPersonal);
               //    album.insertNode(DatoPersonal);
                }   
              //  Object[]informacion2 = new  Object[]{RS.getInt(1), RS.getString(2),RS.getString(4), RS.getString(5),RS.getString(6),RS.getString(7),RS.getString(8)};
               // Object[]informacion3 = new  Object[]{RS.getInt(1), RS.getString(2),RS.getString(4), RS.getString(5),RS.getString(6),RS.getString(7),RS.getString(8)};
              //  Object[]informacion4 = new  Object[]{RS.getInt(1), RS.getString(2),RS.getString(4), RS.getString(5),RS.getString(6),RS.getString(7),RS.getString(8)};
              //  album.insertNode(informacion1);
              //  album.insertNode(informacion2);
             //   album.insertNode(informacion3);
             
              //  datos.add(informacion2);
               // datos.add(informacion3);
              //  datos.add(informacion4);
                
            //    for (Object []DatoPersonal : datos) {
              //      DT.addRow(DatoPersonal);
             //   }
                //************************************************************************** 
               
       
               // insertNode(DT.addRow(fila));
               // i++;
            }  */
            
            
            }  
            
        } catch (SQLException e) {
            System.out.println("ERROR AL LISTAR LOS DATOS: " + e.getMessage());
        } finally {
          PS = null;
          RS = null;
          CN.close();
        
        }
        
    return DT;
    } 
    
}

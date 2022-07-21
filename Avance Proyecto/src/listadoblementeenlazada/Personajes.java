package listadoblementeenlazada;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author dsiles
 */
public class Personajes {
     private int idPersonaje;
    private String nombre;
    private String personalidad;
    private String ocupacion;
    private String enemigos;
    private String habilidades;
    private String armas;
    private String tipoPersonaje;
    private int idPostal;
    private Object codigoPersonaje;
    
    
   // private int idPostal;
    
        //METODO CONSTRUCTOR POR DEFECTO

    public Personajes() {
        
    }

    public Personajes(int idPostal) {
        this.idPostal = idPostal;
    }
    
    
     //METODO CONSTRUCTOR CON PARAMETROS

    public Personajes( String nombre, String personalidad, String ocupacion, String enemigos, String habilidades, String armas, String tipoPersonaje, int idPostal) {
      //  this.idPersonaje = idPersonaje;
        this.nombre = nombre;
        this.personalidad = personalidad;
        this.ocupacion = ocupacion;
        this.enemigos = enemigos;
        this.habilidades = habilidades;
        this.armas = armas;
        this.tipoPersonaje = tipoPersonaje;
        this.idPostal = idPostal;
    }
    
    

  
    
    public int getIdPersonaje(){
    
        return idPersonaje;
    }

    public void setIdPersonaje(int idPersonaje) {
        this.idPersonaje = idPersonaje;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPersonalidad() {
        return personalidad;
    }

    public void setPersonalidad(String personalidad) {
        this.personalidad = personalidad;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public String getEnemigos() {
        return enemigos;
    }

    public void setEnemigos(String enemigos) {
        this.enemigos = enemigos;
    }

    public String getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(String habilidades) {
        this.habilidades = habilidades;
    }

    public String getArmas() {
        return armas;
    }

    public void setArmas(String armas) {
        this.armas = armas;
    }

    public String getTipoPersonaje() {
        return tipoPersonaje;
    }

    public void setTipoPersonaje(String tipoPersonaje) {
        this.tipoPersonaje = tipoPersonaje;
    }

    public int getIdPostal() {
        return idPostal;
    }

    public void setIdPostal(int idPostal) {
        this.idPostal = idPostal;
    }

    public Object getCodigoPersonaje() {
        return codigoPersonaje;
    }

    //METODOS GET & SET
    public void setCodigoPersonaje(Object codigoPersonaje) {
        this.codigoPersonaje = codigoPersonaje;
    }

    /* public int getIdPostal() {
    return idPostal;
    }
    public void setIdPostal(int idPostal) {
    this.idPostal = idPostal;
    }   */
    public Object ingresarDatos() {
        //YO LE DIGO AL SISTEMA QUE PERSONAJE DEBE INSERTAR EN EL ALBUM, PEDIMOS AL USUARIO LA INFO DE LAS POSTALES/PERSONAJES
        String test = JOptionPane.showInputDialog("Ingrese la informacion del personaje a añadir al album" );
        this.setCodigoPersonaje(test);
        //JOptionPane.showInputDialog("Ingrese la informacion del personaje a añadir al album" );
        
      //  Object codigoP =  codigoPersonaje; 
        System.out.println("CodigoPersonaje : " + this.getCodigoPersonaje() );
        return codigoPersonaje;
    }
     

}

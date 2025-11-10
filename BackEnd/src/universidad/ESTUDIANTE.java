package universidad;

import java.util.ArrayList;

public class ESTUDIANTE extends Persona {
    // atributos privados del estudiante 
    public static ArrayList<ESTUDIANTE> list_est = new ArrayList<>();
    public static ArrayList<String> list_est_id = new ArrayList<>();
    private static int cont = 0;
    private String carrera;
    private double promedio;
    private String ID;
    
    //constructor
    public ESTUDIANTE (String apellido_1, String nombre, int edad, String carrera, double promedio){
        super(apellido_1,nombre,edad);
        this.carrera = carrera;
        this.promedio= promedio;
        this.ID = ID;
        }
    public static void agregarest(String apellido_1, String nombre, int edad,String carrera, double promedio){
        boolean encontrado = false;
        for (ESTUDIANTE i : list_est){
            if (i.getnombre().equals(nombre)){
                System.out.println("El estudiante ya existe");
                encontrado = true;
                break;
            }
        }
        if(!encontrado){
            ESTUDIANTE nuevo = new ESTUDIANTE(apellido_1, nombre, edad, carrera, promedio);
            nuevo.crearID();
            list_est.add(nuevo);
        }
    }
    public static void mostrarest_nom(String nombre){
        boolean encontrado = false;
        for (ESTUDIANTE i : list_est){
            if (i.getnombre().equals(nombre)){
                System.out.println(i);
                System.out.println("Su ID es: "+i.getID());
                encontrado = true;
                break;
            }
        }
        if (!encontrado){
            System.out.println("El estudiante no existe.");
        }     
    }
    public static void mostrarest_id(String ID){
        boolean encontrado = false;
        for (ESTUDIANTE i : list_est){
            if (i.getID().equals(ID)){
                System.out.println(i);
                //System.out.println(i.getID());
                encontrado = true;
                break;
            }
        }
        if (!encontrado){
            System.out.println("El estudiante no existe.");
        }     
    }
    public void crearID(){
        cont++;
        String con = String.valueOf(cont);
        this.ID = "E0"+con;
        list_est_id.add(ID);
    }
    public String getID(){
        return ID;
    }
    public static ESTUDIANTE buscarporid(String ID){
        for (ESTUDIANTE i : list_est){
            if (i.getID().equals(ID)){
                return i;
            }
        }
        return null;
    }
    public String getcarrera(){
    return carrera;
    }
    public void setcarrera(String carrera){
    this.carrera = carrera;
    }
    public double getpromedio(){
    return promedio;
    }
    public void setpromedio(double promedio){
    this.promedio =promedio;
    } 
    public String toString() {
        return super.toString() +"\n"+
               "Carrera: "+ carrera+ "\n"+
               "Promedio: "+ promedio;
    }
}
    


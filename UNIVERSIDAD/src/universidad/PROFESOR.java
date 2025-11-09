package universidad;

import java.util.ArrayList;

public class PROFESOR extends Persona {
   // atributos 
    public static ArrayList<PROFESOR> list_doc = new ArrayList<>();
    public static ArrayList<String> list_doc_id = new ArrayList<>();
    private static int cont = 0;
    private String especialidad;
    private String ID;
    
    //CONSTRUCTOR
    public PROFESOR(String apellido_1, String nombre, int edad, String especialidad){
    super(apellido_1,nombre,edad);
    this.especialidad=especialidad;
    this.ID = ID;
    }
    public static void agregardoc(String apellido_1, String nombre, int edad,String especialidad){
        boolean encontrado = false;
        for (PROFESOR i : list_doc){
            if (i.getnombre().equals(nombre)){
                System.out.println("El docente ya existe");
                encontrado = true;
                break;
            }
        }
        if(!encontrado){
            PROFESOR nuevo = new PROFESOR(apellido_1, nombre, edad, especialidad);
            nuevo.crearID();
            list_doc.add(nuevo);
        }
    }
    public static void mostrardoc_nom(String nombre){
        boolean encontrado = false;
        for (PROFESOR i : list_doc){
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
        public static void mostrardoc_id(String ID){
        boolean encontrado = false;
        for (PROFESOR i : list_doc){
            if (i.getID().equals(ID)){
                System.out.println(i);
                System.out.println("Su ID es: "+i.getID());
                encontrado = true;
                break;
            }            
        }
        if (!encontrado){
            System.out.println("El docente no existe.");
        }
        }
    public void crearID(){
        cont++;
        String con = String.valueOf(cont);
        this.ID = "P0"+cont;
        list_doc_id.add(ID);
    }
    public String getID(){
        return ID;
    }
    public String getespecialidad(){
    return especialidad;
    }
    public void setespecialidad(String especialidad){
    this.especialidad =especialidad;
    }
    public String toString() {
        return super.toString() +"\n"+
               "Especialidad: "+ especialidad;
    }
}


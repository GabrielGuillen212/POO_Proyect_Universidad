package universidad;

import java.util.ArrayList;

public class Curso {
    public static ArrayList<Curso> list_cursos = new ArrayList<>();
    public static ArrayList<String> list_cursos_id = new ArrayList<>();
    private String nombre;
    private String ID;
    private int creditos;
    //constructor
    public Curso (String nombre, int creditos, String ID ){
        this.nombre= nombre;
        this.creditos = creditos;
        this.ID = ID;
        }
    public String getnombre(){
        return nombre;
    }
    public void setnombre(String nombre){
        this.nombre =nombre;
    }
    public String getID(){
        return ID;
    }
    public static Curso buscarporid(String ID){
        for (Curso i : list_cursos){
            if (i.getID().equals(ID)){
                return i;
            }
        }
        return null;
    }
    public static void agregarcurso(String nombre, int creditos, String id){
        boolean encontrado = false;
        for (Curso i : list_cursos){
            if (i.getnombre().equals(nombre)){
                System.out.println("El curso ya existe");
                encontrado = true;
                break;
            }
        }
        if(!encontrado){
            Curso nuevo = new Curso(nombre, creditos, id);
            list_cursos.add(nuevo);
            list_cursos_id.add(id);
        }
    }
    public static void mostrarcurso_nom(String nombre){
        boolean encontrado = false;
        for (Curso i : list_cursos){
            if (i.getnombre().equals(nombre)){
                System.out.println(i);
                encontrado = true;
                break;
            }
        }
        if (!encontrado){
            System.out.println("El curso " + nombre + " no existe.");
        }
            
    }
    public static void mostrarcurso_id(String ID){
        boolean encontrado = false;
        for (Curso i : list_cursos){
            if (i.getID().equals(ID)){
                System.out.println(i);
                encontrado = true;
                break;
            }
        }
        if (!encontrado){
            System.out.println("El curso " + ID + " no existe.");
        }
            
    }
    public int getcreditos(){
        return creditos;
    }
    public void setreditos(int creditos){
        this.creditos =creditos;
    }
    public String toString() {
        return "Curso{ nombre=" + nombre + ", ID curso=" + ID + ", creditos=" + creditos + " }";        
    }
    }

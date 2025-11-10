package universidad;

import java.util.ArrayList;

public class INSCRIPCION {
    private ESTUDIANTE estudiante;
    private Curso curso;
    private ArrayList<Double> notas;
    public static ArrayList<INSCRIPCION> list_ins = new ArrayList<>();
    
    public INSCRIPCION (ESTUDIANTE estudiante, Curso curso){
        this.estudiante = estudiante;
        this.curso = curso;
        this.notas = new ArrayList<>();
    }
    public ESTUDIANTE getest(){
        return estudiante;
    }
    public Curso getcur(){
        return curso;
    }
    public ArrayList<Double> getnotas(){
        return notas;
    }
    public static void agregarins(String ID_est, String ID_cur){
        boolean encontrado = false;
        ESTUDIANTE EST = ESTUDIANTE.buscarporid(ID_est);
        Curso CUR = Curso.buscarporid(ID_cur);
        for (INSCRIPCION i : list_ins){
            if (i.getest().getID().equals(EST.getID()) && i.getcur().getID().equals(CUR.getID())) {
                System.out.println("El estudiante ya esta inscrito en este curso");
                encontrado = true;
            }
        }
        if(!encontrado){
            INSCRIPCION nueva = new INSCRIPCION(EST, CUR);
            list_ins.add(nueva);
        }
    }
    public static void mostrarins(String ID){
        boolean encontrado = false;
        for (INSCRIPCION i : list_ins){
            if (i.getest().getID().equals(ID)){
                System.out.println(i.getcur().getnombre());
                encontrado = true;
            }
        }
        if (!encontrado){
            System.out.println("El estudiante no tiene inscripciones.");
        }
            
    }
    public static INSCRIPCION buscarins(String ID_est, String ID_cur) {
    for (INSCRIPCION ins : list_ins) {
        if (ins.getest().getID().equals(ID_est) && ins.getcur().getID().equals(ID_cur)) {
            return ins;
        }
    }
    return null;
    }
    public static void estporcur(String ID){
        boolean ad = false;
        boolean tieneest = false;
        Curso curso = Curso.buscarporid(ID);
        do{
            if (curso == null){
                System.out.println("No existe el curso con el ID "+ID);
                return;
            }else {
                System.out.println("Lista de estudiantes del curso: "+ curso.getnombre());
                for (INSCRIPCION i : list_ins){
                    if (i.getcur().getID().equals(ID)){
                        ESTUDIANTE est = i.getest();
                        System.out.println("-"+est.getap_1()+" "+est.getnombre()+" con ID "+est.getID());
                        tieneest = true;
                        ad = true;
                    }
                }
            }
        }while (ad != true);
        if (tieneest != true){
            System.out.println("No hay estudiantes en este curso");
        }
    }
    public void agregarnotas(double nota){
        this.notas.add(nota);
    }
    public static void mostrarnotas(String ID_est, String ID_cur){
        ESTUDIANTE est = ESTUDIANTE.buscarporid(ID_est);
        Curso cur = Curso.buscarporid(ID_cur);
        INSCRIPCION ins = buscarins(ID_est,ID_cur);
        System.out.println("Las notas del estudiante "+est.getnombre()+"\n"+
                           "en el curso "+cur.getnombre()+" son: "+ ins.getnotas()); 
    }
    public static double calprom(String ID_est, String ID_cur) {
        INSCRIPCION ins = buscarins(ID_est,ID_cur);
        ArrayList<Double> notas = ins.getnotas();
        if (notas.isEmpty()){ 
            return 0;
        }
        double suma = 0;
        for (double n : notas){ 
            suma += n;
        }
        double promedio = suma / notas.size();
        return promedio;
    }
    public static void verificarap(String ID_curso, double nota_min){
        Curso curso = Curso.buscarporid(ID_curso);
        if (curso == null) {
            System.out.println("No existe el curso con ID " + ID_curso);
            return;
        }
        double prom = 0.0;
        for (INSCRIPCION i : list_ins){
            if (i.getcur().getID().equals(ID_curso)){
                prom = calprom(i.getest().getID(),ID_curso);
                if (prom >= nota_min){
                    ESTUDIANTE est = i.getest();
                    System.out.println("-"+est.getap_1()+" "+est.getnombre()+" AP");
                }else if (prom<nota_min){
                    ESTUDIANTE est = i.getest();
                    System.out.println("-"+est.getap_1()+" "+est.getnombre()+" RP");
                }
            }
        }
    }
}

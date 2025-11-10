package universidad;

abstract class Persona {
    private String nombre;
    private String apellido_1;
    private int edad;
    //constructor
    public Persona (String apellido_1, String nombre, int edad){
        
        this.apellido_1 = apellido_1;

        this.nombre= nombre;
        this.edad= edad;
        }
    public String getap_1(){
    return apellido_1;
    }
    public String getnombre(){
    return nombre;
    }
    public int getedad(){
    return edad;
    }
    public String toString(){
        return "Primer apellido: "+apellido_1+"\n"+
               "Nombre: "+nombre+"\n"+
               "Edad: "+edad;
    }
 }

  

    


    


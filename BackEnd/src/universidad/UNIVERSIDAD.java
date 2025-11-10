package universidad;

import java.util.Scanner;

public abstract class UNIVERSIDAD {

public static void main(String[] args) {
        
        ESTUDIANTE.agregarest("Guillen","Gabriel",23,"computacion",7.3); //ID E01
        ESTUDIANTE.agregarest("Coveña","Barbara",23,"computacion",8.2); //ID E02
        ESTUDIANTE.agregarest("Ramos","Orlando",23,"computacion",8.5); //ID E03

        PROFESOR.agregardoc("Pérez","Juan",43,"Programacion");
        PROFESOR.agregardoc("Torres","Ana",40,"Base de datos");
        
        Curso.agregarcurso("Programacion Orientada a Objetos", 4,"POO101");
        Curso.agregarcurso("Base de Datos", 4,"BD102");
        Curso.agregarcurso("Seguridad Informatica", 4,"SEG201");
        
        INSCRIPCION.agregarins("E01", "POO101");
        INSCRIPCION.agregarins("E02", "POO101");
        INSCRIPCION.agregarins("E03", "POO101");
        
        INSCRIPCION.agregarins("E02", "BD102");
        INSCRIPCION.agregarins("E03", "BD102");
        
        INSCRIPCION.agregarins("E01", "SEG201");
        
        INSCRIPCION.buscarins("E01", "POO101").agregarnotas(5);
        INSCRIPCION.buscarins("E01", "POO101").agregarnotas(6.3);
        INSCRIPCION.buscarins("E01", "POO101").agregarnotas(5.4);
        
        INSCRIPCION.buscarins("E01", "SEG201").agregarnotas(6);
        INSCRIPCION.buscarins("E01", "SEG201").agregarnotas(5.3);
        INSCRIPCION.buscarins("E01", "SEG201").agregarnotas(9.4);
        
        INSCRIPCION.buscarins("E02", "POO101").agregarnotas(6);
        INSCRIPCION.buscarins("E02", "POO101").agregarnotas(8.3);
        INSCRIPCION.buscarins("E02", "POO101").agregarnotas(7.4);
        
        INSCRIPCION.buscarins("E02", "BD102").agregarnotas(9);
        INSCRIPCION.buscarins("E02", "BD102").agregarnotas(6.5);
        INSCRIPCION.buscarins("E02", "BD102").agregarnotas(7.3);
        
        INSCRIPCION.buscarins("E03", "POO101").agregarnotas(7.2);
        INSCRIPCION.buscarins("E03", "POO101").agregarnotas(6);
        INSCRIPCION.buscarins("E03", "POO101").agregarnotas(8.5);
        
        INSCRIPCION.buscarins("E03", "BD102").agregarnotas(6);
        INSCRIPCION.buscarins("E03", "BD102").agregarnotas(8.2);
        INSCRIPCION.buscarins("E03", "BD102").agregarnotas(9);
        
        Scanner sc = new Scanner(System.in);
        
        int opc = 0;
        int opc_2 = 0;
        int opc_3 = 0;
        String we;
        String id_cur = "";
        do{
            System.out.println("bienvenido a nuestro programa");
            System.out.println("Es usted estudiante o Docente\n"+
                               "1.Estudiante\n"+
                               "2.Profesor\n"+
                               "3.Salir");
            System.out.print("Opcion: ");
            we = sc.nextLine();
            try{
                opc = Integer.parseInt(we);
                if (opc < 1 || opc >3){
                    System.out.println("Ingrese una opcion valida");
                }else {
                    switch (opc){
                        case 1:                    
                            do{
                                System.out.println("Que desea hacer:\n"+
                                               "1.Ingresar ID\n"+
                                               "2.Registrase\n"+
                                               "3.Volver al menu anterior");
                                System.out.print("Eliga una Opcion: ");
                                we = sc.nextLine();
                                try{
                                    opc_2 = Integer.parseInt(we);
                                    if (opc < 1 || opc >3){
                                        System.out.println("Ingrese una opcion valida");
                                    }else{
                                        switch (opc_2){
                                            case 1:
                                                boolean id_boo= false;
                                                String blanco = "";
                                                do{
                                                    System.out.print("Ingrese su ID(Deje en blanco si quiere volver al menu anterior): ");
                                                    String id_e = sc.nextLine();
                                                    if (id_e.equals(blanco)){
                                                        id_boo = true;
                                                    }else{
                                                        if (ESTUDIANTE.list_est_id.contains(id_e)){
                                                            do{
                                                                System.out.println("Que desea hacer:\n"+
                                                                                   "1.Lista de cursos\n"+
                                                                                   "2.Lista de estudiantes\n"+
                                                                                   "3.Lista de profesores\n"+
                                                                                   "4.Inscribirse en un curso\n"+
                                                                                   "5.Lista de inscripciones\n"+
                                                                                   "6.Notas o Promedio de un curso\n"+
                                                                                   "7.Salir");
                                                                System.out.print("Eliga una opcion: ");
                                                                int opc_6 = 0;
                                                                try{
                                                                    opc_3 = sc.nextInt();
                                                                    if (opc_3 < 1 || opc_3 > 7){
                                                                        System.out.println("\nEliga una opcion correcta");
                                                                    }else{
                                                                    switch (opc_3){
                                                                        case 1:
                                                                            for (Curso i : Curso.list_cursos){
                                                                                System.out.println("-Nombre: "+i.getnombre()+" ID: "+i.getID());
                                                                            }
                                                                            do{
                                                                                System.out.println("Desea buscar un curso en especifico?\n"+
                                                                                                   "1.Por ID\n"+
                                                                                                   "2.Por nombre\n"+
                                                                                                   "3.salir");
                                                                                System.out.print("Eliga una opcion: ");
                                                                                try{
                                                                                    opc_6 = sc.nextInt();
                                                                                    sc.nextLine();
                                                                                    if (opc_3 < 1 || opc_3 > 3){
                                                                                        System.out.println("\nEliga una opcion correcta");
                                                                                    }else{
                                                                                        switch (opc_6){
                                                                                            case 1:
                                                                                                System.out.println("Ingrese el ID del curso que busca");
                                                                                                String id_bus = sc.nextLine();
                                                                                                Curso.mostrarcurso_id(id_bus);
                                                                                                break;
                                                                                            case 2:
                                                                                                System.out.println("Ingrese el nombre del curso que busca");
                                                                                                String nom_bus = sc.nextLine();
                                                                                                Curso.mostrarcurso_nom(nom_bus);
                                                                                                break;
                                                                                            case 3:
                                                                                                System.out.println("Volviendo");
                                                                                                break;
                                                                                        }
                                                                                    }
                                                                                }catch (NumberFormatException e){
                                                                                    System.out.println("Ingrese una opcion admitida");
                                                                                    sc.nextLine();
                                                                                }
                                                                            }while (opc_6 != 3);
                                                                            break;
                                                                        case 2:
                                                                            for (ESTUDIANTE i : ESTUDIANTE.list_est){
                                                                                System.out.println("-Nombre: "+i.getnombre()+" ID: "+i.getID());
                                                                            }
                                                                            do{
                                                                                System.out.println("Desea buscar un estudiante en especifico?\n"+
                                                                                                   "1.Por ID\n"+
                                                                                                   "2.Por nombre\n"+
                                                                                                   "3.salir");
                                                                                System.out.print("Eliga una opcion: ");
                                                                                try{
                                                                                    opc_6 = sc.nextInt();
                                                                                    sc.nextLine();
                                                                                    if (opc_3 < 1 || opc_3 > 3){
                                                                                        System.out.println("\nEliga una opcion correcta");
                                                                                    }else{
                                                                                        switch (opc_6){
                                                                                            case 1:
                                                                                                System.out.println("Ingrese el ID del estudiante que busca");
                                                                                                String id_bus = sc.nextLine();
                                                                                                ESTUDIANTE.mostrarest_id(id_bus);
                                                                                                break;
                                                                                            case 2:
                                                                                                System.out.println("Ingrese el nombre del estudiante que busca");
                                                                                                String nom_bus = sc.nextLine();
                                                                                                ESTUDIANTE.mostrarest_nom(nom_bus);
                                                                                                break;
                                                                                            case 3:
                                                                                                System.out.println("Volviendo");
                                                                                                break;
                                                                                        }
                                                                                    }
                                                                                }catch (NumberFormatException e){
                                                                                    System.out.println("Ingrese una opcion admitida");
                                                                                    sc.nextLine();
                                                                                }
                                                                            }while (opc_6 != 3);
                                                                            break;
                                                                        case 3:
                                                                            for (PROFESOR i : PROFESOR.list_doc){
                                                                                System.out.println("-Nombre: "+i.getnombre()+" ID: "+i.getID());
                                                                            }
                                                                            do{
                                                                                System.out.println("Desea buscar un profesor en especifico?\n"+
                                                                                                   "1.Por ID\n"+
                                                                                                   "2.Por nombre\n"+
                                                                                                   "3.salir");
                                                                                System.out.print("Eliga una opcion: ");
                                                                                try{
                                                                                    opc_6 = sc.nextInt();
                                                                                    sc.nextLine();
                                                                                    if (opc_3 < 1 || opc_3 > 3){
                                                                                        System.out.println("\nEliga una opcion correcta");
                                                                                    }else{
                                                                                        switch (opc_6){
                                                                                            case 1:
                                                                                                System.out.println("Ingrese el ID del profesor que busca");
                                                                                                String id_bus = sc.nextLine();
                                                                                                PROFESOR.mostrardoc_id(id_bus);
                                                                                                break;
                                                                                            case 2:
                                                                                                System.out.println("Ingrese el nombre del profesor que busca");
                                                                                                String nom_bus = sc.nextLine();
                                                                                                PROFESOR.mostrardoc_nom(nom_bus);
                                                                                                break;
                                                                                            case 3:
                                                                                                System.out.println("Volviendo");
                                                                                                break;
                                                                                        }
                                                                                    }
                                                                                }catch (NumberFormatException e){
                                                                                    System.out.println("Ingrese una opcion admitida");
                                                                                    sc.nextLine();
                                                                                }
                                                                            }while(opc_6 != 3);
                                                                            break;
                                                                        case 4:
                                                                            System.out.println("En que curso desea inscribirse (id_cur)?");
                                                                            sc.nextLine();
                                                                            id_cur = sc.nextLine();
                                                                            INSCRIPCION.agregarins(id_e, id_cur);
                                                                            break;
                                                                        case 5:
                                                                            INSCRIPCION.mostrarins(id_e);
                                                                            break;
                                                                        case 6:
                                                                            int opc_7 = 0;
                                                                            do{
                                                                                System.out.println("Que desea ver?\n"+
                                                                                                   "1.Notas de un curso\n"+
                                                                                                   "2.Promedio de un curso\n"+
                                                                                                   "3.Volver");
                                                                                System.out.print("Eliga una opcion: ");
                                                                                try{
                                                                                    opc_7 = sc.nextInt();
                                                                                    sc.nextLine();
                                                                                    if(opc_7<1 || opc_7>3){
                                                                                        System.out.println("\nEliga una opcion correcta");
                                                                                    }else{
                                                                                        switch (opc_7){
                                                                                            case 1:
                                                                                                System.out.println("Ingrese el id del curso del que desea ver sus notas");
                                                                                                id_cur = sc.nextLine();
                                                                                                INSCRIPCION.mostrarnotas(id_e,id_cur);
                                                                                                break;
                                                                                            case 2:
                                                                                                System.out.println("Ingrese el id del curso del que desea ver su promedio");
                                                                                                id_cur = sc.nextLine();
                                                                                                System.out.println(INSCRIPCION.calprom(id_e,id_cur));
                                                                                                break;
                                                                                            case 3:
                                                                                                System.out.println("Volviendo");
                                                                                                break;
                                                                                        }
                                                                                    }
                                                                                }catch (NumberFormatException e){
                                                                                    System.out.println("Ingrese un opcion valida");
                                                                                }
                                                                            }while (opc_7 != 3);
                                                                        case 7:
                                                                            System.out.println("Saliendo");
                                                                            break;
                                                                    }
                                                                    }
                                                                }catch (Exception e){
                                                                    System.out.println("Ingrese una opcion admitida");
                                                                    sc.nextLine();
                                                                }
                                                            }while (opc_3 != 7);
                                                        sc.nextLine();
                                                        }else if (!ESTUDIANTE.list_est_id.contains(id_e)){
                                                            System.out.println("El id es incorrecto");
                                                        }
                                                        }
                                                }while (!id_boo);
                                                break;
                                            case 2:
                                                boolean ad = false;
                                                String ap_1 = "";
                                                do{
                                                    System.out.println("Ingrese su primer apellido: ");
                                                    ap_1 = sc.nextLine();
                                                    if (ap_1.matches(".*\\d.*")){
                                                        System.out.println("No se permiten numeros");
                                                    }else {
                                                        ad = true;
                                                    }
                                                }while (ad != true);
                                                ad = false;
                                                String nom = "";
                                                do{        
                                                    System.out.println("Ingrese su nombre: ");
                                                    nom = sc.nextLine();
                                                    if (nom.matches(".*\\d.*")){
                                                        System.out.println("No se permiten numeros");
                                                    }else {
                                                        ad = true;
                                                    }
                                                }while (ad != true);
                                                ad = false;
                                                int edad = 0;
                                                do{
                                                    System.out.println("Ingrese su edad: ");
                                                    if (sc.hasNextInt()){
                                                        edad = sc.nextInt();
                                                        sc.nextLine();
                                                        ad = true;
                                                    }else {
                                                        System.out.println("No se permiten letras");
                                                        sc.next();
                                                }
                                                }while (ad != true);
                                                ad = false;
                                                String carr = "";
                                                do{
                                                    System.out.println("Ingrese su carrera: ");
                                                    carr = sc.nextLine();
                                                    if (carr.matches(".*\\d.*")){
                                                        System.out.println("No se permiten numeros");
                                                    }else {
                                                        ad = true;
                                                    }
                                                }while (ad != true);
                                                ad = false;
                                                double prom = 0;
                                                do{
                                                    System.out.println("Ingrese su promedio: ");
                                                    if (sc.hasNextDouble()){
                                                        prom = sc.nextDouble();
                                                        sc.nextLine();
                                                        ad = true;
                                                    }else {
                                                        System.out.println("No se permiten letras");
                                                        sc.nextLine();
                                                    }
                                                }while (ad != true);

                                                ESTUDIANTE.agregarest(ap_1, nom, edad, carr, prom);
                                                ESTUDIANTE.mostrarest_nom(nom);

                                                break;

                                            case 3:             
                                                System.out.println("Volviendo al menu anterior");
                                                break;
                                        }
                                    }
                       
                                }catch(Exception e){
                                    System.out.println("Debe ingrsar una opcion admitida");
                                    sc.nextLine();
                                }
                            }while (opc_2!=3);
                            break;
                        case 2:
                            do{
                                System.out.println("Que desea hacer:\n"+
                                               "1.Ingresar ID\n"+
                                               "2.Registrase\n"+
                                               "3.Volver al menu anterior");
                                System.out.print("Opcion: ");
                                try{
                                    opc_2 = sc.nextInt();
                                    sc.nextLine();
                                    switch (opc_2){
                                        case 1:
                                            boolean id_boo= false;
                                            String blanco = "";
                                            do{
                                                System.out.print("Ingrese su ID(deje en blanco si queire volver): ");
                                                String id_p = sc.nextLine();
                                                if (id_p.equals(blanco)){
                                                    id_boo = true;
                                                }else{
                                                    if (PROFESOR.list_doc_id.contains(id_p)){
                                                        do{
                                                            System.out.println("Que desea hacer:\n"+
                                                                               "1.Lista de cursos\n"+
                                                                               "2.Lista de estudiantes\n"+
                                                                               "3.Lista de profesores\n"+
                                                                               "4.Crear un curso\n"+
                                                                               "5.Lista de estudiantes de un curso\n"+
                                                                               "6.Salir");
                                                            System.out.print("Eliga una opcion: ");
                                                            int opc_8 = 0;
                                                            try{
                                                                opc_3 = sc.nextInt();
                                                                boolean ad = false;
                                                                switch (opc_3){
                                                                    case 1:
                                                                            for (Curso i : Curso.list_cursos){
                                                                                System.out.println("-Nombre: "+i.getnombre()+" ID: "+i.getID());
                                                                            }
                                                                            do{
                                                                                System.out.println("Desea buscar un curso en especifico?\n"+
                                                                                                   "1.Por ID\n"+
                                                                                                   "2.Por nombre\n"+
                                                                                                   "3.salir");
                                                                                System.out.print("Eliga una opcion: ");
                                                                                try{
                                                                                    opc_8 = sc.nextInt();
                                                                                    sc.nextLine();
                                                                                    if (opc_3 < 1 || opc_3 > 3){
                                                                                        System.out.println("\nEliga una opcion correcta");
                                                                                    }else{
                                                                                        switch (opc_8){
                                                                                            case 1:
                                                                                                System.out.println("Ingrese el ID del curso que busca");
                                                                                                String id_bus = sc.nextLine();
                                                                                                Curso.mostrarcurso_id(id_bus);
                                                                                                break;
                                                                                            case 2:
                                                                                                System.out.println("Ingrese el nombre del curso que busca");
                                                                                                String nom_bus = sc.nextLine();
                                                                                                Curso.mostrarcurso_nom(nom_bus);
                                                                                                break;
                                                                                            case 3:
                                                                                                System.out.println("Volviendo");
                                                                                                break;
                                                                                        }
                                                                                    }
                                                                                }catch (NumberFormatException e){
                                                                                    System.out.println("Ingrese una opcion admitida");
                                                                                    sc.nextLine();
                                                                                }
                                                                            }while (opc_8 != 3);
                                                                            break;
                                                                        case 2:
                                                                            for (ESTUDIANTE i : ESTUDIANTE.list_est){
                                                                                System.out.println("-Nombre: "+i.getnombre()+" ID: "+i.getID());
                                                                            }
                                                                            do{
                                                                                System.out.println("Desea buscar un estudiante en especifico?\n"+
                                                                                                   "1.Por ID\n"+
                                                                                                   "2.Por nombre\n"+
                                                                                                   "3.salir");
                                                                                System.out.print("Eliga una opcion: ");
                                                                                try{
                                                                                    opc_8 = sc.nextInt();
                                                                                    sc.nextLine();
                                                                                    if (opc_3 < 1 || opc_3 > 3){
                                                                                        System.out.println("\nEliga una opcion correcta");
                                                                                    }else{
                                                                                        switch (opc_8){
                                                                                            case 1:
                                                                                                System.out.println("Ingrese el ID del estudiante que busca");
                                                                                                String id_bus = sc.nextLine();
                                                                                                ESTUDIANTE.mostrarest_id(id_bus);
                                                                                                break;
                                                                                            case 2:
                                                                                                System.out.println("Ingrese el nombre del estudiante que busca");
                                                                                                String nom_bus = sc.nextLine();
                                                                                                ESTUDIANTE.mostrarest_nom(nom_bus);
                                                                                                break;
                                                                                            case 3:
                                                                                                System.out.println("Volviendo");
                                                                                                break;
                                                                                        }
                                                                                    }
                                                                                }catch (NumberFormatException e){
                                                                                    System.out.println("Ingrese una opcion admitida");
                                                                                    sc.nextLine();
                                                                                }
                                                                            }while (opc_8 != 3);
                                                                            break;
                                                                        case 3:
                                                                            for (PROFESOR i : PROFESOR.list_doc){
                                                                                System.out.println("-Nombre: "+i.getnombre()+" ID: "+i.getID());
                                                                            }
                                                                            do{
                                                                                System.out.println("Desea buscar un profesor en especifico?\n"+
                                                                                                   "1.Por ID\n"+
                                                                                                   "2.Por nombre\n"+
                                                                                                   "3.salir");
                                                                                System.out.print("Eliga una opcion: ");
                                                                                try{
                                                                                    opc_8 = sc.nextInt();
                                                                                    sc.nextLine();
                                                                                    if (opc_3 < 1 || opc_3 > 3){
                                                                                        System.out.println("\nEliga una opcion correcta");
                                                                                    }else{
                                                                                        switch (opc_8){
                                                                                            case 1:
                                                                                                System.out.println("Ingrese el ID del profesor que busca");
                                                                                                String id_bus = sc.nextLine();
                                                                                                PROFESOR.mostrardoc_id(id_bus);
                                                                                                break;
                                                                                            case 2:
                                                                                                System.out.println("Ingrese el nombre del profesor que busca");
                                                                                                String nom_bus = sc.nextLine();
                                                                                                PROFESOR.mostrardoc_nom(nom_bus);
                                                                                                break;
                                                                                            case 3:
                                                                                                System.out.println("Volviendo");
                                                                                                break;
                                                                                        }
                                                                                    }
                                                                                }catch (NumberFormatException e){
                                                                                    System.out.println("Ingrese una opcion admitida");
                                                                                    sc.nextLine();
                                                                                }
                                                                            }while(opc_8 != 3);
                                                                            break;
                                                                    case 4:
                                                                        ad = false;
                                                                        String cur = "";
                                                                        sc.nextLine();
                                                                        do{
                                                                            System.out.println("Como se llamara el curso que desea impartir?");
                                                                            cur = sc.nextLine();
                                                                            try{
                                                                                Integer.parseInt(cur);
                                                                                System.out.println("No se permiten numeros");
                                                                            }catch(NumberFormatException e){
                                                                                ad = true;
                                                                            }
                                                                        }while(ad != true);
                                                                        ad = false;
                                                                        String cre = "";
                                                                        int num = 0;
                                                                        do{
                                                                            System.out.println("Cunatos creditos dara este curso?");
                                                                            cre = sc.nextLine();
                                                                            try{
                                                                                num = Integer.parseInt(cre);
                                                                                ad = true;
                                                                                break;
                                                                            }catch(NumberFormatException e){
                                                                                System.out.println("Ingrese un numero valido");
                                                                            }
                                                                        }while (ad != true);
                                                                        ad = false;
                                                                        do{
                                                                            System.out.println("Cual sera el id del curso?");
                                                                            id_cur = sc.nextLine();
                                                                            try{
                                                                                Integer.parseInt(id_cur);
                                                                                System.out.println("No se permiten numeros");
                                                                            }catch(NumberFormatException e){
                                                                                ad = true;
                                                                            }
                                                                        }while(ad != true);
                                                                        Curso.agregarcurso(cur, num,id_cur);
                                                                        break;
                                                                    case 5:
                                                                        boolean salircur = false;
                                                                        blanco = "";
                                                                        sc.nextLine();
                                                                        do{
                                                                            System.out.println("ID del curso desea ver la lista de estudiante(Deje en blanco si quiere volver al menu anterior): ");
                                                                            String id_curso = sc.nextLine();
                                                                            if (id_curso.equals(blanco)){
                                                                                salircur = true;
                                                                                continue;
                                                                            }else{
                                                                                INSCRIPCION.estporcur(id_curso);
                                                                                int opc_4 = 0;
                                                                                do{
                                                                                System.out.println("Que desea realizar:\n"+
                                                                                                   "1.Ver o registrar notas de un estudiante\n"+
                                                                                                   "2.Estudiantes AP/RP\n"+
                                                                                                   "3.Volver");
                                                                                System.out.print("Opcion: ");
                                                                                opc_4 = sc.nextInt();
                                                                                sc.nextLine();
                                                                                switch (opc_4){
                                                                                    case 1:
                                                                                        int opc_5 = 0;
                                                                                        boolean salirest= false;
                                                                                        do{
                                                                                            System.out.println("1.Ver notas de un estudiante\n"+
                                                                                                               "2.Registrar notas de un estudiante\n"+
                                                                                                               "3.Promedio de un estudiante\n"+
                                                                                                               "4.volver");
                                                                                            System.out.print("Opcion: ");
                                                                                            opc_5 = sc.nextInt();
                                                                                            sc.nextLine();
                                                                                            String id_est = "";
                                                                                            switch (opc_5){
                                                                                                case 1:
                                                                                                    do{
                                                                                                    System.out.println("ID del estudiante(Deje en blanco si quiere volver al menu anterior): ");
                                                                                                    id_est = sc.nextLine();
                                                                                                    if (id_est.equals(blanco)){
                                                                                                        salirest = true;
                                                                                                    }else{              
                                                                                                    INSCRIPCION.mostrarnotas(id_est,id_curso);
                                                                                                    }
                                                                                                    }while (salirest != true);
                                                                                                    break;
                                                                                                case 2:
                                                                                                    System.out.println("ID del estudiante(Deje en blanco si quiere volver al menu anterior): ");
                                                                                                    id_est = sc.nextLine();
                                                                                                    INSCRIPCION ins_2 = INSCRIPCION.buscarins(id_est, id_curso);
                                                                                                    if (ins_2 != null) {
                                                                                                        System.out.println("Ingrese la nota que quiere agregar");
                                                                                                        
                                                                                                        if (sc.hasNextDouble()){
                                                                                                            double nota = sc.nextDouble();
                                                                                                            double min = 0.0;
                                                                                                            double max = 10.0;
                                                                                                            if (nota >= min && nota <= max){
                                                                                                                ins_2.agregarnotas(nota);
                                                                                                            }else {
                                                                                                                System.out.println("El valor no esta dentro de los limites");
                                                                                                            }
                                                                                                        }else {
                                                                                                            System.out.println("No se permiten letras");
                                                                                                        }
                                                                                                    }
                                                                                                    break;
                                                                                                case 3:
                                                                                                    System.out.println("ID del estudiante(Deje en blanco si quiere volver al menu anterior): ");
                                                                                                    id_est = sc.nextLine();
                                                                                                    double prom = INSCRIPCION.calprom(id_est,id_curso);
                                                                                                    INSCRIPCION ins_3 = INSCRIPCION.buscarins(id_est, id_curso);
                                                                                                    System.out.println("El promedio del estudiante "+ins_3.getest().getnombre()+"\n"+
                                                                                                                       "en el curso "+ins_3.getcur().getnombre()+" es: " + prom);
                                                                                                    break;
                                                                                                case 4:
                                                                                                    break;
                                                                                            }
                                                                                        }while (opc_5 != 4);
                                                                                        break;
                                                                                    case 2:
                                                                                        double nota_ap = 7.0;
                                                                                        INSCRIPCION.verificarap(id_curso,nota_ap);
                                                                                        break;
                                                                                    case 3:
                                                                                        break;
                                                                                }
                                                                                }while (opc_4 != 3);
                                                                            }
                                                                        }while (salircur != true);
                                                                        break;
                                                                    case 6:
                                                                        System.out.println("Saliendo");
                                                                        break;
                                                                }
                                                            }catch (Exception e){
                                                                System.out.println("Ingrese una opcion admitida");
                                                                sc.nextLine();
                                                            }

                                                        }while (opc_3 != 6);
                                                    }
                                                    }
                                            }while (id_boo != true);
                                            break;
                                        case 2:
                                            boolean ad = false;
                                            String ap_1 = "";
                                            do{
                                                System.out.println("Ingrese su primer apellido: ");
                                                ap_1 = sc.nextLine();
                                                if (ap_1.matches(".*\\d.*")){
                                                    System.out.println("No se permiten numeros");
                                                }else {
                                                    ad = true;
                                                }
                                            }while (ad != true);
                                            ad = false;
                                            String nom = "";
                                            do{        
                                                System.out.println("Ingrese su nombre: ");
                                                nom = sc.nextLine();
                                                if (nom.matches(".*\\d.*")){
                                                    System.out.println("No se permiten numeros");
                                                }else {
                                                    ad = true;
                                                }
                                            }while (ad != true);
                                            ad = false;
                                            int edad = 0;
                                            do{
                                                System.out.println("Ingrese su edad: ");
                                                if (sc.hasNextInt()){
                                                    edad = sc.nextInt();
                                                    ad = true;
                                                }else {
                                                    System.out.println("No se permiten letras");
                                                    sc.next();
                                                }
                                            }while (ad != true);
                                            ad = false;
                                            String carr = "";
                                            do{
                                                System.out.println("Ingrese su especialidad: ");
                                                sc.nextLine();
                                                carr = sc.nextLine();
                                                if (carr.matches(".*\\d.*")){
                                                    System.out.println("No se permiten numeros");
                                                }else {
                                                    ad = true;
                                                }

                                            }while (ad != true);
                                            
                                            PROFESOR.agregardoc(ap_1, nom, edad, carr);
                                            PROFESOR.mostrardoc_nom(nom);
                                            
                                            break;
                                        case 3:  
                                            System.out.println("Volviendo");
                                            break;
                                    }
                                }catch(Exception e){
                                    System.out.println("Debe ingrsar una opcion admitida");
                                    sc.nextLine();
                                }
                            }while (opc_2!=3);
                            break;
                        case 3:
                            System.out.println("Adios");
                            break;
                    }
                }
            }catch (NumberFormatException e){
                System.out.println("Ingrese un opcion valida");
            }
        }while (opc !=3);
    
    }}

import sereializacionArchivoTexto.GestoraTareasTxt;
import gestoraTareas.Tarea;
import gestoraTareas.TareaClasificacion;
import serializacionArchivoJson.GestoraTareasJsonGson;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        menu();
    }
    public static void menu(){
        Scanner scanner=new Scanner(System.in);
        do {
            System.out.println("choose");
            switch(scanner.nextInt()){
                case 1->guardarEnTareasTxt();
                case 2->leerDeTxt();
                case 3->guardarEnTareasJson();
                case 4->leerDeJson();
                default -> System.out.println("caca");
            }
            System.out.println("n para cortar");
        }while(!scanner.next().equalsIgnoreCase("n"));
    }
    public static void guardarEnTareasTxt(){
        Tarea tarea=new Tarea(TareaClasificacion.GYM,"100 pecho");
        Tarea tarea1=new Tarea(TareaClasificacion.ESTUDIO,"sacar 10");
        Tarea tarea2=new Tarea(TareaClasificacion.HOGAR,"barrer");
        GestoraTareasTxt gestoraTareasTxt =new GestoraTareasTxt(new ArrayList<>());
        gestoraTareasTxt.agregarTarea(tarea2);
        gestoraTareasTxt.agregarTarea(tarea);
        gestoraTareasTxt.agregarTarea(tarea1);
        gestoraTareasTxt.tareasToArchivo();
    }
    public static void leerDeTxt(){
        GestoraTareasTxt gestoraTareasTxt =new GestoraTareasTxt(new ArrayList<>());
        gestoraTareasTxt.archivoToTareas();
        System.out.println(gestoraTareasTxt);
    }
    public static void guardarEnTareasJson(){
        Tarea tarea=new Tarea(TareaClasificacion.GYM,"100 pecho");
        Tarea tarea1=new Tarea(TareaClasificacion.ESTUDIO,"sacar 10");
        Tarea tarea2=new Tarea(TareaClasificacion.HOGAR,"barrer");
        GestoraTareasJsonGson gestoraTareasJsonGson =new GestoraTareasJsonGson(new ArrayList<>());
        gestoraTareasJsonGson.agregarTarea(tarea2);
        gestoraTareasJsonGson.agregarTarea(tarea);
        gestoraTareasJsonGson.agregarTarea(tarea1);
        gestoraTareasJsonGson.tareasToArchivo();
    }
    public static void leerDeJson(){
        GestoraTareasJsonGson gestoraTareasJsonGson =new GestoraTareasJsonGson(new ArrayList<>());
        gestoraTareasJsonGson.archivoToTareas();
        System.out.println(gestoraTareasJsonGson);
    }
}
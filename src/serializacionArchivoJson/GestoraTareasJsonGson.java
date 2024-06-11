package serializacionArchivoJson;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import gestoraTareas.GestoraTareas;
import gestoraTareas.IArchiTarea;
import gestoraTareas.Tarea;

import java.io.*;
import java.util.List;

public class GestoraTareasJsonGson extends GestoraTareas implements IArchiTarea {
    public GestoraTareasJsonGson(List<Tarea> tareas){super(tareas);}
    @Override
    public void archivoToTareas() {
        Gson gson=new Gson();
        try(BufferedReader bufferedReader=new BufferedReader(new FileReader("tareasGson"))){
            tareas=gson.fromJson(bufferedReader,new TypeToken<List<Tarea>>(){}.getType());
        }catch (FileNotFoundException e){
            System.out.println("probelama encontrar archivo");
        }catch(IOException e){
            System.out.println("IOException");
        }
    }
    @Override
    public void tareasToArchivo() {
        Gson gson= new GsonBuilder().setPrettyPrinting().create();
        try(BufferedWriter bufferedWriter=new BufferedWriter(new FileWriter("tareasGson"))){
            gson.toJson(tareas,bufferedWriter);
        }catch (FileNotFoundException e){
            System.out.println("ProblemaCreandoArchivo");
        }catch (IOException e){
            System.out.println("IOExcetion");
        }
    }
}

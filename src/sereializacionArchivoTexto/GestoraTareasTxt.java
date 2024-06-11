package sereializacionArchivoTexto;

import gestoraTareas.GestoraTareas;
import gestoraTareas.IArchiTarea;
import gestoraTareas.Tarea;

import java.io.*;
import java.util.List;

public class GestoraTareasTxt extends GestoraTareas implements IArchiTarea, Serializable{
    public GestoraTareasTxt(List<Tarea> tareas){super(tareas);}
    @Override
    public void tareasToArchivo(){
        try (ObjectOutputStream objectOutputStream=new ObjectOutputStream(new FileOutputStream("tareasTxt"))){
            objectOutputStream.writeObject(tareas);
        }catch (FileNotFoundException e){
            System.out.println("FileNOtFOundException");
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
    @Override
    public void archivoToTareas(){
        try (ObjectInputStream objectInputStream=new ObjectInputStream(new FileInputStream("tareasTxt"))){
            tareas = (List<Tarea>) objectInputStream.readObject();
        } catch (FileNotFoundException e){
            System.out.println("FleNotFoundException");
        } catch (EOFException e){
            System.out.println("problemas con el fin del archivo");
        } catch (ClassNotFoundException e) {
            System.out.println("classNotFoundException");
        } catch (IOException e){
            System.out.println("IOEXCEPTION");
        }
    }
}

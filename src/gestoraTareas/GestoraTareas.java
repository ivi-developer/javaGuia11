package gestoraTareas;

import java.io.Serializable;
import java.util.List;

public class GestoraTareas implements Serializable{
    protected List<Tarea> tareas;
    public GestoraTareas(List<Tarea> tareas){this.tareas = tareas;}
    public void borrarTarea(Tarea tarea){tareas.remove(tarea);}
    public void agregarTarea(Tarea tarea){tareas.add(tarea);}
    @Override
    public String toString() {
        return "gestoraTareas.GestoraTareas{" +
                "tareas=" + tareas +
                '}';
    }
}

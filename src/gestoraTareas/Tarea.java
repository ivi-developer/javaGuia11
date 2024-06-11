package gestoraTareas;

import java.io.Serializable;
import java.util.Objects;

public class Tarea implements Serializable {
    private TareaClasificacion tareaClasificacion;
    private String descripcion;
    public Tarea(TareaClasificacion tareaClasificacion, String descripcion) {
        this.tareaClasificacion = tareaClasificacion;
        this.descripcion = descripcion;
    }
    public TareaClasificacion getTareaClasificacion(){return tareaClasificacion;}
    public void setTareaClasificacion(TareaClasificacion tareaClasificacion){this.tareaClasificacion = tareaClasificacion;}
    public String getDescripcion(){return descripcion;}
    public void setDescripcion(String descripcion){this.descripcion = descripcion;}
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Tarea tarea)) return false;
        return getTareaClasificacion() == tarea.getTareaClasificacion() && Objects.equals(getDescripcion(), tarea.getDescripcion());
    }
    @Override
    public int hashCode(){return Objects.hash(getTareaClasificacion(), getDescripcion());}
    @Override
    public String toString() {
        return "Tarea{" +
                "tareaClasificacion=" + tareaClasificacion +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }

}

package model;
import model.Estudiante;
import java.util.ArrayList;
import java.util.List;

public class Curso {
  private String codigo;
  private String nombre;
  private int numCreditos = 0;
  private String profesor;
  private int maxEstudiantes;
  private ArrayList<Estudiante> estudiantes;

  public Curso( String codigo, String nombre, int numCreditos, String profesor, int maxEstudiantes) {
    this.codigo = codigo;
    this.nombre = nombre;
    this.numCreditos = numCreditos;
    this.profesor = profesor;
    this.maxEstudiantes = maxEstudiantes;
    estudiantes = ArrayList<>();
  }

  public ArrayList inscribirEst(Estudiante estudiante){
    estudiantes.add(estudiante);
    return estudiantes;
  }

  public Boolean eliminarEst(String codigo){
    boolean deleteEs = estudiantes.remove(estudiante.codigo);
    return deleteEs;
  }
  
  public int promedioEdad(){

  }

  public mostrarEst(){

  }

  public verificarCupos(){

  }
}
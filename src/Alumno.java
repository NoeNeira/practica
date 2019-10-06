import java.util.ArrayList;

public class Alumno {
    private  String nombre;
    private  String apellido;
    private int edad;
    private ArrayList<Materia> materias;


    public Alumno(String nombre, String apellido, int edad, ArrayList<Materia> materias) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.materias = materias;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public ArrayList<Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(ArrayList<Materia> materias) {
        this.materias = materias;
    }

    public int getCantidadMaterias(){
        return this.materias.size();
    }

    public void mostrarMaterias(){
        for(int i = 0; i < materias.size(); i++){
            System.out.println(i + " " + materias.get(i).getNombre());
        }
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
//                ", edad=" + edad +
                ", materias=" + materias +
                '}';
    }
}

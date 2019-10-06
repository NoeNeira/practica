import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Materia m1 = new Materia("Lengua");
        Materia m2 = new Materia("Integración");
        Materia m3 = new Materia("Ingeniería de software 2");

        ArrayList<Materia> materias = new ArrayList<>();
        materias.add(m2);
        materias.add(m3);
        materias.add(m1);




        Alumno alumno = new Alumno("Zacarías","Samaniego",28,materias);

        alumno.mostrarMaterias();

//        System.out.println(alumno);
        System.out.println(alumno.getApellido() + " cursa " + alumno.getCantidadMaterias() +" materias.");

//        System.out.println("Alumno: " + alumno.getNombre() + " " + alumno.getApellido());
    }
}

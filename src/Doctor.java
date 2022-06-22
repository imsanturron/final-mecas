import java.time.LocalDate;
import java.util.ArrayList;
import java.util.UUID;

public class Doctor extends Persona implements TurnoFecha {
private UUID matricula;
private String especialidad;
private double precioCons;

    public Doctor() {
        super();
    }

    public Doctor(String nombre, String apellido, UUID matricula, String especialidad, double precioCons) {
        super(nombre, apellido);
        this.matricula = matricula;
        this.especialidad = especialidad;
        this.precioCons = precioCons;
    }

    public UUID getMatricula() {
        return matricula;
    }

    public void setMatricula(UUID matricula) {
        this.matricula = matricula;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public double getPrecioCons() {
        return precioCons;
    }

    public void setPrecioCons(double precioCons) {
        this.precioCons = precioCons;
    }




    @Override
    public void mostrarTurnosDiaX(LocalDate fecha, ArrayList<Turno> turnoss) {

    }
}

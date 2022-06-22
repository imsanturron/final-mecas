import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Objects;

public class Paciente extends Persona implements TurnoFecha{
    private LocalDate fechNacimiento;
    private String direccion;
    private String dni;
    private String cobertura;

    public Paciente() {
        super();
    }

    public Paciente(String nombre, String apellido, LocalDate fechNacimiento, String direccion, String dni, String cobertura) {
        super(nombre, apellido);
        this.fechNacimiento = fechNacimiento;
        this.direccion = direccion;
        this.dni = dni;
        this.cobertura = cobertura;
    }

    public LocalDate getFechNacimiento() {
        return fechNacimiento;
    }

    public void setFechNacimiento(LocalDate fechNacimiento) {
        this.fechNacimiento = fechNacimiento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getCobertura() {
        return cobertura;
    }

    public void setCobertura(String cobertura) {
        this.cobertura = cobertura;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Paciente paciente = (Paciente) o;
        return Objects.equals(dni, paciente.dni);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dni);
    }


    @Override
    public void mostrarTurnosDiaX(LocalDate fecha, ArrayList<Turno> turnoss) {

    }
}

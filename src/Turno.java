import java.time.LocalDate;
import java.util.ArrayList;

public class Turno implements TurnoFecha {
    private LocalDate fecha;
    private Paciente paciente;
    private Doctor doctor;
    private double precio;
    private String estado;

    public Turno() {
    }

    public Turno(LocalDate fecha, Paciente paciente, Doctor doctor, double precio, String estado) {
        this.fecha = fecha;
        this.paciente = paciente;
        this.doctor = doctor;
        this.precio = precio;
        this.estado = estado;
    }

    public void h() {
        estado = Estado.PENDIENTE_DE_PAGO.getStatus();
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public void mostrarTurnosDiaX(LocalDate fecha, ArrayList<Turno> turnoss) {
        for (Turno turnox : turnoss) {
            if (fecha.equals(turnox.getFecha()))
                System.out.println(turnox.toString());
        }
    }
}

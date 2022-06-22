import java.time.LocalDate;
import java.util.ArrayList;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        ArrayList<Paciente> pacientes = new ArrayList<>();
        ArrayList<Doctor> doctores = new ArrayList<>();
        ArrayList<Turno> turnos = new ArrayList<>();

        Paciente pacientex = new Paciente("Juan", "Carlos", LocalDate.of(1989, 7, 4), "Roca 45",
                "45879512", Cobertura.OBRA_SOCIAL.getCobert());

        Doctor doctorx = new Doctor("Dotor", "Nick", UUID.randomUUID(), Especialidad.PEDIATRA.toString(), 1800);
        Turno turno1 = new Turno(LocalDate.now(), pacientex, doctorx, 5840, Estado.PENDIENTE_DE_PAGO.getStatus());

        for (Turno turno : turnos) {
            if (LocalDate.now().equals(turno.getFecha()))
                System.out.println(turno);
        }
    }
}
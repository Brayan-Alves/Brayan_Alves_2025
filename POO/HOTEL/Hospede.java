package POO.HOTEL;
import java.util.List;

public class Hospede {
    private String idHospede;
    private String nome;
    private List<Reserva> reservas;

    public Hospede() {

    }

    public List<Reserva> getReservas() {
        return reservas;
    }
    public void setReserva(Reserva reserva) {
        reservas.add(reserva);
    }

    public String getIdHospede() {
        return idHospede;
    }
    public void setIdHospede(String idHospede) {
        this.idHospede = idHospede;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

}
package POO.HOTEL;

import java.util.List;

public class Quarto {
    private String numero;
    private String tipo;
    private int capacidade;
    private Hotel hotel;
    private List<Reserva> reservas;

    public Quarto() {

    }

    public void setReserva(Reserva reserva) {
        reservas.add(reserva);
    }
    public List<Reserva> getReservas() {
        return reservas;
    }

    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCapacidade() {
        return capacidade;
    }
    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public Hotel getHotel() {
        return hotel;
    }
    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

}
package POO.HOTEL;

public class Reserva {
    private String idReserva;
    private String dataCheckIn;
    private String dataCheckOut;
    private int numeroQuartos;
    private int numeroPessoas;
    private Hospede hospede;
    private Hotel hotel;
    private Quarto quarto;

    public Reserva() {
    }

    public void setQuarto(Quarto quarto) {
        this.quarto = quarto;
    }

    public Quarto getQuarto() {
        return quarto;
    }

    public String getIdReserva() {
        return idReserva;
    }
    public void setIdReserva(String idReserva) {
        this.idReserva = idReserva;
    }

    public int getNumeroQuartos() {
        return numeroQuartos;
    }
    public void setNumeroQuartos(int numeroQuartos) {
        this.numeroQuartos = numeroQuartos;
    }

    public int getNumeroPessoas() {
        return numeroPessoas;
    }
    public void setNumeroPessoas(int numeroPessoas) {
        this.numeroPessoas = numeroPessoas;
    }

    public Hospede getHospede() {
        return hospede;
    }
    public void setHospede(Hospede hospede) {
        this.hospede = hospede;
    }

    public Hotel getHotel() {
        return hotel;
    }
    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public String getDataCheckIn() {
        return dataCheckIn;
    }

    public void setDataCheckIn(String dataCheckIn) {
        this.dataCheckIn = dataCheckIn;
    }

    public String getDataCheckOut() {
        return dataCheckOut;
    }

    public void setDataCheckOut(String dataCheckOut) {
        this.dataCheckOut = dataCheckOut;
    }
}
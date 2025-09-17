package POO.HOTEL;

import java.util.List;

public class Hotel {
    private String idHotel;
    private String nome;
    private String endereco;
    private String cidade;
    private RedeHoteis rede;
    private List<Quarto> quartos;
    private List<Reserva> reservas;

    public Hotel() {
    }

    public List<Quarto> getQuartos() {
        return quartos;
    }
    public void setQuarto(Quarto quarto) {
        quartos.add(quarto);
    }

    public List<Reserva> getReservas() {
        return reservas;
    }
    public void setReserva(Reserva reserva) {
        reservas.add(reserva);
    }

    public String getIdHotel() {
        return idHotel;
    }
    public void setIdHotel(String idHotel) {
        this.idHotel = idHotel;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public RedeHoteis getRede() {
        return rede;
    }
    public void setRede(RedeHoteis rede) {
        this.rede = rede;
    }

}

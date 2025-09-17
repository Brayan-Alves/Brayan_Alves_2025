package POO.HOTEL;

import java.util.List;

public class RedeHoteis {
    private String idRede;
    private String nome;
    private List<Hotel> hoteis;

    public RedeHoteis() {
    }

    public void setHotel(Hotel hotel) {
        hoteis.add(hotel);
    }

    public List<Hotel> getHoteis() {
        return hoteis;
    }

    public String getIdRede() {
        return idRede;
    }

    public void setIdRede(String idRede) {
        this.idRede = idRede;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
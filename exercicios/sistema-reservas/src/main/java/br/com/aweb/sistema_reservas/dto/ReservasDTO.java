package br.com.aweb.sistema_reservas.dto;

public class ReservasDTO {
    private Long id;
    private String data;
    private String cliente;
    
    public ReservasDTO() {
    }

    public ReservasDTO(Long id, String data, String cliente) {
        this.id = id;
        this.data = data;
        this.cliente = cliente;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    
}

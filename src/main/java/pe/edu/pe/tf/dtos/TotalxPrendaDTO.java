package pe.edu.pe.tf.dtos;

public class TotalxPrendaDTO {
    private String Tipo_Prenda;
    private double TotalRecaudado;

    public String getTipo_Prenda() {
        return Tipo_Prenda;
    }

    public void setTipo_Prenda(String tipo_Prenda) {
        Tipo_Prenda = tipo_Prenda;
    }

    public double getTotalRecaudado() {
        return TotalRecaudado;
    }

    public void setTotalRecaudado(double totalRecaudado) {
        TotalRecaudado = totalRecaudado;
    }
}

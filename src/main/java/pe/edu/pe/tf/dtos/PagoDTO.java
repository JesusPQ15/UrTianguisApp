package pe.edu.pe.tf.dtos;
import java.time.LocalDate;

public class PagoDTO {
    private int Id_pago;
    private float Monto;
    private LocalDate Fecha_pago;
    private LocalDate Fecha_vencimiento;
    private String Cod_validacion;
    private String Num_tarjeta_cliente;
    private String Telefono_cliente;
    private int Tipo_Pago_Id_tipo_pago;

    public int getId_pago() {
        return Id_pago;
    }

    public void setId_pago(int id_pago) {
        Id_pago = id_pago;
    }

    public float getMonto() {
        return Monto;
    }

    public void setMonto(float monto) {
        Monto = monto;
    }

    public LocalDate getFecha_pago() {
        return Fecha_pago;
    }

    public void setFecha_pago(LocalDate fecha_pago) {
        Fecha_pago = fecha_pago;
    }

    public LocalDate getFecha_vencimiento() {
        return Fecha_vencimiento;
    }

    public void setFecha_vencimiento(LocalDate fecha_vencimiento) {
        Fecha_vencimiento = fecha_vencimiento;
    }

    public String getCod_validacion() {
        return Cod_validacion;
    }

    public void setCod_validacion(String cod_validacion) {
        Cod_validacion = cod_validacion;
    }

    public String getNum_tarjeta_cliente() {
        return Num_tarjeta_cliente;
    }

    public void setNum_tarjeta_cliente(String num_tarjeta_cliente) {
        Num_tarjeta_cliente = num_tarjeta_cliente;
    }

    public String getTelefono_cliente() {
        return Telefono_cliente;
    }

    public void setTelefono_cliente(String telefono_cliente) {
        Telefono_cliente = telefono_cliente;
    }

    public int getTipo_Pago_Id_tipo_pago() {
        return Tipo_Pago_Id_tipo_pago;
    }

    public void setTipo_Pago_Id_tipo_pago(int tipo_Pago_Id_tipo_pago) {
        Tipo_Pago_Id_tipo_pago = tipo_Pago_Id_tipo_pago;
    }
}

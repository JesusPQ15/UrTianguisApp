package pe.edu.pe.tf.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "pago")
public class Pago {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id_pago;
    @Column(name = "Monto",nullable = false)
    private float Monto;
    @Column(name = "Fecha_pago",nullable = false)
    private LocalDate Fecha_pago;
    @Column(name = "Fecha_vencimiento",nullable = false)
    private LocalDate Fecha_vencimiento;
    @Column(name = "Cod_validacion",nullable = false,length = 10)
    private String Cod_validacion;
    @Column(name = "Num_tarjeta_cliente",nullable = false,length = 20)
    private String Num_tarjeta_cliente;
    @Column(name = "Telefono_cliente",nullable = false,length = 13)
    private String Telefono_cliente;
    @Column(name = "TIPO_PAGO_Id_tipo_pago",nullable = false)
    private int Tipo_Pago_Id_tipo_pago;

    public Pago() {
    }

    public Pago(int id_pago, float monto, LocalDate fecha_pago, LocalDate fecha_vencimiento, String cod_validacion, String num_tarjeta_cliente, String telefono_cliente, int tipo_Pago_Id_tipo_pago) {
        Id_pago = id_pago;
        Monto = monto;
        Fecha_pago = fecha_pago;
        Fecha_vencimiento = fecha_vencimiento;
        Cod_validacion = cod_validacion;
        Num_tarjeta_cliente = num_tarjeta_cliente;
        Telefono_cliente = telefono_cliente;
        Tipo_Pago_Id_tipo_pago = tipo_Pago_Id_tipo_pago;
    }

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
        this.Monto = monto;
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

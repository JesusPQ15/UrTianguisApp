package pe.edu.pe.tf.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
@Entity
@Table(name="det_pedido")
public class Det_Pedido
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id_Det_Pedido;
    @Column(name = "Cantidad",nullable = false)
    private int Cantidad;
    @Column(name = "Precio_total",nullable = false,length = 10)
    private Float Precio_total;
    @Column(name = "Sub_total",nullable = false,length = 10)
    private Float Sub_total;
    @Column(name = "PRENDA_Id_prenda",nullable = false)
    private int PRENDA_Id_prenda;
    @Column(name = "PEDIDO_Id_pedido",nullable = false)
    private int PEDIDO_Id_pedido;
    public Det_Pedido() {

    }

    public Det_Pedido(int id_Det_Pedido, int cantidad, Float precio_total, Float sub_total, int PRENDA_Id_prenda, int PEDIDO_Id_pedido) {
        Id_Det_Pedido = id_Det_Pedido;
        Cantidad = cantidad;
        Precio_total = precio_total;
        Sub_total = sub_total;
        this.PRENDA_Id_prenda = PRENDA_Id_prenda;
        this.PEDIDO_Id_pedido = PEDIDO_Id_pedido;
    }

    public int getId_Det_Pedido() {
        return Id_Det_Pedido;
    }

    public void setId_Det_Pedido(int id_Det_Pedido) {
        Id_Det_Pedido = id_Det_Pedido;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int cantidad) {
        Cantidad = cantidad;
    }

    public Float getPrecio_total() {
        return Precio_total;
    }

    public void setPrecio_total(Float precio_total) {
        Precio_total = precio_total;
    }

    public Float getSub_total() {
        return Sub_total;
    }

    public void setSub_total(Float sub_total) {
        Sub_total = sub_total;
    }

    public int getPRENDA_Id_prenda() {
        return PRENDA_Id_prenda;
    }

    public void setPRENDA_Id_prenda(int PRENDA_Id_prenda) {
        this.PRENDA_Id_prenda = PRENDA_Id_prenda;
    }

    public int getPEDIDO_Id_pedido() {
        return PEDIDO_Id_pedido;
    }

    public void setPEDIDO_Id_pedido(int PEDIDO_Id_pedido) {
        this.PEDIDO_Id_pedido = PEDIDO_Id_pedido;
    }
}

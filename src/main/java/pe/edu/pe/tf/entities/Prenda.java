package pe.edu.pe.tf.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name="prenda")
public class Prenda {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id_prenda;
    @Column(name = "Nombre",nullable = false,length = 50)
    private String Nombre;
    @Column(name = "Descripcion",nullable = false,length = 300)
    private String Descripcion;
    @Column(name = "Precio",nullable = false,length = 10)
    private float Precio;
    @Column(name = "Talla",nullable = false,length = 10)
    private String Talla;
    @Column(name = "Stock",nullable = false)
    private int Stock;
    @Column(name = "Veces_usada",nullable = false)
    private int Veces_usada;
    @Column(name = "I_fecha_creacion",nullable = false)
    private LocalDate I_fecha_creacion;
    @Column(name = "I_fecha_modificacion",nullable = false)
    private LocalDate I_fecha_modificacion;
    @Column(name = "I_creado_por",nullable = false,length = 40)
    private String I_creado_por;
    @Column(name = "I_modificado_por",nullable = false,length = 40)
    private String I_modificado_por;
    @Column(name = "TIPO_PRENDA_Id_tipo_prenda",nullable = false)
    private int TIPO_PRENDA_Id_tipo_prenda;
    @Column(name = "TIENDA_Id_tienda",nullable = false)
    private int TIENDA_Id_tienda;

    public Prenda() {
    }

    public Prenda(int id_prenda, String nombre, String descripcion,
                  float precio, String talla, int stock, int veces_usada,
                  LocalDate i_fecha_creacion, LocalDate i_fecha_modificacion,
                  String i_creado_por, String i_modificado_por,
                  int TIPO_PRENDA_Id_tipo_prenda, int TIENDA_Id_tienda) {
        Id_prenda = id_prenda;
        Nombre = nombre;
        Descripcion = descripcion;
        Precio = precio;
        Talla = talla;
        Stock = stock;
        Veces_usada = veces_usada;
        I_fecha_creacion = i_fecha_creacion;
        I_fecha_modificacion = i_fecha_modificacion;
        I_creado_por = i_creado_por;
        I_modificado_por = i_modificado_por;
        this.TIPO_PRENDA_Id_tipo_prenda = TIPO_PRENDA_Id_tipo_prenda;
        this.TIENDA_Id_tienda = TIENDA_Id_tienda;
    }

    public int getId_prenda() {
        return Id_prenda;
    }

    public void setId_prenda(int id_prenda) {
        Id_prenda = id_prenda;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public float getPrecio() {
        return Precio;
    }

    public void setPrecio(float precio) {
        Precio = precio;
    }

    public String getTalla() {
        return Talla;
    }

    public void setTalla(String talla) {
        Talla = talla;
    }

    public int getStock() {
        return Stock;
    }

    public void setStock(int stock) {
        Stock = stock;
    }

    public int getVeces_usada() {
        return Veces_usada;
    }

    public void setVeces_usada(int veces_usada) {
        Veces_usada = veces_usada;
    }

    public LocalDate getI_fecha_creacion() {
        return I_fecha_creacion;
    }

    public void setI_fecha_creacion(LocalDate i_fecha_creacion) {
        I_fecha_creacion = i_fecha_creacion;
    }

    public LocalDate getI_fecha_modificacion() {
        return I_fecha_modificacion;
    }

    public void setI_fecha_modificacion(LocalDate i_fecha_modificacion) {
        I_fecha_modificacion = i_fecha_modificacion;
    }

    public String getI_creado_por() {
        return I_creado_por;
    }

    public void setI_creado_por(String i_creado_por) {
        I_creado_por = i_creado_por;
    }

    public String getI_modificado_por() {
        return I_modificado_por;
    }

    public void setI_modificado_por(String i_modificado_por) {
        I_modificado_por = i_modificado_por;
    }

    public int getTIPO_PRENDA_Id_tipo_prenda() {
        return TIPO_PRENDA_Id_tipo_prenda;
    }

    public void setTIPO_PRENDA_Id_tipo_prenda(int TIPO_PRENDA_Id_tipo_prenda) {
        this.TIPO_PRENDA_Id_tipo_prenda = TIPO_PRENDA_Id_tipo_prenda;
    }

    public int getTIENDA_Id_tienda() {
        return TIENDA_Id_tienda;
    }

    public void setTIENDA_Id_tienda(int TIENDA_Id_tienda) {
        this.TIENDA_Id_tienda = TIENDA_Id_tienda;
    }
}

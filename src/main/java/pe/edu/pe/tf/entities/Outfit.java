package pe.edu.pe.tf.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name="outfit")
public class Outfit{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id_outfit;
    @Column(name = "Nombre",nullable = false,length = 50)
    private String Nombre;
    @Column(name = "Descripcion",nullable = false,length = 500)
    private String Descripcion;
    @Column(name = "Calificacion",nullable = false)
    private int Calificacion;
    @Column(name = "Imagen",nullable = false,length = 300)
    private String Imagen;
    @Column(name = "I_fecha_creacion",nullable = false)
    private LocalDate I_fecha_creacion;
    @Column(name = "I_fecha_modificacion",nullable = false)
    private LocalDate I_fecha_modificacion;
    @Column(name = "I_creado_por",nullable = false,length = 40)
    private String I_creador_por;
    @Column(name = "I_modificado_por",nullable = false,length = 40)
    private String I_modificado_por;
    @Column(name = "USUARIO_Id_usuario",nullable = false)
    private int USUARIO_Id_usuario;
    @Column(name = "PRENDA_Id_prenda",nullable = false)
    private int PRENDA_Id_prenda;
    @Column(name = "TIPO_OCASION_Id_tipo_ocasion",nullable = false)
    private int TIPO_OCASION_Id_tipo_ocasion;

    public Outfit(){

    }

    public Outfit(int Id_outfit, int TIPO_OCASION_Id_tipo_ocasion, int PRENDA_Id_prenda, int USUARIO_Id_usuario, String i_modificado_por, String i_creador_por, LocalDate i_fecha_modificacion, LocalDate i_fecha_creacion, int calificacion, String descripcion, String nombre, String imagen) {
        this.Id_outfit = Id_outfit;
        this.TIPO_OCASION_Id_tipo_ocasion = TIPO_OCASION_Id_tipo_ocasion;
        this.PRENDA_Id_prenda = PRENDA_Id_prenda;
        this.USUARIO_Id_usuario = USUARIO_Id_usuario;
        I_modificado_por = i_modificado_por;
        I_creador_por = i_creador_por;
        I_fecha_modificacion = i_fecha_modificacion;
        I_fecha_creacion = i_fecha_creacion;
        Calificacion = calificacion;
        Descripcion = descripcion;
        Nombre = nombre;
        Imagen = imagen;
    }

    public int getId_outfit() {
        return Id_outfit;
    }

    public void setId_outfit(int outfit) {
        this.Id_outfit = outfit;
    }

    public LocalDate getI_fecha_creacion() {
        return I_fecha_creacion;
    }

    public void setI_fecha_creacion(LocalDate i_fecha_creacion) {
        I_fecha_creacion = i_fecha_creacion;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public String getI_creador_por() {
        return I_creador_por;
    }

    public void setI_creador_por(String i_creador_por) {
        I_creador_por = i_creador_por;
    }

    public LocalDate getI_fecha_modificacion() {
        return I_fecha_modificacion;
    }

    public void setI_fecha_modificacion(LocalDate i_fecha_modificacion) {
        I_fecha_modificacion = i_fecha_modificacion;
    }

    public String getImagen() {
        return Imagen;
    }

    public void setImagen(String imagen) {
        Imagen = imagen;
    }

    public int getCalificacion() {
        return Calificacion;
    }

    public void setCalificacion(int calificacion) {
        Calificacion = calificacion;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getI_modificado_por() {
        return I_modificado_por;
    }

    public void setI_modificado_por(String i_modificado_por) {
        I_modificado_por = i_modificado_por;
    }

    public int getUSUARIO_Id_usuario() {
        return USUARIO_Id_usuario;
    }

    public void setUSUARIO_Id_usuario(int USUARIO_Id_usuario) {
        this.USUARIO_Id_usuario = USUARIO_Id_usuario;
    }

    public int getPRENDA_Id_prenda() {
        return PRENDA_Id_prenda;
    }

    public void setPRENDA_Id_prenda(int PRENDA_Id_prenda) {
        this.PRENDA_Id_prenda = PRENDA_Id_prenda;
    }

    public int getTIPO_OCASION_Id_tipo_ocasion() {
        return TIPO_OCASION_Id_tipo_ocasion;
    }

    public void setTIPO_OCASION_Id_tipo_ocasion(int TIPO_OCASION_Id_tipo_ocasion) {
        this.TIPO_OCASION_Id_tipo_ocasion = TIPO_OCASION_Id_tipo_ocasion;
    }
}



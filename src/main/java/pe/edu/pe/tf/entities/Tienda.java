package pe.edu.pe.tf.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "tienda")
public class Tienda {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id_tienda;
    @Column(name = "Nombre", nullable = false, length = 50)
    private String Nombre;
    @Column(name = "Ubicacion", nullable = false, length = 100)
    private String Ubicacion;
    @Column(name = "Logo", nullable = false, length = 300)
    private String Logo;
    @Column(name = "USUARIO_Id_usuario", nullable = false)
    private int Id_usuario;

    public Tienda() {

    }

    public Tienda(int id_tienda, String nombre, String ubicacion, String logo, int id_usuario) {
        Id_tienda = id_tienda;
        Nombre = nombre;
        Ubicacion = ubicacion;
        Logo = logo;
        Id_usuario = id_usuario;
    }

    public int getId_tienda() {
        return Id_tienda;
    }

    public void setId_tienda(int id_tienda) {
        Id_tienda = id_tienda;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getUbicacion() {
        return Ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        Ubicacion = ubicacion;
    }

    public String getLogo() {
        return Logo;
    }

    public void setLogo(String logo) {
        Logo = logo;
    }

    public int getId_usuario() {
        return Id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        Id_usuario = id_usuario;
    }
}
package pe.edu.pe.tf.entities;

import jakarta.persistence.*;

@Entity
@Table(name= "Tipo_Prenda")
public class Tipo_Prenda {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int idTipo_Prenda;
    @Column(name="Tipo_Prenda",nullable=false,length=100)
    private String tipo_prenda;
    public Tipo_Prenda ()
    {

    }

    public Tipo_Prenda(int idTipo_Prenda, String tipo_prenda) {
        this.idTipo_Prenda = idTipo_Prenda;
        this.tipo_prenda = tipo_prenda;
    }

    public int getIdTipo_Prenda() {
        return idTipo_Prenda;
    }

    public void setIdTipo_Prenda(int idTipo_Prenda) {
        this.idTipo_Prenda = idTipo_Prenda;
    }

    public String getTipo_prenda() {
        return tipo_prenda;
    }

    public void setTipo_prenda(String tipo_prenda) {
        this.tipo_prenda = tipo_prenda;
    }
}


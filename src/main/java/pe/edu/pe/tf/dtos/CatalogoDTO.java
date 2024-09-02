package pe.edu.pe.tf.dtos;
import java.time.LocalDate;

public class CatalogoDTO {
    private int catalogo;
    private LocalDate I_fecha_creacion;
    private LocalDate I_fecha_modificacion;
    private int OUTFIT_Id_outfit;

    public LocalDate getI_fecha_modificacion() {
        return I_fecha_modificacion;
    }

    public void setI_fecha_modificacion(LocalDate i_fecha_modificacion) {
        I_fecha_modificacion = i_fecha_modificacion;
    }

    public int getOUTFIT_Id_outfit() {
        return OUTFIT_Id_outfit;
    }

    public void setOUTFIT_Id_outfit(int OUTFIT_Id_outfit) {
        this.OUTFIT_Id_outfit = OUTFIT_Id_outfit;
    }

    public int getCatalogo() {
        return catalogo;
    }

    public void setCatalogo(int catalogo) {
        this.catalogo = catalogo;
    }

    public LocalDate getI_fecha_creacion() {
        return I_fecha_creacion;
    }

    public void setI_fecha_creacion(LocalDate i_fecha_creacion) {
        I_fecha_creacion = i_fecha_creacion;
    }
}

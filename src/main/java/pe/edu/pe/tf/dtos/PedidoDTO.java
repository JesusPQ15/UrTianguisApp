package pe.edu.pe.tf.dtos;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class PedidoDTO {
    private int Id_pedido;
    private LocalDate Fecha_solicitud;
    private LocalDateTime Fecha_entrega;
    private LocalDate I_fecha_creacion;
    private String I_creado_por;
    private int ESTADO_PEDIDO_Id_estado_pedido;
    private int PAGO_Id_pago;
    private int USUARIO_Id_usuario;
    private int NOTIFICACION_Id_notificacion;

    public int getId_pedido() {
        return Id_pedido;
    }

    public void setId_pedido(int id_pedido) {
        Id_pedido = id_pedido;
    }

    public LocalDate getFecha_solicitud() {
        return Fecha_solicitud;
    }

    public void setFecha_solicitud(LocalDate fecha_solicitud) {
        Fecha_solicitud = fecha_solicitud;
    }

    public LocalDateTime getFecha_entrega() {
        return Fecha_entrega;
    }

    public void setFecha_entrega(LocalDateTime fecha_entrega) {
        Fecha_entrega = fecha_entrega;
    }

    public LocalDate getI_fecha_creacion() {
        return I_fecha_creacion;
    }

    public void setI_fecha_creacion(LocalDate i_fecha_creacion) {
        I_fecha_creacion = i_fecha_creacion;
    }

    public String getI_creado_por() {
        return I_creado_por;
    }

    public void setI_creado_por(String i_creado_por) {
        I_creado_por = i_creado_por;
    }

    public int getESTADO_PEDIDO_Id_estado_pedido() {
        return ESTADO_PEDIDO_Id_estado_pedido;
    }

    public void setESTADO_PEDIDO_Id_estado_pedido(int ESTADO_PEDIDO_Id_estado_pedido) {
        this.ESTADO_PEDIDO_Id_estado_pedido = ESTADO_PEDIDO_Id_estado_pedido;
    }

    public int getPAGO_Id_pago() {
        return PAGO_Id_pago;
    }

    public void setPAGO_Id_pago(int PAGO_Id_pago) {
        this.PAGO_Id_pago = PAGO_Id_pago;
    }

    public int getUSUARIO_Id_usuario() {
        return USUARIO_Id_usuario;
    }

    public void setUSUARIO_Id_usuario(int USUARIO_Id_usuario) {
        this.USUARIO_Id_usuario = USUARIO_Id_usuario;
    }

    public int getNOTIFICACION_Id_notificacion() {
        return NOTIFICACION_Id_notificacion;
    }

    public void setNOTIFICACION_Id_notificacion(int NOTIFICACION_Id_notificacion) {
        this.NOTIFICACION_Id_notificacion = NOTIFICACION_Id_notificacion;
    }
}

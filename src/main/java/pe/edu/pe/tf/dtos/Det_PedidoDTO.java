package pe.edu.pe.tf.dtos;

public class Det_PedidoDTO {
    private int id_Det_Pedido;
    private int Cantidad;
    private float Precio_total;
    private float Sub_total;
    private int PRENDA_Id_prenda;
    private int PEDIDO_Id_pedido;

    public int getId_Det_Pedido() {
        return id_Det_Pedido;
    }

    public void setId_Det_Pedido(int id_Det_Pedido) {
        this.id_Det_Pedido = id_Det_Pedido;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int cantidad) {
        Cantidad = cantidad;
    }

    public float getPrecio_total() {
        return Precio_total;
    }

    public void setPrecio_total(float precio_total) {
        Precio_total = precio_total;
    }

    public float getSub_total() {
        return Sub_total;
    }

    public void setSub_total(float sub_total) {
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

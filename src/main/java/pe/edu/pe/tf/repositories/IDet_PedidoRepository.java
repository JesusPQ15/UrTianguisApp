package pe.edu.pe.tf.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.pe.tf.entities.Det_Pedido;

import java.util.List;

@Repository
public interface IDet_PedidoRepository extends JpaRepository<Det_Pedido, Integer> {
    @Query(value ="select tp.tipo_prenda, Sum(dp.precio_total) as TotalRecaudado from det_pedido as dp \n" +
            "join prenda as p on dp.id_prenda=p.id_prenda\n" +
            "join tipo_prenda as tp on p.id_tipo_prenda=tp.id_tipo_prenda\n" +
            "group by tp.tipo_prenda" ,nativeQuery = true)
    public List<String[]>TotalxPrenda();
}

package pe.edu.pe.tf.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.pe.tf.entities.Pago;

import java.util.List;

@Repository
public interface IPagoRepository extends JpaRepository<Pago, Integer> {
    @Query(value = " SELECT u.sexo, SUM(p.monto) AS monto_total_pago \n" +
            " FROM usuario u \n" +
            " JOIN pedido pe ON u.id_usuario = pe.id_usuario \n" +
            " JOIN pago p ON pe.id_pago = p.id_pago \n" +
            " GROUP BY u.sexo \n" +
            " ORDER BY monto_total_pago DESC;", nativeQuery = true)
    public List<String[]> sumBySex();

    @Query(value = " SELECT d.nombre_departamento, SUM(p.monto) AS monto_total_pago \n" +
            " FROM usuario u \n" +
            " JOIN pedido pe ON u.id_usuario = pe.id_usuario \n" +
            " JOIN pago p ON pe.id_pago = p.id_pago \n" +
            " JOIN departamento d ON u.id_departamento = d.id_departamento \n" +
            " GROUP BY d.nombre_departamento \n" +
            " ORDER BY monto_total_pago DESC;", nativeQuery = true)
    public List<String[]> sumByDepartment();
}

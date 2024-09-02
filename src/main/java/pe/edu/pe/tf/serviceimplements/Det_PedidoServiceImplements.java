package pe.edu.pe.tf.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.pe.tf.entities.Det_Pedido;
import pe.edu.pe.tf.entities.Prenda;
import pe.edu.pe.tf.repositories.IDet_PedidoRepository;
import pe.edu.pe.tf.serviceinterface.IDet_PedidoService;

import java.util.List;

@Service
public class Det_PedidoServiceImplements implements IDet_PedidoService {
    @Autowired
    private IDet_PedidoRepository dP;
    @Override
    public List<Det_Pedido> list() {
        return dP.findAll();
    }
    @Override
    public void insert(Det_Pedido p) {
        dP.save(p);
    }
    @Override
    public void update(Det_Pedido p) {
        dP.save(p);
    }
    @Override
    public void delete(int id) {
        dP.deleteById(id);
    }
}

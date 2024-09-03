package pe.edu.pe.tf.serviceinterface;

import pe.edu.pe.tf.entities.Prenda;

import java.util.List;

public interface IPrendaService {
    public List<Prenda> list();
    public void insert(Prenda p);
    public void update(Prenda p);
    public void delete(int id);
}

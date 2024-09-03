package pe.edu.pe.tf.serviceinterface;

import pe.edu.pe.tf.entities.Catalogo;

import java.util.List;

public interface ICatalogoService {
    public List<Catalogo> list();
    public void insert (Catalogo c);
    public void update (Catalogo c);
    public void delete (int id);
}

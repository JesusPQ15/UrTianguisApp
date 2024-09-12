package pe.edu.pe.tf.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.pe.tf.dtos.Comentario_outfitDTO;
import pe.edu.pe.tf.entities.Comentario_outfit;
import pe.edu.pe.tf.serviceinterface.IComentario_outfitService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/Comentario_outfit")
public class Comentario_outfitController {
    @Autowired
    private IComentario_outfitService cS;
    @GetMapping("/listarprobandoruta")
    public List<Comentario_outfitDTO>listar(){
        return cS.list().stream().map(x->{
            ModelMapper m= new ModelMapper();
            return m.map(x,Comentario_outfitDTO.class);
        }).collect(Collectors.toList());
    }
    @PostMapping
    public void insertar(@RequestBody Comentario_outfitDTO dto){
        ModelMapper m= new ModelMapper();
        Comentario_outfit com=m.map(dto,Comentario_outfit.class);
        cS.insert(com);
    }
    @PutMapping
    public void modificar(@RequestBody Comentario_outfitDTO dto){
        ModelMapper m= new ModelMapper();
        Comentario_outfit com = m.map(dto,Comentario_outfit.class);
        cS.update(com);
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable ("Id") Integer id){
        cS.delete(id);
    }
}

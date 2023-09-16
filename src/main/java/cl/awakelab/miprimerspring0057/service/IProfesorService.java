package cl.awakelab.miprimerspring0057.service.serviceimpl;

import cl.awakelab.miprimerspring0057.entity.Curso;
import cl.awakelab.miprimerspring0057.entity.Profesor;
import cl.awakelab.miprimerspring0057.entity.Usuario;

import java.util.List;

public interface IProfesorService {

    public Profesor crearProfesor(Profesor objetoProfesor);
    public Profesor actualizarProfesor(int id);
    public List<Profesor> ListarProfesor();
    public void eliminarProfesor(int id);
    public Profesor ListarProfesorId(int id);
}

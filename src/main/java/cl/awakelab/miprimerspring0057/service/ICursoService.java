package cl.awakelab.miprimerspring0057.service.serviceimpl;

import cl.awakelab.miprimerspring0057.entity.Curso;
import cl.awakelab.miprimerspring0057.entity.Usuario;

import java.util.List;

public interface ICursoService {
    public Curso crearCurso(Curso objetoCurso);
    public Curso actualizarCurso(int id);
    public List<Curso> ListarCursos();
    public void eliminarCurso(int id);
    public Curso ListarCursoId(int id);

}

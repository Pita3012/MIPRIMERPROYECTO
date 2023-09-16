package cl.awakelab.miprimerspring0057.service.serviceimpl;

import cl.awakelab.miprimerspring0057.entity.Alumno;
import cl.awakelab.miprimerspring0057.entity.Usuario;

import java.util.List;

public interface IAlumnoService {

    public Alumno crearAlumno(Alumno objetoalumno);
    public Alumno actualizarAlumno(int id);
    public List<Alumno> listarAlumno();
    public void eliminarAlumno(int id);
    public Alumno ListarAlumnoId(int id);


}

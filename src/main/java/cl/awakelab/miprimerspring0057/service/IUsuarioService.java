package cl.awakelab.miprimerspring0057.service.serviceimpl;

import cl.awakelab.miprimerspring0057.entity.Curso;
import cl.awakelab.miprimerspring0057.entity.Usuario;

import java.util.List;

public interface IUsuarioService {

    public Usuario crearUsuario(Usuario objetoUsuario);
    public Usuario actualizarUsuario(int id);
    public List<Usuario> ListarUsuario();
    public Usuario ListarUsuarioId(int id);
    public void eliminarUsuario(int id);

}

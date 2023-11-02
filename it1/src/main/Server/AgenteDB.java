package ISO2_2023_B01.it1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import Usuario;
public class AgenteDB {
    private Connection conexion;
    private String usuario;
    private Object miInstance;

    public AgenteDB(Connection conexion, String usuario, Object miInstance) {
        this.conexion = conexion;
        this.usuario = usuario;
        this.miInstance = miInstance;
    }

    public void Conectar() {
    }

    public void Desconectar() {
    }

    public void guardarUsuario(Usuario usuario) {
    }

    public void eliminarUsuario(int usuarioId) {
    }

    public void actualizarUsuario(int usuarioId, Usuario nuevosDatos) {
    }

    public Usuario obtenerUsuario(int usuarioId) {
        return null;
    }

    public Object getAgent() {
        return null;
    }
}
}

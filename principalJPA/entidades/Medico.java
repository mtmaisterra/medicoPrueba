package principalJPA.entidades;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

//@NamedQueries({
//    @NamedQuery(name = "Medico.buscarTodos", query = "SELECT m FROM Medico m"
//    )
//    ,
//@NamedQuery(name = "Medico.buscarPorId", query = "SELECT m FROM Medico m WHERE m.id = :id"
//    )
//})

@Entity
@Table(name = "Médicos")
public class Medico implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "Nombre", length = 20, nullable = false)
    private String nombre;
    @Column(name = "Apellido", length = 20, nullable = false)
    private String apellido;
    @Column(name = "Especialidad", length = 20, nullable = false)
    private String especialidad;
    @OneToMany
    private Set<Turno> turnos;

    /*SET es un conjunto*/
    public Medico() {
    }

    public Medico(String nombre, String apellido, String especialidad, Set<Turno> turnos) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.especialidad = especialidad;
        this.turnos = turnos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public Set<Turno> getTurnos() {
        return turnos;
    }

    public void setTurnos(Set<Turno> turnos) {
        this.turnos = turnos;
    }

    public Long getId() {
        return id;
    }
    
}

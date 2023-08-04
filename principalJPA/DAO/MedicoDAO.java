package principalJPA.DAO;

import java.util.List;
import java.util.Scanner;
import principalJPA.entidades.Medico;

public class MedicoDAO extends DAO<Medico> {
    
Scanner leer = new Scanner(System.in).useDelimiter("\n");

    
    public MedicoDAO() {
        super();
    }

    public void crearMedico(Medico medico) {
        super.create(medico);
    }

    public void editarMedico(Medico medico) {
        super.update(medico);
    }

    public void borrarMedico(Long id) {
        Medico medico = findId(id);
        super.delete(medico);
    }

    private Medico findId(Long id) {
        super.conect();
        Medico medico = em.createNamedQuery("Medico.buscarPorId", Medico.class).setParameter("id", id).getSingleResult();
        super.disconect();
        return medico;
    }

    public List<Medico> listarMedicos() {
        super.conect();
        List<Medico> medicos = em.createNamedQuery("Medico.buscarTodos", Medico.class).getResultList();
        super.disconect();
        return medicos;
        /*NamedQuery permite ver una consulta ordenada*/
    }

    public Long cantidadMedicos() {
        super.conect();
        Long cantidad = (Long) em.createNativeQuery("SELECT COUNT(*) FROM Medicos").getSingleResult();
        super.disconect();
        return cantidad;
        /*El (Long) es un casteo que indica que se obliga a dar un resultado*/
    }

    public Medico buscarPorEspecialidad() {        
        super.conect();
          System.out.println("Ingrese la especialidad a mostrar");    
          String especialidad = leer.next();
        Medico medico = em.createQuery("SELECT  m FROM Medico m WHERE  m.especialidad =:especialidad LIMIT 1", 
                Medico.class).setParameter("especialidad", especialidad).getSingleResult();
                super.disconect();
        return medico;
    }
    
     public Medico buscarPorApellido() {
        super.conect();
         System.out.println("Ingrese el apellido del medico");
         String apellido = leer.next();
        Medico medico = em.createQuery("SELECT  m FROM Medico m WHERE  m.apellido =:apellido ", 
                Medico.class).setParameter("Apellido", apellido).getSingleResult();
                super.disconect();
        return medico;
    }
    
    
    
}

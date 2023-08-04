package principalJPA.servicios;


import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import principalJPA.DAO.MedicoDAO;
import principalJPA.entidades.Medico;


public class MedicoServicios {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Medico medico = new Medico();
    MedicoDAO medicoDao = new MedicoDAO();
        
    public Medico cargarMedico(){
      
        System.out.println("Ingrese el nombre del médico");
        medico.setNombre(leer.next());
        System.out.println("Ingrese el apellido del médico");
        medico.setApellido(leer.next());
        System.out.println("Ingrese la especialidad");
        medico.setEspecialidad(leer.next());
      medicoDao.crearMedico(medico);

        Set<Medico> medicos= new HashSet<>();      
       medicos.add(medico);     
       return medico;              
    }
}

package principalJPA;

import java.util.Scanner;
import principalJPA.DAO.MedicoDAO;
import principalJPA.DAO.PacienteDAO;
import principalJPA.DAO.TurnoDAO;
import principalJPA.entidades.Medico;
import principalJPA.entidades.Paciente;
import principalJPA.entidades.Turno;
import principalJPA.servicios.MedicoServicios;
import principalJPA.servicios.PacienteServicios;
import principalJPA.servicios.TurnoServicios;


public class MedicoPruebaJPA {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        boolean menu = true;
        
      MedicoServicios medicoS = new MedicoServicios();
      PacienteServicios pacienteS = new PacienteServicios();
      TurnoServicios turnoS = new TurnoServicios();
      Turno turno = new Turno();
      Medico medico = new Medico();
      Paciente paciente = new Paciente();
      TurnoDAO turnoD = new TurnoDAO();
      PacienteDAO pacienteD = new PacienteDAO();
      MedicoDAO medicoD = new MedicoDAO();
     
        System.out.println("     Bienvenido al Consultorio M&M     ");
        System.out.println("***************************************");
        System.out.println("Elija una opción del Menú");
        System.out.println("1- Ingresar nuevo médico");
        System.out.println("2- Ingresar un nuevo paciente");
        System.out.println("3- Sacar un turno");
        System.out.println("4- Consultar médicos por especilidad");
        System.out.println("5- Consultar médicos por apellido");
        System.out.println("6- Consultar pacientes por documento");
        System.out.println("7- Consultar pacientes por patologia");
        System.out.println("8- Consultar  turnos por día");
        System.out.println("9- Consultar turnos por médico");
        System.out.println("10- Salir");
        System.out.println("****************************************");
        int opcion = leer.nextInt();
        
          switch (opcion) {
              case 1:
                  medicoS.cargarMedico();
                  break;
              case 2:
                  pacienteS.cargarPaciente();
                  break;
              case 3:
                  turnoD.crear(turno);
                  break;
              case 4:
                                   
                  medicoD.buscarPorEspecialidad();
                  break;
              case 5:                  
                  medicoD.buscarPorApellido();
                  break;
              case 6:
                  pacienteD.listarPacientesPorDocumento();
                  break;
              case 7:
                  pacienteD.listarPacientesPorPatologia();
                  break;
              case 8:
                 turnoD.listarTurnoPorDia();
                  break;
              case 9:
                  turnoD.listarTurnoPorMedico();
                  break;
              case 10:
                  menu = false;
                  System.out.println("Gracias por usar nuestro servicio");
                  break;
          }
        
    }
   
    
}

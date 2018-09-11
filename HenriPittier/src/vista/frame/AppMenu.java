/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista.frame;

//import Vista.Frame.InicioSesion;  
import vista.frame.*;
import vista.panel.empleados.ModificarEmpleado;
import vista.panel.Inicio;
import vista.panel.empleados.RegistrarEmpleado;
import java.awt.CardLayout;
import vista.panel.empleados.BorrarEmpleado;
import vista.panel.empleados.ConsultarEmpleados;
import vista.panel.estudiantes.AsignarEstGrupo;
import vista.panel.estudiantes.AsignarRelacion;
import vista.panel.estudiantes.BorrarEstGrupo;
import vista.panel.estudiantes.BorrarEstudiante;
import vista.panel.estudiantes.ConsultarEstGrupo;
import vista.panel.estudiantes.ConsultarEstudiantes;
import vista.panel.estudiantes.ConsultarRelacion;
import vista.panel.estudiantes.EliminarRelacion;
import vista.panel.estudiantes.ModificarEstudiante;
import vista.panel.estudiantes.RegistrarEstudiante;
import vista.panel.grupos.BorrarGrupo;
import vista.panel.grupos.ConsultarGrupos;
import vista.panel.grupos.ModificarGrupo;
import vista.panel.grupos.RegistrarGrupo;
import vista.panel.inasistencias.BorrarInasistencia;
import vista.panel.inasistencias.ConsultarInasistencias;
import vista.panel.inasistencias.ModificarInasistencia;
import vista.panel.inasistencias.RegistrarInasistencia;
import vista.panel.representantes.BorrarRepresentante;
import vista.panel.representantes.ConsultarRepresentantes;
import vista.panel.representantes.ModificarMensualidad;
import vista.panel.representantes.ModificarRepresentante;
import vista.panel.representantes.RegistrarMensualidad;
import vista.panel.representantes.BorrarMensualidad;
import vista.panel.representantes.ConsultarMensualidad;
import vista.panel.representantes.RegistrarRepresentante;
import vista.panel.suplencias.BorrarSuplencia;
import vista.panel.suplencias.ConsultarSuplencias;
import vista.panel.suplencias.ModificarSuplencia;
import vista.panel.suplencias.RegistrarSuplencia;


public class AppMenu extends javax.swing.JFrame {
    final static String PANELINICIO = "PANELINICIO";
    Inicio inicioPanel = new Inicio();
    
    //ESTUDIANTES
    final static String REGISTRARESTUDIANTE = "REGISTRARESTUDIANTE";
    final static String MODIFICARESTUDIANTE = "MODIFICARESTUDIANTE";
    final static String BORRARESTUDIANTE = "BORRARESTUDIANTE";
    final static String CONSULTARESTUDIANTES = "CONSULTARESTUDIANTES";
    
    RegistrarEstudiante registrarEstudiantePanel = new RegistrarEstudiante();
    ModificarEstudiante modificarEstudiantePanel = new ModificarEstudiante();
    BorrarEstudiante borrarEstudiantePanel = new BorrarEstudiante();
    ConsultarEstudiantes consultarEstudiantesPanel = new ConsultarEstudiantes();
    
    //REPRESENTANTES
    final static String REGISTRARREPRESENTANTE = "REGISTRARREPRESENTANTE";
    final static String MODIFICARREPRESENTANTE = "MODIFICARREPRESENTANTE";
    final static String BORRARREPRESENTANTE = "BORRARREPRESENTANTE";
    final static String CONSULTARREPRESENTANTES = "CONSULTARREPRESENTANTES";
    
    RegistrarRepresentante registrarRepresentantePanel = new RegistrarRepresentante();
    ModificarRepresentante modificarRepresentantePanel = new ModificarRepresentante();
    BorrarRepresentante borrarRepresentantePanel = new BorrarRepresentante();
    ConsultarRepresentantes consultarRepresentantesPanel = new ConsultarRepresentantes();
    
    //EMPLEADOS
    final static String REGISTRAREMPLEADO = "REGISTRAREMPELADO";
    final static String MODIFICAREMPLEADO = "MODIFICAREMPLEADO";
    final static String BORRAREMPLEADO = "BORRAREMPLEADO";
    final static String CONSULTAREMPLEADOS = "CONSULTAREMPLEADOS";
    
    RegistrarEmpleado registrarEmpleadoPanel = new RegistrarEmpleado();
    ModificarEmpleado modificarEmpleadoPanel = new ModificarEmpleado();
    BorrarEmpleado borrarEmpleadoPanel = new BorrarEmpleado();
    ConsultarEmpleados consultarEmpleadosPanel = new ConsultarEmpleados();
    
    //INASISTENCIAS
    final static String REGISTRARINASISTENCIA = "REGISTRARINASISTENCIA";
    final static String MODIFICARINASISTENCIA = "MODIFICARINASISTENCIA";
    final static String BORRARINASISTENCIA = "BORRARINASISTENCIA";
    final static String CONSULTARINASISTENCIAS = "CONSULTARINASISTENCIAS";
    
    RegistrarInasistencia registrarInasistenciaPanel = new RegistrarInasistencia();
    ModificarInasistencia modificarInasistenciaPanel = new ModificarInasistencia();
    BorrarInasistencia borrarInasistenciaPanel = new BorrarInasistencia();
    ConsultarInasistencias consultarInasistenciasPanel = new ConsultarInasistencias();
    
    //SUPLENCIAS
    final static String REGISTRARSUPLENCIA = "REGISTRARSUPLENCIA";
    final static String MODIFICARSUPLENCIA = "MODIFICARSUPLENCIA";
    final static String BORRARSUPLENCIA = "BORRARSUPLENCIA";
    final static String CONSULTARSUPLENCIAS = "CONSULTARSUPLENCIAS";
    
    RegistrarSuplencia registrarSuplenciaPanel = new RegistrarSuplencia();
    ModificarSuplencia modificarSuplenciaPanel = new ModificarSuplencia();
    BorrarSuplencia borrarSuplenciaPanel = new BorrarSuplencia();
    ConsultarSuplencias consultarSuplenciasPanel = new ConsultarSuplencias();
    
    //GRUPOS
    final static String REGISTRARGRUPO = "REGISTRARGRUPO";
    final static String MODIFICARGRUPO = "MODIFICARGRUPO";
    final static String BORRARGRUPO = "BORRARGRUPO";
    final static String CONSULTARGRUPOS = "CONSULTARGRUPOS";
    
    RegistrarGrupo registrarGrupoPanel = new RegistrarGrupo();
    ModificarGrupo modificarGrupoPanel = new ModificarGrupo();
    BorrarGrupo borrarGrupoPanel = new BorrarGrupo();
    ConsultarGrupos consultarGruposPanel = new ConsultarGrupos();
    
    //RELACION ESTUDIANTE-REPRESENTANTE
    final static String ASIGNARRELACION = "ASIGNARRELACION";
    final static String ELIMINARRELACION = "ELIMINARRELACION";
    final static String CONSULTARRELACION = "CONSULTARRELACION";
    
    AsignarRelacion asignarRelacionPanel = new AsignarRelacion();
    EliminarRelacion eliminarRelacionPanel = new EliminarRelacion();
    ConsultarRelacion consultarRelacionPanel = new ConsultarRelacion();
    
    //RELACION MENSUALIDAD-REPRESENTANTE
    final static String REGISTRARMENSUALIDAD = "REGISTRARMENSUALIDAD";
    final static String MODIFICARMENSUALIDAD = "MODIFICARMENSUALIDAD";
    final static String BORRARMENSUALIDAD = "BORRARMENSUALIDAD";
    final static String CONSULTARMENSUALIDAD = "CONSULTARMENSUALIDAD";
    
    RegistrarMensualidad registrarMensualidadPanel = new RegistrarMensualidad();
    ModificarMensualidad modificarMensualidadPanel = new ModificarMensualidad();
    BorrarMensualidad borrarMensualidadPanel = new BorrarMensualidad();
    ConsultarMensualidad consultarMensualidadPanel = new ConsultarMensualidad();
    
    //RELACION ESTUDIANTE-GRUPO
    final static String ASIGNARESTUDIANTEGRUPO = "ASIGNARESTUDIANTEGRUPO";
    final static String BORRARESTUDIANTEGRUPO = "BORRARESTUDIANTEGRUPO";
    final static String CONSULTARESTUDIANTEGRUPO = "BORRARESTUDIANTEGRUPO";
    
    AsignarEstGrupo asignarEstGrupoPanel = new AsignarEstGrupo();
    BorrarEstGrupo borrarEstGrupoPanel = new BorrarEstGrupo();
    ConsultarEstGrupo consultarEstGrupoPanel = new ConsultarEstGrupo();
    
    
    /**
     * Creates new form AppMenu
     */
    public AppMenu() {
        initComponents();
        this.setLocationRelativeTo(null);
        contentPane.add(inicioPanel, PANELINICIO);
        
        //ESTUDIANTES
        contentPane.add(registrarEstudiantePanel, REGISTRARESTUDIANTE);
        contentPane.add(modificarEstudiantePanel, MODIFICARESTUDIANTE);
        contentPane.add(borrarEstudiantePanel, BORRARESTUDIANTE);
        contentPane.add(consultarEstudiantesPanel, CONSULTARESTUDIANTES);
        
        //REPRESENTANTES
        contentPane.add(registrarRepresentantePanel, REGISTRARREPRESENTANTE);
        contentPane.add(modificarRepresentantePanel, MODIFICARREPRESENTANTE);
        contentPane.add(borrarRepresentantePanel, BORRARREPRESENTANTE);
        contentPane.add(consultarRepresentantesPanel, CONSULTARREPRESENTANTES);
        
        //EMPLEADOS
        contentPane.add(registrarEmpleadoPanel, REGISTRAREMPLEADO);
        contentPane.add(modificarEmpleadoPanel, MODIFICAREMPLEADO);
        contentPane.add(borrarEmpleadoPanel, BORRAREMPLEADO);
        contentPane.add(consultarEmpleadosPanel, CONSULTAREMPLEADOS);
        
        //INASISTENCIAS
        contentPane.add(registrarInasistenciaPanel, REGISTRARINASISTENCIA);
        contentPane.add(modificarInasistenciaPanel, MODIFICARINASISTENCIA);
        contentPane.add(borrarInasistenciaPanel, BORRARINASISTENCIA);
        contentPane.add(consultarInasistenciasPanel, CONSULTARINASISTENCIAS);
        
        //SUPLENCIAS
        contentPane.add(registrarSuplenciaPanel, REGISTRARSUPLENCIA);
        contentPane.add(modificarSuplenciaPanel, MODIFICARSUPLENCIA);
        contentPane.add(borrarSuplenciaPanel, BORRARSUPLENCIA);
        contentPane.add(consultarSuplenciasPanel, CONSULTARSUPLENCIAS);
        
        //GRUPOS
        contentPane.add(registrarGrupoPanel, REGISTRARGRUPO);
        contentPane.add(modificarGrupoPanel, MODIFICARGRUPO);
        contentPane.add(borrarGrupoPanel, BORRARGRUPO);
        contentPane.add(consultarGruposPanel, CONSULTARGRUPOS);
        
        //RELACION ESTUDIANTE-REPRESENTANTE
        contentPane.add(asignarRelacionPanel, ASIGNARRELACION);
        contentPane.add(eliminarRelacionPanel, ELIMINARRELACION);
        contentPane.add(consultarRelacionPanel, CONSULTARRELACION);
        
        //MENSUALIDAD-REPRESENTANTE
        contentPane.add(registrarMensualidadPanel, REGISTRARMENSUALIDAD);
        contentPane.add(modificarMensualidadPanel, MODIFICARMENSUALIDAD);
        contentPane.add(borrarMensualidadPanel, BORRARMENSUALIDAD);
        contentPane.add(consultarMensualidadPanel, CONSULTARMENSUALIDAD);
        
        //RELACION ESTUDIANTE-GRUPO
        contentPane.add(asignarEstGrupoPanel, ASIGNARESTUDIANTEGRUPO);
        contentPane.add(borrarEstGrupoPanel, BORRARESTUDIANTEGRUPO);
        contentPane.add(consultarEstGrupoPanel, CONSULTARESTUDIANTEGRUPO);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        contentPane = new javax.swing.JPanel();
        barraMenu = new javax.swing.JMenuBar();
        menuEstudiantes = new javax.swing.JMenu();
        registrarEstudiante = new javax.swing.JMenuItem();
        consultarEstudiante = new javax.swing.JMenuItem();
        modificarEstudiante = new javax.swing.JMenuItem();
        eliminarEstudiante = new javax.swing.JMenuItem();
        menuRelacion = new javax.swing.JMenu();
        asignarRelacion = new javax.swing.JMenuItem();
        consultarRelacion = new javax.swing.JMenuItem();
        eliminarRelacion = new javax.swing.JMenuItem();
        menuRepresentantes = new javax.swing.JMenu();
        registrarRepresentante = new javax.swing.JMenuItem();
        consultarRepresentante = new javax.swing.JMenuItem();
        modificarRepresentante = new javax.swing.JMenuItem();
        eliminarRepresentante = new javax.swing.JMenuItem();
        menuPagoMensualidad = new javax.swing.JMenu();
        registrarMensualidad = new javax.swing.JMenuItem();
        modificarMensualidad = new javax.swing.JMenuItem();
        borrarMensualidad = new javax.swing.JMenuItem();
        consultarMensualidad = new javax.swing.JMenuItem();
        menuEmpleados = new javax.swing.JMenu();
        registrarEmpleado = new javax.swing.JMenuItem();
        consultarEmpleado = new javax.swing.JMenuItem();
        modificarEmpleado = new javax.swing.JMenuItem();
        eliminarEmpleado = new javax.swing.JMenuItem();
        asignarDocentes = new javax.swing.JMenu();
        asignarGrupo = new javax.swing.JMenuItem();
        removerGrupo = new javax.swing.JMenuItem();
        consultarAsignaciones = new javax.swing.JMenuItem();
        menuInasistencias = new javax.swing.JMenu();
        registrarInasistencia = new javax.swing.JMenuItem();
        consultarInasistencias = new javax.swing.JMenuItem();
        modificarInasistencia = new javax.swing.JMenuItem();
        borrarInasistencia = new javax.swing.JMenuItem();
        menuSuplencias = new javax.swing.JMenu();
        registrarSuplencia = new javax.swing.JMenuItem();
        consultarSuplencias = new javax.swing.JMenuItem();
        modificarSuplencia = new javax.swing.JMenuItem();
        borrarSuplencia = new javax.swing.JMenuItem();
        menuGrupos = new javax.swing.JMenu();
        registrarGrupo = new javax.swing.JMenuItem();
        consultarGrupo = new javax.swing.JMenuItem();
        modificarGrupo = new javax.swing.JMenuItem();
        eliminarGrupo = new javax.swing.JMenuItem();
        menuAsignarEstudiantes = new javax.swing.JMenu();
        asignarEstudianteGrupo = new javax.swing.JMenuItem();
        borrarEstudianteGrupo = new javax.swing.JMenuItem();
        consultarEstudianteGrupo = new javax.swing.JMenuItem();
        menuConfiguracion = new javax.swing.JMenu();
        inicio = new javax.swing.JMenuItem();
        menuSalir = new javax.swing.JMenu();
        cerrarSesion = new javax.swing.JMenuItem();
        salirAplicacion = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);

        contentPane.setForeground(new java.awt.Color(240, 240, 240));
        contentPane.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        contentPane.setLayout(new java.awt.CardLayout());

        menuEstudiantes.setText("Estudiantes");

        registrarEstudiante.setText("Registrar");
        registrarEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarEstudianteActionPerformed(evt);
            }
        });
        menuEstudiantes.add(registrarEstudiante);

        consultarEstudiante.setText("Consultar");
        consultarEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarEstudianteActionPerformed(evt);
            }
        });
        menuEstudiantes.add(consultarEstudiante);

        modificarEstudiante.setText("Modificar");
        modificarEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarEstudianteActionPerformed(evt);
            }
        });
        menuEstudiantes.add(modificarEstudiante);

        eliminarEstudiante.setText("Eliminar");
        eliminarEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarEstudianteActionPerformed(evt);
            }
        });
        menuEstudiantes.add(eliminarEstudiante);

        menuRelacion.setText("Relacion Representante");

        asignarRelacion.setText("Asignar");
        asignarRelacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asignarRelacionActionPerformed(evt);
            }
        });
        menuRelacion.add(asignarRelacion);

        consultarRelacion.setText("Consultar");
        consultarRelacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarRelacionActionPerformed(evt);
            }
        });
        menuRelacion.add(consultarRelacion);

        eliminarRelacion.setText("Eliminar");
        eliminarRelacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarRelacionActionPerformed(evt);
            }
        });
        menuRelacion.add(eliminarRelacion);

        menuEstudiantes.add(menuRelacion);

        barraMenu.add(menuEstudiantes);

        menuRepresentantes.setText("Representantes");

        registrarRepresentante.setText("Registrar");
        registrarRepresentante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarRepresentanteActionPerformed(evt);
            }
        });
        menuRepresentantes.add(registrarRepresentante);

        consultarRepresentante.setText("Consultar");
        consultarRepresentante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarRepresentanteActionPerformed(evt);
            }
        });
        menuRepresentantes.add(consultarRepresentante);

        modificarRepresentante.setText("Modificar");
        modificarRepresentante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarRepresentanteActionPerformed(evt);
            }
        });
        menuRepresentantes.add(modificarRepresentante);

        eliminarRepresentante.setText("Eliminar");
        eliminarRepresentante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarRepresentanteActionPerformed(evt);
            }
        });
        menuRepresentantes.add(eliminarRepresentante);

        menuPagoMensualidad.setText("Mensualidad");

        registrarMensualidad.setText("Registrar");
        registrarMensualidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarMensualidadActionPerformed(evt);
            }
        });
        menuPagoMensualidad.add(registrarMensualidad);

        modificarMensualidad.setText("Modificar");
        modificarMensualidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarMensualidadActionPerformed(evt);
            }
        });
        menuPagoMensualidad.add(modificarMensualidad);

        borrarMensualidad.setText("Borrar");
        borrarMensualidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarMensualidadActionPerformed(evt);
            }
        });
        menuPagoMensualidad.add(borrarMensualidad);

        consultarMensualidad.setText("Consultar");
        consultarMensualidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarMensualidadActionPerformed(evt);
            }
        });
        menuPagoMensualidad.add(consultarMensualidad);

        menuRepresentantes.add(menuPagoMensualidad);

        barraMenu.add(menuRepresentantes);

        menuEmpleados.setText("Empleados");

        registrarEmpleado.setText("Registrar");
        registrarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarEmpleadoActionPerformed(evt);
            }
        });
        menuEmpleados.add(registrarEmpleado);

        consultarEmpleado.setText("Consultar");
        consultarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarEmpleadoActionPerformed(evt);
            }
        });
        menuEmpleados.add(consultarEmpleado);

        modificarEmpleado.setText("Modificar");
        modificarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarEmpleadoActionPerformed(evt);
            }
        });
        menuEmpleados.add(modificarEmpleado);

        eliminarEmpleado.setText("Eliminar");
        eliminarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarEmpleadoActionPerformed(evt);
            }
        });
        menuEmpleados.add(eliminarEmpleado);

        asignarDocentes.setText("Asignación de Docentes");

        asignarGrupo.setText("Asignar al Grupo");
        asignarDocentes.add(asignarGrupo);

        removerGrupo.setText("Remover del Grupo");
        asignarDocentes.add(removerGrupo);

        consultarAsignaciones.setText("Consultar Asignaciones");
        asignarDocentes.add(consultarAsignaciones);

        menuEmpleados.add(asignarDocentes);

        barraMenu.add(menuEmpleados);

        menuInasistencias.setText("Inasistencias");

        registrarInasistencia.setText("Registrar");
        registrarInasistencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarInasistenciaActionPerformed(evt);
            }
        });
        menuInasistencias.add(registrarInasistencia);

        consultarInasistencias.setText("Consultar");
        consultarInasistencias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarInasistenciasActionPerformed(evt);
            }
        });
        menuInasistencias.add(consultarInasistencias);

        modificarInasistencia.setText("Modificar");
        modificarInasistencia.setToolTipText("");
        modificarInasistencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarInasistenciaActionPerformed(evt);
            }
        });
        menuInasistencias.add(modificarInasistencia);

        borrarInasistencia.setText("Eliminar ");
        borrarInasistencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarInasistenciaActionPerformed(evt);
            }
        });
        menuInasistencias.add(borrarInasistencia);

        barraMenu.add(menuInasistencias);

        menuSuplencias.setText("Suplencias");

        registrarSuplencia.setText("Registrar");
        registrarSuplencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarSuplenciaActionPerformed(evt);
            }
        });
        menuSuplencias.add(registrarSuplencia);

        consultarSuplencias.setText("Consultar");
        consultarSuplencias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarSuplenciasActionPerformed(evt);
            }
        });
        menuSuplencias.add(consultarSuplencias);

        modificarSuplencia.setText("Modificar");
        modificarSuplencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarSuplenciaActionPerformed(evt);
            }
        });
        menuSuplencias.add(modificarSuplencia);

        borrarSuplencia.setText("Eliminar");
        borrarSuplencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarSuplenciaActionPerformed(evt);
            }
        });
        menuSuplencias.add(borrarSuplencia);

        barraMenu.add(menuSuplencias);

        menuGrupos.setText("Grupo");

        registrarGrupo.setText("Registrar");
        registrarGrupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarGrupoActionPerformed(evt);
            }
        });
        menuGrupos.add(registrarGrupo);

        consultarGrupo.setText("Consultar");
        consultarGrupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarGrupoActionPerformed(evt);
            }
        });
        menuGrupos.add(consultarGrupo);

        modificarGrupo.setText("Modificar");
        modificarGrupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarGrupoActionPerformed(evt);
            }
        });
        menuGrupos.add(modificarGrupo);

        eliminarGrupo.setText("Eliminar");
        eliminarGrupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarGrupoActionPerformed(evt);
            }
        });
        menuGrupos.add(eliminarGrupo);

        menuAsignarEstudiantes.setText("Asignar Estudiantes");

        asignarEstudianteGrupo.setText("Asignar");
        asignarEstudianteGrupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asignarEstudianteGrupoActionPerformed(evt);
            }
        });
        menuAsignarEstudiantes.add(asignarEstudianteGrupo);

        borrarEstudianteGrupo.setText("Borrar");
        borrarEstudianteGrupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarEstudianteGrupoActionPerformed(evt);
            }
        });
        menuAsignarEstudiantes.add(borrarEstudianteGrupo);

        consultarEstudianteGrupo.setText("Consultar");
        consultarEstudianteGrupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarEstudianteGrupoActionPerformed(evt);
            }
        });
        menuAsignarEstudiantes.add(consultarEstudianteGrupo);

        menuGrupos.add(menuAsignarEstudiantes);

        barraMenu.add(menuGrupos);

        menuConfiguracion.setText("Salir");

        inicio.setText("Inicio");
        inicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inicioActionPerformed(evt);
            }
        });
        menuConfiguracion.add(inicio);

        menuSalir.setText("Salir");

        cerrarSesion.setText("Cerrar Sesion");
        cerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarSesionActionPerformed(evt);
            }
        });
        menuSalir.add(cerrarSesion);

        salirAplicacion.setText("Salir de la aplicacion");
        salirAplicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirAplicacionActionPerformed(evt);
            }
        });
        menuSalir.add(salirAplicacion);

        menuConfiguracion.add(menuSalir);

        barraMenu.add(menuConfiguracion);

        setJMenuBar(barraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contentPane, javax.swing.GroupLayout.DEFAULT_SIZE, 950, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contentPane, javax.swing.GroupLayout.DEFAULT_SIZE, 619, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registrarEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarEstudianteActionPerformed
        CardLayout cardPanel = (CardLayout)(contentPane.getLayout());
        cardPanel.show(contentPane, REGISTRARESTUDIANTE);
    }//GEN-LAST:event_registrarEstudianteActionPerformed

    private void consultarEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarEstudianteActionPerformed
        CardLayout cardPanel = (CardLayout)(contentPane.getLayout());
        cardPanel.show(contentPane, CONSULTARESTUDIANTES);
    }//GEN-LAST:event_consultarEstudianteActionPerformed

    private void modificarEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarEstudianteActionPerformed
        CardLayout cardPanel = (CardLayout)(contentPane.getLayout());
        cardPanel.show(contentPane, MODIFICARESTUDIANTE);
    }//GEN-LAST:event_modificarEstudianteActionPerformed

    private void eliminarEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarEstudianteActionPerformed
        CardLayout cardPanel = (CardLayout)(contentPane.getLayout());
        cardPanel.show(contentPane, BORRARESTUDIANTE);
    }//GEN-LAST:event_eliminarEstudianteActionPerformed

    private void registrarRepresentanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarRepresentanteActionPerformed
        CardLayout cardPanel = (CardLayout)(contentPane.getLayout());
        cardPanel.show(contentPane, REGISTRARREPRESENTANTE);
    }//GEN-LAST:event_registrarRepresentanteActionPerformed

    private void consultarRepresentanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarRepresentanteActionPerformed
        CardLayout cardPanel = (CardLayout)(contentPane.getLayout());
        cardPanel.show(contentPane, CONSULTARREPRESENTANTES);
    }//GEN-LAST:event_consultarRepresentanteActionPerformed

    private void modificarRepresentanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarRepresentanteActionPerformed
        CardLayout cardPanel = (CardLayout)(contentPane.getLayout());
        cardPanel.show(contentPane, MODIFICARREPRESENTANTE);
    }//GEN-LAST:event_modificarRepresentanteActionPerformed

    private void eliminarRepresentanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarRepresentanteActionPerformed
        CardLayout cardPanel = (CardLayout)(contentPane.getLayout());
        cardPanel.show(contentPane, BORRARREPRESENTANTE);
    }//GEN-LAST:event_eliminarRepresentanteActionPerformed

    private void registrarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarEmpleadoActionPerformed
        CardLayout cardPanel = (CardLayout)(contentPane.getLayout());
        cardPanel.show(contentPane, REGISTRAREMPLEADO);
    }//GEN-LAST:event_registrarEmpleadoActionPerformed

    private void consultarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarEmpleadoActionPerformed
        CardLayout cardPanel = (CardLayout)(contentPane.getLayout());
        cardPanel.show(contentPane, CONSULTAREMPLEADOS);
    }//GEN-LAST:event_consultarEmpleadoActionPerformed

    private void modificarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarEmpleadoActionPerformed
        CardLayout cardPanel = (CardLayout)(contentPane.getLayout());
        cardPanel.show(contentPane, MODIFICAREMPLEADO);
    }//GEN-LAST:event_modificarEmpleadoActionPerformed

    private void eliminarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarEmpleadoActionPerformed
        CardLayout cardPanel = (CardLayout)(contentPane.getLayout());
        cardPanel.show(contentPane, BORRAREMPLEADO);
    }//GEN-LAST:event_eliminarEmpleadoActionPerformed

    private void cerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarSesionActionPerformed
        InicioSesion nuevaVentana = new InicioSesion();
        nuevaVentana.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_cerrarSesionActionPerformed

    private void salirAplicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirAplicacionActionPerformed
        System.exit(0);
    }//GEN-LAST:event_salirAplicacionActionPerformed

    private void inicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inicioActionPerformed
        CardLayout cardPanel = (CardLayout)(contentPane.getLayout());
        cardPanel.show(contentPane, PANELINICIO);
    }//GEN-LAST:event_inicioActionPerformed

    private void eliminarGrupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarGrupoActionPerformed
        CardLayout cardPanel = (CardLayout)(contentPane.getLayout());
        cardPanel.show(contentPane, BORRARGRUPO);
    }//GEN-LAST:event_eliminarGrupoActionPerformed

    private void registrarGrupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarGrupoActionPerformed
        CardLayout cardPanel = (CardLayout)(contentPane.getLayout());
        cardPanel.show(contentPane, REGISTRARGRUPO);
    }//GEN-LAST:event_registrarGrupoActionPerformed

    private void consultarGrupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarGrupoActionPerformed
        CardLayout cardPanel = (CardLayout)(contentPane.getLayout());
        cardPanel.show(contentPane, CONSULTARGRUPOS);
    }//GEN-LAST:event_consultarGrupoActionPerformed

    private void modificarGrupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarGrupoActionPerformed
        CardLayout cardPanel = (CardLayout)(contentPane.getLayout());
        cardPanel.show(contentPane, MODIFICARGRUPO);
    }//GEN-LAST:event_modificarGrupoActionPerformed

    private void registrarInasistenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarInasistenciaActionPerformed
        CardLayout cardPanel = (CardLayout)(contentPane.getLayout());
        cardPanel.show(contentPane, REGISTRARINASISTENCIA);
    }//GEN-LAST:event_registrarInasistenciaActionPerformed

    private void consultarInasistenciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarInasistenciasActionPerformed
        CardLayout cardPanel = (CardLayout)(contentPane.getLayout());
        cardPanel.show(contentPane, CONSULTARINASISTENCIAS);
    }//GEN-LAST:event_consultarInasistenciasActionPerformed

    private void modificarInasistenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarInasistenciaActionPerformed
        CardLayout cardPanel = (CardLayout)(contentPane.getLayout());
        cardPanel.show(contentPane, MODIFICARINASISTENCIA);
    }//GEN-LAST:event_modificarInasistenciaActionPerformed

    private void borrarInasistenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarInasistenciaActionPerformed
        CardLayout cardPanel = (CardLayout)(contentPane.getLayout());
        cardPanel.show(contentPane, BORRARINASISTENCIA);
    }//GEN-LAST:event_borrarInasistenciaActionPerformed

    private void registrarSuplenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarSuplenciaActionPerformed
        CardLayout cardPanel = (CardLayout)(contentPane.getLayout());
        cardPanel.show(contentPane, REGISTRARSUPLENCIA);
    }//GEN-LAST:event_registrarSuplenciaActionPerformed

    private void consultarSuplenciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarSuplenciasActionPerformed
        CardLayout cardPanel = (CardLayout)(contentPane.getLayout());
        cardPanel.show(contentPane, CONSULTARSUPLENCIAS);
    }//GEN-LAST:event_consultarSuplenciasActionPerformed

    private void modificarSuplenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarSuplenciaActionPerformed
        CardLayout cardPanel = (CardLayout)(contentPane.getLayout());
        cardPanel.show(contentPane, MODIFICARSUPLENCIA);
    }//GEN-LAST:event_modificarSuplenciaActionPerformed

    private void borrarSuplenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarSuplenciaActionPerformed
        CardLayout cardPanel = (CardLayout)(contentPane.getLayout());
        cardPanel.show(contentPane, BORRARSUPLENCIA);
    }//GEN-LAST:event_borrarSuplenciaActionPerformed

    private void eliminarRelacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarRelacionActionPerformed
        CardLayout cardPanel = (CardLayout)(contentPane.getLayout());
        cardPanel.show(contentPane, ELIMINARRELACION);
    }//GEN-LAST:event_eliminarRelacionActionPerformed

    private void asignarRelacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asignarRelacionActionPerformed
        CardLayout cardPanel = (CardLayout)(contentPane.getLayout());
        cardPanel.show(contentPane, ASIGNARRELACION);
    }//GEN-LAST:event_asignarRelacionActionPerformed

    private void consultarRelacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarRelacionActionPerformed
        CardLayout cardPanel = (CardLayout)(contentPane.getLayout());
        cardPanel.show(contentPane, CONSULTARRELACION);
    }//GEN-LAST:event_consultarRelacionActionPerformed

    private void registrarMensualidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarMensualidadActionPerformed
       CardLayout cardPanel = (CardLayout)(contentPane.getLayout());
       cardPanel.show(contentPane, REGISTRARMENSUALIDAD);
    }//GEN-LAST:event_registrarMensualidadActionPerformed

    private void modificarMensualidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarMensualidadActionPerformed
        CardLayout cardPanel = (CardLayout)(contentPane.getLayout());
        cardPanel.show(contentPane, MODIFICARMENSUALIDAD);
    }//GEN-LAST:event_modificarMensualidadActionPerformed

    private void borrarMensualidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarMensualidadActionPerformed
        CardLayout cardPanel = (CardLayout)(contentPane.getLayout());
        cardPanel.show(contentPane, BORRARMENSUALIDAD);
    }//GEN-LAST:event_borrarMensualidadActionPerformed

    private void consultarMensualidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarMensualidadActionPerformed
        CardLayout cardPanel = (CardLayout)(contentPane.getLayout());
        cardPanel.show(contentPane, CONSULTARMENSUALIDAD);
    }//GEN-LAST:event_consultarMensualidadActionPerformed

    private void asignarEstudianteGrupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asignarEstudianteGrupoActionPerformed
        CardLayout cardPanel = (CardLayout)(contentPane.getLayout());
        cardPanel.show(contentPane, ASIGNARESTUDIANTEGRUPO);
    }//GEN-LAST:event_asignarEstudianteGrupoActionPerformed

    private void borrarEstudianteGrupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarEstudianteGrupoActionPerformed
        CardLayout cardPanel = (CardLayout)(contentPane.getLayout());
        cardPanel.show(contentPane, BORRARESTUDIANTEGRUPO);
    }//GEN-LAST:event_borrarEstudianteGrupoActionPerformed

    private void consultarEstudianteGrupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarEstudianteGrupoActionPerformed
        CardLayout cardPanel = (CardLayout)(contentPane.getLayout());
        cardPanel.show(contentPane, CONSULTARESTUDIANTEGRUPO);
    }//GEN-LAST:event_consultarEstudianteGrupoActionPerformed


    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AppMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AppMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AppMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AppMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AppMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu asignarDocentes;
    private javax.swing.JMenuItem asignarEstudianteGrupo;
    private javax.swing.JMenuItem asignarGrupo;
    private javax.swing.JMenuItem asignarRelacion;
    private javax.swing.JMenuBar barraMenu;
    private javax.swing.JMenuItem borrarEstudianteGrupo;
    private javax.swing.JMenuItem borrarInasistencia;
    private javax.swing.JMenuItem borrarMensualidad;
    private javax.swing.JMenuItem borrarSuplencia;
    private javax.swing.JMenuItem cerrarSesion;
    private javax.swing.JMenuItem consultarAsignaciones;
    private javax.swing.JMenuItem consultarEmpleado;
    private javax.swing.JMenuItem consultarEstudiante;
    private javax.swing.JMenuItem consultarEstudianteGrupo;
    private javax.swing.JMenuItem consultarGrupo;
    private javax.swing.JMenuItem consultarInasistencias;
    private javax.swing.JMenuItem consultarMensualidad;
    private javax.swing.JMenuItem consultarRelacion;
    private javax.swing.JMenuItem consultarRepresentante;
    private javax.swing.JMenuItem consultarSuplencias;
    private javax.swing.JPanel contentPane;
    private javax.swing.JMenuItem eliminarEmpleado;
    private javax.swing.JMenuItem eliminarEstudiante;
    private javax.swing.JMenuItem eliminarGrupo;
    private javax.swing.JMenuItem eliminarRelacion;
    private javax.swing.JMenuItem eliminarRepresentante;
    private javax.swing.JMenuItem inicio;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu menuAsignarEstudiantes;
    private javax.swing.JMenu menuConfiguracion;
    private javax.swing.JMenu menuEmpleados;
    private javax.swing.JMenu menuEstudiantes;
    private javax.swing.JMenu menuGrupos;
    private javax.swing.JMenu menuInasistencias;
    private javax.swing.JMenu menuPagoMensualidad;
    private javax.swing.JMenu menuRelacion;
    private javax.swing.JMenu menuRepresentantes;
    private javax.swing.JMenu menuSalir;
    private javax.swing.JMenu menuSuplencias;
    private javax.swing.JMenuItem modificarEmpleado;
    private javax.swing.JMenuItem modificarEstudiante;
    private javax.swing.JMenuItem modificarGrupo;
    private javax.swing.JMenuItem modificarInasistencia;
    private javax.swing.JMenuItem modificarMensualidad;
    private javax.swing.JMenuItem modificarRepresentante;
    private javax.swing.JMenuItem modificarSuplencia;
    private javax.swing.JMenuItem registrarEmpleado;
    private javax.swing.JMenuItem registrarEstudiante;
    private javax.swing.JMenuItem registrarGrupo;
    private javax.swing.JMenuItem registrarInasistencia;
    private javax.swing.JMenuItem registrarMensualidad;
    private javax.swing.JMenuItem registrarRepresentante;
    private javax.swing.JMenuItem registrarSuplencia;
    private javax.swing.JMenuItem removerGrupo;
    private javax.swing.JMenuItem salirAplicacion;
    // End of variables declaration//GEN-END:variables
}

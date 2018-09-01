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
import vista.panel.estudiantes.BorrarEstudiante;
import vista.panel.estudiantes.ConsultarEstudiantes;
import vista.panel.estudiantes.ModificarEstudiante;
import vista.panel.estudiantes.RegistrarEstudiante;
import vista.panel.grupos.BorrarGrupo;
import vista.panel.grupos.ConsultarGrupos;
import vista.panel.grupos.ModificarGrupo;
import vista.panel.grupos.RegistrarGrupo;
import vista.panel.representantes.BorrarRepresentante;
import vista.panel.representantes.ConsultarRepresentantes;
import vista.panel.representantes.ModificarRepresentante;
import vista.panel.representantes.RegistrarRepresentante;


public class AppMenu extends javax.swing.JFrame {
    final static String PANELINICIO = "PANELINICIO";
    Inicio inicioPanel = new Inicio();
    
    //EMPLEADOS
    final static String REGISTRAREMPLEADO = "REGISTRAREMPELADO";
    final static String MODIFICAREMPLEADO = "MODIFICAREMPLEADO";
    final static String BORRAREMPLEADO = "BORRAREMPLEADO";
    final static String CONSULTAREMPLEADOS = "CONSULTAREMPLEADOS";
    
    RegistrarEmpleado registrarEmpleadoPanel = new RegistrarEmpleado();
    ModificarEmpleado modificarEmpleadoPanel = new ModificarEmpleado();
    BorrarEmpleado borrarEmpleadoPanel = new BorrarEmpleado();
    ConsultarEmpleados consultarEmpleadosPanel = new ConsultarEmpleados();
    
    //ESTUDIANTES
    final static String REGISTRARESTUDIANTE = "REGISTRARESTUDIANTE";
    final static String MODIFICARESTUDIANTE = "MODIFICARESTUDIANTE";
    final static String BORRARESTUDIANTE = "BORRARESTUDIANTE";
    final static String CONSULTARESTUDIANTES = "CONSULTARESTUDIANTES";
    
    RegistrarEstudiante registrarEstudiantePanel = new RegistrarEstudiante();
    ModificarEstudiante modificarEstudiantePanel = new ModificarEstudiante();
    BorrarEstudiante borrarEstudiantePanel = new BorrarEstudiante();
    ConsultarEstudiantes consultarEstudiantesPanel = new ConsultarEstudiantes();
    
    //GRUPOS
    final static String REGISTRARGRUPO = "REGISTRARGRUPO";
    final static String MODIFICARGRUPO = "MODIFICARGRUPO";
    final static String BORRARGRUPO = "BORRARGRUPO";
    final static String CONSULTARGRUPOS = "CONSULTARGRUPOS";
    
    RegistrarGrupo registrarGrupoPanel = new RegistrarGrupo();
    ModificarGrupo modificarGrupoPanel = new ModificarGrupo();
    BorrarGrupo borrarGrupoPanel = new BorrarGrupo();
    ConsultarGrupos consultarGruposPanel = new ConsultarGrupos();
    
    //REPRESENTANTES
    final static String REGISTRARREPRESENTANTE = "REGISTRARREPRESENTANTE";
    final static String MODIFICARREPRESENTANTE = "MODIFICARREPRESENTANTE";
    final static String BORRARREPRESENTANTE = "BORRARREPRESENTANTE";
    final static String CONSULTARREPRESENTANTES = "CONSULTARREPRESENTANTES";
    
    RegistrarRepresentante registrarRepresentantePanel = new RegistrarRepresentante();
    ModificarRepresentante modificarRepresentantePanel = new ModificarRepresentante();
    BorrarRepresentante borrarRepresentantePanel = new BorrarRepresentante();
    ConsultarRepresentantes consultarRepresentantesPanel = new ConsultarRepresentantes();

    /**
     * Creates new form AppMenu
     */
    public AppMenu() {
        initComponents();
        this.setLocationRelativeTo(null);
        contentPane.add(inicioPanel, PANELINICIO);
        
        //EMPLEADOS
        contentPane.add(registrarEmpleadoPanel, REGISTRAREMPLEADO);
        contentPane.add(modificarEmpleadoPanel, MODIFICAREMPLEADO);
        contentPane.add(borrarEmpleadoPanel, BORRAREMPLEADO);
        contentPane.add(consultarEmpleadosPanel, CONSULTAREMPLEADOS);
        
        //ESTUDIANTES
        contentPane.add(registrarEstudiantePanel, REGISTRARESTUDIANTE);
        contentPane.add(modificarEstudiantePanel, MODIFICARESTUDIANTE);
        contentPane.add(borrarEstudiantePanel, BORRARESTUDIANTE);
        contentPane.add(consultarEstudiantesPanel, CONSULTARESTUDIANTES);
        
        //GRUPOS
        contentPane.add(registrarGrupoPanel, REGISTRARGRUPO);
        contentPane.add(modificarGrupoPanel, MODIFICARGRUPO);
        contentPane.add(borrarGrupoPanel, BORRARGRUPO);
        contentPane.add(consultarGruposPanel, CONSULTARGRUPOS);
        
        //REPRESENTANTES
        contentPane.add(registrarRepresentantePanel, REGISTRARREPRESENTANTE);
        contentPane.add(modificarRepresentantePanel, MODIFICARREPRESENTANTE);
        contentPane.add(borrarRepresentantePanel, BORRARREPRESENTANTE);
        contentPane.add(consultarRepresentantesPanel, CONSULTARREPRESENTANTES);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contentPane = new javax.swing.JPanel();
        barraMenu = new javax.swing.JMenuBar();
        menuEstudiantes = new javax.swing.JMenu();
        registrarEstudiante = new javax.swing.JMenuItem();
        consultarEstudiante = new javax.swing.JMenuItem();
        modificarEstudiante = new javax.swing.JMenuItem();
        eliminarEstudiante = new javax.swing.JMenuItem();
        menuRepresentantes = new javax.swing.JMenu();
        registrarRepresentante = new javax.swing.JMenuItem();
        consultarRepresentante = new javax.swing.JMenuItem();
        modificarRepresentante = new javax.swing.JMenuItem();
        eliminarRepresentante = new javax.swing.JMenuItem();
        menuEmpleados = new javax.swing.JMenu();
        registrarEmpleado = new javax.swing.JMenuItem();
        consultarEmpleado = new javax.swing.JMenuItem();
        modificarEmpleado = new javax.swing.JMenuItem();
        eliminarEmpleado = new javax.swing.JMenuItem();
        inasistenciasEmpleado = new javax.swing.JMenuItem();
        menuGrupos = new javax.swing.JMenu();
        registrarGrupo = new javax.swing.JMenuItem();
        consultarGrupo = new javax.swing.JMenuItem();
        modificarGrupo = new javax.swing.JMenuItem();
        eliminarGrupo = new javax.swing.JMenuItem();
        menuConfiguracion = new javax.swing.JMenu();
        inicio = new javax.swing.JMenuItem();
        menuSalir = new javax.swing.JMenu();
        cerrarSesion = new javax.swing.JMenuItem();
        salirAplicacion = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        contentPane.setBackground(new java.awt.Color(204, 204, 204));
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

        inasistenciasEmpleado.setText("Inasistencias");
        inasistenciasEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inasistenciasEmpleadoActionPerformed(evt);
            }
        });
        menuEmpleados.add(inasistenciasEmpleado);

        barraMenu.add(menuEmpleados);

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
            .addComponent(contentPane, javax.swing.GroupLayout.DEFAULT_SIZE, 621, Short.MAX_VALUE)
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

    private void inasistenciasEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inasistenciasEmpleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inasistenciasEmpleadoActionPerformed

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
    private javax.swing.JMenuBar barraMenu;
    private javax.swing.JMenuItem cerrarSesion;
    private javax.swing.JMenuItem consultarEmpleado;
    private javax.swing.JMenuItem consultarEstudiante;
    private javax.swing.JMenuItem consultarGrupo;
    private javax.swing.JMenuItem consultarRepresentante;
    private javax.swing.JPanel contentPane;
    private javax.swing.JMenuItem eliminarEmpleado;
    private javax.swing.JMenuItem eliminarEstudiante;
    private javax.swing.JMenuItem eliminarGrupo;
    private javax.swing.JMenuItem eliminarRepresentante;
    private javax.swing.JMenuItem inasistenciasEmpleado;
    private javax.swing.JMenuItem inicio;
    private javax.swing.JMenu menuConfiguracion;
    private javax.swing.JMenu menuEmpleados;
    private javax.swing.JMenu menuEstudiantes;
    private javax.swing.JMenu menuGrupos;
    private javax.swing.JMenu menuRepresentantes;
    private javax.swing.JMenu menuSalir;
    private javax.swing.JMenuItem modificarEmpleado;
    private javax.swing.JMenuItem modificarEstudiante;
    private javax.swing.JMenuItem modificarGrupo;
    private javax.swing.JMenuItem modificarRepresentante;
    private javax.swing.JMenuItem registrarEmpleado;
    private javax.swing.JMenuItem registrarEstudiante;
    private javax.swing.JMenuItem registrarGrupo;
    private javax.swing.JMenuItem registrarRepresentante;
    private javax.swing.JMenuItem salirAplicacion;
    // End of variables declaration//GEN-END:variables
}

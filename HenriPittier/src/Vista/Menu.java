/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author Ronald
 */
public class Menu extends JFrame {
    
    JMenuBar menuBar;
    JMenu estudianteMenu, representanteMenu, empleadoMenu, salirMenu;
    JMenuItem registrarES, modificarES, consultarES, borrarES, registrarEM, modificarEM, consultarEM, borrarEM, registrarRE, modificarRE, consultarRE, borrarRE;
    
    public Menu(){
        
        setTitle("Menu Principal");
        setSize(500, 500);
        setLocationRelativeTo(null);
         
        // Defines el Menu Bar
        menuBar = new JMenuBar();
        setJMenuBar(menuBar);
         
        // Define and add two drop down menu to the menubar
        estudianteMenu = new JMenu ("Estudiantes");
        representanteMenu = new JMenu ("Representante");
        empleadoMenu = new JMenu ("Empleado");
        salirMenu = new JMenu("Salir");
        
        menuBar.add(estudianteMenu);
        menuBar.add(representanteMenu);
        menuBar.add(empleadoMenu);
        menuBar.add(salirMenu);
         
        // Create and add simple menu item to one of the drop down menu
        registrarES = new JMenuItem("Registrar");
        consultarES = new JMenuItem("Consultar");
        modificarES = new JMenuItem("Modificar");
        borrarES = new JMenuItem("Borrar");
         
        registrarEM = new JMenuItem("Registrar");
        consultarEM = new JMenuItem("Consultar");
        modificarEM = new JMenuItem("Modificar");
        borrarEM = new JMenuItem("Borrar");
        
        registrarRE = new JMenuItem("Registrar");
        consultarRE = new JMenuItem("Consultar");
        modificarRE = new JMenuItem("Modificar");
        borrarRE = new JMenuItem("Borrar");
        // Create and add CheckButton as a menu item to one of the drop down
        // menu
        estudianteMenu.add(registrarES);
        estudianteMenu.add(consultarES);
        estudianteMenu.add(modificarES);
        estudianteMenu.add(borrarES);
        representanteMenu.add(registrarRE);
        representanteMenu.add(consultarRE);
        representanteMenu.add(modificarRE);
        representanteMenu.add(borrarRE);
        empleadoMenu.add(registrarEM);
        empleadoMenu.add(consultarEM);
        empleadoMenu.add(modificarEM);
        empleadoMenu.add(borrarEM);
        
        
        registrarES.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                RegistroEstudiante re = new RegistroEstudiante();
                re.setVisible(true);
            }
        });
    }

    
    public static void main(String[] args){
        Menu me = new Menu();
        me.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        me.setVisible(true);
    }
    
}

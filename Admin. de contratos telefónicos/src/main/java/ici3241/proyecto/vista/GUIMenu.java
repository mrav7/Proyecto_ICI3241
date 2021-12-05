package ici3241.proyecto.vista;
import ici3241.proyecto.modelo.*;
import ici3241.proyecto.controlador.*;
import java.io.*;

public class GUIMenu extends javax.swing.JFrame {    
    ClienteData dataC;
    EquipoData dataE;
    PlanData dataP;        
    
    public GUIMenu(UsuarioAdmin user, ClienteData dataCliente, EquipoData dataEquipo, PlanData dataPlan) {
        initComponents();
        dataC = dataCliente;
        dataE = dataEquipo;
        dataP = dataPlan;
        setLocationRelativeTo(null);
    }
    public GUIMenu(UsuarioCliente user) {  
        initComponents();
        setLocationRelativeTo(null);
        botonAgregarElemento.setVisible(false);
        botonBuscarElemento.setVisible(false);
        botonModificarElemento.setVisible(false);
        botonEliminarElemento.setVisible(false);
        botonGenerarArchivos.setVisible(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelTitulo = new javax.swing.JLabel();
        botonAgregarElemento = new javax.swing.JButton();
        botonBuscarElemento = new javax.swing.JButton();
        botonModificarElemento = new javax.swing.JButton();
        botonEliminarElemento = new javax.swing.JButton();
        botonSalir = new javax.swing.JButton();
        botonGenerarArchivos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelTitulo.setText("Seleccione una acción a realizar");

        botonAgregarElemento.setText("Agregar Elemento");
        botonAgregarElemento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarElementoActionPerformed(evt);
            }
        });

        botonBuscarElemento.setText("Mostrar Elemento");
        botonBuscarElemento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarElementoActionPerformed(evt);
            }
        });

        botonModificarElemento.setText("Modificar Elemento");
        botonModificarElemento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificarElementoActionPerformed(evt);
            }
        });

        botonEliminarElemento.setText("Eliminar Elemento");
        botonEliminarElemento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarElementoActionPerformed(evt);
            }
        });

        botonSalir.setText("Salir");
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });

        botonGenerarArchivos.setText("Generar Archivo csv/txt");
        botonGenerarArchivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGenerarArchivosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(botonEliminarElemento, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
                            .addComponent(botonBuscarElemento, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botonAgregarElemento, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botonModificarElemento, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botonSalir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botonGenerarArchivos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(labelTitulo)))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(labelTitulo)
                .addGap(32, 32, 32)
                .addComponent(botonAgregarElemento, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonBuscarElemento)
                .addGap(18, 18, 18)
                .addComponent(botonEliminarElemento)
                .addGap(18, 18, 18)
                .addComponent(botonModificarElemento)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(botonGenerarArchivos)
                .addGap(98, 98, 98)
                .addComponent(botonSalir)
                .addGap(103, 103, 103))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonAgregarElementoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarElementoActionPerformed
        GUIAgregarElemento ae = new GUIAgregarElemento(dataC, dataE, dataP);
        ae.setVisible(true);
    }//GEN-LAST:event_botonAgregarElementoActionPerformed

    private void botonBuscarElementoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarElementoActionPerformed
        GUIListarElemento le = new GUIListarElemento(dataC, dataE, dataP);
        le.setVisible(true);
    }//GEN-LAST:event_botonBuscarElementoActionPerformed

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        dispose();
    }//GEN-LAST:event_botonSalirActionPerformed

    private void botonEliminarElementoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarElementoActionPerformed
        GUIEliminarElemento ee = new GUIEliminarElemento(dataC, dataE, dataP);
        ee.setVisible(true);
    }//GEN-LAST:event_botonEliminarElementoActionPerformed

    private void botonModificarElementoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarElementoActionPerformed
        GUIModificarElemento me = new GUIModificarElemento(dataC, dataE, dataP);
        me.setVisible(true);
    }//GEN-LAST:event_botonModificarElementoActionPerformed

    private void botonGenerarArchivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGenerarArchivosActionPerformed
        try {
            dataC.exportarArchivoCSV();
            dataC.exportarArchivoTXT();
            dataE.exportarArchivoCSV();
            dataE.exportarArchivoTXT();
            dataP.exportarArchivoCSV();
            dataP.exportarArchivoTXT();
        } catch (IOException e) {
            e.printStackTrace();
        }
        GUIMensajeArchivosGenerados vs = new GUIMensajeArchivosGenerados();
        vs.setVisible(true);
        
    }//GEN-LAST:event_botonGenerarArchivosActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAgregarElemento;
    private javax.swing.JButton botonBuscarElemento;
    private javax.swing.JButton botonEliminarElemento;
    private javax.swing.JButton botonGenerarArchivos;
    private javax.swing.JButton botonModificarElemento;
    private javax.swing.JButton botonSalir;
    private javax.swing.JLabel labelTitulo;
    // End of variables declaration//GEN-END:variables
}

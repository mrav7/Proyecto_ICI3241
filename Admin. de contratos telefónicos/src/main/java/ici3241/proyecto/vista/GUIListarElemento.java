package ici3241.proyecto.vista;
import ici3241.proyecto.controlador.*;

public class GUIListarElemento extends javax.swing.JFrame {
    private ClienteData dataC;
    private EquipoData dataE;
    private PlanData dataP;
    
    public GUIListarElemento(ClienteData dataC, EquipoData dataE, PlanData dataP) {
        initComponents();
        this.dataC = dataC;
        this.dataE = dataE;
        this.dataP = dataP;
        setLocationRelativeTo(null);
    }   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelTitulo = new javax.swing.JLabel();
        botonListarCliente = new javax.swing.JButton();
        botonListarEquipo = new javax.swing.JButton();
        botonListarPlan = new javax.swing.JButton();
        botonSalir = new javax.swing.JButton();
        botonBuscarClienteServicios = new javax.swing.JButton();
        botonListarPlanMinMax = new javax.swing.JButton();
        botonEquipoFiltro = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelTitulo.setText("           Seleccione el elemento a mostrar");

        botonListarCliente.setText("Cliente");
        botonListarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonListarClienteActionPerformed(evt);
            }
        });

        botonListarEquipo.setText("Equipo");
        botonListarEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonListarEquipoActionPerformed(evt);
            }
        });

        botonListarPlan.setText("Plan");
        botonListarPlan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonListarPlanActionPerformed(evt);
            }
        });

        botonSalir.setText("Salir");
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });

        botonBuscarClienteServicios.setText("Cliente + Equipos & Planes");
        botonBuscarClienteServicios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarClienteServiciosActionPerformed(evt);
            }
        });

        botonListarPlanMinMax.setText("Plan Min & Max");
        botonListarPlanMinMax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonListarPlanMinMaxActionPerformed(evt);
            }
        });

        botonEquipoFiltro.setText("Equipo por filtro");
        botonEquipoFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEquipoFiltroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonSalir)
                .addGap(19, 19, 19))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(botonBuscarClienteServicios, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(botonListarPlanMinMax)
                                .addGap(28, 28, 28)
                                .addComponent(botonEquipoFiltro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(labelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(botonListarCliente)
                                .addGap(18, 18, 18)
                                .addComponent(botonListarEquipo)
                                .addGap(18, 18, 18)
                                .addComponent(botonListarPlan)))))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(labelTitulo)
                .addGap(89, 89, 89)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonListarEquipo)
                    .addComponent(botonListarPlan)
                    .addComponent(botonListarCliente))
                .addGap(18, 18, 18)
                .addComponent(botonBuscarClienteServicios)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonListarPlanMinMax)
                    .addComponent(botonEquipoFiltro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(botonSalir)
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonListarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonListarClienteActionPerformed
        GUIListarCliente lc = new GUIListarCliente(dataC);
        lc.setVisible(true);
        lc.mostrarClientes();
    }//GEN-LAST:event_botonListarClienteActionPerformed

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        dispose();
    }//GEN-LAST:event_botonSalirActionPerformed

    private void botonListarPlanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonListarPlanActionPerformed
        GUIListarPlan lp = new GUIListarPlan(dataP);
        lp.setVisible(true);
        lp.mostrarPlanes();
    }//GEN-LAST:event_botonListarPlanActionPerformed

    private void botonListarEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonListarEquipoActionPerformed
        GUIListarEquipo le = new GUIListarEquipo(dataE);
        le.setVisible(true);
        le.mostrarEquipos();
    }//GEN-LAST:event_botonListarEquipoActionPerformed

    private void botonBuscarClienteServiciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarClienteServiciosActionPerformed
        GUIListarClienteProductos lcs = new GUIListarClienteProductos(dataC);
        lcs.inicializar();
        lcs.setVisible(true);
        
    }//GEN-LAST:event_botonBuscarClienteServiciosActionPerformed

    private void botonListarPlanMinMaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonListarPlanMinMaxActionPerformed
        GUIListarPlanMinMax lpmm = new GUIListarPlanMinMax(dataP);
        lpmm.inicializar();
        lpmm.setVisible(true);
    }//GEN-LAST:event_botonListarPlanMinMaxActionPerformed

    private void botonEquipoFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEquipoFiltroActionPerformed
        GUIListarEquipoFiltro lef = new GUIListarEquipoFiltro(dataE);
        lef.inicializar();
        lef.setVisible(true);
    }//GEN-LAST:event_botonEquipoFiltroActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonBuscarClienteServicios;
    private javax.swing.JButton botonEquipoFiltro;
    private javax.swing.JButton botonListarCliente;
    private javax.swing.JButton botonListarEquipo;
    private javax.swing.JButton botonListarPlan;
    private javax.swing.JButton botonListarPlanMinMax;
    private javax.swing.JButton botonSalir;
    private javax.swing.JLabel labelTitulo;
    // End of variables declaration//GEN-END:variables
}

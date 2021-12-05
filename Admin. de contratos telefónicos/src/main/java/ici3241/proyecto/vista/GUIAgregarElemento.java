package ici3241.proyecto.vista;
import ici3241.proyecto.controlador.*;


public class GUIAgregarElemento extends javax.swing.JFrame {
    ClienteData dataC;
    EquipoData dataE;
    PlanData dataP;

    public GUIAgregarElemento(ClienteData dataC, EquipoData dataE, PlanData dataP) {
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
        botonAgregarCliente = new javax.swing.JButton();
        botonAgregarEquipo = new javax.swing.JButton();
        botonAgregarPlan = new javax.swing.JButton();
        botonSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelTitulo.setText("Seleccione el tipo de elemento a agregar");

        botonAgregarCliente.setText("Cliente");
        botonAgregarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarClienteActionPerformed(evt);
            }
        });

        botonAgregarEquipo.setText("Equipo");
        botonAgregarEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarEquipoActionPerformed(evt);
            }
        });

        botonAgregarPlan.setText("Plan");
        botonAgregarPlan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarPlanActionPerformed(evt);
            }
        });

        botonSalir.setText("Salir");
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(botonAgregarCliente)
                .addGap(18, 18, 18)
                .addComponent(botonAgregarEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonAgregarPlan, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(68, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(labelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(botonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(labelTitulo)
                .addGap(96, 96, 96)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonAgregarEquipo)
                    .addComponent(botonAgregarPlan)
                    .addComponent(botonAgregarCliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                .addComponent(botonSalir)
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonAgregarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarClienteActionPerformed
        GUIAgregarCliente ac = new GUIAgregarCliente(this, rootPaneCheckingEnabled, dataC);
        ac.inicializar();
        ac.setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_botonAgregarClienteActionPerformed

    private void botonAgregarEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarEquipoActionPerformed
        GUIAgregarEquipo ae = new GUIAgregarEquipo(dataE);
        ae.inicializar();
        ae.setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_botonAgregarEquipoActionPerformed

    private void botonAgregarPlanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarPlanActionPerformed
        GUIAgregarPlan ap = new GUIAgregarPlan(dataP);
        ap.inicializar();
        ap.setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_botonAgregarPlanActionPerformed

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        dispose();
    }//GEN-LAST:event_botonSalirActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAgregarCliente;
    private javax.swing.JButton botonAgregarEquipo;
    private javax.swing.JButton botonAgregarPlan;
    private javax.swing.JButton botonSalir;
    private javax.swing.JLabel labelTitulo;
    // End of variables declaration//GEN-END:variables
}

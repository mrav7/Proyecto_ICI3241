package ici3241.proyecto.vista;
import ici3241.proyecto.controlador.*;

public class GUIModificarElemento extends javax.swing.JFrame {
    ClienteData dataC;
    EquipoData dataE;
    PlanData dataP;
    
    public GUIModificarElemento(ClienteData dataC, EquipoData dataE, PlanData dataP) {
        initComponents();
        this.dataC = dataC;
        this.dataE = dataE;
        this.dataP = dataP;
        setLocationRelativeTo(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonModificarCliente = new javax.swing.JButton();
        botonModificarEquipo = new javax.swing.JButton();
        botonModificarPlan = new javax.swing.JButton();
        labelTitulo = new javax.swing.JLabel();
        botonSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        botonModificarCliente.setText("Cliente");
        botonModificarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificarClienteActionPerformed(evt);
            }
        });

        botonModificarEquipo.setText("Equipo");
        botonModificarEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificarEquipoActionPerformed(evt);
            }
        });

        botonModificarPlan.setText("Plan");
        botonModificarPlan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificarPlanActionPerformed(evt);
            }
        });

        labelTitulo.setText("Seleccione el tipo de elemento a modificar");

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
                .addComponent(botonModificarCliente)
                .addGap(18, 18, 18)
                .addComponent(botonModificarEquipo)
                .addGap(18, 18, 18)
                .addComponent(botonModificarPlan)
                .addContainerGap(73, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(labelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(botonSalir)
                        .addGap(15, 15, 15))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(labelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonModificarCliente)
                    .addComponent(botonModificarEquipo)
                    .addComponent(botonModificarPlan))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 124, Short.MAX_VALUE)
                .addComponent(botonSalir)
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        dispose();
    }//GEN-LAST:event_botonSalirActionPerformed

    private void botonModificarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarClienteActionPerformed
        GUIModificarCliente mc = new GUIModificarCliente(dataC);
        mc.inicializar();
        mc.setVisible(true);
    }//GEN-LAST:event_botonModificarClienteActionPerformed

    private void botonModificarEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarEquipoActionPerformed
        GUIModificarEquipo me = new GUIModificarEquipo(dataE);
        me.inicializar();
        me.setVisible(true);
    }//GEN-LAST:event_botonModificarEquipoActionPerformed

    private void botonModificarPlanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarPlanActionPerformed
        GUIModificarPlan mp = new GUIModificarPlan(dataP);
        mp.inicializar();
        mp.setVisible(true);
    }//GEN-LAST:event_botonModificarPlanActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonModificarCliente;
    private javax.swing.JButton botonModificarEquipo;
    private javax.swing.JButton botonModificarPlan;
    private javax.swing.JButton botonSalir;
    private javax.swing.JLabel labelTitulo;
    // End of variables declaration//GEN-END:variables
}

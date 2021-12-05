package ici3241.proyecto.vista;
import ici3241.proyecto.controlador.*;

public class GUIEliminarElemento extends javax.swing.JFrame {
    private ClienteData dataC;
    private EquipoData dataE;
    private PlanData dataP;
    
    public GUIEliminarElemento(ClienteData dataC, EquipoData dataE, PlanData dataP) {
        initComponents();
        this.dataC = dataC;
        this.dataE = dataE;
        this.dataP = dataP;
        setLocationRelativeTo(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        botonSalir = new javax.swing.JButton();
        botonEliminarCliente = new javax.swing.JButton();
        botonEliminarEquipo = new javax.swing.JButton();
        botonEliminarPlan = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Seleccione el elemento a eliminar");

        botonSalir.setText("Salir");
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });

        botonEliminarCliente.setText("Cliente");
        botonEliminarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarClienteActionPerformed(evt);
            }
        });

        botonEliminarEquipo.setText("Equipo");
        botonEliminarEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarEquipoActionPerformed(evt);
            }
        });

        botonEliminarPlan.setText("Plan");
        botonEliminarPlan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarPlanActionPerformed(evt);
            }
        });

        jButton1.setText("Plan/Equipo Cliente");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(108, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(90, 90, 90))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(botonSalir)
                        .addGap(18, 18, 18))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(botonEliminarCliente)
                        .addGap(18, 18, 18)
                        .addComponent(botonEliminarEquipo)
                        .addGap(18, 18, 18)
                        .addComponent(botonEliminarPlan))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(jButton1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(83, 83, 83)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonEliminarCliente)
                    .addComponent(botonEliminarEquipo)
                    .addComponent(botonEliminarPlan))
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(botonSalir)
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        dispose();
    }//GEN-LAST:event_botonSalirActionPerformed

    private void botonEliminarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarClienteActionPerformed
        GUIEliminarCliente ec = new GUIEliminarCliente(dataC);
        ec.inicializar();
        ec.setVisible(true);
    }//GEN-LAST:event_botonEliminarClienteActionPerformed

    private void botonEliminarPlanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarPlanActionPerformed
        GUIEliminarPlan ep = new GUIEliminarPlan(dataP);
        ep.inicializar();
        ep.setVisible(true);
    }//GEN-LAST:event_botonEliminarPlanActionPerformed

    private void botonEliminarEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarEquipoActionPerformed
        GUIEliminarEquipo eq = new GUIEliminarEquipo(dataE);
        eq.inicializar();
        eq.setVisible(true);
    }//GEN-LAST:event_botonEliminarEquipoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        GUIEliminarClienteProductos ecs = new GUIEliminarClienteProductos(dataC);
        ecs.inicializar();
        ecs.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonEliminarCliente;
    private javax.swing.JButton botonEliminarEquipo;
    private javax.swing.JButton botonEliminarPlan;
    private javax.swing.JButton botonSalir;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}

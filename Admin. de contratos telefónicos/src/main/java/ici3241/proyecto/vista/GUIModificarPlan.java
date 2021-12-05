package ici3241.proyecto.vista;
import ici3241.proyecto.controlador.PlanData;
import ici3241.proyecto.modelo.Plan;

public class GUIModificarPlan extends javax.swing.JFrame implements LimpiarCampos {
    
    private PlanData dataP;
    
    public GUIModificarPlan(PlanData dataP) {
        initComponents();
        this.dataP = dataP;
        setLocationRelativeTo(null);
    }
    
    public void limpiarCampos() {
        this.campoNombrePlan.setText("");
    }
    
    void inicializar() {
        limpiarCampos();
        mostrarPlanes();
    }
    
    void mostrarPlanes() {
        String[][] matriz = new String[dataP.getListaPlanes().size()][5];
        for (int i = 0 ; i < dataP.getListaPlanes().size() ; i++) {
            matriz[i][0] =  dataP.getListaPlanes().get(i).getNombrePlan();
            matriz[i][1] =  ("$"+Integer.toString(dataP.getListaPlanes().get(i).getPrecioPlan()));
            matriz[i][2] =  Integer.toString(dataP.getListaPlanes().get(i).getTotalNavegacion());
            matriz[i][3] =  dataP.getListaPlanes().get(i).getTotalMinutos();
            matriz[i][4] =  Integer.toString(dataP.getListaPlanes().get(i).getTotalMensajes());
        }        
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            matriz,
            new String [] {
                "Nombre", "Precio", "Navegación", "Minutos", "Mensajes"
            }
        ));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelTitulo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        campoNombrePlan = new javax.swing.JTextField();
        botonSalir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        botonModificarPlan = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelTitulo.setText("Seleccione el plan a modificar");

        jLabel2.setText("Nombre Plan:");

        campoNombrePlan.setText("jTextField1");

        botonSalir.setText("Salir");
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Precio", "Navegación", "Minutos", "Mensajes"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        botonModificarPlan.setText("Modificar");
        botonModificarPlan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificarPlanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 643, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(botonSalir)
                                .addGap(9, 9, 9))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(182, 182, 182)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(labelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(34, 34, 34)
                                        .addComponent(campoNombrePlan, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(244, 244, 244)
                                .addComponent(botonModificarPlan, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(labelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(campoNombrePlan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(botonModificarPlan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonSalir)
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        dispose();
    }//GEN-LAST:event_botonSalirActionPerformed

    private void botonModificarPlanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarPlanActionPerformed
        String key = this.campoNombrePlan.getText();
        dataP.eliminarPlan(key);
        GUIAgregarPlan ap = new GUIAgregarPlan(dataP);
        ap.inicializar();
        ap.setVisible(true);
        dispose();
    }//GEN-LAST:event_botonModificarPlanActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonModificarPlan;
    private javax.swing.JButton botonSalir;
    private javax.swing.JTextField campoNombrePlan;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel labelTitulo;
    // End of variables declaration//GEN-END:variables
}

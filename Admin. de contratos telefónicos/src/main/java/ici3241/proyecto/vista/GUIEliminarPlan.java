package ici3241.proyecto.vista;
import ici3241.proyecto.controlador.PlanData;

public class GUIEliminarPlan extends javax.swing.JFrame implements LimpiarCampos {
    private PlanData dataP;
    
    public GUIEliminarPlan(PlanData dataP) {
        initComponents();
        this.dataP = dataP;
        setLocationRelativeTo(null);
    }
    
    public void limpiarCampos() {
        this.campoIDPlan.setText("");
        this.labelInfo.setText("");
    }
    
    void mostrarInfo(String info) {
        this.labelInfo.setText(info);
    }
            
    void inicializar() {
        limpiarCampos();
        mostrarPlanes();
    }
    
    void mostrarPlanes() {
        String[][] matriz = new String[dataP.getListaPlanes().size()][6];
        for (int i = 0 ; i < dataP.getListaPlanes().size() ; i++) {
            matriz[i][0] = Integer.toString(i+1);
            matriz[i][1] = dataP.getListaPlanes().get(i).getNombrePlan();
            matriz[i][2] = Integer.toString(dataP.getListaPlanes().get(i).getPrecioPlan());
            matriz[i][3] = Integer.toString(dataP.getListaPlanes().get(i).getTotalNavegacion());
            matriz[i][4] = dataP.getListaPlanes().get(i).getTotalMinutos();
            matriz[i][5] = Integer.toString(dataP.getListaPlanes().get(i).getTotalMensajes());
        }
        
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            matriz,
            new String [] {
                "ID", "Nombre", "Precio", "Navegación (GBs)", "Minutos", "Mensajes"
            }
        ));
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        campoIDPlan = new javax.swing.JTextField();
        botonEliminarPlan = new javax.swing.JButton();
        labelInfo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Precio", "Navegación (GBs)", "Minutos", "Mensajes"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setText("Ingrese ID:");

        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        campoIDPlan.setText("jTextField1");

        botonEliminarPlan.setText("Eliminar");
        botonEliminarPlan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarPlanActionPerformed(evt);
            }
        });

        labelInfo.setText("jLabel2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButton1))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(168, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(campoIDPlan, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(256, 256, 256))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(226, 226, 226)
                        .addComponent(botonEliminarPlan, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(194, 194, 194)
                .addComponent(labelInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(campoIDPlan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(labelInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonEliminarPlan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jButton1)
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonEliminarPlanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarPlanActionPerformed
        String idStr = this.campoIDPlan.getText();
        if ("".equals(idStr)) {
            mostrarInfo("Debe ingresar una ID");
            return;            
        } else {
            int id = Integer.parseInt(idStr)-1;
            if(id+1 > dataP.getListaPlanes().size() || id < 0) {
                mostrarInfo("El elemento no existe");
            } else {
                dataP.getListaPlanes().remove(id);
                limpiarCampos();
                mostrarInfo("Elemento eliminado");
            }
        }
    }//GEN-LAST:event_botonEliminarPlanActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonEliminarPlan;
    private javax.swing.JTextField campoIDPlan;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel labelInfo;
    // End of variables declaration//GEN-END:variables
}

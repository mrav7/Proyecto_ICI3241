package ici3241.proyecto.vista;
import ici3241.proyecto.controlador.PlanData;


public class GUIListarPlan extends javax.swing.JFrame {
    PlanData dataP;

    public GUIListarPlan(PlanData dataP) {
        initComponents();
        setLocationRelativeTo(null);
        this.dataP = dataP;
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
                "Nombre", "Precio", "Navegacición (GBs)", "Minutos", "Mensajes"
            }
        ));       
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        botonSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Precio", "Navegacición (GBs)", "Minutos", "Mensajes"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(498, Short.MAX_VALUE)
                .addComponent(botonSalir)
                .addGap(30, 30, 30))
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 561, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(botonSalir)
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        dispose();
    }//GEN-LAST:event_botonSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonSalir;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}

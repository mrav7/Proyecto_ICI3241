package ici3241.proyecto.vista;
import ici3241.proyecto.controlador.PlanData;
import ici3241.proyecto.modelo.Plan;

public class GUIListarPlanMinMax extends javax.swing.JFrame {
    
    private PlanData dataP;
    
    public GUIListarPlanMinMax(PlanData dataP) {
        initComponents();
        this.dataP = dataP;
        setLocationRelativeTo(null);
    }
    
    void llenarTabla() {
        String[][] matriz = new String[2][5];
        Plan min = dataP.buscarMinPlanPrecio(), max = dataP.buscarMaxPlanPrecio();
        matriz[0][0] = min.getNombrePlan();
        matriz[0][1] = ("$"+Integer.toString(min.getPrecioPlan()));
        matriz[0][2] = Integer.toString(min.getTotalNavegacion());
        matriz[0][3] = min.getTotalMinutos();
        matriz[0][4] = Integer.toString(min.getTotalMensajes());
        matriz[1][0] = max.getNombrePlan();
        matriz[1][1] = ("$"+Integer.toString(max.getPrecioPlan()));
        matriz[1][2] = Integer.toString(max.getTotalNavegacion());
        matriz[1][3] = max.getTotalMinutos();
        matriz[1][4] = Integer.toString(max.getTotalMensajes());
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            matriz,
            new String [] {
                "Nombre", "Precio", "Navegación", "Minutos", "Mensajes"
            }
        ));
    }
    
    void inicializar() {
        llenarTabla();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        botonSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Plan más barato y más caro");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Precio", "Navegación", "Minutos", "Mensajes"
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
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botonSalir)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(200, 200, 200)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(30, 30, 30)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 561, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addComponent(botonSalir)
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        dispose();
    }//GEN-LAST:event_botonSalirActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}

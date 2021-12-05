package ici3241.proyecto.vista;
import ici3241.proyecto.controlador.EquipoData;


public class GUIListarEquipo extends javax.swing.JFrame {
    private EquipoData dataE;
    
    public GUIListarEquipo(EquipoData dataE) {
        initComponents();
        setLocationRelativeTo(null);
        this.dataE = dataE;
    }
    
    void mostrarEquipos() {
        String[][] matriz = new String[dataE.getListaEquipos().size()][5];
        for (int i = 0 ; i < dataE.getListaEquipos().size() ; i++) {
            matriz[i][0] = dataE.getListaEquipos().get(i).getNombreEquipo();
            matriz[i][1] = dataE.getListaEquipos().get(i).getMarcaEquipo();
            matriz[i][2] = dataE.getListaEquipos().get(i).getAlmacenamientoEquipo();
            matriz[i][3] = ("$"+dataE.getListaEquipos().get(i).getPrecioEquipoPlan());
            matriz[i][4] = ("$"+dataE.getListaEquipos().get(i).getPrecioEquipoLiberado());
        }        
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            matriz,
            new String [] {
                "Modelo", "Marca", "Almacenamiento (GBs)", "Precio Plan", "Precio Liberado"
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
                {null, null, null, null, null}
            },
            new String [] {
                "Modelo", "Marca", "Almacenamiento (GBs)", "Precio Plan", "Precio Liberado"
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
                .addContainerGap(534, Short.MAX_VALUE)
                .addComponent(botonSalir)
                .addGap(30, 30, 30))
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 602, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(botonSalir)
                .addGap(30, 30, 30))
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

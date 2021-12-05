package ici3241.proyecto.vista;
import ici3241.proyecto.controlador.EquipoData;


public class GUIEliminarEquipo extends javax.swing.JFrame implements LimpiarCampos {
    private EquipoData dataE;
    
    public GUIEliminarEquipo(EquipoData dataE) {
        initComponents();
        this.dataE = dataE;
        setLocationRelativeTo(null);
    }
    
    public void limpiarCampos() {
        this.campoIDEquipo.setText("");
        this.labelInfo.setText("");
    }
    
    void mostrarInfo(String info) {
        this.labelInfo.setText(info);
    }
    
    void inicializar() {
        limpiarCampos();
        mostrarEquipos();
    }
        
    public void mostrarEquipos() {
        String[][] matriz = new String[dataE.getListaEquipos().size()][6];
        for (int i = 0 ; i < dataE.getListaEquipos().size() ; i++) {
            matriz[i][0] = Integer.toString(i+1);
            matriz[i][1] = dataE.getListaEquipos().get(i).getNombreEquipo();
            matriz[i][2] = dataE.getListaEquipos().get(i).getMarcaEquipo();
            matriz[i][3] = dataE.getListaEquipos().get(i).getAlmacenamientoEquipo();
            matriz[i][4] = dataE.getListaEquipos().get(i).getPrecioEquipoPlan();
            matriz[i][5] = dataE.getListaEquipos().get(i).getPrecioEquipoLiberado();        
        }
        
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            matriz,
            new String [] {
                "ID", "Modelo", "Marca", "Almacenamiento", "Precio Plan", "Precio Liberado"
            }
        ));    
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        campoIDEquipo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        labelInfo = new javax.swing.JLabel();
        botonEliminarEquipo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        campoIDEquipo.setText("jTextField1");

        jLabel1.setText("Ingrese ID:");

        labelInfo.setText("jLabel2");

        botonEliminarEquipo.setText("Eliminar");
        botonEliminarEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarEquipoActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Modelo", "Marca", "Almacenamiento", "Precio Plan", "Precio Liberado"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(183, 183, 183)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campoIDEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(212, 212, 212)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(botonEliminarEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 608, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 12, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoIDEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonEliminarEquipo)
                .addGap(24, 24, 24)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void botonEliminarEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarEquipoActionPerformed
        String idStr = this.campoIDEquipo.getText();
        if ("".equals(idStr)) {
            mostrarInfo("Debe ingresar una ID");
            return;            
        } else {
            int id = Integer.parseInt(idStr)-1;
            if(id+1 > dataE.getListaEquipos().size() || id < 0) {
                mostrarInfo("El elemento no existe");
                return;
            } else {
                dataE.getListaEquipos().remove(id);
                limpiarCampos();
                mostrarInfo("Elemento eliminado");
            }
        }
    }//GEN-LAST:event_botonEliminarEquipoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonEliminarEquipo;
    private javax.swing.JTextField campoIDEquipo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel labelInfo;
    // End of variables declaration//GEN-END:variables
}

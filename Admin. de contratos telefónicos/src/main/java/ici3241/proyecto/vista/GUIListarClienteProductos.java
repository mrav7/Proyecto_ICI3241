package ici3241.proyecto.vista;
import ici3241.proyecto.controlador.ClienteData;
import ici3241.proyecto.modelo.Cliente;

public class GUIListarClienteProductos extends javax.swing.JFrame implements LimpiarCampos {

    ClienteData dataC;
    
    public GUIListarClienteProductos(ClienteData dataC) {
        initComponents();
        this.dataC = dataC;
        setLocationRelativeTo(null);
    }
    
    void llenarTablaPlanes(Cliente c) {
        String[][] matrizPlanes = new String[c.getPlanesCliente().size()][7];
        
        for (int i = 0 ; i < c.getPlanesCliente().size() ; i++) {            
            matrizPlanes[i][0] = c.getPlanesCliente().get(i).getNombrePlan();
            matrizPlanes[i][1] = Integer.toString(c.getPlanesCliente().get(i).getTotalNavegacionGastado());
            matrizPlanes[i][2] = c.getPlanesCliente().get(i).getTotalMinutosGastado();
            matrizPlanes[i][3] = Integer.toString(c.getPlanesCliente().get(i).getTotalMensajesGastado());
            matrizPlanes[i][4] = c.getPlanesCliente().get(i).getFechaInicioContrato();
            matrizPlanes[i][5] = c.getPlanesCliente().get(i).getFechaSiguienteFactura();
        }
        
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            matrizPlanes,
            new String [] {
                "Nombre ", "Navegación Gastada", "Minutos Gastado", "Mensajes Gastado", "Fecha Inicio", "Fecha Sig. Factura"
            }
        ));
    }
    
    void llenarTablaEquipos(Cliente c) {
    String[][] matrizEquipos = new String[c.getEquiposCliente().size()][7];

        for (int i = 0 ; i < c.getEquiposCliente().size() ; i++) {            
            matrizEquipos[i][0] = c.getEquiposCliente().get(i).getNombreEquipo();
            matrizEquipos[i][1] = c.getEquiposCliente().get(i).getMarcaEquipo();
            matrizEquipos[i][2] = c.getEquiposCliente().get(i).getAlmacenamientoEquipo();
            matrizEquipos[i][3] = c.getEquiposCliente().get(i).getPrecioEquipoPlan();
            matrizEquipos[i][4] = c.getEquiposCliente().get(i).getPrecioEquipoLiberado();
            matrizEquipos[i][5] = c.getEquiposCliente().get(i).getPlanEquipo();
        }
        
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            matrizEquipos,
            new String [] {
                "Modelo", "Marca", "Almacenamiento", "Plan", "Precio Plan", "Precio Liberado"
            }
        ));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        campoRutCliente = new javax.swing.JTextField();
        labelInfo = new javax.swing.JLabel();
        botonSalir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        botonBuscarCliente = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Seleccione el cliente");

        jLabel2.setText("RUT Cliente:");

        campoRutCliente.setText("jTextField1");

        labelInfo.setText("jLabel3");

        botonSalir.setText("Salir");
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Nombre ", "Navegación Gastada", "Minutos Gastado", "Mensajes Gastado", "Fecha Inicio", "Fecha Sig. Factura"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Modelo", "Marca", "Almacenamiento", "Plan", "Precio Plan", "Precio Liberado"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jLabel3.setText("Planes");

        jLabel4.setText("Equipos");

        botonBuscarCliente.setText("Buscar");
        botonBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarClienteActionPerformed(evt);
            }
        });

        jButton1.setText("Limpiar");
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
                .addGap(260, 260, 260)
                .addComponent(labelInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(186, 186, 186)
                                .addComponent(jLabel2)
                                .addGap(35, 35, 35)
                                .addComponent(campoRutCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(botonBuscarCliente))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(260, 260, 260)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(302, 302, 302)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(305, 305, 305)
                                .addComponent(jLabel4)))
                        .addGap(0, 265, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButton1)
                                .addGap(18, 18, 18)
                                .addComponent(botonSalir))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(campoRutCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonBuscarCliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonSalir)
                    .addComponent(jButton1))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        dispose();
    }//GEN-LAST:event_botonSalirActionPerformed

    private void botonBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarClienteActionPerformed
        int key = Integer.parseInt(this.campoRutCliente.getText());
        if (dataC.buscarCliente(key) == null) {
            this.labelInfo.setText("Cliente no existe");
        } else {
            llenarTablaPlanes(dataC.buscarCliente(key));
            llenarTablaEquipos(dataC.buscarCliente(key));        
        }
    }//GEN-LAST:event_botonBuscarClienteActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       limpiarCampos();
    }//GEN-LAST:event_jButton1ActionPerformed

    public void limpiarCampos() {
        this.campoRutCliente.setText("");
        this.labelInfo.setText("");
        
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Nombre ", "Navegación Gastada", "Minutos Gastado", "Mensajes Gastado", "Fecha Inicio", "Fecha Sig. Factura"
            }
        ));
        
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Modelo", "Marca", "Almacenamiento", "Plan", "Precio Plan", "Precio Liberado"
            }
        ));  
    }
    
    public void inicializar() {
        limpiarCampos();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonBuscarCliente;
    private javax.swing.JButton botonSalir;
    private javax.swing.JTextField campoRutCliente;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel labelInfo;
    // End of variables declaration//GEN-END:variables
}

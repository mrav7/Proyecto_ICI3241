package ici3241.proyecto.vista;
import ici3241.proyecto.controlador.ClienteData;
import ici3241.proyecto.modelo.Cliente;


public class GUIEliminarClienteProductos extends javax.swing.JFrame implements LimpiarCampos {
    
    private ClienteData dataC;
    
    public GUIEliminarClienteProductos(ClienteData dataC) {
        initComponents();
        this.dataC = dataC;
        setLocationRelativeTo(null);
    }
    
    public void limpiarCampos() {
        this.campoRutCliente.setText("");
        this.campoIDPlan.setText("");
        this.campoIDEquipo.setText("");
        this.labelInfoBusqueda.setText("");
    }
    
    void inicializar() {
        limpiarCampos();
    }
    
    void llenarTablaPlanes(Cliente c) {
        String[][] matrizPlanes = new String[c.getPlanesCliente().size()][7];
        
        for (int i = 0 ; i < c.getPlanesCliente().size() ; i++) {
            matrizPlanes[i][0] = Integer.toString(i+1);
            matrizPlanes[i][1] = c.getPlanesCliente().get(i).getNombrePlan();
            matrizPlanes[i][2] = Integer.toString(c.getPlanesCliente().get(i).getTotalNavegacionGastado());
            matrizPlanes[i][3] = c.getPlanesCliente().get(i).getTotalMinutosGastado();
            matrizPlanes[i][4] = Integer.toString(c.getPlanesCliente().get(i).getTotalMensajesGastado());
            matrizPlanes[i][5] = c.getPlanesCliente().get(i).getFechaInicioContrato();
            matrizPlanes[i][6] = c.getPlanesCliente().get(i).getFechaSiguienteFactura();
        }
        
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            matrizPlanes,
            new String [] {
                "ID Plan", "Nombre", "Navegación Gastada", "Minutos Gastado", "Mensajes Gastado", "Fecha Inicio", "Fecha Sig. Factura"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
    }
    
    void llenarTablaEquipos(Cliente c) {
    String[][] matrizEquipos = new String[c.getEquiposCliente().size()][7];

        for (int j = 0 ; j < c.getEquiposCliente().size() ; j++) {

            matrizEquipos[j][0] = Integer.toString(j+1);
            matrizEquipos[j][1] = c.getEquiposCliente().get(j).getNombreEquipo();
            matrizEquipos[j][2] = c.getEquiposCliente().get(j).getMarcaEquipo();
            matrizEquipos[j][3] = c.getEquiposCliente().get(j).getAlmacenamientoEquipo();
            matrizEquipos[j][4] = c.getEquiposCliente().get(j).getPrecioEquipoPlan();
            matrizEquipos[j][5] = c.getEquiposCliente().get(j).getPrecioEquipoLiberado();
            matrizEquipos[j][6] = c.getEquiposCliente().get(j).getPlanEquipo();
        }

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
           matrizEquipos,
            new String [] {
                "ID Equipo", "Modelo", "Marca", "Almacenamiento", "Precio Plan", "Precio Liberado", "Plan"
            }
        ));
    
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        campoRutCliente = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        campoIDPlan = new javax.swing.JTextField();
        botonEliminarPlan = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        campoIDEquipo = new javax.swing.JTextField();
        botonEliminarEquipo = new javax.swing.JButton();
        botonBuscarCliente = new javax.swing.JButton();
        labelInfoBusqueda = new javax.swing.JLabel();
        botonLimpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("      Seleccione el cliente");

        campoRutCliente.setText("jTextField1");

        jLabel2.setText("RUT Cliente:");

        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID Plan", "Nombre", "Navegación Gastada", "Minutos Gastado", "Mensajes Gastado", "Fecha Inicio", "Fecha Sig. Factura"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID Equipo", "Modelo", "Marca", "Almacenamiento", "Precio Plan", "Precio Liberado", "Plan"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jLabel3.setText("ID Plan:");

        campoIDPlan.setText("jTextField2");

        botonEliminarPlan.setText("Eliminar");
        botonEliminarPlan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarPlanActionPerformed(evt);
            }
        });

        jLabel4.setText("ID Equipo:");

        campoIDEquipo.setText("jTextField3");

        botonEliminarEquipo.setText("Eliminar");
        botonEliminarEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarEquipoActionPerformed(evt);
            }
        });

        botonBuscarCliente.setText("Buscar");
        botonBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarClienteActionPerformed(evt);
            }
        });

        labelInfoBusqueda.setText("jLabel5");

        botonLimpiar.setText("Limpiar");
        botonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(botonLimpiar)
                                .addGap(31, 31, 31)
                                .addComponent(jButton1)))
                        .addGap(17, 17, 17))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 213, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(campoIDEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botonEliminarEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(412, 412, 412))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(278, 278, 278)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(237, 237, 237)
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(campoIDPlan, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(botonEliminarPlan, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(230, 230, 230)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(campoRutCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(botonBuscarCliente)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(300, 300, 300)
                .addComponent(labelInfoBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoRutCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonBuscarCliente))
                .addGap(18, 18, 18)
                .addComponent(labelInfoBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoIDPlan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonEliminarPlan)
                    .addComponent(jLabel3))
                .addGap(58, 58, 58)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoIDEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(botonEliminarEquipo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(botonLimpiar))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void botonEliminarEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarEquipoActionPerformed
        int nroPlan = Integer.parseInt(this.campoIDEquipo.getText())-1;
        Cliente c = dataC.buscarCliente(Integer.parseInt(this.campoRutCliente.getText()));
        c.getEquiposCliente().remove(nroPlan);
        llenarTablaEquipos(c);
    }//GEN-LAST:event_botonEliminarEquipoActionPerformed

    private void botonBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarClienteActionPerformed
        int key = Integer.parseInt(this.campoRutCliente.getText());
        if (dataC.buscarCliente(key) != null) {
            llenarTablaPlanes(dataC.buscarCliente(key));
            llenarTablaEquipos(dataC.buscarCliente(key));
        } else {
            this.labelInfoBusqueda.setText("El cliente no existe");
        }
    }//GEN-LAST:event_botonBuscarClienteActionPerformed

    private void botonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonLimpiarActionPerformed
       limpiarCampos();
       
       jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID Plan", "Nombre", "Navegación Gastada", "Minutos Gastado", "Mensajes Gastado", "Fecha Inicio", "Fecha Sig. Factura"
            }
        ));
       
       jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID Equipo", "Modelo", "Marca", "Almacenamiento", "Precio Plan", "Precio Liberado", "Plan"
            }
        ));
       
       
    }//GEN-LAST:event_botonLimpiarActionPerformed

    private void botonEliminarPlanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarPlanActionPerformed
        int nroPlan = Integer.parseInt(this.campoIDPlan.getText())-1;
        Cliente c = dataC.buscarCliente(Integer.parseInt(this.campoRutCliente.getText()));
        c.getPlanesCliente().remove(nroPlan);
        llenarTablaPlanes(c);
        
    }//GEN-LAST:event_botonEliminarPlanActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonBuscarCliente;
    private javax.swing.JButton botonEliminarEquipo;
    private javax.swing.JButton botonEliminarPlan;
    private javax.swing.JButton botonLimpiar;
    private javax.swing.JTextField campoIDEquipo;
    private javax.swing.JTextField campoIDPlan;
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
    private javax.swing.JLabel labelInfoBusqueda;
    // End of variables declaration//GEN-END:variables
}

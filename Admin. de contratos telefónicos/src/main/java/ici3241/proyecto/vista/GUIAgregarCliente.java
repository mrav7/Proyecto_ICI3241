package ici3241.proyecto.vista;
import ici3241.proyecto.modelo.Cliente;
import ici3241.proyecto.controlador.ClienteData;
import java.io.*;

public class GUIAgregarCliente extends javax.swing.JDialog implements LimpiarCampos {   
    ClienteData dataC;
    
    public GUIAgregarCliente(java.awt.Frame parent, boolean modal, ClienteData dataC) {
        super(parent, modal);
        this.dataC = dataC;
        initComponents();
        setLocationRelativeTo(null);
    }
    
    public GUIAgregarCliente(ClienteData dataC) {
        this.dataC = dataC;
        initComponents();
        setLocationRelativeTo(null);
    }
    
    @Override
    public void limpiarCampos() {
        this.campoNombreCliente.setText("");
        this.campoNumeroCliente.setText("");
        this.campoDireccionCliente.setText("");
        this.campoRUTCliente.setText("");
        this.labelInfo.setText("");        
    }
    
    void inicializar() {        
        limpiarCampos();
    }
    
    void mostrarInfo(String mensaje) {
        this.labelInfo.setText(mensaje);
    }
    
    void agregarCliente(Cliente c) throws FileNotFoundException, IOException {
        FileWriter f = new FileWriter("clientes.csv", true);
        PrintWriter w = new PrintWriter(f);
        w.printf("\n%s,%d,%s,%s", c.getNombre(), c.getRut(), c.getDireccion(), c.getNumeroCliente(), c.getPlan());
        w.close();
        dataC.getMapaClientesNombres().put(c.getNombre(), c);
        dataC.getMapaClientesRut().put(c.getRut(), c);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelTitulo = new javax.swing.JLabel();
        labelNombreCliente = new javax.swing.JLabel();
        labelRUTCliente = new javax.swing.JLabel();
        labelDireccionCliente = new javax.swing.JLabel();
        labelNumeroCliente = new javax.swing.JLabel();
        labelPlanCliente = new javax.swing.JLabel();
        campoNombreCliente = new javax.swing.JTextField();
        campoRUTCliente = new javax.swing.JTextField();
        campoDireccionCliente = new javax.swing.JTextField();
        campoNumeroCliente = new javax.swing.JTextField();
        campoPlanCliente = new javax.swing.JComboBox<>();
        botonLimpiarCampos = new javax.swing.JButton();
        botonAgregarCliente = new javax.swing.JButton();
        labelInfo = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        labelTitulo.setText("Agregar Nuevo Cliente");

        labelNombreCliente.setText("Nombre:");

        labelRUTCliente.setText("RUT:");

        labelDireccionCliente.setText("Dirección:");

        labelNumeroCliente.setText("Número telefónico:");

        labelPlanCliente.setText("Plan:");

        campoNombreCliente.setText("jTextField1");

        campoRUTCliente.setText("jTextField2");

        campoDireccionCliente.setText("jTextField3");

        campoNumeroCliente.setText("jTextField4");

        campoPlanCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione un plan", "Iron", "Bronze", "Gold", "Platinum", "Diamond" }));

        botonLimpiarCampos.setText("Limpiar");
        botonLimpiarCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonLimpiarCamposActionPerformed(evt);
            }
        });

        botonAgregarCliente.setText("Agregar");
        botonAgregarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarClienteActionPerformed(evt);
            }
        });

        labelInfo.setText("                jLabel1");

        jButton1.setText("Salir");
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
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelNumeroCliente)
                    .addComponent(labelNombreCliente, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelRUTCliente, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelDireccionCliente, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelPlanCliente, javax.swing.GroupLayout.Alignment.LEADING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(campoPlanCliente, 0, 152, Short.MAX_VALUE)
                    .addComponent(campoNumeroCliente)
                    .addComponent(campoDireccionCliente)
                    .addComponent(campoRUTCliente)
                    .addComponent(campoNombreCliente))
                .addGap(18, 18, 18))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(botonLimpiarCampos)
                        .addGap(18, 18, 18)
                        .addComponent(botonAgregarCliente)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(labelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(labelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNombreCliente)
                    .addComponent(campoNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelRUTCliente)
                    .addComponent(campoRUTCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDireccionCliente)
                    .addComponent(campoDireccionCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNumeroCliente)
                    .addComponent(campoNumeroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPlanCliente)
                    .addComponent(campoPlanCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(labelInfo, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonLimpiarCampos)
                    .addComponent(botonAgregarCliente)
                    .addComponent(jButton1))
                .addGap(42, 42, 42))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonAgregarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarClienteActionPerformed
        boolean errorIngresoVacio = false;
        
        if ( ("".equals(this.campoNombreCliente.getText())) || ("".equals(this.campoRUTCliente.getText())) || ("".equals(this.campoDireccionCliente.getText())) || ("".equals(this.campoNumeroCliente.getText())) || ("Seleccione un plan".equals(this.campoPlanCliente.getItemAt(this.campoPlanCliente.getSelectedIndex())))) errorIngresoVacio = true;
        if (errorIngresoVacio) {
            mostrarInfo("Debe completar todos los campos");
            return;
        }
        
        String nombre = this.campoNombreCliente.getText();
        String rut = this.campoRUTCliente.getText();
        String direccion = this.campoDireccionCliente.getText();
        String numero = this.campoNumeroCliente.getText();
        String plan = this.campoPlanCliente.getItemAt(this.campoPlanCliente.getSelectedIndex());
        Cliente cliente = new Cliente(nombre, rut, direccion, numero, plan);       
        
        try {
            agregarCliente(cliente);
        } catch (FileNotFoundException eFNF) {
            eFNF.printStackTrace();
        } catch(IOException eIO) {
            eIO.printStackTrace();
        }
        limpiarCampos();
        mostrarInfo("Cliente ingresado");        
    }//GEN-LAST:event_botonAgregarClienteActionPerformed

    private void botonLimpiarCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonLimpiarCamposActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_botonLimpiarCamposActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAgregarCliente;
    private javax.swing.JButton botonLimpiarCampos;
    private javax.swing.JTextField campoDireccionCliente;
    private javax.swing.JTextField campoNombreCliente;
    private javax.swing.JTextField campoNumeroCliente;
    private javax.swing.JComboBox<String> campoPlanCliente;
    private javax.swing.JTextField campoRUTCliente;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel labelDireccionCliente;
    private javax.swing.JLabel labelInfo;
    private javax.swing.JLabel labelNombreCliente;
    private javax.swing.JLabel labelNumeroCliente;
    private javax.swing.JLabel labelPlanCliente;
    private javax.swing.JLabel labelRUTCliente;
    private javax.swing.JLabel labelTitulo;
    // End of variables declaration//GEN-END:variables
}

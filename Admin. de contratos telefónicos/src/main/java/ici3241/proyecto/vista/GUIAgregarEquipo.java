package ici3241.proyecto.vista;
import ici3241.proyecto.modelo.Equipo;
import ici3241.proyecto.controlador.EquipoData;
import java.io.*;

public class GUIAgregarEquipo extends javax.swing.JDialog implements LimpiarCampos {
    private EquipoData dataE;    
    
    public GUIAgregarEquipo(EquipoData dataE) {
        initComponents();
        this.dataE = dataE;
        setLocationRelativeTo(null);
    }
    
    public void limpiarCampos() {
        this.campoModeloEquipo.setText("");        
        this.campoMarcaEquipo.setText("");        
        this.campoAlmacenamientoEquipo.setText("");        
        this.campoPrecioPEquipo.setText("");
        this.campoPrecioLEquipo.setText("");
        this.labelInfo.setText("");
    }
    
    void agregarEquipo(Equipo e) throws FileNotFoundException, IOException {
        FileWriter f = new FileWriter("equipos.csv", true);
        PrintWriter w = new PrintWriter(f);
        w.printf("\n%s,%s,%s,%s,%s", e.getNombreEquipo(), e.getMarcaEquipo(), e.getAlmacenamientoEquipo(), e.getPrecioEquipoPlan(), e.getPrecioEquipoLiberado());
        w.close();
        dataE.getListaEquipos().add(e);
    }
    
    void inicializar() {
        limpiarCampos();
    }
    
    void mostrarInfo(String mensaje) {
        this.labelInfo.setText(mensaje);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        labelModeloEquipo = new javax.swing.JLabel();
        labelMarcaEquipo = new javax.swing.JLabel();
        labelAlmacenamientoEquipo = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        campoMarcaEquipo = new javax.swing.JTextField();
        campoAlmacenamientoEquipo = new javax.swing.JTextField();
        campoPrecioPEquipo = new javax.swing.JTextField();
        campoPrecioLEquipo = new javax.swing.JTextField();
        botonLimpiarCampos = new javax.swing.JButton();
        botonAgregarEquipo = new javax.swing.JButton();
        campoModeloEquipo = new javax.swing.JTextField();
        labelInfo = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Agregar Equipo Telefónico");

        labelModeloEquipo.setText("Modelo:");

        labelMarcaEquipo.setText("Marca:");

        labelAlmacenamientoEquipo.setText("Almacenamiento (GBs):");

        jLabel5.setText("Precio Plan:");

        jLabel6.setText("Precio Liberado:");

        campoMarcaEquipo.setText("jTextField2");

        campoAlmacenamientoEquipo.setText("jTextField3");

        campoPrecioPEquipo.setText("jTextField4");

        campoPrecioLEquipo.setText("jTextField5");

        botonLimpiarCampos.setText("Limpiar");
        botonLimpiarCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonLimpiarCamposActionPerformed(evt);
            }
        });

        botonAgregarEquipo.setText("Agregar");
        botonAgregarEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarEquipoActionPerformed(evt);
            }
        });

        campoModeloEquipo.setText("jTextField1");

        labelInfo.setText("jLabel2");

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelModeloEquipo)
                            .addComponent(labelMarcaEquipo)
                            .addComponent(labelAlmacenamientoEquipo)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(campoMarcaEquipo, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                            .addComponent(campoAlmacenamientoEquipo)
                            .addComponent(campoPrecioPEquipo)
                            .addComponent(campoPrecioLEquipo)
                            .addComponent(campoModeloEquipo)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(labelInfo)))
                .addContainerGap(58, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(65, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(83, 83, 83))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(botonLimpiarCampos)
                        .addGap(18, 18, 18)
                        .addComponent(botonAgregarEquipo)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addGap(37, 37, 37))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelModeloEquipo)
                    .addComponent(campoModeloEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelMarcaEquipo)
                    .addComponent(campoMarcaEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelAlmacenamientoEquipo)
                    .addComponent(campoAlmacenamientoEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(campoPrecioPEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(campoPrecioLEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(labelInfo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonLimpiarCampos)
                    .addComponent(botonAgregarEquipo)
                    .addComponent(jButton1))
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonLimpiarCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonLimpiarCamposActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_botonLimpiarCamposActionPerformed

    private void botonAgregarEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarEquipoActionPerformed
        boolean errorIngresoVacio = false;
        
        if (("".equals(this.campoModeloEquipo.getText())) || ("".equals(this.campoMarcaEquipo.getText())) || ("".equals(this.campoAlmacenamientoEquipo.getText())) || ("".equals(this.campoPrecioPEquipo.getText())) || ("".equals(this.campoPrecioLEquipo.getText()))) errorIngresoVacio = true;
        if (errorIngresoVacio) {
            mostrarInfo("Debe completar todos los campos");
            return;
        }
        
        String modelo = this.campoModeloEquipo.getText();
        String marca = this.campoMarcaEquipo.getText();
        String almacenamiento = this.campoAlmacenamientoEquipo.getText();
        String precioP = this.campoPrecioPEquipo.getText();
        String precioL = this.campoPrecioLEquipo.getText();
        Equipo equipo = new Equipo(modelo, marca, almacenamiento, precioP, precioL);
                
        try {
            agregarEquipo(equipo);        
        } catch (FileNotFoundException eFNF) {
            eFNF.printStackTrace();
        } catch(IOException eIO) {
            eIO.printStackTrace();
        }
        limpiarCampos();
        mostrarInfo("Equipo ingresado");            
    }//GEN-LAST:event_botonAgregarEquipoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAgregarEquipo;
    private javax.swing.JButton botonLimpiarCampos;
    private javax.swing.JTextField campoAlmacenamientoEquipo;
    private javax.swing.JTextField campoMarcaEquipo;
    private javax.swing.JTextField campoModeloEquipo;
    private javax.swing.JTextField campoPrecioLEquipo;
    private javax.swing.JTextField campoPrecioPEquipo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel labelAlmacenamientoEquipo;
    private javax.swing.JLabel labelInfo;
    private javax.swing.JLabel labelMarcaEquipo;
    private javax.swing.JLabel labelModeloEquipo;
    // End of variables declaration//GEN-END:variables
}

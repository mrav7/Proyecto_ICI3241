package ici3241.proyecto.vista;
import ici3241.proyecto.modelo.Plan;
import ici3241.proyecto.controlador.PlanData;
import java.io.*;

public class GUIAgregarPlan extends javax.swing.JDialog implements LimpiarCampos {
    private PlanData dataP;
    
    public GUIAgregarPlan(PlanData dataP) {
        initComponents();
        this.dataP = dataP;
        setLocationRelativeTo(null);
    }
    
    @Override
    public void limpiarCampos() {
        this.campoNombrePlan.setText("");
        this.campoPrecioPlan.setText("");
        this.campoNavegacionPlan.setText("");
        this.campoMinutosPlan.setText("");
        this.campoMensajesPlan.setText("");
        this.labelInfo.setText("");
    }
    
    void agregarPlan(Plan p) throws FileNotFoundException, IOException {
        FileWriter f = new FileWriter("planes.csv", true);
        PrintWriter w = new PrintWriter(f);
        w.printf("\n%s,%d,%d,%s,%d", p.getNombrePlan(), p.getPrecioPlan(), p.getTotalNavegacion(), p.getTotalMinutos(), p.getTotalMensajes());
        w.close();
        dataP.getListaPlanes().add(p);
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

        labelTitulo = new javax.swing.JLabel();
        labelNombrePlan = new javax.swing.JLabel();
        labelPrecioPlan = new javax.swing.JLabel();
        labelNavegacionPlan = new javax.swing.JLabel();
        labelMinutosPlan = new javax.swing.JLabel();
        labelMensajesPlan = new javax.swing.JLabel();
        campoNombrePlan = new javax.swing.JTextField();
        campoPrecioPlan = new javax.swing.JTextField();
        campoNavegacionPlan = new javax.swing.JTextField();
        campoMinutosPlan = new javax.swing.JTextField();
        campoMensajesPlan = new javax.swing.JTextField();
        botonLimpiarCampos = new javax.swing.JButton();
        botonAgregarPlan = new javax.swing.JButton();
        labelInfo = new javax.swing.JLabel();
        botonSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        labelTitulo.setText("Agregar Plan");

        labelNombrePlan.setText("Nombre:");

        labelPrecioPlan.setText("Precio:");

        labelNavegacionPlan.setText("Navegacion:");

        labelMinutosPlan.setText("Minutos:");

        labelMensajesPlan.setText("Mensajes:");

        campoNombrePlan.setText("jTextField1");

        campoPrecioPlan.setText("jTextField2");

        campoNavegacionPlan.setText("jTextField3");

        campoMinutosPlan.setText("jTextField4");

        campoMensajesPlan.setText("jTextField5");

        botonLimpiarCampos.setText("Limpiar");
        botonLimpiarCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonLimpiarCamposActionPerformed(evt);
            }
        });

        botonAgregarPlan.setText("Agregar");
        botonAgregarPlan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarPlanActionPerformed(evt);
            }
        });

        labelInfo.setText("jLabel1");

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(labelTitulo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelMensajesPlan)
                                    .addComponent(labelMinutosPlan)
                                    .addComponent(labelNavegacionPlan)
                                    .addComponent(labelPrecioPlan)
                                    .addComponent(labelNombrePlan))
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(campoNombrePlan, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                                    .addComponent(campoPrecioPlan)
                                    .addComponent(campoNavegacionPlan)
                                    .addComponent(campoMinutosPlan)
                                    .addComponent(campoMensajesPlan)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(botonLimpiarCampos)
                                .addGap(18, 18, 18)
                                .addComponent(botonAgregarPlan)
                                .addGap(18, 18, 18)
                                .addComponent(botonSalir)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(17, 17, 17))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(labelInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelTitulo)
                        .addGap(37, 37, 37)
                        .addComponent(labelNombrePlan))
                    .addComponent(campoNombrePlan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPrecioPlan)
                    .addComponent(campoPrecioPlan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNavegacionPlan)
                    .addComponent(campoNavegacionPlan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelMinutosPlan)
                    .addComponent(campoMinutosPlan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelMensajesPlan)
                    .addComponent(campoMensajesPlan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(labelInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonLimpiarCampos)
                    .addComponent(botonAgregarPlan)
                    .addComponent(botonSalir))
                .addGap(48, 48, 48))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonLimpiarCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonLimpiarCamposActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_botonLimpiarCamposActionPerformed

    private void botonAgregarPlanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarPlanActionPerformed
        boolean errorIngresoVacio = false;   
        
        if (("".equals(this.campoNombrePlan.getText())) || ("".equals(this.campoPrecioPlan.getText())) || ("".equals(this.campoNavegacionPlan.getText())) || ("".equals(this.campoMinutosPlan.getText())) || ("".equals(this.campoMensajesPlan.getText()))) errorIngresoVacio = true;
        if (errorIngresoVacio) {
            mostrarInfo("Debe ingresar todos los campos");
            return;
        } 
        
        String nombre = this.campoNombrePlan.getText();
        String precio = this.campoPrecioPlan.getText();
        String navegacion = this.campoNavegacionPlan.getText();
        String minutos = this.campoMinutosPlan.getText();
        String mensajes = this.campoMensajesPlan.getText();             
        Plan plan = new Plan(nombre, Integer.parseInt(precio), Integer.parseInt(navegacion), minutos, Integer.parseInt(mensajes));
        
        try {
            agregarPlan(plan);        
        } catch (FileNotFoundException eFNF) {
            eFNF.printStackTrace();
        } catch(IOException eIO) {
            eIO.printStackTrace();
        }
        limpiarCampos();
        mostrarInfo("Plan ingresado"); 
    }//GEN-LAST:event_botonAgregarPlanActionPerformed
              
     
    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        dispose();
    }//GEN-LAST:event_botonSalirActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAgregarPlan;
    private javax.swing.JButton botonLimpiarCampos;
    private javax.swing.JButton botonSalir;
    private javax.swing.JTextField campoMensajesPlan;
    private javax.swing.JTextField campoMinutosPlan;
    private javax.swing.JTextField campoNavegacionPlan;
    private javax.swing.JTextField campoNombrePlan;
    private javax.swing.JTextField campoPrecioPlan;
    private javax.swing.JLabel labelInfo;
    private javax.swing.JLabel labelMensajesPlan;
    private javax.swing.JLabel labelMinutosPlan;
    private javax.swing.JLabel labelNavegacionPlan;
    private javax.swing.JLabel labelNombrePlan;
    private javax.swing.JLabel labelPrecioPlan;
    private javax.swing.JLabel labelTitulo;
    // End of variables declaration//GEN-END:variables
}

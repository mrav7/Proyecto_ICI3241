package ici3241.proyecto.vista;
import ici3241.proyecto.controlador.*;
import ici3241.proyecto.modelo.*;
import java.io.*;

public class GUILogin extends javax.swing.JFrame implements LimpiarCampos {
    private GestorUsuarios gu = new GestorUsuarios();
    private ClienteData dataC;
    private EquipoData dataE;
    private PlanData dataP;    
    private String username;
    
    public GUILogin(ClienteData dataCliente, EquipoData dataEquipo, PlanData dataPlan) {
        initComponents();
        dataC = dataCliente;
        dataE = dataEquipo;
        dataP = dataPlan;
        setLocationRelativeTo(null);
    }
    
    @Override
    public void limpiarCampos() {
        this.campoPass.setText("");
        this.campoUsuario.setText("");
        this.labelInformacionLogeo.setText("");
    }
    
    void mostrarInfo(String info) {
        this.labelInformacionLogeo.setText(info);    
    }
    
    public void inicializar() {
        limpiarCampos();
    } 
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        labelTitulo = new javax.swing.JLabel();
        labelUsuario = new javax.swing.JLabel();
        labelContraseña = new javax.swing.JLabel();
        campoUsuario = new javax.swing.JTextField();
        labelInformacionLogeo = new javax.swing.JLabel();
        botonRegistrarse = new javax.swing.JButton();
        botonIngresar = new javax.swing.JButton();
        campoPass = new javax.swing.JPasswordField();
        botonSalir = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelTitulo.setText("Bienvenido al administrador de contratos telefónicos");

        labelUsuario.setText("Usuario:");

        labelContraseña.setText("Contraseña:");

        campoUsuario.setText("jTextField1");

        labelInformacionLogeo.setText("Info");

        botonRegistrarse.setText("Registrarse");
        botonRegistrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegistrarseActionPerformed(evt);
            }
        });

        botonIngresar.setText("Ingresar");
        botonIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIngresarActionPerformed(evt);
            }
        });

        campoPass.setText("jPasswordField1");

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
                .addGap(108, 108, 108)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(botonRegistrarse, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                    .addComponent(botonIngresar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 108, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelTitulo)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelUsuario)
                            .addComponent(labelContraseña))
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(campoUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                            .addComponent(campoPass))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(labelInformacionLogeo, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(150, 150, 150))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(botonSalir)
                        .addGap(21, 21, 21))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(labelTitulo)
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelUsuario)
                    .addComponent(campoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelContraseña)
                    .addComponent(campoPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addComponent(labelInformacionLogeo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(botonIngresar)
                .addGap(18, 18, 18)
                .addComponent(botonRegistrarse)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(botonSalir)
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIngresarActionPerformed
        String pass = new String(campoPass.getPassword());
        String flag = "";
        try {
            flag = gu.login(campoUsuario.getText(), pass);
                if(flag.equals("error")) {
                    limpiarCampos();
                    mostrarInfo("Error de ingreso");
                    return;
                }        
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        username = flag;
        limpiarCampos();
        this.setVisible(false);
            
        GUIMenu menu;
        if (username.equals("admin")) {
            UsuarioAdmin ua = new UsuarioAdmin("admin", "admin");
            menu = new GUIMenu(ua, dataC, dataE, dataP);
        } else {
            menu = new GUIMenu(new UsuarioCliente(flag, pass));                
        }
        menu.setVisible(true);
        dispose();       
    }//GEN-LAST:event_botonIngresarActionPerformed

    private void botonRegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistrarseActionPerformed
        try {
            if (gu.register(campoUsuario.getText(), campoPass.getText())) {
                mostrarInfo("Usuario registrado");
            } else {
                mostrarInfo("Error de registro");
            }
        } catch(IOException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_botonRegistrarseActionPerformed

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        dispose();
    }//GEN-LAST:event_botonSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonIngresar;
    private javax.swing.JButton botonRegistrarse;
    private javax.swing.JButton botonSalir;
    private javax.swing.JPasswordField campoPass;
    private javax.swing.JTextField campoUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel labelContraseña;
    private javax.swing.JLabel labelInformacionLogeo;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JLabel labelUsuario;
    // End of variables declaration//GEN-END:variables
}

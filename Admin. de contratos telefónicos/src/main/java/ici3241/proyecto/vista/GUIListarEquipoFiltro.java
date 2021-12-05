package ici3241.proyecto.vista;
import ici3241.proyecto.controlador.EquipoData;
import ici3241.proyecto.modelo.Equipo;
import java.util.ArrayList;

public class GUIListarEquipoFiltro extends javax.swing.JFrame implements LimpiarCampos {

    private EquipoData dataE;
    
    public GUIListarEquipoFiltro(EquipoData dataE) {
        initComponents();
        this.dataE = dataE;
        setLocationRelativeTo(null);
    }
    
    public void limpiarCampos() {
        this.campoMin.setText("");
        this.campoMax.setText("");
        this.labelInfo.setText("");
    }
    
    void inicializar() {
        limpiarCampos();
    }
    
    void filtrarAlmacenamiento(int min, int max) {
        int[] rango = {min, max}; 
        ArrayList <Equipo> lista = dataE.buscarEquipoRangoAlmacenamiento(rango);
        String[][] matriz = new String[lista.size()][5];
        for (int i = 0 ; i < lista.size() ; i++) {
            matriz[i][0] = lista.get(i).getNombreEquipo();
            matriz[i][1] = lista.get(i).getMarcaEquipo();
            matriz[i][2] = lista.get(i).getAlmacenamientoEquipo();
            matriz[i][3] = ("$"+lista.get(i).getPrecioEquipoPlan());
            matriz[i][4] = ("$"+lista.get(i).getPrecioEquipoLiberado());
        }
        
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            matriz,
            new String [] {
                "Modelo", "Marca", "Almacenamiento", "Precio Plan", "Precio Liberado"
            }
        ));
    }

    void filtrarPrecioPlan(int min, int max) {
        int[] rango = {min, max}; 
        ArrayList <Equipo> lista = dataE.buscarEquipoRangoPrecioPlan(rango);
        String[][] matriz = new String[lista.size()][5];
        for (int i = 0 ; i < lista.size() ; i++) {
            matriz[i][0] = lista.get(i).getNombreEquipo();
            matriz[i][1] = lista.get(i).getMarcaEquipo();
            matriz[i][2] = lista.get(i).getAlmacenamientoEquipo();
            matriz[i][3] = ("$"+lista.get(i).getPrecioEquipoPlan());
            matriz[i][4] = ("$"+lista.get(i).getPrecioEquipoLiberado());
        }
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            matriz,
            new String [] {
                "Modelo", "Marca", "Almacenamiento", "Precio Plan", "Precio Liberado"
            }
        ));
    }
    
    void filtrarPrecioLiberado(int min, int max) {
        int[] rango = {min, max}; 
        ArrayList <Equipo> lista = dataE.buscarEquipoRangoPrecioLiberado(rango);
        String[][] matriz = new String[lista.size()][5];
        for (int i = 0 ; i < lista.size() ; i++) {
            matriz[i][0] = lista.get(i).getNombreEquipo();
            matriz[i][1] = lista.get(i).getMarcaEquipo();
            matriz[i][2] = lista.get(i).getAlmacenamientoEquipo();
            matriz[i][3] = ("$"+lista.get(i).getPrecioEquipoPlan());
            matriz[i][4] = ("$"+lista.get(i).getPrecioEquipoLiberado());
        }
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            matriz,
            new String [] {
                "Modelo", "Marca", "Almacenamiento", "Precio Plan", "Precio Liberado"
            }
        ));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        campoCriterio = new javax.swing.JComboBox<>();
        botonFiltrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        campoMin = new javax.swing.JTextField();
        campoMax = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        botonSalir = new javax.swing.JButton();
        botonLimpiar = new javax.swing.JButton();
        labelInfo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Seleccione el criterio de filtrado");

        campoCriterio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Almacenamiento", "Precio Plan", "Precio Liberado" }));

        botonFiltrar.setText("Filtrar");
        botonFiltrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonFiltrarActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Modelo", "Marca", "Almacenamiento", "Precio Plan", "Precio Liberado"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        campoMin.setText("jTextField1");

        campoMax.setText("jTextField2");

        jLabel2.setText("Mínimo:");

        jLabel3.setText("Máximo:");

        botonSalir.setText("Salir");
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });

        botonLimpiar.setText("Limpiar");
        botonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonLimpiarActionPerformed(evt);
            }
        });

        labelInfo.setText("jLabel4");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 656, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botonLimpiar)
                        .addGap(18, 18, 18)
                        .addComponent(botonSalir)))
                .addGap(20, 20, 20))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoMin, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoCriterio, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoMax, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(257, 257, 257)
                        .addComponent(botonFiltrar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(227, 227, 227)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(campoCriterio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(campoMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoMax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonFiltrar)
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonLimpiar)
                    .addComponent(botonSalir))
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        dispose();
    }//GEN-LAST:event_botonSalirActionPerformed

    private void botonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonLimpiarActionPerformed
        limpiarCampos();
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Modelo", "Marca", "Almacenamiento", "Precio Plan", "Precio Liberado"
            }
        ));
    }//GEN-LAST:event_botonLimpiarActionPerformed

    private void botonFiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonFiltrarActionPerformed
        if (this.campoMin.getText().equals("") || this.campoMax.getText().equals("")) {
            this.labelInfo.setText("Debe llenar todos los campos");
            return;
        }
        
        if (this.campoCriterio.getItemAt(this.campoCriterio.getSelectedIndex()).equals("Almacenamiento")) {
            filtrarAlmacenamiento(Integer.parseInt(this.campoMin.getText()), Integer.parseInt(this.campoMax.getText()));
        } else {
            if (this.campoCriterio.getItemAt(this.campoCriterio.getSelectedIndex()).equals("Precio Plan")) {
                filtrarPrecioPlan(Integer.parseInt(this.campoMin.getText()), Integer.parseInt(this.campoMax.getText()));
            } else {
                if (this.campoCriterio.getItemAt(this.campoCriterio.getSelectedIndex()).equals("Precio Liberado"))
                    filtrarPrecioLiberado(Integer.parseInt(this.campoMin.getText()), Integer.parseInt(this.campoMax.getText()));
            }        
        }
    }//GEN-LAST:event_botonFiltrarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonFiltrar;
    private javax.swing.JButton botonLimpiar;
    private javax.swing.JButton botonSalir;
    private javax.swing.JComboBox<String> campoCriterio;
    private javax.swing.JTextField campoMax;
    private javax.swing.JTextField campoMin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel labelInfo;
    // End of variables declaration//GEN-END:variables
}

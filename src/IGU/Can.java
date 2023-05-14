/**
 * TPO2
 * Lucero_Antonio_tpo2
 */
package IGU;
/**
 * IGU registro de Canes
 * @author Lucero_Antonio
 */
public class Can extends javax.swing.JInternalFrame {
    
    //Atributos
    PERSISTENCIA.CanData cd = null;
    LOGICA.Can can = null;
    
    //Constructor
    public Can() {
        initComponents();
        nuevo();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        datoCliente = new javax.swing.JLabel();
        datoNombre = new javax.swing.JTextField();
        datoRaza = new javax.swing.JTextField();
        datoColor = new javax.swing.JTextField();
        datoAlergia = new javax.swing.JComboBox<>();
        datoEspecial = new javax.swing.JComboBox<>();
        datoDuenio = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        datoObs = new javax.swing.JTextArea();
        datoImagen = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        datoCel = new javax.swing.JTextField();
        btnNuevo = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Registro de Canes");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosing(evt);
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        jLabel1.setText("Cliente Nro.:");

        jLabel2.setText("Nombre:");

        jLabel3.setText("Raza:");

        jLabel4.setText("Color:");

        jLabel5.setText("Alérgico:");

        jLabel6.setText("Atención Especial:");

        jLabel7.setText("Nombre del Dueño:");

        jLabel8.setText("Cel. del Dueño:");

        jLabel9.setText("Observaciones:");

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        datoCliente.setText(""
            + "");

        datoNombre.setText("");
        datoNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                datoNombreKeyPressed(evt);
            }
        });

        datoRaza.setText("");
        datoRaza.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                datoRazaKeyPressed(evt);
            }
        });

        datoColor.setText("");
        datoColor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                datoColorKeyPressed(evt);
            }
        });

        datoAlergia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "SI", "NO"}));
        datoAlergia.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                datoAlergiaItemStateChanged(evt);
            }
        });

        datoEspecial.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "SI", "NO" }));
        datoEspecial.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                datoEspecialItemStateChanged(evt);
            }
        });

        datoDuenio.setText("");
        datoDuenio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                datoDuenioKeyPressed(evt);
            }
        });

        datoObs.setColumns(20);
        datoObs.setRows(5);
        datoObs.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                datoObsKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(datoObs);

        datoImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IGU/can.png"))); // NOI18N

        datoCel.setText("");
        datoCel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                datoCelKeyPressed(evt);
            }
        });

        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(btnNuevo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLimpiar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGuardar))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addComponent(jLabel1))
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(datoDuenio, javax.swing.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE)
                            .addComponent(datoEspecial, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(datoAlergia, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(datoColor)
                            .addComponent(datoRaza)
                            .addComponent(datoNombre)
                            .addComponent(datoCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(datoCel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(datoImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(datoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(datoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(datoRaza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(datoColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(datoAlergia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(datoEspecial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(datoDuenio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(datoCel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(datoImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpiar)
                    .addComponent(btnGuardar)
                    .addComponent(btnNuevo))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {datoAlergia, datoCel, datoCliente, datoColor, datoDuenio, datoEspecial, datoNombre, datoRaza});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Eventos
    private void datoNombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_datoNombreKeyPressed
        int tecla = evt.getKeyCode();
        if(!btnGuardar.isVisible())mostrar();
        if(tecla == java.awt.event.KeyEvent.VK_ENTER)
            datoRaza.requestFocus();
    }//GEN-LAST:event_datoNombreKeyPressed

    private void datoRazaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_datoRazaKeyPressed
        int tecla = evt.getKeyCode();
        if(!btnGuardar.isVisible())mostrar();
        if(tecla == java.awt.event.KeyEvent.VK_ENTER)
            datoColor.requestFocus();
    }//GEN-LAST:event_datoRazaKeyPressed

    private void datoColorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_datoColorKeyPressed
        int tecla = evt.getKeyCode();
        if(!btnGuardar.isVisible())mostrar();
        if(tecla == java.awt.event.KeyEvent.VK_ENTER)
            datoAlergia.requestFocus();
    }//GEN-LAST:event_datoColorKeyPressed

    private void datoDuenioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_datoDuenioKeyPressed
        int tecla = evt.getKeyCode();
        if(!btnGuardar.isVisible())mostrar();
        if(tecla == java.awt.event.KeyEvent.VK_ENTER)
            datoCel.requestFocus();
    }//GEN-LAST:event_datoDuenioKeyPressed

    private void datoCelKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_datoCelKeyPressed
        int tecla = evt.getKeyCode();
        if(!btnGuardar.isVisible())mostrar();
        if(tecla == java.awt.event.KeyEvent.VK_ENTER)
            datoObs.requestFocus();
    }//GEN-LAST:event_datoCelKeyPressed

    private void datoObsKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_datoObsKeyPressed
        int tecla = evt.getKeyCode();
        if(!btnGuardar.isVisible())mostrar();
        if(tecla == java.awt.event.KeyEvent.VK_ENTER){
            evt.consume();
            datoNombre.requestFocus();
        }
    }//GEN-LAST:event_datoObsKeyPressed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        guardar();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        nuevo();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void datoAlergiaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_datoAlergiaItemStateChanged
        if(!btnGuardar.isVisible())mostrar();
    }//GEN-LAST:event_datoAlergiaItemStateChanged

    private void datoEspecialItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_datoEspecialItemStateChanged
        if(!btnGuardar.isVisible())mostrar();
    }//GEN-LAST:event_datoEspecialItemStateChanged

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
        if(btnGuardar.isVisible()){
            if(javax.swing.JOptionPane.showConfirmDialog(this, "Existen datos sin guardar...\nAceptar para salir.", "Salir", javax.swing.JOptionPane.OK_CANCEL_OPTION) == javax.swing.JOptionPane.OK_OPTION)
                dispose();
            else
                setDefaultCloseOperation(javax.swing.JInternalFrame.DO_NOTHING_ON_CLOSE);
        }
    }//GEN-LAST:event_formInternalFrameClosing


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JComboBox<String> datoAlergia;
    private javax.swing.JTextField datoCel;
    private javax.swing.JLabel datoCliente;
    private javax.swing.JTextField datoColor;
    private javax.swing.JTextField datoDuenio;
    private javax.swing.JComboBox<String> datoEspecial;
    private javax.swing.JLabel datoImagen;
    private javax.swing.JTextField datoNombre;
    private javax.swing.JTextArea datoObs;
    private javax.swing.JTextField datoRaza;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables

    //Metodos privados
    private void guardar() {
        int paso = 0;
        if(comprobar()){
            if(cd == null) cd = new PERSISTENCIA.CanData(LOGICA.Main.conexion);
            can = new LOGICA.Can(
                    0,
                    datoNombre.getText(),
                    datoRaza.getText(),
                    datoColor.getText(),
                    datoDuenio.getText(),
                    datoCel.getText(),
                    datoObs.getText(),
                    datoAlergia.getSelectedIndex(),
                    datoEspecial.getSelectedIndex()
            );
            if(btnGuardar.getText() == "Guardar"){
                can.setNum_cliente(cd.crear(can));
                paso = can.getNum_cliente();
            }else{
                can.setNum_cliente(Integer.parseInt(datoCliente.getText()));
                paso = cd.modificar(can);
            }
            if(paso > 0){
                javax.swing.JOptionPane.showMessageDialog(this, "Can " + can.getNombre_perro() + ", "+ (btnGuardar.getText() == "Guardar" ? "registrado" : "actualizado") +" con exito.");
                if(datoCliente.getText().equals("Nuevo"))datoCliente.setText(String.valueOf(can.getNum_cliente()));
                if(!btnGuardar.getText().equals("Actualizar"))btnGuardar.setText("Actualizar");
            }else{
                javax.swing.JOptionPane.showMessageDialog(this, "Error con el Can " + can.getNombre_perro());
                System.out.println("Error Guardar Can."+ can.getNombre_perro() + (cd.getExcepcion() != null ? "\n" + cd.getExcepcion().getMessage() : ""));
            }
        }else{
            javax.swing.JOptionPane.showMessageDialog(this, "Revisar todos los datos necesarios para registrar/actualizar al can.");
        }
    }
    
    private void limpiar() {
        can = null;
        datoCliente.setText("Nuevo");
        datoNombre.setText(""); datoNombre.setBackground(java.awt.Color.white);
        datoRaza.setText(""); datoRaza.setBackground(java.awt.Color.white);
        datoColor.setText(""); datoColor.setBackground(java.awt.Color.white);
        datoAlergia.setSelectedIndex(0);
        datoEspecial.setSelectedIndex(0);
        datoDuenio.setText(""); datoDuenio.setBackground(java.awt.Color.white);
        datoCel.setText(""); datoCel.setBackground(java.awt.Color.white);
        datoObs.setText("");
        btnGuardar.setText("Guardar");
        ocultar();
    }

    private void nuevo() {
        limpiar();
        ocultar();
    }

    private boolean comprobar() {
        boolean respuesta = true;
        if(datoNombre.getText().isEmpty() || datoNombre.getText().length() > 20){
            respuesta = false;
            datoNombre.setBackground(java.awt.Color.yellow);
        }
        if(datoRaza.getText().isEmpty() || datoRaza.getText().length() > 20){
            respuesta = false;
            datoRaza.setBackground(java.awt.Color.yellow);
        }
        if(datoColor.getText().isEmpty() || datoColor.getText().length() > 20){
            respuesta = false;
            datoColor.setBackground(java.awt.Color.yellow);
        }
        if(datoDuenio.getText().isEmpty() || datoDuenio.getText().length() > 20){
            respuesta = false;
            datoDuenio.setBackground(java.awt.Color.yellow);
        }
        if(datoCel.getText().isEmpty() || datoCel.getText().length() > 20){
            respuesta = false;
            datoCel.setBackground(java.awt.Color.yellow);
        }
        return respuesta;
    }

    private void ocultar() {
        btnGuardar.setVisible(false);
        btnLimpiar.setVisible(false);
    }
    
    private void mostrar() {
        btnGuardar.setVisible(true);
        btnLimpiar.setVisible(true);
    }
    
    /*
    private void deshabilitar(){
        datoNombre.setEnabled(false);
        datoRaza.setEnabled(false);
        datoColor.setEnabled(false);
        datoDuenio.setEnabled(false);
        datoCel.setEnabled(false);
        datoObs.setEnabled(false);
        datoAlergia.setEnabled(false);
        datoEspecial.setEnabled(false);
        btnNuevo.setEnabled(false);
        btnLimpiar.setEnabled(false);
        btnGuardar.setEnabled(false);
    }
    
    private void habilitar(){
        datoNombre.setEnabled(true);
        datoRaza.setEnabled(true);
        datoColor.setEnabled(true);
        datoDuenio.setEnabled(true);
        datoCel.setEnabled(true);
        datoObs.setEnabled(true);
        datoAlergia.setEnabled(true);
        datoEspecial.setEnabled(true);
        btnNuevo.setEnabled(true);
        btnLimpiar.setEnabled(true);
        btnGuardar.setEnabled(true);
    }
    */
}

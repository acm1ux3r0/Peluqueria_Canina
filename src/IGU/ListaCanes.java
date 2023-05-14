/**
 * TPO2
 * Lucero_Antonio_tpo2
 */
package IGU;
/**
 * IGU vista Lista de Canes
 * @author Lucero_Antonio
 */
public class ListaCanes extends javax.swing.JInternalFrame {

    //Atributos
    private java.util.List<LOGICA.Can> lista = null;
    private LOGICA.Can can = null;
    private PERSISTENCIA.CanData cd = null;
    private javax.swing.table.DefaultTableModel modelo = null;
    private int modo = 0;
    //Constructor
    public ListaCanes() {
        initComponents();
        cd = new PERSISTENCIA.CanData(LOGICA.Main.conexion);
        modelo = (javax.swing.table.DefaultTableModel) tabla.getModel();
        modelo.setColumnIdentifiers(new String[] {"Cliente Nro:", "Nombre Can:", "Nombre Cliente:"});
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        datoBusqueda = new javax.swing.JComboBox<>();
        txtBuscar = new javax.swing.JLabel();
        datoBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        infoCan = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        datoRaza = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        datoCliente = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        datoColor = new javax.swing.JTextField();
        datoObs = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        datoDuenio = new javax.swing.JTextField();
        datoEspecial = new javax.swing.JCheckBox();
        datoCel = new javax.swing.JTextField();
        datoNombre = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        datoAlergia = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        infoTabla = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Lista de Canes");

        jLabel1.setText("Tipo de Busqueda: ");

        datoBusqueda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Todo", "Por Id", "Por Nombre de Can", "Por Nombre del Dueño" }));
        datoBusqueda.setSelectedIndex(0);
        datoBusqueda.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                datoBusquedaItemStateChanged(evt);
            }
        });

        txtBuscar.setText("A Buscar: ");

        datoBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                datoBuscarKeyPressed(evt);
            }
        });

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jLabel8.setText("Cuidados Especiales?: ");

        jLabel5.setText("Raza del Can: ");

        datoRaza.setEnabled(false);

        jLabel4.setText("Nombre del Can: ");

        jLabel11.setText("Observaciones: ");

        jLabel9.setText("Nombre del Dueño: ");

        datoCliente.setText("");

        jLabel7.setText("Es alergico?:");

        datoColor.setEnabled(false);

        datoObs.setEnabled(false);

        jLabel6.setText("Color del Can: ");

        datoDuenio.setEnabled(false);

        datoEspecial.setEnabled(false);

        datoCel.setEnabled(false);

        datoNombre.setEnabled(false);

        jLabel10.setText("Cel. del Dueño: ");

        datoAlergia.setEnabled(false);

        jLabel3.setText("Cliente Nro.: ");

        javax.swing.GroupLayout infoCanLayout = new javax.swing.GroupLayout(infoCan);
        infoCan.setLayout(infoCanLayout);
        infoCanLayout.setHorizontalGroup(
            infoCanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infoCanLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(infoCanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addGroup(infoCanLayout.createSequentialGroup()
                        .addGroup(infoCanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(infoCanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, infoCanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, infoCanLayout.createSequentialGroup()
                                        .addGroup(infoCanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel9))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(infoCanLayout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(37, 37, 37)))
                                .addGroup(infoCanLayout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addGap(20, 20, 20)))
                            .addGroup(infoCanLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(45, 45, 45)))
                        .addGroup(infoCanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(datoCliente)
                            .addComponent(datoRaza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(datoDuenio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(datoColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(datoCel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(datoObs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(datoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(infoCanLayout.createSequentialGroup()
                        .addGroup(infoCanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(infoCanLayout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(43, 43, 43)
                                .addComponent(datoAlergia))
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(datoEspecial)))
                .addContainerGap(97, Short.MAX_VALUE))
        );

        infoCanLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {datoCel, datoCliente, datoColor, datoDuenio, datoNombre, datoObs, datoRaza});

        infoCanLayout.setVerticalGroup(
            infoCanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infoCanLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(infoCanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(datoCliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(infoCanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(datoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(infoCanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(datoRaza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(infoCanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(datoColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(infoCanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(infoCanLayout.createSequentialGroup()
                        .addGroup(infoCanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(datoAlergia)
                            .addGroup(infoCanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel7)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8))
                    .addComponent(datoEspecial))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(infoCanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(datoDuenio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(infoCanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(datoCel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(infoCanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(datoObs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        infoCanLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {datoCel, datoCliente, datoColor, datoDuenio, datoNombre, datoObs, datoRaza});

        tabla.setModel(new javax.swing.table.DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        });
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla);

        javax.swing.GroupLayout infoTablaLayout = new javax.swing.GroupLayout(infoTabla);
        infoTabla.setLayout(infoTablaLayout);
        infoTablaLayout.setHorizontalGroup(
            infoTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infoTablaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        infoTablaLayout.setVerticalGroup(
            infoTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infoTablaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(txtBuscar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(datoBusqueda, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(datoBuscar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(infoCan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(infoTabla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(datoBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscar)
                    .addComponent(datoBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(infoTabla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(infoCan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void datoBusquedaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_datoBusquedaItemStateChanged
        limpiar();
        if(datoBusqueda.getSelectedIndex() == 1){
            deshabilitarBuscar();
            infoTabla.setVisible(true);
            infoCan.setVisible(false);
            lista = cd.obtener();
            modo = 1;
            rellenar();
        }else if(datoBusqueda.getSelectedIndex() == 2){
            habilitarBuscar();
            infoTabla.setVisible(false);
            infoCan.setVisible(true);
            modo = 2;
        }else if(datoBusqueda.getSelectedIndex() == 3){
            habilitarBuscar();
            infoTabla.setVisible(false);
            infoCan.setVisible(true);
            modo = 3;
        }else if(datoBusqueda.getSelectedIndex() == 4){
            habilitarBuscar();
            infoTabla.setVisible(true);
            infoCan.setVisible(false);
            modo = 4;
        }else{
            deshabilitarBuscar();
            infoTabla.setVisible(false);
            infoCan.setVisible(false);
        }
    }//GEN-LAST:event_datoBusquedaItemStateChanged

    private void datoBuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_datoBuscarKeyPressed
        if(evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER)
            buscar();
    }//GEN-LAST:event_datoBuscarKeyPressed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        buscar();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
        if(evt.getClickCount() > 1) rellenarInfo();
    }//GEN-LAST:event_tablaMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JCheckBox datoAlergia;
    private javax.swing.JTextField datoBuscar;
    private javax.swing.JComboBox<String> datoBusqueda;
    private javax.swing.JTextField datoCel;
    private javax.swing.JLabel datoCliente;
    private javax.swing.JTextField datoColor;
    private javax.swing.JTextField datoDuenio;
    private javax.swing.JCheckBox datoEspecial;
    private javax.swing.JTextField datoNombre;
    private javax.swing.JTextField datoObs;
    private javax.swing.JTextField datoRaza;
    private javax.swing.JPanel infoCan;
    private javax.swing.JPanel infoTabla;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla;
    private javax.swing.JLabel txtBuscar;
    // End of variables declaration//GEN-END:variables

    private void deshabilitarBuscar() {
        txtBuscar.setVisible(false);
        datoBuscar.setVisible(false);
        btnBuscar.setVisible(false);
    }

    private void habilitarBuscar() {
        txtBuscar.setVisible(true);
        datoBuscar.setVisible(true);
        btnBuscar.setVisible(true);
    }

    private void rellenar() {
        if(lista != null && lista.size() > 0){
            modelo.setRowCount(0);
            for (LOGICA.Can can1 : lista) {
                modelo.addRow(new String[] {String.valueOf(can1.getNum_cliente()), can1.getNombre_perro(), can1.getNombre_duenio()});
            }
        }
    }

    private void rellenarInfo() {
        int indice = tabla.getSelectedRow();
        if(indice > -1){
            can = lista.get(indice);
        }
        if(can != null){
            datoCliente.setText(String.valueOf(can.getNum_cliente()));
            datoNombre.setText(can.getNombre_perro());
            datoRaza.setText(can.getRaza());
            datoColor.setText(can.getColor());
            datoAlergia.setSelected((can.getAlergico() == 1) ? true : false);
            datoEspecial.setSelected((can.getAtencion_especial() == 1) ? true : false);
            datoDuenio.setText(can.getNombre_duenio());
            datoCel.setText(can.getCelular_duenio());
            datoObs.setText(can.getObservaciones());
            infoCan.setVisible(true);
        }else{
            javax.swing.JOptionPane.showMessageDialog(this, "Can no encontrado...");
        }
    }

    private void limpiar() {
        modelo.setRowCount(0);
        datoCliente.setText("");
        datoNombre.setText("");
        datoRaza.setText("");
        datoColor.setText("");
        datoAlergia.setSelected(false);
        datoEspecial.setSelected(false);
        datoDuenio.setText("");
        datoCel.setText("");
        datoObs.setText("");
    }

    private void buscar() {
        int numero = 0;
        String texto = "";
        if(modo > 1){
            switch(modo){
                case 2: 
                    System.out.println("Buscar por Id");
                    try{
                        numero = Integer.parseInt(datoBuscar.getText());
                        can = cd.leer(numero);
                        rellenarInfo();
                    }catch(NumberFormatException ex){
                        javax.swing.JOptionPane.showMessageDialog(this, "El valor a buscar debe ser un número mayor a 0...");
                    }
                    break;
                case 3: 
                    System.out.println("Buscar por Nombre de Can");
                    texto = datoBuscar.getText();
                    can = cd.leer(texto);
                    rellenarInfo();
                    break;
                case 4: 
                    System.out.println("Buscar por Nombre de Dueño");
                    texto = datoBuscar.getText();
                    lista = cd.obtenerCanes(texto);
                    rellenar();
                    break;
                default: 
                    System.out.println("Busqueda desconocida, o en desarrollo...");
            }
        }
    }
}

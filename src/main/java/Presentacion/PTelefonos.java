package Presentacion;
import Entidades.Marcas;
import Logica.ControladorTelefonos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;


public class PTelefonos extends javax.swing.JInternalFrame {
    
    Marcas alumno = new Marcas();

    DefaultTableModel mdlTabla;
    ControladorTelefonos cTelefonos;
    public PTelefonos() {
        cTelefonos = new ControladorTelefonos();
        initComponents();
        jTabbedPane1.setEnabledAt(2, false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanelRegistro = new javax.swing.JPanel();
        jLabelRegistar = new javax.swing.JLabel();
        jButtonLimpiarR = new javax.swing.JButton();
        jButtonRegistar = new javax.swing.JButton();
        jLNombre4 = new javax.swing.JLabel();
        jTFNombre = new javax.swing.JTextField();
        jLNombre5 = new javax.swing.JLabel();
        jCBMarca = new javax.swing.JComboBox();
        jLNombre7 = new javax.swing.JLabel();
        jTFime = new javax.swing.JTextField();
        jLNombre8 = new javax.swing.JLabel();
        jCBModelo = new javax.swing.JComboBox();
        jTFMac = new javax.swing.JTextField();
        jLNombre9 = new javax.swing.JLabel();
        jPanelConsulta = new javax.swing.JPanel();
        jLabelRegistar1 = new javax.swing.JLabel();
        jLNombre1 = new javax.swing.JLabel();
        jTFNombre1 = new javax.swing.JTextField();
        jButtonLimpiarC = new javax.swing.JButton();
        jButtonConsultar = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableResultados = new javax.swing.JTable();
        jLabelNotaEditar = new javax.swing.JLabel();
        jPanelEditar = new javax.swing.JPanel();
        jLabelRegistar3 = new javax.swing.JLabel();
        jButtonLimpiarE = new javax.swing.JButton();
        jButtonEliminar = new javax.swing.JButton();
        jButtonActualizar = new javax.swing.JButton();
        jTFCodigo3 = new javax.swing.JTextField();
        jLCodigo3 = new javax.swing.JLabel();
        jTFime1 = new javax.swing.JTextField();
        jLNombre10 = new javax.swing.JLabel();
        jLNombre11 = new javax.swing.JLabel();
        jCBMarca1 = new javax.swing.JComboBox();
        jCBModelo1 = new javax.swing.JComboBox();
        jLNombre12 = new javax.swing.JLabel();
        jLNombre13 = new javax.swing.JLabel();
        jTFMac1 = new javax.swing.JTextField();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Registro y Consulta de Telefonos");
        setToolTipText("");

        jPanelRegistro.setLayout(null);

        jLabelRegistar.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabelRegistar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelRegistar.setText("Registar Telefonos");
        jPanelRegistro.add(jLabelRegistar);
        jLabelRegistar.setBounds(30, 10, 580, 40);

        jButtonLimpiarR.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jButtonLimpiarR.setText("LIMPIAR");
        jButtonLimpiarR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimpiarRActionPerformed(evt);
            }
        });
        jPanelRegistro.add(jButtonLimpiarR);
        jButtonLimpiarR.setBounds(310, 280, 180, 35);

        jButtonRegistar.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jButtonRegistar.setText("REGISTAR");
        jButtonRegistar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistarActionPerformed(evt);
            }
        });
        jPanelRegistro.add(jButtonRegistar);
        jButtonRegistar.setBounds(100, 280, 170, 35);

        jLNombre4.setFont(new java.awt.Font("Ubuntu", 1, 17)); // NOI18N
        jLNombre4.setText("Marca");
        jPanelRegistro.add(jLNombre4);
        jLNombre4.setBounds(80, 140, 200, 30);
        jPanelRegistro.add(jTFNombre);
        jTFNombre.setBounds(290, 60, 250, 30);

        jLNombre5.setFont(new java.awt.Font("Ubuntu", 1, 17)); // NOI18N
        jLNombre5.setText("Nombre");
        jPanelRegistro.add(jLNombre5);
        jLNombre5.setBounds(80, 60, 200, 30);

        jCBMarca.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " " }));
        jCBMarca.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                jCBMarcaPopupMenuWillBecomeVisible(evt);
            }
        });
        jPanelRegistro.add(jCBMarca);
        jCBMarca.setBounds(290, 140, 250, 30);

        jLNombre7.setFont(new java.awt.Font("Ubuntu", 1, 17)); // NOI18N
        jLNombre7.setText("IME");
        jPanelRegistro.add(jLNombre7);
        jLNombre7.setBounds(80, 100, 200, 30);
        jPanelRegistro.add(jTFime);
        jTFime.setBounds(290, 100, 250, 30);

        jLNombre8.setFont(new java.awt.Font("Ubuntu", 1, 17)); // NOI18N
        jLNombre8.setText("Modelo");
        jPanelRegistro.add(jLNombre8);
        jLNombre8.setBounds(80, 190, 200, 30);

        jCBModelo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " " }));
        jCBModelo.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                jCBModeloPopupMenuWillBecomeVisible(evt);
            }
        });
        jPanelRegistro.add(jCBModelo);
        jCBModelo.setBounds(290, 190, 250, 30);
        jPanelRegistro.add(jTFMac);
        jTFMac.setBounds(290, 230, 250, 30);

        jLNombre9.setFont(new java.awt.Font("Ubuntu", 1, 17)); // NOI18N
        jLNombre9.setText("MAC Address");
        jPanelRegistro.add(jLNombre9);
        jLNombre9.setBounds(80, 230, 200, 30);

        jTabbedPane1.addTab("Registar", jPanelRegistro);

        jPanelConsulta.setLayout(null);

        jLabelRegistar1.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabelRegistar1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelRegistar1.setText("Consulta Telefonos");
        jPanelConsulta.add(jLabelRegistar1);
        jLabelRegistar1.setBounds(0, 10, 580, 40);

        jLNombre1.setFont(new java.awt.Font("Ubuntu", 1, 17)); // NOI18N
        jLNombre1.setText("Nombre");
        jPanelConsulta.add(jLNombre1);
        jLNombre1.setBounds(20, 60, 180, 30);
        jPanelConsulta.add(jTFNombre1);
        jTFNombre1.setBounds(200, 60, 200, 30);

        jButtonLimpiarC.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jButtonLimpiarC.setText("LIMPIAR");
        jButtonLimpiarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimpiarCActionPerformed(evt);
            }
        });
        jPanelConsulta.add(jButtonLimpiarC);
        jButtonLimpiarC.setBounds(420, 140, 150, 35);

        jButtonConsultar.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jButtonConsultar.setText("CONSULTAR");
        jButtonConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConsultarActionPerformed(evt);
            }
        });
        jPanelConsulta.add(jButtonConsultar);
        jButtonConsultar.setBounds(420, 60, 150, 35);

        jButtonEditar.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jButtonEditar.setText("EDITAR*");
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });
        jPanelConsulta.add(jButtonEditar);
        jButtonEditar.setBounds(420, 100, 150, 35);

        jTableResultados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "IME", "Marca", "Modelo", "MAC"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTableResultados);

        jPanelConsulta.add(jScrollPane2);
        jScrollPane2.setBounds(30, 190, 540, 140);

        jLabelNotaEditar.setText("* Debe seleccionar solamente una fila dentro de la tabla");
        jPanelConsulta.add(jLabelNotaEditar);
        jLabelNotaEditar.setBounds(20, 392, 540, 13);

        jTabbedPane1.addTab("Consultar", jPanelConsulta);

        jPanelEditar.setLayout(null);

        jLabelRegistar3.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabelRegistar3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelRegistar3.setText("Edicion Telefonos");
        jPanelEditar.add(jLabelRegistar3);
        jLabelRegistar3.setBounds(30, 10, 580, 40);

        jButtonLimpiarE.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jButtonLimpiarE.setText("LIMPIAR");
        jButtonLimpiarE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimpiarEActionPerformed(evt);
            }
        });
        jPanelEditar.add(jButtonLimpiarE);
        jButtonLimpiarE.setBounds(390, 280, 130, 35);

        jButtonEliminar.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jButtonEliminar.setText("ELIMINAR");
        jButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarActionPerformed(evt);
            }
        });
        jPanelEditar.add(jButtonEliminar);
        jButtonEliminar.setBounds(250, 280, 130, 35);

        jButtonActualizar.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jButtonActualizar.setText("ACTUALIZAR");
        jButtonActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonActualizarActionPerformed(evt);
            }
        });
        jPanelEditar.add(jButtonActualizar);
        jButtonActualizar.setBounds(90, 280, 150, 35);

        jTFCodigo3.setEnabled(false);
        jPanelEditar.add(jTFCodigo3);
        jTFCodigo3.setBounds(290, 60, 250, 30);

        jLCodigo3.setFont(new java.awt.Font("Ubuntu", 1, 17)); // NOI18N
        jLCodigo3.setText("Codigo");
        jPanelEditar.add(jLCodigo3);
        jLCodigo3.setBounds(80, 60, 200, 30);
        jPanelEditar.add(jTFime1);
        jTFime1.setBounds(290, 100, 250, 30);

        jLNombre10.setFont(new java.awt.Font("Ubuntu", 1, 17)); // NOI18N
        jLNombre10.setText("IME");
        jPanelEditar.add(jLNombre10);
        jLNombre10.setBounds(80, 100, 200, 30);

        jLNombre11.setFont(new java.awt.Font("Ubuntu", 1, 17)); // NOI18N
        jLNombre11.setText("Marca");
        jPanelEditar.add(jLNombre11);
        jLNombre11.setBounds(80, 140, 200, 30);

        jCBMarca1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " " }));
        jCBMarca1.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                jCBMarca1PopupMenuWillBecomeVisible(evt);
            }
        });
        jPanelEditar.add(jCBMarca1);
        jCBMarca1.setBounds(290, 140, 250, 30);

        jCBModelo1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " " }));
        jCBModelo1.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                jCBModelo1PopupMenuWillBecomeVisible(evt);
            }
        });
        jPanelEditar.add(jCBModelo1);
        jCBModelo1.setBounds(290, 190, 250, 30);

        jLNombre12.setFont(new java.awt.Font("Ubuntu", 1, 17)); // NOI18N
        jLNombre12.setText("Modelo");
        jPanelEditar.add(jLNombre12);
        jLNombre12.setBounds(80, 190, 200, 30);

        jLNombre13.setFont(new java.awt.Font("Ubuntu", 1, 17)); // NOI18N
        jLNombre13.setText("MAC Address");
        jPanelEditar.add(jLNombre13);
        jLNombre13.setBounds(80, 230, 200, 30);
        jPanelEditar.add(jTFMac1);
        jTFMac1.setBounds(290, 230, 250, 30);

        jTabbedPane1.addTab("Editar", jPanelEditar);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 643, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonActualizarActionPerformed

        String actualizacion;
        actualizacion = cTelefonos.actualizar(
            jTFime1.getText(),
            jCBMarca1.getSelectedItem().toString(), jCBModelo1.getSelectedItem().toString(), jTFMac1.getText());

        if (actualizacion.equals("OK")) {
            jButtonConsultar.doClick();
            jTabbedPane1.setSelectedIndex(1);
            limpiarCamposEdicion();
        } else {
            JOptionPane.showMessageDialog(this, actualizacion);
        }
    }//GEN-LAST:event_jButtonActualizarActionPerformed

    private void jButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarActionPerformed
        cTelefonos.eliminar();
        limpiarCamposConsulta();
        jButtonConsultar.doClick();
        jTabbedPane1.setSelectedIndex(1);
    }//GEN-LAST:event_jButtonEliminarActionPerformed

    private void jButtonLimpiarEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimpiarEActionPerformed
        jTFime1.setText("");
    }//GEN-LAST:event_jButtonLimpiarEActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
       
        int seleccionado = jTableResultados.getSelectedRow();
        if (seleccionado >= 0) {
            String programa[] = cTelefonos.seleccionar(seleccionado);
            jTFCodigo3.setText(programa[0]);
            jTFime1.setText(programa[1]);
            
            jCBMarca1.setModel(
                    new javax.swing.DefaultComboBoxModel(
                    cTelefonos.cargarMarcas()));
            jCBMarca1.setSelectedItem(programa[2]);
            
            
            jCBModelo1.setModel(
                    new javax.swing.DefaultComboBoxModel(
                    cTelefonos.cargarModelos()));
            jCBModelo1.setSelectedItem(programa[3]);
            
            jTFMac1.setText(programa[4]);

            
            System.out.println("programaAcademico: "+programa[1]);
            jTabbedPane1.setSelectedIndex(2);
        }
    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void jButtonConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsultarActionPerformed
        
       Object programas[][] = cTelefonos.consultar(jTFNombre1.getText());

        TableModel myModel = new javax.swing.table.DefaultTableModel(
            programas,
            new String[]{
             "Codigo","IME", "Marca", "Modelo", "MAC"
            }) {

                boolean[] canEdit = new boolean[]{
                    false, false, false, false
                };

                public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return canEdit[columnIndex];
                }
            };

            jTableResultados.setModel(myModel);
            jTableResultados.setRowSorter(new TableRowSorter(myModel));
        
    }//GEN-LAST:event_jButtonConsultarActionPerformed

    private void jButtonLimpiarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimpiarCActionPerformed
        limpiarCamposConsulta();
    }//GEN-LAST:event_jButtonLimpiarCActionPerformed

    private void jButtonRegistarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistarActionPerformed
        
        String registro;
        registro = cTelefonos.insertar(    
        jTFNombre.getText(), jTFime.getText(), jCBMarca.getSelectedItem().toString(), jCBModelo.getSelectedItem().toString(), jTFMac.getText());
        if (registro.equals("OK")) {
           
            jButtonConsultar.doClick();
            jTabbedPane1.setSelectedIndex(1);
            limpiarCamposRegistro();
        } else {
            JOptionPane.showMessageDialog(this, registro);
        }
       
    }//GEN-LAST:event_jButtonRegistarActionPerformed

    private void jButtonLimpiarRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimpiarRActionPerformed
        limpiarCamposRegistro();
    }//GEN-LAST:event_jButtonLimpiarRActionPerformed

    private void jCBMarcaPopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jCBMarcaPopupMenuWillBecomeVisible
        jCBMarca.setModel(
            new javax.swing.DefaultComboBoxModel(
                cTelefonos.cargarMarcas()));
    }//GEN-LAST:event_jCBMarcaPopupMenuWillBecomeVisible

    private void jCBModeloPopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jCBModeloPopupMenuWillBecomeVisible
       jCBModelo.setModel(
            new javax.swing.DefaultComboBoxModel(
                cTelefonos.cargarModelos()));
    }//GEN-LAST:event_jCBModeloPopupMenuWillBecomeVisible

    private void jCBMarca1PopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jCBMarca1PopupMenuWillBecomeVisible
        // TODO add your handling code here:
    }//GEN-LAST:event_jCBMarca1PopupMenuWillBecomeVisible

    private void jCBModelo1PopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jCBModelo1PopupMenuWillBecomeVisible
        // TODO add your handling code here:
    }//GEN-LAST:event_jCBModelo1PopupMenuWillBecomeVisible
    
    
    private void limpiarCamposRegistro() {
        jTFNombre.setText("");
    }

    private void limpiarCamposEdicion() {
       
        jTFCodigo3.setText("");
        jTFime1.setText("");      
     
    }

    private void limpiarCamposConsulta() {
        jTFNombre1.setText("");
         TableModel myModel = new javax.swing.table.DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "Codigo", "Nombre"
                });

        jTableResultados.setModel(myModel);
        jTableResultados.setRowSorter(new TableRowSorter(myModel));
        //</editor-fold>
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.JButton jButtonActualizar;
    private javax.swing.JButton jButtonConsultar;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JButton jButtonLimpiarC;
    private javax.swing.JButton jButtonLimpiarE;
    private javax.swing.JButton jButtonLimpiarR;
    private javax.swing.JButton jButtonRegistar;
    private javax.swing.JComboBox jCBMarca;
    private javax.swing.JComboBox jCBMarca1;
    private javax.swing.JComboBox jCBModelo;
    private javax.swing.JComboBox jCBModelo1;
    private javax.swing.JLabel jLCodigo3;
    private javax.swing.JLabel jLNombre1;
    private javax.swing.JLabel jLNombre10;
    private javax.swing.JLabel jLNombre11;
    private javax.swing.JLabel jLNombre12;
    private javax.swing.JLabel jLNombre13;
    private javax.swing.JLabel jLNombre4;
    private javax.swing.JLabel jLNombre5;
    private javax.swing.JLabel jLNombre7;
    private javax.swing.JLabel jLNombre8;
    private javax.swing.JLabel jLNombre9;
    private javax.swing.JLabel jLabelNotaEditar;
    private javax.swing.JLabel jLabelRegistar;
    private javax.swing.JLabel jLabelRegistar1;
    private javax.swing.JLabel jLabelRegistar3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelConsulta;
    private javax.swing.JPanel jPanelEditar;
    private javax.swing.JPanel jPanelRegistro;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTFCodigo3;
    private javax.swing.JTextField jTFMac;
    private javax.swing.JTextField jTFMac1;
    private javax.swing.JTextField jTFNombre;
    private javax.swing.JTextField jTFNombre1;
    private javax.swing.JTextField jTFime;
    private javax.swing.JTextField jTFime1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTableResultados;
    // End of variables declaration//GEN-END:variables

    private void mostrardatos(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

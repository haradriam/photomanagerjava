/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.haradriam.gui;

import com.haradriam.photomanager.Constants;
import com.haradriam.photomanager.DeviceManager;
import com.haradriam.photomanager.PhotoManager;
import java.awt.Component;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFileChooser;

/**
 *
 * @author adrian
 */
public class GUIMain extends javax.swing.JFrame {

    /**
     * Creates new form GUIMain
     */
    public GUIMain() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtEventName = new javax.swing.JTextField();
        lblSource1 = new javax.swing.JLabel();
        txtSource1 = new javax.swing.JTextField();
        btnSource1 = new javax.swing.JButton();
        btnSource2 = new javax.swing.JButton();
        lblSource2 = new javax.swing.JLabel();
        txtSource2 = new javax.swing.JTextField();
        btnSource3 = new javax.swing.JButton();
        lblSource3 = new javax.swing.JLabel();
        txtSource3 = new javax.swing.JTextField();
        btnSource4 = new javax.swing.JButton();
        lblSource4 = new javax.swing.JLabel();
        txtSource4 = new javax.swing.JTextField();
        btnSource5 = new javax.swing.JButton();
        lblSource5 = new javax.swing.JLabel();
        txtSource5 = new javax.swing.JTextField();
        btnSource6 = new javax.swing.JButton();
        lblSource6 = new javax.swing.JLabel();
        txtSource6 = new javax.swing.JTextField();
        btnSource7 = new javax.swing.JButton();
        lblSource7 = new javax.swing.JLabel();
        txtSource7 = new javax.swing.JTextField();
        btnSource8 = new javax.swing.JButton();
        lblSource8 = new javax.swing.JLabel();
        txtSource8 = new javax.swing.JTextField();
        cmbSource1 = new javax.swing.JComboBox();
        cmbSource2 = new javax.swing.JComboBox();
        cmbSource3 = new javax.swing.JComboBox();
        cmbSource4 = new javax.swing.JComboBox();
        cmbSource5 = new javax.swing.JComboBox();
        cmbSource6 = new javax.swing.JComboBox();
        cmbSource7 = new javax.swing.JComboBox();
        cmbSource8 = new javax.swing.JComboBox();
        lblDestination = new javax.swing.JLabel();
        txtDestination = new javax.swing.JTextField();
        btnDestination = new javax.swing.JButton();
        btnProcess = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(750, 500));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        txtEventName.setFont(new java.awt.Font("Cantarell", 3, 15)); // NOI18N
        txtEventName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtEventName.setText("Nombre del evento");

        lblSource1.setText("Fuente de fotos 1");

        txtSource1.setEditable(false);
        txtSource1.setText("Directorio de fotos 1");

        btnSource1.setText("Ruta");
        btnSource1.setPreferredSize(new java.awt.Dimension(70, 33));
        btnSource1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSource1ActionPerformed(evt);
            }
        });

        btnSource2.setText("Ruta");
        btnSource2.setPreferredSize(new java.awt.Dimension(70, 33));
        btnSource2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSource2ActionPerformed(evt);
            }
        });

        lblSource2.setText("Fuente de fotos 2");

        txtSource2.setText("Directorio de fotos 2");

        btnSource3.setText("Ruta");
        btnSource3.setPreferredSize(new java.awt.Dimension(70, 33));
        btnSource3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSource3ActionPerformed(evt);
            }
        });

        lblSource3.setText("Fuente de fotos 3");

        txtSource3.setText("Directorio de fotos 3");

        btnSource4.setText("Ruta");
        btnSource4.setPreferredSize(new java.awt.Dimension(70, 33));
        btnSource4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSource4ActionPerformed(evt);
            }
        });

        lblSource4.setText("Fuente de fotos 4");

        txtSource4.setText("Directorio de fotos 4");

        btnSource5.setText("Ruta");
        btnSource5.setPreferredSize(new java.awt.Dimension(70, 33));
        btnSource5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSource5ActionPerformed(evt);
            }
        });

        lblSource5.setText("Fuente de fotos 5");

        txtSource5.setText("Directorio de fotos 5");

        btnSource6.setText("Ruta");
        btnSource6.setPreferredSize(new java.awt.Dimension(70, 33));
        btnSource6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSource6ActionPerformed(evt);
            }
        });

        lblSource6.setText("Fuente de fotos 6");

        txtSource6.setText("Directorio de fotos 6");

        btnSource7.setText("Ruta");
        btnSource7.setPreferredSize(new java.awt.Dimension(70, 33));
        btnSource7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSource7ActionPerformed(evt);
            }
        });

        lblSource7.setText("Fuente de fotos 7");

        txtSource7.setText("Directorio de fotos 7");

        btnSource8.setText("Ruta");
        btnSource8.setPreferredSize(new java.awt.Dimension(70, 33));
        btnSource8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSource8ActionPerformed(evt);
            }
        });

        lblSource8.setText("Fuente de fotos 8");

        txtSource8.setText("Directorio de fotos 8");
        txtSource8.setToolTipText("");

        lblDestination.setText("Destino");

        txtDestination.setText("Directorio destino");
        txtDestination.setToolTipText("");

        btnDestination.setText("Ruta");
        btnDestination.setPreferredSize(new java.awt.Dimension(70, 33));
        btnDestination.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDestinationActionPerformed(evt);
            }
        });

        btnProcess.setText("Procesar");
        btnProcess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcessActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnProcess, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtEventName, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(lblSource7, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                                .addComponent(lblSource6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblSource5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblSource4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblSource3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblSource1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblSource2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblSource8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(lblDestination))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(cmbSource2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cmbSource1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cmbSource3, 0, 160, Short.MAX_VALUE)
                                    .addComponent(cmbSource4, javax.swing.GroupLayout.Alignment.LEADING, 0, 160, Short.MAX_VALUE)
                                    .addComponent(cmbSource5, javax.swing.GroupLayout.Alignment.LEADING, 0, 160, Short.MAX_VALUE)
                                    .addComponent(cmbSource6, javax.swing.GroupLayout.Alignment.LEADING, 0, 160, Short.MAX_VALUE)
                                    .addComponent(cmbSource7, javax.swing.GroupLayout.Alignment.LEADING, 0, 160, Short.MAX_VALUE)
                                    .addComponent(cmbSource8, javax.swing.GroupLayout.Alignment.LEADING, 0, 160, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtSource8, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnSource8, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(txtSource7, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnSource7, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtSource6, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnSource6, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(txtSource5, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnSource5, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(txtSource4, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnSource4, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(txtSource3, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnSource3, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtSource2, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnSource2, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtSource1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnSource1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtDestination, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnDestination, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtEventName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSource1)
                    .addComponent(txtSource1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSource1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbSource1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSource2)
                    .addComponent(txtSource2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSource2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbSource2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSource3)
                    .addComponent(txtSource3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSource3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbSource3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSource4)
                    .addComponent(txtSource4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSource4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbSource4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSource5)
                    .addComponent(txtSource5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSource5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbSource5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSource6)
                    .addComponent(txtSource6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSource6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbSource6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSource7)
                    .addComponent(txtSource7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSource7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbSource7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSource8)
                    .addComponent(txtSource8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSource8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbSource8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDestination)
                    .addComponent(txtDestination, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDestination, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnProcess, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * formWindowOpened: Init lists of devices
     * @param evt 
     */
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        DefaultComboBoxModel comboModel1 = new DefaultComboBoxModel();
        DefaultComboBoxModel comboModel2 = new DefaultComboBoxModel();
        DefaultComboBoxModel comboModel3 = new DefaultComboBoxModel();
        DefaultComboBoxModel comboModel4 = new DefaultComboBoxModel();
        DefaultComboBoxModel comboModel5 = new DefaultComboBoxModel();
        DefaultComboBoxModel comboModel6 = new DefaultComboBoxModel();
        DefaultComboBoxModel comboModel7 = new DefaultComboBoxModel();
        DefaultComboBoxModel comboModel8 = new DefaultComboBoxModel();
        DeviceManager dm = new DeviceManager();
        String[] deviceName;
        
        comboModel1.addElement("<Elegir>");
        comboModel2.addElement("<Elegir>");
        comboModel3.addElement("<Elegir>");
        comboModel4.addElement("<Elegir>");
        comboModel5.addElement("<Elegir>");
        comboModel6.addElement("<Elegir>");
        comboModel7.addElement("<Elegir>");
        comboModel8.addElement("<Elegir>");
        
        try {
            deviceName = dm.getAvailableDevices();
            for(int i = 0; i < deviceName.length; i++) {
                comboModel1.addElement(deviceName[i]);
                comboModel2.addElement(deviceName[i]);
                comboModel3.addElement(deviceName[i]);
                comboModel4.addElement(deviceName[i]);
                comboModel5.addElement(deviceName[i]);
                comboModel6.addElement(deviceName[i]);
                comboModel7.addElement(deviceName[i]);
                comboModel8.addElement(deviceName[i]);
            }
        } catch (Exception ex) {
            Logger.getLogger(GUIConfigureDevices.class.getName()).log(Level.SEVERE, null, ex);
        } 
        cmbSource1.setModel(comboModel1);
        cmbSource2.setModel(comboModel2);
        cmbSource3.setModel(comboModel3);
        cmbSource4.setModel(comboModel4);
        cmbSource5.setModel(comboModel5);
        cmbSource6.setModel(comboModel6);
        cmbSource7.setModel(comboModel7);
        cmbSource8.setModel(comboModel8);
    }//GEN-LAST:event_formWindowOpened

    /**
     * btnSource1ActionPerformed: Select path
     * @param evt 
     */
    private void btnSource1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSource1ActionPerformed
        final JFileChooser fc = new JFileChooser();
        fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        fc.showOpenDialog(fc);
        txtSource1.setText(fc.getSelectedFile().getAbsolutePath());
    }//GEN-LAST:event_btnSource1ActionPerformed
    private void btnSource2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSource2ActionPerformed
        final JFileChooser fc = new JFileChooser();
        fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        fc.showOpenDialog(fc);
        txtSource2.setText(fc.getSelectedFile().getAbsolutePath());
    }//GEN-LAST:event_btnSource2ActionPerformed
    private void btnSource3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSource3ActionPerformed
        final JFileChooser fc = new JFileChooser();
        fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        fc.showOpenDialog(fc);
        txtSource3.setText(fc.getSelectedFile().getAbsolutePath());
    }//GEN-LAST:event_btnSource3ActionPerformed
    private void btnSource4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSource4ActionPerformed
        final JFileChooser fc = new JFileChooser();
        fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        fc.showOpenDialog(fc);
        txtSource4.setText(fc.getSelectedFile().getAbsolutePath());
    }//GEN-LAST:event_btnSource4ActionPerformed
    private void btnSource5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSource5ActionPerformed
        final JFileChooser fc = new JFileChooser();
        fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        fc.showOpenDialog(fc);
        txtSource5.setText(fc.getSelectedFile().getAbsolutePath());
    }//GEN-LAST:event_btnSource5ActionPerformed
    private void btnSource6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSource6ActionPerformed
        final JFileChooser fc = new JFileChooser();
        fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        fc.showOpenDialog(fc);
        txtSource6.setText(fc.getSelectedFile().getAbsolutePath());
    }//GEN-LAST:event_btnSource6ActionPerformed
    private void btnSource7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSource7ActionPerformed
        final JFileChooser fc = new JFileChooser();
        fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        fc.showOpenDialog(fc);
        txtSource7.setText(fc.getSelectedFile().getAbsolutePath());
    }//GEN-LAST:event_btnSource7ActionPerformed
    private void btnSource8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSource8ActionPerformed
        final JFileChooser fc = new JFileChooser();
        fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        fc.showOpenDialog(fc);
        txtSource8.setText(fc.getSelectedFile().getAbsolutePath());
    }//GEN-LAST:event_btnSource8ActionPerformed
    private void btnDestinationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDestinationActionPerformed
        final JFileChooser fc = new JFileChooser();
        fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        fc.showOpenDialog(fc);
        txtDestination.setText(fc.getSelectedFile().getAbsolutePath());
    }//GEN-LAST:event_btnDestinationActionPerformed

    /**
     * btnProcessActionPerformed: Process data
     * @param evt 
     */
    private void btnProcessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcessActionPerformed
        PhotoManager pm = new PhotoManager();

        String eventName;
        String destDir;
        String[] deviceName;
        String[] sourceDirPath;
        List<String> listDevices = new ArrayList<>();
        List<String> listPaths = new ArrayList<>();
        
        if(cmbSource1.getSelectedIndex() != 0 &&
            (txtSource1.getText().charAt(0) == '\\' ||
            txtSource1.getText().charAt(0) == '/')) {
            listDevices.add(cmbSource1.getSelectedItem().toString());
            listPaths.add(txtSource1.getText());
        }
        if(cmbSource2.getSelectedIndex() != 0 &&
            (txtSource2.getText().charAt(0) == '\\' ||
            txtSource2.getText().charAt(0) == '/')) {
            listDevices.add(cmbSource2.getSelectedItem().toString());
            listPaths.add(txtSource2.getText());
        }
        if(cmbSource3.getSelectedIndex() != 0 &&
            (txtSource3.getText().charAt(0) == '\\' ||
            txtSource3.getText().charAt(0) == '/')) {
            listDevices.add(cmbSource3.getSelectedItem().toString());
            listPaths.add(txtSource3.getText());
        }
        if(cmbSource4.getSelectedIndex() != 0 &&
            (txtSource4.getText().charAt(0) == '\\' ||
            txtSource4.getText().charAt(0) == '/')) {
            listDevices.add(cmbSource4.getSelectedItem().toString());
            listPaths.add(txtSource4.getText());
        }
        if(cmbSource5.getSelectedIndex() != 0 &&
            (txtSource5.getText().charAt(0) == '\\' ||
            txtSource5.getText().charAt(0) == '/')) {
            listDevices.add(cmbSource5.getSelectedItem().toString());
            listPaths.add(txtSource5.getText());
        }
        if(cmbSource6.getSelectedIndex() != 0 &&
            (txtSource6.getText().charAt(0) == '\\' ||
            txtSource6.getText().charAt(0) == '/')) {
            listDevices.add(cmbSource6.getSelectedItem().toString());
            listPaths.add(txtSource6.getText());
        }
        if(cmbSource7.getSelectedIndex() != 0 &&
            (txtSource7.getText().charAt(0) == '\\' ||
            txtSource7.getText().charAt(0) == '/')) {
            listDevices.add(cmbSource7.getSelectedItem().toString());
            listPaths.add(txtSource7.getText());
        }
        if(cmbSource8.getSelectedIndex() != 0 &&
            (txtSource8.getText().charAt(0) == '\\' ||
            txtSource8.getText().charAt(0) == '/')) {
            listDevices.add(cmbSource8.getSelectedItem().toString());
            listPaths.add(txtSource8.getText());
        }

        eventName = txtEventName.getText();
        destDir = txtDestination.getText();
        deviceName = listDevices.toArray(new String[listDevices.size()]);
        sourceDirPath = listPaths.toArray(new String[listPaths.size()]);
        
        if(eventName.isEmpty() || destDir.isEmpty()) {
            //ERROR
        } else {
            try {
                pm.prepareDirs(eventName, destDir, deviceName);
                pm.processDir(eventName, deviceName, sourceDirPath);
            } catch (Exception ex) {
                Logger.getLogger(GUIMain.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnProcessActionPerformed
   
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUIMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDestination;
    private javax.swing.JButton btnProcess;
    private javax.swing.JButton btnSource1;
    private javax.swing.JButton btnSource2;
    private javax.swing.JButton btnSource3;
    private javax.swing.JButton btnSource4;
    private javax.swing.JButton btnSource5;
    private javax.swing.JButton btnSource6;
    private javax.swing.JButton btnSource7;
    private javax.swing.JButton btnSource8;
    private javax.swing.JComboBox cmbSource1;
    private javax.swing.JComboBox cmbSource2;
    private javax.swing.JComboBox cmbSource3;
    private javax.swing.JComboBox cmbSource4;
    private javax.swing.JComboBox cmbSource5;
    private javax.swing.JComboBox cmbSource6;
    private javax.swing.JComboBox cmbSource7;
    private javax.swing.JComboBox cmbSource8;
    private javax.swing.JLabel lblDestination;
    private javax.swing.JLabel lblSource1;
    private javax.swing.JLabel lblSource2;
    private javax.swing.JLabel lblSource3;
    private javax.swing.JLabel lblSource4;
    private javax.swing.JLabel lblSource5;
    private javax.swing.JLabel lblSource6;
    private javax.swing.JLabel lblSource7;
    private javax.swing.JLabel lblSource8;
    private javax.swing.JTextField txtDestination;
    private javax.swing.JTextField txtEventName;
    private javax.swing.JTextField txtSource1;
    private javax.swing.JTextField txtSource2;
    private javax.swing.JTextField txtSource3;
    private javax.swing.JTextField txtSource4;
    private javax.swing.JTextField txtSource5;
    private javax.swing.JTextField txtSource6;
    private javax.swing.JTextField txtSource7;
    private javax.swing.JTextField txtSource8;
    // End of variables declaration//GEN-END:variables
}
package formularios;



public class frmPrincipal extends javax.swing.JFrame implements  Runnable {

    public frmPrincipal() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Dpanel = new javax.swing.JDesktopPane();
        lbhora = new javax.swing.JLabel();
        lblapellidos = new javax.swing.JLabel();
        lblnombres = new javax.swing.JLabel();
        lblacceso = new javax.swing.JLabel();
        btnexpediente = new javax.swing.JButton();
        btnproveedores = new javax.swing.JButton();
        txtconta = new javax.swing.JButton();
        lbltitulo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem21 = new javax.swing.JMenuItem();
        jMenuItem23 = new javax.swing.JMenuItem();
        jMenuItem24 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem19 = new javax.swing.JMenuItem();
        jMenuItem20 = new javax.swing.JMenuItem();
        back = new javax.swing.JMenuItem();
        jMenuItem25 = new javax.swing.JMenuItem();
        jMenuItem26 = new javax.swing.JMenuItem();

        Dpanel.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                DpanelComponentResized(evt);
            }
        });

        lbhora.setBackground(new java.awt.Color(0, 0, 0));
        lbhora.setFont(new java.awt.Font("Baskerville Old Face", 1, 36)); // NOI18N
        lbhora.setText("hora de sistema");

        lblapellidos.setText("jLabel4");

        lblnombres.setText("jLabel3");

        lblacceso.setText("jLabel5");

        btnexpediente.setBackground(new java.awt.Color(255, 255, 255));
        btnexpediente.setForeground(new java.awt.Color(0, 102, 153));
        btnexpediente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/expedientes.png"))); // NOI18N
        btnexpediente.setText("Expedientes");
        btnexpediente.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnexpediente.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnexpediente.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnexpediente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexpedienteActionPerformed(evt);
            }
        });

        btnproveedores.setBackground(new java.awt.Color(255, 255, 255));
        btnproveedores.setForeground(new java.awt.Color(0, 102, 153));
        btnproveedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/proveedores.jpg"))); // NOI18N
        btnproveedores.setText("Proveedores");
        btnproveedores.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnproveedores.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnproveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnproveedoresActionPerformed(evt);
            }
        });

        btnadministracion.setBackground(new java.awt.Color(255, 255, 255));
        btnadministracion.setForeground(new java.awt.Color(0, 102, 153));
        btnadministracion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/admin.png"))); // NOI18N
        btnadministracion.setText("Administracion");
        btnadministracion.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnadministracion.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnadministracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnadministracionActionPerformed(evt);
            }
        });

        txtconta.setBackground(new java.awt.Color(255, 255, 255));
        txtconta.setForeground(new java.awt.Color(0, 102, 153));
        txtconta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/conta.png"))); // NOI18N
        txtconta.setText("Contabilidad");
        txtconta.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtconta.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        txtconta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcontaActionPerformed(evt);
            }
        });

        txtreportes.setBackground(new java.awt.Color(255, 255, 255));
        txtreportes.setForeground(new java.awt.Color(0, 102, 153));
        txtreportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/reportes.jpg"))); // NOI18N
        txtreportes.setText("Reportes");
        txtreportes.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtreportes.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        txtreportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtreportesActionPerformed(evt);
            }
        });

        lbltitulo.setForeground(new java.awt.Color(255, 255, 255));
        lbltitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/logo1.png"))); // NOI18N
        lbltitulo.setOpaque(true);

        Dpanel.setLayer(lbhora, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Dpanel.setLayer(lblapellidos, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Dpanel.setLayer(lblnombres, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Dpanel.setLayer(lblacceso, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Dpanel.setLayer(btnexpediente, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Dpanel.setLayer(btnproveedores, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Dpanel.setLayer(btnadministracion, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Dpanel.setLayer(txtconta, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Dpanel.setLayer(txtreportes, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Dpanel.setLayer(lbltitulo, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout DpanelLayout = new javax.swing.GroupLayout(Dpanel);
        Dpanel.setLayout(DpanelLayout);
        DpanelLayout.setHorizontalGroup(
            DpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DpanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbltitulo)
                .addGap(216, 216, 216))
            .addGroup(DpanelLayout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(lblnombres, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(lblapellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(lblacceso, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(448, 448, 448)
                .addComponent(lbhora)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DpanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(DpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtconta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnadministracion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnproveedores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnexpediente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtreportes, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(155, 155, 155))
        );
        DpanelLayout.setVerticalGroup(
            DpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DpanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lbltitulo)
                .addGap(18, 18, 18)
                .addComponent(btnexpediente)
                .addGap(14, 14, 14)
                .addComponent(btnproveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnadministracion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtconta)
                .addGap(10, 10, 10)
                .addComponent(txtreportes, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(DpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblnombres, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblapellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblacceso, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbhora)))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel1.setText("Reloj");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel2.setText("Logo de Clinica");

        jLabel3.setText("Nombre");

        jLabel4.setText("Rol");

        jButton1.setText("Expedientes");

        jButton2.setText("Administración");

        jButton5.setText("Reportes");

        jMenu3.setForeground(new java.awt.Color(0, 102, 153));
        jMenu3.setText("Expediente");

        jMenuItem3.setForeground(new java.awt.Color(0, 102, 153));
        jMenuItem3.setText("Expediente General");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem3);

        jMenuItem5.setForeground(new java.awt.Color(0, 102, 153));
        jMenuItem5.setText("Expediente Ortodoncia");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem5);

        jMenuItem8.setForeground(new java.awt.Color(0, 102, 153));
        jMenuItem8.setText("Insertar Tipo de Paciente");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem8);

        jMenuItem11.setForeground(new java.awt.Color(0, 102, 153));
        jMenuItem11.setText("Vista de pacientes Ortodoncia");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem11);

        jMenuItem21.setForeground(new java.awt.Color(0, 102, 153));
        jMenuItem21.setText("Agregar consulta Paciente General");
        jMenuItem21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem21ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem21);

        jMenuItem23.setForeground(new java.awt.Color(0, 102, 153));
        jMenuItem23.setText("Vista Paciente Odontologia General");
        jMenuItem23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem23ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem23);

        jMenuItem24.setForeground(new java.awt.Color(0, 102, 153));
        jMenuItem24.setText("Tratamiento Ortodoncia");
        jMenuItem24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem24ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem24);

        jMenuBar1.add(jMenu3);

        Admin.setForeground(new java.awt.Color(0, 102, 153));
        Admin.setText("Administrar");

        jMenuItem10.setForeground(new java.awt.Color(0, 102, 153));
        jMenuItem10.setText("Nuevo usuario");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        Admin.add(jMenuItem10);

        jMenuItem19.setForeground(new java.awt.Color(0, 102, 153));
        jMenuItem19.setText("Vista Empleados");
        jMenuItem19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem19ActionPerformed(evt);
            }
        });
        Admin.add(jMenuItem19);

        jMenuItem20.setForeground(new java.awt.Color(0, 102, 153));
        jMenuItem20.setText("Vista Pagos");
        jMenuItem20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem20ActionPerformed(evt);
            }
        });
        Admin.add(jMenuItem20);

        back.setForeground(new java.awt.Color(0, 102, 153));
        back.setText("Backup");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        Admin.add(back);

        jMenuItem25.setForeground(new java.awt.Color(0, 102, 153));
        jMenuItem25.setText("Reporte expediente general");
        jMenuItem25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem25ActionPerformed(evt);
            }
        });
        Admin.add(jMenuItem25);

        jMenuItem26.setForeground(new java.awt.Color(0, 102, 153));
        jMenuItem26.setText("Reporte expediente ortodoncia");
        jMenuItem26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem26ActionPerformed(evt);
            }
        });
        Admin.add(jMenuItem26);

        jMenuBar1.add(Admin);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(313, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(311, 311, 311))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(28, 28, 28)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(72, 72, 72)
                .addComponent(jButton1)
                .addGap(52, 52, 52)
                .addComponent(jButton2)
                .addGap(59, 59, 59)
                .addComponent(jButton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 119, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem19ActionPerformed
       
    }//GEN-LAST:event_jMenuItem19ActionPerformed

    private void jMenuItem20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem20ActionPerformed
        
    }//GEN-LAST:event_jMenuItem20ActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        
    }//GEN-LAST:event_backActionPerformed

    private void DpanelComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_DpanelComponentResized
      
    }//GEN-LAST:event_DpanelComponentResized

    private void btnexpedienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexpedienteActionPerformed
       
    }//GEN-LAST:event_btnexpedienteActionPerformed

    private void btnproveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnproveedoresActionPerformed
        
    }//GEN-LAST:event_btnproveedoresActionPerformed

    private void txtcontaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcontaActionPerformed
       
    }//GEN-LAST:event_txtcontaActionPerformed

    private void btnadministracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnadministracionActionPerformed
       
    }//GEN-LAST:event_btnadministracionActionPerformed

    private void jMenuItem25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem25ActionPerformed
    
    }//GEN-LAST:event_jMenuItem25ActionPerformed

    private void jMenuItem26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem26ActionPerformed
       
    }//GEN-LAST:event_jMenuItem26ActionPerformed

    private void txtreportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtreportesActionPerformed
       
    }//GEN-LAST:event_txtreportesActionPerformed

    private void jMenuItem24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem24ActionPerformed
      
    }//GEN-LAST:event_jMenuItem24ActionPerformed

    private void jMenuItem23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem23ActionPerformed
      
    }//GEN-LAST:event_jMenuItem23ActionPerformed

    private void jMenuItem21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem21ActionPerformed
       
    }//GEN-LAST:event_jMenuItem21ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
       
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
       
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static final javax.swing.JMenu Admin = new javax.swing.JMenu();
    public static javax.swing.JDesktopPane Dpanel;
    private javax.swing.JMenuItem back;
    public static final javax.swing.JButton btnadministracion = new javax.swing.JButton();
    private javax.swing.JButton btnexpediente;
    private javax.swing.JButton btnproveedores;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem19;
    private javax.swing.JMenuItem jMenuItem20;
    private javax.swing.JMenuItem jMenuItem21;
    private javax.swing.JMenuItem jMenuItem23;
    private javax.swing.JMenuItem jMenuItem24;
    private javax.swing.JMenuItem jMenuItem25;
    private javax.swing.JMenuItem jMenuItem26;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JLabel lbhora;
    public static javax.swing.JLabel lblacceso;
    public static javax.swing.JLabel lblapellidos;
    public static javax.swing.JLabel lblnombres;
    private javax.swing.JLabel lbltitulo;
    private javax.swing.JButton txtconta;
    public static final javax.swing.JButton txtreportes = new javax.swing.JButton();
    // End of variables declaration//GEN-END:variables

    @Override
    public void run() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

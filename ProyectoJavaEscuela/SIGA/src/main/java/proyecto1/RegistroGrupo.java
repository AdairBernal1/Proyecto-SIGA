
package proyecto1;

import dao.AlumnoDAO;
import dao.GrupoDAO;
import gui.DisplayJTableList;
import java.awt.Color;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class RegistroGrupo extends javax.swing.JFrame {

    public RegistroGrupo() {
        initComponents();
        try {
            Fondo fondo = new Fondo(ImageIO.read(new File("C:/Users/adair/Documents/GitHub/Proyecto-SIGA/ProyectoJavaEscuela/SIGA/src/main/java/proyecto1/Fondo8.jpg")));
            JPanel panel = (JPanel) this.getContentPane();
            panel.setBorder(fondo);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        jLabel1.setIcon(new ImageIcon(new ImageIcon("C:/Users/adair/Documents/GitHub/Proyecto-SIGA/ProyectoJavaEscuela/SIGA/src/main/java/proyecto1/logoEsc.png").getImage().getScaledInstance(158,128, Image.SCALE_DEFAULT)));
        jPanel1.setBackground(new Color(82, 102, 222, 150));
        jPanel2.setBackground(new Color(0,0,0,50));
        jPanel4.setBackground(new Color(0,0,0,50));
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCancelar = new javax.swing.JButton();
        btnAltaGrupo = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cbxDiaGrupo = new javax.swing.JComboBox<>();
        cbxHorarioGrupo = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        cbxTeacher = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        btnAlumnos = new javax.swing.JButton();
        btnGrupos = new javax.swing.JButton();
        btnPrincipal = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Rgistrar Grupo");

        btnCancelar.setBackground(new java.awt.Color(255, 102, 51));
        btnCancelar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnAltaGrupo.setBackground(new java.awt.Color(51, 102, 255));
        btnAltaGrupo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnAltaGrupo.setText("Guardar");
        btnAltaGrupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAltaGrupoActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Dia");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Horario");

        cbxDiaGrupo.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        cbxDiaGrupo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sabado", "Domingo" }));

        cbxHorarioGrupo.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        cbxHorarioGrupo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "9:00am - 12:00pm", "12:00pm - 3:00pm" }));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Teacher");

        cbxTeacher.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        cbxTeacher.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "adair", "tonta1", "tonta2" }));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 115, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(cbxDiaGrupo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbxHorarioGrupo, 0, 189, Short.MAX_VALUE)
                    .addComponent(cbxTeacher, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(86, 86, 86))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbxDiaGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbxHorarioGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbxTeacher, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnAlumnos.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnAlumnos.setText("Alumnos");
        btnAlumnos.setBorderPainted(false);
        btnAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlumnosActionPerformed(evt);
            }
        });

        btnGrupos.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnGrupos.setText("Grupos");
        btnGrupos.setBorderPainted(false);
        btnGrupos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGruposActionPerformed(evt);
            }
        });

        btnPrincipal.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnPrincipal.setText("Inicio");
        btnPrincipal.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrincipalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnGrupos, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAlumnos)
                    .addComponent(btnPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(btnPrincipal)
                .addGap(37, 37, 37)
                .addComponent(btnAlumnos)
                .addGap(18, 18, 18)
                .addComponent(btnGrupos)
                .addContainerGap(275, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 34)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Escuela de Computación e Inglés de Sinaloa");
        jLabel10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel10.setMinimumSize(new java.awt.Dimension(0, 0));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("CECSIN");
        jLabel11.setMinimumSize(new java.awt.Dimension(0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 766, Short.MAX_VALUE))
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        btnSalir.setBackground(new java.awt.Color(153, 153, 153));
        btnSalir.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(btnAltaGrupo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSalir)
                        .addGap(135, 135, 135))))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAltaGrupo)
                            .addComponent(btnCancelar)
                            .addComponent(btnSalir))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
    if (JOptionPane.showConfirmDialog(null, "¿Desea cancelar el registro? No se guardarán los datos", "WARNING",
        JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION) {
            Limpiar();
        }else{
        }
    }//GEN-LAST:event_btnCancelarActionPerformed
    private List<Grupo> lista=new ArrayList<Grupo>();
    private void btnAltaGrupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAltaGrupoActionPerformed
        Grupo a=new Grupo();
        try {
            guardarGrupo();
        } catch (Exception ex) {
            Logger.getLogger(RegistroGrupo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAltaGrupoActionPerformed

    private void btnAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlumnosActionPerformed
    if (JOptionPane.showConfirmDialog(null, "¿Desea salir sin guardar?", "WARNING",
        JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION) {
            Menu abrir = new Menu();
            abrir.setVisible(true);
            this.dispose();
            //accion para listar alumnos
        }else{
        }
    }//GEN-LAST:event_btnAlumnosActionPerformed

    private void btnGruposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGruposActionPerformed
    if (JOptionPane.showConfirmDialog(null, "¿Desea salir sin guardar?", "WARNING",
        JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION) {
            Menu abrir = new Menu();
            abrir.setVisible(true);
            this.dispose();
            //accion para listar grupos
        }else{
        }
    }//GEN-LAST:event_btnGruposActionPerformed

    private void btnPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrincipalActionPerformed
    if (JOptionPane.showConfirmDialog(null, "¿Desea salir sin guardar?", "WARNING",
        JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION) {
            Menu abrir = new Menu();
            abrir.setVisible(true);
            this.dispose();
        }else{
        }
    }//GEN-LAST:event_btnPrincipalActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        Menu abrir = new Menu();
        abrir.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RegistroGrupo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroGrupo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroGrupo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroGrupo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroGrupo().setVisible(true);
            }
        });
    }
   



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAltaGrupo;
    private javax.swing.JButton btnAlumnos;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGrupos;
    private javax.swing.JButton btnPrincipal;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cbxDiaGrupo;
    private javax.swing.JComboBox<String> cbxHorarioGrupo;
    private javax.swing.JComboBox<String> cbxTeacher;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables

    private void Limpiar() {
    }
    private void guardarGrupo() throws Exception {
        GrupoDAO dao = new GrupoDAO();
        Grupo g=new Grupo();
        g.setDia((String)this.cbxDiaGrupo.getSelectedItem());
        g.setHorario((String)this.cbxHorarioGrupo.getSelectedItem());
        g.setTeacher((String)this.cbxTeacher.getSelectedItem());

        if ("".equals((String)this.cbxDiaGrupo.getSelectedItem()) || "".equals((String)this.cbxHorarioGrupo.getSelectedItem()) || "".equals((String)this.cbxHorarioGrupo.getSelectedItem()))  {
            JOptionPane.showMessageDialog(rootPane, "Faltan datos");
        } 
        else {
            dao.agregarGrupo(g);
            JOptionPane.showMessageDialog(rootPane, "Grupo registrado correctamente");
            Limpiar();
        }    
    }
}


package br.com.stock.view.usuario;

import br.com.stock.BwStock;
import br.com.stock.control.UsuarioControl;

public class PainelUsuarioBusca extends javax.swing.JFrame {

    UsuarioControl USUARIO_CONTROL;

    public PainelUsuarioBusca() {
        initComponents();
        USUARIO_CONTROL = new UsuarioControl();
        USUARIO_CONTROL.ListUsuariosTabelaAction();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        painelFundo = new javax.swing.JPanel();
        painelFundoInferior = new javax.swing.JPanel();
        formBrancoInferior = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        formMenu = new javax.swing.JPanel();
        textoPesquisar = new javax.swing.JLabel();
        buttonPesquisar = new javax.swing.JButton();
        buttonNovo = new javax.swing.JButton();
        buttonExcluir = new javax.swing.JButton();
        buttonEditar = new javax.swing.JButton();
        iconAtualizar = new javax.swing.JLabel();
        textoAtualizar = new javax.swing.JLabel();
        painelLogo = new javax.swing.JPanel();
        textoLogoEmpresa = new javax.swing.JLabel();
        textoDescricaoEmpresa = new javax.swing.JLabel();
        textoTitulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        painelFundo.setBackground(new java.awt.Color(45, 118, 232));

        painelFundoInferior.setBackground(new java.awt.Color(255, 255, 255));

        formBrancoInferior.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tabelaUsuario.setBackground(new java.awt.Color(204, 204, 204));
        tabelaUsuario.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tabelaUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Pessoa", "Usuario", "Ativo", "Data de Cadastro"
            }
        ));
        tabelaUsuario.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jScrollPane1.setViewportView(tabelaUsuario);

        javax.swing.GroupLayout formBrancoInferiorLayout = new javax.swing.GroupLayout(formBrancoInferior);
        formBrancoInferior.setLayout(formBrancoInferiorLayout);
        formBrancoInferiorLayout.setHorizontalGroup(
            formBrancoInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        formBrancoInferiorLayout.setVerticalGroup(
            formBrancoInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 456, Short.MAX_VALUE)
        );

        formMenu.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        formMenu.setLayout(new java.awt.GridBagLayout());

        textoPesquisar.setText("Pesquisar");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        formMenu.add(textoPesquisar, gridBagConstraints);

        campoPesquisar.setColumns(15);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        formMenu.add(campoPesquisar, gridBagConstraints);

        buttonPesquisar.setBackground(javax.swing.UIManager.getDefaults().getColor("controlHighlight"));
        buttonPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/stock/img/search_20px_1.png"))); // NOI18N
        buttonPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPesquisarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        formMenu.add(buttonPesquisar, gridBagConstraints);

        buttonNovo.setText("Novo");
        buttonNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonNovoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(1, 46, 1, 1);
        formMenu.add(buttonNovo, gridBagConstraints);

        buttonExcluir.setText("Excluir");
        buttonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExcluirActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(1, 3, 1, 1);
        formMenu.add(buttonExcluir, gridBagConstraints);

        buttonEditar.setText("Editar");
        buttonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(1, 3, 1, 1);
        formMenu.add(buttonEditar, gridBagConstraints);

        iconAtualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/stock/img/update_24x24.png"))); // NOI18N
        iconAtualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iconAtualizarMouseClicked(evt);
            }
        });

        textoAtualizar.setText("Atualizar");

        javax.swing.GroupLayout painelFundoInferiorLayout = new javax.swing.GroupLayout(painelFundoInferior);
        painelFundoInferior.setLayout(painelFundoInferiorLayout);
        painelFundoInferiorLayout.setHorizontalGroup(
            painelFundoInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(formBrancoInferior, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(painelFundoInferiorLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(formMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 563, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(painelFundoInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelFundoInferiorLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(textoAtualizar))
                    .addGroup(painelFundoInferiorLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(iconAtualizar)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        painelFundoInferiorLayout.setVerticalGroup(
            painelFundoInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelFundoInferiorLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(painelFundoInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(painelFundoInferiorLayout.createSequentialGroup()
                        .addComponent(iconAtualizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(textoAtualizar))
                    .addComponent(formMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(formBrancoInferior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelLogo.setBackground(new java.awt.Color(45, 118, 232));

        textoLogoEmpresa.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        textoLogoEmpresa.setForeground(new java.awt.Color(255, 255, 255));
        textoLogoEmpresa.setText("STOCK");

        textoDescricaoEmpresa.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        textoDescricaoEmpresa.setForeground(new java.awt.Color(255, 255, 255));
        textoDescricaoEmpresa.setText("Gerenciador de Estoque");

        textoTitulo.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        textoTitulo.setForeground(new java.awt.Color(255, 255, 255));
        textoTitulo.setText("Busca de Usuarios");

        javax.swing.GroupLayout painelLogoLayout = new javax.swing.GroupLayout(painelLogo);
        painelLogo.setLayout(painelLogoLayout);
        painelLogoLayout.setHorizontalGroup(
            painelLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelLogoLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(textoLogoEmpresa)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(painelLogoLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(textoDescricaoEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addComponent(textoTitulo)
                .addGap(40, 40, 40))
        );
        painelLogoLayout.setVerticalGroup(
            painelLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelLogoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textoLogoEmpresa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textoDescricaoEmpresa)
                    .addComponent(textoTitulo))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout painelFundoLayout = new javax.swing.GroupLayout(painelFundo);
        painelFundo.setLayout(painelFundoLayout);
        painelFundoLayout.setHorizontalGroup(
            painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelFundoInferior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(painelFundoLayout.createSequentialGroup()
                .addComponent(painelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        painelFundoLayout.setVerticalGroup(
            painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelFundoLayout.createSequentialGroup()
                .addComponent(painelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelFundoInferior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelFundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelFundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonNovoActionPerformed
        BwStock.JanelaUsuarioEdicao();
    }//GEN-LAST:event_buttonNovoActionPerformed

    private void buttonPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPesquisarActionPerformed
        USUARIO_CONTROL.pesquisarUsuarioAction();
    }//GEN-LAST:event_buttonPesquisarActionPerformed

    private void buttonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExcluirActionPerformed
        // TODO add your handling code here:
        USUARIO_CONTROL.excluirUsuarioAction();
        USUARIO_CONTROL.ListUsuariosTabelaAction();
    }//GEN-LAST:event_buttonExcluirActionPerformed

    private void iconAtualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconAtualizarMouseClicked
        // TODO add your handling code here:
        USUARIO_CONTROL.ListUsuariosTabelaAction();
    }//GEN-LAST:event_iconAtualizarMouseClicked

    private void buttonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditarActionPerformed
        // TODO add your handling code here:
        USUARIO_CONTROL.editarUsuarioAction();
    }//GEN-LAST:event_buttonEditarActionPerformed

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
            java.util.logging.Logger.getLogger(PainelUsuarioBusca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PainelUsuarioBusca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PainelUsuarioBusca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PainelUsuarioBusca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PainelUsuarioBusca().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonEditar;
    private javax.swing.JButton buttonExcluir;
    private javax.swing.JButton buttonNovo;
    private javax.swing.JButton buttonPesquisar;
    public static final javax.swing.JTextField campoPesquisar = new javax.swing.JTextField();
    private javax.swing.JPanel formBrancoInferior;
    private javax.swing.JPanel formMenu;
    private javax.swing.JLabel iconAtualizar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel painelFundo;
    private javax.swing.JPanel painelFundoInferior;
    private javax.swing.JPanel painelLogo;
    public static final javax.swing.JTable tabelaUsuario = new javax.swing.JTable();
    private javax.swing.JLabel textoAtualizar;
    private javax.swing.JLabel textoDescricaoEmpresa;
    private javax.swing.JLabel textoLogoEmpresa;
    private javax.swing.JLabel textoPesquisar;
    private javax.swing.JLabel textoTitulo;
    // End of variables declaration//GEN-END:variables

}

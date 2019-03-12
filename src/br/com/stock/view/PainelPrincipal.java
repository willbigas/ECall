package br.com.stock.view;

import br.com.stock.BwStock;

public class PainelPrincipal extends javax.swing.JFrame {
    
    public PainelPrincipal() {
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

        painelFundo = new javax.swing.JPanel();
        painelFundoInferior = new javax.swing.JPanel();
        panelProduto = new javax.swing.JPanel();
        textoProduto = new javax.swing.JLabel();
        iconProduto = new javax.swing.JLabel();
        panelEntrada = new javax.swing.JPanel();
        textoEntrada = new javax.swing.JLabel();
        iconEntrada = new javax.swing.JLabel();
        panelSaida = new javax.swing.JPanel();
        textoSaida = new javax.swing.JLabel();
        iconSaida = new javax.swing.JLabel();
        panelInventario = new javax.swing.JPanel();
        textoInventario = new javax.swing.JLabel();
        iconInventario = new javax.swing.JLabel();
        panelUsuario = new javax.swing.JPanel();
        textoUsuario = new javax.swing.JLabel();
        iconUsuario = new javax.swing.JLabel();
        panelCategoria = new javax.swing.JPanel();
        textoCategoria = new javax.swing.JLabel();
        iconCategoria = new javax.swing.JLabel();
        separadorTopo = new javax.swing.JSeparator();
        separadoEsquerda = new javax.swing.JSeparator();
        separadorInferior = new javax.swing.JSeparator();
        separadorDireita = new javax.swing.JSeparator();
        panelLogoEmpresa = new javax.swing.JPanel();
        textoTitulo = new javax.swing.JLabel();
        textoDescricaoEmpresa = new javax.swing.JLabel();
        textoLogoEmpresa = new javax.swing.JLabel();
        painelHome = new javax.swing.JPanel();
        iconCasa = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        painelFundo.setBackground(new java.awt.Color(45, 118, 232));

        painelFundoInferior.setBackground(new java.awt.Color(255, 255, 255));

        panelProduto.setPreferredSize(new java.awt.Dimension(133, 103));
        panelProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelProdutoMouseClicked(evt);
            }
        });

        textoProduto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        textoProduto.setForeground(new java.awt.Color(45, 118, 232));
        textoProduto.setText("PRODUTO");

        iconProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/stock/img/product_48x48.png"))); // NOI18N

        javax.swing.GroupLayout panelProdutoLayout = new javax.swing.GroupLayout(panelProduto);
        panelProduto.setLayout(panelProdutoLayout);
        panelProdutoLayout.setHorizontalGroup(
            panelProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProdutoLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(panelProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textoProduto)
                    .addGroup(panelProdutoLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(iconProduto)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        panelProdutoLayout.setVerticalGroup(
            panelProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProdutoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(iconProduto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textoProduto)
                .addGap(18, 18, 18))
        );

        panelEntrada.setPreferredSize(new java.awt.Dimension(133, 103));

        textoEntrada.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        textoEntrada.setForeground(new java.awt.Color(45, 118, 232));
        textoEntrada.setText("ENTRADA");

        iconEntrada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/stock/img/entrada_48x48.png"))); // NOI18N

        javax.swing.GroupLayout panelEntradaLayout = new javax.swing.GroupLayout(panelEntrada);
        panelEntrada.setLayout(panelEntradaLayout);
        panelEntradaLayout.setHorizontalGroup(
            panelEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEntradaLayout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addComponent(textoEntrada)
                .addGap(31, 31, 31))
            .addGroup(panelEntradaLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(iconEntrada)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelEntradaLayout.setVerticalGroup(
            panelEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEntradaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(iconEntrada)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textoEntrada)
                .addGap(18, 18, 18))
        );

        panelSaida.setPreferredSize(new java.awt.Dimension(133, 103));

        textoSaida.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        textoSaida.setForeground(new java.awt.Color(45, 118, 232));
        textoSaida.setText("SAIDA");

        iconSaida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/stock/img/saida_48x48.png"))); // NOI18N

        javax.swing.GroupLayout panelSaidaLayout = new javax.swing.GroupLayout(panelSaida);
        panelSaida.setLayout(panelSaidaLayout);
        panelSaidaLayout.setHorizontalGroup(
            panelSaidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSaidaLayout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addGroup(panelSaidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(iconSaida)
                    .addComponent(textoSaida))
                .addGap(41, 41, 41))
        );
        panelSaidaLayout.setVerticalGroup(
            panelSaidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSaidaLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(iconSaida)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(textoSaida)
                .addGap(17, 17, 17))
        );

        panelInventario.setPreferredSize(new java.awt.Dimension(133, 103));

        textoInventario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        textoInventario.setForeground(new java.awt.Color(45, 118, 232));
        textoInventario.setText("INVENTARIO");

        iconInventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/stock/img/inventario_48x48.png"))); // NOI18N

        javax.swing.GroupLayout panelInventarioLayout = new javax.swing.GroupLayout(panelInventario);
        panelInventario.setLayout(panelInventarioLayout);
        panelInventarioLayout.setHorizontalGroup(
            panelInventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInventarioLayout.createSequentialGroup()
                .addGroup(panelInventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelInventarioLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(textoInventario))
                    .addGroup(panelInventarioLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(iconInventario)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        panelInventarioLayout.setVerticalGroup(
            panelInventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelInventarioLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(iconInventario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textoInventario)
                .addGap(18, 18, 18))
        );

        panelUsuario.setPreferredSize(new java.awt.Dimension(133, 103));
        panelUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelUsuarioMouseClicked(evt);
            }
        });

        textoUsuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        textoUsuario.setForeground(new java.awt.Color(45, 118, 232));
        textoUsuario.setText("USUARIO");

        iconUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/stock/img/usuario_48x48.png"))); // NOI18N

        javax.swing.GroupLayout panelUsuarioLayout = new javax.swing.GroupLayout(panelUsuario);
        panelUsuario.setLayout(panelUsuarioLayout);
        panelUsuarioLayout.setHorizontalGroup(
            panelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelUsuarioLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(panelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textoUsuario)
                    .addGroup(panelUsuarioLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(iconUsuario)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelUsuarioLayout.setVerticalGroup(
            panelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelUsuarioLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(iconUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textoUsuario)
                .addGap(13, 13, 13))
        );

        panelCategoria.setPreferredSize(new java.awt.Dimension(133, 103));
        panelCategoria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelCategoriaMouseClicked(evt);
            }
        });

        textoCategoria.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        textoCategoria.setForeground(new java.awt.Color(45, 118, 232));
        textoCategoria.setText("CATEGORIA");

        iconCategoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/stock/img/category_32x32.png"))); // NOI18N

        javax.swing.GroupLayout panelCategoriaLayout = new javax.swing.GroupLayout(panelCategoria);
        panelCategoria.setLayout(panelCategoriaLayout);
        panelCategoriaLayout.setHorizontalGroup(
            panelCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCategoriaLayout.createSequentialGroup()
                .addGroup(panelCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCategoriaLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(textoCategoria))
                    .addGroup(panelCategoriaLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(iconCategoria)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        panelCategoriaLayout.setVerticalGroup(
            panelCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCategoriaLayout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(iconCategoria)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textoCategoria)
                .addGap(18, 18, 18))
        );

        separadorTopo.setBackground(new java.awt.Color(0, 126, 182));
        separadorTopo.setForeground(new java.awt.Color(0, 126, 182));

        separadoEsquerda.setBackground(new java.awt.Color(0, 126, 182));
        separadoEsquerda.setForeground(new java.awt.Color(0, 126, 182));
        separadoEsquerda.setOrientation(javax.swing.SwingConstants.VERTICAL);
        separadoEsquerda.setToolTipText("");

        separadorInferior.setBackground(new java.awt.Color(0, 126, 182));
        separadorInferior.setForeground(new java.awt.Color(0, 126, 182));

        separadorDireita.setBackground(new java.awt.Color(0, 126, 182));
        separadorDireita.setForeground(new java.awt.Color(0, 126, 182));
        separadorDireita.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout painelFundoInferiorLayout = new javax.swing.GroupLayout(painelFundoInferior);
        painelFundoInferior.setLayout(painelFundoInferiorLayout);
        painelFundoInferiorLayout.setHorizontalGroup(
            painelFundoInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelFundoInferiorLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(painelFundoInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelFundoInferiorLayout.createSequentialGroup()
                        .addComponent(separadorInferior, javax.swing.GroupLayout.PREFERRED_SIZE, 738, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelFundoInferiorLayout.createSequentialGroup()
                        .addGroup(painelFundoInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelFundoInferiorLayout.createSequentialGroup()
                                .addComponent(separadoEsquerda, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addGroup(painelFundoInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(panelUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                                    .addComponent(panelProduto, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(painelFundoInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(painelFundoInferiorLayout.createSequentialGroup()
                                        .addComponent(panelEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(panelSaida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(panelInventario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(panelCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelFundoInferiorLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(separadorTopo, javax.swing.GroupLayout.PREFERRED_SIZE, 738, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)))
                        .addComponent(separadorDireita, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        painelFundoInferiorLayout.setVerticalGroup(
            painelFundoInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelFundoInferiorLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(separadorTopo, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(painelFundoInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelFundoInferiorLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(painelFundoInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(panelInventario, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                            .addComponent(panelSaida, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                            .addComponent(panelProduto, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                            .addComponent(panelEntrada, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(painelFundoInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(panelUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panelCategoria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(painelFundoInferiorLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painelFundoInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(separadorDireita, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(separadoEsquerda, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(separadorInferior, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelLogoEmpresa.setBackground(new java.awt.Color(45, 118, 232));

        textoTitulo.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        textoTitulo.setForeground(new java.awt.Color(255, 255, 255));
        textoTitulo.setText("Acesso Principal");

        javax.swing.GroupLayout panelLogoEmpresaLayout = new javax.swing.GroupLayout(panelLogoEmpresa);
        panelLogoEmpresa.setLayout(panelLogoEmpresaLayout);
        panelLogoEmpresaLayout.setHorizontalGroup(
            panelLogoEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLogoEmpresaLayout.createSequentialGroup()
                .addGap(0, 20, Short.MAX_VALUE)
                .addComponent(textoTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelLogoEmpresaLayout.setVerticalGroup(
            panelLogoEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLogoEmpresaLayout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addComponent(textoTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );

        textoDescricaoEmpresa.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        textoDescricaoEmpresa.setForeground(new java.awt.Color(255, 255, 255));
        textoDescricaoEmpresa.setText("Gerenciador de Estoque");

        textoLogoEmpresa.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        textoLogoEmpresa.setForeground(new java.awt.Color(255, 255, 255));
        textoLogoEmpresa.setText("STOCK");

        painelHome.setPreferredSize(new java.awt.Dimension(133, 103));

        iconCasa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/stock/img/home_48px.png"))); // NOI18N

        javax.swing.GroupLayout painelHomeLayout = new javax.swing.GroupLayout(painelHome);
        painelHome.setLayout(painelHomeLayout);
        painelHomeLayout.setHorizontalGroup(
            painelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(iconCasa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        painelHomeLayout.setVerticalGroup(
            painelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelHomeLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(iconCasa))
        );

        javax.swing.GroupLayout painelFundoLayout = new javax.swing.GroupLayout(painelFundo);
        painelFundo.setLayout(painelFundoLayout);
        painelFundoLayout.setHorizontalGroup(
            painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelFundoInferior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(painelFundoLayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(painelHome, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86)
                .addComponent(panelLogoEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelFundoLayout.createSequentialGroup()
                        .addComponent(textoDescricaoEmpresa)
                        .addGap(33, 33, 33))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelFundoLayout.createSequentialGroup()
                        .addComponent(textoLogoEmpresa)
                        .addGap(44, 44, 44))))
        );
        painelFundoLayout.setVerticalGroup(
            painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelFundoLayout.createSequentialGroup()
                .addGroup(painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelLogoEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(painelFundoLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(textoLogoEmpresa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textoDescricaoEmpresa))
                    .addGroup(painelFundoLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(painelHome, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(painelFundoInferior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void panelUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelUsuarioMouseClicked
        BwStock.JanelaUsuario();
    }//GEN-LAST:event_panelUsuarioMouseClicked

    private void panelProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelProdutoMouseClicked
        try {
            BwStock.JanelaProduto();
        } catch (Exception exception) {
        }
    }//GEN-LAST:event_panelProdutoMouseClicked

    private void panelCategoriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelCategoriaMouseClicked
        // TODO add your handling code here:
        BwStock.JanelaCategoria();
        
    }//GEN-LAST:event_panelCategoriaMouseClicked

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
            java.util.logging.Logger.getLogger(PainelPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PainelPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PainelPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PainelPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PainelPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel iconCasa;
    private javax.swing.JLabel iconCategoria;
    private javax.swing.JLabel iconEntrada;
    private javax.swing.JLabel iconInventario;
    private javax.swing.JLabel iconProduto;
    private javax.swing.JLabel iconSaida;
    private javax.swing.JLabel iconUsuario;
    private javax.swing.JPanel painelFundo;
    private javax.swing.JPanel painelFundoInferior;
    private javax.swing.JPanel painelHome;
    private javax.swing.JPanel panelCategoria;
    private javax.swing.JPanel panelEntrada;
    private javax.swing.JPanel panelInventario;
    private javax.swing.JPanel panelLogoEmpresa;
    private javax.swing.JPanel panelProduto;
    private javax.swing.JPanel panelSaida;
    private javax.swing.JPanel panelUsuario;
    private javax.swing.JSeparator separadoEsquerda;
    private javax.swing.JSeparator separadorDireita;
    private javax.swing.JSeparator separadorInferior;
    private javax.swing.JSeparator separadorTopo;
    private javax.swing.JLabel textoCategoria;
    private javax.swing.JLabel textoDescricaoEmpresa;
    private javax.swing.JLabel textoEntrada;
    private javax.swing.JLabel textoInventario;
    private javax.swing.JLabel textoLogoEmpresa;
    private javax.swing.JLabel textoProduto;
    private javax.swing.JLabel textoSaida;
    private javax.swing.JLabel textoTitulo;
    private javax.swing.JLabel textoUsuario;
    // End of variables declaration//GEN-END:variables
}

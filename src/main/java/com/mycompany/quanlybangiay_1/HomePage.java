/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.quanlybangiay_1;

/**
 *
 * @author ASUS
 */
public class HomePage extends javax.swing.JFrame {

    /**
     * Creates new form HomePage
     */
    public HomePage() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        btnShop = new javax.swing.JMenu();
        btnCart = new javax.swing.JMenu();
        btnAbout = new javax.swing.JMenu();
        btnInvoice = new javax.swing.JMenu();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLayeredPane1.setBackground(new java.awt.Color(255, 255, 255));
        jLayeredPane1.setForeground(new java.awt.Color(255, 255, 255));
        jLayeredPane1.setFont(new java.awt.Font(".VnTimeH", 1, 24)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Snap ITC", 0, 68)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 153));
        jLabel4.setText("KING Sneaker");
        jLabel4.setToolTipText("");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Welcome to");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Copyright © 2022 King Sneaker. All rights reserved.  ");

        jLabel1.setFont(new java.awt.Font("SimSun-ExtB", 2, 26)); // NOI18N
        jLabel1.setText("Our reputation shines like our shoes");

        jLabel6.setFont(new java.awt.Font("SimSun-ExtB", 2, 22)); // NOI18N
        jLabel6.setText(" And the shoes will lead you to success.");

        jLayeredPane1.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 793, Short.MAX_VALUE))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addGap(121, 121, 121)
                                .addComponent(jLabel4))
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addGap(336, 336, 336)
                                .addComponent(jLabel2))
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addGap(150, 150, 150)
                                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                        .addGap(17, 17, 17)
                                        .addComponent(jLabel6)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                .addGap(187, 187, 187)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 313, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap())
        );

        jMenuBar1.setBackground(new java.awt.Color(51, 255, 255));
        jMenuBar1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N

        btnShop.setBackground(new java.awt.Color(0, 51, 255));
        btnShop.setText("SHOP");
        btnShop.setFont(new java.awt.Font(".VnTimeH", 1, 24)); // NOI18N
        btnShop.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnShopMouseClicked(evt);
            }
        });
        jMenuBar1.add(btnShop);

        btnCart.setBackground(new java.awt.Color(0, 51, 255));
        btnCart.setText("CART");
        btnCart.setFont(new java.awt.Font(".VnTimeH", 1, 24)); // NOI18N
        btnCart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCartMouseClicked(evt);
            }
        });
        jMenuBar1.add(btnCart);

        btnAbout.setBackground(new java.awt.Color(0, 51, 255));
        btnAbout.setText("ABOUT");
        btnAbout.setFont(new java.awt.Font(".VnTimeH", 1, 24)); // NOI18N
        btnAbout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAboutMouseClicked(evt);
            }
        });
        jMenuBar1.add(btnAbout);

        btnInvoice.setBackground(new java.awt.Color(0, 51, 255));
        btnInvoice.setText("INVOICE");
        btnInvoice.setFont(new java.awt.Font(".VnTimeH", 1, 24)); // NOI18N
        btnInvoice.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnInvoiceMouseClicked(evt);
            }
        });
        jMenuBar1.add(btnInvoice);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInvoiceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInvoiceMouseClicked
        INVOICE invoice = new INVOICE();
        invoice.setLocationRelativeTo(null);
        invoice.setVisible(true);
        invoice.setDefaultCloseOperation(HomePage.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_btnInvoiceMouseClicked

    

    private void btnShopMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btnShopMouseClicked
        SHOP shop = new SHOP();
        shop.setResizable(false);
        shop.setLocationRelativeTo(null);
        shop.setVisible(true);
        shop.pack();
        shop.setDefaultCloseOperation(HomePage.DISPOSE_ON_CLOSE);
    }// GEN-LAST:event_btnShopMouseClicked

    private void btnCartMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btnCartMouseClicked
        CART cart = new CART();
        cart.setLocationRelativeTo(null);
        cart.setVisible(true);
        cart.setDefaultCloseOperation(HomePage.DISPOSE_ON_CLOSE);
    }// GEN-LAST:event_btnCartMouseClicked

    private void btnAboutMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btnAboutMouseClicked
        ABOUT about = new ABOUT();
        about.setLocationRelativeTo(null);
        about.setVisible(true);
        about.setDefaultCloseOperation(HomePage.DISPOSE_ON_CLOSE);
    }// GEN-LAST:event_btnAboutMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu btnAbout;
    private javax.swing.JMenu btnCart;
    private javax.swing.JMenu btnInvoice;
    private javax.swing.JMenu btnShop;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}

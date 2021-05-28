/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.form;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

/**
 *
 * @author hatch
 */
public class FrmMain extends javax.swing.JFrame {

    /**
     * Creates new form FrmMain
     */
    public FrmMain() {
        initComponents();
//        addComponents();
//        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlHeader = new javax.swing.JPanel();
        txtSearch = new javax.swing.JTextField();
        cbCategory = new javax.swing.JComboBox<>();
        btnSearch = new javax.swing.JButton();
        pnlHeaderWriter = new javax.swing.JPanel();
        pnlHeaderAdmin = new javax.swing.JPanel();
        pnlArticles = new javax.swing.JScrollPane();
        pnlAllArticles = new javax.swing.JPanel();
        btnLogin = new javax.swing.JButton();
        btnHome = new javax.swing.JButton();
        lblUser = new javax.swing.JLabel();
        menu = new javax.swing.JMenuBar();
        meAdmin = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        mePisac = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtSearch.setFont(new java.awt.Font("Fira Sans Semi-Light", 0, 18)); // NOI18N

        cbCategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnSearch.setText("Search");

        javax.swing.GroupLayout pnlHeaderWriterLayout = new javax.swing.GroupLayout(pnlHeaderWriter);
        pnlHeaderWriter.setLayout(pnlHeaderWriterLayout);
        pnlHeaderWriterLayout.setHorizontalGroup(
            pnlHeaderWriterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );
        pnlHeaderWriterLayout.setVerticalGroup(
            pnlHeaderWriterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnlHeaderAdminLayout = new javax.swing.GroupLayout(pnlHeaderAdmin);
        pnlHeaderAdmin.setLayout(pnlHeaderAdminLayout);
        pnlHeaderAdminLayout.setHorizontalGroup(
            pnlHeaderAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );
        pnlHeaderAdminLayout.setVerticalGroup(
            pnlHeaderAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnlHeaderLayout = new javax.swing.GroupLayout(pnlHeader);
        pnlHeader.setLayout(pnlHeaderLayout);
        pnlHeaderLayout.setHorizontalGroup(
            pnlHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHeaderLayout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addComponent(pnlHeaderWriter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(401, 401, 401)
                .addGroup(pnlHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 394, Short.MAX_VALUE)
                .addComponent(pnlHeaderAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(125, 125, 125))
        );
        pnlHeaderLayout.setVerticalGroup(
            pnlHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlHeaderAdmin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlHeaderLayout.createSequentialGroup()
                .addGroup(pnlHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlHeaderLayout.createSequentialGroup()
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSearch, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE))
                    .addComponent(pnlHeaderWriter, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout pnlAllArticlesLayout = new javax.swing.GroupLayout(pnlAllArticles);
        pnlAllArticles.setLayout(pnlAllArticlesLayout);
        pnlAllArticlesLayout.setHorizontalGroup(
            pnlAllArticlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1833, Short.MAX_VALUE)
        );
        pnlAllArticlesLayout.setVerticalGroup(
            pnlAllArticlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 928, Short.MAX_VALUE)
        );

        pnlArticles.setViewportView(pnlAllArticles);

        btnLogin.setText("Login");

        btnHome.setText("Home Page");

        lblUser.setFont(new java.awt.Font("DejaVu Sans", 0, 16)); // NOI18N
        lblUser.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblUser.setText("Gost");

        meAdmin.setText("Admin");

        jMenuItem1.setText("jMenuItem1");
        meAdmin.add(jMenuItem1);

        jMenuItem2.setText("jMenuItem2");
        meAdmin.add(jMenuItem2);

        jMenuItem3.setText("jMenuItem3");
        meAdmin.add(jMenuItem3);

        jMenuItem4.setText("jMenuItem4");
        meAdmin.add(jMenuItem4);

        menu.add(meAdmin);

        mePisac.setText("Pisac");

        jMenuItem5.setText("jMenuItem5");
        mePisac.add(jMenuItem5);

        jMenuItem6.setText("jMenuItem6");
        mePisac.add(jMenuItem6);

        menu.add(mePisac);

        setJMenuBar(menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblUser, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pnlHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlArticles, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUser)
                    .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlArticles, javax.swing.GroupLayout.DEFAULT_SIZE, 690, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnSearch;
    private javax.swing.JComboBox<String> cbCategory;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JLabel lblUser;
    private javax.swing.JMenu meAdmin;
    private javax.swing.JMenu mePisac;
    private javax.swing.JMenuBar menu;
    private javax.swing.JPanel pnlAllArticles;
    private javax.swing.JScrollPane pnlArticles;
    private javax.swing.JPanel pnlHeader;
    private javax.swing.JPanel pnlHeaderAdmin;
    private javax.swing.JPanel pnlHeaderWriter;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables

    public javax.swing.JButton getBtnHome() {
        return btnHome;
    }

    public javax.swing.JButton getBtnLogin() {
        return btnLogin;
    }

    public javax.swing.JButton getBtnSearch() {
        return btnSearch;
    }

    public javax.swing.JComboBox<String> getCbCategory() {
        return cbCategory;
    }

    public javax.swing.JLabel getLblUser() {
        return lblUser;
    }

    public javax.swing.JPanel getPnlAllArticles() {
        return pnlAllArticles;
    }

    public javax.swing.JScrollPane getPnlArticles() {
        return pnlArticles;
    }

    public javax.swing.JPanel getPnlHeader() {
        return pnlHeader;
    }

    public javax.swing.JPanel getPnlHeaderAdmin() {
        return pnlHeaderAdmin;
    }

    public javax.swing.JPanel getPnlHeaderWriter() {
        return pnlHeaderWriter;
    }

    public javax.swing.JTextField getTxtSearch() {
        return txtSearch;
    }

    public javax.swing.JMenu getMeAdmin() {
        return meAdmin;
    }

    public void setMeAdmin(javax.swing.JMenu meAdmin) {
        this.meAdmin = meAdmin;
    }

    public javax.swing.JMenu getMePisac() {
        return mePisac;
    }

    public void setMePisac(javax.swing.JMenu mePisac) {
        this.mePisac = mePisac;
    }

    public javax.swing.JMenuBar getMenu() {
        return menu;
    }

    public void setMenu(javax.swing.JMenuBar menu) {
        this.menu = menu;
    }
    
    
}

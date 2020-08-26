/*
 * Copyright (C) 2017 chcan
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package controlador.editores;

import controlador.Editor;
import diagramas.logico.Campo;
import diagramas.logico.DiagramaLogico;
import diagramas.logico.Tabela;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.ItemEvent;
import java.util.ArrayList;
import java.util.List;
import principal.Aplicacao;

/**
 *
 * @author chcan
 */
public class EditorDeCampos extends javax.swing.JDialog {

    /**
     * Creates new form EditorDeCampos
     */
    public EditorDeCampos(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblTabelas = new javax.swing.JLabel();
        comboTabelas = new javax.swing.JComboBox<>();
        jToolBar1 = new javax.swing.JToolBar();
        Adicionar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        Adbtxt = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Principal = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnPronto = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("principal/Formularios_pt_BR"); // NOI18N
        setTitle(bundle.getString("EditorDeCampos.title")); // NOI18N

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(bundle.getString("EditorDeCampos.tituloTabela"))); // NOI18N

        lblTabelas.setText(bundle.getString("EditorDeCampos.Tabela.selecionada")); // NOI18N

        comboTabelas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTabelas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(comboTabelas, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(198, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(lblTabelas)
                .addComponent(comboTabelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);

        Adicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/mais.png"))); // NOI18N
        Adicionar.setText(bundle.getString("EditorDeCampos.Adicionar.Campo")); // NOI18N
        Adicionar.setFocusable(false);
        Adicionar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        Adicionar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Adicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdicionarActionPerformed(evt);
            }
        });
        jToolBar1.add(Adicionar);
        jToolBar1.add(jSeparator1);

        Adbtxt.setText(bundle.getString("EditorDeCampos.Adicionar.Campo.Serie")); // NOI18N
        Adbtxt.setToolTipText(bundle.getString("EditorDeCampos.tooltip.edt_campos")); // NOI18N
        Adbtxt.setFocusable(false);
        Adbtxt.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        Adbtxt.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Adbtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdbtxtActionPerformed(evt);
            }
        });
        jToolBar1.add(Adbtxt);

        Principal.setBackground(new java.awt.Color(204, 204, 204));
        Principal.setLayout(null);
        jScrollPane1.setViewportView(Principal);

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnPronto.setText(bundle.getString("EditorDeCampos.Fechar")); // NOI18N
        btnPronto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProntoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnPronto)
                .addGap(2, 2, 2))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(btnPronto))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 353, Short.MAX_VALUE)
                .addGap(1, 1, 1)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnProntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProntoActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnProntoActionPerformed

    int v = 0;

    private void AdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdicionarActionPerformed
        Campo c = getSelecionada().Add(Editor.fromConfiguracao.getValor("diagrama.Campo.nome"));
        //c.setTexto(Editor.fromConfiguracao.getValor("diagrama.Campo.nome"));
        AdicionarPainel(c);
        getSelecionada().DoMuda();
    }//GEN-LAST:event_AdicionarActionPerformed

    private void AdbtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdbtxtActionPerformed
        String txt = util.Dialogos.ShowDlgTexto(Aplicacao.fmPrincipal.getRootPane(), "");
        if (txt.isEmpty()) {
            return;
        }
        String[] lst = txt.split("\n");
        for (String a : lst) {
            a = a.trim();
            String tipo = "";
            String comp = "";
            if (!a.isEmpty()) {
                if (a.contains(" ")) {
                    String[] ct = a.replaceAll(" +", " ").split(" ");
                    a = ct[0];
                    tipo = ct[1];
                    for (int i = 2; i < ct.length; i++) comp += " " + ct[i];
                }
                Campo c = getSelecionada().Add(a);
                c.setTexto(a);
                if (!tipo.isEmpty()) c.setTipo(tipo);
                if (!comp.isEmpty()) c.setComplemento(comp.trim());
            }
        }
        getSelecionada().DoMuda();
        Popule(getSelecionada());
    }//GEN-LAST:event_AdbtxtActionPerformed

    private int largura = 0;
    
    public void AdicionarPainel(Campo cmp) {
        javax.swing.JPanel ItemPan = new javax.swing.JPanel();
        final int altura = 37;

        ItemPan.setSize(largura, altura);
        java.awt.FlowLayout lay = new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 10, 5);
        ItemPan.setLayout(lay);

        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("principal/Formularios_pt_BR");
        javax.swing.JCheckBox chkpk = new javax.swing.JCheckBox();
        javax.swing.JCheckBox chkfk = new javax.swing.JCheckBox();
        javax.swing.JTextField txtNome = new javax.swing.JTextField();
        javax.swing.JLabel lblNome = new javax.swing.JLabel();
        javax.swing.JComboBox<String> comboTipo = new javax.swing.JComboBox<>();
        javax.swing.JLabel lblTipo = new javax.swing.JLabel();
        javax.swing.JButton btnExcluir = new javax.swing.JButton();
        javax.swing.JCheckBox chUnique = new javax.swing.JCheckBox();
        

        lblNome.setText(bundle.getString("EditorDeCampos.lblCampo")); // NOI18N
        lblNome.setSize(new Dimension(37, 14));
        ItemPan.add(lblNome);

        txtNome.setToolTipText("");
        txtNome.setPreferredSize(new Dimension(190, 20));
        ItemPan.add(txtNome);
        
        lblTipo.setText(bundle.getString("EditorDeCampos.lblTipo")); // NOI18N
        lblTipo.setSize(new Dimension(24, 14));
        ItemPan.add(lblTipo);

        comboTipo.setEditable(true);
        String tipo_txt = cmp.getTipo();
        if (!tipo_txt.trim().isEmpty() && tipos.indexOf(tipo_txt) < 0) {
            tipos.add(tipo_txt);
        }
        comboTipo.setModel(new javax.swing.DefaultComboBoxModel(tipos.toArray()));
        comboTipo.setPreferredSize(new Dimension(73, 20));
        ItemPan.add(comboTipo);
        
        chkpk.setText(bundle.getString("EditorDeCampos.chkPK")); // NOI18N
        chkpk.setSize(new Dimension(97, 23));
        ItemPan.add(chkpk);

        chkfk.setText(bundle.getString("EditorDeCampos.chkFK")); // NOI18N
        chkfk.setSize(new Dimension(115, 23));
        ItemPan.add(chkfk);
        
        chUnique.setText(bundle.getString("EditorDeIR.chkUNIQUE")); // NOI18N
        chUnique.setSize(new Dimension(51, 23));
        ItemPan.add(chUnique);

        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/excluir.png"))); // NOI18N
        btnExcluir.setToolTipText(bundle.getString("EditorDeCampos.tooltip.excluir")); // NOI18N
        ItemPan.add(btnExcluir);
        btnExcluir.setPreferredSize(new Dimension(49, 25));

        Principal.add(ItemPan);
        if (largura == 0) {
            largura = lay.preferredLayoutSize(ItemPan).width;
        }
        ItemPan.setBounds(0, v, largura, altura);
        v += altura + 3;
        Principal.setPreferredSize(new Dimension(largura, v));
        
        txtNome.setText(cmp.getTexto());
        chkfk.setSelected(cmp.isFkey());
        chkpk.setSelected(cmp.isKey());
        comboTipo.setSelectedItem(tipo_txt);
        chUnique.setSelected(cmp.isUnique());
        
        btnExcluir.addActionListener((java.awt.event.ActionEvent evt) -> {
            cmp.getTabela().RemoveCampo(cmp);
            ItemPan.setEnabled(false);
            txtNome.setEnabled(false);
            comboTipo.setEnabled(false);
            chkfk.setEnabled(false);
            chkpk.setEnabled(false);
            lblNome.setEnabled(false);
            lblTipo.setEnabled(false);
            chUnique.setEnabled(false);
            btnExcluir.setEnabled(false);
            ItemPan.setBackground(Color.lightGray);
        });

        chkfk.addItemListener((java.awt.event.ItemEvent evt) -> {
            if (cmp.isFkey() != chkfk.isSelected()) {
                cmp.setFkey(chkfk.isSelected());
                cmp.getTabela().DoMuda();
                cmp.InvalidateArea();
            }
        });

        chkpk.addItemListener((java.awt.event.ItemEvent evt) -> {
            if (cmp.isKey() != chkpk.isSelected()) {
                cmp.setKey(chkpk.isSelected());
                cmp.getTabela().DoMuda();
                cmp.InvalidateArea();
            }
        });

        chUnique.addItemListener((java.awt.event.ItemEvent evt) -> {
            if (cmp.isUnique()!= chUnique.isSelected()) {
                cmp.setUnique(chUnique.isSelected());
                cmp.getTabela().DoMuda();
                cmp.InvalidateArea();
            }
        });

        txtNome.addFocusListener(new FocusAdapter() {
            @Override
            public void focusLost(FocusEvent e) {
                if (!txtNome.getText().equals(cmp.getTexto())) {
                    cmp.setTexto(txtNome.getText());
                    cmp.getTabela().DoMuda();
                    cmp.InvalidateArea();
                }
            }
        });

        comboTipo.addActionListener((ActionEvent e) -> {
            String txt = comboTipo.getSelectedItem().toString();
            if (!txt.equals(cmp.getTipo())) {
                cmp.setTipo(txt);
                cmp.getTabela().DoMuda();
                cmp.InvalidateArea();
                if (tipos.indexOf(txt) < 0) {
                    tipos.add(0, txt);
                }
            }
        });

        comboTipo.getEditor().addActionListener((ActionEvent e) -> {
            String txt = comboTipo.getSelectedItem().toString();
            if (!txt.equals(cmp.getTipo())) {
                cmp.setTipo(txt);
                cmp.getTabela().DoMuda();
                cmp.InvalidateArea();
                if (tipos.indexOf(txt) < 0) {
                    tipos.add(0, txt);
                }
            }
        });
        
        comboTipo.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            @Override
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
                comboTipo.setSelectedItem(cmp.getTipo());
            }

            @Override
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                comboTipo.setSelectedItem(cmp.getTipo());
            }

            @Override
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                comboTipo.setModel(new javax.swing.DefaultComboBoxModel(tipos.toArray()));
            }
        });


        ItemPan.validate();
        Principal.validate();
    }

    ArrayList<String> tipos = new ArrayList<>();


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Adbtxt;
    private javax.swing.JButton Adicionar;
    private javax.swing.JPanel Principal;
    private javax.swing.JButton btnPronto;
    private javax.swing.JComboBox<String> comboTabelas;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel lblTabelas;
    // End of variables declaration//GEN-END:variables

    DiagramaLogico diagrama = null;
    List<Tabela> tabelas = null;

    public void Inicie(DiagramaLogico diag) {
        diagrama = diag;
        comboTabelas.removeAllItems();
        tabelas = diagrama.getListaDeTabelas();
        Tabela sel = (diag.getSelecionado() instanceof Tabela ? (Tabela) diag.getSelecionado() : null);
        int idx = 0;
        for (int i = 0; i < tabelas.size(); i++) {
            Tabela t = tabelas.get(i);
            comboTabelas.addItem(String.valueOf(i + 1) + " - " + t.getTexto());
            
            t.getCampos().forEach(c -> {
                String tp = c.getTipo();
                if (!tp.isEmpty() && tipos.indexOf(tp) < 0) {
                    tipos.add(tp);
                }
            });
            
            if (t == sel) {
                idx = i;
            }
        }
        sel = tabelas.get(idx);

        tipos.addAll(diag.getDataModel().getDataTypes());
        
        comboTabelas.setSelectedIndex(idx);

        comboTabelas.addItemListener((ItemEvent e) -> {
            if (e.getStateChange() == ItemEvent.SELECTED) {
                setSelecionada(tabelas.get(comboTabelas.getSelectedIndex()));
            }
        });

        setSelecionada(sel);
    }

    private Tabela selecionada = null;

    public Tabela getSelecionada() {
        return selecionada;
    }

    public void setSelecionada(Tabela selecionada) {
        if (this.selecionada != selecionada) {
            this.selecionada = selecionada;
            Popule(selecionada);
        }
    }

    private void Popule(Tabela sel) {
        Principal.removeAll();
        Principal.validate();
        v = 0;
        sel.getCampos().stream().forEach(c -> AdicionarPainel(c));
        Principal.repaint();
    }
}
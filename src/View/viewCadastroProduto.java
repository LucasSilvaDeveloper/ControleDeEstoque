/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

 
import Controller.produtoController;
import Model.ProdutoTableModel;
import Util.ValidaNome;
import Util.ValidaNumero;
import java.awt.Color;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.SpinnerNumberModel;
import javax.swing.table.TableRowSorter;



/**
 *
 * @author lucas
 */
public class viewCadastroProduto extends javax.swing.JFrame{

    /**
     * Creates new form viewCadastroCliente
     */
    ProdutoTableModel tableModel = new ProdutoTableModel();
    boolean valor = false;
    
    public viewCadastroProduto() {
        initComponents();
        campoNovo();
        jtProduto.setModel(tableModel);
        carregaDadosBanco();
        txtId.setDocument(new ValidaNumero());
        txtQuantidade.setDocument(new ValidaNumero());
        txtNomeProduto.setDocument(new ValidaNome());
        jtProduto.setRowSorter(new TableRowSorter(tableModel));
    }

   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        txtNomeProduto = new javax.swing.JTextField();
        txtId = new javax.swing.JTextField();
        txtQuantidade = new javax.swing.JTextField();
        jDate = new com.toedter.calendar.JDateChooser();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtaDescricaoProduto = new javax.swing.JTextArea();
        btnSalvar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtProduto = new javax.swing.JTable();
        btnNovo = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        txtPesquisar = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtId.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtIdFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtIdFocusLost(evt);
            }
        });
        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNomeProduto)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 245, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel4.setText("Data da compra:");

        jLabel3.setText("Quantidade:");

        jLabel2.setText("Nome:");

        jLabel5.setText("Codigo:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(0, 24, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Descrição"));

        jtaDescricaoProduto.setColumns(20);
        jtaDescricaoProduto.setRows(2);
        jtaDescricaoProduto.setName(""); // NOI18N
        jScrollPane1.setViewportView(jtaDescricaoProduto);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        jtProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jtProduto.setFocusable(false);
        jtProduto.setGridColor(new java.awt.Color(255, 255, 255));
        jtProduto.setSelectionBackground(new java.awt.Color(226, 198, 255));
        jtProduto.getTableHeader().setResizingAllowed(false);
        jtProduto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtProdutoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtProdutoFocusLost(evt);
            }
        });
        jtProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtProdutoMouseClicked(evt);
            }
        });
        jtProduto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtProdutoKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtProdutoKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(jtProduto);

        btnNovo.setText("Novo");
        btnNovo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                btnNovoFocusLost(evt);
            }
        });
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        txtPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesquisarActionPerformed(evt);
            }
        });
        txtPesquisar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPesquisarKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPesquisarKeyReleased(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Pesquisar por Nome");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnNovo)
                        .addGap(18, 18, 18)
                        .addComponent(btnSalvar)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancelar)
                        .addGap(18, 18, 18)
                        .addComponent(btnEditar))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(btnExcluir))
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
   
    }//GEN-LAST:event_formWindowClosing

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
      
    }//GEN-LAST:event_formWindowClosed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
            // o -1 informa se a linha esta celecionada ou nao
        if(jtProduto.getSelectedRow() != -1){
            produtoController novo = new produtoController();
            novo.deletar((int) jtProduto.getValueAt(jtProduto.getSelectedRow(),0));
            carregaDadosBanco();
        }
        else{
            JOptionPane.showMessageDialog(this,"Selecione um produto para excluir!");
        }
        btnEditar.setEnabled(false);
        btnExcluir.setEnabled(false);
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed

        
        if(naoCampoVazio() && validaDate()){
            
            SimpleDateFormat dt = new SimpleDateFormat("dd/MM/YYYY");
           
            produtoController novo = new produtoController();
                
            if(valor){
                novo.novoProduto(
                    Integer.parseInt(txtId.getText()),
                    txtNomeProduto.getText(),
                    Integer.parseInt(txtQuantidade.getText()),
                    String.valueOf(dt.format(jDate.getDate())),
                    jtaDescricaoProduto.getText());
              
                limpaTela();
                carregaDadosBanco();
            }else{
                novo.atualizarProduto(
                    Integer.parseInt(txtId.getText()),
                        txtNomeProduto.getText(),
                        Integer.parseInt(txtQuantidade.getText()),
                        String.valueOf(dt.format(jDate.getDate())),
                        jtaDescricaoProduto.getText());
            
                limpaTela();
                carregaDadosBanco();
            }
        
            jtProduto.setEnabled(true);        
            btnSalvar.setEnabled(false);
            btnCancelar.setEnabled(false);
            btnNovo.setEnabled(true);
        
           txtId.setEnabled(false);
           txtNomeProduto.setEnabled(false);
           txtQuantidade.setEnabled(false);
           jDate.setEnabled(false);

        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        
        valor = true;
        
        btnSalvar.setEnabled(true);
        btnCancelar.setEnabled(true);
        btnNovo.setEnabled(false);
        btnEditar.setEnabled(false);
        btnExcluir.setEnabled(false);
        jtProduto.setEnabled(false);
        jtProduto.clearSelection();
        
        
        txtId.setEnabled(true);
        txtNomeProduto.setEnabled(true);
        txtQuantidade.setEnabled(true);
        jDate.setEnabled(true);
        
        jtaDescricaoProduto.setEnabled(true);
        jtaDescricaoProduto.setBackground(Color.white);
        txtId.requestFocus();
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        btnSalvar.setEnabled(false);
        btnNovo.setEnabled(true);
        btnCancelar.setEnabled(false);
        jtProduto.setEnabled(true);
        
        txtId.setEnabled(false);
        txtNomeProduto.setEnabled(false);
        txtQuantidade.setEnabled(false);
        jDate.setEnabled(false);
        jtaDescricaoProduto.setEnabled(false);
        jtaDescricaoProduto.setBackground(Color.getColor(btnCancelar.DISABLED_ICON_CHANGED_PROPERTY));
        
        jtProduto.clearSelection();
        limpaTela();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtPesquisarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisarKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPesquisarKeyPressed

    private void txtPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesquisarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPesquisarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed

        valor = false;
        
        btnSalvar.setEnabled(true);
        btnCancelar.setEnabled(true);
        btnNovo.setEnabled(false);
        btnEditar.setEnabled(false);
        btnExcluir.setEnabled(false);
        
        txtId.setEnabled(false);
        txtNomeProduto.setEnabled(true);
        txtQuantidade.setEnabled(true);
        jDate.setEnabled(true);
        
        jtaDescricaoProduto.setEnabled(true);
        jtaDescricaoProduto.setBackground(Color.white);
        
        txtId.setText(jtProduto.getValueAt(jtProduto.getSelectedRow(), 0).toString());
        txtNomeProduto.setText(jtProduto.getValueAt(jtProduto.getSelectedRow(), 1).toString());
        txtQuantidade.setText(jtProduto.getValueAt(jtProduto.getSelectedRow(), 2).toString());
        String a = jtProduto.getValueAt(jtProduto.getSelectedRow(), 3).toString();
        System.out.println(a);
        //aqui esta com erro na data quando retorna do jtale para o jcalendar
  
//        SimpleDateFormat newdt = new SimpleDateFormat("dd/MM/YYYY");
////        newdt.setDateFormatSymbols(a);
        
//        try {
//            Date nova = new Date();
//            nova = newdt.parse(a);
//            jDate.setDate(nova);
//        } catch (ParseException ex) {
//            Logger.getLogger(viewCadastroProduto.class.getName()).log(Level.SEVERE, null, ex);
//        }
        

        
//        try {
//            jDate.setDate(newdt.parse(jtProduto.getValueAt(jtProduto.getSelectedRow(), 3).toString()));
//        } catch (ParseException ex) {
//            Logger.getLogger(viewCadastroProduto.class.getName()).log(Level.SEVERE, null, ex);
//        }
        
        jtaDescricaoProduto.setText(jtProduto.getValueAt(jtProduto.getSelectedRow(), 4).toString());
           
        txtNomeProduto.requestFocus();
        jtProduto.setEnabled(false);
        jtProduto.clearSelection();
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnNovoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnNovoFocusLost
             // TODO add your handling code here:
    }//GEN-LAST:event_btnNovoFocusLost

    private void txtIdFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtIdFocusGained
    }//GEN-LAST:event_txtIdFocusGained

    private void txtIdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtIdFocusLost
    }//GEN-LAST:event_txtIdFocusLost

    private void txtPesquisarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisarKeyReleased
        tableModel.retornoPesquisaProduto(txtPesquisar.getText());
    }//GEN-LAST:event_txtPesquisarKeyReleased

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void jtProdutoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtProdutoKeyReleased

    }//GEN-LAST:event_jtProdutoKeyReleased

    private void jtProdutoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtProdutoKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtProdutoKeyPressed

    private void jtProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtProdutoMouseClicked
        if(jtProduto.getSelectedRow() != -1){
            btnEditar.setEnabled(true);
            btnExcluir.setEnabled(true);
        }
    }//GEN-LAST:event_jtProdutoMouseClicked

    private void jtProdutoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtProdutoFocusLost

    }//GEN-LAST:event_jtProdutoFocusLost

    private void jtProdutoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtProdutoFocusGained
        if(btnEditar.isValid()){
            System.out.println("teste");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jtProdutoFocusGained
 
    private void campoNovo(){
        btnNovo.setEnabled(true);
        btnSalvar.setEnabled(false);
        btnCancelar.setEnabled(false);
        btnEditar.setEnabled(false);
        btnExcluir.setEnabled(false);
        txtId.setEnabled(false);
        txtNomeProduto.setEnabled(false);
        txtQuantidade.setEnabled(false);
        jDate.setEnabled(false);
        jtaDescricaoProduto.setEnabled(false);
        jtaDescricaoProduto.setBackground(Color.getColor(btnCancelar.DISABLED_ICON_CHANGED_PROPERTY));
    }
    
    private void limpaTela(){
        txtId.setText("");
        txtNomeProduto.setText("");
        txtQuantidade.setText("");
        jDate.setDate(null);
        jtaDescricaoProduto.setText("");
    }
    
    private void carregaDadosBanco(){
        tableModel.listarProdutos();
    }
    
    private void maskSpinner(){
        SpinnerNumberModel novo = new SpinnerNumberModel();
        
        novo.setMinimum(0);
        novo.setMaximum(1000);
        novo.setStepSize(1);
    }
    
    public boolean validaDate(){
        boolean checkData = false;
        
        if(jDate.getDate()==null){
            JOptionPane.showMessageDialog(this, "insira uma data por gentileza!"); 
        }   
        else{
            checkData = true;
        }
        return checkData;
    }
    
    private boolean naoCampoVazio(){
        boolean campo = false;
        if(txtId.getText().equals("") || txtNomeProduto.getText().equals("") || txtQuantidade.getText().equals("")){
            campo = false;
            JOptionPane.showMessageDialog(null, "Por gentileza preencha todos os campos!");
        }
        else{
            campo =  true;
        }
        return campo;
    }

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            System.out.println("ERRO: " + ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new viewCadastroProduto().setVisible(true);
               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnSalvar;
    private com.toedter.calendar.JDateChooser jDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jtProduto;
    private javax.swing.JTextArea jtaDescricaoProduto;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNomeProduto;
    private javax.swing.JTextField txtPesquisar;
    private javax.swing.JTextField txtQuantidade;
    // End of variables declaration//GEN-END:variables

}

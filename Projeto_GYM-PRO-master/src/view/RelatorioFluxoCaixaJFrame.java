/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import projeto_gym.pro.Util;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import fachada.Fachada;
import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Date;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import model.ControleFinanceiro;
import model.ModeloTabela;

/**
 *
 * @author Insinuante
 */
public class RelatorioFluxoCaixaJFrame extends javax.swing.JFrame {
    ArrayList<ControleFinanceiro> financeiro;
    /**
     * Creates new form NewJFrameLogin
     */
    public RelatorioFluxoCaixaJFrame() {
        Util.lookAndFeel();
        initComponents();
        financeiro = Fachada.getInstance().getAllControleFinanceiro();
        carregarTabelar(financeiro);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanelBlue = new javax.swing.JPanel();
        cabjLabe = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        alunoCredjTable = new javax.swing.JTable();
        gerarPDFjButton = new javax.swing.JButton();
        jComboBoxServico1 = new javax.swing.JComboBox<>();
        jLabelSexo = new javax.swing.JLabel();
        jLabelHa = new javax.swing.JLabel();
        jLabelPeriodo = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabelConfig = new javax.swing.JLabel();
        pDoisjDateChooser = new com.toedter.calendar.JDateChooser();
        pUmjDateChooser = new com.toedter.calendar.JDateChooser();
        refresh = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Fluxo do caixa");
        setExtendedState(6);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanelBlue.setBackground(new java.awt.Color(45, 118, 232));

        cabjLabe.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 36)); // NOI18N
        cabjLabe.setForeground(new java.awt.Color(255, 255, 255));
        cabjLabe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/list_white.png"))); // NOI18N
        cabjLabe.setText(" Fluxo do caixa");

        javax.swing.GroupLayout jPanelBlueLayout = new javax.swing.GroupLayout(jPanelBlue);
        jPanelBlue.setLayout(jPanelBlueLayout);
        jPanelBlueLayout.setHorizontalGroup(
            jPanelBlueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBlueLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(cabjLabe)
                .addContainerGap(888, Short.MAX_VALUE))
        );
        jPanelBlueLayout.setVerticalGroup(
            jPanelBlueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBlueLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(cabjLabe)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        alunoCredjTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id", "Data", "Descri????o", "H??storico", "Valor"
            }
        ));
        jScrollPane1.setViewportView(alunoCredjTable);

        gerarPDFjButton.setBackground(new java.awt.Color(45, 118, 232));
        gerarPDFjButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        gerarPDFjButton.setForeground(new java.awt.Color(255, 255, 255));
        gerarPDFjButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8_Download_25px.png"))); // NOI18N
        gerarPDFjButton.setText(" Gerar Relat??rio ");
        gerarPDFjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gerarPDFjButtonActionPerformed(evt);
            }
        });

        jComboBoxServico1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jComboBoxServico1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Entradas", "Sa??das" }));
        jComboBoxServico1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxServico1ActionPerformed(evt);
            }
        });

        jLabelSexo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabelSexo.setForeground(new java.awt.Color(45, 118, 232));
        jLabelSexo.setText("Mostrar");

        jLabelHa.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabelHa.setForeground(new java.awt.Color(45, 118, 232));
        jLabelHa.setText("a");

        jLabelPeriodo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabelPeriodo.setForeground(new java.awt.Color(45, 118, 232));
        jLabelPeriodo.setText("Per??odo");

        jLabelConfig.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabelConfig.setForeground(new java.awt.Color(45, 118, 232));
        jLabelConfig.setText("Filtros");

        pDoisjDateChooser.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        pUmjDateChooser.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        refresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8_Refresh_25px.png"))); // NOI18N
        refresh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                refreshMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBlue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(100, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 1070, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(gerarPDFjButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(refresh, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelConfig)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 1025, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabelPeriodo)
                                        .addGap(18, 18, 18)
                                        .addComponent(pUmjDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabelHa, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(pDoisjDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabelSexo)
                                        .addGap(18, 18, 18)
                                        .addComponent(jComboBoxServico1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(7, 7, 7)))))
                .addContainerGap(100, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanelBlue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelConfig, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelPeriodo)
                            .addComponent(jLabelHa))
                        .addGap(25, 25, 25))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(pDoisjDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pUmjDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxServico1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(refresh))
                .addGap(25, 25, 25)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(gerarPDFjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
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

        setSize(new java.awt.Dimension(1286, 745));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void gerarPDFjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gerarPDFjButtonActionPerformed
        gerarPDF(Fachada.getInstance().getAllControleFinanceiro());
    }//GEN-LAST:event_gerarPDFjButtonActionPerformed

    private void jComboBoxServico1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxServico1ActionPerformed
        
    }//GEN-LAST:event_jComboBoxServico1ActionPerformed

    private void refreshMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshMouseClicked
        if(pUmjDateChooser.getDate()==null && pDoisjDateChooser.getDate()==null)
            carregarTabelar(financeiro);
        else if(pUmjDateChooser.getDate()!=null && pDoisjDateChooser.getDate()!=null){
            Date d1 = Util.converterCalendarToDate2(pUmjDateChooser.getCalendar());
            Date d2 =  Util.converterCalendarToDate2(pDoisjDateChooser.getCalendar());   
            carregarTabelar(Fachada.getInstance().getBuscaControleFinanceiro(d1,d2));
        }else
            Mensagem.exibirMensagem("?? preciso preencher os dois campos de datas!");
    }//GEN-LAST:event_refreshMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable alunoCredjTable;
    private javax.swing.JLabel cabjLabe;
    private javax.swing.JButton gerarPDFjButton;
    private javax.swing.JComboBox<String> jComboBoxServico1;
    private javax.swing.JLabel jLabelConfig;
    private javax.swing.JLabel jLabelHa;
    private javax.swing.JLabel jLabelPeriodo;
    private javax.swing.JLabel jLabelSexo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelBlue;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private com.toedter.calendar.JDateChooser pDoisjDateChooser;
    private com.toedter.calendar.JDateChooser pUmjDateChooser;
    private javax.swing.JLabel refresh;
    // End of variables declaration//GEN-END:variables
    
        private void carregarTabelar(ArrayList<ControleFinanceiro> financeiro){
        String [] colunas = {"ID","Data","Historico","Descri????o","Valor"};
        ArrayList<Object[]> dados = new ArrayList<>();
        for(ControleFinanceiro c : financeiro){
            if("Todos".equals(jComboBoxServico1.getSelectedItem()+"")){
                 dados.add(new Object[]{c.getId(),c.getData(),c.getConta().getDescricao(),
                      c.getDescricao(),c.getValor()});
            }else if("Entradas".equals(jComboBoxServico1.getSelectedItem()+"")){
                if(c.getConta().getTipo().equals("Cr??dito"))
                    dados.add(new Object[]{c.getId(),c.getData(),c.getConta().getDescricao(),
                      c.getDescricao(),c.getValor()});
            }else{
                if(c.getConta().getTipo().equals("D??bito")){
                        dados.add(new Object[]{c.getId(),c.getData(),c.getConta().getDescricao(),
                        c.getDescricao(),c.getValor()});  
               } 
                  
            }
        }
        ModeloTabela modelo = new ModeloTabela(dados, colunas);
        alunoCredjTable.setModel(modelo);
        
        alunoCredjTable.getColumnModel().getColumn(0).setPreferredWidth(80);
        alunoCredjTable.getColumnModel().getColumn(0).setResizable(false);
        alunoCredjTable.getColumnModel().getColumn(1).setPreferredWidth(130);
        alunoCredjTable.getColumnModel().getColumn(1).setResizable(false);
        alunoCredjTable.getColumnModel().getColumn(2).setPreferredWidth(290);
        alunoCredjTable.getColumnModel().getColumn(2).setResizable(false);
        alunoCredjTable.getColumnModel().getColumn(3).setPreferredWidth(390);
        alunoCredjTable.getColumnModel().getColumn(3).setResizable(false);
        alunoCredjTable.getColumnModel().getColumn(4).setPreferredWidth(176);
        alunoCredjTable.getColumnModel().getColumn(4).setResizable(false);
        
        alunoCredjTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);    
    }

    public void gerarPDF(ArrayList<ControleFinanceiro> financeiro){
        Document doc = new Document();
        String end = "";
        try {
            end = AlunosFichaExercicioJFrame.salvarcomo(this);
            PdfWriter.getInstance(doc, new FileOutputStream(end+"/Relatorio do Fluxo do caixa.pdf"));
            
            Font fontCab = new Font(Font.FontFamily.TIMES_ROMAN,14,Font.BOLD,BaseColor.BLACK);
            Font fontTexto = new Font(Font.FontFamily.TIMES_ROMAN,12,Font.NORMAL,BaseColor.BLACK);
            PdfPTable table = new PdfPTable(5);
            
            table.addCell(new Paragraph("Id", fontTexto));
            table.addCell(new Paragraph("Data", fontTexto));
            table.addCell(new Paragraph("H??storico", fontTexto));
            table.addCell(new Paragraph("Descri????o", fontTexto));
            table.addCell(new Paragraph("Valor", fontTexto));
            
            ArrayList<ControleFinanceiro> financeiroLista = new ArrayList<>();
            
            for(ControleFinanceiro c : financeiro){
                financeiroLista.add(c);
            }
            
            for(ControleFinanceiro c : financeiroLista){
                table.addCell(new Paragraph(""+c.getId(), fontTexto));
                table.addCell(new Paragraph(""+c.getData(), fontTexto));                
                table.addCell(new Paragraph(""+c.getDescricao(), fontTexto));  
                table.addCell(new Paragraph(""+c.getConta().getDescricao(), fontTexto));              
                table.addCell(new Paragraph(""+c.getValor(), fontTexto));
            }
                     
            doc.open();            
            doc.add(new Paragraph(Util.getDatasRel(new java.util.Date()),fontTexto));
            doc.add(new Paragraph("GYM - Relatorio do Fluxo do caixa\n\n",fontCab));
            doc.add(table);
            
            
        } catch (FileNotFoundException | DocumentException ex) {
            Logger.getLogger(RelatoriListaFunJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            doc.close();
        }
        
        try {
            Desktop.getDesktop().open(new File(end+"/Relatorio do Fluxo do caixa.pdf"));
        } catch (IOException ex) {
            Logger.getLogger(RelatoriListaFunJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}

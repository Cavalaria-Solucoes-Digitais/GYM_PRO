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
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import model.ModeloTabela;
import model.Parcelas;

/**
 *
 * @author Insinuante
 */
public class RelatorioListaDebitoJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrameLogin
     */
    public RelatorioListaDebitoJFrame() {
        Util.lookAndFeel();
        initComponents();
        preencherTabela(Fachada.getInstance().getParcelasVencidas());
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
        jLabelProcurar = new javax.swing.JLabel();
        jTextFieldProcurar = new javax.swing.JTextField();
        jLabelIconPesquisar = new javax.swing.JLabel();
        jComboBoxPeriodo = new javax.swing.JComboBox<>();
        jLabelProcurar1 = new javax.swing.JLabel();
        jDateChooserDataInicio = new com.toedter.calendar.JDateChooser();
        jDateChooserDataFim = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Lista de Alunos");
        setExtendedState(6);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanelBlue.setBackground(new java.awt.Color(45, 118, 232));

        cabjLabe.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 36)); // NOI18N
        cabjLabe.setForeground(new java.awt.Color(255, 255, 255));
        cabjLabe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/list_white.png"))); // NOI18N
        cabjLabe.setText(" Parcelas em d??bito");

        javax.swing.GroupLayout jPanelBlueLayout = new javax.swing.GroupLayout(jPanelBlue);
        jPanelBlue.setLayout(jPanelBlueLayout);
        jPanelBlueLayout.setHorizontalGroup(
            jPanelBlueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBlueLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(cabjLabe)
                .addContainerGap(809, Short.MAX_VALUE))
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
                "Id", "Nome", "Parcelas", "Valor", "Celular"
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

        jLabelProcurar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabelProcurar.setForeground(new java.awt.Color(45, 118, 232));
        jLabelProcurar.setText("Procurar");

        jTextFieldProcurar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldProcurarActionPerformed(evt);
            }
        });
        jTextFieldProcurar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldProcurarKeyReleased(evt);
            }
        });

        jLabelIconPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8_Search_20px_2.png"))); // NOI18N
        jLabelIconPesquisar.setToolTipText("Pesquisar");
        jLabelIconPesquisar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelIconPesquisarMouseClicked(evt);
            }
        });

        jComboBoxPeriodo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Semanal", "Mensal", "Trimestral", "Semestral", "Anual", "Personalizado" }));
        jComboBoxPeriodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxPeriodoActionPerformed(evt);
            }
        });

        jLabelProcurar1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabelProcurar1.setForeground(new java.awt.Color(45, 118, 232));
        jLabelProcurar1.setText("Per??odo");

        jDateChooserDataInicio.setEnabled(false);

        jDateChooserDataFim.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBlue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(178, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelProcurar)
                            .addComponent(jTextFieldProcurar, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelProcurar1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jComboBoxPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47)
                                .addComponent(jDateChooserDataInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jDateChooserDataFim, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabelIconPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 1070, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(gerarPDFjButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanelBlue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelProcurar)
                    .addComponent(jLabelProcurar1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelIconPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldProcurar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComboBoxPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jDateChooserDataInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jDateChooserDataFim, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 18, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(gerarPDFjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
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

        setSize(new java.awt.Dimension(1286, 750));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void gerarPDFjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gerarPDFjButtonActionPerformed
        gerarPDF(Fachada.getInstance().getParcelasVencidas());
    }//GEN-LAST:event_gerarPDFjButtonActionPerformed

    private void jTextFieldProcurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldProcurarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldProcurarActionPerformed

    private void jTextFieldProcurarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldProcurarKeyReleased
        String busca = this.jTextFieldProcurar.getText().toLowerCase();

        if (busca.trim().length() == 0)
            preencherTabela(Fachada.getInstance().getParcelasVencidas());
        else
            preencherTabela(Fachada.getInstance().getParcelasVencidasBusca(busca));
    }//GEN-LAST:event_jTextFieldProcurarKeyReleased

    private void jLabelIconPesquisarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelIconPesquisarMouseClicked
        String busca = this.jTextFieldProcurar.getText().toLowerCase();
        ArrayList <Parcelas> parcelas;
        if (busca.trim().length() == 0)
            parcelas = Fachada.getInstance().getParcelasVencidas();
        else
            parcelas = Fachada.getInstance().getParcelasVencidasBusca(busca);
        if(jComboBoxPeriodo.getSelectedItem().equals("Semanal")){
            ArrayList <Parcelas> p = new ArrayList<>();
            Calendar c = Calendar.getInstance();
            Calendar aux = Calendar.getInstance();
            for(Parcelas parc : parcelas){
                aux.setTime(parc.getData_de_Vencimento());
                if(aux.get(Calendar.WEEK_OF_YEAR) == c.get(Calendar.WEEK_OF_YEAR))
                    p.add(parc);
            }
            parcelas = p;
        }else{
           ArrayList <Parcelas> p = new ArrayList<>();
            Calendar aux = Calendar.getInstance();
            for(Parcelas parc : parcelas){
                aux.setTime(parc.getData_de_Vencimento());
                if(aux.getTime().after(jDateChooserDataInicio.getDate()) && aux.getTime().before(
                   jDateChooserDataFim.getDate()))
                    p.add(parc);
            }
            parcelas = p; 
        }
        preencherTabela(parcelas);
    }//GEN-LAST:event_jLabelIconPesquisarMouseClicked

    private void jComboBoxPeriodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxPeriodoActionPerformed
        if(jComboBoxPeriodo.getSelectedItem().equals("Personalizado")){
            jDateChooserDataFim.setEnabled(true);
            jDateChooserDataInicio.setEnabled(true);
            jDateChooserDataFim.setDate(null);
            jDateChooserDataInicio.setDate(null);
        }else{
            jDateChooserDataFim.setEnabled(false); 
            jDateChooserDataInicio.setEnabled(false);
            Calendar d1 = Calendar.getInstance();
            Calendar d2 = Calendar.getInstance();
            if(jComboBoxPeriodo.getSelectedItem().equals("Mensal")){
                d2.add(Calendar.MONTH, -1);

                jDateChooserDataFim.setDate(d1.getTime());
                jDateChooserDataInicio.setDate(d2.getTime());
            }else if(jComboBoxPeriodo.getSelectedItem().equals("Trimestral")){
                d2.add(Calendar.MONTH, -3);

                jDateChooserDataFim.setDate(d1.getTime());
                jDateChooserDataInicio.setDate(d2.getTime());
            }else if(jComboBoxPeriodo.getSelectedItem().equals("Semestral")){
                d2.add(Calendar.MONTH, -6);

                jDateChooserDataFim.setDate(d1.getTime());
                jDateChooserDataInicio.setDate(d2.getTime());
            }else if(jComboBoxPeriodo.getSelectedItem().equals("Anual")){
                d2.add(Calendar.MONTH, -12);

                jDateChooserDataFim.setDate(d1.getTime());
                jDateChooserDataInicio.setDate(d2.getTime());
            }
        }
    }//GEN-LAST:event_jComboBoxPeriodoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable alunoCredjTable;
    private javax.swing.JLabel cabjLabe;
    private javax.swing.JButton gerarPDFjButton;
    private javax.swing.JComboBox<String> jComboBoxPeriodo;
    private com.toedter.calendar.JDateChooser jDateChooserDataFim;
    private com.toedter.calendar.JDateChooser jDateChooserDataInicio;
    private javax.swing.JLabel jLabelIconPesquisar;
    private javax.swing.JLabel jLabelProcurar;
    private javax.swing.JLabel jLabelProcurar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelBlue;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextFieldProcurar;
    // End of variables declaration//GEN-END:variables

    public void preencherTabela(ArrayList<Parcelas> parcelas){
        String[] colunas = new String[]{"ID","NOME", "PARCELAS","VALOR", "DATA","CELULAR"};
        ArrayList<Object[]> dados = new ArrayList<>();
 
        for(Parcelas a : parcelas){
            dados.add(new Object[]{a.getId(),a.getAlunos().getNome(), a.getConta().getDescricao(), a.getValor(), 
                a.getData_de_Vencimento(),a.getAlunos().getCelular()});
        }
        
        ModeloTabela modeloTabela =  new ModeloTabela(dados, colunas);   
        alunoCredjTable.setModel(modeloTabela);      
        alunoCredjTable.getColumnModel().getColumn(0).setPreferredWidth(40);
        alunoCredjTable.getColumnModel().getColumn(0).setResizable(false);
        alunoCredjTable.getColumnModel().getColumn(1).setPreferredWidth(400);
        alunoCredjTable.getColumnModel().getColumn(1).setResizable(false);
        alunoCredjTable.getColumnModel().getColumn(2).setPreferredWidth(210);
        alunoCredjTable.getColumnModel().getColumn(2).setResizable(false);
        alunoCredjTable.getColumnModel().getColumn(3).setPreferredWidth(100);
        alunoCredjTable.getColumnModel().getColumn(3).setResizable(false);
        alunoCredjTable.getColumnModel().getColumn(4).setPreferredWidth(110);
        alunoCredjTable.getColumnModel().getColumn(4).setResizable(false);
        alunoCredjTable.getColumnModel().getColumn(5).setPreferredWidth(210);
        alunoCredjTable.getColumnModel().getColumn(5).setResizable(false);
        
        alunoCredjTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
    }
    
    public void gerarPDF(ArrayList<Parcelas> parcelas){
        Document doc = new Document();
        String end = "";
        try {
            end = AlunosFichaExercicioJFrame.salvarcomo(this);
            PdfWriter.getInstance(doc, new FileOutputStream(end+"/Relatorio de Parcelas em debito.pdf"));
            
            Font fontCab = new Font(Font.FontFamily.TIMES_ROMAN,14,Font.BOLD,BaseColor.BLACK);
            Font fontTexto = new Font(Font.FontFamily.TIMES_ROMAN,12,Font.NORMAL,BaseColor.BLACK);
            PdfPTable table = new PdfPTable(6);
            
            table.addCell(new Paragraph("Id", fontTexto));
            table.addCell(new Paragraph("Nome", fontTexto));
            table.addCell(new Paragraph("Parcelas", fontTexto));
            table.addCell(new Paragraph("Valor", fontTexto));
            table.addCell(new Paragraph("Data", fontTexto));
            table.addCell(new Paragraph("Celular", fontTexto));
            
            for(Parcelas p : parcelas){
                table.addCell(new Paragraph(""+p.getId(), fontTexto));
                table.addCell(new Paragraph(""+p.getAlunos().getNome(), fontTexto));                
                table.addCell(new Paragraph(""+p.getConta().getDescricao(), fontTexto));
                table.addCell(new Paragraph(""+p.getValor(), fontTexto));    
                table.addCell(new Paragraph(""+p.getData_de_Vencimento(), fontTexto));   
                table.addCell(new Paragraph(""+p.getAlunos().getCelular(), fontTexto));
             }
            
            doc.open();            
            doc.add(new Paragraph(Util.getDatasRel(new Date()),fontTexto));
            doc.add(new Paragraph("GYM - Relat??rio de Parcelas em d??bito\n\n",fontCab));
            doc.add(table);
            
            
        } catch (FileNotFoundException | DocumentException ex) {
            Logger.getLogger(RelatoriListaFunJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            doc.close();
        }
        
        try {
            Desktop.getDesktop().open(new File(end+"/Relatorio de Parcelas em debito.pdf"));
        } catch (IOException ex) {
            Logger.getLogger(RelatoriListaFunJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}

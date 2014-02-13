package tela;
import java.io.Serializable;
import javax.swing.*;
import java.util.ArrayList;

public class jf_jog extends JFrame {
    String homens, mulheres, CM, CH, del, rem;
    
    public jf_jog() {
        initComponents();
        super.setIconImage(new ImageIcon("icon.png").getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel6 = new javax.swing.JPanel();
        tf_homens = new javax.swing.JTextField();
        tf_mulheres = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ta_mulher = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        ta_homem = new javax.swing.JTextArea();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        deletar = new javax.swing.JButton();
        texto = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Jogo do Desafio - Configurar Jogadores");
        setResizable(false);

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Adicionar"));

        jButton3.setText("Adicionar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Adicione uma pessoa de cada sexo por vez.");

        ta_mulher.setColumns(20);
        ta_mulher.setEditable(false);
        ta_mulher.setLineWrap(true);
        ta_mulher.setRows(5);
        ta_mulher.setWrapStyleWord(true);
        ta_mulher.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        ta_mulher.setEnabled(false);
        jScrollPane2.setViewportView(ta_mulher);

        ta_homem.setColumns(20);
        ta_homem.setEditable(false);
        ta_homem.setLineWrap(true);
        ta_homem.setRows(5);
        ta_homem.setWrapStyleWord(true);
        ta_homem.setAutoscrolls(false);
        ta_homem.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        ta_homem.setEnabled(false);
        jScrollPane3.setViewportView(ta_homem);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Homens");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Mulheres");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(tf_homens, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tf_mulheres, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_mulheres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_homens, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24));
        jLabel1.setForeground(new java.awt.Color(0, 102, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Jogadores");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Deletar"));

        jLabel2.setText("Jogador:");

        deletar.setText("Deletar");
        deletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(texto, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                    .addComponent(deletar, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(texto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(deletar)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Como Fazer"));

        jTextArea1.setColumns(20);
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setText("Para adicionar mais de um jog. ao mesmo tempo separe-os por   \";\". Espaços não serão          considerados separadores.\nIdem para deletar.");
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 615, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jPanel1, jPanel2});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    ArrayList<String> AL_homens = new ArrayList();
    ArrayList<String> AL_mulheres = new ArrayList();
      
    
    public void mostrarJog(){        
        try {    
            ta_homem.setText("");
            ta_mulher.setText("");
            String h = ta_homem.getText();
            String m = ta_mulher.getText();
        
            for (int i=0; i<AL_homens.size(); i=i+2 ){
                h = ta_homem.getText();
                ta_homem.setText(h + String.valueOf(AL_homens.get(i)) + "\n");
                
            }        
            for (int k=0; k<AL_mulheres.size(); k=k+2){
                m = ta_mulher.getText();
                ta_mulher.setText(m + String.valueOf(AL_mulheres.get(k)) + "\n");
                
            }       
        }
        catch (IndexOutOfBoundsException erro){}
    }

    public void adcHomens(){
        homens = tf_homens.getText();
        int j = 0;
        for(int i = 0; i < homens.length(); i++){
            try{
                if (homens.substring(i,i+1).equals(";") || homens.substring(i,i+1).equals(",") || 
                    homens.substring(i,i+1).equals("-") || homens.substring(i,i+1).equals(".") ||
                    homens.substring(i,i+1).equals("_")){
                        String adc = homens.substring(j, i);
                        AL_homens.add(adc);
                        AL_homens.add(adc);
                        j = i+1;
                        tf_homens.setText(homens.substring(j, homens.length()));
                    }                  
            }      
            catch (StringIndexOutOfBoundsException erro){}            
        }
        String ultimo = tf_homens.getText();
        AL_homens.add(ultimo);
        AL_homens.add(ultimo);
        tf_homens.setText("");
    }
    
    public void adcMulheres(){
        mulheres = tf_mulheres.getText();
        int j = 0;
        for(int i = 0; i < mulheres.length(); i++){
            try{
                if (mulheres.substring(i,i+1).equals(";") || mulheres.substring(i,i+1).equals(",") || 
                    mulheres.substring(i,i+1).equals("-") || mulheres.substring(i,i+1).equals(".") ||
                    mulheres.substring(i,i+1).equals("_")){
                        String adc = mulheres.substring(j, i);
                        AL_mulheres.add(adc);
                        AL_mulheres.add(adc);
                        j = i+1;
                        tf_mulheres.setText(mulheres.substring(j, mulheres.length()));
                    }                  
            }      
            catch (StringIndexOutOfBoundsException erro){}            
        }
        String ultimo = tf_mulheres.getText();
        AL_mulheres.add(ultimo);
        AL_mulheres.add(ultimo);
        tf_mulheres.setText("");
    }
   
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        mulheres = tf_mulheres.getText();
        homens = tf_homens.getText();
        
        if (mulheres.equals("") && !homens.equals("")){
            adcHomens();
        } else if (homens.equals("") && !mulheres.equals("")){
            adcMulheres();
        } else if (homens.equals("") && mulheres.equals("")){
            JOptionPane.showMessageDialog(null, "Para adicionar jogadores você deve escrever o(s) nome(s) no campo destinado a isso!");
        }
        
        else {
            adcMulheres();
            adcHomens();
        }
        tf_homens.requestFocus();
        mostrarJog();
        
        
    }//GEN-LAST:event_jButton3ActionPerformed
 
    public void rm_homens(String RMH){
        AL_homens.remove(RMH);
        AL_homens.remove(RMH);
    }
    
    public void rm_mulheres(String RMM){
        AL_mulheres.remove(RMM);
        AL_mulheres.remove(RMM);
    }
    
    public void deletar(){
        del = texto.getText();
        int j = 0;
        for(int i = 0; i < del.length(); i++){
                if (del.substring(i,i+1).equals(";") || del.substring(i,i+1).equals(",") || 
                    del.substring(i,i+1).equals("-") || del.substring(i,i+1).equals(".") ||
                    del.substring(i,i+1).equals("_")){
                    rem = del.substring(j, i);    
                    if(AL_homens.contains(rem)){
                        rm_homens(rem);
                    }
                    else if (AL_mulheres.contains(rem)){
                        rm_mulheres(rem);
                    }
                    else {
                        JOptionPane.showMessageDialog(null, "Jogador não encontrado: " + rem);
                    }
                    j = i+1;
                    texto.setText(del.substring(j, del.length()));
                }
        }
        rem = texto.getText();
        if(AL_homens.contains(rem)){
            rm_homens(rem);
        }
        else if(AL_mulheres.contains(rem)){
            rm_mulheres(rem);
        }
        else {
            JOptionPane.showMessageDialog(null, "Jogador não encontrado: " + rem);
        }
        texto.setText("");
        texto.requestFocus();
        mostrarJog();
}
    
    private void deletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletarActionPerformed
        deletar();       
}//GEN-LAST:event_deletarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new jf_jog().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton deletar;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea ta_homem;
    private javax.swing.JTextArea ta_mulher;
    private javax.swing.JTextField texto;
    private javax.swing.JTextField tf_homens;
    private javax.swing.JTextField tf_mulheres;
    // End of variables declaration//GEN-END:variables
}
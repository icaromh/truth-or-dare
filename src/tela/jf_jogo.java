package tela;
import javax.swing.*;
import jogo.*;
import java.io.*;
import java.util.ArrayList;
import tela.jf_jog.*;
/**
 *
 * @author Icaro
 */
public class jf_jogo extends JFrame {
    jf_jog jogador = new jf_jog();
    jf_perguntas per = new jf_perguntas();
    sobre sobre = new sobre();
    jf_bebida b = new jf_bebida();
    comoJogar como = new comoJogar();
    regras r = new regras();
    
    int jogadas=0;
    String jog1,jog2;
    int j;
    boolean esconde=false;
    
   public jf_jogo() {
        
        initComponents();
        super.setIconImage(new ImageIcon("icon.png").getImage()); 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nivel_a_jogar = new javax.swing.ButtonGroup();
        sexoigual = new javax.swing.ButtonGroup();
        nivel_adc_desafio = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        nv1 = new javax.swing.JRadioButton();
        nv2 = new javax.swing.JRadioButton();
        nv3 = new javax.swing.JRadioButton();
        allnv = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        jr_sim = new javax.swing.JRadioButton();
        jr_nao = new javax.swing.JRadioButton();
        GOLES = new javax.swing.JPanel();
        tf_goles = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        JOGO = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        RODADAS = new javax.swing.JLabel();
        RODADA_NUM = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMI_Salvar = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem_Jogadores = new javax.swing.JMenuItem();
        jMenuItem_Desafios = new javax.swing.JMenuItem();
        jMenuItem_Bebida = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Jogo do Desafio");
        setIconImages(null);
        setMinimumSize(new java.awt.Dimension(650, 530));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24));
        jLabel1.setForeground(new java.awt.Color(0, 102, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Jogo do Desafio");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 10, 600, 30);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Nível a ser jogado"));

        nivel_a_jogar.add(nv1);
        nv1.setSelected(true);
        nv1.setText("Nível 1");

        nivel_a_jogar.add(nv2);
        nv2.setText("Nível 2");

        nivel_a_jogar.add(nv3);
        nv3.setText("Nível 3");

        nivel_a_jogar.add(allnv);
        allnv.setText("Todos");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(nv1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nv2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nv3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(allnv)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nv1)
                    .addComponent(nv2)
                    .addComponent(nv3)
                    .addComponent(allnv))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(180, 70, 280, 60);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Permitir sexos iguais?"));

        sexoigual.add(jr_sim);
        jr_sim.setText("Sim");
        jr_sim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jr_simActionPerformed(evt);
            }
        });

        sexoigual.add(jr_nao);
        jr_nao.setSelected(true);
        jr_nao.setText("Não");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jr_sim)
                .addGap(10, 10, 10)
                .addComponent(jr_nao)
                .addContainerGap(155, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jr_sim)
                    .addComponent(jr_nao))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(180, 130, 280, 50);

        GOLES.setBorder(javax.swing.BorderFactory.createTitledBorder("Bebida"));

        tf_goles.setFont(new java.awt.Font("Tahoma", 1, 16));
        tf_goles.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf_goles.setAutoscrolls(false);
        tf_goles.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        tf_goles.setEnabled(false);
        tf_goles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_golesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout GOLESLayout = new javax.swing.GroupLayout(GOLES);
        GOLES.setLayout(GOLESLayout);
        GOLESLayout.setHorizontalGroup(
            GOLESLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GOLESLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tf_goles, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
                .addContainerGap())
        );
        GOLESLayout.setVerticalGroup(
            GOLESLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GOLESLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tf_goles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        getContentPane().add(GOLES);
        GOLES.setBounds(180, 190, 280, 80);

        jButton1.setText("Jogar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(190, 440, 260, 30);

        JOGO.setBorder(javax.swing.BorderFactory.createTitledBorder("Participantes e Desafio da Rodada"));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Participante 1");

        jLabel3.setText(">>");

        jLabel4.setText("Participante 2");

        jTextField1.setEditable(false);
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("...desafio ...");
        jTextField1.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout JOGOLayout = new javax.swing.GroupLayout(JOGO);
        JOGO.setLayout(JOGOLayout);
        JOGOLayout.setHorizontalGroup(
            JOGOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JOGOLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JOGOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JOGOLayout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(JOGOLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                        .addGap(18, 18, 18))))
        );
        JOGOLayout.setVerticalGroup(
            JOGOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JOGOLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JOGOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(JOGO);
        JOGO.setBounds(180, 280, 280, 120);

        RODADAS.setText("Rodadas Jogadas:");
        getContentPane().add(RODADAS);
        RODADAS.setBounds(190, 410, 110, 14);
        getContentPane().add(RODADA_NUM);
        RODADA_NUM.setBounds(320, 410, 60, 14);

        jMenu1.setText("Menu");

        jMenuItem4.setText("Abrir...");
        jMenuItem4.setEnabled(false);
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMI_Salvar.setText("Salvar..");
        jMI_Salvar.setEnabled(false);
        jMI_Salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMI_SalvarActionPerformed(evt);
            }
        });
        jMenu1.add(jMI_Salvar);
        jMenu1.add(jSeparator1);

        jMenuItem1.setText("Regras");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Instruções");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Configurações");
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });

        jMenuItem_Jogadores.setText("Jogadores");
        jMenuItem_Jogadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_JogadoresActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem_Jogadores);

        jMenuItem_Desafios.setText("Desafios");
        jMenuItem_Desafios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_DesafiosActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem_Desafios);

        jMenuItem_Bebida.setText("Bebida");
        jMenuItem_Bebida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_BebidaActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem_Bebida);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Sobre");
        jMenu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu3ActionPerformed(evt);
            }
        });

        jMenuItem6.setText("Sobre...");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem6);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        como.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        r.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jr_simActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jr_simActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_jr_simActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            escolherSexo();
            SelNivel();
            Bebidas();
            Contador();
        } 
        catch(IndexOutOfBoundsException erro){
            //JOptionPane.showMessageDialog(null, "Adicione jogadores antes de começar!");
        }
            
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenuItem_JogadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_JogadoresActionPerformed
        jogador.setVisible(true);
    }//GEN-LAST:event_jMenuItem_JogadoresActionPerformed

    private void jMenuItem_DesafiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_DesafiosActionPerformed
        per.setVisible(true);
    }//GEN-LAST:event_jMenuItem_DesafiosActionPerformed

    private void jMenu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu3ActionPerformed
       
    }//GEN-LAST:event_jMenu3ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        sobre.setVisible(true);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed
        
    }//GEN-LAST:event_jMenu2ActionPerformed

    private void jMenuItem_BebidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_BebidaActionPerformed
        b.setVisible(true);
    }//GEN-LAST:event_jMenuItem_BebidaActionPerformed

    private void tf_golesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_golesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_golesActionPerformed

    private void jMI_SalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMI_SalvarActionPerformed
/*       String obj_ArrayHomens = jogador.CH;
            try {
                FileOutputStream grava = new FileOutputStream("conf.txt");
                ObjectOutputStream objeto = new ObjectOutputStream(grava);
                objeto.writeObject(obj_ArrayHomens);
                objeto.flush();
                JOptionPane.showMessageDialog(null, "Parabens");
                
            } 
            catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Não Deu");
            }
*/           
    }//GEN-LAST:event_jMI_SalvarActionPerformed
    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
/*        try{
            FileInputStream arquivo = new FileInputStream("conf.txt");
            ObjectInputStream objeto = new ObjectInputStream(arquivo);
            tela.jf_jog dados = (tela.jf_jog)objeto.readObject();
            JOptionPane.showMessageDialog(null, dados);
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Não deu");
        }
*/       
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    public void Contador(){
        jogadas = jogadas+1;
        RODADA_NUM.setText(String.valueOf(jogadas));
    }
    
    public void Bebidas(){
     if (b.AL_bebidas.isEmpty()){
         JOptionPane.showMessageDialog(null, "Adicione algum tipo de bebida.");
        }
     else {
        try {
        b.verificaBebida();
        if (b.jogarComBebidas==true){
            // Altera o lugar dos botoes //
            JOGO.setBounds		(180, 280, 280, 120);
            RODADAS.setBounds           (190, 410, 110, 14 );
            RODADA_NUM.setBounds	(320, 410, 60, 14  );
            jButton1.setBounds		(190, 440, 260, 30 );
            
            GOLES.setVisible(true);
            int goles = (int) (1 + Math.random() * b.numGoles);
            int i = (int) (Math.random()*b.AL_bebidas.size());
            if (i == 1){
                tf_goles.setText(String.valueOf(goles) + " gole de " + String.valueOf(b.AL_bebidas.get(i)));
            }
            else {
                tf_goles.setText(String.valueOf(goles) + " goles de " + String.valueOf(b.AL_bebidas.get(i)));
            }
        }
        else {
            GOLES.setVisible(false);
            JOGO.setBounds		(180, 190, 280, 120);
            RODADAS.setBounds           (190, 320, 110, 14 );
            RODADA_NUM.setBounds	(320, 320, 60, 14  );
            jButton1.setBounds		(190, 350, 260, 30 );
        }
        }
        catch(Exception e){
        JOptionPane.showMessageDialog(null, "Adicione alguma bebida");
        }
    }
}
    
    public void SelNivel(){
        try{    
            if (nv1.isSelected()){
                int i = (int)(Math.random()*per.perguntas_1.size());
                jTextField1.setText(String.valueOf(per.perguntas_1.get(i)));
            }
            else if (nv2.isSelected()){
                int i = (int)(Math.random()*per.perguntas_2.size());
                jTextField1.setText(String.valueOf(per.perguntas_2.get(i)));
            }
            else if (nv3.isSelected()){
                int i = (int)(Math.random()*per.perguntas_3.size());
                jTextField1.setText(String.valueOf(per.perguntas_3.get(i)));
            }
            else if (allnv.isSelected()) {
                int i = (int)(1+ Math.random() * 100);
                if (i <= 50){
                    int j = (int)(Math.random()* per.perguntas_1.size());
                    jTextField1.setText(String.valueOf(per.perguntas_1.get(j)));
                }
                else if (i > 50 && i <= 90){
                    int j = (int)(Math.random()* per.perguntas_2.size());
                    jTextField1.setText(String.valueOf(per.perguntas_2.get(j)));
                }
            
                else if(i > 90 && i <= 100 ) {
                    int j = (int)(Math.random()* per.perguntas_3.size());
                    jTextField1.setText(String.valueOf(per.perguntas_3.get(j)));
                }
            }
            else {
                JOptionPane.showMessageDialog(null, "Selecione um Nível para jogar");
            }  
      }
      catch(IndexOutOfBoundsException e){
          
      }
}

    
    public void escolherSexo(){        
        int m,h,m2,h2,i;
        m = (int)(Math.random() * jogador.AL_mulheres.size());
        h = (int)(Math.random() * jogador.AL_homens.size());
        
        if (jr_sim.isSelected()){
            if (jogador.AL_homens.size()==2 || jogador.AL_mulheres.size()==2){
                JOptionPane.showMessageDialog(null, "Para que possa cair pessoas com o mesmo sexo é necessario adicionar mais de uma pessoa por sexo");
            }
            else if(jogador.AL_homens.isEmpty() && jogador.AL_mulheres.isEmpty()){
                JOptionPane.showMessageDialog(null, "Adicione Jogadores antes de começar");
            }
            else {    
                i = (int)(1+ Math.random() * 100);
                i = i % 2;
                if (i==0){
                    jog1 = String.valueOf(jogador.AL_homens.get(h)); 
                }
                else {
                    jog1 = String.valueOf(jogador.AL_mulheres.get(m));
                }
                jLabel2.setText(jog1);

        
                j = (int)(1+ Math.random() * 100);
                j = j % 2;
        
                do{
                    m2 = (int)(Math.random() * jogador.AL_mulheres.size());
                    h2 = (int)(Math.random() * jogador.AL_homens.size());
                
                    if (j==0){
                        jog2 = String.valueOf(jogador.AL_homens.get(h2)); 
                    }
                    else {       
                        jog2 = String.valueOf(jogador.AL_mulheres.get(m2));
                    }
                }
                while(m2==m || h2 == h || jog1.equals(jog2));
                
                jLabel4.setText(jog2);    
            }    
        }
        
        else {
            if (jogador.AL_homens.isEmpty() || jogador.AL_mulheres.isEmpty()){
                JOptionPane.showMessageDialog(null, "Para jogar com jogadores de sexos opostos é necessário que adicione Homens e Mulheres");
            }
            else if(jogador.AL_homens.isEmpty() && jogador.AL_mulheres.isEmpty()){
                JOptionPane.showMessageDialog(null, "Adicione Jogadores antes de começar");
            }
            else {
                i = (int)(1+ Math.random() * 100);
                i = i%2;
                if (i == 0)
                    jog1 = String.valueOf(jogador.AL_homens.get(h));
                else {
                    jog1 = String.valueOf(jogador.AL_mulheres.get(m)); 
               }
               do{
                    m2 = (int)(Math.random() * jogador.AL_mulheres.size());
                    h2 = (int)(Math.random() * jogador.AL_homens.size());
                    j = (int)(1+ Math.random() * 100);
                    j = j%2;
                }
                while(m2==m || h2 == h || i == j);
                if (j == 0)
                    jog2 = String.valueOf(jogador.AL_homens.get(h2));
                else {
                    jog2 = String.valueOf(jogador.AL_mulheres.get(m2)); 
                }
        }
    }
        jLabel2.setText(jog1);
        jLabel4.setText(jog2);
}  

    public static void main(String args[]) {
      jf_jogo jf_jogo = new jf_jogo();
      jf_jogo.setVisible(true);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel GOLES;
    private javax.swing.JPanel JOGO;
    private javax.swing.JLabel RODADAS;
    private javax.swing.JLabel RODADA_NUM;
    private javax.swing.JRadioButton allnv;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenuItem jMI_Salvar;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem_Bebida;
    private javax.swing.JMenuItem jMenuItem_Desafios;
    private javax.swing.JMenuItem jMenuItem_Jogadores;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JRadioButton jr_nao;
    private javax.swing.JRadioButton jr_sim;
    private javax.swing.ButtonGroup nivel_a_jogar;
    private javax.swing.ButtonGroup nivel_adc_desafio;
    private javax.swing.JRadioButton nv1;
    private javax.swing.JRadioButton nv2;
    private javax.swing.JRadioButton nv3;
    private javax.swing.ButtonGroup sexoigual;
    private javax.swing.JTextField tf_goles;
    // End of variables declaration//GEN-END:variables
}

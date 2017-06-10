import java.util.Calendar;
import javax.swing.JOptionPane;

 // @author Elias Neto

public class JEntrada extends javax.swing.JFrame {
    
    Entrada entrada  = null;

    public JEntrada() {
        initComponents();
    }
    
    private void limparcampos() {
        txtCodigoProduto.setText("");
        txtDescricao.setText("");
        txtFornecedor.setText("");
        txtProtocolo.setText("");
        txtQuantidade.setText("");
        txtValorTotal.setText("");
        txtValorUnitario.setText("");    
        txtEstoque.setText("");
    }
    
    private void habilitarCampos(boolean status){
        txtCodigoProduto.setEnabled(status);
        txtFornecedor.setEnabled(status);
        txtProtocolo.setEnabled(status);
        txtQuantidade.setEnabled(status);
    }
    
    private boolean validaPreenchimento(){
        if (txtProtocolo.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Campo Protocolo é obrigatório");
            txtProtocolo.requestFocus();
            return false;
        }
        if (txtCodigoProduto.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Código do produto é obrigatório");
            txtCodigoProduto.requestFocus();
            return false;
        }
        if (txtQuantidade.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Campo Quantidade Entrada é obrigatório");
            txtQuantidade.requestFocus();
            return false;
        }
        if (txtFornecedor.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Campo Fornecedor é obrigatório");
            txtFornecedor.requestFocus();
            return false;
        }
        return true;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btNovo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtProtocolo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtCodigoProduto = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtQuantidade = new javax.swing.JTextField();
        txtFornecedor = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtDescricao = new javax.swing.JTextField();
        txtValorUnitario = new javax.swing.JTextField();
        txtValorTotal = new javax.swing.JTextField();
        btRegistrar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtEstoque = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        btNovo.setFont(new java.awt.Font("Caladea", 1, 14)); // NOI18N
        btNovo.setText("Novo");
        btNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novo(evt);
            }
        });
        getContentPane().add(btNovo);
        btNovo.setBounds(200, 50, 70, 28);

        jLabel1.setFont(new java.awt.Font("Caladea", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Registrar entrada de mercadoria");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 10, 440, 30);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Nº Protocolo:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 100, 120, 30);

        txtProtocolo.setEnabled(false);
        getContentPane().add(txtProtocolo);
        txtProtocolo.setBounds(130, 100, 90, 30);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Código ID do produto:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(1, 140, 120, 30);

        txtCodigoProduto.setEnabled(false);
        txtCodigoProduto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCodigoProdutoFocusLost(evt);
            }
        });
        getContentPane().add(txtCodigoProduto);
        txtCodigoProduto.setBounds(130, 140, 90, 30);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Quantidade entrada:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(1, 180, 120, 30);

        txtQuantidade.setEnabled(false);
        getContentPane().add(txtQuantidade);
        txtQuantidade.setBounds(130, 180, 90, 30);

        txtFornecedor.setEnabled(false);
        getContentPane().add(txtFornecedor);
        txtFornecedor.setBounds(130, 220, 90, 30);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Fornecedor:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(1, 220, 120, 30);

        txtDescricao.setEnabled(false);
        getContentPane().add(txtDescricao);
        txtDescricao.setBounds(330, 140, 120, 30);

        txtValorUnitario.setEnabled(false);
        getContentPane().add(txtValorUnitario);
        txtValorUnitario.setBounds(350, 210, 80, 30);

        txtValorTotal.setEnabled(false);
        getContentPane().add(txtValorTotal);
        txtValorTotal.setBounds(40, 340, 100, 30);

        btRegistrar.setText("Registrar");
        btRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRegistrarActionPerformed(evt);
            }
        });
        getContentPane().add(btRegistrar);
        btRegistrar.setBounds(200, 340, 90, 26);

        jLabel6.setFont(new java.awt.Font("Candara", 1, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Valor total da carga registrada");
        jLabel6.setEnabled(false);
        getContentPane().add(jLabel6);
        jLabel6.setBounds(0, 320, 170, 20);

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Descrição");
        jLabel7.setEnabled(false);
        getContentPane().add(jLabel7);
        jLabel7.setBounds(330, 120, 120, 20);

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Valor Unitário");
        jLabel8.setEnabled(false);
        getContentPane().add(jLabel8);
        jLabel8.setBounds(340, 190, 100, 20);

        txtEstoque.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(txtEstoque);
        txtEstoque.setBounds(320, 250, 130, 20);

        setSize(new java.awt.Dimension(478, 421));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void novo(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novo
        // TODO add your handling code here:
        limparcampos();
        habilitarCampos(true);
        entrada = new Entrada();
        txtProtocolo.requestFocus();        
    }//GEN-LAST:event_novo

    private void btRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRegistrarActionPerformed
        // TODO add your handling code here:
        if(JOptionPane.showConfirmDialog(this, "Tem certeza?","Registrar entrada de mercadoria",
                    JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){ //INICIO DOS COMANDOS - SE CLICAR EM "SIM"
        
        if (!validaPreenchimento()) { //verifica se os campos estão todos preenchidos
            return; //se não estiverem todo preenchidos vai parar a gravação
        }
        if (Repositorio.buscaEntrada(Integer.parseInt(txtProtocolo.getText())) != null) {
            JOptionPane.showMessageDialog(null, "Ja existe entrada com este número de Protocolo");
        } else {
            entrada.setProtocolo(Integer.parseInt(txtProtocolo.getText()));
            entrada.setFornecedor(txtFornecedor.getText());
            entrada.setQtdEntrada(Double.parseDouble(txtQuantidade.getText()));
            entrada.setValorTotal(entrada.getQtdEntrada() * entrada.getProduto().getValorUnitario());
            entrada.setDataHora(Calendar.getInstance().getTime()); //guarda a data atual
            txtValorTotal.setText(String.valueOf(entrada.getValorTotal())); //exibe no campo de texto txtValorTotal o valor total da mercadoria entrando 
            Repositorio.registrarEntrada(entrada);
            txtEstoque.setText(String.valueOf(entrada.getProduto().getQtde())+" em estoque");
            habilitarCampos(false);
        }
    } //FIM DOS COMANDOS - SE CLICAR EM "SIM"
    }//GEN-LAST:event_btRegistrarActionPerformed

    private void txtCodigoProdutoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCodigoProdutoFocusLost
        // TODO add your handling code here:
        if (txtCodigoProduto.getText().trim().isEmpty()) {
            return; //Se a caixa de texto ta vazia, nada acontece, fim dessa função.
        }
        entrada.setProduto(Repositorio.localizarProduto(Integer.parseInt(txtCodigoProduto.getText())));
        if(entrada.getProduto() != null){
        txtDescricao.setText(entrada.getProduto().getDescricao());
        txtValorUnitario.setText(String.valueOf(entrada.getProduto().getValorUnitario()));
        txtEstoque.setText(String.valueOf(entrada.getProduto().getQtde())+" em estoque");
        }else{
            JOptionPane.showMessageDialog(null, "Código do produto inexistente!");
        }
    }//GEN-LAST:event_txtCodigoProdutoFocusLost

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btNovo;
    private javax.swing.JButton btRegistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField txtCodigoProduto;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JLabel txtEstoque;
    private javax.swing.JTextField txtFornecedor;
    private javax.swing.JTextField txtProtocolo;
    private javax.swing.JTextField txtQuantidade;
    private javax.swing.JTextField txtValorTotal;
    private javax.swing.JTextField txtValorUnitario;
    // End of variables declaration//GEN-END:variables
}

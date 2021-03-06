/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.views;

import java.awt.Point;
import javax.swing.JComponent;

/**
 *
 * @author Bharathy KGiSL
 */
public class DetailViewPanel extends javax.swing.JPanel {

    /**
     * Creates new form NewJPanel
     */
    public DetailViewPanel() {
        initComponents();
        
    }
    
    public javax.swing.JTextField getNameField()
    {
        
        return txt_name;
        
    }
     public javax.swing.JTextField getMobileField()
    {
        
        return txt_mobileno;
        
    }
      public javax.swing.JTextField geteMailField()
    {
        
        return txt_email;
        
    }
      public javax.swing.JTextField getAddressField()
      {
          return txt_address;
      }
      public javax.swing.JTextField getCityField()
      {
          return txt_city;
      }
      public javax.swing.JTextField getStateField()
      {
          return txt_state;
      }
      public void setName(String name)
      {
          txt_name.setText(name);
      }
       public void setMobile(String mobile)
      {
          txt_mobileno.setText(mobile);
      }
        public void seteMail(String email)
      {
          txt_email.setText(email);
      }
        public void setAddress(String Address)
      {
          txt_address.setText(Address);
            
      }
          public void setCity(String City)
      {
          txt_city.setText(City);
            
      }
            public void setState(String State)
      {
          txt_state.setText(State);
            
      }
        public JComponent getComponent() 
        {
            return this;
        }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenu3 = new javax.swing.JMenu();
        jTextField6 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jTextField2 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_name = new javax.swing.JTextField();
        txt_mobileno = new javax.swing.JTextField();
        txt_city = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txt_address = new javax.swing.JTextField();
        txt_email = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txt_state = new javax.swing.JTextField();

        jTextField1.setText("jTextField1");

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("jMenu3");

        jTextField6.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jTextField6.setText("Gender");

        jTextField4.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jTextField4.setText("Roll no");
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        jRadioButton1.setText("M");

        jRadioButton2.setText("F");

        jTextField2.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jTextField2.setText("Address");
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setForeground(new java.awt.Color(0, 0, 230));
        setToolTipText("");
        setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel1.setText("Name*");
        add(jLabel1);
        jLabel1.setBounds(35, 12, 61, 28);

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel2.setText("Mobile No*");
        add(jLabel2);
        jLabel2.setBounds(35, 51, 61, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel3.setText("Email");
        add(jLabel3);
        jLabel3.setBounds(35, 99, 61, 20);

        txt_name.setBackground(new java.awt.Color(247, 247, 247));
        txt_name.setFont(new java.awt.Font("Arial Rounded MT Bold", 3, 11)); // NOI18N
        txt_name.setForeground(new java.awt.Color(227, 20, 20));
        txt_name.setDebugGraphicsOptions(javax.swing.DebugGraphics.LOG_OPTION);
        txt_name.setDisabledTextColor(new java.awt.Color(240, 240, 240));
        txt_name.setName("txt_name"); // NOI18N
        txt_name.setSelectedTextColor(new java.awt.Color(227, 20, 20));
        txt_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nameActionPerformed(evt);
            }
        });
        txt_name.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                txt_namePropertyChange(evt);
            }
        });
        add(txt_name);
        txt_name.setBounds(102, 16, 144, 20);

        txt_mobileno.setDisabledTextColor(new java.awt.Color(225, 225, 225));
        txt_mobileno.setName("txt_mobileno"); // NOI18N
        txt_mobileno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_mobilenoActionPerformed(evt);
            }
        });
        add(txt_mobileno);
        txt_mobileno.setBounds(102, 51, 144, 20);

        txt_city.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cityActionPerformed(evt);
            }
        });
        add(txt_city);
        txt_city.setBounds(96, 175, 150, 20);

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel5.setText("Address");
        add(jLabel5);
        jLabel5.setBounds(35, 143, 46, 14);

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel4.setText("City");
        add(jLabel4);
        jLabel4.setBounds(35, 178, 62, 14);
        add(jLabel6);
        jLabel6.setBounds(258, 175, 0, 0);
        add(jLabel7);
        jLabel7.setBounds(177, 175, 69, 0);
        add(jLabel8);
        jLabel8.setBounds(102, 175, 69, 0);
        add(jLabel9);
        jLabel9.setBounds(252, 175, 0, 23);
        add(txt_address);
        txt_address.setBounds(100, 140, 150, 20);
        add(txt_email);
        txt_email.setBounds(100, 100, 150, 20);

        jLabel10.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel10.setText("State");
        add(jLabel10);
        jLabel10.setBounds(30, 220, 50, 14);

        txt_state.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_stateActionPerformed(evt);
            }
        });
        add(txt_state);
        txt_state.setBounds(100, 220, 150, 20);
    }// </editor-fold>//GEN-END:initComponents

    private void txt_namePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_txt_namePropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_namePropertyChange

    private void txt_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nameActionPerformed

    private void txt_mobilenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_mobilenoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_mobilenoActionPerformed

    private void txt_cityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cityActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void txt_stateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_stateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_stateActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField txt_address;
    private javax.swing.JTextField txt_city;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_mobileno;
    private javax.swing.JTextField txt_name;
    private javax.swing.JTextField txt_state;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libra;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

/**
 *
 * @author Vishal
 */
public class dispfines extends javax.swing.JFrame {

    /**
     * Creates new form dispfines
     */
    public dispfines() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        borr_id = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        fine = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        refresh = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Borrower ID");

        jButton1.setText("Include Paid");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Exclude Paid");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Display All Fines");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        fine.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Borrower ID", "Total Fine"
            }
        ));
        jScrollPane1.setViewportView(fine);

        jButton4.setText("Display Unpaid Fines");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Back");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Exit");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        refresh.setText("Refresh all Fines");
        refresh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                refreshMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(borr_id, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton6)
                    .addComponent(jButton5))
                .addGap(31, 31, 31))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(186, 186, 186)
                        .addComponent(refresh)))
                .addContainerGap(137, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton3, jButton4});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton5, jButton6});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(borr_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2)
                            .addComponent(jButton1)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(jButton5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(refresh)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        String BORRID = borr_id.getText();
        
        try
        {
          Class.forName("com.mysql.jdbc.Driver");
           Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","romi");
            String query = "select a.Card_no,sum(Fine_amt) from book_loans a,fines b where a.loan_id=b.loan_id group by Card_no";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            ResultSetMetaData rsmetadata = rs.getMetaData();
            int columns = rsmetadata.getColumnCount();
            int size= 0;
            rs.beforeFirst();  
            rs.last();  
            size = rs.getRow();
            rs.beforeFirst();
            String [][] data_rows = new String[size][2];
            int i=0;
            while(rs.next())
            {
                for(int j=0;j<2;j++)
                {
                    data_rows[i][j]=rs.getString(j+1);
                }
                i++;
            }
            FinesTable dtm = new FinesTable(data_rows);
            fine.setModel(dtm);
            
        }catch (Exception e)
        {
            System.out.println("Error : " + e);
        }   
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        mScreen m = new mScreen();
        this.setVisible(false);
        m.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        String BORRID = borr_id.getText();
        
        try
        {
          Class.forName("com.mysql.jdbc.Driver");
           Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","romi");
            String query = "select a.Card_no,sum(Fine_amt) from book_loans a,fines b where a.loan_id=b.loan_id and b.Paid =0 group by Card_no;";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            ResultSetMetaData rsmetadata = rs.getMetaData();
            int columns = rsmetadata.getColumnCount();
            int size= 0;
            rs.beforeFirst();  
            rs.last();  
            size = rs.getRow();
            rs.beforeFirst();
            String [][] data_rows = new String[size][2];
            int i=0;
            while(rs.next())
            {
                for(int j=0;j<2;j++)
                {
                    data_rows[i][j]=rs.getString(j+1);
                }
                i++;
            }
            FinesTable dtm = new FinesTable(data_rows);
            fine.setModel(dtm);
            
        }catch (Exception e)
        {
            System.out.println("Error : " + e);
        }  
        
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String BORRID = borr_id.getText();
        
        try
        {
          Class.forName("com.mysql.jdbc.Driver");
           Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","romi");
            String query = "select a.Card_no,sum(Fine_amt) from book_loans a,fines b where a.loan_id=b.loan_id and a.Card_no="+BORRID+";";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            ResultSetMetaData rsmetadata = rs.getMetaData();
            int columns = rsmetadata.getColumnCount();
            int size= 0;
            rs.beforeFirst();  
            rs.last();  
            size = rs.getRow();
            rs.beforeFirst();
            String [][] data_rows = new String[size][2];
            int i=0;
            while(rs.next())
            {
                for(int j=0;j<2;j++)
                {
                    data_rows[i][j]=rs.getString(j+1);
                }
                i++;
            }
            FinesTable dtm = new FinesTable(data_rows);
            fine.setModel(dtm);
            
        }catch (Exception e)
        {
            System.out.println("Error : " + e);
        }  
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String BORRID = borr_id.getText();
        
        try
        {
          Class.forName("com.mysql.jdbc.Driver");
           Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","romi");
            String query = "select a.Card_no,sum(Fine_amt) from book_loans a,fines b "
                    + "where a.loan_id=b.loan_id "
                    + "and b.Paid =1 and a.Card_no="+BORRID+";";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            ResultSetMetaData rsmetadata = rs.getMetaData();
            int columns = rsmetadata.getColumnCount();
            int size= 0;
            rs.beforeFirst();  
            rs.last();  
            size = rs.getRow();
            rs.beforeFirst();
            String [][] data_rows = new String[size][2];
            int i=0;
            while(rs.next())
            {
                for(int j=0;j<2;j++)
                {
                    data_rows[i][j]=rs.getString(j+1);
                }
                i++;
            }
            FinesTable dtm = new FinesTable(data_rows);
            fine.setModel(dtm);
            
        }catch (Exception e)
        {
            System.out.println("Error : " + e);
        }  
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void refreshMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshMouseClicked
        // TODO add your handling code here:
       try {
        Class.forName("com.mysql.jdbc.Driver");
           Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","romi");
           Update_Fine(con);
       }
       catch(Exception e)
       {
           e.printStackTrace();
       }
    }//GEN-LAST:event_refreshMouseClicked

    public void Update_Fine(Connection con)
    {
        double difference=0;
        try
        {
        Statement st = con.createStatement();
        String count = "select a.loan_id,date_in,due_date,DATEDIFF(date_in,due_date) as diff "
                + "from book_loans a,fines b where a.loan_id = b.loan_id";
        ResultSet rs = st.executeQuery(count);
        
        while(rs.next())
        {
          int loan_id = Integer.parseInt(rs.getString("a.loan_id"));
          int diff = (Integer.parseInt(rs.getString("diff")));
          String due = rs.getString("due_date");
          System.out.println("Diff :"+diff);
          if(rs.getString("date_in").equals("0002-12-31"))
          {
            String Fine_query="update book_loans,fines set Fine_amt=(DATEDIFF(curdate(),'"+due+"')*0.25) "
                                +"where curdate()>'"+due+"' and fines.loan_id = "+loan_id;
            System.out.println(Fine_query);
            st=con.createStatement();
            st.executeUpdate(Fine_query);
          }
          else
          {
              if(diff>0)
              {
                difference = (diff)*0.25;
                String Fine_query="update book_loans,fines set Fine_amt="+difference
                                +" where fines.loan_id = "+loan_id;
                System.out.println(Fine_query);
                st=con.createStatement();
                st.executeUpdate(Fine_query);
              }
              else
              {
                String Fine_query="update book_loans,fines set Fine_amt=0.00 where fines.loan_id = "+loan_id;
                System.out.println(Fine_query);
                st=con.createStatement();
                st.executeUpdate(Fine_query);
              }  
          }  
        }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(dispfines.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dispfines.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dispfines.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dispfines.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dispfines().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField borr_id;
    private javax.swing.JTable fine;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton refresh;
    // End of variables declaration//GEN-END:variables
}

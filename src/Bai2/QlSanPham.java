/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai2;

import java.util.Collections;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class QlSanPham extends javax.swing.JFrame {

    HangHoaDao hhDao = new HangHoaDao();

    /**
     * Creates new form QlSanPham
     */
    public QlSanPham() {
        initComponents();
        setLocationRelativeTo(null);//Hiển thị form ra giữa màn hình
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btntimKiem = new javax.swing.JButton();
        btnthemMoi = new javax.swing.JButton();
        btnsapXep = new javax.swing.JButton();
        jssoLuong = new javax.swing.JSpinner();
        btnreSet = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtmaHH = new javax.swing.JTextField();
        txttenHH = new javax.swing.JTextField();
        btnExit = new javax.swing.JButton();
        txtgiaSP = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbsanPham = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btntimKiem.setBackground(new java.awt.Color(102, 255, 255));
        btntimKiem.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btntimKiem.setText("Tìm Kiếm");
        btntimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntimKiemActionPerformed(evt);
            }
        });

        btnthemMoi.setBackground(new java.awt.Color(102, 255, 255));
        btnthemMoi.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnthemMoi.setText("Thêm Mới");
        btnthemMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnthemMoiActionPerformed(evt);
            }
        });

        btnsapXep.setBackground(new java.awt.Color(102, 255, 255));
        btnsapXep.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnsapXep.setText("Sắp Xếp Giảm Dần");
        btnsapXep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsapXepActionPerformed(evt);
            }
        });

        btnreSet.setText("Reset");
        btnreSet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnreSetActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Quản lí sản phẩm");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Mã Hàng Hoá");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Tên Hàng Hoá");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("Giá sản Phẩm ");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Số Lượng");

        txtmaHH.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        txttenHH.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        txtgiaSP.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jtbsanPham.setBackground(new java.awt.Color(240, 240, 240));
        jtbsanPham.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jtbsanPham.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Mã Hàng", "Tên Hàng", "Giá Sản Phẩm", "Số Lượng"
            }
        ));
        jScrollPane1.setViewportView(jtbsanPham);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(296, 296, 296)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(txtmaHH))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txttenHH, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtgiaSP)
                            .addComponent(jssoLuong, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btntimKiem)
                            .addComponent(btnthemMoi))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnsapXep)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnreSet)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnExit)))))
                .addGap(19, 19, 19))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 788, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel8)
                    .addComponent(txtmaHH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtgiaSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btntimKiem))
                .addGap(13, 13, 13)
                .addComponent(btnsapXep)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txttenHH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnthemMoi)
                    .addComponent(jLabel6)
                    .addComponent(jssoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnreSet)
                    .addComponent(btnExit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 public  void setModel(HangHoa hh){
     txtmaHH.setText(hh.getMaHH());
     txttenHH.setText(hh.getTenHH());
     txtgiaSP.setText(hh.getGiaSp()+"");
     jssoLuong.setValue(hh.getSoLuong());
 }
    private void btntimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntimKiemActionPerformed
     if(txtmaHH.getText().isEmpty()){
          JOptionPane.showConfirmDialog(this, "Không tìm thấy thông tin");
     }
     else{
         HangHoa hh = hhDao.findMaHH(txtmaHH.getText().trim());
         if(hh!=null){
             JOptionPane.showMessageDialog(this, "Đã tìm thấy---\n"+"Mã hàng: "
                     +txtmaHH.getText()+"\nTên Hàng: "+txttenHH.getText()+"\nGiá sản phẩm: "+txtgiaSP.getText()+"\n Số Lượng: "+jssoLuong.getValue());
             setModel(hh);
         }
         else{
             JOptionPane.showConfirmDialog(this, "Không tìm thấy");
         }
     }
    }//GEN-LAST:event_btntimKiemActionPerformed
    public boolean checkValideteForm() {
        if (txtmaHH.getText().isEmpty()
                || txttenHH.getText().isEmpty()
                || txtgiaSP.getText().isEmpty()) {
            return false;
        }
        return true;
    }

    public HangHoa getModel() {
        HangHoa hh = new HangHoa();
        hh.setMaHH(txtmaHH.getText().trim());
        hh.setTenHH(txttenHH.getText().trim());
        hh.setGiaSp(Double.parseDouble(txtgiaSP.getText().trim()));
        hh.setSoLuong((Integer) jssoLuong.getValue());
        return hh;
    }
    //Hàm hiển thị lên table
    public void fillData(){
        DefaultTableModel tbModel=(DefaultTableModel) jtbsanPham.getModel();
        tbModel.setRowCount(0);
        for(HangHoa hh : hhDao.getAllSanPham()){
            Object [] rowData= new Object[4];
            rowData[0]=hh.getMaHH();
            rowData[1]=hh.getTenHH();
            rowData[2]=hh.getGiaSp();
            rowData[3]=hh.getSoLuong();
            tbModel.addRow(rowData);
        }
    }
    private void btnthemMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnthemMoiActionPerformed
        if (!checkValideteForm()) {
            JOptionPane.showConfirmDialog(this, "Bạn chưa nhập đủ dữ liệu");
        } else {
            try {
                HangHoa hh = getModel();
                System.out.println("=>" + hh.toString());
                if (hhDao.add(hh) > 0) {
                      fillData();
                    JOptionPane.showMessageDialog(this, "Thêm dữ liệu thành công");
                  
                }
            } catch (Exception e) {
                System.out.print("Error:" + e.toString());
            }
        }
    }//GEN-LAST:event_btnthemMoiActionPerformed

    private void btnreSetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnreSetActionPerformed
        txtmaHH.setText("");
        txttenHH.setText("");
        txtgiaSP.setText("");
        jssoLuong.setValue(0);
    }//GEN-LAST:event_btnreSetActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        dispose();
    }//GEN-LAST:event_btnExitActionPerformed
       public  void sapXep(HangHoa hh){
        Collections.sort(hhDao.lsHH,(a,b)->(int)(a.getGiaSp()-b.getGiaSp()));
        
    }
    private void btnsapXepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsapXepActionPerformed
//                 HangHoa hh = getModel();
////                   jtbsanPham.setModel(new DefaultTableModel());
//DefaultTableModel model = (DefaultTableModel) jtbsanPham.getModel();
//model.setRowCount(0);
////                DefaultTableModel tbModel=(DefaultTableModel) jtbsanPham.getModel();
//               
//                if (hhDao.add(hh) > 0) {
//                    sapXep(hh);
//                    fillData();
//                    JOptionPane.showConfirmDialog(this, "Sắp xếp thành công");
//                  
//                }
    }//GEN-LAST:event_btnsapXepActionPerformed

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
            java.util.logging.Logger.getLogger(QlSanPham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QlSanPham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QlSanPham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QlSanPham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QlSanPham().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnreSet;
    private javax.swing.JButton btnsapXep;
    private javax.swing.JButton btnthemMoi;
    private javax.swing.JButton btntimKiem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jssoLuong;
    private javax.swing.JTable jtbsanPham;
    private javax.swing.JTextField txtgiaSP;
    private javax.swing.JTextField txtmaHH;
    private javax.swing.JTextField txttenHH;
    // End of variables declaration//GEN-END:variables
}

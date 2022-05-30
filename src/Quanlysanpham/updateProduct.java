
package Quanlysanpham;

import Model_QLSP.Sanpham;
import Services_QLSP.Services;


public class updateProduct extends javax.swing.JFrame {
    
    Services service;
    Sanpham sanpham;
    
    public updateProduct(int IDSP) {
        service = new Services();
        sanpham = service.getSPById(IDSP);
        initComponents();
        
        dgoon_txtIDSP.setText(String.valueOf(sanpham.getIDSP()));
        dgoon_txtIDLoai.setText(String.valueOf(sanpham.getIDLoai()));
        dgoon_txtnameSP.setText(sanpham.getTenSP());
        dgoon_txtGia.setText(String.valueOf(sanpham.getGia()));
        dgoon_ARMota.setText(sanpham.getMota());
    }

   

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menu1 = new Quanlysanpham.Menu();
        panelBorder1 = new Quanlysanpham.PanelBorder();
        dgoon_btnThem = new Quanlysanpham.Button();
        dgoon_btnCancel = new Quanlysanpham.Button();
        jScrollPane1 = new javax.swing.JScrollPane();
        dgoon_ARMota = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        dgoon_txtIDSP = new Quanlytaikhoan.component.TextField();
        dgoon_txtnameSP = new Quanlytaikhoan.component.TextField();
        dgoon_txtIDLoai = new Quanlytaikhoan.component.TextField();
        dgoon_txtGia = new Quanlytaikhoan.component.TextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        dgoon_btnThem.setText("Thêm");
        dgoon_btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dgoon_btnThemActionPerformed(evt);
            }
        });

        dgoon_btnCancel.setText("Cancel");
        dgoon_btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dgoon_btnCancelActionPerformed(evt);
            }
        });

        dgoon_ARMota.setColumns(20);
        dgoon_ARMota.setRows(5);
        jScrollPane1.setViewportView(dgoon_ARMota);

        jLabel1.setText("Mô tả:");

        dgoon_txtIDSP.setLabelText("ID Sản phẩm");

        dgoon_txtnameSP.setLabelText("Tên sản phẩm");

        dgoon_txtIDLoai.setLabelText("Mã loại");

        dgoon_txtGia.setLabelText("Giá");

        javax.swing.GroupLayout panelBorder1Layout = new javax.swing.GroupLayout(panelBorder1);
        panelBorder1.setLayout(panelBorder1Layout);
        panelBorder1Layout.setHorizontalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(dgoon_txtIDLoai, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                            .addComponent(dgoon_txtIDSP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(dgoon_txtnameSP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dgoon_txtGia, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)))
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelBorder1Layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(dgoon_btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelBorder1Layout.createSequentialGroup()
                                .addGap(108, 108, 108)
                                .addComponent(jLabel1)))
                        .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelBorder1Layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelBorder1Layout.createSequentialGroup()
                                .addGap(111, 111, 111)
                                .addComponent(dgoon_btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(92, Short.MAX_VALUE))
        );
        panelBorder1Layout.setVerticalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dgoon_txtIDSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dgoon_txtnameSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dgoon_txtIDLoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dgoon_txtGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addComponent(dgoon_btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(50, Short.MAX_VALUE))
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(dgoon_btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menu1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(menu1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dgoon_btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dgoon_btnCancelActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_dgoon_btnCancelActionPerformed

    private void dgoon_btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dgoon_btnThemActionPerformed
        // TODO add your handling code here:
        sanpham.setIDSP(Integer.valueOf(dgoon_txtIDSP.getText()));
        sanpham.setIDLoai(Integer.valueOf(dgoon_txtIDLoai.getText()));
        sanpham.setTenSP(dgoon_txtnameSP.getText());
        sanpham.setGia(Integer.valueOf(dgoon_txtGia.getText()));
        sanpham.setMota(dgoon_ARMota.getText());

        service.updateSanpham(sanpham);

        this.dispose();
    }//GEN-LAST:event_dgoon_btnThemActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea dgoon_ARMota;
    private Quanlysanpham.Button dgoon_btnCancel;
    private Quanlysanpham.Button dgoon_btnThem;
    private Quanlytaikhoan.component.TextField dgoon_txtGia;
    private Quanlytaikhoan.component.TextField dgoon_txtIDLoai;
    private Quanlytaikhoan.component.TextField dgoon_txtIDSP;
    private Quanlytaikhoan.component.TextField dgoon_txtnameSP;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private Quanlysanpham.Menu menu1;
    private Quanlysanpham.PanelBorder panelBorder1;
    // End of variables declaration//GEN-END:variables
}

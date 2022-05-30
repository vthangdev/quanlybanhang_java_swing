/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trangchu.form;

import DAO_QLSP.DoanhThu;
import DAO_QLSP.DoanhThuFunctionHandler;
import DAO_QLSP.Year;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author RAVEN
 */
public class Form_doanhthu extends javax.swing.JPanel {
    DoanhThuFunctionHandler handle_54;
    DefaultComboBoxModel yearCBModel_54;
    DefaultTableModel dtTableModel_54 ;
    /**
     * Creates new form Form_1
     */
    public Form_doanhthu() {
        handle_54 = new DoanhThuFunctionHandler();
        dtTableModel_54 = new DefaultTableModel();
        
        //data yearComboBox
        yearCBModel_54 = new DefaultComboBoxModel();
        initComponents();
        
        SetModelYearComboBox(handle_54.getYearDoanhThu());
        yearComboBox_54.setModel(yearCBModel_54);
        
        //data doanh thu table
        dtTableModel_54 = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false; // khong cho phep nguoi dung Edit du lieu trong bang
            }
            
        };
        dtTableModel_54.addColumn("Ngày");
        dtTableModel_54.addColumn("Mã khách hàng");
        dtTableModel_54.addColumn("Mã sản phẩm");
        dtTableModel_54.addColumn("Số Lượng");
        dtTableModel_54.addColumn("Đơn giá");
        dtTableModel_54.addColumn("Tổng thu");
        
        SetModeldtTable(handle_54.getAllDataHoaDon(yearComboBox_54.getSelectedItem().toString()));
        dtTable_54.setModel(dtTableModel_54);
    }
    
    
    //set model yearCombobox
    public void SetModelYearComboBox(List<Year> years) {
        if(years.equals(null)) {
            System.out.println("Không có dữ liệu yearCombobox!");
            return;
        }
        for(Year y : years) {
           yearCBModel_54.addElement(y.getYear());
       }
    }

    //set model dtTable
    public void SetModeldtTable(List<DoanhThu> dts_54) {
        if(dts_54.equals(null)) {
            System.out.println("Không có dữ liệu dtTable!");
            return;
        }
        for(DoanhThu dt_54 : dts_54) {
           dtTableModel_54.addRow(new Object[] {dt_54.getNgayHD_54(),dt_54.getMaKH_54()
                                        ,dt_54.getMaSP_54(),dt_54.getSoLuong_54()
                                    ,dt_54.getDonGia_54()
                   ,Integer.valueOf(dt_54.getSoLuong_54())*Integer.valueOf(dt_54.getDonGia_54())});
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton5 = new javax.swing.JButton();
        header1 = new doanhthu.header();
        jPanel1 = new javax.swing.JPanel();
        jPanel4_139 = new javax.swing.JPanel();
        doanhthuPane_54 = new Quanlytaikhoan.component.MaterialTabbed();
        dtComponent_54 = new javax.swing.JPanel();
        sidebar_54 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        yearComboBox_54 = new Quanlytaikhoan.component.ComboBoxSuggestion();
        contentPane_54 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        dtTable_54 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        lTkComponent_54 = new javax.swing.JPanel();
        dieukienlocPane_54 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        loaiCombobox_54 = new Quanlytaikhoan.component.ComboBoxSuggestion();
        jPanel2 = new javax.swing.JPanel();
        tkPane_54 = new javax.swing.JPanel();
        textFieldAnimation1 = new Quanlytaikhoan.component.TextFieldAnimation();
        jLabel4 = new javax.swing.JLabel();
        loaiTKCombobox_54 = new Quanlytaikhoan.component.ComboBoxSuggestion();
        locPane_54 = new javax.swing.JPanel();
        locButton = new javax.swing.JButton();
        ngayBatDauLocCombobox_54 = new com.toedter.calendar.JDateChooser();
        ngayKetThucLocCombobox_54 = new com.toedter.calendar.JDateChooser();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();

        jButton5.setText("jButton1");

        jPanel4_139.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel4_139.setOpaque(false);

        dtComponent_54.setLayout(new java.awt.BorderLayout());

        sidebar_54.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        sidebar_54.setPreferredSize(new java.awt.Dimension(200, 390));

        jLabel1.setText("Năm");

        yearComboBox_54.setEditable(false);
        yearComboBox_54.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                yearComboBox_54ItemStateChanged(evt);
            }
        });
        yearComboBox_54.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearComboBox_54ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout sidebar_54Layout = new javax.swing.GroupLayout(sidebar_54);
        sidebar_54.setLayout(sidebar_54Layout);
        sidebar_54Layout.setHorizontalGroup(
            sidebar_54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidebar_54Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(sidebar_54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(yearComboBox_54, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE))
                .addContainerGap())
        );
        sidebar_54Layout.setVerticalGroup(
            sidebar_54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidebar_54Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(yearComboBox_54, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(314, Short.MAX_VALUE))
        );

        dtComponent_54.add(sidebar_54, java.awt.BorderLayout.LINE_START);

        contentPane_54.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Chi tiết doanh thu");

        dtTable_54.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(dtTable_54);

        jButton1.setText("Refesh");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout contentPane_54Layout = new javax.swing.GroupLayout(contentPane_54);
        contentPane_54.setLayout(contentPane_54Layout);
        contentPane_54Layout.setHorizontalGroup(
            contentPane_54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentPane_54Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(contentPane_54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(contentPane_54Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 625, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        contentPane_54Layout.setVerticalGroup(
            contentPane_54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPane_54Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        dtComponent_54.add(contentPane_54, java.awt.BorderLayout.CENTER);

        doanhthuPane_54.addTab("Doanh thu", dtComponent_54);

        dieukienlocPane_54.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setText("Loại");

        loaiCombobox_54.setEditable(false);
        loaiCombobox_54.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Tìm kiếm", "Lọc" }));

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(new java.awt.CardLayout());

        jLabel4.setText("Theo");

        loaiTKCombobox_54.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Năm", "Tháng", "Ngày" }));

        javax.swing.GroupLayout tkPane_54Layout = new javax.swing.GroupLayout(tkPane_54);
        tkPane_54.setLayout(tkPane_54Layout);
        tkPane_54Layout.setHorizontalGroup(
            tkPane_54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tkPane_54Layout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addGroup(tkPane_54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(tkPane_54Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(loaiTKCombobox_54, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(textFieldAnimation1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
        );
        tkPane_54Layout.setVerticalGroup(
            tkPane_54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tkPane_54Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textFieldAnimation1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(tkPane_54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(loaiTKCombobox_54, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(tkPane_54, "card2");

        locButton.setText("Lọc");

        ngayBatDauLocCombobox_54.setDateFormatString("dd-MM-yyyy");

        ngayKetThucLocCombobox_54.setDateFormatString("dd-MM-yyyy");

        javax.swing.GroupLayout locPane_54Layout = new javax.swing.GroupLayout(locPane_54);
        locPane_54.setLayout(locPane_54Layout);
        locPane_54Layout.setHorizontalGroup(
            locPane_54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(locPane_54Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(ngayBatDauLocCombobox_54, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(ngayKetThucLocCombobox_54, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addComponent(locButton, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78))
        );
        locPane_54Layout.setVerticalGroup(
            locPane_54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(locPane_54Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(locPane_54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(locButton, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(ngayBatDauLocCombobox_54, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ngayKetThucLocCombobox_54, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        jPanel2.add(locPane_54, "card2");

        javax.swing.GroupLayout dieukienlocPane_54Layout = new javax.swing.GroupLayout(dieukienlocPane_54);
        dieukienlocPane_54.setLayout(dieukienlocPane_54Layout);
        dieukienlocPane_54Layout.setHorizontalGroup(
            dieukienlocPane_54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dieukienlocPane_54Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(loaiCombobox_54, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        dieukienlocPane_54Layout.setVerticalGroup(
            dieukienlocPane_54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(dieukienlocPane_54Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(dieukienlocPane_54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(loaiCombobox_54, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        jButton2.setText("Refesh");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 679, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(199, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout lTkComponent_54Layout = new javax.swing.GroupLayout(lTkComponent_54);
        lTkComponent_54.setLayout(lTkComponent_54Layout);
        lTkComponent_54Layout.setHorizontalGroup(
            lTkComponent_54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dieukienlocPane_54, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        lTkComponent_54Layout.setVerticalGroup(
            lTkComponent_54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lTkComponent_54Layout.createSequentialGroup()
                .addComponent(dieukienlocPane_54, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        doanhthuPane_54.addTab("Lọc/Thống kê", lTkComponent_54);

        javax.swing.GroupLayout jPanel4_139Layout = new javax.swing.GroupLayout(jPanel4_139);
        jPanel4_139.setLayout(jPanel4_139Layout);
        jPanel4_139Layout.setHorizontalGroup(
            jPanel4_139Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(doanhthuPane_54, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4_139Layout.setVerticalGroup(
            jPanel4_139Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(doanhthuPane_54, javax.swing.GroupLayout.DEFAULT_SIZE, 421, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4_139, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4_139, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(header1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(header1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void yearComboBox_54ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearComboBox_54ActionPerformed
        
    }//GEN-LAST:event_yearComboBox_54ActionPerformed

    private void yearComboBox_54ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_yearComboBox_54ItemStateChanged
        dtTableModel_54.setRowCount(0);
        SetModeldtTable(handle_54.getAllDataHoaDon(yearComboBox_54.getSelectedItem().toString()));
    }//GEN-LAST:event_yearComboBox_54ItemStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dtTableModel_54.setRowCount(0);
        SetModeldtTable(handle_54.getAllDataHoaDon(yearComboBox_54.getSelectedItem().toString()));
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dtTableModel_54.setRowCount(0);
        SetModeldtTable(handle_54.getAllDataHoaDon(yearComboBox_54.getSelectedItem().toString()));
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel contentPane_54;
    private javax.swing.JPanel dieukienlocPane_54;
    private Quanlytaikhoan.component.MaterialTabbed doanhthuPane_54;
    private javax.swing.JPanel dtComponent_54;
    private javax.swing.JTable dtTable_54;
    private doanhthu.header header1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4_139;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel lTkComponent_54;
    private Quanlytaikhoan.component.ComboBoxSuggestion loaiCombobox_54;
    private Quanlytaikhoan.component.ComboBoxSuggestion loaiTKCombobox_54;
    private javax.swing.JButton locButton;
    private javax.swing.JPanel locPane_54;
    private com.toedter.calendar.JDateChooser ngayBatDauLocCombobox_54;
    private com.toedter.calendar.JDateChooser ngayKetThucLocCombobox_54;
    private javax.swing.JPanel sidebar_54;
    private Quanlytaikhoan.component.TextFieldAnimation textFieldAnimation1;
    private javax.swing.JPanel tkPane_54;
    private Quanlytaikhoan.component.ComboBoxSuggestion yearComboBox_54;
    // End of variables declaration//GEN-END:variables
}

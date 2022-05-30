/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trangchu.form;

import DAO_QLSP.Connect;
import Model_QLSP.Sanpham;
import Quanlysanpham.updateProduct;
import Services_QLSP.Services;
import java.awt.Image;
import java.beans.Statement;
import java.io.File;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author RAVEN
 */
public class Form_QuanLySanPham extends javax.swing.JPanel {

    Services services;
    DefaultTableModel defaultTableModel;
    Sanpham sanpham;

    public Form_QuanLySanPham() {

        initComponents();
        services = new Services();

        defaultTableModel = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        dgoon_productTable.setModel(defaultTableModel);

        defaultTableModel.addColumn("IDSP");
        defaultTableModel.addColumn("IDLoai");
        defaultTableModel.addColumn("TenSP");
        defaultTableModel.addColumn("Gia");
        defaultTableModel.addColumn("Mota");
        defaultTableModel.addColumn("Anh");

        setProductTableData(services.getAllSanpham());

    }

    private void setProductTableData(List<Sanpham> sanpham) {
        for (Sanpham sp : sanpham) {
            defaultTableModel.addRow(new Object[]{sp.getIDSP(), sp.getIDLoai(), sp.getTenSP(), sp.getGia(), sp.getMota(), sp.getAnh()});
        }

        dgoon_productTable.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (dgoon_productTable.getSelectedRow() >= 0) {
                    dgoon_txtIDSP.setText(dgoon_productTable.getValueAt(dgoon_productTable.getSelectedRow(), 0) + "");
                    dgoon_txtIDLoai.setText(dgoon_productTable.getValueAt(dgoon_productTable.getSelectedRow(), 1) + "");
                    dgoon_txtTenSP.setText(dgoon_productTable.getValueAt(dgoon_productTable.getSelectedRow(), 2) + "");
                    dgoon_txtGia.setText(dgoon_productTable.getValueAt(dgoon_productTable.getSelectedRow(), 3) + "");
                    dgoon_txtMota.setText(dgoon_productTable.getValueAt(dgoon_productTable.getSelectedRow(), 4) + "");
                    
                }
            }

        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton5 = new javax.swing.JButton();
        panelBorder1 = new Quanlysanpham.PanelBorder();
        menu1 = new Quanlysanpham.Menu();
        jPanel3 = new javax.swing.JPanel();
        dgoon_txtIDSP = new Quanlytaikhoan.component.TextField();
        dgoon_txtTenSP = new Quanlytaikhoan.component.TextField();
        dgoon_txtIDLoai = new Quanlytaikhoan.component.TextField();
        dgoon_txtGia = new Quanlytaikhoan.component.TextField();
        dgoon_btnThem = new Quanlysanpham.Button();
        dgoon_btnXoa = new Quanlysanpham.Button();
        btn_chonanh = new Quanlytaikhoan.component.Button();
        dgoon_btnSua = new Quanlytaikhoan.component.Button();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        dgoon_txtMota = new javax.swing.JTextArea();
        dgoon_btnRefresh = new Quanlysanpham.Button();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        dgoon_productTable = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        lblImage = new javax.swing.JLabel();
        dgoon_btnSearch = new Quanlysanpham.Button();
        searchBarTF = new Quanlytaikhoan.component.TextField();

        jButton5.setText("jButton1");

        setBackground(new java.awt.Color(242, 242, 242));

        panelBorder1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        dgoon_txtIDSP.setLabelText("ID Sản phẩm");

        dgoon_txtTenSP.setLabelText("Tên sản phẩm");

        dgoon_txtIDLoai.setLabelText("Mã loại");

        dgoon_txtGia.setLabelText("Giá");

        dgoon_btnThem.setText("Thêm");
        dgoon_btnThem.setRadius(40);
        dgoon_btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dgoon_btnThemActionPerformed(evt);
            }
        });

        dgoon_btnXoa.setText("Xóa");
        dgoon_btnXoa.setRadius(40);
        dgoon_btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dgoon_btnXoaActionPerformed(evt);
            }
        });

        btn_chonanh.setText("Chọn ảnh");
        btn_chonanh.setRadius(40);
        btn_chonanh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_chonanhActionPerformed(evt);
            }
        });

        dgoon_btnSua.setText("Sửa");
        dgoon_btnSua.setRadius(40);
        dgoon_btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dgoon_btnSuaActionPerformed(evt);
            }
        });

        jLabel2.setText("Mô tả");

        dgoon_txtMota.setColumns(20);
        dgoon_txtMota.setRows(5);
        jScrollPane2.setViewportView(dgoon_txtMota);

        dgoon_btnRefresh.setText("Refresh");
        dgoon_btnRefresh.setRadius(40);
        dgoon_btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dgoon_btnRefreshActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Danh sách sản phẩm", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 11))); // NOI18N

        dgoon_productTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(dgoon_productTable);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 30, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Quanlysanpham/quanjean.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblImage, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 219, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblImage, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 174, Short.MAX_VALUE)
        );

        dgoon_btnSearch.setText("Search");
        dgoon_btnSearch.setRadius(40);
        dgoon_btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dgoon_btnSearchActionPerformed(evt);
            }
        });

        searchBarTF.setLabelText("Tìm kiếm theo Mã sản phẩm");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(dgoon_txtIDLoai, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(dgoon_txtGia, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(dgoon_txtIDSP, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(dgoon_txtTenSP, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(130, 130, 130))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(searchBarTF, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(250, 250, 250)
                                .addComponent(btn_chonanh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(dgoon_btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(49, 49, 49)
                                .addComponent(dgoon_btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(dgoon_btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(dgoon_btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(dgoon_btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_chonanh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dgoon_txtTenSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dgoon_txtIDSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dgoon_txtIDLoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dgoon_txtGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(searchBarTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dgoon_btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dgoon_btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dgoon_btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dgoon_btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dgoon_btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelBorder1Layout = new javax.swing.GroupLayout(panelBorder1);
        panelBorder1.setLayout(panelBorder1Layout);
        panelBorder1Layout.setHorizontalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menu1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelBorder1Layout.setVerticalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addComponent(menu1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelBorder1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void dgoon_btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dgoon_btnXoaActionPerformed
        int row = dgoon_productTable.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(Form_QuanLySanPham.this, "Vui long chon user truoc", "Loi", JOptionPane.ERROR_MESSAGE);
        } else {
            int confirm = JOptionPane.showConfirmDialog(Form_QuanLySanPham.this, "Ban chac chan muon xoa khong?");

            if (confirm == JOptionPane.YES_OPTION) {
                String maSP = String.valueOf(dgoon_productTable.getValueAt(row, 0));

                services.deleteSanpham(maSP);

                defaultTableModel.setRowCount(0);
                setProductTableData(services.getAllSanpham());
            }
        }
    }//GEN-LAST:event_dgoon_btnXoaActionPerformed

    private void dgoon_btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dgoon_btnThemActionPerformed
        services = new Services();
        try {
            if (dgoon_txtIDSP.getText().equals("") || dgoon_txtIDLoai.getText().equals("") || dgoon_txtTenSP.getText().equals("")
                    || dgoon_txtGia.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "You need to input all fields!");
                return;
            }
            sanpham = new Sanpham();
            sanpham.setIDSP(Integer.valueOf(dgoon_txtIDSP.getText()));
            sanpham.setIDLoai(Integer.valueOf(dgoon_txtIDLoai.getText()));
            sanpham.setTenSP(dgoon_txtTenSP.getText());
            sanpham.setGia(Integer.valueOf(dgoon_txtGia.getText()));
            sanpham.setAnh(duongdananh);
            sanpham.setMota(dgoon_txtMota.getText());

            services.addSanpham(sanpham);
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error!");
        }


    }//GEN-LAST:event_dgoon_btnThemActionPerformed

    private void dgoon_btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dgoon_btnRefreshActionPerformed
        defaultTableModel.setRowCount(0);
        List<Sanpham> sanpham = services.getAllSanpham();

        for (Sanpham sp : sanpham) {
            defaultTableModel.addRow(new Object[]{sp.getIDSP(), sp.getIDLoai(), sp.getTenSP(), sp.getGia(), sp.getMota(), sp.getAnh()});
        }
    }//GEN-LAST:event_dgoon_btnRefreshActionPerformed

    private void dgoon_btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dgoon_btnSuaActionPerformed
        int row = dgoon_productTable.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(Form_QuanLySanPham.this, "Vui long chon user truoc", "Loi", JOptionPane.ERROR_MESSAGE);
        } else {
            int IDSP = Integer.valueOf(String.valueOf(dgoon_productTable.getValueAt(row, 0)));
            new updateProduct(IDSP).setVisible(true);
        }

    }//GEN-LAST:event_dgoon_btnSuaActionPerformed

    String duongdananh = "D:\\codejava\\quanlybanhang_java_swing-main\\src\\Quanlysanpham\\quanjean.png";

    public ImageIcon ResizeImage(String ImagePath) {
        ImageIcon MyImage = new ImageIcon(ImagePath);
        Image img = MyImage.getImage();
        Image newImg = img.getScaledInstance(lblImage.getWidth(), lblImage.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImg);
        return image;
    }


    private void btn_chonanhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_chonanhActionPerformed
        try {
            JFileChooser f = new JFileChooser("D:\\codejava\\quanlybanhang_java_swing-main\\src\\Quanlysanpham");
            f.setDialogTitle("Mở file");
            f.showOpenDialog(null);
            File ftenanh = f.getSelectedFile();
            duongdananh = ftenanh.getAbsolutePath();

            lblImage.setIcon(ResizeImage(String.valueOf(duongdananh)));
            System.out.println(duongdananh);

        } catch (Exception ex) {
            System.out.println("chưa chọn ảnh");
            System.out.println(duongdananh);
        }
    }//GEN-LAST:event_btn_chonanhActionPerformed

    private void dgoon_btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dgoon_btnSearchActionPerformed
        Connection connection = Connect.getJDBCConection();

        Statement st = null;
        ResultSet rs = null;
        try {
            // Câu lệnh xem dữ liệu
            String sql = "SELECT * FROM san_pham";

            // Nếu tìm kiếm theo title
            if (searchBarTF.getText().length() > 0) {
                sql = sql + " where ma_san_pham like '%" + searchBarTF.getText() + "%'";
            }

            // Tạo đối tượng thực thi câu lệnh Select
            // Thực thi 
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            rs = preparedStatement.executeQuery();
            Vector data = null;

            defaultTableModel.setRowCount(0);

            // Nếu sách không tồn tại
            if (rs.isBeforeFirst() == false) {
                JOptionPane.showMessageDialog(this, "Sản phẩm không tồn tại");
                return;
            }

            // Trong khi chưa hết dữ liệu
            while (rs.next()) {
                data = new Vector();
                data.add(rs.getInt("ma_san_pham"));
                data.add(rs.getInt("ma_loai"));
                data.add(rs.getString("ten_san_pham"));
                data.add(rs.getInt("gia"));
                data.add(rs.getString("Mo_ta"));
                data.add(rs.getString("Hinhanh"));

                // Thêm một dòng vào table model
                defaultTableModel.addRow(data);
            }

            dgoon_productTable.setModel(defaultTableModel); // Thêm dữ liệu vào table
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_dgoon_btnSearchActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Quanlytaikhoan.component.Button btn_chonanh;
    private Quanlysanpham.Button dgoon_btnRefresh;
    private Quanlysanpham.Button dgoon_btnSearch;
    private Quanlytaikhoan.component.Button dgoon_btnSua;
    private Quanlysanpham.Button dgoon_btnThem;
    private Quanlysanpham.Button dgoon_btnXoa;
    private javax.swing.JTable dgoon_productTable;
    private Quanlytaikhoan.component.TextField dgoon_txtGia;
    private Quanlytaikhoan.component.TextField dgoon_txtIDLoai;
    private Quanlytaikhoan.component.TextField dgoon_txtIDSP;
    private javax.swing.JTextArea dgoon_txtMota;
    private Quanlytaikhoan.component.TextField dgoon_txtTenSP;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblImage;
    private Quanlysanpham.Menu menu1;
    private Quanlysanpham.PanelBorder panelBorder1;
    private Quanlytaikhoan.component.TextField searchBarTF;
    // End of variables declaration//GEN-END:variables

}

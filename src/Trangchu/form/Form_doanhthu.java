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
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import Quanlytaikhoan.component.EventCallBack;
import Quanlytaikhoan.component.EventTextField;
/**
 *
 * @author RAVEN
 */
public class Form_doanhthu extends javax.swing.JPanel {
    private DoanhThuFunctionHandler handle_54;
    private DefaultComboBoxModel yearCBModel_54;
    private DefaultTableModel dtTableModel_54 ,locTableModel_54;
    
    /**
     * Creates new form Form_1
     */
    public Form_doanhthu() {
        
        handle_54 = new DoanhThuFunctionHandler();
        dtTableModel_54 = new DefaultTableModel();
        locTableModel_54 = new DefaultTableModel();
        
        
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
        
        
        //data loc table
        locTableModel_54 = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false; // khong cho phep nguoi dung Edit du lieu trong bang
            }
            
        };
        locTableModel_54.addColumn("Ngày");
        locTableModel_54.addColumn("Mã khách hàng");
        locTableModel_54.addColumn("Mã sản phẩm");
        locTableModel_54.addColumn("Số Lượng");
        locTableModel_54.addColumn("Đơn giá");
        locTableModel_54.addColumn("Tổng thu");
        locTable_54.setModel(locTableModel_54);
        
        
        //search 
        searchbar_54.addEvent(new EventTextField() {
            @Override
            public void onPressed(EventCallBack call) {
                //  Test
                try {
                    locTableModel_54.setRowCount(0);
                    setModellocTable(handle_54.GetResultSearch(loaiTKCombobox_54.getSelectedItem().toString(),searchbar_54.getText()));
                    
                    for (int i = 1; i <= 100; i++) {
                        Thread.sleep(10);
                    }
                    call.done();
                } catch (Exception e) {
                    System.err.println(e);
                }
            }

            @Override
            public void onCancel() {

            }
        });
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
    
    public void setModellocTable(List<DoanhThu> dts_54) {
        if(dts_54.equals(null)) {
            System.out.println("Không có dữ liệu locTable!");
            return;
        }
        for(DoanhThu dt_54 : dts_54) {
           locTableModel_54.addRow(new Object[] {dt_54.getNgayHD_54(),dt_54.getMaKH_54()
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
        searchbar_54 = new Quanlytaikhoan.component.TextFieldAnimation();
        jLabel4 = new javax.swing.JLabel();
        loaiTKCombobox_54 = new Quanlytaikhoan.component.ComboBoxSuggestion();
        locPane_54 = new javax.swing.JPanel();
        locButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        ngayBatDauLocCombobox_54 = new com.toedter.calendar.JDateChooser();
        ngayKetThucLocCombobox_54 = new com.toedter.calendar.JDateChooser();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        locTable_54 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();

        jButton5.setText("jButton1");

        setBackground(new java.awt.Color(255, 255, 255));
        setOpaque(false);

        jPanel4_139.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel4_139.setOpaque(false);

        dtComponent_54.setLayout(new java.awt.BorderLayout());

        sidebar_54.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        sidebar_54.setPreferredSize(new java.awt.Dimension(200, 390));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
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
                .addContainerGap(318, Short.MAX_VALUE))
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
        dtTable_54.setOpaque(false);
        dtTable_54.setRowHeight(30);
        dtTable_54.setRowSelectionAllowed(false);
        dtTable_54.setSelectionBackground(new java.awt.Color(255, 255, 204));
        dtTable_54.setShowVerticalLines(true);
        jScrollPane1.setViewportView(dtTable_54);

        jButton1.setBackground(new java.awt.Color(0, 204, 51));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Refesh");
        jButton1.setToolTipText("");
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
                .addContainerGap(19, Short.MAX_VALUE))
        );

        dtComponent_54.add(contentPane_54, java.awt.BorderLayout.CENTER);

        doanhthuPane_54.addTab("Doanh thu", dtComponent_54);

        dieukienlocPane_54.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Loại");

        loaiCombobox_54.setEditable(false);
        loaiCombobox_54.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Tìm kiếm", "Lọc" }));
        loaiCombobox_54.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                loaiCombobox_54ItemStateChanged(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(new java.awt.CardLayout());

        searchbar_54.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchbar_54ActionPerformed(evt);
            }
        });

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
                    .addComponent(searchbar_54, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
        );
        tkPane_54Layout.setVerticalGroup(
            tkPane_54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tkPane_54Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(searchbar_54, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(tkPane_54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(loaiTKCombobox_54, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(tkPane_54, "card2");

        locButton.setBackground(new java.awt.Color(0, 204, 0));
        locButton.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        locButton.setForeground(new java.awt.Color(255, 255, 255));
        locButton.setText("Lọc");
        locButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                locButtonActionPerformed(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(0, 204, 0));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 255));
        jLabel5.setText("Ngày bắt đầu :");

        jLabel6.setBackground(new java.awt.Color(0, 204, 0));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 255));
        jLabel6.setText("Ngày kết thúc :");

        ngayBatDauLocCombobox_54.setDateFormatString("yyyy-MM-dd");

        ngayKetThucLocCombobox_54.setDateFormatString("yyyy-MM-dd");

        javax.swing.GroupLayout locPane_54Layout = new javax.swing.GroupLayout(locPane_54);
        locPane_54.setLayout(locPane_54Layout);
        locPane_54Layout.setHorizontalGroup(
            locPane_54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(locPane_54Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(locPane_54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(ngayBatDauLocCombobox_54, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(102, 102, 102)
                .addGroup(locPane_54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ngayKetThucLocCombobox_54, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(75, 75, 75)
                .addComponent(locButton, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        locPane_54Layout.setVerticalGroup(
            locPane_54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(locPane_54Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(locPane_54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(locButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(locPane_54Layout.createSequentialGroup()
                        .addGroup(locPane_54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(locPane_54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ngayBatDauLocCombobox_54, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ngayKetThucLocCombobox_54, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(22, 22, 22))
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

        locTable_54.setModel(new javax.swing.table.DefaultTableModel(
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
        locTable_54.setRowHeight(30);
        locTable_54.setSelectionBackground(new java.awt.Color(255, 255, 204));
        locTable_54.setShowVerticalLines(true);
        jScrollPane2.setViewportView(locTable_54);

        jButton2.setBackground(new java.awt.Color(0, 204, 0));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
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
                .addComponent(jScrollPane2)
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(197, Short.MAX_VALUE))
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
            .addComponent(doanhthuPane_54, javax.swing.GroupLayout.DEFAULT_SIZE, 429, Short.MAX_VALUE)
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
        String beginDay_54 = ((JTextField)ngayBatDauLocCombobox_54.getDateEditor().getUiComponent()).getText();
        String endDay_54 = ((JTextField)ngayKetThucLocCombobox_54.getDateEditor().getUiComponent()).getText();
        locTableModel_54.setRowCount(0);
        setModellocTable(handle_54.getAllDataHoaDonDK(beginDay_54, endDay_54));
    }//GEN-LAST:event_jButton2ActionPerformed

    private void loaiCombobox_54ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_loaiCombobox_54ItemStateChanged
        if(loaiCombobox_54.getSelectedItem().toString().equals("Tìm kiếm")) {
            tkPane_54.setVisible(true);
            locPane_54.setVisible(false);
        } else {
            tkPane_54.setVisible(false);
            locPane_54.setVisible(true);
        }
    }//GEN-LAST:event_loaiCombobox_54ItemStateChanged

    private void locButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_locButtonActionPerformed
        String beginDay_54 = ((JTextField)ngayBatDauLocCombobox_54.getDateEditor().getUiComponent()).getText();
        String endDay_54 = ((JTextField)ngayKetThucLocCombobox_54.getDateEditor().getUiComponent()).getText();
        if(beginDay_54.equals("") || endDay_54.equals("")) {
            JOptionPane.showMessageDialog(null,"Vui lòng nhập ngày bắt đầu và ngày kết thúc!");
            return;
        }
        
        String[] nBD_54 = beginDay_54.split("-");
        String[] nKT_54 = endDay_54.split("-");
        
        if(Integer.valueOf(nBD_54[0]) >  Integer.valueOf(nKT_54[0])) {
            JOptionPane.showMessageDialog(null,"Lỗi!\nNgày bắt đầu không được nhỏ hơn ngày kết thúc.");
            return;
        } else if(Integer.valueOf(nBD_54[0]).equals(Integer.valueOf(nKT_54[0]))){
            if(Integer.valueOf(nBD_54[1]) >  Integer.valueOf(nKT_54[1])){
                JOptionPane.showMessageDialog(null,"Lỗi!\nNgày bắt đầu không được nhỏ hơn ngày kết thúc.");
                return;
            } else if(Integer.valueOf(nBD_54[1]).equals(Integer.valueOf(nKT_54[1]))){
                if(Integer.valueOf(nBD_54[2]) >  Integer.valueOf(nKT_54[2])){
                    JOptionPane.showMessageDialog(null,"Lỗi!\nNgày bắt đầu không được nhỏ hơn ngày kết thúc.");
                    return;
                } else {
                    locTableModel_54.setRowCount(0);
                    setModellocTable(handle_54.getAllDataHoaDonDK(beginDay_54, endDay_54));
                }
            } else {
                locTableModel_54.setRowCount(0);
                setModellocTable(handle_54.getAllDataHoaDonDK(beginDay_54, endDay_54));
            }
        } else {
            locTableModel_54.setRowCount(0);
            setModellocTable(handle_54.getAllDataHoaDonDK(beginDay_54, endDay_54));
        }
    }//GEN-LAST:event_locButtonActionPerformed

    private void searchbar_54ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchbar_54ActionPerformed
        
    }//GEN-LAST:event_searchbar_54ActionPerformed


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
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4_139;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel lTkComponent_54;
    private Quanlytaikhoan.component.ComboBoxSuggestion loaiCombobox_54;
    private Quanlytaikhoan.component.ComboBoxSuggestion loaiTKCombobox_54;
    private javax.swing.JButton locButton;
    private javax.swing.JPanel locPane_54;
    private javax.swing.JTable locTable_54;
    private com.toedter.calendar.JDateChooser ngayBatDauLocCombobox_54;
    private com.toedter.calendar.JDateChooser ngayKetThucLocCombobox_54;
    private Quanlytaikhoan.component.TextFieldAnimation searchbar_54;
    private javax.swing.JPanel sidebar_54;
    private javax.swing.JPanel tkPane_54;
    private Quanlytaikhoan.component.ComboBoxSuggestion yearComboBox_54;
    // End of variables declaration//GEN-END:variables
}

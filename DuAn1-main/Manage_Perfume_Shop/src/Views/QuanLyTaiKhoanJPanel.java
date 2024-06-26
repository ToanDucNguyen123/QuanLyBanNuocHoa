/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Views;

import Services.QuanLyTaiKhoanService;
import Services.QuanLyTaiKhoanServiceImpl;
import Ultilities.EmailValidator;

import ViewModels.TaiKhoanViews;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;

import javax.mail.Authenticator;
import javax.mail.BodyPart;
import javax.mail.Message;

import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;

import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.glxn.qrgen.QRCode;
import net.glxn.qrgen.image.ImageType;
/**
 *
 * @author DELL
 */
public class QuanLyTaiKhoanJPanel extends javax.swing.JPanel {

    QuanLyTaiKhoanService quanLyTaiKhoanService = new QuanLyTaiKhoanServiceImpl();
    DefaultTableModel model;
    DefaultComboBoxModel cboModel;
    ArrayList<TaiKhoanViews> listTaiKhoan = quanLyTaiKhoanService.findAll();
    int index;
    static final String from = "iamnguyenduythanhnam@gmail.com";
    /**
     * Creates new form TrangChuJPanel
     */
    public QuanLyTaiKhoanJPanel() {
        initComponents();
        loadData();
        loadComboBoxRole();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTaiKhoan = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cboIdLoaiNguoiDung = new javax.swing.JComboBox<>();
        txtEmail = new javax.swing.JTextField();
        txtHoTen = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtMatKhau = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cboTrangThai = new javax.swing.JComboBox<>();
        jPanel5 = new javax.swing.JPanel();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(1100, 780));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Danh sách tài khoản "));

        tblTaiKhoan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Loại Người Dùng", "Email", "Mật khẩu", "Họ tên", "Ngày thêm", "Ngày sửa", "Tình trạng"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblTaiKhoan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblTaiKhoanMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblTaiKhoan);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 938, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Thông tin tài khoản "));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Loại người dùng");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Họ tên");

        cboIdLoaiNguoiDung.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txtEmail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txtHoTen.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Email");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Mật khẩu");

        txtMatKhau.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Trạng thái");

        cboTrangThai.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cboTrangThai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Còn hoạt động", "Không còn hoạt động" }));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cboIdLoaiNguoiDung, 0, 253, Short.MAX_VALUE)
                    .addComponent(txtHoTen))
                .addGap(41, 41, 41)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7))
                        .addGap(44, 44, 44)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtMatKhau)
                            .addComponent(cboTrangThai, 0, 289, Short.MAX_VALUE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboIdLoaiNguoiDung, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(27, 27, 27)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(29, 29, 29)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cboTrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        btnThem.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Them.png"))); // NOI18N
        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnSua.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Sua.png"))); // NOI18N
        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnXoa.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Xoa.png"))); // NOI18N
        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnThem)
                    .addComponent(btnSua)
                    .addComponent(btnXoa))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnSua, btnThem, btnXoa});

        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(btnThem)
                .addGap(28, 28, 28)
                .addComponent(btnSua)
                .addGap(32, 32, 32)
                .addComponent(btnXoa)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(211, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(84, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1240, 800));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1092, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 780, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tblTaiKhoanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblTaiKhoanMouseClicked
        index = tblTaiKhoan.getSelectedRow();
        fillToText();
    }//GEN-LAST:event_tblTaiKhoanMouseClicked

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        String mss = "";
        int hoi = JOptionPane.showConfirmDialog(this, "Bạn có muốn thêm không?");
        if(hoi != JOptionPane.YES_OPTION){
            return;
        }
        if (txtEmail.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập email");
            return;
        }
        EmailValidator emailValid = new EmailValidator();
        if (!emailValid.validate(txtEmail.getText().trim())) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập email khả dụng");
            return;
        }
        if (quanLyTaiKhoanService.checkEmailMatch(txtEmail.getText())) {
            JOptionPane.showMessageDialog(this, "Email đã tồn tại");
            return;
        }
        if (txtHoTen.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập họ tên");
            return;
        }
        if (txtMatKhau.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập mật khẩu");
            return;
        }
        TaiKhoanViews taiKhoanViews = new TaiKhoanViews(txtEmail.getText(), txtMatKhau.getText(), txtHoTen.getText(), "" + cboIdLoaiNguoiDung.getSelectedItem(), cboTrangThai.getSelectedItem().toString().equals("Còn hoạt động") ? 1 : 0);
        mss = quanLyTaiKhoanService.addTaiKhoan(taiKhoanViews);
        loadData();
        JOptionPane.showMessageDialog(this, mss);
        String idQR = quanLyTaiKhoanService.getIDByEmail(txtEmail.getText());
        try {
            ByteArrayOutputStream out = QRCode.from(idQR).to(ImageType.PNG).stream();
            String f_name = idQR;
            String path_name = "D:\\QRCode\\QrCode";
            FileOutputStream fos = new FileOutputStream(new File(path_name + (f_name + ".PNG")));
            fos.write(out.toByteArray());
            fos.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }

        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com"); // SMTP HOST
        props.put("mail.smtp.port", "587"); // TLS 587 SSL 465
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.ssl.trust", "smtp.gmail.com");
        Authenticator auth = new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                // TODO Auto-generated method stub
                return new PasswordAuthentication("toanndth00186@fpt.edu.vn", "phgxktloxxcwbgwt");
            }
        };
        Session session = Session.getInstance(props, auth);
        MimeMessage msg = new MimeMessage(session);
        try {
            msg.addHeader("Content-type", "text/HTML; charset=UTF-8");
            msg.setFrom(new InternetAddress(from));
            msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(txtEmail.getText(), false));
            msg.setSubject("Tài khoản nhân viên tại Perfume");
            msg.setSentDate(new Date());
            Multipart multipart = new MimeMultipart();
            BodyPart bodyPart = new MimeBodyPart();
            bodyPart.setContent("<!DOCTYPE html>\r\n"
                + "<html>\r\n"
                + "<body>\r\n"
                + "\r\n"
                + "<h2>Chào " + txtHoTen.getText() + ",</h2>\r\n"
                + "<p>Đây là thông tin tài khoản dành cho " + cboIdLoaiNguoiDung.getSelectedItem().toString() + " tại cửa hàng của bạn, vui lòng sử dụng tài khoản này để đăng nhập trong quá trình làm việc tại cửa hàng</p>\r\n"
                + "<p>Tài khoản: " + txtEmail.getText() + "</p> \r\n"
                + "<p>Mật khẩu: " + txtMatKhau.getText() + "</p> \r\n"
                + "<p>Bạn sẽ sử dụng mã QR dưới đây để xác thực cho mỗi lần truy cập ứng dụng tại cửa hàng, vui lòng lưu về máy! </p> \r\n"
                + "\r\n"
                + "</body>\r\n"
                + "</html>", "text/HTML; charset=UTF-8");
            multipart.addBodyPart(bodyPart);
            for (int i = 0; i < 1; i++) {
                DataSource dataSource = new FileDataSource("D:\\QRCode\\QrCode" + idQR + ".PNG");
                    MimeBodyPart mimeBodyPart = new MimeBodyPart();
                    mimeBodyPart.setDataHandler(new DataHandler(dataSource));
                    mimeBodyPart.setFileName(idQR);
                    multipart.addBodyPart(mimeBodyPart);
                }
                msg.setContent(multipart);
                Transport.send(msg);
            } catch (Exception e) {
                e.printStackTrace();
            }
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        int hoi = JOptionPane.showConfirmDialog(this, "Bạn có muốn sửa không?");
        if(hoi != JOptionPane.YES_OPTION){
            return;
        }
        if (txtEmail.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập email");
            return;
        }
        EmailValidator emailValid = new EmailValidator();
        if (!emailValid.validate(txtEmail.getText().trim())) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập email khả dụng");
            return;
        }
        
        if (txtHoTen.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập họ tên");
            return;
        }
        if (txtMatKhau.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập mật khẩu");
            return;
        }
        String mss = "";
        TaiKhoanViews taiKhoanViews = new TaiKhoanViews(listTaiKhoan.get(index).getIdTaiKhoan(), txtEmail.getText(), txtMatKhau.getText(), txtHoTen.getText(), cboIdLoaiNguoiDung.getSelectedItem().toString(), cboTrangThai.getSelectedItem().toString().equals("Còn hoạt động") ? 1 : 0);
        mss = quanLyTaiKhoanService.updateTaiKhoan(taiKhoanViews);
        loadData();

        JOptionPane.showMessageDialog(this, mss);
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        int hoi = JOptionPane.showConfirmDialog(this, "Bạn có muốn xóa không?");
        if(hoi != JOptionPane.YES_OPTION){
            return;
        }
        String mss = "";
        mss = quanLyTaiKhoanService.deleteTaiKhoan(listTaiKhoan.get(index).getIdTaiKhoan());
        JOptionPane.showMessageDialog(this, mss);
        loadData();
    }//GEN-LAST:event_btnXoaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JComboBox<String> cboIdLoaiNguoiDung;
    private javax.swing.JComboBox<String> cboTrangThai;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblTaiKhoan;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtHoTen;
    private javax.swing.JTextField txtMatKhau;
    // End of variables declaration//GEN-END:variables

    private void loadData() {
        model = (DefaultTableModel) tblTaiKhoan.getModel();
        model.setRowCount(0);
        listTaiKhoan = quanLyTaiKhoanService.findAll();
        for (TaiKhoanViews taiKhoanViews : listTaiKhoan) {
            model.addRow(new Object[]{
                taiKhoanViews.getTenLoaiNguoiDung(),
                taiKhoanViews.getEmail(),
                taiKhoanViews.getMatKhau(),
                taiKhoanViews.getHoTen(),
                taiKhoanViews.getNgayThem(),
                taiKhoanViews.getNgaySua(),
                taiKhoanViews.getTinhTrang() == 1 ? "Còn hoạt động" : "Không còn hoạt động"
            });
        }
    }

    private void loadComboBoxRole() {
        cboModel = (DefaultComboBoxModel) cboIdLoaiNguoiDung.getModel();
        ArrayList<String> listTenLoaiNguoiDung = quanLyTaiKhoanService.getAllTenLoaiNguoiDung();
        for (String string : listTenLoaiNguoiDung) {
            cboModel.addElement(string);
        }
    }

    private void fillToText() {
     
        cboIdLoaiNguoiDung.setSelectedItem(listTaiKhoan.get(index).getTenLoaiNguoiDung());
        cboTrangThai.setSelectedItem(listTaiKhoan.get(index).getTinhTrang()== 1 ? "Còn hoạt động" : "Không còn hoạt động");
        txtEmail.setText(listTaiKhoan.get(index).getEmail());
        txtHoTen.setText(listTaiKhoan.get(index).getHoTen());
        txtMatKhau.setText(listTaiKhoan.get(index).getMatKhau());
    }
}

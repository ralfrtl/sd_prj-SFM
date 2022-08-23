
package Frames;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;
import java.nio.file.*;
import java.sql.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.filechooser.*;
import java.util.regex.*;
import javax.swing.table.DefaultTableModel;
import org.apache.commons.io.*;
import org.apache.poi.xwpf.extractor.*;
import org.apache.poi.xwpf.usermodel.*;

public final class Home extends javax.swing.JFrame {

    Connection con = DB.Connector();
    Statement st = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    
    static String user_port = "";
    static String user_ip = "";
    static String user_name = "";
    static String user_id = "";
    
    static int count_result = 0;
    
    ChangePass CP;
    Logs L;
    
    Socket connection;
        
    public Home() {
        initComponents();
        button_search.requestFocus();
        scrollpane_folderview.getVerticalScrollBar().setUnitIncrement(15);
        
        Dimension Screen_Size = Toolkit.getDefaultToolkit().getScreenSize();
        Insets Available_Screen_Size = Toolkit.getDefaultToolkit().getScreenInsets(getGraphicsConfiguration());
        int Taskbar = Available_Screen_Size.bottom;
        this.setPreferredSize(new Dimension((int)Screen_Size.getWidth(),(int)Screen_Size.getHeight()-Taskbar));
        this.setSize((int)Screen_Size.getWidth(),(int)Screen_Size.getHeight()-Taskbar);
        this.setLocation(0,0);
                                
        panel_canvas.removeAll();
        panel_canvas.add(panel_myfiles);
        panel_folderview.removeAll();
        MyFiles(new File("src\\root"));
        
//        new Timer(1000, new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent ae) {
//                OtherUserList();
//                revalidate();
//                repaint();
//            }
//        }).start();

        revalidate();
        repaint();
        
        CP = new ChangePass();
        L = new Logs();
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popupmenu_profile = new javax.swing.JPopupMenu();
        menu_changepass = new javax.swing.JMenuItem();
        menu_logs = new javax.swing.JMenuItem();
        View = new javax.swing.ButtonGroup();
        FileNameExtensionFilter filter = new FileNameExtensionFilter(
            "Word Documents", "docx", "docm", "dotx", "dotm", "docb", "doc", "dot", "wbk");
        filechooser_myfiles = new javax.swing.JFileChooser();
        panel_myfiles = new javax.swing.JPanel();
        panel_myfiles_nb = new javax.swing.JPanel();
        label_currentfolder_myfiles = new javax.swing.JLabel();
        combobox_filter_myfiles = new javax.swing.JComboBox<>();
        button_back_myfiles = new javax.swing.JButton();
        button_addfilemyfiles = new javax.swing.JButton();
        button_addfoldermyfiles = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        scrollpane_folderview = new javax.swing.JScrollPane();
        panel_folderview = new javax.swing.JPanel();
        label_address_myfiles = new javax.swing.JLabel();
        panel_otheruserfiles = new javax.swing.JPanel();
        panel_otheruser_nb = new javax.swing.JPanel();
        label_currentfolder_otheruser = new javax.swing.JLabel();
        button_back_otheruser = new javax.swing.JButton();
        scrollpane_folderview_otheruser = new javax.swing.JScrollPane();
        panel_folderview_otheruser = new javax.swing.JPanel();
        label_address_otheruser = new javax.swing.JLabel();
        panel_result = new javax.swing.JPanel();
        panel_result_nb = new javax.swing.JPanel();
        label_result = new javax.swing.JLabel();
        scrollpane_folderview_reult = new javax.swing.JScrollPane();
        panel_folderview_result = new javax.swing.JPanel();
        panel_recent = new javax.swing.JPanel();
        panel_recent_nb = new javax.swing.JPanel();
        label_recent = new javax.swing.JLabel();
        button_clearlist = new javax.swing.JButton();
        scrollpabe_recent = new javax.swing.JScrollPane();
        table_recent = new javax.swing.JTable();
        panel_trash = new javax.swing.JPanel();
        panel_trash_nb = new javax.swing.JPanel();
        label_trash = new javax.swing.JLabel();
        scrollpane_folderview_trash = new javax.swing.JScrollPane();
        panel_folderview_trash = new javax.swing.JPanel();
        NB = new javax.swing.JPanel();
        label_logo_colm = new javax.swing.JLabel();
        label_logo = new javax.swing.JLabel();
        panel_search = new javax.swing.JPanel();
        input_search = new javax.swing.JTextField();
        button_search = new javax.swing.JButton();
        label_user = new javax.swing.JLabel();
        button_minimize = new javax.swing.JButton();
        button_signout = new javax.swing.JButton();
        BG = new javax.swing.JPanel();
        TABS = new javax.swing.JPanel();
        Drive1 = new javax.swing.JRadioButton();
        Drive2 = new javax.swing.JRadioButton();
        Drive3 = new javax.swing.JRadioButton();
        scrollpane_otheruser = new javax.swing.JScrollPane();
        panel_otheruser = new javax.swing.JPanel();
        separator_middle = new javax.swing.JSeparator();
        panel_canvas = new javax.swing.JPanel();

        menu_changepass.setBackground(new java.awt.Color(255, 255, 255));
        menu_changepass.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        menu_changepass.setForeground(new java.awt.Color(8, 65, 26));
        menu_changepass.setText("Change Password");
        menu_changepass.setToolTipText("");
        menu_changepass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_changepassActionPerformed(evt);
            }
        });
        popupmenu_profile.add(menu_changepass);

        menu_logs.setBackground(new java.awt.Color(255, 255, 255));
        menu_logs.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        menu_logs.setForeground(new java.awt.Color(8, 65, 26));
        menu_logs.setText("Login Logs");
        menu_logs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_logsActionPerformed(evt);
            }
        });
        popupmenu_profile.add(menu_logs);

        filechooser_myfiles.setFileFilter(filter);
        filechooser_myfiles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filechooser_myfilesActionPerformed(evt);
            }
        });

        panel_myfiles.setBackground(new java.awt.Color(245, 245, 245));
        panel_myfiles.setForeground(new java.awt.Color(255, 255, 255));

        panel_myfiles_nb.setBackground(new java.awt.Color(0, 155, 52));
        panel_myfiles_nb.setForeground(new java.awt.Color(255, 255, 255));

        label_currentfolder_myfiles.setBackground(new java.awt.Color(255, 255, 255));
        label_currentfolder_myfiles.setFont(new java.awt.Font("Segoe UI", 1, 25)); // NOI18N
        label_currentfolder_myfiles.setForeground(new java.awt.Color(255, 255, 255));
        label_currentfolder_myfiles.setText("root");
        label_currentfolder_myfiles.setToolTipText("Current Folder");
        label_currentfolder_myfiles.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        label_currentfolder_myfiles.setName("0"); // NOI18N
        label_currentfolder_myfiles.setPreferredSize(new java.awt.Dimension(200, 40));
        label_currentfolder_myfiles.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                label_currentfolder_myfilesMouseReleased(evt);
            }
        });

        combobox_filter_myfiles.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        combobox_filter_myfiles.setForeground(new java.awt.Color(0, 155, 52));
        combobox_filter_myfiles.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Name asc", "Name desc", "Date asc", "Date desc" }));
        combobox_filter_myfiles.setToolTipText("Filter");
        combobox_filter_myfiles.setBorder(null);
        combobox_filter_myfiles.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        combobox_filter_myfiles.setMinimumSize(new java.awt.Dimension(150, 40));
        combobox_filter_myfiles.setOpaque(false);
        combobox_filter_myfiles.setPreferredSize(new java.awt.Dimension(120, 40));
        combobox_filter_myfiles.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combobox_filter_myfilesItemStateChanged(evt);
            }
        });

        button_back_myfiles.setBackground(new java.awt.Color(255, 255, 255));
        button_back_myfiles.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        button_back_myfiles.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sys Img/Icon/Back.png"))); // NOI18N
        button_back_myfiles.setToolTipText("Back");
        button_back_myfiles.setBorder(null);
        button_back_myfiles.setContentAreaFilled(false);
        button_back_myfiles.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button_back_myfiles.setFocusPainted(false);
        button_back_myfiles.setPreferredSize(new java.awt.Dimension(40, 40));
        button_back_myfiles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_back_myfilesActionPerformed(evt);
            }
        });

        button_addfilemyfiles.setBackground(new java.awt.Color(255, 255, 255));
        button_addfilemyfiles.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        button_addfilemyfiles.setForeground(new java.awt.Color(255, 255, 255));
        button_addfilemyfiles.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sys Img/Icon/Microsoft Word.png"))); // NOI18N
        button_addfilemyfiles.setText("Import New File");
        button_addfilemyfiles.setToolTipText("Import New File");
        button_addfilemyfiles.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        button_addfilemyfiles.setContentAreaFilled(false);
        button_addfilemyfiles.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button_addfilemyfiles.setFocusPainted(false);
        button_addfilemyfiles.setPreferredSize(new java.awt.Dimension(150, 40));
        button_addfilemyfiles.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                button_addfilemyfilesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                button_addfilemyfilesMouseExited(evt);
            }
        });
        button_addfilemyfiles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_addfilemyfilesActionPerformed(evt);
            }
        });

        button_addfoldermyfiles.setBackground(new java.awt.Color(255, 255, 255));
        button_addfoldermyfiles.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        button_addfoldermyfiles.setForeground(new java.awt.Color(255, 255, 255));
        button_addfoldermyfiles.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sys Img/Icon/Folder Add.png"))); // NOI18N
        button_addfoldermyfiles.setText("New Folder");
        button_addfoldermyfiles.setToolTipText("New Folder");
        button_addfoldermyfiles.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        button_addfoldermyfiles.setContentAreaFilled(false);
        button_addfoldermyfiles.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button_addfoldermyfiles.setFocusPainted(false);
        button_addfoldermyfiles.setPreferredSize(new java.awt.Dimension(150, 40));
        button_addfoldermyfiles.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                button_addfoldermyfilesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                button_addfoldermyfilesMouseExited(evt);
            }
        });
        button_addfoldermyfiles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_addfoldermyfilesActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Filter:");
        jLabel1.setPreferredSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout panel_myfiles_nbLayout = new javax.swing.GroupLayout(panel_myfiles_nb);
        panel_myfiles_nb.setLayout(panel_myfiles_nbLayout);
        panel_myfiles_nbLayout.setHorizontalGroup(
            panel_myfiles_nbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_myfiles_nbLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(button_back_myfiles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(label_currentfolder_myfiles, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                .addGap(20, 20, 20)
                .addComponent(button_addfoldermyfiles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(button_addfilemyfiles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(combobox_filter_myfiles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        panel_myfiles_nbLayout.setVerticalGroup(
            panel_myfiles_nbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_myfiles_nbLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(panel_myfiles_nbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(button_back_myfiles, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel_myfiles_nbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(label_currentfolder_myfiles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(button_addfoldermyfiles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(button_addfilemyfiles, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(combobox_filter_myfiles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(5, 5, 5))
        );

        scrollpane_folderview.setBackground(new java.awt.Color(245, 245, 245));
        scrollpane_folderview.setBorder(null);
        scrollpane_folderview.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scrollpane_folderview.setPreferredSize(new java.awt.Dimension(10, 250));
        scrollpane_folderview.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                scrollpane_folderviewMouseReleased(evt);
            }
        });
        scrollpane_folderview.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                scrollpane_folderviewComponentResized(evt);
            }
        });

        panel_folderview.setBackground(new java.awt.Color(245, 245, 245));
        panel_folderview.setForeground(new java.awt.Color(255, 255, 255));
        panel_folderview.setPreferredSize(new java.awt.Dimension(0, 0));
        panel_folderview.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0));
        scrollpane_folderview.setViewportView(panel_folderview);

        label_address_myfiles.setBackground(new java.awt.Color(0, 155, 52));
        label_address_myfiles.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        label_address_myfiles.setForeground(new java.awt.Color(255, 255, 255));
        label_address_myfiles.setOpaque(true);
        label_address_myfiles.setPreferredSize(new java.awt.Dimension(41, 20));

        javax.swing.GroupLayout panel_myfilesLayout = new javax.swing.GroupLayout(panel_myfiles);
        panel_myfiles.setLayout(panel_myfilesLayout);
        panel_myfilesLayout.setHorizontalGroup(
            panel_myfilesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_myfiles_nb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_myfilesLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(scrollpane_folderview, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(label_address_myfiles, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panel_myfilesLayout.setVerticalGroup(
            panel_myfilesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_myfilesLayout.createSequentialGroup()
                .addComponent(panel_myfiles_nb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(scrollpane_folderview, javax.swing.GroupLayout.DEFAULT_SIZE, 415, Short.MAX_VALUE)
                .addGap(10, 10, 10)
                .addComponent(label_address_myfiles, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panel_otheruserfiles.setBackground(new java.awt.Color(245, 245, 245));
        panel_otheruserfiles.setForeground(new java.awt.Color(255, 255, 255));

        panel_otheruser_nb.setBackground(new java.awt.Color(0, 155, 52));
        panel_otheruser_nb.setForeground(new java.awt.Color(255, 255, 255));

        label_currentfolder_otheruser.setBackground(new java.awt.Color(255, 255, 255));
        label_currentfolder_otheruser.setFont(new java.awt.Font("Segoe UI", 1, 25)); // NOI18N
        label_currentfolder_otheruser.setForeground(new java.awt.Color(255, 255, 255));
        label_currentfolder_otheruser.setText("<user>");
        label_currentfolder_otheruser.setToolTipText("Current Folder");
        label_currentfolder_otheruser.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        label_currentfolder_otheruser.setName("0"); // NOI18N
        label_currentfolder_otheruser.setPreferredSize(new java.awt.Dimension(200, 40));

        button_back_otheruser.setBackground(new java.awt.Color(255, 255, 255));
        button_back_otheruser.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        button_back_otheruser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sys Img/Icon/Back.png"))); // NOI18N
        button_back_otheruser.setToolTipText("Back");
        button_back_otheruser.setBorder(null);
        button_back_otheruser.setContentAreaFilled(false);
        button_back_otheruser.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button_back_otheruser.setFocusPainted(false);
        button_back_otheruser.setPreferredSize(new java.awt.Dimension(40, 40));
        button_back_otheruser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_back_otheruserActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_otheruser_nbLayout = new javax.swing.GroupLayout(panel_otheruser_nb);
        panel_otheruser_nb.setLayout(panel_otheruser_nbLayout);
        panel_otheruser_nbLayout.setHorizontalGroup(
            panel_otheruser_nbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_otheruser_nbLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(button_back_otheruser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(label_currentfolder_otheruser, javax.swing.GroupLayout.DEFAULT_SIZE, 644, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );
        panel_otheruser_nbLayout.setVerticalGroup(
            panel_otheruser_nbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_otheruser_nbLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(panel_otheruser_nbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(button_back_otheruser, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_currentfolder_otheruser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5))
        );

        scrollpane_folderview_otheruser.setBackground(new java.awt.Color(245, 245, 245));
        scrollpane_folderview_otheruser.setBorder(null);
        scrollpane_folderview_otheruser.setForeground(new java.awt.Color(255, 255, 255));
        scrollpane_folderview_otheruser.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scrollpane_folderview_otheruser.setPreferredSize(new java.awt.Dimension(10, 250));
        scrollpane_folderview_otheruser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                scrollpane_folderview_otheruserMouseReleased(evt);
            }
        });
        scrollpane_folderview_otheruser.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                scrollpane_folderview_otheruserComponentResized(evt);
            }
        });

        panel_folderview_otheruser.setBackground(new java.awt.Color(245, 245, 245));
        panel_folderview_otheruser.setForeground(new java.awt.Color(255, 255, 255));
        panel_folderview_otheruser.setPreferredSize(new java.awt.Dimension(0, 0));
        panel_folderview_otheruser.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0));
        scrollpane_folderview_otheruser.setViewportView(panel_folderview_otheruser);

        label_address_otheruser.setBackground(new java.awt.Color(0, 155, 52));
        label_address_otheruser.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        label_address_otheruser.setForeground(new java.awt.Color(255, 255, 255));
        label_address_otheruser.setOpaque(true);
        label_address_otheruser.setPreferredSize(new java.awt.Dimension(41, 20));

        javax.swing.GroupLayout panel_otheruserfilesLayout = new javax.swing.GroupLayout(panel_otheruserfiles);
        panel_otheruserfiles.setLayout(panel_otheruserfilesLayout);
        panel_otheruserfilesLayout.setHorizontalGroup(
            panel_otheruserfilesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_otheruser_nb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_otheruserfilesLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(scrollpane_folderview_otheruser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(label_address_otheruser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panel_otheruserfilesLayout.setVerticalGroup(
            panel_otheruserfilesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_otheruserfilesLayout.createSequentialGroup()
                .addComponent(panel_otheruser_nb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(scrollpane_folderview_otheruser, javax.swing.GroupLayout.DEFAULT_SIZE, 357, Short.MAX_VALUE)
                .addGap(10, 10, 10)
                .addComponent(label_address_otheruser, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panel_result.setBackground(new java.awt.Color(245, 245, 245));
        panel_result.setForeground(new java.awt.Color(255, 255, 255));

        panel_result_nb.setBackground(new java.awt.Color(0, 155, 52));
        panel_result_nb.setForeground(new java.awt.Color(255, 255, 255));

        label_result.setBackground(new java.awt.Color(255, 255, 255));
        label_result.setFont(new java.awt.Font("Segoe UI", 1, 25)); // NOI18N
        label_result.setForeground(new java.awt.Color(255, 255, 255));
        label_result.setText("Search results for: ");
        label_result.setToolTipText("Search results");
        label_result.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        label_result.setName("0"); // NOI18N
        label_result.setPreferredSize(new java.awt.Dimension(200, 40));

        javax.swing.GroupLayout panel_result_nbLayout = new javax.swing.GroupLayout(panel_result_nb);
        panel_result_nb.setLayout(panel_result_nbLayout);
        panel_result_nbLayout.setHorizontalGroup(
            panel_result_nbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_result_nbLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(label_result, javax.swing.GroupLayout.DEFAULT_SIZE, 651, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );
        panel_result_nbLayout.setVerticalGroup(
            panel_result_nbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_result_nbLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(label_result, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8))
        );

        scrollpane_folderview_reult.setBackground(new java.awt.Color(245, 245, 245));
        scrollpane_folderview_reult.setBorder(null);
        scrollpane_folderview_reult.setForeground(new java.awt.Color(255, 255, 255));
        scrollpane_folderview_reult.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scrollpane_folderview_reult.setPreferredSize(new java.awt.Dimension(10, 250));

        panel_folderview_result.setBackground(new java.awt.Color(245, 245, 245));
        panel_folderview_result.setForeground(new java.awt.Color(255, 255, 255));
        panel_folderview_result.setPreferredSize(new java.awt.Dimension(0, 0));
        panel_folderview_result.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 0));
        scrollpane_folderview_reult.setViewportView(panel_folderview_result);

        javax.swing.GroupLayout panel_resultLayout = new javax.swing.GroupLayout(panel_result);
        panel_result.setLayout(panel_resultLayout);
        panel_resultLayout.setHorizontalGroup(
            panel_resultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_result_nb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panel_resultLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(scrollpane_folderview_reult, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_resultLayout.setVerticalGroup(
            panel_resultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_resultLayout.createSequentialGroup()
                .addComponent(panel_result_nb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(scrollpane_folderview_reult, javax.swing.GroupLayout.DEFAULT_SIZE, 393, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );

        panel_recent.setBackground(new java.awt.Color(245, 245, 245));
        panel_recent.setForeground(new java.awt.Color(255, 255, 255));

        panel_recent_nb.setBackground(new java.awt.Color(0, 155, 52));
        panel_recent_nb.setForeground(new java.awt.Color(255, 255, 255));

        label_recent.setBackground(new java.awt.Color(255, 255, 255));
        label_recent.setFont(new java.awt.Font("Segoe UI", 1, 25)); // NOI18N
        label_recent.setForeground(new java.awt.Color(255, 255, 255));
        label_recent.setText("File History");
        label_recent.setToolTipText("File History");
        label_recent.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        label_recent.setName("0"); // NOI18N
        label_recent.setPreferredSize(new java.awt.Dimension(200, 40));

        button_clearlist.setBackground(new java.awt.Color(255, 255, 255));
        button_clearlist.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        button_clearlist.setForeground(new java.awt.Color(255, 255, 255));
        button_clearlist.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sys Img/Icon/Clear List.png"))); // NOI18N
        button_clearlist.setText("Clear List");
        button_clearlist.setToolTipText("New Folder");
        button_clearlist.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        button_clearlist.setContentAreaFilled(false);
        button_clearlist.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button_clearlist.setFocusPainted(false);
        button_clearlist.setPreferredSize(new java.awt.Dimension(150, 40));
        button_clearlist.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                button_clearlistMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                button_clearlistMouseExited(evt);
            }
        });
        button_clearlist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_clearlistActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_recent_nbLayout = new javax.swing.GroupLayout(panel_recent_nb);
        panel_recent_nb.setLayout(panel_recent_nbLayout);
        panel_recent_nbLayout.setHorizontalGroup(
            panel_recent_nbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_recent_nbLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(label_recent, javax.swing.GroupLayout.DEFAULT_SIZE, 377, Short.MAX_VALUE)
                .addGap(20, 20, 20)
                .addComponent(button_clearlist, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        panel_recent_nbLayout.setVerticalGroup(
            panel_recent_nbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_recent_nbLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(panel_recent_nbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_recent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button_clearlist, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5))
        );

        scrollpabe_recent.setBackground(new java.awt.Color(245, 245, 245));
        scrollpabe_recent.setBorder(null);
        scrollpabe_recent.setForeground(new java.awt.Color(255, 255, 255));
        scrollpabe_recent.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scrollpabe_recent.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        scrollpabe_recent.setPreferredSize(new java.awt.Dimension(10, 250));

        table_recent.setBackground(new java.awt.Color(245, 245, 245));
        table_recent.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        table_recent.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        table_recent.setRowHeight(25);
        table_recent.setRowSelectionAllowed(false);
        scrollpabe_recent.setViewportView(table_recent);

        javax.swing.GroupLayout panel_recentLayout = new javax.swing.GroupLayout(panel_recent);
        panel_recent.setLayout(panel_recentLayout);
        panel_recentLayout.setHorizontalGroup(
            panel_recentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_recent_nb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(scrollpabe_recent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panel_recentLayout.setVerticalGroup(
            panel_recentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_recentLayout.createSequentialGroup()
                .addComponent(panel_recent_nb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(scrollpabe_recent, javax.swing.GroupLayout.DEFAULT_SIZE, 413, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        panel_trash.setBackground(new java.awt.Color(245, 245, 245));
        panel_trash.setForeground(new java.awt.Color(255, 255, 255));

        panel_trash_nb.setBackground(new java.awt.Color(0, 155, 52));
        panel_trash_nb.setForeground(new java.awt.Color(255, 255, 255));

        label_trash.setBackground(new java.awt.Color(255, 255, 255));
        label_trash.setFont(new java.awt.Font("Segoe UI", 1, 25)); // NOI18N
        label_trash.setForeground(new java.awt.Color(255, 255, 255));
        label_trash.setText("Deleted files / folders");
        label_trash.setToolTipText("Deleted files / folders");
        label_trash.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        label_trash.setName("0"); // NOI18N
        label_trash.setPreferredSize(new java.awt.Dimension(200, 40));

        javax.swing.GroupLayout panel_trash_nbLayout = new javax.swing.GroupLayout(panel_trash_nb);
        panel_trash_nb.setLayout(panel_trash_nbLayout);
        panel_trash_nbLayout.setHorizontalGroup(
            panel_trash_nbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_trash_nbLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(label_trash, javax.swing.GroupLayout.DEFAULT_SIZE, 651, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );
        panel_trash_nbLayout.setVerticalGroup(
            panel_trash_nbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_trash_nbLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(label_trash, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8))
        );

        scrollpane_folderview_trash.setBackground(new java.awt.Color(245, 245, 245));
        scrollpane_folderview_trash.setBorder(null);
        scrollpane_folderview_trash.setForeground(new java.awt.Color(255, 255, 255));
        scrollpane_folderview_trash.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scrollpane_folderview_trash.setPreferredSize(new java.awt.Dimension(10, 250));

        panel_folderview_trash.setBackground(new java.awt.Color(245, 245, 245));
        panel_folderview_trash.setForeground(new java.awt.Color(255, 255, 255));
        panel_folderview_trash.setPreferredSize(new java.awt.Dimension(0, 0));
        panel_folderview_trash.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 0));
        scrollpane_folderview_trash.setViewportView(panel_folderview_trash);

        javax.swing.GroupLayout panel_trashLayout = new javax.swing.GroupLayout(panel_trash);
        panel_trash.setLayout(panel_trashLayout);
        panel_trashLayout.setHorizontalGroup(
            panel_trashLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_trash_nb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panel_trashLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(scrollpane_folderview_trash, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_trashLayout.setVerticalGroup(
            panel_trashLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_trashLayout.createSequentialGroup()
                .addComponent(panel_trash_nb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(scrollpane_folderview_trash, javax.swing.GroupLayout.DEFAULT_SIZE, 393, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );

        setTitle("File Manager");
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Sys Img/Logo/Logo.png")));
        setUndecorated(true);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                formComponentResized(evt);
            }
        });

        NB.setBackground(new java.awt.Color(8, 65, 26));
        NB.setPreferredSize(new java.awt.Dimension(1000, 60));
        NB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                NBMouseReleased(evt);
            }
        });

        label_logo_colm.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        label_logo_colm.setForeground(new java.awt.Color(255, 255, 255));
        label_logo_colm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sys Img/Logo/COLM x40.png"))); // NOI18N

        label_logo.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        label_logo.setForeground(new java.awt.Color(255, 255, 255));
        label_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sys Img/Icon/Folder.png"))); // NOI18N
        label_logo.setText("File Manager");
        label_logo.setPreferredSize(new java.awt.Dimension(200, 40));

        panel_search.setBackground(new java.awt.Color(255, 255, 255));
        panel_search.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panel_search.setPreferredSize(new java.awt.Dimension(450, 40));

        input_search.setFont(new java.awt.Font("Segoe UI", 0, 25)); // NOI18N
        input_search.setForeground(new java.awt.Color(153, 153, 153));
        input_search.setText("Search");
        input_search.setBorder(null);
        input_search.setPreferredSize(new java.awt.Dimension(470, 30));
        input_search.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                input_searchFocusLost(evt);
            }
        });
        input_search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                input_searchMouseReleased(evt);
            }
        });
        input_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_searchActionPerformed(evt);
            }
        });

        button_search.setBackground(new java.awt.Color(255, 255, 255));
        button_search.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        button_search.setForeground(new java.awt.Color(255, 255, 255));
        button_search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sys Img/Icon/Search.png"))); // NOI18N
        button_search.setToolTipText("Search");
        button_search.setBorder(null);
        button_search.setContentAreaFilled(false);
        button_search.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button_search.setFocusPainted(false);
        button_search.setOpaque(true);
        button_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_searchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_searchLayout = new javax.swing.GroupLayout(panel_search);
        panel_search.setLayout(panel_searchLayout);
        panel_searchLayout.setHorizontalGroup(
            panel_searchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_searchLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(input_search, javax.swing.GroupLayout.DEFAULT_SIZE, 404, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(button_search, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        panel_searchLayout.setVerticalGroup(
            panel_searchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_searchLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(panel_searchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(input_search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button_search))
                .addGap(5, 5, 5))
        );

        label_user.setBackground(new java.awt.Color(255, 255, 255));
        label_user.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        label_user.setForeground(new java.awt.Color(255, 255, 255));
        label_user.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        label_user.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sys Img/Icon/User Profile.png"))); // NOI18N
        label_user.setText("<user>");
        label_user.setToolTipText(label_user.getText());
        label_user.setComponentPopupMenu(popupmenu_profile);
        label_user.setName(""); // NOI18N
        label_user.setPreferredSize(new java.awt.Dimension(100, 40));
        label_user.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_userMouseClicked(evt);
            }
        });

        button_minimize.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        button_minimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sys Img/Icon/Minimize.png"))); // NOI18N
        button_minimize.setToolTipText("Minimize");
        button_minimize.setBorder(null);
        button_minimize.setBorderPainted(false);
        button_minimize.setContentAreaFilled(false);
        button_minimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button_minimize.setFocusPainted(false);
        button_minimize.setPreferredSize(new java.awt.Dimension(40, 40));
        button_minimize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_minimizeActionPerformed(evt);
            }
        });

        button_signout.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        button_signout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sys Img/Icon/Close.png"))); // NOI18N
        button_signout.setToolTipText("Sign Out");
        button_signout.setBorder(null);
        button_signout.setBorderPainted(false);
        button_signout.setContentAreaFilled(false);
        button_signout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button_signout.setFocusPainted(false);
        button_signout.setPreferredSize(new java.awt.Dimension(40, 40));
        button_signout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_signoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout NBLayout = new javax.swing.GroupLayout(NB);
        NB.setLayout(NBLayout);
        NBLayout.setHorizontalGroup(
            NBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NBLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(label_logo_colm, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(label_logo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(panel_search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(label_user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(button_minimize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(button_signout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );
        NBLayout.setVerticalGroup(
            NBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NBLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(NBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button_signout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button_minimize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(NBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(label_logo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(label_logo_colm))
                    .addComponent(panel_search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );

        BG.setBackground(new java.awt.Color(245, 245, 245));
        BG.setForeground(new java.awt.Color(255, 255, 255));
        BG.setPreferredSize(new java.awt.Dimension(1000, 550));
        BG.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                BGMouseReleased(evt);
            }
        });

        TABS.setBackground(new java.awt.Color(245, 245, 245));
        TABS.setForeground(new java.awt.Color(255, 255, 255));
        TABS.setPreferredSize(new java.awt.Dimension(250, 192));

        Drive1.setBackground(new java.awt.Color(0, 155, 52));
        View.add(Drive1);
        Drive1.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        Drive1.setForeground(new java.awt.Color(255, 255, 255));
        Drive1.setSelected(true);
        Drive1.setText("My Files");
        Drive1.setToolTipText("View your files");
        Drive1.setBorder(null);
        Drive1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Drive1.setFocusPainted(false);
        Drive1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Drive1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sys Img/Icon/My Files.png"))); // NOI18N
        Drive1.setIconTextGap(5);
        Drive1.setPreferredSize(new java.awt.Dimension(230, 60));
        Drive1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Drive1ActionPerformed(evt);
            }
        });

        Drive2.setBackground(new java.awt.Color(0, 155, 52));
        View.add(Drive2);
        Drive2.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        Drive2.setForeground(new java.awt.Color(0, 155, 52));
        Drive2.setText("File History");
        Drive2.setToolTipText("History of viewed files");
        Drive2.setBorder(null);
        Drive2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Drive2.setFocusPainted(false);
        Drive2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Drive2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sys Img/Icon/Clock.png"))); // NOI18N
        Drive2.setIconTextGap(5);
        Drive2.setOpaque(false);
        Drive2.setPreferredSize(new java.awt.Dimension(230, 60));
        Drive2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Drive2ActionPerformed(evt);
            }
        });

        Drive3.setBackground(new java.awt.Color(0, 155, 52));
        View.add(Drive3);
        Drive3.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        Drive3.setForeground(new java.awt.Color(0, 155, 52));
        Drive3.setText("Trash");
        Drive3.setToolTipText("History of viewed files");
        Drive3.setBorder(null);
        Drive3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Drive3.setFocusPainted(false);
        Drive3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Drive3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sys Img/Icon/Trash.png"))); // NOI18N
        Drive3.setIconTextGap(5);
        Drive3.setOpaque(false);
        Drive3.setPreferredSize(new java.awt.Dimension(230, 60));
        Drive3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Drive3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout TABSLayout = new javax.swing.GroupLayout(TABS);
        TABS.setLayout(TABSLayout);
        TABSLayout.setHorizontalGroup(
            TABSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TABSLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(TABSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Drive3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(TABSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(Drive1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Drive2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10))
        );
        TABSLayout.setVerticalGroup(
            TABSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TABSLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(Drive1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(Drive2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(Drive3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );

        scrollpane_otheruser.setBackground(new java.awt.Color(245, 245, 245));
        scrollpane_otheruser.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 155, 52)), "Other Users", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 25), new java.awt.Color(0, 155, 52))); // NOI18N
        scrollpane_otheruser.setForeground(new java.awt.Color(255, 255, 255));
        scrollpane_otheruser.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scrollpane_otheruser.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scrollpane_otheruser.setPreferredSize(new java.awt.Dimension(210, 0));

        panel_otheruser.setBackground(new java.awt.Color(245, 245, 245));
        panel_otheruser.setForeground(new java.awt.Color(255, 255, 255));
        panel_otheruser.setPreferredSize(new java.awt.Dimension(0, 0));
        panel_otheruser.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 0));
        scrollpane_otheruser.setViewportView(panel_otheruser);

        separator_middle.setBackground(new java.awt.Color(0, 155, 52));
        separator_middle.setForeground(new java.awt.Color(0, 155, 52));
        separator_middle.setOrientation(javax.swing.SwingConstants.VERTICAL);
        separator_middle.setMinimumSize(new java.awt.Dimension(50, 5));
        separator_middle.setOpaque(true);

        panel_canvas.setBackground(new java.awt.Color(245, 245, 245));
        panel_canvas.setForeground(new java.awt.Color(255, 255, 255));
        panel_canvas.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout BGLayout = new javax.swing.GroupLayout(BG);
        BG.setLayout(BGLayout);
        BGLayout.setHorizontalGroup(
            BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BGLayout.createSequentialGroup()
                .addGroup(BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TABS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BGLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(scrollpane_otheruser, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)))
                .addComponent(separator_middle, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(panel_canvas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        BGLayout.setVerticalGroup(
            BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BGLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel_canvas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(separator_middle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(BGLayout.createSequentialGroup()
                        .addComponent(TABS, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(scrollpane_otheruser, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                        .addGap(10, 10, 10))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(NB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(NB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(BG, javax.swing.GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void button_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_searchActionPerformed
        if ((input_search.getForeground()==Color.BLACK)&&(!input_search.getText().replaceAll("\\s+", "").trim().equals(""))) {
            Search(input_search.getText());
        }
        else{
            this.requestFocus();
            Drive1.setFont(new Font("Segoe UI", 1, 30));
            Drive1.setForeground(Color.WHITE);
            Drive1.setOpaque(true);
            Drive2.setFont(new Font("Segoe UI", 0, 20));
            Drive2.setForeground(new Color(0,155,52));
            Drive2.setOpaque(false);
            panel_canvas.removeAll();
            panel_canvas.add(panel_myfiles);
            panel_folderview.removeAll();

            panel_search.setVisible(true);

            user_port = "";
            user_ip = "";
            user_name = "";
            user_id = "";

            OtherUserList();

            revalidate();
            repaint();
            File dir = new File("src\\root");
            MyFiles(dir);
        }
    }//GEN-LAST:event_button_searchActionPerformed

    private void input_searchMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_input_searchMouseReleased
        if (input_search.getForeground()!=Color.black){
            if ("Search".equals(input_search.getText())){
             input_search.setText("");
             input_search.setForeground(Color.black);
            }
        }
    }//GEN-LAST:event_input_searchMouseReleased

    private void input_searchFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_input_searchFocusLost
        if ("".equals(input_search.getText().replaceAll("\\s+", "").trim())){
            input_search.setText("Search");
            input_search.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_input_searchFocusLost

    private void input_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_searchActionPerformed
        button_searchActionPerformed(evt);
    }//GEN-LAST:event_input_searchActionPerformed

    private void scrollpane_folderviewComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_scrollpane_folderviewComponentResized
        ResizeMyFiles();
    }//GEN-LAST:event_scrollpane_folderviewComponentResized

    private void button_signoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_signoutActionPerformed
        
        try {
            ps = con.prepareStatement("UPDATE tbl_user SET User_Port = ? WHERE User_ID = ?");
            ps.setInt(1, 0);
            ps.setString(2, label_user.getName());
            ps.execute();
            
            ps = con.prepareStatement("INSERT INTO tbl_log (Log_Detail, User_ID) VALUES (?, ?)");
            ps.setString(1, "You Signed out.");
            ps.setString(2, label_user.getName());
            ps.execute();
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            if (rs != null) {
                try { rs.close(); } catch (SQLException e) {}
            }
            if (ps != null) {
                try { ps.close(); } catch (SQLException e) {}
            }
        }
        
        Login login = new Login();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_button_signoutActionPerformed

    private void button_minimizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_minimizeActionPerformed
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_button_minimizeActionPerformed

    private void NBMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NBMouseReleased
        this.requestFocus();
    }//GEN-LAST:event_NBMouseReleased

    private void BGMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BGMouseReleased
        this.requestFocus();
    }//GEN-LAST:event_BGMouseReleased

    private void scrollpane_folderviewMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_scrollpane_folderviewMouseReleased
        this.requestFocus();
    }//GEN-LAST:event_scrollpane_folderviewMouseReleased

    private void button_back_myfilesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_back_myfilesActionPerformed
        if (!label_currentfolder_myfiles.getName().equals("src\\root")){
            File dir = new File(label_currentfolder_myfiles.getName());
            MyFiles(dir.getParentFile());
        }
    }//GEN-LAST:event_button_back_myfilesActionPerformed

    private void button_addfoldermyfilesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_addfoldermyfilesActionPerformed
        String FolderName = JOptionPane.showInputDialog(this, "Enter folder name:\n","Create new folder.",JOptionPane.QUESTION_MESSAGE);
        try {
            if (FolderName!=null){
                if (FolderName.trim().length()>0){
                    File folder = new File(label_currentfolder_myfiles.getName()+"\\"+FolderName);
                    if (folder.exists()==false){
                        folder.mkdir();
                        File dir = new File(label_currentfolder_myfiles.getName());
                        MyFiles(dir);
                        try {
                            ps = con.prepareStatement("INSERT INTO tbl_recent (Recent_Details, File_Path, User_ID) VALUES (?, ?, ?)");
                            ps.setString(1, "You add the folder \'"+FolderName+"\'.");
                            ps.setString(2, folder.getPath());
                            ps.setString(3, label_user.getName());
                            ps.execute();
                        } catch (Exception e) {
                            System.out.println(e);
                        } finally {
                            if (rs != null) { try { rs.close(); } catch (SQLException e) {} }
                            if (ps != null) { try { ps.close(); } catch (SQLException e) {} }
                        }
                    }
                    else {
                        try {
                            ps = con.prepareStatement("SELECT * FROM tbl_trash WHERE File_path = ? AND User_ID = ?");
                            ps.setString(1, folder.getAbsolutePath());
                            ps.setString(2, label_user.getName());
                            rs = ps.executeQuery();
                            if (rs.next()) {
                                if (JOptionPane.showConfirmDialog(this, "Folder name is reserved!\n\nPlease enter a new one.","Notice.",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION){
                                    button_addfoldermyfilesActionPerformed(evt);
                                }
                            }
                            else {
                                if (JOptionPane.showConfirmDialog(this, "Folder already exist!\n\nDo you wish to create a new one?","Notice.",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION){
                                    button_addfoldermyfilesActionPerformed(evt);
                                }
                            }
                        } catch (Exception e) {
                            System.out.println(e);
                        } finally {
                            if (rs != null) {
                                try { rs.close(); } catch (SQLException e) {}
                            }
                            if (ps != null) {
                                try { ps.close(); } catch (SQLException e) {}
                            }
                        }
                    }
                }
                else {
                    if (JOptionPane.showConfirmDialog(this, "Folder name is invalid,\nDo you wish to re-enter?","Notice.",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION){
                        button_addfoldermyfilesActionPerformed(evt);
                    }
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_button_addfoldermyfilesActionPerformed

    private void formComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentResized
        ResizeMyFiles();
    }//GEN-LAST:event_formComponentResized

    private void button_addfilemyfilesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_addfilemyfilesActionPerformed
       filechooser_myfiles.showDialog(this, null);
    }//GEN-LAST:event_button_addfilemyfilesActionPerformed

    private void combobox_filter_myfilesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combobox_filter_myfilesItemStateChanged
        File dir = new File(label_currentfolder_myfiles.getName());
        MyFiles(dir);
    }//GEN-LAST:event_combobox_filter_myfilesItemStateChanged

    private void Drive1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Drive1ActionPerformed
        input_search.setText("Search");
        input_search.setForeground(new Color(153,153,153));
        this.requestFocus();
        Drive1.setFont(new Font("Segoe UI", 1, 30));
        Drive1.setForeground(Color.WHITE);
        Drive1.setOpaque(true);
        Drive2.setFont(new Font("Segoe UI", 0, 20));
        Drive2.setForeground(new Color(0,155,52));
        Drive2.setOpaque(false);
        Drive3.setFont(new Font("Segoe UI", 0, 20));
        Drive3.setForeground(new Color(0,155,52));
        Drive3.setOpaque(false);
        panel_canvas.removeAll();
        panel_canvas.add(panel_myfiles);
        panel_folderview.removeAll();
                
        panel_search.setVisible(true);
        
        user_port = "";
        user_ip = "";
        user_name = "";
        user_id = "";
        
        OtherUserList();

        revalidate();
        repaint();
        File dir = new File("src\\root");
        MyFiles(dir);
    }//GEN-LAST:event_Drive1ActionPerformed

    private void Drive2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Drive2ActionPerformed
        input_search.setText("Search");
        input_search.setForeground(new Color(153,153,153));
        this.requestFocus();
        Drive2.setFont(new Font("Segoe UI", 1, 30));
        Drive2.setForeground(Color.WHITE);
        Drive2.setOpaque(true);
        Drive1.setFont(new Font("Segoe UI", 0, 20));
        Drive1.setForeground(new Color(0,155,52));
        Drive1.setOpaque(false);
        Drive3.setFont(new Font("Segoe UI", 0, 20));
        Drive3.setForeground(new Color(0,155,52));
        Drive3.setOpaque(false);
        panel_canvas.removeAll();
        panel_canvas.add(panel_recent);
        
        panel_search.setVisible(false);
        
        user_port = "";
        user_ip = "";
        user_name = "";
        user_id = "";
        
        OtherUserList();
        
        try {
            DefaultTableModel model = new DefaultTableModel();
            model.setColumnIdentifiers(new Object[]{"Details", "File Path", "Date and Time"});
            Object[] row = new Object[3];
            ps = con.prepareStatement("SELECT * FROM tbl_recent WHERE User_ID = ? ORDER BY DateCreated DESC");
            ps.setString(1, label_user.getName());
            rs = ps.executeQuery();
            while (rs.next()) {
                row[0] = rs.getString("Recent_Details");
                row[1] = rs.getString("File_Path");
                row[2] = rs.getString("DateCreated");
                model.addRow(row);
            }
            table_recent.setModel(model);
        } catch (SQLException sqle) {
        }
        
        revalidate();
        repaint();
    }//GEN-LAST:event_Drive2ActionPerformed

    private void label_currentfolder_myfilesMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_currentfolder_myfilesMouseReleased
        File dir = new File(label_currentfolder_myfiles.getName());
        MyFiles(dir);
        revalidate();
        repaint();
    }//GEN-LAST:event_label_currentfolder_myfilesMouseReleased

    private void button_addfoldermyfilesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_addfoldermyfilesMouseEntered
        button_addfoldermyfiles.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
    }//GEN-LAST:event_button_addfoldermyfilesMouseEntered

    private void button_addfilemyfilesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_addfilemyfilesMouseEntered
        button_addfilemyfiles.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
    }//GEN-LAST:event_button_addfilemyfilesMouseEntered

    private void button_addfoldermyfilesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_addfoldermyfilesMouseExited
        button_addfoldermyfiles.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
    }//GEN-LAST:event_button_addfoldermyfilesMouseExited

    private void button_addfilemyfilesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_addfilemyfilesMouseExited
        button_addfilemyfiles.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
    }//GEN-LAST:event_button_addfilemyfilesMouseExited

    private void filechooser_myfilesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filechooser_myfilesActionPerformed
        try {
            File source = new File(filechooser_myfiles.getSelectedFile().getPath());
            String name = source.getName().substring(0, source.getName().indexOf("."));
            String extension = source.getName().substring(source.getName().indexOf("."));
            
            File[] list = new File(label_currentfolder_myfiles.getName()).listFiles();
            
            for (File file : list) {
                if (file.getName().equals(source.getName())){
                    if (JOptionPane.showConfirmDialog(this, "File destination already contains a file named \'"+source.getName()+"\'\n\nDo you wish to change the name of the new file?","Notice.",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION){
                        String new_name = "";
                        while (isValidName(new_name)==false){
                            new_name = JOptionPane.showInputDialog(null, "Enter name:\n\n");
                        }
                        name = new_name;
                    }
                }
            }
            
            if (name != null) {
                try {
                    File dest = new File(label_currentfolder_myfiles.getName() + "\\" + name + extension);
                    FileUtils.copyFile(source, dest);
                    try {
                        ps = con.prepareStatement("INSERT INTO tbl_recent (Recent_Details, File_Path, User_ID) VALUES (?, ?, ?)");
                        ps.setString(1, "You import the file \'" + source.getName() + "\'.");
                        ps.setString(2, dest.getPath());
                        ps.setString(3, label_user.getName());
                        ps.execute();
                    } catch (Exception e) {
                        System.out.println(e);
                    } finally {
                        if (rs != null) {
                            try {
                                rs.close();
                            } catch (SQLException e) {
                            }
                        }
                        if (ps != null) {
                            try {
                                ps.close();
                            } catch (SQLException e) {
                            }
                        }
                    }
                } catch (IOException ioe) {
                    JOptionPane.showMessageDialog(null, "Ooops...\n\nAn error occurd while importing the file.", "err", JOptionPane.ERROR_MESSAGE);
                }
            }
            
            File dir = new File(label_currentfolder_myfiles.getName());
            MyFiles(dir);
            
        } catch (Exception e) {
        }
    }//GEN-LAST:event_filechooser_myfilesActionPerformed

    private void menu_changepassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_changepassActionPerformed
        CP.setVisible(true);
    }//GEN-LAST:event_menu_changepassActionPerformed

    private void label_userMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_userMouseClicked
        popupmenu_profile.show(label_user, 0, label_user.getHeight());
    }//GEN-LAST:event_label_userMouseClicked

    private void button_back_otheruserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_back_otheruserActionPerformed
        try {    
            File parent = new File(label_currentfolder_otheruser.getName());
            File current = new File(parent.getParent());
            if(!current.getName().equalsIgnoreCase("src")){
                
                Socket connection = new Socket(user_ip, Integer.parseInt(user_port));
//                Socket connection = new Socket("127.0.0.1", Integer.parseInt(user_port));
                ObjectOutputStream out = new ObjectOutputStream(connection.getOutputStream());
                out.writeObject("Load:" + parent.getParent());
                out.flush();

                File[] file_list = null;
                ObjectInputStream in = new ObjectInputStream(connection.getInputStream());
                file_list = (File[]) in.readObject();

                connection.close();
                out.close();
                in.close();
                OtherUserFiles(file_list); // Use the data colected
            }
        } catch (IOException ioe) {
        } catch (ClassNotFoundException cnfe) {
        }
    }//GEN-LAST:event_button_back_otheruserActionPerformed

    private void scrollpane_folderview_otheruserMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_scrollpane_folderview_otheruserMouseReleased
        this.requestFocus();
    }//GEN-LAST:event_scrollpane_folderview_otheruserMouseReleased

    private void scrollpane_folderview_otheruserComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_scrollpane_folderview_otheruserComponentResized
        ResizeMyFiles();
    }//GEN-LAST:event_scrollpane_folderview_otheruserComponentResized

    private void button_clearlistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_clearlistActionPerformed
        try {
            if (JOptionPane.showConfirmDialog(null, "Are you sureyou want to clear this list?", "Notice.",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION) {
                ps = con.prepareStatement("DELETE FROM tbl_recent WHERE User_ID = ?");
                ps.setString(1, label_user.getName());
                ps.execute();
                Drive2ActionPerformed(evt);
                revalidate();
                repaint();
            }
        } catch (SQLException sqle) {
        } catch (Exception e) {
            
        }
    }//GEN-LAST:event_button_clearlistActionPerformed

    private void button_clearlistMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_clearlistMouseEntered
        button_clearlist.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
    }//GEN-LAST:event_button_clearlistMouseEntered

    private void button_clearlistMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_clearlistMouseExited
        button_clearlist.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
    }//GEN-LAST:event_button_clearlistMouseExited

    private void menu_logsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_logsActionPerformed
        L.setVisible(true);
        L.LoadData(Integer.parseInt(label_user.getName()));
    }//GEN-LAST:event_menu_logsActionPerformed

    private void Drive3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Drive3ActionPerformed
        input_search.setText("Search");
        input_search.setForeground(new Color(153,153,153));
        this.requestFocus();
        Drive3.setFont(new Font("Segoe UI", 1, 30));
        Drive3.setForeground(Color.WHITE);
        Drive3.setOpaque(true);
        Drive1.setFont(new Font("Segoe UI", 0, 20));
        Drive1.setForeground(new Color(0,155,52));
        Drive1.setOpaque(false);
        Drive2.setFont(new Font("Segoe UI", 0, 20));
        Drive2.setForeground(new Color(0,155,52));
        Drive2.setOpaque(false);
        panel_canvas.removeAll();
        panel_canvas.add(panel_trash);
        panel_folderview_trash.removeAll();
                
        panel_search.setVisible(false);
        
        user_port = "";
        user_ip = "";
        user_name = "";
        user_id = "";
        
        OtherUserList();

        revalidate();
        repaint();
        
        Trash();
        
    }//GEN-LAST:event_Drive3ActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BG;
    private javax.swing.JRadioButton Drive1;
    private javax.swing.JRadioButton Drive2;
    private javax.swing.JRadioButton Drive3;
    private javax.swing.JPanel NB;
    private javax.swing.JPanel TABS;
    private javax.swing.ButtonGroup View;
    private javax.swing.JButton button_addfilemyfiles;
    private javax.swing.JButton button_addfoldermyfiles;
    private javax.swing.JButton button_back_myfiles;
    private javax.swing.JButton button_back_otheruser;
    private javax.swing.JButton button_clearlist;
    private javax.swing.JButton button_minimize;
    private javax.swing.JButton button_search;
    private javax.swing.JButton button_signout;
    private javax.swing.JComboBox<String> combobox_filter_myfiles;
    private javax.swing.JFileChooser filechooser_myfiles;
    private javax.swing.JTextField input_search;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel label_address_myfiles;
    private javax.swing.JLabel label_address_otheruser;
    private javax.swing.JLabel label_currentfolder_myfiles;
    private javax.swing.JLabel label_currentfolder_otheruser;
    private javax.swing.JLabel label_logo;
    private javax.swing.JLabel label_logo_colm;
    private javax.swing.JLabel label_recent;
    private javax.swing.JLabel label_result;
    private javax.swing.JLabel label_trash;
    public static javax.swing.JLabel label_user;
    private javax.swing.JMenuItem menu_changepass;
    private javax.swing.JMenuItem menu_logs;
    private javax.swing.JPanel panel_canvas;
    private javax.swing.JPanel panel_folderview;
    private javax.swing.JPanel panel_folderview_otheruser;
    private javax.swing.JPanel panel_folderview_result;
    private javax.swing.JPanel panel_folderview_trash;
    private javax.swing.JPanel panel_myfiles;
    private javax.swing.JPanel panel_myfiles_nb;
    private javax.swing.JPanel panel_otheruser;
    private javax.swing.JPanel panel_otheruser_nb;
    private javax.swing.JPanel panel_otheruserfiles;
    private javax.swing.JPanel panel_recent;
    private javax.swing.JPanel panel_recent_nb;
    private javax.swing.JPanel panel_result;
    private javax.swing.JPanel panel_result_nb;
    private javax.swing.JPanel panel_search;
    private javax.swing.JPanel panel_trash;
    private javax.swing.JPanel panel_trash_nb;
    private javax.swing.JPopupMenu popupmenu_profile;
    private javax.swing.JScrollPane scrollpabe_recent;
    private javax.swing.JScrollPane scrollpane_folderview;
    private javax.swing.JScrollPane scrollpane_folderview_otheruser;
    private javax.swing.JScrollPane scrollpane_folderview_reult;
    private javax.swing.JScrollPane scrollpane_folderview_trash;
    private javax.swing.JScrollPane scrollpane_otheruser;
    private javax.swing.JSeparator separator_middle;
    private javax.swing.JTable table_recent;
    // End of variables declaration//GEN-END:variables


    public void OtherUserList() {
        
        int OUH = 0;
        panel_otheruser.removeAll();
        panel_otheruser.setPreferredSize(new Dimension(scrollpane_otheruser.getWidth()-20,0));
        
        try {
            ps = con.prepareStatement("SELECT * FROM tbl_user WHERE User_ID != ? ORDER BY User_Name");
            ps.setString(1, label_user.getName());
            rs = ps.executeQuery();
            while (rs.next()){
                
                
                try {
                    Socket connection = new Socket(rs.getString("User_IP"), rs.getInt("User_Port"));
//                    Socket connection = new Socket("127.0.0.1", rs.getInt("User_Port"));
                    connection.close();
                } catch (IOException ioe) {
                    continue;
                } catch (Exception e) {
                    System.out.println(e);
                }
                
                final JLabel U_PORT = new JLabel(rs.getString("User_port"));
                final JLabel U_IP = new JLabel(""+rs.getString("User_IP"));
                final JLabel U_NAME = new JLabel(rs.getString("User_Name"));
                final JLabel U_ID = new JLabel(""+rs.getInt("User_ID"));
                
                final JPanel container = new JPanel();
                container.setBackground(new Color(0,155,52));
                container.setOpaque(false);
                container.setLayout(null);
                container.setPreferredSize(new Dimension(180,75));

                final JLabel details = new JLabel();
                details.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sys Img/Icon/Shared Files.png")));
                details.setText(rs.getString("User_Name"));
                details.setName(""+rs.getInt("User_ID"));
                details.setFont(new java.awt.Font("Segoe UI", 0, 15));
                details.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
                details.setBounds(10, 10, 160, 55);
                details.addMouseListener(new java.awt.event.MouseAdapter() {
                    public void mouseEntered(java.awt.event.MouseEvent evt) {
                        container.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 155, 52)));
                        repaint();
                    }
                    public void mouseExited(java.awt.event.MouseEvent evt) {
                        container.setBorder(null);
                        repaint();
                    }
                    public void mouseReleased(java.awt.event.MouseEvent evt) {

                        try {
                            details.setFont(new Font("Segoe UI", 1, 30));
                            details.setForeground(Color.WHITE);
                            container.setOpaque(true);
                            
                            input_search.setText("Search");
                            input_search.setForeground(new Color(153,153,153));
                            requestFocus();
                            Drive1.setFont(new Font("Segoe UI", 0, 20));
                            Drive1.setForeground(new Color(0,155,52));
                            Drive1.setOpaque(false);
                            Drive2.setFont(new Font("Segoe UI", 0, 20));
                            Drive2.setForeground(new Color(0,155,52));
                            Drive2.setOpaque(false);
                            
                            panel_search.setVisible(false);
                            
                            user_port = U_PORT.getText();
                            user_ip = U_IP.getText();
                            user_name = U_NAME.getText();
                            user_id = U_ID.getText();
                            
                            Socket connection = new Socket(user_ip, Integer.parseInt(user_port));
//                            Socket connection = new Socket("127.0.0.1", Integer.parseInt(user_port));
                            ObjectOutputStream out = new ObjectOutputStream(connection.getOutputStream());
                            out.writeObject("Load:src\\root\\");
                            out.flush();

                            File[] file_list = null;
                            ObjectInputStream in = new ObjectInputStream(connection.getInputStream());
                            file_list = (File[]) in.readObject();

                            connection.close();
                            out.close();
                            in.close();
                            

                            OtherUserFiles(file_list); // Use the data colected
                            
                        } catch (IOException ioe) {
//                            OtherUserFiles(null);
                            System.out.println("ioe:   "+ioe);
                        } catch (ClassNotFoundException cnfe) {
//                            OtherUserFiles(null);
                            System.out.println(cnfe);
                        }
                        
                    }
                });
                
                if (user_id.equalsIgnoreCase(""+rs.getInt("User_ID"))){
                    details.setFont(new Font("Segoe UI", 1, 30));
                    details.setForeground(Color.WHITE);
                    container.setOpaque(true);
                }
                
                container.add(details);
                panel_otheruser.add(container);
                OUH+=75;
                panel_otheruser.setPreferredSize(new Dimension(scrollpane_otheruser.getWidth()-20,OUH));
                        
            }
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            if (rs != null) {
                try { rs.close(); } catch (SQLException e) {}
            }
            if (ps != null) {
                try { ps.close(); } catch (SQLException e) {}
            }
        }
        
    }
    
    // ------------------------------------------------------------------
    
    public void MyFiles(File dir){
        
        int result_count = 0;
        
        panel_folderview.removeAll();
        revalidate();
        repaint();
        
        label_currentfolder_myfiles.setText("My Files  |  "+dir.getName());
        label_currentfolder_myfiles.setName(dir.getPath());
        label_address_myfiles.setText("My Files  |  "+dir.getPath().substring(4)+"\\");
                
        File[] path = dir.listFiles();
        
        Arrays.sort(path);
        
        if(combobox_filter_myfiles.getSelectedIndex()==2){
            Arrays.sort(path, new Comparator<File>() {
                public int compare(File f1, File f2) {
                    return Long.compare(f1.lastModified(), f2.lastModified()); // switch
                }
            });
        }
        else if(combobox_filter_myfiles.getSelectedIndex()==3){
            Arrays.sort(path, new Comparator<File>() {
                public int compare(File f1, File f2) {
                    return Long.compare(f2.lastModified(), f1.lastModified()); // switch
                }
            });
        }
                
        for (File item : path) {
            if(item.isDirectory()){
                try {
                    ps = con.prepareStatement("SELECT * FROM tbl_trash WHERE File_path = ? AND User_ID = ?");
                    ps.setString(1, item.getPath());
                    ps.setString(2, label_user.getName());
                    rs = ps.executeQuery();
                    if (rs.next()==false) {
                        FolderList(item);
                        result_count++;
                    }
                } catch (Exception e) {
                    System.out.println(e);
                } finally {
                    if (rs != null) {
                        try { rs.close(); } catch (SQLException e) {}
                    }
                    if (ps != null) {
                        try { ps.close(); } catch (SQLException e) {}
                    }
                }
            }
        }
        
        for (File item : path) {
            if(item.isDirectory()==false){
                if (item.getName().substring(0,2).equals("~$")){
                    continue;
                }
                try {
                    ps = con.prepareStatement("SELECT * FROM tbl_trash WHERE File_path = ? AND User_ID = ?");
                    ps.setString(1, item.getPath());
                    ps.setString(2, label_user.getName());
                    rs = ps.executeQuery();
                    if (rs.next()==false) {
                        FileList(item);
                        result_count++;
                    }
                } catch (Exception e) {
                    System.out.println(e);
                } finally {
                    if (rs != null) {
                        try { rs.close(); } catch (SQLException e) {}
                    }
                    if (ps != null) {
                        try { ps.close(); } catch (SQLException e) {}
                    }
                }
            }
        }
        
        if (combobox_filter_myfiles.getSelectedIndex()==1){
            panel_folderview.removeAll();
            revalidate();
            repaint();
            for (int i = path.length - 1; i >= 0; i--){
                if(path[i].isDirectory()){
                    try {
                        ps = con.prepareStatement("SELECT * FROM tbl_trash WHERE File_path = ? AND User_ID = ?");
                        ps.setString(1, path[i].getPath());
                        ps.setString(2, label_user.getName());
                        rs = ps.executeQuery();
                        if (rs.next()==false) {
                            FolderList(path[i]);
                            result_count++;
                        }
                    } catch (Exception e) {
                        System.out.println(e);
                    } finally {
                        if (rs != null) {
                            try { rs.close(); } catch (SQLException e) {}
                        }
                        if (ps != null) {
                            try { ps.close(); } catch (SQLException e) {}
                        }
                    }
                }
            }
            for (int i = path.length - 1; i >= 0; i--){
                if(path[i].isDirectory()==false){
                    if (path[i].getName().substring(0,2).equals("~$")){
                        continue;
                    }
                    try {
                        ps = con.prepareStatement("SELECT * FROM tbl_trash WHERE File_path = ? AND User_ID = ?");
                        ps.setString(1, path[i].getPath());
                        ps.setString(2, label_user.getName());
                        rs = ps.executeQuery();
                        if (rs.next()==false) {
                            FileList(path[i]);
                            result_count++;
                        }
                    } catch (Exception e) {
                        System.out.println(e);
                    } finally {
                        if (rs != null) {
                            try { rs.close(); } catch (SQLException e) {}
                        }
                        if (ps != null) {
                            try { ps.close(); } catch (SQLException e) {}
                        }
                    }
                }
            }
        }
        
        if (result_count == 0){
            final JPanel container = new JPanel();
            container.setLayout(new java.awt.CardLayout());
            container.setBackground(new Color(245,245,245));
            container.setOpaque(true);
            container.setPreferredSize(new Dimension(scrollpane_folderview.getWidth()-20,scrollpane_folderview.getHeight()-100));

            final JLabel name = new JLabel();
            name.setText("This folder is empty.");
            name.setHorizontalAlignment((int) CENTER_ALIGNMENT);
            name.setVerticalAlignment((int) CENTER_ALIGNMENT);
            name.setFont(new Font("Segoe UI", 0, 40));
            name.setForeground(new Color(0,155,52));

            container.add(name);
            panel_folderview.add(container);
        }
        
        ResizeMyFiles();
        revalidate();
        repaint();
    }
    
    private void FolderList(File path){
        final JPanel container = new JPanel();
        container.setOpaque(false);
        container.setLayout(null);
        container.setPreferredSize(new Dimension(200,250));
        
        final JLabel shadow = new JLabel();
        shadow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sys Img/Folder and File/Border.png")));
        shadow.setBounds(0, 0, 200, 250);
        
        final JLabel image = new JLabel();
        image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sys Img/Folder and File/Folder.png")));
        image.setBounds(35, 35, 130, 130);
        
        final JLabel name = new JLabel(path.getName());
        name.setBounds(20, 185, 160, 40);
        name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        name.setFont(new java.awt.Font("Segoe UI", 0, 15));
        name.setOpaque(false);
        
        JPopupMenu popupmenu_folder = new JPopupMenu();
        
        final JLabel details = new JLabel();
        details.setText(path.getName());
        details.setToolTipText(path.getName());
        details.setName(""+path.getAbsolutePath());
        details.setFont(new java.awt.Font("Segoe UI", 0, 0));
        details.setOpaque(false);
        details.setComponentPopupMenu(popupmenu_folder);
        details.setBounds(10, 10, 180, 230);
                details.addMouseListener(new java.awt.event.MouseAdapter() {
                    public void mouseEntered(java.awt.event.MouseEvent evt) {
                        shadow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sys Img/Folder and File/Shadow.png")));
                        repaint();
                    }
                    public void mouseExited(java.awt.event.MouseEvent evt) {
                        shadow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sys Img/Folder and File/Border.png")));
                        repaint();
                    }
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        if (evt.getClickCount()==2){
                            File dir = new File(details.getName());
                            MyFiles(dir);
                            try {
                                ps = con.prepareStatement("INSERT INTO tbl_recent (Recent_Details, File_Path, User_ID) VALUES (?, ?, ?)");
                                ps.setString(1, "You open the folder \'"+details.getText()+"\'.");
                                ps.setString(2, path.getPath());
                                ps.setString(3, label_user.getName());
                                ps.execute();
                            } catch (Exception e) {
                                System.out.println(e);
                            } finally {
                                if (rs != null) { try { rs.close(); } catch (SQLException e) {} }
                                if (ps != null) { try { ps.close(); } catch (SQLException e) {} }
                            }
                        }
                    }
                });
        
        
        JMenuItem rename_folder = new JMenuItem();
        rename_folder.setBackground(new java.awt.Color(255, 255, 255));
        rename_folder.setFont(new java.awt.Font("Segoe UI", 1, 15));
        rename_folder.setForeground(new java.awt.Color(8, 65, 26));
        rename_folder.setText("Rename Folder");
        rename_folder.setToolTipText("");
        rename_folder.setAccelerator(KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, 0));
        rename_folder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                String FolderName = JOptionPane.showInputDialog(null, "Enter new name for the folder \'"+details.getText()+"\'",details.getText());
                try {
                    if (FolderName!=null){
                        if ((FolderName.trim().length()>0)&&(isValidName(FolderName)==true)){
                            File old_name = new File(details.getName());
                            File new_name = new File(old_name.getParent()+"\\"+FolderName);
                            if (new_name.exists()==false){
                                old_name.renameTo(new_name);
                                try {
                                    ps = con.prepareStatement("INSERT INTO tbl_recent (Recent_Details, File_Path, User_ID) VALUES (?, ?, ?)");
                                    ps.setString(1, "You rename the folder \'"+details.getText()+"\' to \'"+FolderName+"\'.");
                                    ps.setString(2, new_name.getPath());
                                    ps.setString(3, label_user.getName());
                                    ps.execute();
                                } catch (Exception e) {
                                    System.out.println(e);
                                } finally {
                                    if (rs != null) { try { rs.close(); } catch (SQLException e) {} }
                                    if (ps != null) { try { ps.close(); } catch (SQLException e) {} }
                                }
                            }
                            else {
                                try {
                                    ps = con.prepareStatement("SELECT * FROM tbl_trash WHERE File_path = ? AND User_ID = ?");
                                    ps.setString(1, new_name.getPath());
                                    ps.setString(2, label_user.getName());
                                    rs = ps.executeQuery();
                                    if (rs.next()) {
                                        if (JOptionPane.showConfirmDialog(null, "Folder name \'"+FolderName+"\' is reserved!\n\nPlease re-enter a new name.","Notice.",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION){
                                            actionPerformed(evt);
                                        }
                                    }
                                    else {
                                        if (JOptionPane.showConfirmDialog(null, "Folder named \'"+FolderName+"\' already exist!\n\nDo you wish to re-enter?","Notice.",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION){
                                            actionPerformed(evt);
                                        }
                                    }
                                } catch (Exception e) {
                                    System.out.println(e);
                                } finally {
                                    if (rs != null) {
                                        try { rs.close(); } catch (SQLException e) {}
                                    }
                                    if (ps != null) {
                                        try { ps.close(); } catch (SQLException e) {}
                                    }
                                }
                            }
                        }
                        else {
                            if (JOptionPane.showConfirmDialog(null, "Folder name is invalid,\nDo you wish to re-enter?","Notice.",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION){
                                actionPerformed(evt);
                            }
                        }
                    }
                } catch (Exception e) {
                    System.out.println(e);
                }
                
                File dir = new File(label_currentfolder_myfiles.getName());
                MyFiles(dir);
                
            }
        });
        popupmenu_folder.add(rename_folder);
        
        JMenuItem copy_folder = new JMenuItem();
        copy_folder.setBackground(new java.awt.Color(255, 255, 255));
        copy_folder.setFont(new java.awt.Font("Segoe UI", 1, 15));
        copy_folder.setForeground(new java.awt.Color(8, 65, 26));
        copy_folder.setText("Copy Folder");
        copy_folder.setToolTipText("");
        copy_folder.setAccelerator(KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C,0));
        copy_folder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                                
                try {
                    File dirToLock = new File("src/root");
                    FileSystemView fsv = new DirectoryRestrictedFileSystemView(new File(dirToLock.getAbsolutePath()));
                    JFileChooser destination = new JFileChooser(dirToLock, fsv);
                    destination.setDialogTitle("Copy folder to...");
                    destination.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
                    destination.setAcceptAllFileFilterUsed(false);
                    
                    destination.showOpenDialog(null);
                    
                    File source = new File(details.getName());
                    
                    try {
                        File dest = new File(destination.getSelectedFile().getPath());
                        FileUtils.copyDirectoryToDirectory(source, dest);
                        try {
                            ps = con.prepareStatement("INSERT INTO tbl_recent (Recent_Details, File_Path, User_ID) VALUES (?, ?, ?)");
                            ps.setString(1, "You copy the folder \'"+details.getText()+"\'.");
                            ps.setString(2, dest.getPath());
                            ps.setString(3, label_user.getName());
                            ps.execute();
                        } catch (Exception e) {
                            System.out.println(e);
                        } finally {
                            if (rs != null) { try { rs.close(); } catch (SQLException e) {} }
                            if (ps != null) { try { ps.close(); } catch (SQLException e) {} }
                        }
                    } catch (IOException ioe) {
                        try {
                            File dest_copy = new File(destination.getSelectedFile() + "\\" + source.getName() + "-copy");
                            FileUtils.copyDirectoryToDirectory(source, dest_copy);
                            try {
                                ps = con.prepareStatement("INSERT INTO tbl_recent (Recent_Details, File_Path, User_ID) VALUES (?, ?, ?)");
                                ps.setString(1, "You copy the fodler \'"+details.getText()+"\'.");
                                ps.setString(2, dest_copy.getPath());
                                ps.setString(3, label_user.getName());
                                ps.execute();
                            } catch (Exception e) {
                                System.out.println(e);
                            } finally {
                                if (rs != null) { try { rs.close(); } catch (SQLException e) {} }
                                if (ps != null) { try { ps.close(); } catch (SQLException e) {} }
                            }
                        } catch (Exception ex) {
                            JOptionPane.showMessageDialog(container, "Ooops...\n\nAn error occurd while copying the folder.", "err", JOptionPane.ERROR_MESSAGE);
                        }
                    } catch (NullPointerException npe) {
                    }
                    
                    File dir = new File(label_currentfolder_myfiles.getName());
                    MyFiles(dir);
                } catch (Exception e) {
                }
                
            }
        });
        popupmenu_folder.add(copy_folder);
        
        JMenuItem move_folder = new JMenuItem();
        move_folder.setBackground(new java.awt.Color(255, 255, 255));
        move_folder.setFont(new java.awt.Font("Segoe UI", 1, 15));
        move_folder.setForeground(new java.awt.Color(8, 65, 26));
        move_folder.setText("Move Folder");
        move_folder.setToolTipText("");
        move_folder.setAccelerator(KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M,0));
        move_folder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                
                try {
                    File dirToLock = new File("src/root");
                    FileSystemView fsv = new DirectoryRestrictedFileSystemView(new File(dirToLock.getAbsolutePath()));
                    JFileChooser destination = new JFileChooser(dirToLock, fsv);
                    destination.isTraversable(dirToLock);
                    destination.setDialogTitle("Move folder to...");
                    destination.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
                    destination.setAcceptAllFileFilterUsed(false);
                    
                    destination.showOpenDialog(null);
                    
                    File source = new File(details.getName());
                    
                    try {
                        File dest = new File(destination.getSelectedFile().getPath());
                        FileUtils.moveDirectoryToDirectory(source, dest, true);
                        try {
                            ps = con.prepareStatement("INSERT INTO tbl_recent (Recent_Details, File_Path, User_ID) VALUES (?, ?, ?)");
                            ps.setString(1, "You move the folder \'"+details.getText()+"\'.");
                            ps.setString(2, dest.getPath());
                            ps.setString(3, label_user.getName());
                            ps.execute();
                        } catch (Exception e) {
                            System.out.println(e);
                        } finally {
                            if (rs != null) { try { rs.close(); } catch (SQLException e) {} }
                            if (ps != null) { try { ps.close(); } catch (SQLException e) {} }
                        }
                    } catch (IOException ioe) {
                        if (JOptionPane.showConfirmDialog(null, "Destination folder already contains \'" + details.getText() + "\'.\n\nDo you wish to re-select?", "Notice.", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                            actionPerformed(evt);
                        }
                    } catch (NullPointerException npe) {
                    }
                    
                    File dir = new File(label_currentfolder_myfiles.getName());
                    MyFiles(dir);
                } catch (Exception e) {
                }
                
            }
        });
        popupmenu_folder.add(move_folder);
        
        JMenuItem delete_folder = new JMenuItem();
        delete_folder.setBackground(new java.awt.Color(255, 255, 255));
        delete_folder.setFont(new java.awt.Font("Segoe UI", 1, 15));
        delete_folder.setForeground(new java.awt.Color(8, 65, 26));
        delete_folder.setText("Delete Folder");
        delete_folder.setToolTipText("");
        delete_folder.setAccelerator(KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, 0));
        delete_folder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                            
                if (JOptionPane.showConfirmDialog(null, "Are you sure you want to delete the folder \'"+details.getText()+"\' and its contents?","Notice.",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION){
                    try {
                        ps = con.prepareStatement("INSERT INTO tbl_trash (File_path, User_ID) VALUES (?, ?)");
                        ps.setString(1, path.getPath());
                        ps.setString(2, label_user.getName());
                        ps.execute();
                    } catch (Exception e) {
                        System.out.println(e);
                    } finally {
                        if (rs != null) {
                            try { rs.close(); } catch (SQLException e) {}
                        }
                        if (ps != null) {
                            try { ps.close(); } catch (SQLException e) {}
                        }
                    }
                    try {
                        ps = con.prepareStatement("INSERT INTO tbl_recent (Recent_Details, File_Path, User_ID) VALUES (?, ?, ?)");
                        ps.setString(1, "You delete the folder \'"+details.getText()+"\'.");
                        ps.setString(2, path.getPath());
                        ps.setString(3, label_user.getName());
                        ps.execute();
                    } catch (Exception e) {
                        System.out.println(e);
                    } finally {
                        if (rs != null) { try { rs.close(); } catch (SQLException e) {} }
                        if (ps != null) { try { ps.close(); } catch (SQLException e) {} }
                    }
                }
                
                File dir = new File(label_currentfolder_myfiles.getName());
                MyFiles(dir);
                
            }
        });
        popupmenu_folder.add(delete_folder);
        
        JPopupMenu.Separator separate_file = new JPopupMenu.Separator();
        separate_file.setBackground(new Color(8,65,26));
        separate_file.setForeground(new Color(8,65,26));
        separate_file.setOpaque(true);
        popupmenu_folder.add(separate_file);
        
        JMenuItem download_folder = new JMenuItem();
        download_folder.setBackground(new java.awt.Color(255, 255, 255));
        download_folder.setFont(new java.awt.Font("Segoe UI", 1, 15));
        download_folder.setForeground(new java.awt.Color(8, 65, 26));
        download_folder.setText("Download Folder");
        download_folder.setToolTipText("");
        download_folder.setAccelerator(KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, InputEvent.SHIFT_MASK));
        download_folder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                                
                try {
                    JFileChooser destination = new JFileChooser();
                    destination.setDialogTitle("Download folder to...");
                    destination.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
                    destination.setAcceptAllFileFilterUsed(false);
                    
                    destination.showOpenDialog(null);
                    
                    File source = new File(details.getName());
                    
                    try {
                        File dest = new File(destination.getSelectedFile().getPath());
                        FileUtils.copyDirectoryToDirectory(source, dest);
                        try {
                            ps = con.prepareStatement("INSERT INTO tbl_recent (Recent_Details, File_Path, User_ID) VALUES (?, ?, ?)");
                            ps.setString(1, "You download the folder \'"+details.getText()+"\'.");
                            ps.setString(2, path.getPath());
                            ps.setString(3, label_user.getName());
                            ps.execute();
                        } catch (Exception e) {
                            System.out.println(e);
                        } finally {
                            if (rs != null) { try { rs.close(); } catch (SQLException e) {} }
                            if (ps != null) { try { ps.close(); } catch (SQLException e) {} }
                        }
                        JOptionPane.showMessageDialog(null, "Folder downloaded!\n\n"+"File name: \'"+details.getText()+"\'");
                    } catch (IOException ioe) {
                        try {
                            File dest_copy = new File(destination.getSelectedFile() + "\\" + source.getName() + "-copy");
                            FileUtils.copyDirectoryToDirectory(source, dest_copy);
                            try {
                                ps = con.prepareStatement("INSERT INTO tbl_recent (Recent_Details, File_Path, User_ID) VALUES (?, ?, ?)");
                                ps.setString(1, "You download the folder \'"+details.getText()+"\'.");
                                ps.setString(2, path.getPath());
                                ps.setString(3, label_user.getName());
                                ps.execute();
                            } catch (Exception e) {
                                System.out.println(e);
                            } finally {
                                if (rs != null) { try { rs.close(); } catch (SQLException e) {} }
                                if (ps != null) { try { ps.close(); } catch (SQLException e) {} }
                            }
                            JOptionPane.showMessageDialog(null, "Folder downloaded!\n\n"+"File name: \'"+details.getText()+"\'");
                        } catch (Exception ex) {
                            JOptionPane.showMessageDialog(container, "Ooops...\n\nAn error occurd while downloading the folder.", "err", JOptionPane.ERROR_MESSAGE);
                        }
                    } catch (NullPointerException npe) {
                    }
                    
                } catch (Exception e) {
                }
                
            }
        });
        popupmenu_folder.add(download_folder);

        container.add(details);
        container.add(name);
        container.add(image);
        container.add(shadow);
        panel_folderview.add(container);
    }

    private void FileList(File path){
        
        boolean locked = false;
        int lock_id = 0;
        
        try {
            
            ps = con.prepareStatement("SELECT * FROM tbl_lock WHERE File_path = ? AND User_ID = ?");
            ps.setString(1, path.getPath());
            ps.setString(2, label_user.getName());
            rs = ps.executeQuery();
            while (rs.next()) {
                locked = true;
                lock_id = rs.getInt("Lock_ID");
            }
            
        } catch (SQLException sqle) {
        } finally {
            if (rs != null) {
                try { rs.close(); } catch (SQLException e) {}
            }
            if (ps != null) {
                try { ps.close(); } catch (SQLException e) {}
            }
        }
        
        final JPanel container = new JPanel();
        container.setBackground(new Color(76,255,137));
        container.setOpaque(false);
        container.setLayout(null);
        container.setPreferredSize(new Dimension(200,250));
        
        final JLabel shadow = new JLabel();
        shadow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sys Img/Folder and File/Border.png")));
        shadow.setBounds(0, 0, 200, 250);
        
        
        final JLabel image = new JLabel();
        image.setBounds(35, 35, 130, 130);
        if (locked == false) {
            image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sys Img/Folder and File/Word x130.png")));
        }
        else if (locked == true) {
            image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sys Img/Folder and File/Word Lock x130.png")));
        }
        
        final JLabel name = new JLabel(path.getName());
        name.setBounds(20, 185, 160, 40);
        name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        name.setFont(new java.awt.Font("Segoe UI", 0, 15));
        name.setOpaque(false);

        JPopupMenu popupmenu_folder = new JPopupMenu();
        
        final JLabel details = new JLabel();
        details.setText(path.getName());
        details.setToolTipText(path.getName());
        details.setName(""+path.getAbsolutePath());
        details.setFont(new java.awt.Font("Segoe UI", 0, 0));
        details.setOpaque(false);
        details.setComponentPopupMenu(popupmenu_folder);
        details.setBounds(10, 10, 180, 230);
                details.addMouseListener(new java.awt.event.MouseAdapter() {
                    public void mouseEntered(java.awt.event.MouseEvent evt) {
                        shadow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sys Img/Folder and File/Shadow.png")));
                        repaint();
                    }
                    public void mouseExited(java.awt.event.MouseEvent evt) {
                        shadow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sys Img/Folder and File/Border.png")));
                        repaint();
                    }
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        if (evt.getClickCount()==2){
                            try {
                                Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler "+path);
                                
                                try {
                                    ps = con.prepareStatement("INSERT INTO tbl_recent (Recent_Details, File_Path, User_ID) VALUES (?, ?, ?)");
                                    ps.setString(1, "You open the file \'"+details.getText()+"\'.");
                                    ps.setString(2, path.getPath());
                                    ps.setString(3, label_user.getName());
                                    ps.execute();
                                } catch (Exception e) {
                                    System.out.println(e);
                                } finally {
                                    if (rs != null) { try { rs.close(); } catch (SQLException e) {} }
                                    if (ps != null) { try { ps.close(); } catch (SQLException e) {} }
                                }
                                
                            } catch (Exception e) {
                                System.out.println(e);
                            }
                        }
                    }
                });
        
        JMenuItem rename_file = new JMenuItem();
        rename_file.setBackground(new java.awt.Color(255, 255, 255));
        rename_file.setFont(new java.awt.Font("Segoe UI", 1, 15));
        rename_file.setForeground(new java.awt.Color(8, 65, 26));
        rename_file.setText("Rename File");
        rename_file.setToolTipText("");
        rename_file.setAccelerator(KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, 0));
        rename_file.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                File item = new File(details.getName());
                String extension = FilenameUtils.getExtension(details.getName());
                String name = item.getName().substring(0,item.getName().indexOf("."+extension));
                String FileName = JOptionPane.showInputDialog(null, "Enter new name for the file \'"+details.getText()+"\'",name);
                try {
                    if (FileName!=null){
                        if ((FileName.trim().length()>0)&&(isValidName(FileName)==true)){
                            File old_name = new File(path.getPath());
                            File new_name = new File(old_name.getParent()+"\\"+FileName+"."+extension);
                            if (new_name.exists()==false){
                                old_name.renameTo(new_name);
                                try {
                                    ps = con.prepareStatement("INSERT INTO tbl_recent (Recent_Details, File_Path, User_ID) VALUES (?, ?, ?)");
                                    ps.setString(1, "You rename the file \'"+details.getText()+"\' to \'"+FileName+"."+extension+"\'.");
                                    ps.setString(2, new_name.getPath());
                                    ps.setString(3, label_user.getName());
                                    ps.execute();
                                } catch (Exception e) {
                                    System.out.println(e);
                                } finally {
                                    if (rs != null) { try { rs.close(); } catch (SQLException e) {} }
                                    if (ps != null) { try { ps.close(); } catch (SQLException e) {} }
                                }
                                try {
                                    
                                    ps = con.prepareStatement("UPDATE tbl_lock SET File_path = ? WHERE File_path = ? AND User_ID = ?");
                                    ps.setString(1, new_name.getAbsolutePath());
                                    ps.setString(2, details.getName());
                                    ps.setString(3, label_user.getName());
                                    ps.execute();
                                } catch (Exception e) {
                                    System.out.println(e);
                                } finally {
                                    if (rs != null) { try { rs.close(); } catch (SQLException e) {} }
                                    if (ps != null) { try { ps.close(); } catch (SQLException e) {} }
                                }
                            }
                            else {
                                try {
                                    ps = con.prepareStatement("SELECT * FROM tbl_trash WHERE File_path = ? AND User_ID = ?");
                                    ps.setString(1, new_name.getAbsolutePath());
                                    ps.setString(2, label_user.getName());
                                    rs = ps.executeQuery();
                                    if (rs.next()) {
                                        if (JOptionPane.showConfirmDialog(null, "File name \'"+FileName+"\' is reserved!\n\nPlease re-enter a new name.","Notice.",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION){
                                            actionPerformed(evt);
                                        }
                                    }
                                    else {
                                        if (JOptionPane.showConfirmDialog(null, "File named \'"+FileName+"\' already exist!\n\nDo you wish to re-enter?","Notice.",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION){
                                            actionPerformed(evt);
                                        }
                                    }
                                } catch (Exception e) {
                                    System.out.println(e);
                                } finally {
                                    if (rs != null) {
                                        try { rs.close(); } catch (SQLException e) {}
                                    }
                                    if (ps != null) {
                                        try { ps.close(); } catch (SQLException e) {}
                                    }
                                }
                                if (JOptionPane.showConfirmDialog(null, "File named \'"+FileName+"\' already exist!\n\nDo you wish to re-enter?","Notice.",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION){
                                    actionPerformed(evt);
                                }
                            }
                        }
                        else {
                            if (JOptionPane.showConfirmDialog(null, "File name is invalid,\nDo you wish to re-enter?","Notice.",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION){
                                actionPerformed(evt);
                            }
                        }
                    }
                } catch (Exception e) {
                    System.out.println(e);
                }
                
                File dir = new File(label_currentfolder_myfiles.getName());
                MyFiles(dir);
                
            }
        });
        popupmenu_folder.add(rename_file);
        
        JMenuItem copy_file = new JMenuItem();
        copy_file.setBackground(new java.awt.Color(255, 255, 255));
        copy_file.setFont(new java.awt.Font("Segoe UI", 1, 15));
        copy_file.setForeground(new java.awt.Color(8, 65, 26));
        copy_file.setText("Copy File");
        copy_file.setToolTipText("");
        copy_file.setAccelerator(KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, 0));
        copy_file.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                
                try {
                    File item = new File(details.getName());
                    String name = item.getName().substring(0, item.getName().indexOf("."));
                    String extension = item.getName().substring(item.getName().indexOf("."));
                    
                    File dirToLock = new File("src/root");
                    FileSystemView fsv = new DirectoryRestrictedFileSystemView(new File(dirToLock.getAbsolutePath()));
                    JFileChooser destination = new JFileChooser(dirToLock, fsv);
                    destination.setDialogTitle("Copy file to...");
                    destination.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
                    destination.setAcceptAllFileFilterUsed(false);
                    
                    destination.showOpenDialog(null);
                    
                    File source = new File(details.getName());
                    
                    try {
                        File dest = new File(destination.getSelectedFile().getPath());
                        FileUtils.copyFileToDirectory(source, dest);
                        try {
                            ps = con.prepareStatement("INSERT INTO tbl_recent (Recent_Details, File_Path, User_ID) VALUES (?, ?, ?)");
                            ps.setString(1, "You copy the file \'"+details.getText()+"\'.");
                            ps.setString(2, dest.getPath());
                            ps.setString(3, label_user.getName());
                            ps.execute();
                        } catch (Exception e) {
                            System.out.println(e);
                        } finally {
                            if (rs != null) { try { rs.close(); } catch (SQLException e) {} }
                            if (ps != null) { try { ps.close(); } catch (SQLException e) {} }
                        }
                    } catch (IOException ioe) {
                        try {
                            File dest_copy = new File(destination.getSelectedFile() + "\\" + name + "-copy" + extension);
                            FileUtils.copyFile(source, dest_copy);
                            try {
                                ps = con.prepareStatement("INSERT INTO tbl_recent (Recent_Details, File_Path, User_ID) VALUES (?, ?, ?)");
                                ps.setString(1, "You copy the file \'"+details.getText()+"\'.");
                                ps.setString(2, dest_copy.getPath());
                                ps.setString(3, label_user.getName());
                                ps.execute();
                            } catch (Exception e) {
                                System.out.println(e);
                            } finally {
                                if (rs != null) { try { rs.close(); } catch (SQLException e) {} }
                                if (ps != null) { try { ps.close(); } catch (SQLException e) {} }
                            }
                        } catch (Exception e) {
                            JOptionPane.showMessageDialog(container, "Ooops...\n\nAn error occurd while copying the file.", "err", JOptionPane.ERROR_MESSAGE);
                        }
                    } catch (Exception e) {
                    }
                    
                    File dir = new File(label_currentfolder_myfiles.getName());
                    MyFiles(dir);
                } catch (Exception e) {
                }
                
            }
        });
        popupmenu_folder.add(copy_file);
        
        JMenuItem move_file = new JMenuItem();
        move_file.setBackground(new java.awt.Color(255, 255, 255));
        move_file.setFont(new java.awt.Font("Segoe UI", 1, 15));
        move_file.setForeground(new java.awt.Color(8, 65, 26));
        move_file.setText("Move File");
        move_file.setToolTipText("");
        move_file.setAccelerator(KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, 0));
        move_file.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                
                try {
                    File dirToLock = new File("src/root");
                    FileSystemView fsv = new DirectoryRestrictedFileSystemView(new File(dirToLock.getAbsolutePath()));
                    JFileChooser destination = new JFileChooser(dirToLock, fsv);
                    destination.isTraversable(dirToLock);
                    destination.setDialogTitle("Move file to...");
                    destination.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
                    destination.setAcceptAllFileFilterUsed(false);
                    
                    destination.showOpenDialog(null);
                    
                    File source = new File(details.getName());
                    
                    try {
                        File dest = new File(destination.getSelectedFile().getPath());
                        FileUtils.moveFileToDirectory(source, dest, false);
                        
                        try {
                            ps = con.prepareStatement("INSERT INTO tbl_recent (Recent_Details, File_Path, User_ID) VALUES (?, ?, ?)");
                            ps.setString(1, "You move the file \'"+details.getText()+"\'.");
                            ps.setString(2, dest.getPath());
                            ps.setString(3, label_user.getName());
                            ps.execute();
                        } catch (Exception e) {
                            System.out.println(e);
                        } finally {
                            if (rs != null) { try { rs.close(); } catch (SQLException e) {} }
                            if (ps != null) { try { ps.close(); } catch (SQLException e) {} }
                        }
                        
                    } catch (IOException ioe) {
                        if (JOptionPane.showConfirmDialog(null, "Destination folder already contains \'" + details.getText() + "\'.\n\nDo you wish to re-select?", "Notice.", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                            actionPerformed(evt);
                        }
                    } catch (Exception e) {
                    }
                    
                    File dir = new File(label_currentfolder_myfiles.getName());
                    MyFiles(dir);
                } catch (Exception e) {
                }
                
            }
        });
        popupmenu_folder.add(move_file);
        
        JMenuItem delete_file = new JMenuItem();
        delete_file.setBackground(new java.awt.Color(255, 255, 255));
        delete_file.setFont(new java.awt.Font("Segoe UI", 1, 15));
        delete_file.setForeground(new java.awt.Color(8, 65, 26));
        delete_file.setText("Delete File");
        delete_file.setToolTipText("");
        delete_file.setAccelerator(KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, 0));
        delete_file.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                
                if (JOptionPane.showConfirmDialog(null, "Are you sure you want to delete the file \'"+details.getText()+"\'?","Notice.",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION){
                    try {
                        ps = con.prepareStatement("INSERT INTO tbl_trash (File_path, User_ID) VALUES (?, ?)");
                        ps.setString(1, path.getPath());
                        ps.setString(2, label_user.getName());
                        ps.execute();
                    } catch (Exception e) {
                        System.out.println(e);
                    } finally {
                        if (rs != null) {
                            try { rs.close(); } catch (SQLException e) {}
                        }
                        if (ps != null) {
                            try { ps.close(); } catch (SQLException e) {}
                        }
                    }
                    try {
                        ps = con.prepareStatement("INSERT INTO tbl_recent (Recent_Details, File_Path, User_ID) VALUES (?, ?, ?)");
                        ps.setString(1, "You delete the file \'"+details.getText()+"\'.");
                        ps.setString(2, path.getPath());
                        ps.setString(3, label_user.getName());
                        ps.execute();
                    } catch (Exception e) {
                        System.out.println(e);
                    } finally {
                        if (rs != null) { try { rs.close(); } catch (SQLException e) {} }
                        if (ps != null) { try { ps.close(); } catch (SQLException e) {} }
                    }
                }
                
                File dir = new File(label_currentfolder_myfiles.getName());
                MyFiles(dir);
                
            }
        });
        popupmenu_folder.add(delete_file);
        
        JPopupMenu.Separator separate_file = new JPopupMenu.Separator();
        separate_file.setBackground(new Color(8,65,26));
        separate_file.setForeground(new Color(8,65,26));
        separate_file.setOpaque(true);
        popupmenu_folder.add(separate_file);
        
        if (locked == false) {
            JMenuItem lock_file = new JMenuItem();
            lock_file.setBackground(new java.awt.Color(255, 255, 255));
            lock_file.setFont(new java.awt.Font("Segoe UI", 1, 15));
            lock_file.setForeground(new java.awt.Color(8, 65, 26));
            lock_file.setText("Make Private");
            lock_file.setToolTipText("");
            lock_file.setAccelerator(KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, 0));
            lock_file.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {

                    try {
                        try {
                            ps = con.prepareStatement("INSERT INTO tbl_lock (File_path, User_ID) VALUES (?, ?)");
                            ps.setString(1, path.getPath());
                            ps.setString(2, label_user.getName());
                            ps.execute();
                        } catch (Exception e) {
                            System.out.println(e);
                        } finally {
                            if (rs != null) {
                                try { rs.close(); } catch (SQLException e) {}
                            }
                            if (ps != null) {
                                try { ps.close(); } catch (SQLException e) {}
                            }
                        }
                        File dir = new File(label_currentfolder_myfiles.getName());
                        MyFiles(dir);
                    } catch (Exception e) {
                    }

                }
            });
            popupmenu_folder.add(lock_file);
        }
        else if (locked == true) {
            int LockID = lock_id;
            JMenuItem lock_file = new JMenuItem();
            lock_file.setBackground(new java.awt.Color(255, 255, 255));
            lock_file.setFont(new java.awt.Font("Segoe UI", 1, 15));
            lock_file.setForeground(new java.awt.Color(8, 65, 26));
            lock_file.setText("Make Public");
            lock_file.setToolTipText("");
            lock_file.setAccelerator(KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, 0));
            lock_file.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {

                    try {
                        try {
                            ps = con.prepareStatement("DELETE FROM tbl_lock WHERE Lock_ID = ?");
                            ps.setInt(1, LockID);
                            ps.execute();
                        } catch (Exception e) {
                            System.out.println(e);
                        } finally {
                            if (rs != null) {
                                try { rs.close(); } catch (SQLException e) {}
                            }
                            if (ps != null) {
                                try { ps.close(); } catch (SQLException e) {}
                            }
                        }
                        File dir = new File(label_currentfolder_myfiles.getName());
                        MyFiles(dir);
                    } catch (Exception e) {
                    }

                }
            });
            popupmenu_folder.add(lock_file);
        }
        
        JMenuItem download_file = new JMenuItem();
        download_file.setBackground(new java.awt.Color(255, 255, 255));
        download_file.setFont(new java.awt.Font("Segoe UI", 1, 15));
        download_file.setForeground(new java.awt.Color(8, 65, 26));
        download_file.setText("Download File");
        download_file.setToolTipText("");
        download_file.setAccelerator(KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, InputEvent.SHIFT_MASK));
        download_file.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                
                try {
                    File item = new File(details.getName());
                    String name = item.getName().substring(0, item.getName().indexOf("."));
                    String extension = item.getName().substring(item.getName().indexOf("."));
                    
                    JFileChooser destination = new JFileChooser();
                    destination.setDialogTitle("Download file to...");
                    destination.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
                    destination.setAcceptAllFileFilterUsed(false);
                    
                    destination.showOpenDialog(null);
                    
                    File source = new File(details.getName());
                    
                    try {
                        File dest = new File(destination.getSelectedFile().getPath());
                        FileUtils.copyFileToDirectory(source, dest);
                        try {
                            ps = con.prepareStatement("INSERT INTO tbl_recent (Recent_Details, File_Path, User_ID) VALUES (?, ?, ?)");
                            ps.setString(1, "You download the file \'"+details.getText()+"\'.");
                            ps.setString(2, path.getPath());
                            ps.setString(3, label_user.getName());
                            ps.execute();
                        } catch (Exception e) {
                            System.out.println(e);
                        } finally {
                            if (rs != null) { try { rs.close(); } catch (SQLException e) {} }
                            if (ps != null) { try { ps.close(); } catch (SQLException e) {} }
                        }
                        JOptionPane.showMessageDialog(null, "File downloaded!\n\n"+"File name: \'"+details.getText()+"\'");
                    } catch (IOException ioe) {
                        try {
                            File dest_copy = new File(destination.getSelectedFile() + "\\" + name + "-copy" + extension);
                            FileUtils.copyFile(source, dest_copy);
                            try {
                                ps = con.prepareStatement("INSERT INTO tbl_recent (Recent_Details, File_Path, User_ID) VALUES (?, ?, ?)");
                                ps.setString(1, "You download the file \'"+details.getText()+"\'.");
                                ps.setString(2, path.getPath());
                                ps.setString(3, label_user.getName());
                                ps.execute();
                            } catch (Exception e) {
                                System.out.println(e);
                            } finally {
                                if (rs != null) { try { rs.close(); } catch (SQLException e) {} }
                                if (ps != null) { try { ps.close(); } catch (SQLException e) {} }
                            }
                            JOptionPane.showMessageDialog(null, "File downloaded!\n\n"+"File name: \'"+details.getText()+"\'");
                        } catch (Exception e) {
                            JOptionPane.showMessageDialog(container, "Ooops...\n\nAn error occurd while downloading the file.", "err", JOptionPane.ERROR_MESSAGE);
                        }
                    } catch (Exception e) {
                    }
                    
                    File dir = new File(label_currentfolder_myfiles.getName());
                    MyFiles(dir);
                } catch (Exception e) {
                }
                
            }
        });
        popupmenu_folder.add(download_file);
        
        container.add(details);
        container.add(name);
        container.add(image);
        container.add(shadow);
        panel_folderview.add(container);
    }
    
    // ------------------------------------------------------------------
    
    private void OtherUserFiles(File[] file){
        
        Drive1.setFont(new Font("Segoe UI", 0, 20));
        Drive2.setFont(new Font("Segoe UI", 0, 20));
        
        panel_canvas.removeAll();
        panel_canvas.add(panel_otheruserfiles);
        panel_folderview_otheruser.removeAll();
        revalidate();
        repaint();
        
        if (file.length > 0){
                        
            File parent = new File(file[0].getParent());
            label_address_otheruser.setText(user_name+"  |  "+parent.getPath().substring(4)+"\\"); //Address
            label_currentfolder_otheruser.setText(user_name+"  |  "+parent.getName()); //Folder name
            label_currentfolder_otheruser.setName(parent.getAbsolutePath()); //File path

            if (file==null){
                NoFile();
            }
            else {
                for (File item : file) {
                    if(item.getName().contains(".")==false){
                        try {
                            ps = con.prepareStatement("SELECT * FROM tbl_trash WHERE File_path = ? AND User_ID = ?");
                            ps.setString(1, item.getAbsolutePath());
                            ps.setString(2, user_id);
                            rs = ps.executeQuery();
                            if (rs.next()) {
                                continue;
                            }
                            else {
                                FolderOther(item);
                            }
                        } catch (Exception e) {
                            System.out.println(e);
                        } finally {
                            if (rs != null) {
                                try { rs.close(); } catch (SQLException e) {}
                            }
                            if (ps != null) {
                                try { ps.close(); } catch (SQLException e) {}
                            }
                        }
                    }
                }
                for (File item : file) {
                    if(item.getName().contains(".")==true){
                        if (item.getName().substring(0,2).equals("~$")){
                            continue;
                        }
                        try {
                            ps = con.prepareStatement("SELECT * FROM tbl_lock WHERE File_path = ? AND User_ID = ?");
                            ps.setString(1, item.getPath());
                            ps.setString(2, user_id);
                            rs = ps.executeQuery();
                            if (rs.next()) {
                                continue;
                            }
                            ps = con.prepareStatement("SELECT * FROM tbl_trash WHERE File_path = ? AND User_ID = ?");
                            ps.setString(1, item.getPath());
                            ps.setString(2, user_id);
                            rs = ps.executeQuery();
                            if (rs.next()) {
                                continue;
                            }
                            
                            FileListOtherUser(item);

                        } catch (SQLException sqle) {
                        } finally {
                            if (rs != null) {
                                try { rs.close(); } catch (SQLException e) {}
                            }
                            if (ps != null) {
                                try { ps.close(); } catch (SQLException e) {}
                            }
                        }
                        
                    }
                }
            }
        
        } else {
            final JPanel container = new JPanel();
            container.setLayout(new java.awt.CardLayout());
            container.setBackground(new Color(245,245,245));
            container.setOpaque(true);
            container.setPreferredSize(new Dimension(scrollpane_folderview_otheruser.getWidth()-20,scrollpane_folderview_otheruser.getHeight()-100));

            final JLabel name = new JLabel();
            name.setText("This folder is empty.");
            name.setHorizontalAlignment((int) CENTER_ALIGNMENT);
            name.setVerticalAlignment((int) CENTER_ALIGNMENT);
            name.setFont(new Font("Segoe UI", 0, 40));
            name.setForeground(new Color(0,155,52));

            container.add(name);
            panel_folderview_otheruser.add(container);
        }
        
        ResizeMyFiles();
        revalidate();
        repaint();
    }
        
    private void FolderOther(File path){
        
        final JPanel container = new JPanel();
        container.setBackground(new Color(76,255,137));
        container.setOpaque(false);
        container.setLayout(null);
        container.setPreferredSize(new Dimension(200,250));
        
        final JLabel shadow = new JLabel();
        shadow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sys Img/Folder and File/Border.png")));
        shadow.setBounds(0, 0, 200, 250);
        
        final JLabel image = new JLabel();
        image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sys Img/Folder and File/Folder.png")));
        image.setBounds(35, 35, 130, 130);
        
        final JLabel name = new JLabel(path.getName());
        name.setBounds(20, 185, 160, 40);
        name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        name.setFont(new java.awt.Font("Segoe UI", 0, 15));
        name.setOpaque(false);
        
        JPopupMenu popupmenu_folder = new JPopupMenu();

        final JLabel details = new JLabel();;
        details.setToolTipText(path.getName());
        details.setName(""+path.getAbsolutePath());
        details.setFont(new java.awt.Font("Segoe UI", 0, 0));
        details.setOpaque(false);
        details.setComponentPopupMenu(popupmenu_folder);
        details.setBounds(10, 10, 180, 230);
                details.addMouseListener(new java.awt.event.MouseAdapter() {
                    public void mouseEntered(java.awt.event.MouseEvent evt) {
                        shadow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sys Img/Folder and File/Shadow.png")));
                        repaint();
                    }
                    public void mouseExited(java.awt.event.MouseEvent evt) {
                        shadow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sys Img/Folder and File/Border.png")));
                        repaint();
                    }
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        if (evt.getClickCount()==2) {
                            try {
                                Socket connection = new Socket(user_ip, Integer.parseInt(user_port));
//                                Socket connection = new Socket("127.0.0.1", Integer.parseInt(user_port));
                                ObjectOutputStream out = new ObjectOutputStream(connection.getOutputStream());
                                out.writeObject("Load:" + path.getPath());
                                out.flush();
                                
                                File[] file_list = null;
                                ObjectInputStream in = new ObjectInputStream(connection.getInputStream());
                                file_list = (File[]) in.readObject();
                                
                                connection.close();
                                out.close();
                                in.close();
                                
                                label_address_otheruser.setText(user_name+"  |  "+path.getPath().substring(4)+"\\"); //Address
                                label_currentfolder_otheruser.setText(user_name+"  |  "+name.getText()); //Folder name
                                label_currentfolder_otheruser.setName(path.getPath()); //File path
                                
                                OtherUserFiles(file_list); // Use the data colected
                                
                                try {
                                    ps = con.prepareStatement("INSERT INTO tbl_recent (Recent_Details, File_Path, User_ID) VALUES (?, ?, ?)");
                                    ps.setString(1, user_name+" open the folder \'"+name.getText()+"\'.");
                                    ps.setString(2, path.getPath());
                                    ps.setString(3, user_id);
                                    ps.execute();
                                } catch (Exception e) {
                                    System.out.println(e);
                                } finally {
                                    if (rs != null) { try { rs.close(); } catch (SQLException e) {} }
                                    if (ps != null) { try { ps.close(); } catch (SQLException e) {} }
                                }
                                
                            } catch (NumberFormatException numberFormatException) {
                            } catch (IOException iOException) {
                            } catch (ClassNotFoundException classNotFoundException) {
                            }
                        }
                    }
                });
                
        container.add(details);
        container.add(name);
        container.add(image);
        container.add(shadow);
        panel_folderview_otheruser.add(container);
    }
    
    private void FileListOtherUser(File path){
        
        final JPanel container = new JPanel();
        container.setBackground(new Color(76,255,137));
        container.setOpaque(false);
        container.setLayout(null);
        container.setPreferredSize(new Dimension(200,250));
        
        final JLabel shadow = new JLabel();
        shadow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sys Img/Folder and File/Border.png")));
        shadow.setBounds(0, 0, 200, 250);
        
        final JLabel image = new JLabel();
        image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sys Img/Folder and File/Word x130.png")));
        image.setBounds(35, 35, 130, 130);
        
        final JLabel name = new JLabel(path.getName());
        name.setBounds(20, 185, 160, 40);
        name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        name.setFont(new java.awt.Font("Segoe UI", 0, 15));
        name.setOpaque(false);

        JPopupMenu popupmenu_folder = new JPopupMenu();
        
        final JLabel details = new JLabel();
        details.setText(path.getName());
        details.setToolTipText(path.getName());
        details.setName(""+path);
        details.setFont(new java.awt.Font("Segoe UI", 0, 0));
        details.setOpaque(false);
        details.setComponentPopupMenu(popupmenu_folder);
        details.setBounds(10, 10, 180, 230);
                details.addMouseListener(new java.awt.event.MouseAdapter() {
                    public void mouseEntered(java.awt.event.MouseEvent evt) {
                        shadow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sys Img/Folder and File/Shadow.png")));
                        repaint();
                    }
                    public void mouseExited(java.awt.event.MouseEvent evt) {
                        shadow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sys Img/Folder and File/Border.png")));
                        repaint();
                    }
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        if (evt.getClickCount()==2){
                            try {
                                Socket connection = new Socket(user_ip, Integer.parseInt(user_port));
//                                Socket connection = new Socket("127.0.0.1", Integer.parseInt(user_port));
                                ObjectOutputStream out = new ObjectOutputStream(connection.getOutputStream());
                                out.writeObject("Send:" + details.getName());
                                out.flush();
                                
                                File f = File.createTempFile("TEMP-"+FilenameUtils.removeExtension(details.getText()),
                                        "."+FilenameUtils.getExtension(details.getText()));
                                InputStream is = connection.getInputStream();
                                byte[] bytes = IOUtils.toByteArray(is);
                                Path ff = Files.write(f.toPath(), bytes);
                                Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler "+ff);
                                f.deleteOnExit();

                                connection.close();
                                out.close();
                                is.close();
                                
                                try {
                                    ps = con.prepareStatement("INSERT INTO tbl_recent (Recent_Details, File_Path, User_ID) VALUES (?, ?, ?)");
                                    ps.setString(1, user_name+" open the file \'"+details.getText()+"\'.");
                                    ps.setString(2, path.getPath());
                                    ps.setString(3, user_id);
                                    ps.execute();
                                } catch (Exception e) {
                                    System.out.println(e);
                                } finally {
                                    if (rs != null) { try { rs.close(); } catch (SQLException e) {} }
                                    if (ps != null) { try { ps.close(); } catch (SQLException e) {} }
                                }
                                
                            } catch (NumberFormatException numberFormatException) {
                            } catch (IOException iOException) {
                            }
                        }
                    }
                });
                
        JMenuItem copy_file = new JMenuItem();
        copy_file.setBackground(new java.awt.Color(255, 255, 255));
        copy_file.setFont(new java.awt.Font("Segoe UI", 1, 15));
        copy_file.setForeground(new java.awt.Color(8, 65, 26));
        copy_file.setText("Copy File");
        copy_file.setToolTipText("");
        copy_file.setAccelerator(KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, 0));
        copy_file.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    Socket connection = new Socket(user_ip, Integer.parseInt(user_port));
//                    Socket connection = new Socket("127.0.0.1", Integer.parseInt(user_port));
                    ObjectOutputStream out = new ObjectOutputStream(connection.getOutputStream());
                    out.writeObject("Send:" + details.getName());
                    out.flush();
                    
                    File dirToLock = new File("src/root");
                    FileSystemView fsv = new DirectoryRestrictedFileSystemView(new File(dirToLock.getAbsolutePath()));
                    JFileChooser destination = new JFileChooser(dirToLock, fsv);
                    destination.setDialogTitle("Copy file to...");
                    destination.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
                    destination.setAcceptAllFileFilterUsed(false);
                    destination.showOpenDialog(null);
                                
                    InputStream in = connection.getInputStream();
                    FileOutputStream fos = new FileOutputStream(destination.getSelectedFile()+"\\"+details.getText()); //dir to save
                    BufferedOutputStream bos = new BufferedOutputStream(fos);
                    int count;
                    byte[] byte_data = new byte[1024];
                    while ((count = in.read(byte_data)) > 0) {
                        bos.write(byte_data, 0, count);
                    }

                    bos.flush();
                    fos.close();
                    bos.close();
                    in.close();
                    out.close();             
                    connection.close();
                    
                    try {
                        ps = con.prepareStatement("INSERT INTO tbl_recent (Recent_Details, File_Path, User_ID) VALUES (?, ?, ?)");
                        ps.setString(1, user_name+" copy the file \'"+details.getText()+"\'.");
                        ps.setString(2, path.getPath());
                        ps.setString(3, user_id);
                        ps.execute();
                    } catch (Exception e) {
                        System.out.println(e);
                    } finally {
                        if (rs != null) { try { rs.close(); } catch (SQLException e) {} }
                        if (ps != null) { try { ps.close(); } catch (SQLException e) {} }
                    }
                    
                    JOptionPane.showMessageDialog(null, "File received!\n\n"+"File name: \'"+details.getText()+"\'","hey!",JOptionPane.INFORMATION_MESSAGE);
                    
                } catch (Exception e) {
                }
            }
        });
        popupmenu_folder.add(copy_file);
                
        JMenuItem download_file = new JMenuItem();
        download_file.setBackground(new java.awt.Color(255, 255, 255));
        download_file.setFont(new java.awt.Font("Segoe UI", 1, 15));
        download_file.setForeground(new java.awt.Color(8, 65, 26));
        download_file.setText("Download File");
        download_file.setToolTipText("");
        download_file.setAccelerator(KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, 0));
        download_file.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    Socket connection = new Socket(user_ip, Integer.parseInt(user_port));
//                    Socket connection = new Socket("127.0.0.1", Integer.parseInt(user_port));
                    ObjectOutputStream out = new ObjectOutputStream(connection.getOutputStream());
                    out.writeObject("Send:" + details.getName());
                    out.flush();
                    
                    JFileChooser destination = new JFileChooser();
                    destination.setDialogTitle("Download file to...");
                    destination.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
                    destination.setAcceptAllFileFilterUsed(false);
                    destination.showOpenDialog(null);
                                
                    InputStream in = connection.getInputStream();
                    FileOutputStream fos = new FileOutputStream(destination.getSelectedFile()+"\\"+details.getText()); //dir to save
                    BufferedOutputStream bos = new BufferedOutputStream(fos);
                    int count;
                    byte[] byte_data = new byte[1024];
                    while ((count = in.read(byte_data)) > 0) {
                        bos.write(byte_data, 0, count);
                    }

                    bos.flush();
                    fos.close();
                    bos.close();
                    in.close();
                    out.close();             
                    connection.close();
                    
                    try {
                        ps = con.prepareStatement("INSERT INTO tbl_recent (Recent_Details, File_Path, User_ID) VALUES (?, ?, ?)");
                        ps.setString(1, user_name+" download the file \'"+details.getText()+"\'.");
                        ps.setString(2, path.getPath());
                        ps.setString(3, user_id);
                        ps.execute();
                    } catch (Exception e) {
                        System.out.println(e);
                    } finally {
                        if (rs != null) { try { rs.close(); } catch (SQLException e) {} }
                        if (ps != null) { try { ps.close(); } catch (SQLException e) {} }
                    }
                    
                    JOptionPane.showMessageDialog(null, "File downloaded!\n\n"+"File name: \'"+details.getText()+"\'");
                    
                } catch (Exception e) {
                }
            }
        });
        popupmenu_folder.add(download_file);
                
        container.add(details);
        container.add(name);
        container.add(image);
        container.add(shadow);
        panel_folderview_otheruser.add(container);
    }
    
    private void NoFile(){
        final JPanel container = new JPanel();
        container.setBackground(new Color(245,245,245));
        container.setOpaque(true);
        container.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 0));
        container.setPreferredSize(new Dimension(scrollpane_folderview_otheruser.getWidth()-20,scrollpane_folderview_otheruser.getHeight()-100));

        final JLabel label0 = new JLabel();
        label0.setPreferredSize(new Dimension(scrollpane_folderview_otheruser.getWidth()-20,100));

        final JLabel label1 = new JLabel();
        label1.setText("Can't connect to this user.");
        label1.setHorizontalAlignment((int) CENTER_ALIGNMENT);
        label1.setVerticalAlignment((int) CENTER_ALIGNMENT);
        label1.setFont(new Font("Segoe UI", 0, 40));
        label1.setForeground(new Color(0,155,52));
        label1.setBackground(new Color(0,155,52));
        label1.setPreferredSize(new Dimension(scrollpane_folderview_otheruser.getWidth()-20,100));

        final JLabel label2 = new JLabel();
        label2.setText("User could be offine at the moment.");
        label2.setHorizontalAlignment((int) CENTER_ALIGNMENT);
        label2.setVerticalAlignment((int) CENTER_ALIGNMENT);
        label2.setFont(new Font("Segoe UI", 0, 40));
        label2.setForeground(new Color(0,155,52));
        label2.setPreferredSize(new Dimension(scrollpane_folderview_otheruser.getWidth()-20,100));

        container.add(label0);
        container.add(label1);
        container.add(label2);
        panel_folderview_otheruser.add(container);
    }
        
    // ------------------------------------------------------------------
    
    public void Search(String text) {
                
        if (user_id.equals("")){
            
            count_result = 0;
            
            panel_canvas.removeAll();
            panel_canvas.add(panel_result);
            panel_folderview_result.removeAll();
            revalidate();
            repaint();
            
            label_result.setText("Search results for: "+text.replaceAll("\\s+", " ").toUpperCase());
            label_result.setName(text);
            
            File all = new File("src\\root");
            
            ScanFiles(all, text);
            
            if (count_result==0) {
                final JPanel container = new JPanel();
                container.setLayout(new java.awt.CardLayout());
                container.setBackground(new Color(245,245,245));
                container.setOpaque(true);
                container.setPreferredSize(new Dimension(scrollpane_folderview.getWidth()-20,scrollpane_folderview.getHeight()-100));

                final JLabel name = new JLabel();
                name.setText("No result found.");
                name.setHorizontalAlignment((int) CENTER_ALIGNMENT);
                name.setVerticalAlignment((int) CENTER_ALIGNMENT);
                name.setFont(new Font("Segoe UI", 0, 40));
                name.setForeground(new Color(0,155,52));

                container.add(name);
                panel_folderview_result.add(container);
            }
            
            user_port = "";
            user_ip = "";
            user_name = "";
            user_id = "";

            revalidate();
            repaint();
        }
        else {
            
        }
    }
    
    public void ScanFiles(File all, String text){
        for (File file : all.listFiles()) {
            if (file.isDirectory()==false){
                try {
                    ps = con.prepareStatement("SELECT * FROM tbl_trash WHERE File_path = ? AND User_ID = ?");
                    ps.setString(1, file.getAbsolutePath());
                    ps.setString(2, label_user.getName());
                    rs = ps.executeQuery();
                    if (rs.next()) {
                        continue;
                    }
                } catch (SQLException sqle) {
                }
                try {
                    FileInputStream fis = new FileInputStream(file.getPath());
                    XWPFDocument doc = new XWPFDocument(fis);
                    XWPFWordExtractor we = new XWPFWordExtractor(doc);

                    String[] words = text.replaceAll("\\s+", " ").split(" ");
                    if (words.length > 3) {
                        for (int i = 0; i < words.length - 2; i++) {
                            String threeWords;
                            if (i == words.length - 2) {
                                threeWords = words[i] + " " + words[i + 1];
                            } else {
                                threeWords = words[i] + " " + words[i + 1] + " " + words[i + 2];
                            }
                            if (file.getName().trim().toLowerCase().contains(threeWords.trim().toLowerCase())==true){
                                FileListResult(file);
                                count_result++;
                                break;
                            }
                            if (we.getText().trim().toLowerCase().contains(threeWords.trim().toLowerCase())==true){
                                FileListResult(file);
                                count_result++;
                                break;
                            }
                        }
                    } else {
                        String[] word = text.replaceAll("\\s+", " ").split(" ");
                        for (String string : word) {
                            if (file.getName().trim().toLowerCase().contains(string.trim().toLowerCase())==true){
                                FileListResult(file);
                                count_result++;
                                break;
                            }
                            if (we.getText().trim().toLowerCase().contains(string.trim().toLowerCase())==true){
                                FileListResult(file);
                                count_result++;
                                break;
                            }
                        }
                    }
                } catch (IOException ioe) {
                    ioe.printStackTrace();
                }
            }
        }
        for (File file : all.listFiles()) {
            if (file.isDirectory()==true){
                ScanFiles(file, text);
            }
        }
    }
    
    private void FileListResult(File path){
        
        int c_width = scrollpane_folderview_reult.getWidth()-100;
        boolean locked = false;
        
        try {
            
            ps = con.prepareStatement("SELECT * FROM tbl_lock WHERE File_path = ? AND User_ID = ?");
            ps.setString(1, path.getAbsolutePath());
            ps.setString(2, label_user.getName());
            rs = ps.executeQuery();
            while (rs.next()) {
                locked = true;
            }
            
        } catch (SQLException sqle) {
        } finally {
            if (rs != null) {
                try { rs.close(); } catch (SQLException e) {}
            }
            if (ps != null) {
                try { ps.close(); } catch (SQLException e) {}
            }
        }
        
        final JPanel container = new JPanel();
        container.setOpaque(false);
        container.setLayout(null);
        container.setPreferredSize(new Dimension(c_width,100));
        
        final JLabel file_logo = new JLabel();
        if (locked == false) {
            file_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sys Img/Folder and File/Word x80.png")));
        }
        else if (locked == true) {
            file_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sys Img/Folder and File/Word Lock x80.png")));
        }
        
        file_logo.setOpaque(false);
        file_logo.setBounds(15, 10, 80, 80);
        container.add(file_logo);
        
        final JLabel file_displayname = new JLabel(path.getName());
        file_displayname.setFont(new java.awt.Font("Segoe UI", 0, 23));
        file_displayname.setOpaque(false);
        file_displayname.setBounds(105, 10, c_width-120, 40);
        container.add(file_displayname);
        
        final JLabel file_displayaddress = new JLabel(path.getPath().substring(4));
        file_displayaddress.setFont(new java.awt.Font("Segoe UI", 0, 20));
        file_displayaddress.setForeground(new Color(120,120,120));
        file_displayaddress.setOpaque(false);
        file_displayaddress.setBounds(105, 50, c_width-120, 40);
        container.add(file_displayaddress);
        
        final JLabel details = new JLabel();
        details.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 155, 52)));
        details.setOpaque(false);
        details.setBounds(5, 5, c_width-10, 90);
            details.addMouseListener(new java.awt.event.MouseAdapter() {
                    public void mouseEntered(java.awt.event.MouseEvent evt) {
                        details.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 155, 52),3));
                        repaint();
                    }
                    public void mouseExited(java.awt.event.MouseEvent evt) {
                        details.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 155, 52)));
                        repaint();
                    }
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        if (evt.getClickCount()==2){
                            try {
                                Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler "+path.getAbsolutePath());
                                
                                try {
                                    ps = con.prepareStatement("INSERT INTO tbl_recent (Recent_Details, File_Path, User_ID) VALUES (?, ?, ?)");
                                    ps.setString(1, "You open the file \'"+path.getName()+"\'.");
                                    ps.setString(2, path.getPath());
                                    ps.setString(3, label_user.getName());
                                    ps.execute();
                                } catch (Exception e) {
                                    System.out.println(e);
                                } finally {
                                    if (rs != null) { try { rs.close(); } catch (SQLException e) {} }
                                    if (ps != null) { try { ps.close(); } catch (SQLException e) {} }
                                }
                                
                            } catch (Exception e) {
                                System.out.println(e);
                            }
                        }
                    }
                });
                            
        container.add(details);
        panel_folderview_result.add(container);
        panel_folderview_result.setPreferredSize(new Dimension(scrollpane_folderview_reult.getWidth()-20,panel_folderview_result.getComponentCount()*100));
    }
    
    // ------------------------------------------------------------------
    
    public void Trash() {
        
        panel_folderview_trash.removeAll();
        try {
            ps = con.prepareStatement("SELECT * FROM tbl_trash WHERE User_ID = ? ORDER BY DateCreated DESC");
            ps.setString(1, label_user.getName());
            rs = ps.executeQuery();
            while (rs.next()) {
                File file = new File(rs.getString("File_path"));
                if (file.isDirectory()){
                    TrashFolder(file);
                }
            }
            ps = con.prepareStatement("SELECT * FROM tbl_trash WHERE User_ID = ? ORDER BY DateCreated DESC");
            ps.setString(1, label_user.getName());
            rs = ps.executeQuery();
            while (rs.next()) {
                File file = new File(rs.getString("File_path"));
                if (file.isDirectory()==false){
                    TrashFile(file);
                }
            }
        } catch (Exception e) {
        } finally {
            if (rs != null) {
                try { rs.close(); } catch (SQLException e) {}
            }
            if (ps != null) {
                try { ps.close(); } catch (SQLException e) {}
            }
        }
        revalidate();
        repaint();
    }
    
    public void TrashFolder(File path) {
        try {
            int c_width = scrollpane_folderview_trash.getWidth()-100;
            
            final JPanel container = new JPanel();
            container.setOpaque(false);
            container.setLayout(null);
            container.setPreferredSize(new Dimension(c_width,100));

            final JLabel file_logo = new JLabel();
            file_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sys Img/Folder and File/Folder x80.png")));
            file_logo.setOpaque(false);
            file_logo.setBounds(15, 10, 80, 80);
            container.add(file_logo);

            final JLabel file_displayname = new JLabel(path.getName());
            file_displayname.setFont(new java.awt.Font("Segoe UI", 0, 23));
            file_displayname.setOpaque(false);
            file_displayname.setBounds(105, 10, c_width-120, 40);
            container.add(file_displayname);

            final JLabel file_displayaddress = new JLabel(path.getPath());
            file_displayaddress.setFont(new java.awt.Font("Segoe UI", 0, 20));
            file_displayaddress.setForeground(new Color(120,120,120));
            file_displayaddress.setOpaque(false);
            file_displayaddress.setBounds(105, 50, c_width-120, 40);
            container.add(file_displayaddress);

            JPopupMenu popupmenu_folder = new JPopupMenu();
        
            final JLabel details = new JLabel();
            details.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 155, 52)));
            details.setComponentPopupMenu(popupmenu_folder);
            details.setOpaque(false);
            details.setBounds(5, 5, c_width-10, 90);
                details.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseEntered(java.awt.event.MouseEvent evt) {
                            details.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 155, 52),3));
                            repaint();
                        }
                        public void mouseExited(java.awt.event.MouseEvent evt) {
                            details.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 155, 52)));
                            repaint();
                        }
                    });

            JMenuItem restore_folder = new JMenuItem();
            restore_folder.setBackground(new java.awt.Color(255, 255, 255));
            restore_folder.setFont(new java.awt.Font("Segoe UI", 1, 15));
            restore_folder.setForeground(new java.awt.Color(8, 65, 26));
            restore_folder.setText("Restore Folder");
            restore_folder.setToolTipText("");
            restore_folder.setAccelerator(KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, 0));
            restore_folder.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {

                    try {
                        ps = con.prepareStatement("DELETE FROM tbl_trash WHERE File_path = ? AND User_ID = ?");
                        ps.setString(1, path.getPath());
                        ps.setString(2, label_user.getName());
                        ps.execute();
                    } catch (Exception e) {
                        System.out.println(e);
                    } finally {
                        if (rs != null) {
                            try { rs.close(); } catch (SQLException e) {}
                        }
                        if (ps != null) {
                            try { ps.close(); } catch (SQLException e) {}
                        }
                    }
                    try {
                        ps = con.prepareStatement("INSERT INTO tbl_recent (Recent_Details, File_Path, User_ID) VALUES (?, ?, ?)");
                        ps.setString(1, "You restore the folder \'"+path.getName()+"\'.");
                        ps.setString(2, path.getPath());
                        ps.setString(3, label_user.getName());
                        ps.execute();
                    } catch (Exception e) {
                        System.out.println(e);
                    } finally {
                        if (rs != null) { try { rs.close(); } catch (SQLException e) {} }
                        if (ps != null) { try { ps.close(); } catch (SQLException e) {} }
                    }
                    
                    Trash();

                }
            });
            popupmenu_folder.add(restore_folder);
            
            JMenuItem delete_folder = new JMenuItem();
            delete_folder.setBackground(new java.awt.Color(255, 255, 255));
            delete_folder.setFont(new java.awt.Font("Segoe UI", 1, 15));
            delete_folder.setForeground(new java.awt.Color(8, 65, 26));
            delete_folder.setText("Delete Forever");
            delete_folder.setToolTipText("");
            delete_folder.setAccelerator(KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, 0));
            delete_folder.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {

                    if (JOptionPane.showConfirmDialog(null, "Are you sure you want to permanently delete the folder \'"+path.getName()+"\' and its contents?\n\nThis action can\'t be undone.","Notice.",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION){
                        try {
                            File target = new File(path.getPath());
                            FileUtils.deleteDirectory(target);
                            ps = con.prepareStatement("DELETE FROM tbl_trash WHERE File_path = ? AND User_ID = ?");
                            ps.setString(1, path.getPath());
                            ps.setString(2, label_user.getName());
                            ps.execute();
                        } catch (Exception e) {
                            System.out.println(e);
                        } finally {
                            if (rs != null) {
                                try { rs.close(); } catch (SQLException e) {}
                            }
                            if (ps != null) {
                                try { ps.close(); } catch (SQLException e) {}
                            }
                        }
                        try {
                            ps = con.prepareStatement("INSERT INTO tbl_recent (Recent_Details, File_Path, User_ID) VALUES (?, ?, ?)");
                            ps.setString(1, "You permanently delete the folder \'"+path.getName()+"\'.");
                            ps.setString(2, path.getPath());
                            ps.setString(3, label_user.getName());
                            ps.execute();
                        } catch (Exception e) {
                            System.out.println(e);
                        } finally {
                            if (rs != null) { try { rs.close(); } catch (SQLException e) {} }
                            if (ps != null) { try { ps.close(); } catch (SQLException e) {} }
                        }
                        try {
                            ps = con.prepareStatement("DELETE FROM tbl_lock WHERE File_path = ? AND User_ID = ?");
                            ps.setString(1, path.getPath());
                            ps.setString(2, label_user.getName());
                            ps.execute();
                        } catch (Exception e) {
                            System.out.println(e);
                        } finally {
                            if (rs != null) { try { rs.close(); } catch (SQLException e) {} }
                            if (ps != null) { try { ps.close(); } catch (SQLException e) {} }
                        }
                    }

                    Trash();

                }
            });
            popupmenu_folder.add(delete_folder);
                
            container.add(details);
            panel_folderview_trash.add(container);
            panel_folderview_trash.setPreferredSize(new Dimension(scrollpane_folderview_trash.getWidth()-20,panel_folderview_trash.getComponentCount()*100));
            
        } catch (Exception e) {
        }
    }
    
    public void TrashFile(File path) {
        try {
            int c_width = scrollpane_folderview_trash.getWidth()-100;
            
            final JPanel container = new JPanel();
            container.setOpaque(false);
            container.setLayout(null);
            container.setPreferredSize(new Dimension(c_width,100));

            final JLabel file_logo = new JLabel();
            file_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sys Img/Folder and File/Word x80.png")));
            file_logo.setOpaque(false);
            file_logo.setBounds(15, 10, 80, 80);
            container.add(file_logo);

            final JLabel file_displayname = new JLabel(path.getName());
            file_displayname.setFont(new java.awt.Font("Segoe UI", 0, 23));
            file_displayname.setOpaque(false);
            file_displayname.setBounds(105, 10, c_width-120, 40);
            container.add(file_displayname);

            final JLabel file_displayaddress = new JLabel(path.getPath());
            file_displayaddress.setFont(new java.awt.Font("Segoe UI", 0, 20));
            file_displayaddress.setForeground(new Color(120,120,120));
            file_displayaddress.setOpaque(false);
            file_displayaddress.setBounds(105, 50, c_width-120, 40);
            container.add(file_displayaddress);

            JPopupMenu popupmenu_folder = new JPopupMenu();
        
            final JLabel details = new JLabel();
            details.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 155, 52)));
            details.setComponentPopupMenu(popupmenu_folder);
            details.setOpaque(false);
            details.setBounds(5, 5, c_width-10, 90);
                details.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseEntered(java.awt.event.MouseEvent evt) {
                            details.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 155, 52),3));
                            repaint();
                        }
                        public void mouseExited(java.awt.event.MouseEvent evt) {
                            details.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 155, 52)));
                            repaint();
                        }
                    });

            JMenuItem restore_folder = new JMenuItem();
            restore_folder.setBackground(new java.awt.Color(255, 255, 255));
            restore_folder.setFont(new java.awt.Font("Segoe UI", 1, 15));
            restore_folder.setForeground(new java.awt.Color(8, 65, 26));
            restore_folder.setText("Restore File");
            restore_folder.setToolTipText("");
            restore_folder.setAccelerator(KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, 0));
            restore_folder.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {

                    try {
                        ps = con.prepareStatement("DELETE FROM tbl_trash WHERE File_path = ? AND User_ID = ?");
                        ps.setString(1, path.getPath());
                        ps.setString(2, label_user.getName());
                        ps.execute();
                    } catch (Exception e) {
                        System.out.println(e);
                    } finally {
                        if (rs != null) {
                            try { rs.close(); } catch (SQLException e) {}
                        }
                        if (ps != null) {
                            try { ps.close(); } catch (SQLException e) {}
                        }
                    }
                    try {
                        ps = con.prepareStatement("INSERT INTO tbl_recent (Recent_Details, File_Path, User_ID) VALUES (?, ?, ?)");
                        ps.setString(1, "You restore the file \'"+path.getName()+"\'.");
                        ps.setString(2, path.getPath());
                        ps.setString(3, label_user.getName());
                        ps.execute();
                    } catch (Exception e) {
                        System.out.println(e);
                    } finally {
                        if (rs != null) { try { rs.close(); } catch (SQLException e) {} }
                        if (ps != null) { try { ps.close(); } catch (SQLException e) {} }
                    }
                    
                    Trash();

                }
            });
            popupmenu_folder.add(restore_folder);
            
            JMenuItem delete_folder = new JMenuItem();
            delete_folder.setBackground(new java.awt.Color(255, 255, 255));
            delete_folder.setFont(new java.awt.Font("Segoe UI", 1, 15));
            delete_folder.setForeground(new java.awt.Color(8, 65, 26));
            delete_folder.setText("Delete Forever");
            delete_folder.setToolTipText("");
            delete_folder.setAccelerator(KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, 0));
            delete_folder.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {

                    if (JOptionPane.showConfirmDialog(null, "Are you sure you want to permanently delete the file \'"+path.getName()+"\'?\n\nThis action can\'t be undone.","Notice.",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION){
                        try {
                            File target = new File(path.getPath());
                            FileUtils.deleteQuietly(target);
                            ps = con.prepareStatement("DELETE FROM tbl_trash WHERE File_path = ? AND User_ID = ?");
                            ps.setString(1, path.getPath());
                            ps.setString(2, label_user.getName());
                            ps.execute();
                        } catch (Exception e) {
                            System.out.println(e);
                        } finally {
                            if (rs != null) {
                                try { rs.close(); } catch (SQLException e) {}
                            }
                            if (ps != null) {
                                try { ps.close(); } catch (SQLException e) {}
                            }
                        }
                        try {
                            ps = con.prepareStatement("INSERT INTO tbl_recent (Recent_Details, File_Path, User_ID) VALUES (?, ?, ?)");
                            ps.setString(1, "You permanently delete the file \'"+path.getName()+"\'.");
                            ps.setString(2, path.getPath());
                            ps.setString(3, label_user.getName());
                            ps.execute();
                        } catch (Exception e) {
                            System.out.println(e);
                        } finally {
                            if (rs != null) { try { rs.close(); } catch (SQLException e) {} }
                            if (ps != null) { try { ps.close(); } catch (SQLException e) {} }
                        }
                        try {
                            ps = con.prepareStatement("DELETE FROM tbl_lock WHERE File_path = ? AND User_ID = ?");
                            ps.setString(1, path.getPath());
                            ps.setString(2, label_user.getName());
                            ps.execute();
                        } catch (Exception e) {
                            System.out.println(e);
                        } finally {
                            if (rs != null) { try { rs.close(); } catch (SQLException e) {} }
                            if (ps != null) { try { ps.close(); } catch (SQLException e) {} }
                        }
                    }

                    Trash();

                }
            });
            popupmenu_folder.add(delete_folder);
                
            container.add(details);
            panel_folderview_trash.add(container);
            panel_folderview_trash.setPreferredSize(new Dimension(scrollpane_folderview_trash.getWidth()-20,panel_folderview_trash.getComponentCount()*100));
            
        } catch (Exception e) {
        }
    }
    
    // ------------------------------------------------------------------
    
    private void ResizeMyFiles() {
        try {
            int column = (scrollpane_folderview.getWidth() - 20) / 200;
            int row = panel_folderview.getComponentCount() / column;
            panel_folderview.setPreferredSize(new Dimension(scrollpane_folderview.getWidth() - 20, row * 250));
            if (panel_folderview.getComponentCount() % column > 0) {
                panel_folderview.setPreferredSize(new Dimension(scrollpane_folderview.getWidth() - 20, (row * 250) + 250));
            }
        } catch (Exception e) {
        }
        
        try {
            int column1 = (scrollpane_folderview_otheruser.getWidth()-20)/200;
            int row1 = panel_folderview_otheruser.getComponentCount() / column1;
            panel_folderview_otheruser.setPreferredSize(new Dimension(scrollpane_folderview_otheruser.getWidth()-20,row1*250));
            if (panel_folderview_otheruser.getComponentCount() % column1 > 0) {
                panel_folderview_otheruser.setPreferredSize(new Dimension(scrollpane_folderview_otheruser.getWidth()-20,(row1*250)+250));
            }
        } catch (Exception e) {
        }
    }

    class DirectoryRestrictedFileSystemView extends FileSystemView{
        private final File[] rootDirectories;
        DirectoryRestrictedFileSystemView(File rootDirectory){
            this.rootDirectories = new File[] {rootDirectory};
        }

        DirectoryRestrictedFileSystemView(File[] rootDirectories){
            this.rootDirectories = rootDirectories;
        }

        @Override
        public File createNewFolder(File containingDir) throws IOException{       
            JOptionPane.showMessageDialog(null, "Ooops...\n\nCan\'t do that yet, my apologies.", "", JOptionPane.PLAIN_MESSAGE);
            return null;
            //throw new UnsupportedOperationException("Unable to create directory");
        }

        @Override
        public File[] getRoots(){
            return rootDirectories;
        }

        @Override
        public boolean isRoot(File file){
            for (File root : rootDirectories) {
                if (root.equals(file)) {
                    return true;
                }
            }
            return false;
        }
    }
    
    private static boolean isValidName(String text){
        Pattern pattern = Pattern.compile(
            "# Match a valid Windows filename (unspecified file system).          \n" +
            "^                                # Anchor to start of string.        \n" +
            "(?!                              # Assert filename is not: CON, PRN, \n" +
            "  (?:                            # AUX, NUL, COM1, COM2, COM3, COM4, \n" +
            "    CON|PRN|AUX|NUL|             # COM5, COM6, COM7, COM8, COM9,     \n" +
            "    COM[1-9]|LPT[1-9]            # LPT1, LPT2, LPT3, LPT4, LPT5,     \n" +
            "  )                              # LPT6, LPT7, LPT8, and LPT9...     \n" +
            "  (?:\\.[^.]*)?                  # followed by optional extension    \n" +
            "  $                              # and end of string                 \n" +
            ")                                # End negative lookahead assertion. \n" +
            "[^<>:\"/\\\\|?*\\x00-\\x1F]*     # Zero or more valid filename chars.\n" +
            "[^<>:\"/\\\\|?*\\x00-\\x1F\\ .]  # Last char is not a space or dot.  \n" +
            "$                                # Anchor to end of string.            ", 
            Pattern.CASE_INSENSITIVE | Pattern.UNICODE_CASE | Pattern.COMMENTS);
        Matcher matcher = pattern.matcher(text);
        boolean isMatch = matcher.matches();
        return isMatch;
    }
}

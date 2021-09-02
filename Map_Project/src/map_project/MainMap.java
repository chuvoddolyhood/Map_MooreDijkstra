/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package map_project;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author Tran Nhan Nghia
 */
public class MainMap extends javax.swing.JFrame {

    /**
     * Creates new form MainMap
     */
    public MainMap() {
        initComponents();
        
        //set full screen
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        //Set icon image in frame
        setIconImage();
        
        //Xu ly hinh anh
        jLabel2.setIcon(new ImageIcon(new ImageIcon("F:\\Programming\\App\\Map_MooreDijkstra\\photo\\map1.png").getImage()
                .getScaledInstance(1600, 900, Image.SCALE_DEFAULT)));
        jLabel2.setText("");
        
        
        //Load thong tin diem noi bat
        uploadInfoVertexFromDTB();
        
        //Lay thong tin so dinh, so cung
//        getNumberOfVertextAndEdge();
        
        
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
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        cmbStart = new javax.swing.JComboBox<>();
        cmbEnd = new javax.swing.JComboBox<>();
        btnRun = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        lblDistance = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtIntructionPath = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        lblWalking = new javax.swing.JLabel();
        lblBicycle = new javax.swing.JLabel();
        lblMotobike = new javax.swing.JLabel();
        lblCar = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Map");
        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(1920, 1080));

        jPanel1.setBackground(new java.awt.Color(253, 239, 239));

        jLabel2.setText("jLabel2");

        jPanel2.setBackground(new java.awt.Color(245, 232, 199));

        cmbStart.setBackground(new java.awt.Color(111, 76, 91));
        cmbStart.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cmbStart.setForeground(new java.awt.Color(255, 255, 255));
        cmbStart.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbStartActionPerformed(evt);
            }
        });

        cmbEnd.setBackground(new java.awt.Color(111, 76, 91));
        cmbEnd.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cmbEnd.setForeground(new java.awt.Color(255, 255, 255));
        cmbEnd.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbEnd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbEndActionPerformed(evt);
            }
        });

        btnRun.setBackground(new java.awt.Color(111, 76, 91));
        btnRun.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnRun.setForeground(new java.awt.Color(255, 255, 255));
        btnRun.setText("Run");
        btnRun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRunActionPerformed(evt);
            }
        });

        btnClear.setBackground(new java.awt.Color(111, 76, 91));
        btnClear.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnClear.setForeground(new java.awt.Color(255, 255, 255));
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        lblDistance.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblDistance.setForeground(new java.awt.Color(0, 0, 0));
        lblDistance.setText("jLabel1");

        txtIntructionPath.setColumns(20);
        txtIntructionPath.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtIntructionPath.setRows(5);
        jScrollPane1.setViewportView(txtIntructionPath);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Khoảng cách:");

        jPanel4.setBackground(new java.awt.Color(222, 186, 157));

        lblWalking.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photo/icons8_walking_40px_2.png"))); // NOI18N
        lblWalking.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblWalking.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblWalkingMouseClicked(evt);
            }
        });

        lblBicycle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photo/icons8_bicycle_40px_4.png"))); // NOI18N
        lblBicycle.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblBicycle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBicycleMouseClicked(evt);
            }
        });

        lblMotobike.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photo/icons8_motorcycle_40px_2.png"))); // NOI18N
        lblMotobike.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblMotobike.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMotobikeMouseClicked(evt);
            }
        });

        lblCar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photo/icons8_car_40px_6.png"))); // NOI18N
        lblCar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lblWalking)
                .addGap(18, 18, 18)
                .addComponent(lblBicycle)
                .addGap(18, 18, 18)
                .addComponent(lblMotobike)
                .addGap(18, 18, 18)
                .addComponent(lblCar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblMotobike, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                    .addComponent(lblBicycle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblCar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblWalking))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDistance)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(cmbEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cmbStart, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(btnRun)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnClear)))
                    .addComponent(jLabel1))
                .addContainerGap(35, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(cmbStart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(cmbEnd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClear)
                    .addComponent(btnRun))
                .addGap(62, 62, 62)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblDistance)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(190, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(245, 232, 199));

        jLabel3.setFont(new java.awt.Font("Onyx", 0, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(92, 61, 46));
        jLabel3.setText("chuhood.map");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(733, 733, 733)
                .addComponent(jLabel3)
                .addContainerGap(834, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //set icon img
    private void setIconImage(){
//        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("F:\\Programming\\App\\Map_MooreDijkstra\\photo\\icons8_marker_40px_2.png")));
    }
    
    //Chay thuat toan Dijkstra
    private void btnRunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRunActionPerformed
        Moorse_Dijkstra md = new Moorse_Dijkstra();
        md.getStartVertex_EndVertex(idVertexStart, idVertexEnd);
        distance = md.run();
        setDistanceInLabel();
        
//        drawPath();

        System.out.print(j);
        
        int i;
        for(i=0;i<j-2;i=i+2){
            int j=i;
            Graphics2D g = (Graphics2D) jLabel2.getGraphics();
            g.setStroke(new BasicStroke(5f));
            g.setColor(Color.BLUE);
            g.drawLine(coordinates_vertex_path[j], coordinates_vertex_path[j+1], 
                    coordinates_vertex_path[j+2], coordinates_vertex_path[j+3]);
        }
        
        directPath();
    }//GEN-LAST:event_btnRunActionPerformed
    
    

    int idVertexStart, idVertexEnd; //id 2 diem
    int coordinateX_vertexStart, coordinateY_vertexStart; //Toa do diem bat dau
    int coordinateX_vertexEnd, coordinateY_vertexEnd; //Toa do diem ket thuc
    float distance; //Duong di ngan nhat 2 diem
    
    private void cmbStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbStartActionPerformed
        Controller_Map map = new Controller_Map();
        map.getInfoVertexStartFromComboBox(cmbStart.getItemAt(cmbStart.getSelectedIndex()));
        String coordinateXY_vertexStart = map.outputCoordinateVertexStart();
        idVertexStart = Integer.parseInt(coordinateXY_vertexStart.substring(0, coordinateXY_vertexStart.lastIndexOf(":")));
        coordinateX_vertexStart = Integer.parseInt(coordinateXY_vertexStart.substring(coordinateXY_vertexStart.lastIndexOf(":")+1, coordinateXY_vertexStart.lastIndexOf(" ")));
        coordinateY_vertexStart = Integer.parseInt(coordinateXY_vertexStart.substring(coordinateXY_vertexStart.lastIndexOf(" ")+1));
        
        Graphics2D g = (Graphics2D) jLabel2.getGraphics();
        g.setColor(Color.red);
        g.setStroke(new BasicStroke(10f));
        g.drawOval(coordinateX_vertexStart, coordinateY_vertexStart, 10, 10);
    }//GEN-LAST:event_cmbStartActionPerformed
    
    private void cmbEndActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbEndActionPerformed
        Controller_Map map = new Controller_Map();
        map.getInfoVertexEndFromComboBox(cmbEnd.getItemAt(cmbEnd.getSelectedIndex()));
        String coordinateXY_vertexEnd = map.outputCoordinateVertexEnd();
        idVertexEnd = Integer.parseInt(coordinateXY_vertexEnd.substring(0, coordinateXY_vertexEnd.lastIndexOf(":")));
        coordinateX_vertexEnd = Integer.parseInt(coordinateXY_vertexEnd.substring(coordinateXY_vertexEnd.lastIndexOf(":")+1, coordinateXY_vertexEnd.lastIndexOf(" ")));
        coordinateY_vertexEnd = Integer.parseInt(coordinateXY_vertexEnd.substring(coordinateXY_vertexEnd.lastIndexOf(" ")+1));
        
        Graphics2D g = (Graphics2D) jLabel2.getGraphics();
        g.setColor(Color.red);
        g.setStroke(new BasicStroke(10f));
        g.drawOval(coordinateX_vertexEnd, coordinateY_vertexEnd, 10, 10);
//        g.fillOval(coordinateX_vertexEnd, coordinateY_vertexEnd, 25, 25);

//        g.drawLine(coordinateX_vertexStart, coordinateY_vertexStart, coordinateX_vertexEnd, coordinateY_vertexEnd);
        
    }//GEN-LAST:event_cmbEndActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        jLabel2.setIcon(new ImageIcon(new ImageIcon("").getImage().getScaledInstance(1600, 900, Image.SCALE_DEFAULT)));
        jLabel2.setIcon(new ImageIcon(new ImageIcon("F:\\Programming\\App\\Map_MooreDijkstra\\photo\\map1.png").getImage()
                .getScaledInstance(1600, 900, Image.SCALE_DEFAULT)));
        jLabel2.setText("");
        cmbStart.setSelectedIndex(1);
        cmbEnd.setSelectedIndex(1);
    }//GEN-LAST:event_btnClearActionPerformed

    private void lblWalkingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblWalkingMouseClicked
        lblWalking.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photo/icons8_walking_40px_choose.png")));
        lblBicycle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photo/icons8_bicycle_40px_unchoose.png")));
        lblMotobike.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photo/icons8_motorcycle_40px_unchoose.png")));
        lblCar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photo/icons8_car_40px_unchoose.png")));
    }//GEN-LAST:event_lblWalkingMouseClicked

    private void lblBicycleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBicycleMouseClicked
        lblWalking.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photo/icons8_walking_40px_unchoose.png")));
        lblBicycle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photo/icons8_bicycle_40px_choose.png")));
        lblMotobike.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photo/icons8_motorcycle_40px_unchoose.png")));
        lblCar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photo/icons8_car_40px_unchoose.png")));
    }//GEN-LAST:event_lblBicycleMouseClicked

    private void lblMotobikeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMotobikeMouseClicked
        lblWalking.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photo/icons8_walking_40px_unchoose.png")));
        lblBicycle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photo/icons8_bicycle_40px_unchoose.png")));
        lblMotobike.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photo/icons8_motorcycle_40px_choose.png")));
        lblCar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photo/icons8_car_40px_unchoose.png")));
    }//GEN-LAST:event_lblMotobikeMouseClicked

    private void lblCarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCarMouseClicked
        lblWalking.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photo/icons8_walking_40px_unchoose.png")));
        lblBicycle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photo/icons8_bicycle_40px_unchoose.png")));
        lblMotobike.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photo/icons8_motorcycle_40px_unchoose.png")));
        lblCar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photo/icons8_car_40px_choose.png")));
    }//GEN-LAST:event_lblCarMouseClicked

    
    private void uploadInfoVertexFromDTB(){
        try{
            String queryFindPass="SELECT name_vertex FROM Vertex WHERE type_vertex=1;";
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String dbURL="jdbc:sqlserver://MSI\\SQLEXPRESS:1433; databaseName=Map; user=test; password=1234567890"; 
            Connection con=DriverManager.getConnection(dbURL);
            PreparedStatement ps=con.prepareStatement(queryFindPass);
            ResultSet rs=ps.executeQuery();
            Vector<String> data = new Vector<String>();
            while(rs.next()){
                data.addElement(rs.getString("name_vertex"));
                cmbStart.setModel(new DefaultComboBoxModel(data));
                cmbEnd.setModel(new DefaultComboBoxModel(data));
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
    
  
    void setDistanceInLabel(){
        lblDistance.setText(String.valueOf(distance)+" m");
    }
    
    
    static int []path_vertex = new int[200]; //Duong di qua cac nut
    static int number_vertex_path; //So nut tren duong di path
    //Lay duong di
    public void getPath(int []path, int number_vertex_path){
        this.number_vertex_path= number_vertex_path;
        int i;
        for(i=0;i<number_vertex_path;i++){
            path_vertex[i]=path[i];
        }
        
//        for(i=number_vertex_path-1;i>=0;i--){
//            System.out.print(path_vertex[i]+"    ");
//        }
        getCoordinateOfPath();
    }
    
    static int []coordinates_vertex_path = new int[200];
    static int j=0; //Luu so luong toa do (x,y) cua cac dinh
    public void getCoordinateOfPath(){
        int i;
        for(i=number_vertex_path-1;i>=0;i--){
            System.out.print(path_vertex[i]+"    ");
            
            
            Controller_Map map = new Controller_Map();
            map.getIDVertex_Path(path_vertex[i]);
            String coordinateXY_Path = map.getCoordinateVertex_Path();
//            System.out.println(coordinateXY_Path);
            
            int coordinateX_vertex_Path = Integer.parseInt(coordinateXY_Path.substring(0, coordinateXY_Path.lastIndexOf(" ")));
            int coordinateY_vertex_Path = Integer.parseInt(coordinateXY_Path.substring(coordinateXY_Path.lastIndexOf(" ")+1));
            System.out.println(coordinateX_vertex_Path+"<>"+coordinateY_vertex_Path);
            

            coordinates_vertex_path[j++] = coordinateX_vertex_Path;
            coordinates_vertex_path[j++] = coordinateY_vertex_Path;
        }
        
        drawPath();
        
    }
    
    void drawPath(){
        int i;
        for(i=0; i<j; i++){
            System.out.print(coordinates_vertex_path[i]+"     ");
        }
        
//        Graphics2D g = (Graphics2D) jLabel2.getGraphics();
//            g.setStroke(new BasicStroke(5f));
//            g.setColor(Color.BLUE);
//        g.drawLine(1480, 650, 
//                    1445, 619);
        
        
    }
    
    //In thong tin chi duong
    void directPath(){
        int i; // bien ho tro loop
        int start = 0; //Diem bat dau
        int end = 0; //diem ket thuc
        String title_startVertex = null; //Ten diem bat dau
        String title_endVertex = null; //Ten diem ket thuc
        String title_edge = null; //Ten duong
        int distance_edge = 0; //do dai edge
        int two_way_edge = 0; //duong 2 chieu
        String title_two_way; //Loai duong 1 chieu hay 2 chieu

        for(i=number_vertex_path-1;i>0;i--){
            int j = i;
            start = path_vertex[j];
            end = path_vertex[j-1];
//            System.out.print("("+start+","+end+")");

            try{
                String dbURL="jdbc:sqlserver://MSI\\SQLEXPRESS:1433; databaseName=Map; user=test; password=1234567890";
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                String queryFindPass="SELECT (SELECT name_vertex FROM Vertex WHERE ID_Vertex = ?) AS startVertex, "
                        + "(SELECT name_vertex FROM Vertex WHERE ID_Vertex = ?) AS endVertex,"
                        + "E.name_edge, E.distance, E.two_way "
                        + "FROM Edge E JOIN Vertex V ON E.ID_Vertex_1=V.ID_Vertex "
                        + "WHERE (ID_Vertex_1 = ? OR ID_Vertex_2 = ?) AND (ID_Vertex_1 = ? OR ID_Vertex_2 = ?)";
                Connection con=DriverManager.getConnection(dbURL);
                PreparedStatement ps=con.prepareStatement(queryFindPass);
                ps.setInt(1, start);
                ps.setInt(2, end);
                ps.setInt(3, start);
                ps.setInt(4, start);
                ps.setInt(5, end);
                ps.setInt(6, end);
                ResultSet rs=ps.executeQuery();

                if(rs.next()){
                    title_startVertex = rs.getString("startVertex");
                    title_endVertex = rs.getString("endVertex");
                    title_edge = rs.getString("name_edge");
                    distance_edge = rs.getInt("distance");
                    two_way_edge = rs.getInt("two_way");
                }
            }catch(Exception ex){
                ex.printStackTrace();
            }

            if(two_way_edge==1)
                title_two_way = "đường hai chiều";
            else title_two_way = "đường một chiều";
        
//            System.out.println("Từ "+title_startVertex+", đến "+title_endVertex+", trên "+title_edge+", khoang "+distance_edge+" km. Đây là "+title_two_way);
            txtIntructionPath.append("Từ "+title_startVertex+", đến "+title_endVertex+", trên "+title_edge+", khoang "+distance_edge+" m. Đây là "+title_two_way+"\n");
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
            java.util.logging.Logger.getLogger(MainMap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMap().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnRun;
    private javax.swing.JComboBox<String> cmbEnd;
    private javax.swing.JComboBox<String> cmbStart;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBicycle;
    private javax.swing.JLabel lblCar;
    private javax.swing.JLabel lblDistance;
    private javax.swing.JLabel lblMotobike;
    private javax.swing.JLabel lblWalking;
    private javax.swing.JTextArea txtIntructionPath;
    // End of variables declaration//GEN-END:variables
}

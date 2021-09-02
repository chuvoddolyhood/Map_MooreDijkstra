/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package map_project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Tran Nhan Nghia
 */
public class Controller_Map {
    int idVertexStart; //id cua dinh bat dau
    int idVertexEnd; //id cua dinh ket thuc
    public String name_vertexStart; //Ten diem bat dau
    public String name_vertexEnd; //Ten diem ket thuc
    int coordinateX_vertexStart, coordinateY_vertexStart; //Toa do diem bat dau
    int coordinateX_vertexEnd, coordinateY_vertexEnd; //Toa do diem ket thuc
    

    void getInfoVertexStartFromComboBox(String title_Start){
        name_vertexStart = title_Start;
    }
    
    void getInfoVertexEndFromComboBox(String title_End){
        name_vertexEnd = title_End;
    }
    
    void getCoordinateVertexStart(){
        try{
            String dbURL="jdbc:sqlserver://MSI\\SQLEXPRESS:1433; databaseName=Map; user=test; password=1234567890";
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String queryFindPass="SELECT ID_vertex, coordinates_x, coordinates_y FROM Vertex WHERE name_vertex = ?";
            Connection con=DriverManager.getConnection(dbURL);
            PreparedStatement ps=con.prepareStatement(queryFindPass);
            ps.setString(1, name_vertexStart);
            ResultSet rs=ps.executeQuery();
            
            if(rs.next()){
                idVertexStart = rs.getInt("ID_vertex");
                coordinateX_vertexStart=rs.getInt("coordinates_x");
                coordinateY_vertexStart=rs.getInt("coordinates_y");
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
    
    public String outputCoordinateVertexStart(){
        getCoordinateVertexStart();
        return idVertexStart+":"+coordinateX_vertexStart +" "+ coordinateY_vertexStart;
    }

    
    void getCoordinateVertexEnd(){
        try{
            String dbURL="jdbc:sqlserver://MSI\\SQLEXPRESS:1433; databaseName=Map; user=test; password=1234567890";
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String queryFindPass="SELECT ID_vertex, coordinates_x, coordinates_y FROM Vertex WHERE name_vertex = ?";
            Connection con=DriverManager.getConnection(dbURL);
            PreparedStatement ps=con.prepareStatement(queryFindPass);
            ps.setString(1, name_vertexEnd);
            ResultSet rs=ps.executeQuery();
            
            if(rs.next()){
                idVertexEnd = rs.getInt("ID_vertex");
                coordinateX_vertexEnd=rs.getInt("coordinates_x");
                coordinateY_vertexEnd=rs.getInt("coordinates_y");
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
    
    public String outputCoordinateVertexEnd(){
        getCoordinateVertexEnd();
        return idVertexEnd+":"+coordinateX_vertexEnd +" "+ coordinateY_vertexEnd;
    }
    
    
    //Nhan du lieu ID_vertex tu MainMap
    int id_vertex;
    void getIDVertex_Path(int index){
        id_vertex = index;
    }
    
    int coordinateX_vertex_Path;
    int coordinateY_vertex_Path;
    //Lay toa do tu cac diem tren path
    String getCoordinateVertex_Path(){
        try{
            String dbURL="jdbc:sqlserver://MSI\\SQLEXPRESS:1433; databaseName=Map; user=test; password=1234567890";
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String queryFindPass="SELECT coordinates_x, coordinates_y FROM Vertex WHERE ID_vertex=?";
            Connection con=DriverManager.getConnection(dbURL);
            PreparedStatement ps=con.prepareStatement(queryFindPass);
            ps.setInt(1, id_vertex);
            ResultSet rs=ps.executeQuery();
            
            if(rs.next()){
                coordinateX_vertex_Path=rs.getInt("coordinates_x");
                coordinateY_vertex_Path=rs.getInt("coordinates_y");
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return coordinateX_vertex_Path+" "+coordinateY_vertex_Path;
    }
    
    
    //Nhan du lieu Vehicle
    String vehicle;
    void getVehicle(String vehicle){
        this.vehicle = vehicle;
    }
    
    int speedVehicle(){
        int speed=0;
        try{
            String dbURL="jdbc:sqlserver://MSI\\SQLEXPRESS:1433; databaseName=Map; user=test; password=1234567890";
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String queryFindPass="SELECT speed FROM Vehicle WHERE title_vehicle=?;";
            Connection con=DriverManager.getConnection(dbURL);
            PreparedStatement ps=con.prepareStatement(queryFindPass);
            ps.setString(1, vehicle);

            ResultSet rs=ps.executeQuery();

            if(rs.next()){
                    speed = rs.getInt("speed");
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
        
        return speed;
    }
    
}

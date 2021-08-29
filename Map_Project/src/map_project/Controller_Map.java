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
            String queryFindPass="SELECT coordinates_x, coordinates_y FROM Vertex WHERE name_vertex = ?";
            Connection con=DriverManager.getConnection(dbURL);
            PreparedStatement ps=con.prepareStatement(queryFindPass);
            ps.setString(1, name_vertexStart);
            ResultSet rs=ps.executeQuery();
            
            if(rs.next()){
                coordinateX_vertexStart=rs.getInt("coordinates_x");
                coordinateY_vertexStart=rs.getInt("coordinates_y");
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
    
    public String outputCoordinateVertexStart(){
        getCoordinateVertexStart();
        return coordinateX_vertexStart +" "+ coordinateY_vertexStart;
    }

    
    void getCoordinateVertexEnd(){
        try{
            String dbURL="jdbc:sqlserver://MSI\\SQLEXPRESS:1433; databaseName=Map; user=test; password=1234567890";
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String queryFindPass="SELECT coordinates_x, coordinates_y FROM Vertex WHERE name_vertex = ?";
            Connection con=DriverManager.getConnection(dbURL);
            PreparedStatement ps=con.prepareStatement(queryFindPass);
            ps.setString(1, name_vertexEnd);
            ResultSet rs=ps.executeQuery();
            
            if(rs.next()){
                coordinateX_vertexEnd=rs.getInt("coordinates_x");
                coordinateY_vertexEnd=rs.getInt("coordinates_y");
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
    
    public String outputCoordinateVertexEnd(){
        getCoordinateVertexEnd();
        return coordinateX_vertexEnd +" "+ coordinateY_vertexEnd;
    }
    
    
}

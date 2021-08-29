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
public class Moorse_Dijkstra {
    private static final int MAX = 100;
    private static final float INFINITY = 999999f;
    static int number_edge = 0; //so cung 
    static int number_vertex = 0; //so dinh
    static float [][] matrix = new float [MAX][MAX]; //ma tran
    int startVertex = 8;
    int endVertex = 12;
    
    //Doc du lieu Vertex
    public void getNumberOfVertex(){
        try{
            String queryFindPass="SELECT COUNT(*) AS so_dinh FROM Vertex;";
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String dbURL="jdbc:sqlserver://MSI\\SQLEXPRESS:1433; databaseName=Map; user=test; password=1234567890"; 
            Connection con=DriverManager.getConnection(dbURL);
            PreparedStatement ps=con.prepareStatement(queryFindPass);
            ResultSet rs=ps.executeQuery();
            
            if(rs.next()){
                number_vertex=rs.getInt("so_dinh");
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }

        System.out.println("so dinh= "+number_vertex);
    }
    
     //Doc du lieu Edge
    public void getNumberOfEdge(){
        try{
            String queryFindPass="SELECT COUNT(*) AS so_cung FROM Edge;";
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String dbURL="jdbc:sqlserver://MSI\\SQLEXPRESS:1433; databaseName=Map; user=test; password=1234567890"; 
            Connection con=DriverManager.getConnection(dbURL);
            PreparedStatement ps=con.prepareStatement(queryFindPass);
            ResultSet rs=ps.executeQuery();
            
            if(rs.next()){
                number_edge=rs.getInt("so_cung");
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }

        System.out.println("so cung= "+number_edge);
    }
    
    public void getInfoFromFile(){
        int vertex_1 = 0; //Nut 1
        int vertex_2 = 0; //Nut 2
        float distance = 0f; //Khoang cach
        int two_way; //kiem tra duong 2 chieu
        
        try{
            String queryFindPass="SELECT ID_vertex_1, ID_Vertex_2, distance, two_way FROM Edge;";
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String dbURL="jdbc:sqlserver://MSI\\SQLEXPRESS:1433; databaseName=Map; user=test; password=1234567890"; 
            Connection con=DriverManager.getConnection(dbURL);
            PreparedStatement ps=con.prepareStatement(queryFindPass);
            ResultSet rs=ps.executeQuery();
            
            while(rs.next()){
                vertex_1 = rs.getInt("ID_vertex_1");
                vertex_2 = rs.getInt("ID_vertex_2");
                distance = rs.getFloat("distance");
                two_way = rs.getInt("two_way");
                if(two_way == 1){
                    matrix[vertex_1][vertex_2] = distance;
                    matrix[vertex_2][vertex_1] = distance;
                } else {
                    matrix[vertex_1][vertex_2] = distance;
                }
                
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
    
    //Tao matrix
    public void createMatrix(){
        int i, j;
	for(i=1;i<=number_vertex;i++){
            for(j=1;j<=number_vertex;j++){
                matrix[i][j]=0;
            }
	}
    }
    
    //Thuat toan Dijkstra 
    static int []mark = new int[MAX]; //danh dau dinh da xet - (1-da xet) (0-chua xet)
    static int []p = new int[MAX]; //tim dinh phia truoc dinh dang xet
    static float []pi = new float[MAX]; //tinh tong duong di giua 2 dinh

    void Dijkstra(int s){ //start vertex
	int i, j, it;
	for(i=1;i<=number_vertex;i++){
		mark[i]=0; //khoi tao mark
		pi[i]=INFINITY; //khoi tao pi[u]
	}
	
	//Xet diem can xet dau tien
	pi[s]=0;
	p[s]=-1;
	
	for(it=1;it<=number_vertex;it++){
		//Tim dinh i co mark[i]==0 va pi[i] nho nhat
		float min_pi=INFINITY;
		for(j=1;j<=number_vertex;j++){
			if(mark[j]==0 && pi[j]<min_pi){
				min_pi= pi[j];
				i=j;
			}
		}
		
		mark[i]=1; //da xet xong!!!
		System.out.println(p[i]+"     "+ i);
		
		for(j=1;j<=number_vertex;j++){
			if(matrix[i][j]!=0&&mark[j]==0){
				if(pi[i]+matrix[i][j]<pi[j]){
					pi[j]=pi[i]+matrix[i][j];
					p[j]=i;
				}
			}
		}
	}
    }
    
    void getStartVertex_EndVertex(int start, int end){
        startVertex = start;
        endVertex = end;
    }
    
    public void getDistance(){
        MainMap map = new MainMap();
    }
    
    //Duong di tu start -> end
    public int []path=new int[MAX]; //luu cac dinh tren duong di
    public void path(){
	int k=0; //so dinh cua duong di
	int current = endVertex;
	
	while(current != -1){
		path[k] = current;
		k++;
		current = p[current];
	}
	
	int r;
	for(r= k-1 ; r>=0 ; r--){
		System.out.print(path[r]+"     ");
	}
    }
    
    public float run(){
        getNumberOfVertex();
        getNumberOfEdge();
        createMatrix();
        getInfoFromFile();
        
        //In bang
	int a, b; //Bien ho tro tao bang
	for(a=1; a<=number_vertex; a++){
            for(b=1;b<=number_vertex;b++){
		System.out.print(matrix[a][b]+"           ");
            }
            System.out.print("\n");
	}
        
        
        
        Dijkstra(startVertex);
        getDistance();
//        System.out.println(pi[endVertex]+"   ");
        
        //Duong di
	path();
        


        return pi[endVertex];
    }
    
//    public void route(){
//        MainMap map = new MainMap();
//        map.getPath(path);
//    }
}

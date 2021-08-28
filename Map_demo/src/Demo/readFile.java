/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Demo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 *
 * @author Tran Nhan Nghia
 */
public class readFile {
//    private final static String FILE_URL = "F:\\Programming\\App\\Map_MooreDijkstra\\map1_demo.txt";
 
//    public static void main(String[] args) throws IOException {
//        File file = new File(FILE_URL);
//        InputStream inputStream = new FileInputStream(file);
//        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
//        BufferedReader reader = new BufferedReader(inputStreamReader);
// 
//        String line = "";
//        while((line = reader.readLine()) != null){
//            System.out.println(line);
//        }
//    }
    
    
    public static void main(String[] args) {
        //Doc tung ky tu
        
//        try (BufferedReader bufferedReader =
//                     new BufferedReader(new FileReader("F:\\Programming\\App\\Map_MooreDijkstra\\map1_demo.txt"))) {
//            int data = bufferedReader.read();
//            
//            while (data != -1) {
//                System.out.print((char) data);
//                data = bufferedReader.read();
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        
        
        //Doc tung dong
        try (BufferedReader bufferedReader =
                     new BufferedReader(new FileReader("F:\\Programming\\App\\Map_MooreDijkstra\\map1_demo.txt"))) {
            String line = bufferedReader.readLine();
            while (line != null) {
                System.out.println(line);
                line = bufferedReader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    
}

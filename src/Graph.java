
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.*;
import org.jgrapht.demo.HelloJGraphT;
public class Graph {

	 private static final Integer ONE = 1;

	    public static void main(String[] args) {
	        Map<String, Integer> map = new HashMap<String, Integer>();

	        /* ��ȡ���� */
	        try {
	            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(new File("C:\\Users\\lenovo\\Desktop\\PPAP.txt")),
	                                                                         "UTF-8"));
	            String lineTxt = null;
	            while ((lineTxt = br.readLine()) != null) {
	                String[] names = lineTxt.split(",");
	                for (String name : names) {
	                    if (map.keySet().contains(name)) {
	                        map.put(name, (map.get(name) + ONE));
	                    } else {
	                        map.put(name, ONE);
	                    }
	                }
	            }
	            br.close();
	        } catch (Exception e) {
	            System.err.println("read errors :" + e);
	        }

	        /* ������� */
	        try {
	            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(new File("D:/���.txt")),
	                                                                          "UTF-8"));

	            for (String name : map.keySet()) {
	                bw.write(name + " " + map.get(name));
	                bw.newLine();
	            }
	            bw.close();
	        } catch (Exception e) {
	            System.err.println("write errors :" + e);
	        }
	    }
	
	}



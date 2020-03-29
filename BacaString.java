import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader; 
 //import javax.swing.*;
 
public class BacaString { 
 /* menunjukkan kelas yang dipakai adalah umum*/
 public static void main(String[] args) throws IOException  {   
	// TODO Auto-generated method stub  
	/* Kamus */   
	String str;          
	BufferedReader datAIn = new BufferedReader(new InputStreamReader(System.in));   
	/* Program */ 
 
  System.out.print ("\nBaca string dan Integer: \n");       
  //perintah untuk membaca tipe data string dan integer
  System.out.print("masukkan sebuah string: ");       
  //perintah memasukkan tipe data string
  str= datAIn.readLine();      
  
  System.out.print ("String yang dibaca : "+ str);       
  //mengisi tipe data yang dibaca +str
  } 
 
} 
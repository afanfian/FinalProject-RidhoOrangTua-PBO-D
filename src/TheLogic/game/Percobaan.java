package TheLogic.game;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Percobaan {

	public static void main(String[] args) {
		//Membuat Statement Try-Catch untuk mengatasi error jika file tidak ditemuan
        try{
            
            //Inisialisasi Objek dan Mendefinisikan Path Lokasi File Yang akan Dibaca
//            File file = new File("E:\\WildanTechnoArt\\BiodataSaya.txt");
            File file = new File("D:\\Catatan React.txt");
            //Inisialisasi Objek Scanner dan memasang objek file yang akan dibaca
            Scanner scan = new Scanner(file);
            
            //Menggunakan perulangan untuk membaca semua data didalam objek Scanner
            while(scan.hasNextLine()){
                String getDataString = scan.nextLine();
                System.out.println(getDataString);
            }
            
            scan.close();
        }catch(FileNotFoundException ex){
            System.out.println("File Tidak Ditemukan"); 
        }
	}

}

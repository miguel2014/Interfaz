package Ejercicios;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class saveArchivo {
	private File outFile;
	public saveArchivo( File outFile) {
		this.outFile = outFile;
	}

	public  String guardar(){
		//File outFile = new File("/home/matinal/out_back.txt");
		try(PrintWriter out = new PrintWriter(new FileOutputStream(outFile));)
		{
			String lineaLeida="";
			
		}
		catch (IOException ex){
			ex.printStackTrace();
		}
		System.out.println("Terminada lectura/escritura");
		return "";
	}

}

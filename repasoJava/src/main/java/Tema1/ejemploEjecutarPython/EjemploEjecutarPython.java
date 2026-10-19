package Tema1.ejemploEjecutarPython;

import java.io.IOException;

import Tema1.ejemploClaseRunTime.LanzaComandosJava;

public class EjemploEjecutarPython {

		
public static void main(String[] args) {
		ProcessBuilder pb = new ProcessBuilder("python","src\\main\\resources\\ejemplo.py");
		pb.inheritIO();
		try {
			pb.start();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

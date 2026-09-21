package repasoJava.dia1;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class dia1 {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
	float resultado = 0;
		try {
			
			throw new FileNotFoundException("Lanzo excepcion controlada");
		
		}catch (ArithmeticException | FileNotFoundException e) {
			System.out.println("Dentro del catch"); 
		}
		throw new SQLException("Lanzo excepcion SQL");
	
	}

}

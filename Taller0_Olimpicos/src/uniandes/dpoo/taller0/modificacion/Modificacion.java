package uniandes.dpoo.taller0.modificacion;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;
import uniandes.dpoo.taller0.procesamiento.CalculadoraEstadisticas;
import uniandes.dpoo.taller0.procesamiento.LoaderOlimpicos;

public class Modificacion {
	public static void main(String[] args) throws FileNotFoundException, IOException
	{
		System.out.println("Hello World");
		CalculadoraEstadisticas calc = LoaderOlimpicos.cargarArchivo("./data/atletas.csv");
		Map<String, Integer> pai = calc.paisConMasMedallistas();
		for (String nombre : pai.keySet())
		{
			System.out.println("El pais que mas medallas tiene es " + nombre + " con " + pai.get(nombre) + " medallas.");
		}
	
	}
}

package semillero.pruebasUnitarias;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import junit.framework.Assert;

/** 
 * <b> Descripción:</b> Clase que determina 
 * <b> Caso de Uso:</b> ; 
 * @author Carlos Felipe
 * @version 
 * 
 */
public class OperacionesAritmeticasTest {

	/**
	 * Constante que contendra el log de la clase OperacionesAritmeticasTest
	 */
	private  final static  Logger Log = Logger.getLogger(OperacionesAritmeticasTest.class);
	
	@BeforeTest
	public void inicializar() {
		BasicConfigurator.configure(); // Inicializa el logger con una configuracion basica
	}
	
	
	/**
	 * 
	 * Metodo encargado de probar que el metodo funcione al sumar dos numeros de 450 
	 * <b>Caso de Uso:</b> Operaciones aritmeticas
	 * @author Carlos F. Perez C.
	 *
	 */
	//@Test(enabled = true)
	@Test
	public void validarResultadoSumaExitosa() {
		
		Log.info("Inicia la ejecucion de este metodo de validarResultadoSumaExitosa ");
		
		int numero1 = 300;
		int numero2 = 150;
		int resultado = 450;
		
		Assert.assertEquals(resultado, numero1 + numero2);
		
		Log.info("Finaliza la ejecucion de este metodo de validarResultadoSumaExitosa ");
	}
	
	/**
	 * 
	 * Metodo encargado de Validar que el resultado fallo 
	 * <b>Caso de Uso:</b>
	 * @author Carlos F. Perez C.
	 *
	 */
	@Test
	public void validarResultadoPruebaFallida(){
		Log.info("Inicia la ejecucion de este metodo de validarResultadoPruebaFallida ");
		int numero1 = 300;
		int numero2 = 250;
		int resultado = 450;
		
		try {
			if(resultado != (numero1 + numero2)) {
				Log.info("Se ha generado un error funcional");
				throw new Exception("La suma ha fallado en el calculo");
			}
		} catch (Exception e) { 
			Assert.assertEquals(e.getMessage(), "La suma ha fallado en el calculo");
		}
		
		Log.info("Finaliza la ejecucion de este metodo de validarResultadoPruebaFallida ");
		
	}
	
	@AfterTest
	public void finalizarPruebaUnitaria() {
		Log.info("::::::::: FINALIZA TESTS ::::::::::: ");
	}
	
}

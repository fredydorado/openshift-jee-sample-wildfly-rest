package example.microservice;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(name="miServicio")
public class micro {

	@WebMethod()
	public String sayHello(@WebParam(name="nombre") String name) {
	    System.out.println("Hello: " + name);
	    return "Hello " + name + "!";
	}
	
	@WebMethod()
	public int sumar(@WebParam(name="valor1") int a,@WebParam(name="valor2") int b) {
	    System.out.println("sumar: " + (a+b));
	    return (a+b);
	}
	
	@WebMethod()
	public List<Cuenta> verificarEstadosCuenta() {
		List<Cuenta> resultado = new ArrayList<>();

		for (int i = 0; i < 5; i++) {
			resultado.add(new Cuenta("cedula"+i, "referencia"+i, "estado"+i));
		}
		return resultado;

	}
	
	@WebMethod()
	public Cuenta verificarCuenta(@WebParam(name="cedula")String cedula,@WebParam(name="referencia")String referencia) {

		Cuenta cuenta=new Cuenta(null, null, null);
		List<Cuenta> resultado = verificarEstadosCuenta();
		for (Cuenta c:resultado) {
			if(c.getCedula().equals(cedula)&&c.getReferencia().equals(referencia)){
				cuenta=c;
				break;
			}
		}
		return cuenta;
	}
	
	@WebMethod()
	public List<String> listarPlacasRobadas() {
		List<String> resultado = new ArrayList<>();

		for (int i = 0; i < 5; i++) {
			resultado.add("ABC-00" + i);
		}
		return resultado;

	}

	@WebMethod()
	public boolean verificarPlaca(@WebParam(name="placa")String placa) {

		List<String> resultado = new ArrayList<>();

		for (int i = 0; i < 5; i++) {
			resultado.add("ABC-00" + i);
		}
		return resultado.contains(placa);
	}
}

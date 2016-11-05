package example.microservice;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class EstadosCuenta {

	@WebMethod()
	public List<Cuenta> verificarEstadosCuenta() {
		List<Cuenta> resultado = new ArrayList<>();

		for (int i = 0; i < 5; i++) {
			resultado.add(new Cuenta("cedula"+i, "referencia"+i, "estado"+i));
		}
		return resultado;

	}
	
	@WebMethod()
	public Cuenta verificarCuenta(String cedula,String referencia) {

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
}

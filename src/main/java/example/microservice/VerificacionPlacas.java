package example.microservice;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class VerificacionPlacas {

	@WebMethod()
	public List<String> listarPlacasRobadas() {
		List<String> resultado = new ArrayList<>();

		for (int i = 0; i < 5; i++) {
			resultado.add("ABC-00" + i);
		}
		return resultado;

	}

	@WebMethod()
	public boolean verificarPlaca(String placa) {

		List<String> resultado = new ArrayList<>();

		for (int i = 0; i < 5; i++) {
			resultado.add("ABC-00" + i);
		}
		return resultado.contains(placa);
	}
}

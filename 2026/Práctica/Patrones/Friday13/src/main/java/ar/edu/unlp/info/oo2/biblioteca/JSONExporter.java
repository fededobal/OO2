package ar.edu.unlp.info.oo2.biblioteca;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.util.List;

public class JSONExporter implements Exporter {

	private JSONObject exportar(Socio socio) {
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("nombre",socio.getNombre());
		jsonObject.put("email",socio.getEmail());
		jsonObject.put("legajo",socio.getLegajo());
		return jsonObject;
	}

	@Override
	public String exportar(List<Socio> socios) {
		JSONArray jsonArray = new JSONArray();
		for (Socio s : socios) {
			jsonArray.add(exportar(s));
		}
		return jsonArray.toJSONString();
	}
}

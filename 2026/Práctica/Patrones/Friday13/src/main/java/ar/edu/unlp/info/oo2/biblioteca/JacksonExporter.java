package ar.edu.unlp.info.oo2.biblioteca;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import java.util.List;

public class JacksonExporter implements Exporter {

    @Override
    public String exportar(List<Socio> socios) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            mapper.enable(SerializationFeature.INDENT_OUTPUT);
            return mapper.writeValueAsString(socios);
        } catch (Exception e) {
            e.printStackTrace();
            return "[]";
        }
    }
}
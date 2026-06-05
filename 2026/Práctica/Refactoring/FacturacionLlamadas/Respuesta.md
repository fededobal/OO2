# Malos olores

### (1) FEATURE ENVY
### (2) SWITCH STATEMENTS
### (3) DUPLICATED CODE
### (4) COMMENTS
### (5) LONG PARAMETER LIST
### (6) IMPERATIVE LOOP
### (7) PUBLIC FIELD

_Empresa.java_
```java
import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private List<Cliente> clientes = new ArrayList<Cliente>();
    private List<Llamada> llamadas = new ArrayList<Llamada>();
    private GestorNumerosDisponibles guia = new GestorNumerosDisponibles();

    static double descuentoJur = 0.15;
    static double descuentoFis = 0;

    public boolean agregarNumeroTelefono(String str) {
        boolean encontre = guia.getLineas().contains(str); // (1)
        if (!encontre) {
            guia.getLineas().add(str);
            encontre= true;
            return encontre;
        }
        else {
            encontre= false;
            return encontre;
        }
    }

    public String obtenerNumeroLibre() {
        return guia.obtenerNumeroLibre();
    }

    public Cliente registrarUsuario(String data, String nombre, String tipo) {
        Cliente var = new Cliente();
        if (tipo.equals("fisica")) { // (2)
            var.setNombre(nombre); // (3)
            String tel = this.obtenerNumeroLibre();
            var.setTipo(tipo);
            var.setNumeroTelefono(tel);
            var.setDNI(data);
        }
        else if (tipo.equals("juridica")) { // (2)
            String tel = this.obtenerNumeroLibre(); // (3)
            var.setNombre(nombre);
            var.setTipo(tipo);
            var.setNumeroTelefono(tel);
            var.setCuit(data);
        }
        clientes.add(var);
        return var;
    }

    public Llamada registrarLlamada(Cliente origen, Cliente destino, String t, int duracion) { // (5)
        Llamada llamada = new Llamada(t, origen.getNumeroTelefono(), destino.getNumeroTelefono(), duracion);
        llamadas.add(llamada);
        origen.llamadas.add(llamada);
        return llamada;
    }

    public double calcularMontoTotalLlamadas(Cliente cliente) {
        double c = 0;
        for (Llamada l : cliente.llamadas) { // (6)
            double auxc = 0;
            if (l.getTipoDeLlamada() == "nacional") { // (2)
                // (4)
                // el precio es de 3 pesos por segundo más IVA sin adicional por establecer la llamada
                auxc += l.getDuracion() * 3 + (l.getDuracion() * 3 * 0.21);
            } else if (l.getTipoDeLlamada() == "internacional") { // (2)
                // (4)
                // el precio es de 150 pesos por segundo más IVA más 50 pesos por establecer la llamada
                auxc += l.getDuracion() * 150 + (l.getDuracion() * 150 * 0.21) + 50;
            }

            if (cliente.getTipo() == "fisica") { // (2)
                auxc -= auxc*descuentoFis;
            } else if(cliente.getTipo() == "juridica") { // (2)
                auxc -= auxc*descuentoJur;
            }
            c += auxc;
        }
        return c;
    }

    public int cantidadDeUsuarios() {
        return clientes.size();
    }

    public boolean existeUsuario(Cliente persona) {
        return clientes.contains(persona);
    }

    public GestorNumerosDisponibles getGestorNumeros() {
        return this.guia;
    }
}
```

_GestorNumerosDisponibles.java_
```java
import java.util.TreeSet;
import java.util.ArrayList;
import java.util.Random;
import java.util.SortedSet;

public class GestorNumerosDisponibles {
	private SortedSet<String> lineas = new TreeSet<String>();
	private String tipoGenerador = "ultimo";

	public SortedSet<String> getLineas() {
		return lineas;
	}

	public String obtenerNumeroLibre() {
		String linea;
		switch (tipoGenerador) { // (2)
			case "ultimo":
				linea = lineas.last();
				lineas.remove(linea);
				return linea;
			case "primero":
				linea = lineas.first();
				lineas.remove(linea);
				return linea;
			case "random":
				linea = new ArrayList<String>(lineas)
						.get(new Random().nextInt(lineas.size()));
				lineas.remove(linea);
				return linea;
		}
		return null;
	}

	public void cambiarTipoGenerador(String valor) {
		this.tipoGenerador = valor;
	}
}
```

_Llamada.java_
```java
public class Llamada {
	private String tipoDeLlamada;
	private String origen;
	private String destino;
	private int duracion;

	public Llamada(String tipoLlamada, String origen, String destino, int duracion) {
		this.tipoDeLlamada = tipoLlamada;
		this.origen= origen;
		this.destino= destino;
		this.duracion = duracion;
	}

	public String getTipoDeLlamada() {
		return tipoDeLlamada;
	}

	public String getRemitente() {
		return destino;
	}

	public int getDuracion() {
		return this.duracion;
	}

	public String getOrigen() {
		return origen;
	}
}
```

_Cliente.java_
```java
import java.util.ArrayList;
import java.util.List;

public class Cliente {
	public List<Llamada> llamadas = new ArrayList<Llamada>(); // (7)
	private String tipo;
	private String nombre;
	private String numeroTelefono;
	private String cuit;
	private String dni;

	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNumeroTelefono() {
		return numeroTelefono;
	}
	public void setNumeroTelefono(String numeroTelefono) {
		this.numeroTelefono = numeroTelefono;
	}
	public String getCuit() {
		return cuit;
	}
	public void setCuit(String cuit) {
		this.cuit = cuit;
	}
	public String getDNI() {
		return dni;
	}
	public void setDNI(String dni) {
		this.dni = dni;
	}
}
```

# Refactorings

### (1) FEATURE ENVY
1. Extract method de ```guia.getLineas().contains(str);```
2. Move method a la clase ```GestorNumerosDisponibles```
3. Hide delegate de ```GestorNumerosDisponibles::getLineas```

### (2) SWITCH STATEMENTS
Para clientes:
1. Extract method de la sentencia if
2. Move method a la clase Cliente
3. Replace type code with polymorfism (ClienteFisico y ClienteJuridico)

Para llamadas:
1. Extract method de la sentencia if
2. Move method a la clase Llamada
3. Replace type code with subclasses (LlamadaNacional y LlamadaInternacional)

Para GestorNumerosDisponibles:
1. Replace type code with strategy

### (3) DUPLICATED CODE
1. Consolidate Duplicate Conditional Fragments

### (4) COMMENTS
1. Extract method de la formula matematica
2. Rename method a calcularCostoLlamadaNacional()

### (5) LONG PARAMETER LIST
1. Preserve whole object instanciando una llamada directamente por parametro

### (6) IMPERATIVE LOOP
1. Replace loop with pipeline: algo asi como ```cliente.getLlamadas().stream().mapToDouble(l -> l.calcularCosto()).sum();```

### (7) PUBLIC FIELD
1. Encapsulate field
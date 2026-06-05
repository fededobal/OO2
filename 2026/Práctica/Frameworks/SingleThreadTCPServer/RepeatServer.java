import java.io.PrintWriter;

public class RepeatServer extends SingleThreadTCPServer {

    @Override
    public void handleMessage(String message, PrintWriter out) {
        String[] args = message.trim().split("\\s+");

        if (args.length < 2 || args[0].isEmpty()) {
            out.println("ERROR: Faltan argumentos. Uso: <cadena> <cantidad> [delimitador]");
            return;
        }

        String cadena = args[0];
        if (cadena.isEmpty()) {
            out.println("ERROR: El string a repetir no puede ser nulo o vacio.");
            return;
        }

        int cantidad;
        try {
            cantidad = Integer.parseInt(args[1]);
            if (cantidad <= 0) {
                out.println("ERROR: La cantidad debe ser un numero entero mayor a 0.");
                return;
            }
        } catch (NumberFormatException e) {
            out.println("ERROR: La cantidad debe ser un numero entero valido.");
            return;
        }

        String delimitador = " ";
        if (args.length >= 3) {
            delimitador = args[2];
        }

        String resultado = (cadena + delimitador).repeat(cantidad - 1) + cadena;

        out.println("RESULTADO: " + resultado);
    }

    public static void main(String[] args) {
        new RepeatServer().startLoop(args);
    }
}
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class PasswordServer extends SingleThreadTCPServer {
    private Random random = new Random();

    @Override
    public void handleMessage(String message, PrintWriter out) {
        String[] args = message.trim().split("\\s+");

        if (args.length != 3) {
            out.println("ERROR: Formato incorrecto. Envie: <letras> <numeros> <especiales>");
            return;
        }

        String letras = args[0];
        String numeros = args[1];
        String especiales = args[2];

        try {
            String password = generarContraseña(letras, numeros, especiales);
            out.println("PASSWORD: " + password);
        } catch (IllegalArgumentException e) {
            out.println("ERROR: " + e.getMessage());
        }
    }

    private String generarContraseña(String letras, String numeros, String especiales) {
        if (letras.isEmpty() || numeros.isEmpty() || especiales.isEmpty()) {
            throw new IllegalArgumentException("Ningun argumento puede estar vacio.");
        }

        List<Character> pwdList = new ArrayList<>();

        pwdList.add(especiales.charAt(random.nextInt(especiales.length())));

        int cantidadNumeros = 1 + random.nextInt(6);
        for (int i = 0; i < cantidadNumeros; i++) {
            pwdList.add(numeros.charAt(random.nextInt(numeros.length())));
        }

        int cantidadLetras = 8 - 1 - cantidadNumeros;
        for (int i = 0; i < cantidadLetras; i++) {
            pwdList.add(letras.charAt(random.nextInt(letras.length())));
        }

        Collections.shuffle(pwdList, random);

        StringBuilder passwordFinal = new StringBuilder();
        for (char c : pwdList) {
            passwordFinal.append(c);
        }

        return passwordFinal.toString();
    }

    public static void main(String[] args) {
        new PasswordServer().startLoop(args);
    }
}

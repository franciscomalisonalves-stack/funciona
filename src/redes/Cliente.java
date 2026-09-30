package redes;
import java.io.*;
import java.net.*;

public class Cliente {
    public static void main(String[] args) throws IOException {

        Socket socket = new Socket("localhost", 5000);

        BufferedReader entrada = new BufferedReader(
                new InputStreamReader(socket.getInputStream()));

        PrintWriter saida = new PrintWriter(
                socket.getOutputStream(), true);

        saida.println("Olá, servidor!");

        String resposta = entrada.readLine();

        System.out.println("Servidor respondeu: " + resposta);

        socket.close();
    }
}
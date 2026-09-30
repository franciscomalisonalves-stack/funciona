package redes;

import java.io.*;
import java.net.*;

public class Servidor {
    public static void main(String[] args) throws IOException {

        ServerSocket servidor = new ServerSocket(5000);

        System.out.println("Servidor esperando conexão...");

        Socket socket = servidor.accept();

        System.out.println("Cliente conectado!");

        BufferedReader entrada = new BufferedReader(
                new InputStreamReader(socket.getInputStream()));

        PrintWriter saida = new PrintWriter(
                socket.getOutputStream(), true);

        String mensagem = entrada.readLine();

        System.out.println("Cliente disse: " + mensagem);

        saida.println("Olá, cliente!");

        socket.close();
        servidor.close();
    }
}
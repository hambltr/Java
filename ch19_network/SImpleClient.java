package ch19_network;
import java.io.*;
import java.net.*;

public class SimpleClient {
    public static void main(String[] args) {
        Socket sock = null;
        DataInputStream in = null;
        DataOutputStream out = null;

        String msg = "클라이언트 ip 192.168.0.132 ㅎㅇ";
        
        if (args.length != 1) {
            System.out.println("Usage: java SimpleClient <server_ip>");
            return;
        }

        try {
            sock = new Socket(args[0], 5555); // 서버 IP, 서버 포트

            in = new DataInputStream(sock.getInputStream());
            System.out.println(in.readUTF());

            out = new DataOutputStream(sock.getOutputStream());
            out.writeUTF(msg);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (in != null) in.close();
                if (out != null) out.close();
                if (sock != null) sock.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
package socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class SocketClient {
    PrintWriter write = null;
    BufferedReader in = null;
    void socketclient() throws IOException {
        try {
            String str = "192.168.1.1";
            Socket socket = new Socket(str, 8080);
//            BufferedReader br = new BufferedReader();
            write = new PrintWriter(socket.getOutputStream());
            in = new BufferedReader(new InputStreamReader(socket.getInputStream(),"UTF-8"));
        }catch (Exception e){
            System.out.println("can not listen to:" + e);
        }

    }
    public void send (String str) {
        write.println(str);
        write.flush();

    }
    public String receive() throws IOException {
        try {
            return in.readLine();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }

    }

}



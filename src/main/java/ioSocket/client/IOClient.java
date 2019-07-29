package ioSocket.client;

import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class IOClient {

    public static void main(String[] args) {
        new Thread(()->{
            try {
                Socket socket = new Socket("127.0.0.1", 8000);
                while (true){
                    try {
                        socket.getOutputStream().write((new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date())+": hello world").getBytes());
                        TimeUnit.SECONDS.sleep(2);
                    }catch (Exception e){

                    }
                }
            }catch (Exception e){}
        }).start();
    }
}

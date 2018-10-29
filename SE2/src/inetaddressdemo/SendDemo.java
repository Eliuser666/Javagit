package inetaddressdemo;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
public class SendDemo {
	public static void main(String[] args) throws IOException {
		DatagramSocket ds = new DatagramSocket();
		String s = "hello udp,im coming!";
		byte[] bys = s.getBytes();
		int length = bys.length;
		InetAddress address = InetAddress.getByName("GHW");
		int port = 8888;
		DatagramPacket dp = new DatagramPacket(bys, length, address, port);
		ds.send(dp);
		ds.close();
	}
}

package inetaddressdemo;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class ReceiveDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		DatagramSocket dr = new DatagramSocket(8888);
		byte[] bys = new byte[1024];
		DatagramPacket dp = new DatagramPacket(bys, bys.length);
		dr.receive(dp);
		InetAddress address=dp.getAddress();
		byte[] data=dp.getData();
		int length=dp.getLength();
		System.out.println("sender --->"+address.getHostAddress());
		System.out.println(new String(data,0,length));
		dr.close();
	}

}

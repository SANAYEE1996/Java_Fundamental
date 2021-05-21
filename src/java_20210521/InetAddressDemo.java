package java_20210521;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressDemo {

	public static void main(String[] args) throws UnknownHostException {

		InetAddress i = InetAddress.getLocalHost();
		System.out.println("Host name\t:\t" + i.getHostName());
		System.out.println("IP address\t:\t" + i.getHostAddress());
		
		InetAddress i2 = InetAddress.getByName("naver.com");
		System.out.println("naver name\t:\t" + i2.getHostName());
		System.out.println("naver address\t:\t" + i2.getHostAddress());
		
		InetAddress i3 = InetAddress.getByName("www.google.com");
		System.out.println("google name\t:\t" + i3.getHostName());
		System.out.println("google address\t:\t" + i3.getHostAddress());
		
		
		
		
	}

}

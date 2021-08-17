package di;

import di.encode.Encoder;
import di.encode.UrlEncoder;

public class Main {

	public static void main(String[] args) {
		
		String url = "www.navber.com/books/it?page=10&size=20&name=spring-boot";
		
		Encoder encoder = new Encoder(new UrlEncoder());
		String result = encoder.encode(url);
		System.out.println(result);
	}

}

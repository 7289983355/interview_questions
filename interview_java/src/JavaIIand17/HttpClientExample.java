package JavaIIand17;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class HttpClientExample {
	public static void main(String[] args) {
		try {
			
			HttpClient client = HttpClient.newHttpClient();
			HttpRequest request = HttpRequest.newBuilder()
					             .uri(URI.create("https://api.github.com")).build();

			HttpResponse<String> response = 
					          client.send(request, 
					         HttpResponse.BodyHandlers.ofString());
			System.out.println("Response Code: " + response.statusCode());
			System.out.println("Response Body: " + response.body());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

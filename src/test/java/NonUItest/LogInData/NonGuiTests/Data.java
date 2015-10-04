package NonUItest.LogInData.NonGuiTests;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

public class Data {
   // public class POSTSender {

       /* String expectedPlayersPageTitle = "Players";
        String baseURL = "http://193.138.245.222:81";


        public String echoCuties(String query) throws IOException {
            // Encode the query
            String encodedQuery = URLEncoder.encode(query, "UTF-8");
            // This is the data that is going to be send to our site via POST request
            String postData = encodedQuery;

            // Connect to site
            URL url = new URL(baseURL);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setDoOutput(true);
            connection.setRequestMethod("POST");
            connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            connection.setRequestProperty("Content-Length", String.valueOf(postData.length()));

            // Write data
            OutputStream os = connection.getOutputStream();
            os.write(postData.getBytes());

            // Read response
            StringBuilder responseSB = new StringBuilder();
            BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream()));

            String line;
            while ((line = br.readLine()) != null)
                responseSB.append(line);

            // Close streams
            br.close();
            os.close();

            return responseSB.toString();

        }

    }*/
}
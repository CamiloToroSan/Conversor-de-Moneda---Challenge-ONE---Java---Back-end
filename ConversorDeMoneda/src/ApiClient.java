import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONObject;

public class ApiClient {
    public double obtenerTasaCambio(String from, String to) {
        double tasaCambio = 0.0;
        try {
            String urlStr = Config.API_URL + Config.API_KEY + "/latest/" + from;
            URL url = new URL(urlStr);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");

            BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String inputLine;
            StringBuilder content = new StringBuilder();
            while ((inputLine = in.readLine()) != null) {
                content.append(inputLine);
            }
            in.close();
            conn.disconnect();

            JSONObject json = new JSONObject(content.toString());
            JSONObject conversionRates = json.getJSONObject("conversion_rates");
            tasaCambio = conversionRates.getDouble(to);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return tasaCambio;
    }
}

public class ConversorMoneda {
    private ApiClient apiClient;

    public ConversorMoneda() {
        apiClient = new ApiClient();
    }

    public double convertir(String from, String to, double monto) {
        double tasa = apiClient.obtenerTasaCambio(from, to);
        return monto * tasa;
    }
}

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ConversionRecord {
    private String filename;

    public ConversionRecord(String filename) {
        this.filename = filename;
    }

    public void registrarConversion(String from, String to, double monto, double resultado) {
        LocalDateTime fechaHora = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        String registro = String.format("%s - %s a %s: %.2f convertido a %.2f\n",
                fechaHora.format(formatter), from, to, monto, resultado);

        try (FileWriter writer = new FileWriter(filename, true)) {
            writer.write(registro);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

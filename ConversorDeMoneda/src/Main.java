import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ConversorMoneda conversor = new ConversorMoneda();
        ConversionRecord conversionRecord = new ConversionRecord(Config.CONVERSION_FILE);

        System.out.println("¡Bienvenido al Conversor de Monedas!");
        while (true) {
            System.out.println("\nSeleccione la moneda de origen:");
            for (int i = 0; i < Config.MONEDAS.length; i++) {
                System.out.println((i + 1) + ". " + Config.MONEDAS[i]);
            }
            System.out.println((Config.MONEDAS.length + 1) + ". Salir");

            int opcionFrom = scanner.nextInt();
            if (opcionFrom == Config.MONEDAS.length + 1) {
                break;
            }
            String from = Config.MONEDAS[opcionFrom - 1];

            System.out.println("\nSeleccione la moneda de destino:");
            for (int i = 0; i < Config.MONEDAS.length; i++) {
                System.out.println((i + 1) + ". " + Config.MONEDAS[i]);
            }

            int opcionTo = scanner.nextInt();
            String to = Config.MONEDAS[opcionTo - 1];

            System.out.print("Ingrese el valor que desea convertir: ");
            double monto = scanner.nextDouble();

            double resultado = conversor.convertir(from, to, monto);
            System.out.println("El valor convertido es: " + resultado);
            conversionRecord.registrarConversion(from, to, monto, resultado);
        }

        System.out.println("¡Gracias por usar el Conversor de Monedas!");
    }
}

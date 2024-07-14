Conversor de Moneda 💱
Este proyecto es una aplicación de consola en Java que permite convertir entre diferentes monedas utilizando la API de Exchange Rate. La aplicación soporta varias monedas y registra las conversiones realizadas en un archivo de texto.

Monedas Soportadas 🌍
USD - Dólar estadounidense 🇺🇸
ARS - Peso argentino 🇦🇷
BRL - Real brasileño 🇧🇷
BOB - Boliviano boliviano 🇧🇴
CLP - Peso chileno 🇨🇱
COP - Peso colombiano 🇨🇴

Características ✨
Conversión entre múltiples monedas.
Registro de conversiones en un archivo de texto.
Interfaz de usuario en consola.

Requisitos 📋
JDK 8 o superior.
Conexión a Internet para realizar solicitudes a la API.
Biblioteca org.json para manejar JSON.
Configuración ⚙️
Clona el repositorio:


git clone https://github.com/CamiloToroSan/Conversor-de-Moneda---Challenge-ONE---Java---Back-end.git
cd Conversor-de-Moneda---Challenge-ONE---Java---Back-end


Asegúrate de tener la biblioteca org.json disponible. Puedes descargarla aquí y añadirla a tu proyecto.


Uso 🚀 y Ejemplo 🌟
sh
Copiar código
¡Bienvenido al Conversor de Monedas!

Seleccione la moneda de origen:
1. USD
2. ARS
3. BRL
4. BOB
5. CLP
6. COP
7. Salir
1

Seleccione la moneda de destino:
1. USD
2. ARS
3. BRL
4. BOB
5. CLP
6. COP
2

Ingrese el valor que desea convertir: 100
El valor convertido es: 9500.0
Las conversiones se registran en un archivo de texto conversiones.txt en el siguiente formato:


Estructura del Proyecto 📁
 - Config.java: Configuración de la aplicación, incluyendo la clave de API y las monedas soportadas.
 - ApiClient.java: Maneja las solicitudes a la API de Exchange Rate.
 - ConversorMoneda.java: Lógica de conversión entre monedas.
 - ConversionRecord.java: Registro de conversiones en un archivo de texto.
 - Main.java: Interfaz de usuario en consola y lógica principal del programa.


Con este README actualizado, tu repositorio estará bien documentado y listo para ser compartido con la comunidad. Asegúrate de reemplazar path_to_json_jar con la ruta correcta al archivo json.jar en tu sistema.







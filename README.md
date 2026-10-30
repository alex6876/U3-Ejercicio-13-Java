Aquí tienes la estructura en formato Markdown lista para el `README.md` de este código de **Simulación de Control de Stock por Talles en Tienda de Ropa (Encapsulamiento y Uso de HashMaps en Java)**, manteniendo el enfoque exclusivo de **Programación Orientada a Objetos en memoria** (sin bases de datos):

---

# 👕 Simulación de Control de Stock por Talles y Prenda (Encapsulamiento y Colecciones en Java)

Este proyecto es una aplicación en Java que modela la gestión de inventario de una prenda de indumentaria por talles específicos (S, M, L, XL) utilizando estructuras de datos asociativas. Pone en práctica conceptos clave de la **Programación Orientada a Objetos (POO)** como el **encapsulamiento de atributos privados**, el control de estado defensivo mediante constructores y la manipulación dinámica de colecciones (`HashMap`) en memoria.

---

## 🧩 Clases y Estructura del Sistema

El diseño del software se organiza a través de una clase de dominio encapsulada y un punto de ejecución:

* **`Prenda`**: Modela el artículo de indumentaria y protege la integridad de sus precios, modelo y existencias por talle.
* **Atributos privados (`private`)**: `modelo`, `precio` y un diccionario de almacenamiento `HashMap<String, Integer> stock`, impidiendo la manipulación directa de los datos desde el exterior.
* **Constructor**: Inicializa el modelo, el precio y construye un mapa predeterminado con los talles estándar ("S", "M", "L", "XL"), configurando sus existencias iniciales en cero.
* **Métodos accesores (*getters*)**: Permiten consultar de forma controlada el modelo y el precio de la prenda.
* **Métodos operativos de negocio**:
* `consultarStock(String talle)`: Verifica si el talle existe en el diccionario y retorna su cantidad disponible; de lo contrario, advierte que el talle es inexistente.
* `agregarStock(String talle, int cantidad)`: Valida la existencia del talle y que la cantidad a incorporar sea positiva antes de actualizar el mapa de existencias.
* `vender(String talle, int cantidad)`: Comprueba la validez del talle, que la cantidad solicitada sea mayor a cero y que exista inventario suficiente (`stock < cantidad`) antes de descontar unidades.




* **`Main`**: Punto de entrada del programa. Instancia una prenda (remera deportiva), realiza operaciones de carga de stock por talle, simula ventas exitosas y fallidas (por falta de stock o talle inválido), y muestra por consola el inventario final completo.

---

## ⚙️ Reglas de Negocio y Control de Validación

1. **Gestión Asociativa por Claves (*HashMap*):** El uso de un mapa permite asociar directamente cada talle de ropa con su respectivo stock numérico, facilitando consultas y actualizaciones eficientes.
2. **Validación Estricta de Talles:** Las operaciones de consulta, reposición y venta validan mediante `containsKey` si el talle ingresado es soportado por el sistema, rechazando entradas erróneas (ej. "XXL").
3. **Control de Existencias en Ventas:** El método `vender` evalúa de forma defensiva que la cantidad solicitada no supere el stock disponible para evitar existencias negativas en el inventario.

---

## 💻 Salida por Consola

Al ejecutar la clase `Main`, el programa genera el siguiente resultado:

```text
--- Carga de stock ---
Stock agregado correctamente.
Stock agregado correctamente.
Stock agregado correctamente.
Stock agregado correctamente.

--- Ventas ---
Venta realizada correctamente.
Stock insuficiente.
Venta realizada correctamente.

--- Prueba de talle inválido ---
Talle inexistente.

--- Inventario final ---
Modelo: Remera deportiva
Precio: $15000.0
Talle S: 10
Talle M: 10
Talle L: 20
Talle XL: 3

```

---

## 🚀 Conceptos de Programación Aplicados

* **Encapsulamiento de Estructuras Complejas:** Ocultamiento del `HashMap` interno, permitiendo modificar las colecciones únicamente a través de métodos de negocio controlados.
* **Uso de Colecciones Asociativas:** Aplicación práctica de mapas clave-valor para representar inventarios multivariante (talles de ropa).
* **Diseño Modular:** Clara separación entre la lógica del dominio de inventarios (`Prenda`) y la ejecución de casos de prueba (`Main`).

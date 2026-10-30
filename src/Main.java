public class Main {
    public static void main(String[] args) {

        Prenda remera = new Prenda("Remera deportiva", 15000);

        System.out.println("--- Carga de stock ---");

        remera.agregarStock("S", 10);
        remera.agregarStock("M", 15);
        remera.agregarStock("L", 20);
        remera.agregarStock("XL", 5);

        System.out.println("\n--- Ventas ---");

        remera.vender("M", 5);
        remera.vender("L", 25);
        remera.vender("XL", 2);

        System.out.println("\n--- Prueba de talle inválido ---");

        remera.agregarStock("XXL", 10);

        System.out.println("\n--- Inventario final ---");

        System.out.println("Modelo: " + remera.getModelo());
        System.out.println("Precio: $" + remera.getPrecio());

        System.out.println("Talle S: " + remera.consultarStock("S"));
        System.out.println("Talle M: " + remera.consultarStock("M"));
        System.out.println("Talle L: " + remera.consultarStock("L"));
        System.out.println("Talle XL: " + remera.consultarStock("XL"));
    }
}

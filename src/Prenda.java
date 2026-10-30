
import java.util.HashMap;

public class Prenda {
    private String modelo;
    private double precio;
    private HashMap<String, Integer> stock;

    public Prenda(String modelo, double precio) {
        this.modelo = modelo;
        this.precio = precio;

        stock = new HashMap<>();

        stock.put("S", 0);
        stock.put("M", 0);
        stock.put("L", 0);
        stock.put("XL", 0);
    }

    public int consultarStock(String talle) {
        if (stock.containsKey(talle)) {
            return stock.get(talle);
        } else {
            System.out.println("Talle inexistente.");
            return -1;
        }
    }

    public void agregarStock(String talle, int cantidad) {
        if (!stock.containsKey(talle)) {
            System.out.println("Talle inexistente.");
        } else if (cantidad <= 0) {
            System.out.println("La cantidad debe ser mayor que cero.");
        } else {
            int stockActual = stock.get(talle);
            stock.put(talle, stockActual + cantidad);

            System.out.println("Stock agregado correctamente.");
        }
    }

    public void vender(String talle, int cantidad) {
        if (!stock.containsKey(talle)) {
            System.out.println("Talle inexistente.");
        } else if (cantidad <= 0) {
            System.out.println("La cantidad debe ser mayor que cero.");
        } else if (stock.get(talle) < cantidad) {
            System.out.println("Stock insuficiente.");
        } else {
            int stockActual = stock.get(talle);
            stock.put(talle, stockActual - cantidad);

            System.out.println("Venta realizada correctamente.");
        }
    }

    public String getModelo() {
        return modelo;
    }

    public double getPrecio() {
        return precio;
    }
}

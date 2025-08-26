package org.example;

import java.util.*;




public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        HashMap<String, Double> platos = new HashMap<>();
        ArrayList<String> pedidos = new ArrayList<>();

        System.out.println("Los platos del menu son: ");

        platos.put("hamburguesa", 35000.0);
        platos.put("HotDog", 20000.0);
        platos.put("taco", 12000.0);
        platos.put("burrito", 40000.0);
        platos.put("lasagna", 38000.0);
        platos.put("costillitas BBQ", 40000.0);
        platos.put("picada", 60000.0);

        System.out.println(platos);

        System.out.println("Desea realiza pedido escriba SI para pedir otro plato o FIN si ya termino de pedir");
        String pedido = scanner.nextLine();

        while (!pedido.equalsIgnoreCase("Fin") && pedido.equalsIgnoreCase("Si")) {

            System.out.println("Ingrese el nombre del plato:");
            String plato = scanner.nextLine();

            try {
                validarPlato(plato, platos);
                System.out.println("✅ " + plato + " agregado al pedido");
            } catch (PlatoNoEncontradoException excepcion) {
                System.out.println(excepcion.getMessage());
            }

            System.out.println("Desea realiza pedido escriba SI para pedir otro plato o FIN si ya termino de pedir");
            pedido = scanner.nextLine();
        }

        System.out.println("Tus pedidos fueron: " + pedidos);

        if (pedidos.isEmpty()) {
            throw new IllegalStateException("⚠️ El pedido no puede estar vacío");
        }

        Double total = pedidos.stream()
                .mapToDouble(platos::get)
                .sum();
        System.out.println("El total de la compra es de: " + total);
        Double descuento = 0.0;
        if (total > 100000) {
            descuento = total * 0.15;
        } else{
            descuento = total * 0.10;
        }
        double totalFinal = total - descuento;

        System.out.println("EL total de la compra con descuento es de: " + totalFinal);

        double promedio = pedidos.stream()
                .mapToDouble(platos::get)
                .average()
                .orElse(0);
        System.out.println("El precio promedio de la compra es de: " + promedio);

    }
    public static class PlatoNoEncontradoException extends RuntimeException {
        public PlatoNoEncontradoException(String mensaje) {
            super(mensaje);
        }
    }
    public static boolean validarPlato(String plato, HashMap<String, Double> menu) {
        if (menu.containsKey(plato)) {
            return true;
        } else {
            throw new PlatoNoEncontradoException("❌ Ese plato no existe: " + plato);
        }

    }
    }


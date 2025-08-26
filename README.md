# 🍽️ Momento 3 — Lógica de Programación (Java)

Aplicación de consola en **Java** que simula el proceso de pedidos en un restaurante:
- Muestra un **menú** (`HashMap<String, Double>`).
- Permite **ingresar pedidos**.
- **Valida** que el plato exista (lanza excepción personalizada).
- Calcula **total**, **descuentos**, **promedio** y el **plato más pedido** usando Streams.
- Asegura que el pedido **no quede vacío** (lanza `IllegalStateException`).

---

## ✅ Objetivos del ejercicio

 Declarar e inicializar variables adecuadamente en Java.
 Leer datos desde el teclado usando Scanner.
 Aplicar operaciones aritméticas y condiciones múltiples para resolver problemas.
 Organizar entradas, procesos y salidas de un problema.
 Usar estructuras de datos básicas: ArrayList, HashMap.
 Aplicar ciclos, funciones y manejo de excepciones.
 Procesar cadenas de texto y datos en colecciones usando Streams.
 Documentar y versionar proyectos en GitHub.

## 🧭 Paso a paso: ¿Qué se hizo?

Se creó un `HashMap<String, Double>` donde la **clave** es el nombre del plato y el **valor** es el precio
HashMap<String, Double> platos = new HashMap<>();
platos.put("hamburguesa", 35000.0);
platos.put("HotDog", 20000.0);
platos.put("taco", 12000.0);
platos.put("burrito", 40000.0);
platos.put("lasagna", 38000.0);
platos.put("costillitas BBQ", 40000.0);
platos.put("picada", 60000.0);

Se usa Scanner para leer desde consola. Los pedidos se guardan como nombres de platos en un ArrayList<String>.
Se creó una excepción para cuando el plato no existe en el menú.
Al finalizar, si no se pidió nada, se lanza IllegalStateException.
Se muestran los pedidos, total sin descuento, descuento aplicado, total final, plato más pedido y promedio.

✏️ 📝 ¿que aprendi en el curso?

declarar variables 
ciclos while y for
condicionales 
excepciones 
funciones de flecha 
usar hasmap
usar y declarar array y arralist 
para que sirve el archivo .pom
diferencia entre un primitivo y una envoltura 





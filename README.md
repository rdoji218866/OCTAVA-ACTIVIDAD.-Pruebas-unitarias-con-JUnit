# Octava Actividad: Pruebas Unitarias con JUnit

**Nombre del estudiante:** Rafael Dominguez Jimenez  
**Fecha:** 12/11/2026

---

##  Propósito de la Actividad
- Practicar el análisis y diseño de casos de prueba para el código fuente proporcionado (`ArrayOperations.java`).
- Verificar que el entorno de desarrollo y ejecución de pruebas esté correctamente configurado.
- Dar los primeros pasos en la implementación de pruebas unitarias utilizando el framework **JUnit**.

---

##  Descripción e Instrucciones
Para esta práctica se tomó como base la clase `ArrayOperations.java` con el objetivo de evaluar el comportamiento del método `numZero()`.

Las directrices principales aplicadas en el desarrollo fueron:
- Implementar **al menos 5 pruebas unitarias** en JUnit.
- Aplicar las buenas prácticas de diseño de pruebas: **cada caso de prueba verifica un único hecho o escenario específico**, garantizando la claridad y la trazabilidad ante posibles fallos.

---

##  Diseño de Casos de Prueba (`ArrayOperations.numZero()`)

A continuación, se detallan los casos de prueba diseñados e implementados para evaluar el método:

| Prueba | Nombre del Método de Prueba | Propósito  | Entrada  | Resultado Esperado |
| :--- | :--- | :--- | :--- | :--- |
| **01** | `arregloCon3cerosDevuelve3()` | Verifica que si tiene 3 ceros, con valores adicionales. | `{0, 0, 1, 0}` | `3` |
| **02** | `arregloSinCerosDevuelve0()` | Verifica si no hay ceros dentro del arreglo. | `{6 , 7, 1, 8}` | `0` |
| **03** | `arregloVacioDevuelve0()` | Verifica que si el arreglo esat avcio, aun asi devolvera 0. | `{}` | `0` |
| **04** | `arregloConNegativosSinCerosDevuelve0()` | Evalúa con valores negativos sin tener ceros. | `{-6,-8,-1,-18}` | `0` |
| **05** | `siTodosSon0DevuelveElTamanioDelArreglo()` | Verifica que si todos son 0, debe retornar el tamaño del arreglo. | `{0,0,0,0,0,0}` | `x.length()` |

---

## 💡 Retos y Aprendizajes

### Retos enfrentados:
* Me costo con este metodo a encontrar escenarios posibles por evaluar en las pruebas, tal vez con otros metodos sea mas facil

### Aprendizajes obtenidos:
* Aprendi que es necesario evaluar la mayor cantidad de escenarios poosibles dentro de las pruebas para poder tener un codigo mejor.
---

##  Uso de la Inteligencia Artificial (IA)

Para el desarrollo de esta actividad, la Inteligencia Artificial se utilizó de la siguiente manera:

- **Generacion del Readmi:** Para un diseño mas bonito del readmi.
- **Ayuda en codigo:** No utilice IA para la generacion de mi codigo, todos los escenarios los pense de manera propia, aunque pude utilizar la IA para mejores escenarios

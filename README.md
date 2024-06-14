# TP 1 - Objetos y Testing Automatizado con JUnit

- Maven
    - Estructura de Proyecto
    - Dependencias:
        - JUnit5
- Testing Automatizado
    - Asserts
    - Covertura
- Tests invariantes con fechas

## 1. Sistema de Concursos
- El participante debe poder inscribirse a los concursos.
- El concurso acepta la inscripción dentro del rango de fecha de inscripción
- El participante gana puntos si se inscribe durante el primer día de abierta la inscripción.
- Se puede conocer la cantidad de puntos ganados.
- Si un participante intenta inscribirse fuera de la fecha de inscripción se debe informar con un mensaje.

- Aseguro de invariantes (condición que debe mantenerse verdadera). Consideración de fechas en tests.
- Verificación de cobertura y funcionalidades sin testear.

## 2. Sistema de Concursos

- Se calcula el costo consumido por cada mesa.
- Menú con bebidas y platos principales con su precio.
- Los pedidos se arman con platos y bebidas del menú, más la cantidad para cada caso.
- Pagos con distintas tarjetas.

- Tests:
    1. Cálculo de costo con tarjeta Visa.
    2. Cálculo de costo con tarjeta Mastercard.
    3. Cálculo de costo con tarjeta Comarca Plus.
1. Indique si el diseño corresponde a un framework o a una librería. Justifique adecuadamente.

El diseño corresponde a una librería. El usuario es quien se encarga de llamar a BeaconDispatcher::dispatch. Ademas, se da en forma de un servicio que yo puedo implementar donde quiera. Yo decido dónde se crea el StreamBeacons, cuándo se registra el listener y cuándo se emiten los eventos (es decir, cuándo ocurre la lógica).

2. Identifique si existe Inversión de Control. En caso afirmativo, indique dónde ocurre. Justifique claramente.

Hay inversion de control pero local al patron Observer del diseño. Este utiliza callbacks para que el Dispatcher llame al Listener. Es una técnica para desacoplar código. Pero yo, como programador, sigo teniendo el control del ciclo de vida. Yo decido dónde se crea el StreamBeacons, cuándo se registra el listener y cuándo se emiten los eventos (es decir, cuándo ocurre la lógica).

3. Cree un mecanismo para registrar en consola cada evento despachado, mostrando: nombre del evento, fecha y hora. Restricción: no se permite modificar el código provisto.



4. Se desea que los Listeners reciban únicamente aquellos eventos que sean de su interés, evitando que reaccionen a eventos irrelevantes. 
   1. Proponga una solución de diseño.
   2. Explique cómo un Listener determina qué eventos le interesan.
   3. ¿Considera que la solución es una extensión o una instanciación? Justifique.
   Nota: en caso de escribir código, puede indicar únicamente el código agregado o modificado.
5. Indicar Verdadero o Falso y justificar en cada caso:
   1. El método dispatch de BeaconDispatcher es un Template Method.
   2. El método register es un método hook.
   3. El método onEvent constituye un hotspot.
   4. La clase StreamBeacons no puede considerarse un frozenspot porque permite cambiar el BeaconDispatcher mediante el método setDispatcher.
   5. El diseño no permite extender el comportamiento de BeaconDispatcher, por lo tanto, es de caja blanca.
   6. El uso de interfaces confirma que se trata de un diseño de caja negra.
   7. Dado que DoNotDisturbDispatcher no hereda del DefaultDispatcher, se puede afirmar que es un diseño de caja negra.
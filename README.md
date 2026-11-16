# Orientación a Objetos 2

Teorías y ejercicios resueltos en Java (proyectos Maven) de Orientación a Objetos 2 (cursada 2026): patrones de diseño, refactoring, frameworks y parciales.

## [Teoría](2026/Teoría/)

- [Introducción a la materia](2026/Teoría/Intro%20a%20la%20materia.pdf)
- [Introducción a refactoring](2026/Teoría/Intro%20a%20refactoring.pdf) y [ejemplo de refactoring](2026/Teoría/Refactoring-Ejemplo.pdf)
- [Catálogo de refactorings](2026/Teoría/2-Slides-Catalogo.pdf) y [herramientas de refactoring](2026/Teoría/3-Refactoring-Tools.pdf)
- [Catálogo de code smells](2026/Teor%C3%ADa/Cata%CC%81logo%20de%20code%20smells%20de%20Objetos%202.pdf)

## [Patrones](2026/Práctica/Patrones/)

El patrón de cada ejercicio se deduce de las clases del código.

| Ejercicio | Patrón | Extra |
| --- | --- | --- |
| [AlquilerAutos](2026/Práctica/Patrones/AlquilerAutos/) | Strategy (políticas de cancelación) | [UML](2026/Práctica/Patrones/AlquilerAutos/UML.png) |
| [Calculadora](2026/Práctica/Patrones/Calculadora/) | State | — |
| [DecodificadorPeliculas](2026/Práctica/Patrones/DecodificadorPeliculas/) | Strategy (criterios de sugerencia) | [UML](2026/Práctica/Patrones/DecodificadorPeliculas/UML-0.png) |
| [DispositivoMovilYConexiones](2026/Práctica/Patrones/DispositivoMovilYConexiones/) | Adapter (conexión 4G) y Strategy (cálculo de CRC) | [UML](2026/Práctica/Patrones/DispositivoMovilYConexiones/UML-0.png) |
| [Excursiones](2026/Práctica/Patrones/Excursiones/) | State | — |
| [FileSystem](2026/Práctica/Patrones/FileSystem/) | Composite | [UML](2026/Práctica/Patrones/FileSystem/UML.png) |
| [Friday13](2026/Práctica/Patrones/Friday13/) | Adapter (exportadores a JSON) | [UML](2026/Práctica/Patrones/Friday13/UML-0.png) |
| [GenealogiaSalvaje](2026/Práctica/Patrones/GenealogiaSalvaje/) | Null Object | — |
| [GestionDeportiva](2026/Práctica/Patrones/GestionDeportiva/) | Builder y Abstract Factory | — |
| [JuegosDeRol](2026/Práctica/Patrones/JuegosDeRol/) | Factory Method (creadores de personajes) | — |
| [MediaPlayer](2026/Práctica/Patrones/MediaPlayer/) | Adapter | [UML](2026/Práctica/Patrones/MediaPlayer/UML-0.png) |
| [Mensajero](2026/Práctica/Patrones/Mensajero/) | Adapter (algoritmos de cifrado) | [UML](2026/Práctica/Patrones/Mensajero/UML-0.png) |
| [PlanesMedicos](2026/Práctica/Patrones/PlanesMedicos/) | Template Method y Null Object | — |
| [PrestamosPrendarios](2026/Práctica/Patrones/PrestamosPrendarios/) | Composite (prendas combinadas) | — |
| [ProductosFinancieros](2026/Práctica/Patrones/ProductosFinancieros/) | Builder y Composite | — |
| [SubteWay](2026/Práctica/Patrones/SubteWay/) | Builder | — |
| [Sueldos](2026/Práctica/Patrones/Sueldos/) | Template Method | — |
| [ToDoItem](2026/Práctica/Patrones/ToDoItem/) | State | [UML](2026/Práctica/Patrones/ToDoItem/UML-0.png) |
| [Topografias](2026/Práctica/Patrones/Topografias/) | Composite | — |
| [ejercicio23](2026/Práctica/Patrones/ejercicio23/) | Proxy (carga diferida de los posts de un usuario) | — |
| [filtros](2026/Práctica/Patrones/filtros/) | Filtros de imágenes PNG | [UML](2026/Práctica/Patrones/filtros/UML-0.png) |
| [filters-pipes](2026/Práctica/Patrones/filters-pipes/) | Filtros de imágenes encadenados en un pipe | — |

## [Refactoring](2026/Práctica/Refactoring/)

- [Cuadernillo resuelto](2026/Práctica/Refactoring/Cuadernillo%20resuelto.pdf)
- [FacturacionLlamadas](2026/Práctica/Refactoring/FacturacionLlamadas/): código refactorizado y [análisis de malos olores](2026/Práctica/Refactoring/FacturacionLlamadas/Respuesta.md).
- [TrianguloRectangulo](2026/Práctica/Refactoring/TrianguloRectangulo/): [tabla de bad smells](2026/Práctica/Refactoring/TrianguloRectangulo/Respuesta.md).
- [Empleados](2026/Práctica/Refactoring/Empleados/), [Iteradores-Circulares](2026/Práctica/Refactoring/Iteradores-Circulares/) y [Productos](2026/Práctica/Refactoring/Productos/): código refactorizado.

## [Frameworks](2026/Práctica/Frameworks/)

- [SingleThreadTCPServer](2026/Práctica/Frameworks/SingleThreadTCPServer/): servidor TCP extendido en varias variantes (eco, repetición, contraseña, vacío).
- [StreamBeacons](2026/Práctica/Frameworks/StreamBeacons/): dispatchers y listeners de eventos, con [respuestas](2026/Práctica/Frameworks/StreamBeacons/Respuestas.md) sobre si es framework o librería.

## Parciales y repaso

| Ejercicio | Patrones | Extra |
| --- | --- | --- |
| [BurgerOO2](2026/Práctica/Parciales/BurgerOO2/) | State (pedido), Decorator (extras) y Strategy (métodos de pago) | — |
| [EnvioDePaquetes](2026/Práctica/Parciales/EnvioDePaquetes/) | Decorator (paquetes) y Strategy (reportes PDF/XLS) | — |
| [OO2SmartHome](2026/Práctica/Parciales/OO2SmartHome/) | Abstract Factory (temas), Builder (rutinas), Proxy (cámaras) | — |
| [Repaso-Twitter](2026/Práctica/Repaso-Twitter/) | Ejercicio integrador de tweets y retweets | [UML](2026/Práctica/Repaso-Twitter/UML.png) |

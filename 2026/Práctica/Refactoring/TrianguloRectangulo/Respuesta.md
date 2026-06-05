1.
| **Bad smell**        | **#Línea(s)** | **Justificación**                                                                                            | **Refactoring**  |
|:---------------------|:--------------|:-------------------------------------------------------------------------------------------------------------|:-----------------|
| Uncommunicative Name | #4-5          | Se necesita de comentarios para saber cual v.i. es la base y cual la altura                                  | Rename field     |
| Inline temp          | #18           | Variable auxiliar temporal que se puede reemplazar simplemente retornando el resultado del cálculo posterior |                  |
| Dead code            | #17           | Parámetro que nunca se utiliza                                                                               | Remove Parameter |
# Implementación del Patrón Composite

## Descripción Del Patrón

El patrón Composite es utilizado para representar estructuras jerárquicas en las que los objetos individuales y las composiciones de objetos deben ser tratados de la misma manera. Permite construir estructuras de árbol donde los nodos pueden contener otros nodos o elementos simples.

Este proyecto demuestra la implementación del patrón Composite en un sistema de Red de Transporte, permitiendo modelar estaciones individuales y grupos de estaciones de manera uniforme e interactiva, utilizando Java y Maven.

## Estructura del proyecto
La estructura del proyecto sigue el estándar de Maven:

![image](https://github.com/user-attachments/assets/474e6a98-4210-4007-bf2f-d9a19daabca7)

## Dependencias Utilizadas

Este proyecto utiliza las siguientes dependencias definidas en el archivo pom.xml:

![image](https://github.com/user-attachments/assets/d6046d8e-4d15-4ff8-a8ac-054b2f8513ee)


## Instrucciones de Instalación

1. clonar el Repositorio

git clone https://github.com/Santibari/Proyecto-1-Arquitectura-.git
cd proyecto-arquitectura-composite

2. Compilar el proyecto>

mvn clean compile

3. Ejecutar el proyecto>

mvn exec:java -Dexec.mainClass="com.mycompany.proyectoarquitecturacomposite.Main"

## Ejemplo de Ejecución

Al ejecutar el programa, el usuario podrá interactuar con el sistema de transporte mediante un menú interactivo, ingresando opciones para crear estaciones, grupos y realizar búsquedas.

## Ejemplo de salida:

![image](https://github.com/user-attachments/assets/e67fa580-9e1b-45dc-a8e1-c82519935c99)

## Diagrama UML
El siguiente diagrama muestra la estructura del patrón Composite implementado en este proyecto:


![nLGzRzj03Dq5w3yGMUeqiD5P2880Hf06QATsAphG9yPbSBfJxoE0q_PNTUkQFrRUwSE9f7Je4Y-6H97lyJsIbpwW2x7HPV46RamWTuiFy3qIr7JBXe0qADkqrWLic4omwV7nZv4uQFH0Ka2nDUJBWhjyHN3Ll_tiqFYKJF2ZB41-PveJvDMOjZg52kujrtrSMJEFI-K-l8jU7SChOvkTeme-1STcdpxTMQi9JLdyAel](https://github.com/user-attachments/assets/72596b7f-1770-4c42-9435-0f5dbcd23bbd)

(Los circulos en verde son equivalentes a + (publico) )
(Los cuadros rojos son quivalentes a - (privado) )

## Explicación de la Implementación

El patrón Composite ha sido implementado utilizando las siguientes clases principales:

ElementoTransporte: Interfaz común que define operaciones para estaciones individuales y grupos.

Estacion: Representa una estación individual (Leaf) en el patrón Composite.

GrupoTransporte: Representa un conjunto de estaciones o subgrupos (Composite), permitiendo estructurar la red de manera jerárquica.

Main: Contiene el menú interactivo para que el usuario pueda gestionar la red de transporte en tiempo real.

## Contribuciones

Este proyecto fue desarrollado por:

Santiago Bazzani, Andres Beltran, Anthony Nope




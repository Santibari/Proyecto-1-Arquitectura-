# Implementación del Patrón Composite

## Descripción Del Patrón

El patrón Composite es utilizado para representar estructuras jerárquicas en las que los objetos individuales y las composiciones de objetos deben ser tratados de la misma manera. Permite construir estructuras de árbol donde los nodos pueden contener otros nodos o elementos simples.

Este proyecto demuestra la implementación del patrón Composite en un sistema de Red de Transporte, permitiendo modelar estaciones individuales y grupos de estaciones de manera uniforme e interactiva, utilizando Java y Maven.

## Estructura del proyecto
La estructura del proyecto sigue el estándar de Maven:

proyecto-arquitectura-composite
│
├── pom.xml                # Archivo de configuración de Maven
├── README.md              # Documentación del proyecto
└── src
    ├── main
    │   ├── java
    │   │   └── com.mycompany.proyectoarquitecturacomposite    # Código fuente principal
    │   │       ├── Main.java  # Clase principal
    │   │       └── modelo    # Paquete con la lógica del sistema
    │   │           ├── Estacion.java            # Representa una estación individual
    │   │           ├── GrupoTransporte.java     # Representa un grupo de estaciones
    │   │           ├── ElementoTransporte.java  # Interfaz común para estaciones y grupos
    │   └── resources             # Recursos adicionales
    └── test
        └── java                  # Pruebas unitarias

## Dependencias Utilizadas

Este proyecto utiliza las siguientes dependencias definidas en el archivo pom.xml:

<dependencies>
    <!-- Dependencias para pruebas -->
    <dependency>
        <groupId>junit</groupId>
        <artifactId>junit</artifactId>
        <version>4.13.2</version>
        <scope>test</scope>
    </dependency>
</dependencies>

## Instrucciones de Instalación

1. clonar el Repositorio

git clone https://github.com/usuario/proyecto-arquitectura-composite.git
cd proyecto-arquitectura-composite

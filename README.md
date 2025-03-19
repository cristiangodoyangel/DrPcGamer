# Dr PC Gamer - Sistema de Reservas

Sistema de reservas para mantenimiento de PC Gamer y Notebook Gamer.

## Requisitos

- Java 17 o superior
- Maven
- Cuenta en Firebase
- Cuenta en Vercel

## Configuración

1. Crear un proyecto en Firebase
2. Descargar la clave privada del servicio de Firebase (archivo JSON)
3. Renombrar el archivo de clave como `firebase-key.json` y colocarlo en la raíz del proyecto

## Precios

### Notebook Gamer
- Mantención a Domicilio: $20.000 CLP
- Mantención en Taller: $15.000 CLP

### Desktop Gamer
- Mantención a Domicilio: $30.000 CLP
- Mantención en Taller: $25.000 CLP

## Horarios

### Lunes a Viernes
- Mañana: 09:00, 10:00, 11:00, 12:00
- Tarde: 17:00, 18:00, 19:00, 20:00

### Sábados
- Mañana: 09:00, 10:00, 11:00, 12:00

## Ejecución Local

```bash
mvn spring-boot:run
```

## Despliegue

1. Subir el código a GitHub
2. Conectar el repositorio con Vercel
3. Configurar las variables de entorno en Vercel con las credenciales de Firebase

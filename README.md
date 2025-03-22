# Dr PC Gamer - Sistema de Reservas

Sistema de reservas para mantenimiento, armado y formateo de equipos gaming.

## Stack Tecnológico

- Backend: Java (Spring Boot)
- Base de datos: Firebase
- Frontend: HTML, CSS, JavaScript con Bootstrap y FullCalendar
- Despliegue: Vercel

## Requisitos

- Java 17 o superior
- Maven
- Cuenta en Firebase
- Cuenta en Vercel

## Configuración

1. Crear un proyecto en Firebase
2. Descargar la clave privada del servicio de Firebase (archivo JSON)
3. Renombrar el archivo de clave como `firebase-key.json` y colocarlo en la raíz del proyecto

## Servicios y Precios

### Notebook Gamer
- Mantención a Domicilio: $20.000 CLP
- Mantención en Taller: $15.000 CLP

### Desktop Gamer
- Mantención a Domicilio: $30.000 CLP
- Mantención en Taller: $25.000 CLP

### Armado PC Gamer
- Armado a Domicilio: $35.000 CLP
- Armado en Taller: $30.000 CLP

### Formateo e Instalación Windows
- Servicio a Domicilio: $20.000 CLP
- Servicio en Taller: $15.000 CLP

## Horarios de Atención

### Lunes a Viernes
- Mañana: 09:00 a 12:00 hrs
- Tarde: 17:00 a 20:00 hrs

### Sábados
- Mañana: 09:00 a 12:00 hrs

## Características

- Interfaz moderna y responsiva
- Selección de servicios con precios
- Calendario interactivo
- Selección de horarios disponibles
- Sistema de reservas en tiempo real
- Notificaciones por correo electrónico
- Panel de administración

## Desarrollo Local

1. Clonar el repositorio:
```bash
git clone https://github.com/cristiangodoyangel/DrPcGamer.git
cd DrPcGamer
```

2. Instalar dependencias:
```bash
mvn install
```

3. Ejecutar la aplicación:
```bash
mvn spring-boot:run
```

La aplicación estará disponible en `http://localhost:8080`

## Despliegue

1. Subir el código a GitHub
2. Conectar el repositorio con Vercel
3. Configurar las variables de entorno en Vercel:
   - `FIREBASE_PROJECT_ID`
   - `FIREBASE_PRIVATE_KEY`
   - `FIREBASE_CLIENT_EMAIL`

## Paleta de Colores

- Primario (Turquesa): `#11a7b6` - Botones y elementos activos
- Secundario (Morado): `#443168` - Headers y acentos
- Blanco: `#ffffff` - Texto sobre fondos oscuros
- Gris: `#cccccc` - Elementos deshabilitados

## Contribuir

1. Fork el proyecto
2. Crear una rama para tu feature (`git checkout -b feature/AmazingFeature`)
3. Commit tus cambios (`git commit -m 'Add some AmazingFeature'`)
4. Push a la rama (`git push origin feature/AmazingFeature`)
5. Abrir un Pull Request

## Licencia

Este proyecto está bajo la Licencia MIT. Ver el archivo `LICENSE` para más detalles.

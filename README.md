# Sistema de Gestión de Aerolínea

## Descripción

Este proyecto tiene como objetivo el desarrollo de un sistema de gestión para una aerolínea, implementado con **Spring Boot** y **Spring Security**. El sistema incluye funcionalidades para la gestión de usuarios, vuelos, reservas y destinos, ofreciendo un proceso de autenticación seguro mediante **Basic Auth** o **JWT**.

El sistema se asegura de que no se puedan seleccionar vuelos sin plazas disponibles o que hayan superado la fecha límite para la reserva. El backend está desarrollado en **Java 21**, y la base de datos puede ser implementada con **MySQL** o **PostgreSQL**. 

## Características

- **Gestión de Usuarios**: Crear, actualizar y eliminar perfiles de usuario con roles y permisos.
- **Gestión de Vuelos**: Crear, editar y listar vuelos disponibles. Verificar disponibilidad antes de realizar una reserva.
- **Gestión de Reservas**: Realizar y gestionar reservas de vuelos, asegurando que no se seleccionen vuelos sin plazas o fuera del rango de fecha permitido.
- **Gestión de Destinos**: Agregar, editar y consultar destinos disponibles para los vuelos.
- **Autenticación Segura**: Utiliza **Basic Authentication** o **JWT** para asegurar el acceso a las funcionalidades del sistema.

## Tecnologías

- **Backend**: Java 21, Spring Boot, Spring Security
- **Base de Datos**: MySQL o PostgreSQL
- **Autenticación**: Basic Auth / JWT
- **Dependencias**: Maven

## Requisitos

- Java 21
- Maven 3.8 o superior
- MySQL o PostgreSQL
- IDE de tu preferencia (recomendado IntelliJ IDEA o Eclipse)

## Instalación

1. Clona este repositorio:

   ```bash
   git clone https://github.com/tu_usuario/aerolinea-sistema.git

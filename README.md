# Aplicación Terminal de Transporte: Reto Backend

###  ¿En que consiste el reto?
> Se requiere una aplicación que le permita a una terminal de transporte gestionar los horarios de los viajes, en donde tiene que haber la posibilidad de registrar destinos,buses con sus capacidades y se debe llevar un registro de los viajes que se han realizado con los pasajeros que han ido a bordo del bus con sus datos personales para poder gestionar quien usa el sistema de transporte. Basándose en esta necesidad y usando tu creatividad construye una api REST usando los métodos http que consideres prudentes, para conseguir el propósito arriba mencionado.

## Inciar
>1. Clone el repositorio en su equipo usando el comando git clone:https://github.com/MiguelMendoza22/Reto-BackEnd-TerminalTransporte
>2. Luego corra el proyecto en su entorno de desarrollo.
>3. Ejecute los rutas para los metodos HTTP usando Postman.

### Metodos HTTP

### Buses
#### Registrar buses
`POST:` `localhost:8080/viaje/registrarautobus`

```json
    {    
     "marca": "String",    
     "modelo": "String",    
     "capacidad": 10  
    }
```
#### Mostrar Lista de buses
`GET:` `localhost:8080/viaje/mostrarbuses`

### Destinos
#### Registrar destinos
`POST:` `localhost:8080/viaje/registrardestino`

```json
    {    
     "nombre": "String"
    }
```
#### Mostrar Lista de destinos
`GET:` `localhost:8080/viaje/mostrardestino`

### Viajes 
#### Registrar viajes
`POST:` `localhost:8080/viaje//registrarviaje/{idDestino}/{idBus}`
```json
    {    
     "horario": "String"
    }
```
#### Mostrar Lista de viajes
`GET:` `localhost:8080/viaje/mostrarviaje`

### Usuarios
#### Registrar usuarios
`POST:` `localhost:8080/usuario/registrarusuarios`
```json
    {    
     "nombre": "String"
    }
```
#### Mostrar Lista de usuarios
`GET:` `localhost:8080/usuario/mostrarusuarios`

#### Ingresar Usarios al bus (No lo pude completar 😞)

`POST:` `localhost:8080/usuario/usuariosporviajes/{idViaje}"`
```json
    {    
     "nombre": "String"
    }
```

### Estructura del proyecto
- Moldels: se guardan las clases que representaciones de nuestros modelo de datos (Entidades)
- Controllers: Clases donde estan todos los endpoints que tiene nuestra aplicación.
- Services: Guarda la clases que manejan la funcionalidad y logica del negocio.
- Repositories: Aunque no hay una conexión con una base de datos, se uso para guardar las clases que contienen la estructura de datos del proyecto y se encarga de llamar al modelo donde se encuentran los metodos de petición HTTP.

### Patrones de diseño
- Factory Method.
- Prototype.

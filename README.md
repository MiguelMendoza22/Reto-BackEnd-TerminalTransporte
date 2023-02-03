# Aplicación Terminal de Transporte: Reto Backend

###  ¿En que consiste el reto?
> Se requiere una aplicación que le permita a una terminal de transporte gestionar los horarios de los viajes, en donde tiene que haber la posibilidad de registrar destinos,buses con sus capacidades y se debe llevar un registro de los viajes que se han realizado con los pasajeros que han ido a bordo del bus con sus datos personales para poder gestionar quien usa el sistema de transporte. Basándose en esta necesidad y usando tu creatividad construye una api REST usando los métodos http que consideres prudentes, para conseguir el propósito arriba mencionado.

## Inciar
>1. Clone el repositorio en su equipo usando el comando git clone:https://github.com/MiguelMendoza22/Reto-BackEnd-TerminalTransporte
>2. Luego corra el proyecto en su entorno de desarrollo.
>3. Ejecute los rutas para los metodos HTTP usando Postman.

### Metodos HTTP
### Registrar buses
`POST:` `localhost:8080/viaje/registrarautobus`

```json
    {    
     "marca": "peugeot",    
     "modelo": "abc456",    
     "capacidad": 20  
    }
```
#### Mostrar Lista de buses
`GET:` `localhost:8080/viaje/mostrarbuses`


### Estructura del proyecto
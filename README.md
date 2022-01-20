# ApiRestInteraxa

Se hizo una API REST, en java con springboot, con jpa a su vez se creo una base de datos en MYSQL, donde su configuracion esta en el application.context.
Se uso PostMAN, para hacer el consumo de la api rest con las siguientes request.

Dentro de la estructura del git, esta una carpeta con el nombre de DATABASE, donde estan las tablas
el nombre de la DATABASE es : interaxa, el usuario y contreseña le ponen cualqiera, acordarse de modificar el application.context

#CARGAR UNA PERSONA;
POST--> http://localhost:8080/personas/save  body JSON:
                    {
                      "apellido": "Cabrera",
                      "dni": "35104957",
                      "esEmpleado": true,
                      "nombre": "Paulo"
                    }
#DEVUELVE TODAS LAS PERSONAS EN LA DATABASE;
GET--> http://localhost:8080/personas/list

#HACE UN UPDATE DE LA PERSONA POR DNI;
PUT--> http://localhost:8080/personas/update
                    {
                    "dni": "13721011",
                    "nombre": "Liliana",
                    "apellido": "Villegas",
                    "esEmpleado": true
                  }
#HACE UN DELETE DE LA PERSONA POR DNI;          
DELETE--> http://localhost:8080/personas/delete/35104957   

#DEVUELVE SI LA PERSONA ES EMPLEADO O NO;
GET--> http://localhost:8080/personas/isEmployed/35104957

#DEVUELVE TODOS LOS CAMPOS DE LA PERSONA POR DNI;
GET--> http://localhost:8080/personas/findPerson/35104957

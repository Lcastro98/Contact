# Agenda de contactos

Crud de un sistema que lleva el control de contactos telefónicos, los cuales guardan los siguientes datos:
1 Nombre completo
2 Teléfono
3 Correo electrónico
4 Fecha de nacimiento

Para ello se ha separado el back-end del front-ent. En este repositorio se encuentra todo lo relacionado con el back-end

# Back-end

## Construido con 🛠️

- [MySQL](https://dev.mysql.com/downloads/windows/installer/8.0.html) Base de Datos
- [Java 17](https://www.oracle.com/java/technologies/downloads/) Framework Spring boot
- [Intellij IDEA Ultimate](https://www.jetbrains.com/es-es/idea/download/#section=windows) Entorno de Desarrollo

Es necesario tener instaladas estas herramientas antes de ejecutar la aplicación.

## Preparando el entorno 🔧

Es importante recordar que este proyecto no se encuentra en la nube, trabajará desde local.

Para empezar, cree la base de datos usando MySQL con el archivo .sql que encuetra en el repositorio.

Luego de esto, clone el repositorio en su computador:
```plain
git clone https://github.com/Lcastro98/Contact.git
```
Abra el archivo en Intellij IDEA Ultimate y con una nueva terminal instale las dependencias con el siguiente comando:
```plain
npm install
```
Una vez esten instaladas, corra la aplicación con el siguiente comando:
```plain
npm start
```
Por favor espere a que cargue todo, esto puedo tomar algo de tiempo.

## ¡A probarlo! 🚀

Puede crear, actualizar y borrar los contactos haciendo uso de Postman.

GET
```plain
localhost:8080/contacts
```
POST
```plain
localhost:8080/contact
```
DELETE
```plain
localhost:8080/contact/{id}
```
PUT
```plain
localhost:8080/contact/{id}
```
PATCH
```plain
localhost:8080/contact/name/{id}
```
PATCH
```plain
localhost:8080/contact/phone/{id}
```
PATCH
```plain
localhost:8080/contact/email/{id}
```
PATCH
```plain
localhost:8080/contact/dateBirth/{id}
```

## Front-end

Por favor, diríjase a la siguiente dirección para ver el front-end.

[contact-fe](https://github.com/Lcastro98/Contact-fe)

---
⌨️ con ❤️ por [Lorena Castro](https://github.com/Lcastro98) ✌

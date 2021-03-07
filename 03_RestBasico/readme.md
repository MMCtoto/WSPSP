HTTP
-
HTTP es posiblemente le protocolo de comunicación más importante de la historia de
internet. Es un protocolo el cual establece unas pautas para la comunicacion entre
dos dispositivos conectados en una red.

En la carpeta dibujos podemos encontrar ejemplos.

biblio:
https://developer.mozilla.org/es/docs/Web/HTTP/Overview
https://developer.mozilla.org/es/docs/Web/HTTP
https://es.wikipedia.org/wiki/Protocolo_de_transferencia_de_hipertexto

lista de tipos mime completa:
https://developer.mozilla.org/es/docs/Web/HTTP/Basics_of_HTTP/MIME_types/Common_types

Proyecto Springboot Rest
-
Este ejemplo es la creacion de un proyecto spring boot para hacer un servicio REST
En la carpeta "dibujos" tenemos las fotos del protocolo HTTP, ya que REST esta 
muy ligado al protocolo HTTP.

Para crear este proyecto debemos de crear un proyecto spring boot:

1) boton derecho sobre package explorer -> new -> Spring starter proyect

2) En la opciones debemos de cambiar lo siguiente y pulsar next:

	a) el nombre del proyecto
	b) elegir la version java que queramos (este caso 8)
	c) IMPORTANTE, empaquetar el proyecto en formato WAR
	d) podemos cambiar el paquete por defecto (en este caso com.restbasico)
	
3) En la siguiente pantalla debemos de elegir el starter web -> spring web

Al ser un proyecto web, spring automáticamente configura un tomcat donde se
desplegará nuestra app (esto aunque no lo creais, es la leche en vinagre, porque
configurar un tomcat puede llevar mucho trabajo, y spring boot me lo hace
automáticamente)

A partir de aqui debermos de dar de alta las clases que gestionen el servicio rest
en nuestro caso, las daremos de alta en el paquete "com.restbasico.controlador"

Si el puerto del tomcat da fallo podeis cambiarlo en 
"src/main/resources/applicatioin.properties"

Probar todos los metodos http
-
Para probar todos los verbos o metoso http necesitamos una app que nos lo permita
hacer, podemos utilizar POSTMAN
https://www.postman.com/downloads/

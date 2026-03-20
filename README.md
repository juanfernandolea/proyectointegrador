# Institución Universitaria Antonio José Camacho

## Facultad de Ingenierías  
### Tecnología en Sistemas de Información  

---

# PROYECTO DE GESTIÓN DESPACHO PARROQUIAL

**Juan Fernando Lenis Acosta**

**Programación II**  
**Ingeniería de Software II**

**Gabriel Pérez Moreno**  
**Leidy Milena Bustamante Salcedo**

**Santiago de Cali**  
**2026**

# INTRODUCCIÓN

En la actualidad, el uso de tecnologías de la información se ha convertido en una herramienta fundamental para la optimización de procesos en diferentes ámbitos, incluyendo el religioso. Las parroquias, como instituciones que gestionan gran cantidad de información, requieren sistemas que les permitan organizar y administrar sus datos de manera eficiente.

El presente proyecto propone el desarrollo de un sistema web para la gestión parroquial, el cual permitirá administrar información relacionada con las partidas sacramentales, las bóvedas de cementerio, el inventario y la agenda de misas. Esta solución busca reemplazar los métodos tradicionales basados en registros físicos, ofreciendo mayor seguridad, rapidez y accesibilidad en la consulta de la información.

# PLANTEAMIENTO

En la actualidad, muchas parroquias continúan gestionando su información mediante registros físicos, libros, carpetas, herramientas poco efectivas actualmente, lo que dificulta la organización, el acceso y la seguridad de los datos. Esta situación es especialmente evidente en el manejo de las partidas sacramentales, tales como bautismos, confirmaciones, matrimonios y defunciones, las cuales suelen almacenarse en libros que, con el tiempo, pueden deteriorarse o resultar difíciles de consultar.

Asimismo, procesos administrativos como la gestión de bóvedas en cementerios parroquiales, el control de inventarios y la programación de misas se realizan de manera manual o mediante sistemas no centralizados. Esto puede generar inconsistencias en la información, pérdida de datos, duplicidad de registros y dificultades en la planificación de actividades.

La falta de un sistema integrado limita la eficiencia en la atención a los fieles y en la administración de los recursos parroquiales, afectando directamente la organización interna de la institución.

En este contexto, surge la necesidad de implementar una solución tecnológica que permita centralizar la información y optimizar los procesos administrativos, garantizando mayor seguridad, accesibilidad y confiabilidad en los datos.

# OBJETIVOS

## Objetivo General

Desarrollar una aplicación web que permita gestionar de manera integral la información parroquial, facilitando el registro, consulta y administración de datos relacionados con las partidas sacramentales, la administración de bóvedas, el inventario y la agenda de misas.

## Objetivos Específicos

- Identificar y analizar los requerimientos del sistema con base en las necesidades del entorno parroquial.  
- Diseñar una base de datos estructurada que permita almacenar la información de manera organizada y segura.  
- Desarrollar módulos funcionales para la gestión de los distintos documentos eclesiales.  
- Garantizar la integridad y seguridad de la información mediante buenas prácticas de desarrollo.  
- Realizar pruebas funcionales que permitan verificar el correcto funcionamiento del sistema.  

# JUSTIFICACIÓN

El desarrollo del presente proyecto surge como respuesta a la necesidad de mejorar la gestión de la información en el entorno parroquial, donde actualmente muchos de los procesos administrativos se realizan de manera manual o mediante herramientas no integradas. Esta situación puede generar dificultades en la organización, acceso y seguridad de los datos.

La implementación de un sistema web permitirá optimizar la administración de las partidas sacramentales, facilitando su registro, consulta y conservación en formato digital. De esta manera, se reduce el riesgo de pérdida o deterioro de la información, garantizando mayor confiabilidad y disponibilidad de los datos.

Asimismo, el sistema contribuirá a mejorar la gestión de las bóvedas del cementerio parroquial, el control del inventario y la programación de las misas, permitiendo una administración más organizada y eficiente. Esto se traduce en una mejor atención a la comunidad y en un uso más adecuado de los recursos disponibles.

Desde el ámbito académico, este proyecto permite aplicar los conocimientos adquiridos en las áreas de ingeniería de software, bases de datos y desarrollo web, fortaleciendo las competencias técnicas y el aprendizaje práctico. Además, fomenta el uso de metodologías ágiles y buenas prácticas en el desarrollo de sistemas de información.

En conjunto, el proyecto no solo responde a una necesidad real, sino que también aporta una solución tecnológica viable que puede ser implementada en el contexto parroquial para mejorar sus procesos administrativos.

# MARCOS

## Marco Teórico

El presente proyecto se fundamenta en los principios de la ingeniería de software, disciplina que proporciona metodologías, técnicas y herramientas para el desarrollo de sistemas de información de manera estructurada y eficiente. En este sentido, se hace uso de metodologías ágiles que permiten una adaptación continua a los cambios durante el proceso de desarrollo.

Asimismo, se apoya en el uso de bases de datos relacionales, las cuales permiten almacenar, organizar y gestionar grandes volúmenes de información de manera estructurada, garantizando la integridad y consistencia de los datos.

Por otro lado, el desarrollo web constituye un elemento fundamental en este proyecto, ya que permite la creación de aplicaciones accesibles desde cualquier dispositivo con conexión a internet, facilitando la interacción de los usuarios con el sistema.

Finalmente, se consideran conceptos como el modelo cliente-servidor y las operaciones CRUD (Crear, Leer, Actualizar y Eliminar), los cuales son esenciales para la gestión de la información dentro del sistema.

## Marco de Referencia

El presente proyecto se desarrolla en el contexto de la transformación digital de las organizaciones, específicamente en el ámbito parroquial. En la actualidad, muchas parroquias continúan utilizando métodos tradicionales para la gestión de la información, como libros físicos y registros manuales, lo cual limita la eficiencia en los procesos administrativos.

En este sentido, la implementación de sistemas de información en entornos religiosos se ha convertido en una necesidad para mejorar la organización, el acceso y la seguridad de los datos. La digitalización de procesos como el registro de partidas sacramentales, la administración de bóvedas, el control de inventarios y la programación de misas permite optimizar la gestión parroquial y brindar un mejor servicio a la comunidad.

Este proyecto se enmarca dentro del uso de tecnologías web como herramienta para centralizar la información y facilitar su acceso en tiempo real, contribuyendo así a la modernización de los procesos administrativos en la parroquia.

# REQUERIMIENTOS

## Requerimientos Funcionales

- El sistema debe permitir el registro de partidas sacramentales:
  - Bautismo  
  - Confirmación  
  - Matrimonio  
  - Defunción  
- El sistema debe permitir la consulta, edición y eliminación de las partidas duplicadas.  
- El sistema debe gestionar la información de las bóvedas del cementerio parroquial, incluyendo su estado (disponible u ocupada).  
- El sistema debe permitir el registro y control del inventario parroquial.  
- El sistema debe permitir la creación, modificación y visualización de la agenda de misas.  
- El sistema debe permitir la interacción a través de una interfaz web amigable.  
- El sistema debe almacenar la información en una base de datos y permitir su consulta en tiempo real.  

## Requerimientos No Funcionales

- El sistema debe ser accesible a través de navegadores web.  
- La interfaz debe ser adaptable para dispositivos móviles, tabletas y computadores.  
- El sistema debe garantizar la seguridad de la información mediante control de acceso de usuarios.  
- La base de datos debe asegurar la integridad y consistencia de los datos.  
- El sistema debe tener un tiempo de respuesta adecuado.  
- El sistema debe ser fácil de usar, con una interfaz clara e intuitiva.  
- El sistema debe ser escalable para futuras mejoras.  

# APLICACIÓN DE METODOLOGÍA

Para el desarrollo del presente proyecto se utilizó una metodología ágil basada en Scrum, la cual permite organizar el trabajo de manera iterativa e incremental, facilitando la adaptación a cambios y la mejora continua del sistema durante su construcción.

## Análisis de Requerimientos

En esta fase inicial se realizó un análisis detallado del entorno eclesial, específicamente en la Parroquia La Inmaculada Concepción de Villagorgona, con el fin de identificar las necesidades del sistema.

Se estudiaron procesos como:

- Manejo de partidas sacramentales  
- Administración de bóvedas  
- Control de inventario  
- Programación de misas  

Se identificaron problemáticas como la desorganización de la información, dificultad de acceso y riesgo de pérdida de datos, como ocurrió en 1994 tras una inundación.

## Planificación

Se organizaron los requerimientos en sprints, priorizando:

- Registro de partidas sacramentales  
- Gestión de bóvedas  
- Inventario  
- Agenda de misas  

## Desarrollo Iterativo

Durante esta fase se desarrollaron progresivamente:

- Registro y consulta de partidas sacramentales  
- Administración de bóvedas  
- Gestión del inventario  
- Programación de misas  

## Revisión de Sprints

Se evaluaron las funcionalidades en cada sprint, corrigiendo errores y ajustando el sistema según los requerimientos.

## Entrega del Producto

Se espera como resultado una aplicación web funcional que permita gestionar la información parroquial de manera eficiente, lista para su implementación en un entorno real.


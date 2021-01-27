# Cours de systemes distribué N°1

## Definitions/Autres

sdkman : outil conçu pour faciliter l'installation d'une ou plusieurs versions de Java sous Linux.

curl : interface en ligne de commande, destinée à récupérer le contenu d'une ressource accessible par un réseau informatique. La ressource est désignée à l'aide d'une URL et doit être d'un type supporté par le logiciel.

- Language Compilé : code compilé avant d'être déployé (transformé en fichier binaire) (C, C++...)
- Langauge Interprété : code interprété pas à pas (python, javascript, php...)
- Language itnermédiaire : code compilé et interprété (java est compilé et ensuite interprété par la JVM)

## JAVA EE

Eclipse :
- Apache Tomcat v8.5
- dynamic web module version 3.1 (version de la servlet)

MVC sépare l'application en 3 parties :

- M pour Model : contient la logique de l'application, le modèle peut accéder à une BD relationnelle, XML ou des EJB. On y trouve aussi des classes métiers Java (font les calculs etc...)
- V pour View : c'est la partie chargée de la présentation: les JSP, du HTML, du XML, du Javascript..
- C pour Controler : gère la synchronisation entre la vue et le modèle, il réagit à l'action de l'utilisateur, met à jour le modèle et informe la vue des nouvelles modifications. En général le contrôleur est une servlet.

Pour la façon dont eclipse "range" les fichiers, [Cette image](https://user.oc-static.com/files/378001_379000/378689.png) est très explicite (openclassrooms).

Dans le dossier src on retrouve les servlets (controleurs) et les classes java métiers (modèle). Ensuite pour tout ce sui est web, donc les pages JSP, on les retrouves dans le dossier WEB-INF.
Dans ce même dossier on identifie le sous dossier lib pour les .jar et le fichier web.xml. Ce dernier permet de configurer le serveur d'application lors de son démarrage.

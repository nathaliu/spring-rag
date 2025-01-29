# spring-rag

Project generated with https://start.spring.io/

# Main steps for this exercise

# 08/01/2025

1) Créer un nouveau projet Github : spring-rag
2) Clone le projet en local

## Issue 1
3) Créer une nouvelle issue sur l'interface web avec pour titre et description : Create project
4) Créer une branch (feature/1-create-project) dans l'onglet issue et se mettre dessus 
5) Aller sur spring starter
Créer un projet avec H2 et spring web en dependencies + packaging jar et java version 23, group : fr.efrei 
6) build le projet avec ./gradlew clean build
7) changer sa version de java si erreur dans le build.gradle 
8) merge request

## Issue 2
1) Créer 2e issue : Create ci-cd pipeline for GitHub
2) Créer une branche suivant cette issue
3) Se placer sur la branche
4) Télécharger en ZIP : https://github.com/pierre-filliolaud/efrei-students
5) Prendre le repo ./Github et le placer à la racine du projet /spring-rag
6) Commit & Push 
7) Aller sur .github/workflows/build.yml
8) Commenter tout 'docker', mettre la bonne version de Java (Commenter tout 'test' si besoin)
9) Commit push les changements
10) Vérifier sur Github, dans Actions que le Workflow soit bien passé 

## Ajouter Dockerfile
1) Aller sur https://github.com/pierre-filliolaud/efrei-students/blob/main/Dockerfile et reprendre le fichier Dockerfile
2) Aller sur l'interface Github du projet
3) Aller dans Paramètre puis Secrets et variables > Actions > Repository secrets
4) Ajouter 2 clefs > DOCKER_PASSWORD & DOCKER_USERNAME
5) Commit push changes

## Lancer le site web
1) Ouvrir le projet sur un IDE
2) Créer 2 packages dans src/main/java/fr.efrei.spring_rag web/rest/
3) Créer une classe SampleRessource et mettre ⁠Ing-3 Apprentissage (promo 2025)⁠
4) Lancer SpringRagApplication
5) Update 'Document' spring-rag/src/main/java/fr/efrei/spring_rag/domain/Document.java

# 29/01/2024
## Kubernetes
1) Mettre à jour le build.yml



L'injection de dépendances dépendance par instanciation statique et dynamique:

Dans Cette partie de TP on va voir la notion d'un couplage faible"(application fermée à la modification et ouvert à l'extension) .

Tout d'abord on a crée des interfaces et des implémentations de ces interfaces. 

Partie1: Mise en oeuvre de l'injection des dépendances -Instanciation statique (couplage fort):

![s1](https://user-images.githubusercontent.com/102171913/162546732-b5ac11f8-9ec6-4d18-b5e6-2bd597c21a03.PNG)

![S2](https://user-images.githubusercontent.com/102171913/162546747-1065d0a2-5b78-45a1-9975-63250b784c82.PNG)

 l'injection des dépendances par instanciation dynamique pour cela on a créé un fichier text de configuration(config.txt) où on peut declarer les noms des classes qu'on 
 a va utiliser  et si on veut maintenir notre application on va changer seulement les noms sans toucher le code source.

![config version capteur](https://user-images.githubusercontent.com/102171913/162546873-a0c20aab-06a9-47c5-a1cd-b4f4eee2d60b.PNG)

l'execution donne:

![injection de dep d'une maniere dynamique](https://user-images.githubusercontent.com/102171913/162546862-70b76cda-898c-474b-ae26-2e11f3f2bdd3.PNG)

![config version base de donnes](https://user-images.githubusercontent.com/102171913/162546880-1cee8967-e7a3-4403-ba06-f25cc29f0321.PNG)

l'execution donne:

![versbasedonnees](https://user-images.githubusercontent.com/102171913/162547184-f16a739e-dced-43a2-b54e-21abb3cf4529.PNG)

![image](https://user-images.githubusercontent.com/102171913/162547282-542e89f2-d6be-4223-a5ac-f4b35c2380ef.png)

l'execution donne :

![version web service](https://user-images.githubusercontent.com/102171913/162547315-cf6ea57d-e600-4e3b-9e7a-d45a16951c4e.PNG)

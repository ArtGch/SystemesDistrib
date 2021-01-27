# MEMO GIT

## CONFIGURATION DE GIT
|                                              |                                     |
| -------------------------------------------- | ----------------------------------- |
| git config --global color.diff auto          | active la couleur                   |
| git config --global color.status auto        | active la couleur                   |
| git config --global color.branch auto        | active la couleur                   |
| git config --global user.name "votre_pseudo" | définit le nom                      |
| git config --global user.email moi@email.com | définit l'email                     |

|                                              |                                     |
| -------------------------------------------- | ----------------------------------- |
| vim ~/.gitconfig                             | edition du fichier de configuration |

## CREATION/CLONAGE DE DEPOT
| | |
| - | - |
| git init 	     | créer un dépôt |
| git clone https//... | cloner un dépôt |
| git init --bare      | créer un dépôt sur le serveur (uniquement le fichier .git) |

## COMMIT
| | |
| - | - |
git status          | indique les fichiers modifié récemment
git diff            | affiche toutes les modifications
git diff nomFichier | affiche toutes les modifications du fichier

| | |
| - | - |
git add nomfichier1 nomfichier2    | ajoute les fichiers à la liste du prochain commit
git commit -a                      | commit tous les fichiers (même ceux qui n'ont pas été git add)
git commit nomfichier1 nomfichier2 | indique les fichiers à commiter

## LOG ET ERREUR
| | |
| - | - |
git log        | historique des commits
git log -p     | historique des commits avec le détail des ligne ajoutées/retirées
git log --stat | historique des commits avec un détail mrésumé

| | |
| - | - |
git commit --amend | modifier le dernier message de commit
git reset HEAD^    | annuler le dernier commit et revient à l'avant-dernier commit
git reset HEAD^^   | annuler le dernier commit et revient à l'avant-avant-dernier commit

| | |
| - | - |
git reset --hard HEAD^              | annule le dernier commit ET les changements dans les fichiers
git checkout nomFichier             | restaurer le fichier tel qu'il était au dernier commit
git reset HEAD -- fichierASupprimer | annuler/supprimer un fichier avant commit

## PARTAGE DU TRAVAIL
| | |
| - | - |
git pull | télécharger les nouveautés depuis le serveur
git push | envoie les nouvelles modifications (commits) sur le serveur (! attention plus possible d'annuler !)

| | |
| - | - |
git revert 762cc4 | crée un commit inverse pour "annuler" un mauvais commit pusher

## BRANCHES
| | |
| - | - |
git branch                    | lister les branches
git branch nomNouvelleBranche | créer une nouvelle branche
git checkout nomBranche       | changer de branche

| | |
| - | - |
git merge nomBranche     | fusionner la branche "nomBranche" à la branche sur laquelle on se situe
git branch -d nomBranche | supprimer la branche "nomBranche" (avec vérification si merge fait)
git branch -D nomBranche | supprimer la branche "nomBranche" (! sans vérification !)

| | |
| - | - |
git stash       | garder les fichiers non commités de côté (pour pouvoir changer de branche proprement)
git stash apply | récupérer les changements mis de côté

| | |
| - | - |
git branch -r                                          | lister toutes les branches que le serveur connait
git branch --track branchelocale origin/brancheserveur | créer une branche locale qui sera connectée à la branche du serveur (origin = nomServeur)
git push origin origin:refs/heads/nom_nouvelle_branche | ajouter une nouvelle branche sur le serveur origin
git push origin :heads/nom_branche_a_supprimer         | supprimer une branche sur le serveur origin
git branch -r -d origin/nom_branche_a_supprimer        | supprimer une branche locale suite à la supression de la branche sur le serveur

## AUTRES
| | |
| - | - |
git tag NOMTAG IDCOMMIT | ajouter un tag sur un commit
git push --tags         | envoie le tag lors du push (sinon il n'est pas envoyé)
git tag -d nomTag       | supprimer un tag créé

| | |
| - | - |
git grep "TODO"    | rechercher tous les noms des fichiers qui contiennent le mot "TODO" (accepte les expressions régulières)
git grep -n "TODO" | indiquer les numéros de ligne qui contionnent le mot "TODO"

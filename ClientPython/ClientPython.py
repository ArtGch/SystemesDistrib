# !/usr/bin/python3
from tkinter import *
from zeep import Client

client = Client("http://localhost:8989/?wsdl")

def affichage():
    texteLabel.set(client.service.afficherProduits())

# Création de la fenêtre principale (main window)
Mafenetre = Tk()

texteLabel = StringVar()
texteLabel.set("Aucun produits !")

Mafenetre.title('Client Python')
Mafenetre.geometry('600x400+400+400')

# Création d'un widget Button (affichage des produits)
boutonAffichageProduits = Button(Mafenetre, text ='Afficher les produits', command = affichage)
boutonAffichageProduits.pack(side = LEFT, padx = 5, pady = 5)

# Création d'un widget Button (bouton Quitter)
BoutonQuitter = Button(Mafenetre, text ='Quitter', command = Mafenetre.destroy)
BoutonQuitter.pack(side = LEFT, padx = 5, pady = 5)

# Création d'un widget Label (texte 'Résultat -> x')
LabelResultat = Label(Mafenetre, textvariable = texteLabel, fg ='red', bg ='white')
LabelResultat.pack(side = LEFT, padx = 5, pady = 5)

Mafenetre.mainloop()

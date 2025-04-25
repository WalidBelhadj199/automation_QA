@verifierProduit @smoketest
  Feature: Vérifier tous les produits et la page de détails du produit

    Background: Préparer le navigateur et accéder à la page d'accueil
      Given que je lance le navigateur
      And je navigue vers "*********"
      Then la page d'accueil doit etre visible

      @recherche
      Scenario: verifier page tout les produits
        Given je clique sur le bouton Product
        Then Redirection vers la page des Produit et " ALL PRODUCTS " s affiche
        And Cliquez sur  Afficher le produit  du premier produit
        Then Redirection vers la page detail de produit et "Blue Top", "Category: Women > Tops","Rs. 500", "Availability: In Stock", "Condition: New", "Brand: Polo" sont affichés


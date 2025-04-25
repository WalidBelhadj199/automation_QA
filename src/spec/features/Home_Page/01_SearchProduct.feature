@rechercheProduit @smoketest
  Feature: recherche de produit
    Background: Préparer le navigateur et accéder à la page d'accueil
      Given que je lance le navigateur
      And je navigue vers "*********"
      Then la page d'accueil doit etre visible

      @chercherProduit
      Scenario: chercher un produit
        Given je clique sur bouton Product
        When je saisis un produit comme "Shirt"
        And je clique sur Rechercher
        And le produit "Shirt" ainsi les produits similaire doivent etre affichés
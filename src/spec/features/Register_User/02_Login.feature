@authentification @smoketest
Feature: Connexion avec des données valides

  Background: Préparer le navigateur et accéder à la page d'accueil
    Given que je lance le navigateur
    And je navigue vers "*********"
    Then la page d'accueil doit etre visible

    @login
  Scenario: Connexion et vérification de l'authentification
    When je clique sur le bouton Signup Login
    Then l'option " Login to your account" doit etre visible
    When je saisis l'adresse email "*****" et le mot de passe "*******"
    And je clique sur le bouton Connexion
    Then l'option "Logged in as Sarra" doit etr visible






@delete @smoketest
Feature: Supprimer un compte existant

  Background: Préparer le navigateur et accéder à la page d'accueil
    Given que je lance le navigateur
    And je navigue vers "http://automationexercise.com"
    Then la page d'accueil doit etre visible

  @delete
  Scenario: Suppression de compte
    When je clique sur  bouton  Signup Login
    Then l'option "Login to your account" doit etr visibl
    When je saisis ladresse email "*****" et le mot de passe "*****"
    And je clique sur le bouton  de Connexion
    Then loption "Logged in as walid" doit etre visible
    When je clique sur le bouton Supprimer le compte
    Then le message "COMPTE SUPPRIMÉ" doit etre visible
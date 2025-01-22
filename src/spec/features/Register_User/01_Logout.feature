@logout @smoketest
Feature: Déconnexion

  Background: Préparer le navigateur et accéder à la page d'accueil
    Given que je lance le navigateur
    And je navigue vers "http://automationexercise.com"
    Then la page d'accueil doit etre visible

  @logout
Scenario: Deconnexion
When je clique sur  bouton  SignupLogin
Then l option "Login to your account" doit etr visible
When je saisis l adresse email "*****" et le mot de passe "*****"
And je clique sur  bouton  de Connexion
Then l option "Logged in as walid" doit etre visible
When je clique sur le bouton Logout
Then la page daccueil doit etre visible


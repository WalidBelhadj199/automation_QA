@connexion @smoketest
Feature: connexion
  ETQ utilisateur je souhaite me connecter sur l'application  Automation Exercise

  @connexion
  Scenario: Je souhaite me connecter avec des données valides
    Given  Je me connecte sur l'application Automation Exercise
    When je clique sur bouton Signup/Login
    And Je saisis l adresse mail "belhadjwalid782@gmail.com"
    And Je saisis le mot de passe "Zakzakzak1402!"
    And Je clique sur le bouton Login
    Then Je suis redirigé vers la page d'accueil et "Logged in as walid" s affiche

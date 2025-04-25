@authentification2 @smoketest
  Feature: connexion avec email et MDP
    Background: Préparer le navigateur et accéder à la page d'accueil
      Given que je lance le navigateur
      When je navigue vers "*********"
      Then la page d'accueil doit etre visible

      @incorrectEmailMDP
      Scenario: connexion avec email et MDP incorrects
      When je clique sur le bouton Signup/login
      Then  " Login to your account" doit etr visibl
      When je saisis l'adresse email "*****" et un mot de passe "******"
      And je clique sur le bouton Login
      Then une message "Your email or password is incorrect!" doit etre affiché

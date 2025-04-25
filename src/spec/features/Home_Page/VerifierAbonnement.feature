@abonnement @smoketest
  Feature: Vérifier l'abonnement sur la page d'accueil

    Background: Préparer le navigateur et accéder à la page d'accueil
      Given que je lance le navigateur
      And je navigue vers "*********"
      Then la page d'accueil doit etre visible

      @verifierAbonnAcceuil
      Scenario: Vérifier l'abonnement sur la page d'accueil
        Given défiler jusqu'au pied de page
        When verfier le texte "SUBSCRIPTION"
        And saisir lemail suivant "*****" et cliquer sur bouton fléché
        Then le message "You have been successfully subscribed!" doit etre affiché

    @verifierAbonnPanier
    Scenario: Vérifier l'abonnement sur la page Panier

        Given cliquer sur bouton Panier
        When défiler jusqu au pied de page
        And verfier texte "SUBSCRIPTION"
        And saisir email suivant "*****" et cliquer sur le bouton fléché
        Then un message "You have been successfully subscribed!" doit etre affiché
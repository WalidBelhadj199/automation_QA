@gestionPanier @smoktest
  Feature: gestion produit dans le panier

    Background: Préparer le navigateur et accéder à la page d'accueil
      Given que je lance le navigateur
      And je navigue vers "*********"
      Then la page d'accueil doit etre visible

      @addProduct
      Scenario: ajouter des produit au panier
        Given cliquer sur bouton Produit
        When Passez la souris sur le premier produit et cliquez sur Add  to cart
        And  Cliquez sur le bouton Continue Shopping
        And Passez la souris sur le deuxième produit et cliquez sur Add to cart
        And Cliquez sur le bouton View cart
        And Vérifiez que les deux produits "Blue Top" et "Men Tshirt" sont ajoutés au panier
        And Verifier que le premier produit saffiche avec un prix "500" , qté "1" et un total "500"
        And Verifier que le deuxième produit saffiche avec un prix "400" , qté "1" et un total "400"

        @Increasequantity
        Scenario: Increase quantity to 4
          Given  Click View Product for the second product
          When  Verify product name is "Men Tshirt" and product price is "Rs. 400"
          And Increase quantity to "4"
          And Click Add to cart button
          And Click Continue shopping
          Then Verify that product is displayed in cart page with  Quantity is "4"



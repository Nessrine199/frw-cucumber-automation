Feature: Je verifie la page d authentification
En tant que utilisateur je soughaite me connecter sur le site Mercury 

  @connexion
  Scenario: Je verifie la page d authentification
    Given Je me connecte à l application Mercury
    When Je saisie le username "Test"
    When Je saisie le password "Test"
    When Je clique sur le bouton Submit
    Then Je me redirige vers la page home "Login Successfully"
    
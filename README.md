# Desafio POO - iPhone

## Diagrama UML

```mermaid
classDiagram
    direction LR

    class ReprodutorMusical {
      <<interface>>
      +tocar() void
      +pausar() void
      +selecionarMusica(musica: String) void
    }

    class AparelhoTelefonico {
      <<interface>>
      +ligar(numero: String) void
      +atender() void
      +iniciarCorreioVoz() void
    }

    class NavegadorInternet {
      <<interface>>
      +exibirPagina(url: String) void
      +adicionarNovaAba() void
      +atualizarPagina() void
    }

    class Iphone {
      +tocar() void
      +pausar() void
      +selecionarMusica(musica: String) void
      +ligar(numero: String) void
      +atender() void
      +iniciarCorreioVoz() void
      +exibirPagina(url: String) void
      +adicionarNovaAba() void
      +atualizarPagina() void
    }

    Iphone ..|> ReprodutorMusical
    Iphone ..|> AparelhoTelefonico
    Iphone ..|> NavegadorInternet
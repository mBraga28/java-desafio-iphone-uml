# Desafio de Projeto - Modelando o iPhone com UML: Funções de Músicas, Chamadas e Internet

## Descrição

Este projeto é parte do curso de Java Básico da DIO e tem como objetivo modelar e implementar as funcionalidades básicas de um iPhone utilizando Programação Orientada a Objetos (POO). As funcionalidades incluem um Reprodutor Musical, um Aparelho Telefônico e um Navegador de Internet.

## Funcionalidades

1. **Reprodutor Musical**
    - Métodos: `play()`, `pause()`, `selectMusic(String music)`

2. **Aparelho Telefônico**
    - Métodos: `call(String number)`, `answer()`, `startVoicemail()`

3. **Navegador de Internet**
    - Métodos: `displayPage(String url)`, `addNewTab()`, `refreshPage()`

## Diagrama UML

```mermaid
classDiagram
    class MusicPlayer {
        <<interface>>
        +play()
        +pause()
        +selectMusic(String music)
    }

    class Telephone {
        <<interface>>
        +call(String number)
        +answer()
        +startVoicemail()
    }

    class InternetBrowser {
        <<interface>>
        +displayPage(String url)
        +addNewTab()
        +refreshPage()
    }

    class iPhone {
    }

    iPhone ..|> MusicPlayer
    iPhone ..|> Telephone
    iPhone ..|> InternetBrowser

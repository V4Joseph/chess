# ♕ BYU CS 240 Chess

This project demonstrates mastery of proper software design, client/server architecture, networking using HTTP and WebSocket, database persistence, unit testing, serialization, and security.

## 10k Architecture Overview

The application implements a multiplayer chess server and a command line chess client.

[![Sequence Diagram](10k-architecture.png)](https://sequencediagram.org/index.html#initialData=C4S2BsFMAIGEAtIGckCh0AcCGAnUBjEbAO2DnBElIEZVs8RCSzYKrgAmO3AorU6AGVIOAG4jUAEyzAsAIyxIYAERnzFkdKgrFIuaKlaUa0ALQA+ISPE4AXNABWAexDFoAcywBbTcLEizS1VZBSVbbVc9HGgnADNYiN19QzZSDkCrfztHFzdPH1Q-Gwzg9TDEqJj4iuSjdmoMopF7LywAaxgvJ3FC6wCLaFLQyHCdSriEseSm6NMBurT7AFcMaWAYOSdcSRTjTka+7NaO6C6emZK1YdHI-Qma6N6ss3nU4Gpl1ZkNrZwdhfeByy9hwyBA7mIT2KAyGGhuSWi9wuc0sAI49nyMG6ElQQA)

## Modules

The application has three modules.

- **Client**: The command line program used to play a game of chess over the network.
- **Server**: The command line program that listens for network requests from the client and manages users and games.
- **Shared**: Code that is used by both the client and the server. This includes the rules of chess and tracking the state of a game.

## Starter Code

As you create your chess application you will move through specific phases of development. This starts with implementing the moves of chess and finishes with sending game moves over the network between your client and server. You will start each phase by copying course provided [starter-code](starter-code/) for that phase into the source code of the project. Do not copy a phases' starter code before you are ready to begin work on that phase.

## IntelliJ Support

Open the project directory in IntelliJ in order to develop, run, and debug your code using an IDE.

## Maven Support

You can use the following commands to build, test, package, and run your code.

| Command                    | Description                                     |
| -------------------------- | ----------------------------------------------- |
| `mvn compile`              | Builds the code                                 |
| `mvn package`              | Run the tests and build an Uber jar file        |
| `mvn package -DskipTests`  | Build an Uber jar file                          |
| `mvn install`              | Installs the packages into the local repository |
| `mvn test`                 | Run all the tests                               |
| `mvn -pl shared test`      | Run all the shared tests                        |
| `mvn -pl client exec:java` | Build and run the client `Main`                 |
| `mvn -pl server exec:java` | Build and run the server `Main`                 |

These commands are configured by the `pom.xml` (Project Object Model) files. There is a POM file in the root of the project, and one in each of the modules. The root POM defines any global dependencies and references the module POM files.

## Running the program using Java

Once you have compiled your project into an uber jar, you can execute it with the following command.

```sh
java -jar client/target/client-jar-with-dependencies.jar

♕ 240 Chess Client: chess.ChessPiece@7852e922
```

## Sequence Diagram URL:
https://sequencediagram.org/index.html?presentationMode=readOnly#initialData=IYYwLg9gTgBAwgGwJYFMB2YBQAHYUxIhK4YwDKKUAbpTngUSWDABLBoAmCtu+hx7ZhWqEUdPo0EwAIsDDAAgiBAoAzqswc5wAEbBVKGBx2ZM6MFACeq3ETQBzGAAYAdAE5M9qBACu2GADEaMBUljAASij2SKoWckgQaIEA7gAWSGBiiKikALQAfOSUNFAAXDAA2gAKAPJkACoAujAA9D4GUAA6aADeAETtlMEAtih9pX0wfQA0U7jqydAc45MzUyjDwEgIK1MAvpjCJTAFrOxclOX9g1AjYxNTs33zqotQyw9rfRtbO58HbE43FgpyOonKUCiMUyUAAFJForFKJEAI4+NRgACUh2KohOhVk8iUKnU5XsKDAAFUOrCbndsYTFMo1Kp8UYdKUAGJITgwamURkwHRhOnAUaYRnElknUG4lTlNA+BAIHEiFRsyXM0kgSFyFD8uE3RkM7RS9Rs4ylBQcDh8jqM1VUPGnTUk1SlHUoPUKHxgVKw4C+1LGiWmrWs06W622n1+h1g9W5U6Ai5lCJQpFQSKqJVYFPAmWFI6XGDXDp3SblVZPQN++oQADW6ErU32jsohfgyHM5QATE4nN0y0MxWMYFXHlNa6l6020C3Vgd0BxTF5fP4AtB2OSYAAZCDRJIBNIZLLdvJF4ol6p1JqtAzqBJoIei0azF5vDgHYsgwr5ks9K+KDvvorxLAC5wFrKaooOUCAHjysL7oeqLorE2IJoYLphm6ZIUgatLlqOJpEuGFoctyvIGoKwowEBoakW6naYeU1HaI6ojYYxLLlJ63pBoRI6jCRTJMZGHIwNOs7oBxibJpBJbITy2a5pg-4gtBJRXEBsxSY26DfleGmFNkPYwP2g69DpklBtJaBLpwq7eH4gReCg6B7gevjMMe6SZJgpkXkU1DXtIACiu5hfUYXNC0D6qE+3R6XO7ZQPJQIlslMnqQULEwPB9jeUhXm+qhGIYXKKAFK6PEwOSYCxv6WVoCJZoRvklowAA4lFNlxuxxidjVpJ9cG7HDRGmngqN8aVRqOG1SA3B4I1Aa2fpLWyVh6WpuUyHeSpCB5gpxnBVppaGSFaUFIFYB9gOQ4HGYjmeM5G6Qrau7Qt1o6sr5p4BeezCadePV3i09ijkl60pT+bLqeUzVqSdbJ5cgsRIdCZXoVt1ULSN9Wrc1rXhgUnVgzNA06Em+QTYjQYOhNNN5dOs0wfN3EjejYBdb9DGidK4nlBTFSQ6MjKNJo1N45z7qVGLKAS-zbXM5V5Si6OSuYTTCNfbEh3HRl135D+VxTArqjjJU-QKwAktIVsAIy9gAzAALE8J6ZAaFYTF8OgIKADY+6OKxfArAByo5+3sMCNJdJQ07d92WT05u-VbFQ26O9tO67HtTF7+pEaMYdPAHQch6XftPJH0d9H0sfx89K6veugTYD4UDYNw8C6pkP2jCkflnjkwOXld6u1A0sUK9DdYbUOdejAnlAFAjo12Uvo5RyvyNG7laswHxmSwnA-coLzozY1iuO0-jcuEwJxPK6THUchTrPsdr9+y7xF9XxQLCZeKASZiUKJ1aMg9Fbf0qjrE65Rz5ekyIAg2+9Uyq0nqWdOox7blGdu7RuqUk5A1KBZIcOCUB4JgAQt2RCW5OXbgESwKBlQQGSDAAAUhAHk0DAgVxAA2QGY9UZGSnpScGc9ggw3QEOHuwAWFQDgBAeCUBZh22kKvNK+QEbNTkYHRRyjVHqJzpo9BwJD4wXKAAKx4WgWE3CeSoJQGicqd86Z1QpETGRm0mbv2Fr1L+8gpY0w8UE4A7iH54R5qOYBpiwEsjJhJCmCsHTGFCVEuqmtYEwRlgLUkfgtAoNiRoiquT14IMcWgZxOYjrmLXpY86PQtEkLHinR6DC24uQCF4BRXYvSwGANgHuhB4iJGHgDW6oisEVHCpFaKsVjDEJ0Qgi69TtEsWaZEv+x9lpwkQAMm+CT1BJPKHMqKYV2SvzdJgp08p+l4DQdrCpRsrgQQPo0y4WyfytLMuQ3oDkVxAA

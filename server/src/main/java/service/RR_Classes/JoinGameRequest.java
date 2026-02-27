package service.RR_Classes;

import chess.ChessGame;

public record JoinGameRequest(String authToken, String color, int gameID) {
}

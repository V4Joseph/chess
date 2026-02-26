package dataaccess;

import model.GameData;

import java.util.Collection;
import java.util.HashMap;

public interface GameDataAccess {
    GameData createGame(GameData gameData) throws DataAccessException;
    GameData getGame(int GameID) throws DataAccessException;
    Collection<GameData> listGames() throws DataAccessException;
    void updateGame(int GameID) throws DataAccessException;
    void clearGames() throws DataAccessException;
}

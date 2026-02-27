package service;

import dataaccess.AuthDataAccess;
import dataaccess.DataAccessException;
import dataaccess.UserDataAccess;
import service.RR_Classes.*;

public class UserService {
    private final UserDataAccess userDataAccess;
    private final AuthDataAccess authDataAccess;

    public UserService(UserDataAccess userDataAccess,
                       AuthDataAccess authDataAccess) {
        this.userDataAccess = userDataAccess;
        this.authDataAccess = authDataAccess;
    }

    public RegisterResult register(RegisterRequest registerRequest) {

    }
    public LoginResult login(LoginRequest loginRequest) {

    }

    public void logout(LogoutRequest logoutRequest) throws DataAccessException {
        authDataAccess.deleteAuth(logoutRequest.authToken());
    }


}

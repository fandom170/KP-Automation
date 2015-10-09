package Lesson4Pages.ApplictionEntities;


import Lesson4Pages.Logic.Player;

public class PlayerBuilder {

    private String nameOfPlayer;
    private String passwordOfPlayer;
    private String emailOfPlayer;
    private String firstNamePlayer;
    private String lastNamePlayer;
    private String cityPlayer;
    private String phonePlayer;
    private String realBalancePlayer;
    private String funBalancePlayer;
    private String bonusBalancePlayer;
    private String loyaltyBalancePlayer;


    public PlayerBuilder() {
    }

    public PlayerBuilder withNameOfPlayer(String nameOfPlayer) {
        this.nameOfPlayer = nameOfPlayer;
        return this;
    }

    public PlayerBuilder withEmailOfPlayer(String emailOfPlayer) {
        this.emailOfPlayer = emailOfPlayer;
        return this;
    }

    public PlayerBuilder withPasswordOfPlayer(String passwordOfPlayer) {
        this.passwordOfPlayer = passwordOfPlayer;
        return this;
    }

    public PlayerBuilder withFirstNamePlayer(String firstNamePlayer) {
        this.firstNamePlayer = firstNamePlayer;
        return this;
    }

    public PlayerBuilder withLastNamePlayer(String lastNamePlayer) {
        this.lastNamePlayer = lastNamePlayer;
        return this;
    }

    public PlayerBuilder withCityPlayer(String cityPlayer) {
        this.cityPlayer = cityPlayer;
        return this;
    }

    public PlayerBuilder withPhonePlayer(String phonePlayer) {
        this.phonePlayer = phonePlayer;
        return this;
    }

    public PlayerBuilder withRealAmount(String realBalancePlayer) {
        this.nameOfPlayer = nameOfPlayer;
        return this;
    }

    public PlayerBuilder withFunAmount(String funBalancePlayer) {
        this.nameOfPlayer = nameOfPlayer;
        return this;
    }

    public PlayerBuilder withBonusAmount(String bonusBalancePlayer) {
        this.nameOfPlayer = nameOfPlayer;
        return this;
    }

    public PlayerBuilder withLoyaltyAmount(String loyaltyBalancePlayer) {
        this.nameOfPlayer = nameOfPlayer;
        return this;
    }



    public Player build() {
        return new Player(nameOfPlayer, passwordOfPlayer, emailOfPlayer, firstNamePlayer, lastNamePlayer,
                cityPlayer, phonePlayer, realBalancePlayer, funBalancePlayer, bonusBalancePlayer,
                loyaltyBalancePlayer);
    }
}



   /* public PlayerBuilder inUserRole() {
        this.role = "ROLE_USER";
        return this;
    }

    public PlayerBuilder inAdminRole() {
        this.role = "ROLE_ADMIN";
        return this;
    }

    public PlayerBuilder inRole(String role) {
        this.role = role;
        return this;
    }

    public PlayerBuilder but() {
        return PlayerBuilder
                .aUser()
                .inRole(role)
                .withName(name)
                .withPassword(password)
                .withUsername(username);
    }

    public User build() {
        return new User(name, username, password, role);
    }*/


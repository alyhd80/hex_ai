package models;

public class game_turn {

    boolean user_starter;
    boolean user_trun;

    public void setUser_starter(boolean user_starter) {
        this.user_starter = user_starter;
    }

    public boolean isUser_starter() {
        return user_starter;
    }

    public void setUser_trun(boolean user_trun) {
        this.user_trun = user_trun;
    }

    public boolean isUser_trun() {
        return user_trun;
    }
}

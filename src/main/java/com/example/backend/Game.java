package com.example.backend;

public class Game {
    String Game_ID;
    String Gamename;
    String platforms;
    String genre;
    String modes;
    String release_date;
    String about;

    public String getGameId(){ return Game_ID;};
    public void setGameID(String Game_ID){ this.Game_ID = Game_ID;}

    public String getGameName(){ return Gamename;};
    public void setGameName(String Gamename){ this.Gamename = Gamename;}

    
    public String getPlatforms(){ return platforms;};
    public void setPlatforms(String platforms){ this.platforms = platforms;}

    public String getGenre(){ return genre;};
    public void setGenre(String genre){ this.genre = genre;}

    public String getModes(){ return modes;};
    public void setModes(String modes){ this.modes = modes;}
    
    public String getReleaseDate(){ return release_date;};
    public void setReleaseDate(String release_date){ this.release_date = release_date;}

    public String getAbout(){ return about;};
    public void setAbout(String about){ this.about = about;}
    
}

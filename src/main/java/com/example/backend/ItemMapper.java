package com.example.backend;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class ItemMapper implements RowMapper {
    
    @Override
    public Game mapRow(ResultSet rs, int rowNum) throws SQLException{
        Game item = new Game();
        item.setGameID(rs.getString("game_id"));
        item.setGameName(rs.getString("game_name"));
        item.setPlatforms(rs.getString("platforms"));
        item.setGenre(rs.getString("genre"));
        item.setModes(rs.getString("modes"));
        item.setReleaseDate(rs.getString("release_date"));
        item.setAbout(rs.getString("about_game"));
        return item;
    }
}
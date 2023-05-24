package com.example.backend;

import java.util.List;
import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public class ItemJdbcTemplate implements ItemDAO{
    DataSource dataSource;
    JdbcTemplate myTemplate;

    public void setDataSource(DataSource dataSource){
        this.dataSource = dataSource;
        this.myTemplate = new JdbcTemplate((dataSource));
    }

    public List<Game> allGames(){
        String fetchItems = "SELECT * FROM `sys`.`all_items`";
        List<Game> items = myTemplate.query(fetchItems, new ItemMapper());
        return items;
    }
}
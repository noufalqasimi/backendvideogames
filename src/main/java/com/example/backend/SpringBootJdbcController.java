package com.example.backend;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;



@RestController 
@CrossOrigin(origins = "*")  
public class SpringBootJdbcController { 

    @Autowired  
            JdbcTemplate jdbc; 

    @RequestMapping( path="/AddReview", method = RequestMethod.POST)
    public String storeData(@RequestBody String request) throws IOException{
            System.out.print(request);
            
            ObjectMapper myMapper = new ObjectMapper();
            JsonNode extractedData = myMapper.readTree(request);

            String name = extractedData.get("username").asText();
            String review = extractedData.get("reviewContent").asText();

            System.out.println(name);
            System.out.println(review);

            // replace with your table query
            jdbc.execute("INSERT INTO `sys`.`gamesreviews` (`name`, `rating_comment`) VALUES ('"+name+"', '"+review+"')");
            return"data inserted Successfully";  
        }
}
    // ObjectMapper mapper = new ObjectMapper();
            // JsonNode extractedData = mapper.readTree(request);
            // String username = extractedData.get("username").asText();
            // System.out.print(username);


    // @Autowired  
    // JdbcTemplate jdbc;  
package com.example.intranet.persistence;

import com.example.intranet.entities.User;

import java.util.HashMap;
import java.util.Map;

public class UserMapper {

    private static Map<String,User> userMap= new HashMap<>();


    //put en masse users ind i hashmap
    public static void populateUserMap(){

        if(userMap.isEmpty()) {
            userMap.put("ole", new User("ole", "1234", "user"));
            userMap.put("benny", new User("benny", "1234", "admin"));
            userMap.put("rosa", new User("rosa", "1234", "admin"));
        }
    }

    public static boolean isLoginValid(String login,String password){
        User user = userMap.get(login);

       if(user!=null) {

           return user.getPassword().equals(password);
       }
       return false;
    }


    public static User getUserByLogin(String login){

        return userMap.get(login);
    }


}

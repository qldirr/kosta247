package com.example.restfulwebservice2.user;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

@Service
public class UserService {
    private static List<User> users = new ArrayList<>();
    private static int userCounts = 3;

    static {
        users.add(new User(1, "홍길동", new Date(), "pass1", "701010-1111111"));
        users.add(new User(2, "김길동", new Date(), "pass2", "801010-1111111"));
        users.add(new User(3, "조길동", new Date(), "pass3", "901010-1111111"));
    }

    public List<User> findAll(){
        return users;
    }

    public User findOne(int id){
        for(User user : users){
            if(user.getId() == id){
                return user;
            }
        }

        return null;
    }

    public User save(User user){
        if(user.getId() == null){
            user.setId(++userCounts);
        }
        users.add(user);

        return user;
    }

    public User deleteById(int id){
        Iterator<User> iterator = users.iterator();

        while(iterator.hasNext()){
            User user = iterator.next();

            if(user.getId() == id){
                iterator.remove();
                return user;
            }
        }
        return null;
    }

}




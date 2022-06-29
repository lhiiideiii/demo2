package com.lh.contoller;


import com.lh.dao.userdao;
import com.lh.domain.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;


@RestController
@RequestMapping("/users")
public class usercontroller {


    @Autowired
    private userdao userdao;


    @GetMapping( "/{id}")
    String getByid(@PathVariable  Integer id) {
        user user = userdao.selectById(id);
        System.out.println(user);
        return "user dao  selectbyid";
    }
     @GetMapping
     String getall(){
        List<user> users =userdao.selectList(null);
         System.out.println(users);
         return "user dao  selectlist ";
        }
}


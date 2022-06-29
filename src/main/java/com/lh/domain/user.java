package com.lh.domain;


import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("tb_user")
public class user {

    private Integer id;
    private String username;
    private String password;


}

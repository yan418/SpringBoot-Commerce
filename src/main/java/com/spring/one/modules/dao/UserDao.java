package com.spring.one.modules.dao;

import com.spring.one.modules.entities.Provider;
import com.spring.one.modules.entities.User;
import org.apache.ibatis.annotations.Param;

import javax.websocket.server.PathParam;
import java.util.List;

public interface UserDao {

    List<User> getUser(String username);

    User getUserById(Integer pid);

    int addUser(User user);

    int updateUser(User user);

    int deleteUserByPid(Integer pid);

    String selectPassword(String username);

    int updatePassword(@Param("old") String old, @Param("news") String news, @Param("name") String name);
}

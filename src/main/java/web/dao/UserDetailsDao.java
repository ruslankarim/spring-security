package web.dao;


import web.model.User;

public interface UserDetailsDao {
  User findUserByUsername(String username);
}

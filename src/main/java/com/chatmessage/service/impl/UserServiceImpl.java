package com.chatmessage.service.impl;

import com.chatmessage.model.Users;
import com.chatmessage.repository.UserRepository;
import com.chatmessage.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * USER SERVICE IMPLEMENTATION CLASS
 */


@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    /** SHOW ALL USERS ADDED
     * This methos shows all users that are present in the MonngoDB
     *
     * @return {List<Users>} all users that are added to the MongoDB
     */
    @Override
    public List<Users> getAllUsers() { return this.userRepository.findAll(); }

    /** ADD ONE USER TO THE DATABASE
     * This method adds a user to the MongoDB
     * @param {User} user
     *
     */
    @Override
    public Users addUser(Users user) { userRepository.save(user); return user; }

    /** ADD MULTIPLE USERS TO THE DATABASE
     * This method adds multiple user to the MongoDB
     * @param {List<User>}
     *
     */
    @Override
    public List<Users> addManyUser(List<Users> users) { return userRepository.saveAll(users); }

    /** This method deletes all users from the MongoDB
     * @param
     *
     */
    @Override
    public void deleteAllUsers() {
        userRepository.deleteAll();
    }

    /** This method deletes a user to the MongoDB
     * @param {User}
     *
     */


    @Override
    public void deleteUserById(String user) { userRepository.deleteById(user); }

    @Override
    public Users findUserById(String user) { return userRepository.findUsersById(user); }


}

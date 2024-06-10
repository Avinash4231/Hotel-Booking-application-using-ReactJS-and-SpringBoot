package com.avin.HotelBookingApplication.service;

import java.util.List;

import com.avin.HotelBookingApplication.model.User;



public interface IUserService {
    User registerUser(User user);
    List<User> getUsers();
    void deleteUser(String email);
    User getUser(String email);
}

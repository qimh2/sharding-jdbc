package com.cxytiandi.sharding.service;

import java.util.List;

import com.cxytiandi.sharding.po.LouDong;
import com.cxytiandi.sharding.po.User;
import com.cxytiandi.sharding.repository.LouDongRepository;
import com.cxytiandi.sharding.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

public interface LouDongService {

	List<LouDong> list();
	
	Long addLouDong(LouDong louDong);

    @Service
    class LouDongServiceImpl implements LouDongService {

        @Autowired
        private LouDongRepository louDongRepository;

        @Override
        public List<LouDong> list() {
            return louDongRepository.list();
        }

        @Override
        public Long addLouDong(LouDong louDong) {
            return louDongRepository.addLouDong(louDong);
        }

    }

    @Service
    class UserServiceImpl implements UserService {

        @Autowired
        private UserRepository userRepository;

        public List<User> list() {
            return userRepository.list();
        }

        public Long add(User user) {
            return userRepository.addUser(user);
        }

        @Override
        public User findById(Long id) {
            return userRepository.findById(id);
        }

        @Override
        public User findByName(String name) {
            return userRepository.findByName(name);
        }

    }
}

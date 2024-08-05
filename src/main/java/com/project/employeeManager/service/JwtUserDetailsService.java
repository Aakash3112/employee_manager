//package com.project.employeeManager.service;
//import java.util.ArrayList;
//import java.util.Optional;
//
//import com.project.employeeManager.entity.Users;
//import com.project.employeeManager.repository.UserEmployeeRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//@Service
//public class JwtUserDetailsService implements UserDetailsService {
//
//   @Autowired
//   UserEmployeeRepository userEmployeeRepository;
//   @Override
//   public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//      Optional<Users> usersOptional = userEmployeeRepository.findByUsername(username);
//      if (usersOptional.isPresent()) {
//         Users users =usersOptional.get();
//         return new User(users.getUsername(), users.getPassword(), new ArrayList<>());
//      } else {
//         throw new UsernameNotFoundException("User not found with username: " + username);
//      }
//   }
//}
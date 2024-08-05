//package com.project.employeeManager.controller;
//
//import com.project.employeeManager.service.JwtUserDetailsService;
//import com.project.employeeManager.config.JwtUtil;
//import com.project.employeeManager.entity.Users;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.authentication.BadCredentialsException;
//import org.springframework.security.authentication.DisabledException;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@CrossOrigin
//public class JwtController {
//    @Autowired
//    private JwtUserDetailsService userDetailsService;
//    @Autowired
//    private AuthenticationManager authenticationManager;
//    @Autowired
//    private JwtUtil jwtUtil;
//
//    @PostMapping("/login")
//    public ResponseEntity<String> createToken(@RequestBody Users request) throws Exception {
//        try {
//            authenticationManager.authenticate(
//                    new UsernamePasswordAuthenticationToken(request.getUsername(),
//                            request.getPassword())
//            );
//        } catch (DisabledException e) {
//            throw new Exception("USER_DISABLED", e);
//        } catch (BadCredentialsException e) {
//            throw new Exception("INVALID_CREDENTIALS", e);
//        }
//        final UserDetails userDetails = userDetailsService.loadUserByUsername(request.getUsername());
//        final String jwtToken = jwtUtil.generateJwtToken(userDetails);
//        return new ResponseEntity<>(jwtToken, HttpStatus.OK);
//    }
//}
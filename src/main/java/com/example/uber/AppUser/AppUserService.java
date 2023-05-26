//package com.example.uber.AppUser;
//
//import lombok.AllArgsConstructor;
//import org.springframework.boot.autoconfigure.security.servlet.UserDetailsServiceAutoConfiguration;
//import org.springframework.stereotype.Service;
//
//@Service
//@AllArgsConstructor
//public class AppUserService implements UserDetailsServiceAutoConfiguration {
//    private final AppUserRepository appUserRepository;
//    private final static  String  USER_NOT_FOUND_MSG=
//            "user with email %s not found";
//    @Override
//    public UserDetails loadUserByUsername(String s)
//            throws  UsernameNotFoundException{
//        return appUserRepository.findByEmail(email)
//                .orElseThrow(() -> new  UsernameNotFoundException(String.format(USER_NOT_FOUND_MSG, email)));
//
//    }
//
//
//}

//package com.example.uber.AppUser;
//
//import com.example.uber.Services.UserService;
//import com.sun.jdi.PrimitiveValue;
//import lombok.*;
//import org.springframework.data.annotation.Id;
//import org.springframework.data.mongodb.core.mapping.Document;
//
//import java.util.Collections;
//@Getter
//@Setter
//@Document
//@EqualsAndHashCode
//@NoArgsConstructor
//public class AppUser implements UserDetails{
//
//    @Id
//        @SequenceGenerator(
//            name = "student_sequence",
//            sequenceName = "student_sequence",
//            allocationSize = 1
//    )
//    @GeneratedValue(
//            strategy = GenerationType.SEQUENCE
//            generator = "student_sequence"
//   )
//    private Long id;
//    private String name;
//    private String Username;
//    private String email;
//    private String password;
//    @Enumerated(EnumType.STRING)
//    private AppUser appUserRole;
//    private boolean locked;
//    private boolean enabled;
//
//
//    public AppUser(String name,String username,
//                   String email,String password,
//                   AppUser appUserRole,
//                   boolean locked, boolean enabled){
//        this.name = name;
//        this.Username = username;
//        this.email = email;
//        this.password = password;
//        this.appUserRole = appUserRole;
//        this.locked = locked;
//        this.enabled =enabled;
//    }
//
//    @Override
//    public Collection<? extends GrantedAuthority> getAuthority(){
//       SimpleGrantedAuthority authority =
//               new SimpleGrantedAuthority(appUserRole.name())
//        return Collection.singletonList(authority);
//    }
//
//    @Override
//    public String getPassword(){
//        return password;
//    }
//    @Override
//    public String getUsername(){
//        return username;
//
//    }
//    @Override
//    public boolean isAccountNonExpired(){
//        return true;
//    }
//    @Override
//    public boolean isAccountNonLock(){
//        return !locked;
//    }
//    public boolean isCredentialsNonExpired(){
//        return true;
//    }
//    public boolean isEnabled(){
//        return enabled;
//    }
//}

//package za.co.chix_mart.chixtwebapp.controller;
//import org.springframework.context.annotation.Bean;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//
//@EnableWebSecurity
//public class SecurityConfig extends WebSecurityConfigurerAdapter {
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http
//                .authorizeRequests()
//                .antMatchers("/admin/login").permitAll()
//                .antMatchers("/admin/**").authenticated()
//                .and()
//                .formLogin()
//                .loginPage("/admin/login")
//                .defaultSuccessUrl("/admin/dashboard")
//                .failureUrl("/admin/login?error=true")
//                .and()
//                .logout()
//                .logoutSuccessUrl("/admin/login?logout=true");
//
//            }
//
//    @Bean
//    public PasswordEncoder passwordEncoder() {
//        return new BCryptPasswordEncoder();
//    }
//}

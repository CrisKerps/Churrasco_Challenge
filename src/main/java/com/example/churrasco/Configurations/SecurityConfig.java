//package com.example.churrasco.Configurations;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.http.HttpMethod;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.builders.WebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.config.http.SessionCreationPolicy;
//import org.springframework.security.crypto.password.NoOpPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
//import org.springframework.security.web.csrf.CsrfAuthenticationStrategy;
//import org.springframework.security.web.csrf.CsrfException;
//
//public class SecurityConfig extends WebSecurityConfigurerAdapter{
//
////	@Override
////    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
////        auth.userDetailsService(pxpUserDetailsService);
////    }
//
//    protected void configure(HttpSecurity http) throws Exception {
////        http.authorizeRequests().anyRequest().fullyAuthenticated().and().httpBasic();
//    	http.csrf().disable().authorizeRequests()
//                .antMatchers(HttpMethod.GET,"/info").permitAll()
//                .anyRequest().fullyAuthenticated()
//                .and()
//                .httpBasic();
//        http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
//        http.cors();
//       
//    }
//
//    public void configure(WebSecurity web) throws Exception {
//        web.ignoring().antMatchers(HttpMethod.GET,"/info")
//                .antMatchers(HttpMethod.POST, "/authenticate");
//    }
//
//    @Bean
//    public PasswordEncoder passwordEncoder(){
//        return NoOpPasswordEncoder.getInstance();
//    }
//
//    
//}

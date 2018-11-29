package com.backbase.techtest.config;

//@EnableWebSecurity

public class SecurityConfig {//extends WebSecurityConfigurerAdapter {
   
//    // curl -i --user myuser:mypass http://localhost:8080/transactions/filter
//    @Override
//    public void configure(AuthenticationManagerBuilder builder)
//            throws Exception {
//        builder
//            // In a real world it would go to some Authentication database or, even better, use an OAuth 2 flow
//            .inMemoryAuthentication()
//            .withUser("myuser")
//            .password("mypass")
//            .roles("USER");
//    }
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        // HTTP Basic Auth may be enough for this context but in a real environment an API
//        // like this should consider using JWT or an OAuth 2 approach
//        http
//            .authorizeRequests()
//            .anyRequest().authenticated()
//            .and()
//            .httpBasic();
//    }
}

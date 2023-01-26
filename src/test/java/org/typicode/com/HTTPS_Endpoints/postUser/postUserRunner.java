package org.typicode.com.HTTPS_Endpoints.postUser;

import com.intuit.karate.junit5.Karate;

class postUserRunner {
    
    @Karate.Test
    Karate testUsers() {
        return Karate.run("users").relativeTo(getClass());
    }    

}

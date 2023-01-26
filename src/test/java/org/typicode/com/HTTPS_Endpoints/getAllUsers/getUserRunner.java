package org.typicode.com.HTTPS_Endpoints.getAllUsers;

import com.intuit.karate.junit5.Karate;

class getUserRunner {
    
    @Karate.Test
    Karate testUsers() {
        return Karate.run("getAllUser").relativeTo(getClass());
    }    

}

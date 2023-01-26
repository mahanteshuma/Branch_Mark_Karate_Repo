package org.typicode.com.HTTPS_Endpoints.deleteUser;

import com.intuit.karate.junit5.Karate;

class deleteUserRunner {
    
    @Karate.Test
    Karate testUsers() {
        return Karate.run("users").relativeTo(getClass());
    }    

}

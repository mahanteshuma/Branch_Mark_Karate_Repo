package org.typicode.com.HTTPS_Endpoints.putUser;

import com.intuit.karate.junit5.Karate;

class putUserRunner {
    
    @Karate.Test
    Karate testUsers() {
        return Karate.run("users").relativeTo(getClass());
    }    

}

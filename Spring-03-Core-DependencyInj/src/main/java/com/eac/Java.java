package com.eac;

import lombok.AllArgsConstructor;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
@ToString
public class Java {

    //Field Injection
//    @Autowired
//    OfficeHours officeHours;

    //Construction Injection -> Note: When using @AllArgsConstructor from lombok, construction Injection is no longer required afterV:4.3
    OfficeHours officeHours;

//    @Autowired // commented out because we are using @AllArgsConstructor line 17
//    public Java(OfficeHours officeHours) {
//        this.officeHours = officeHours;
//    }

    public void getTeachingHours(){
        System.out.println("Weekly teaching hours : " + (20 + officeHours.getHours()));
    }
}

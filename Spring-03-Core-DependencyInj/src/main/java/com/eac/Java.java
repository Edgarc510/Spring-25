package com.eac;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class Java {

    //Field Injection
//    @Autowired
//    OfficeHours officeHours;

    //Construction Injection -> Note: When using @AllArgsConstructor from lombok, construction Injection is no longer required afterV:4.3
    OfficeHours officeHours;

//    @Autowired
//    public Java(OfficeHours officeHours) {
//        this.officeHours = officeHours;
//    }

    public void getTeachingHours(){
        System.out.println("Weekly teaching hours : " + (20 + officeHours.getHours()));
    }
}

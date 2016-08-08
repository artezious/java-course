
/**
 * Created by WEO on 7/29/16.
 *
 */

package com.service;

import com.models.Admin;
import com.models.Anonym;
import com.models.UserBase;

import java.util.Arrays;

public class UserService {
    private UserBase userBaseDB [] = new UserBase[0];




    public void addNewUser(UserBase newUserBase) {
        userBaseDB = Arrays.copyOf(userBaseDB, userBaseDB.length+1);
        userBaseDB[userBaseDB.length-1] = newUserBase;
    }

    public void userDBFunctionalTestin(){

        for (UserBase userBase : userBaseDB) {
            if(UserBase.ADMIN_ROLE.equals(userBase.getRole())){
                Admin admin = (Admin) userBase;
                admin.setDBPrivilegies();
                continue;
            }
            if (UserBase.USER_ROLE.equals(userBase.getRole())){
                userBase.commonUserMethods();
                continue;
            }
            if (UserBase.ANONYM_ROLE.equals(userBase.getRole())) {
                Anonym anonym = (Anonym) userBase;
                anonym.simpleAnonymMethod();
                continue;
            }
        }

    }

    public UserBase getFirstAnonymUser(){
        for (UserBase userBase : userBaseDB) {
            if (UserBase.ANONYM_ROLE.equals(userBase)) {
                return userBase;
            }
        }
        throw new IllegalArgumentException();
    }

    public UserBase[] getUserBaseDB() {
        return userBaseDB;
    }

    public String setUserRoleByPropertiesService (UserCredPropertiesService service, UserBase user) {

        if(service.getUserName().equals(user.getUsername()) &&
                service.getPassWord().equals(user.getPassword())) {
                    user.setRole(service.getRole());

        }

    }

}

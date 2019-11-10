package com.practice.sudocodes;
/**
 * 
 * @author ADMIN
 *Must contain at least one digit
 Must contain at least one of the following special characters @, #, $
Length should be between 6 to 8 characters.
 */

public class PasswordValidator {
    public static int display(String password){
    	//copied from google
if(password.matches(".*[0-9]{1,}.*") && password.matches(".*[@#$]{1,}.*") && password.length()>=6 && password.length()<=8)
                    {
                                    return 1;
                    }
                    else
                    {
                                    return -1;
                    }
       }
public static int dis(String pass){
	if(pass.matches(".*[0-9]{1,}.*")&&pass.length()==6){
		
		return 1;
	}
	
	else{
		
	}
	return -1;
		
	}
	
	

}

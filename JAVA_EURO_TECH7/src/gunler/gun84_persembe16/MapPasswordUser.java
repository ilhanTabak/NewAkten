package gunler.gun84_persembe16;

import java.util.HashMap;
import java.util.Map;

    public class MapPasswordUser {
        public static void main(String[] args) {
            Map<String,String> usersPasswordList = new HashMap<>();

            usersPasswordList.put("ahmet","12345");
            usersPasswordList.put("mehmet","xyz1234!");
            usersPasswordList.put("ali","abc234");

            System.out.println("Users and Paswords : " + usersPasswordList);

            String userName = "ali";
            String password = "abc234";

            boolean flag = false;
            for(Map.Entry<String,String>  userEntry: usersPasswordList.entrySet()){
                if(userName.equals(userEntry.getKey()) && password.equals(userEntry.getValue())){
                    System.out.println("Login successful.");
                    flag = true;
                    break;
                }
            }
            if (!flag){ //(flag != true)
                System.out.println("Login unsuccessful!");
            }
        }
    }


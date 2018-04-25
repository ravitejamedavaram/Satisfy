package my.trial.service;

import my.trial.dao.UserDao;
import my.trial.dto.UserDto;
import my.trial.security.Encoder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserService {

    @Autowired
    UserDao userDao;

    public UserDto adduser(UserDto userDto){
        Encoder encoder = new Encoder();
        String encodedpassword = encoder.encode(userDto.getPassword());
        return userDao.adduser(userDto.getUsername(),encodedpassword,userDto.getEmail(),1);
    }
}

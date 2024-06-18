package pe.suasnabar.appusers.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.suasnabar.appusers.clients.MovieClient;
import pe.suasnabar.appusers.dto.request.CreateUserRequest;
import pe.suasnabar.appusers.dto.response.MovieResponseDto;
import pe.suasnabar.appusers.model.entity.User;
import pe.suasnabar.appusers.repository.UserRepository;
import pe.suasnabar.appusers.services.IUserService;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private MovieClient movieClient;

    @Autowired
    private UserRepository userRepository;


    @Override
    @Transactional
    public List<MovieResponseDto> getFavouriteMoviesByUserId(Integer userId) {
        List<MovieResponseDto> result = movieClient.getFavouriteMoviesByUserId(userId);
        return result;
    }

    @Override
    public User createUser(CreateUserRequest request) {
        List<User> users = userRepository.findAll();
        User user = User.builder()
                .id(users.size() + 1)
                .name(request.getName())
                .password(request.getPassword())
                .email(request.getEmail())
                .build();
        User usercreated = userRepository.save(user);
        return usercreated;
    }

    @Override
    public List<User> usersList() {
        return userRepository.findAll();
    }

}

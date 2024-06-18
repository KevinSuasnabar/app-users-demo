package pe.suasnabar.appusers.services;

import pe.suasnabar.appusers.dto.request.CreateUserRequest;
import pe.suasnabar.appusers.dto.response.MovieResponseDto;
import pe.suasnabar.appusers.model.entity.User;

import java.util.List;

public interface IUserService {

    List<MovieResponseDto> getFavouriteMoviesByUserId(Integer userId);

    User createUser(CreateUserRequest request);

    List<User> usersList();
}

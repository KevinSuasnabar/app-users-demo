package pe.suasnabar.appusers.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import pe.suasnabar.appusers.dto.response.MovieResponseDto;

import java.util.List;

@FeignClient(name = "movies-app", url = "${movies.service.url}")
public interface MovieClient {

    @GetMapping("/movies/{userId}")
    List<MovieResponseDto> getFavouriteMoviesByUserId(@PathVariable("userId") Integer id);
}
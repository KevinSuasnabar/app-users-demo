package pe.suasnabar.appusers.dto.response;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class MovieResponseDto {

    private Long id;
    private String title;
    private Integer releaseYear;


}
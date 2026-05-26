package az.company._th_exam_example.mapper;

import az.company._th_exam_example.dao.entity.BookEntity;
import az.company._th_exam_example.model.dto.request.BookRequest;
import az.company._th_exam_example.model.dto.response.BookResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.context.annotation.Bean;


@Mapper(componentModel = "spring")
public interface BookMapper {
    @Mapping(target = "id", ignore = true)
    BookEntity toBookEntity(BookRequest bookRequest);

    BookResponse toBookResponse(BookEntity bookEntity);
}

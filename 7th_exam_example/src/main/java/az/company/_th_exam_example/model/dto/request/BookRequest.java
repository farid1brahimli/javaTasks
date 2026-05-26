package az.company._th_exam_example.model.dto.request;

import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class BookRequest {
    @NotBlank(message = "Title cannot be blank")
    String title;
    @NotBlank(message = "Author cannot be blank")
    String author;
    @NotNull(message = "Price cannot be blank")
    BigDecimal price;
}

package com.springboot.blog.springbootblogrestapi.payload;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommentDto {
    private long id;

    //name should not be null or empty
    @NotEmpty(message = "Name should not be null or empty")
    private String name;

    //Email should not be null or empty
    //email field validation
    @NotEmpty(message = "Email should not be null or empty")
    @Email(message = "Provide valid email")
    private String email;

    //Comment body should not be null or empty
    //comment body must be minimum 10 characters
    @NotEmpty(message = "Body should not be null or empty")
    @Size(min = 10, message = "Content body should be minimum 10 characters")
    private String body;
}

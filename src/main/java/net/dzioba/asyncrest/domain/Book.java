package net.dzioba.asyncrest.domain;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
@Builder
public class Book {

    private Long id;
    private String title;
    private String author;
    private String isbn;
    private LocalDate published;

}

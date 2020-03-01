package net.dzioba.asyncrest.domain;

import lombok.*;

import javax.xml.bind.annotation.XmlRootElement;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
@Builder
@XmlRootElement
public class Book implements BaseEntity {

    private Long id;
    private String title;
    private String author;
    private String isbn;
    private LocalDate published;

}

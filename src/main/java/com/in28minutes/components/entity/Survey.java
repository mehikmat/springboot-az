package com.in28minutes.components.entity;

import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class Survey {
    private String id;
    private String title;
    private String description;
    private List<Question> questions;
}

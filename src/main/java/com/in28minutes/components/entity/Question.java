package com.in28minutes.components.entity;


import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Question {
    private String id;
    private String description;
    private String correctAnswer;
    private List<String> options;
}

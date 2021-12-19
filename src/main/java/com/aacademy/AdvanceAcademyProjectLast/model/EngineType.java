package com.aacademy.AdvanceAcademyProjectLast.model;

import com.aacademy.AdvanceAcademyProjectLast.model.enums.EngineTypesEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Entity
@Table(name = "engineTypes")

public class EngineType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Column(nullable = false, unique = false)
    private int engineTypeInt;

    public EngineType(EngineTypesEnum engineType) {

        switch (engineType) {
            case PETROL:
                engineTypeInt = 1;
                break;
            case DIESEL:
                engineTypeInt = 2;
                break;
            case ELECTRIC:
                engineTypeInt = 3;
                break;
        }
    }
}

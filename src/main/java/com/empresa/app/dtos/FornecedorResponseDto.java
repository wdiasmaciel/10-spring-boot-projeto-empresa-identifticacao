package com.empresa.app.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class FornecedorResponseDto {

    @NotNull
    @EqualsAndHashCode.Include
    private UUID id;

    @NotNull
    @NotBlank
    private String nome;

    @NotNull
    @NotBlank
    private String telefone;

    @NotNull
    @NotBlank
    private String endereco;
}

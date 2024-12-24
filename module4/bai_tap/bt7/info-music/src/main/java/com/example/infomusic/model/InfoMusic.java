package com.example.infomusic.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "info_musics")
public class InfoMusic {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",columnDefinition = "INT")
    private Integer id;

    @NotBlank(message = "tên bài hát không được để trống")
    @Size(max = 800,message = "Tên bài hát không được quá 800 ký tự")
    @Pattern(regexp = "^[^@;,.=\\-+*/]*$", message = "Tên bài hát không được chứa ký tự đặc biệt")
    @Column(name = "name_music",columnDefinition = "VARCHAR(50)")
    private String nameMusic;

    @NotBlank(message = "Nghệ sĩ thể hiện không được để trống")
    @Size(max = 300, message = "Nghệ sĩ thể hiện không được vượt quá 300 ký tự")
    @Pattern(regexp = "^[^@;,.=\\-+]*$", message = "Nghệ sĩ thể hiện không được chứa ký tự đặc biệt")
    @Column(name = "actor",columnDefinition = "VARCHAR(50)")
    private String actor;

    @NotBlank(message = "Thể loại nhạc không được để trống")
    @Size(max = 1000, message = "Thể loại nhạc không được vượt quá 1000 ký tự")
    @Pattern(regexp = "^[^@;.=\\-+]*$", message = "Thể loại nhạc chỉ được chứa dấu phẩy ',' và không có ký tự đặc biệt khác")
    @Column(name = "path_music",columnDefinition = "TEXT")
    private String pathMusic;
}

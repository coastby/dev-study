package com.study.dev.entity;

import com.study.dev.user.dto.Gender;
import com.study.dev.user.dto.UserStatus;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.sql.Blob;
import java.sql.Date;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;
    private String loginId;
    private String name;
    private String password;
    @Column(unique = true, nullable = false)
    private String email;
    private String oauthId;
    private String introduction;
    private LocalDateTime regiDate;
    private LocalDateTime modDate;
    private String github;
    private String blog;
    private Blob profileImg;
    private Boolean isDeleted;
    private Date birth;
    private Gender gender;
    private UserStatus status;

}

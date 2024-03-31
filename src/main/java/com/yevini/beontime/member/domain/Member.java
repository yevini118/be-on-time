package com.yevini.beontime.member.domain;

import com.yevini.beontime.common.domain.BaseTime;
import jakarta.persistence.Entity;
import lombok.Getter;

@Getter
@Entity
public class Member extends BaseTime {

    private Long id;
    private String nickname;
    private String email;
    private String password;
}

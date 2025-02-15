package kr.co.joneconsulrting.newmyrestfulservice.bean;

import com.fasterxml.jackson.annotation.JsonFilter;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonFilter("UserInfo")
public class AdminUser {
    private Integer id; // 사용자 ID

    @Size(min = 2, message = "Name은 2글자 이상 입력해 주세요.")
    private String name; // 사용자 이름

    @Past
    private Date joinDate; // 가입 날짜

//    @JsonIgnore
    private String password; // 비밀번호
//    @JsonIgnore
    private String ssn; // 주민등록번호
}


package ru.derevnin.springbootdiplom.model;

import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor(force = true)
@Entity
@Table(name = "captcha_codes")
public class CaptchaCode {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "time")
    private LocalDateTime time;

    @Column(name = "code")
    private String code;

    @Column(name = "secret_code")
    private String secretCode;
}

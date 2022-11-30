package com.jpa.jparticle.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity // DB가 해당 객체를 인식가능하게 함! (해당클래스로 테이블을 생성한다)
@NoArgsConstructor // ( default constructor 추가 )
@AllArgsConstructor // ( 해당 클래스의 모든 필드를 매개변수로 갖는 constructor 추가 )
@ToString
@Getter
public class Article {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 자동 생성 전략
    private Long id;
    @Column
    private String title;
    @Column
    private String content;

    public void patch(Article article) {
        if (article.title != null)
            this.title = article.title;
        if (article.content != null)
            this.content = article.content;
    }
}

 package com.cos.blog.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
//ORM -> Java(다른언어포함) Object -> 테이블로 매핑해주는 기술
@Entity //User 클래스가 자동으로 Mysql에 테이블이 생성
// @DynamicInsert // insert시에 null인 필드를 제외시켜준다.
public class User {
	
	@Id //Primary Key
	@GeneratedValue(strategy = GenerationType.IDENTITY) // 해당 프로젝트에서 연결된 DB의 넘버링 전략을 따라간다.
	private int id;; // 시퀀스, aute_increment
	
	@Column(nullable = false, length = 100, unique = true)
	private String username; //아이디
	
	@Column(nullable = false, length = 100) // 123456 => 해쉬 (비밀번호 암호화)
	private String password;
	
	@Column(nullable = false, length = 50)
	private String email;
	
	// @ColumnDefault("user")
	//DB는 RoleType이라는게 없다.
	@Enumerated(EnumType.STRING)
	private RoleType role; //Enum을 쓰는게 좋다. // ADMIN, USER
	
	private String oauth; // kakao, google 사용자 구분
	
	@CreationTimestamp //시간이 자동입력
	private Timestamp createDate;
}

package com.godbyul.recruit_platform.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

@Entity
@Table(name = "recruit")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Recruit extends BaseEntity {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "company_id", nullable = false)
    private Company company;

    @Column(nullable = false)
    private String nationality;

    @Column(nullable = false)
    private String region;

    @Column(nullable = false)
    private String position;

    private Integer reward;

    @Column(nullable = false, columnDefinition = "text")
    private String content;

    @JdbcTypeCode(SqlTypes.JSON)
    @Column(nullable = false, columnDefinition = "json")
    private String[] skill;

    @Builder
    private Recruit(Company company, String nationality, String region,
                   String position, Integer reward, String content, String[] skill) {
        this.company = company;
        this.nationality = nationality;
        this.region = region;
        this.position = position;
        this.reward = reward;
        this.content = content;
        this.skill = skill;
    }
}

package eys.hellospring;

import eys.hellospring.aop.TimeTraceAop;
import eys.hellospring.repository.JdbcMemberRepository;
import eys.hellospring.repository.JdbcTemplateMemberRepository;
import eys.hellospring.repository.JpaMemberRepository;
import eys.hellospring.repository.MemberRepository;
import eys.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.persistence.EntityManager;
import javax.sql.DataSource;

@Configuration
public class SpringConfig {
    private final MemberRepository memberRepository;
    public SpringConfig(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }
    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository);
    }
}
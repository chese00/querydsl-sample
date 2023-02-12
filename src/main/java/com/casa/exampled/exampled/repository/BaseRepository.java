package com.casa.exampled.exampled.repository;

import com.querydsl.jpa.impl.JPAQueryFactory;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import javax.persistence.EntityManager;

@NoRepositoryBean
public abstract class BaseRepository<T, ID> extends SimpleJpaRepository<T, ID> {

    private final EntityManager em;
    protected final JPAQueryFactory queryFactory;

    public BaseRepository(Class<T> domainClass, EntityManager em) {
        super(domainClass, em);
        this.em = em;
        this.queryFactory = new JPAQueryFactory(em);
    }

    public void clear() {
        em.clear();
    }
    public void detach(T entity) {
        em.detach(entity);
    }
}

package com.casa.exampled.exampled.repository;

import com.casa.exampled.exampled.entity.QTest1;
import com.casa.exampled.exampled.entity.Test1;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class Test1_Repository extends BaseRepository {

    public Test1_Repository( EntityManager em) {
        super(Test1.class, em);
    }

    public List<Test1> findByString(String name){
        return queryFactory
                .selectFrom(QTest1.test1)
                .where(QTest1.test1.string.eq(name))
                .limit(1)
                .fetch();
    }

}

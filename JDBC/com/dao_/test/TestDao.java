package com.dao_.test;

import com.dao_.dao.ActorDao;
import com.dao_.domain.Actor;
import org.junit.Test;

import java.util.List;

/**
 * @avthor 刘添
 * @varsion 1.0
 */
public class TestDao {
    //测试ActorDao对actor表crud操作
    @Test
    public void testActorDao(){
        ActorDao actorDao = new ActorDao();
        //查询多行
        List<Actor> actors = actorDao.queryMulti("select * from actor where id >= ?", Actor.class, 1);
        for (Actor actor : actors){
            System.out.println(actor);
        }
    }
}

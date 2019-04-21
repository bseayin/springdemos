package com.zz.repository;

import com.zz.entity.UserStar;
import com.zz.vo.SelectResultVo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Map;

public interface UserStarRepository extends JpaRepository<UserStar,Long> {
    @Query(nativeQuery = true,value="select count(*) as selectcount,u.user_id,s.`type`,s.id as starId \n" +
            "from user_star u \n" +
            "left join star s on(u.star_id=s.id )\n" +
            "group by user_id,s.`type`,s.id ")
    public List<Object[]> getSelectData();
}

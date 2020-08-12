package com.cloud.alibaba.repository;

import com.cloud.alibaba.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Jason
 * @date 2020/7/31 18:50
 * @description
 */
public interface UserRepository extends JpaRepository<User,Long> {

    User findByNickname(String nickname);
}

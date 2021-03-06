package com.cts.userinfo.dao;

import com.cts.userinfo.vo.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserInfoDAO extends JpaRepository<UserInfo, Long> {
}

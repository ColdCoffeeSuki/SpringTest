package com.minami.dao;

import com.minami.domain.Account;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface AccountDao {
    @Insert("insert into account(id, name, password) values (#{name},#{money})")
    void insert(Account account);

    @Delete("delete from account where id = #{id}")
    void deleteById(Integer id);

    @Update("update account set name = #{name}, password = #{password} where id = #{id}")
    void update(Account account);

    @Select("select * from account")
    List<Account> findAll();

    @Select("select * from account where id = #{id}")
    Account selectById(Integer id);
}

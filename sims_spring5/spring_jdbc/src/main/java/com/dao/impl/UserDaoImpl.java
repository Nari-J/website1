package com.dao.impl;
import com.dao.IUserDao;
import com.po.User;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;
import javax.annotation.Resource;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

@Repository
public class UserDaoImpl implements IUserDao {

    @Resource
    private JdbcTemplate jdbcTemplate;

    @Override
    public Integer save(User user) {
        return jdbcTemplate.update("insert into t_user(user_name,user_pwd) values (?,?)",
                user.getUserName(),user.getUserPwd());
    }

    @Override
    public Integer saveHasKey(User user) {
        KeyHolder keyHolder=new GeneratedKeyHolder();
        jdbcTemplate.update((connection)->{
            PreparedStatement ps=connection.prepareStatement("insert into t_user(user_name,user_pwd) values (?,?)", Statement.RETURN_GENERATED_KEYS);
            ps.setString(1,user.getUserName());
            ps.setString(2, user.getUserPwd());
            return ps;
        },keyHolder);
        return keyHolder.getKey().intValue();
    }

    @Override
    public Integer update(User user) {
        return jdbcTemplate.update("update t_user set user_name=?,user_pwd=? where id=?",
                user.getUserName(),user.getUserPwd(),user.getId());

    }

    @Override
    public Integer del(Integer id) {
        return jdbcTemplate.update("delete from t_user where id=?",id);
    }

    //    查询单列结果 queryForObject
    @Override
    public Integer countUser() {
        return jdbcTemplate.queryForObject("select count(*) from t_user", Integer.class);
    }


//    查询Java Bean实体对象

//    方法1 ResultSetExtractor收集结果
//    匿名实现ResultSetExtractor<List<User>>
//    @Override
//    public List<User> queryUsers() {
//        return jdbcTemplate.query("select id,user_name,user_pwd from t_user", new ResultSetExtractor<List<User>>() {
//            @Override
//            public List<User> extractData(ResultSet resultSet) throws SQLException, DataAccessException {
//                List<User> users = new ArrayList<User>();
//                while (resultSet.next()) {
//                    User user = new User();
//                    user.setUserPwd(resultSet.getString("user_pwd"));
//                    user.setUserName(resultSet.getString("user_name"));
//                    user.setId(resultSet.getInt("id"));
//                    users.add(user);
//                }
//                return users;
//            }
//        });
//    }
//    方法2 常用
//    实现内部类
    public List<User> queryUsers(){
        return jdbcTemplate.query("select id,user_name,user_pwd from t_user", new UserRowMapper() {
        });
    }

    @Override
    public User queryById(Integer id) {
        return jdbcTemplate.queryForObject("select id,user_name,user_pwd from t_user where id=?",new Object[]{id},new UserRowMapper());
    }

    public static class UserRowMapper implements RowMapper<User>{
        @Override
        public User mapRow(ResultSet resultSet, int i) throws SQLException {
            User user = new User();
            user.setUserPwd(resultSet.getString("user_pwd"));
            user.setUserName(resultSet.getString("user_name"));
            user.setId(resultSet.getInt("id"));
            return user;
        }
    }




}





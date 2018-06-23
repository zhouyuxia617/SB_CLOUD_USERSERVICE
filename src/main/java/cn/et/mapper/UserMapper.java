package cn.et.mapper;

import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {

	/**
	 * 根据用户名查找用户
	 */
	@Select("select * from t_user where n_name=#{userName}")
	public Map queryUser(@Param("userName")String userName);
}

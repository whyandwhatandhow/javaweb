package mybatis.mapper;

import mybatis.domain.login;

import java.util.List;

public interface LoginMapper {

    List<login> selectAll();
}

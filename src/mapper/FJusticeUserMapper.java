package mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pojo.FJusticeUser;
import pojo.FJusticeUserExample;

public interface FJusticeUserMapper {
    long countByExample(FJusticeUserExample example);

    int deleteByExample(FJusticeUserExample example);

    int insert(FJusticeUser record);

    int insertSelective(FJusticeUser record);

    List<FJusticeUser> selectByExample(FJusticeUserExample example);

    int updateByExampleSelective(@Param("record") FJusticeUser record, @Param("example") FJusticeUserExample example);

    int updateByExample(@Param("record") FJusticeUser record, @Param("example") FJusticeUserExample example);
}
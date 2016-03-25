package yong.xy;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;

public class xyDAOImple implements xyDAO {
   
   private SqlSessionTemplate sqlMap;
   

   public xyDAOImple(SqlSessionTemplate sqlMap) {
      super();
      this.sqlMap = sqlMap;
   }
    
   public List<xyDTO> xylist() {
      
      List<xyDTO> list=sqlMap.selectList("xyList");
      return list;
   }

}
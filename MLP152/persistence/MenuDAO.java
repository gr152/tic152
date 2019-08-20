package com.hexaware.MLP152.persistence;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.customizers.Mapper;
import java.util.List;
import com.hexaware.MLP152.model.Menu;
/**
 * MenuDAO class used to fetch data from data base.
 * @author hexware
 */
public interface MenuDAO {
    /**
     * @return the all the Menu record.
     */
  @SqlQuery("Select * from Menu")
    @Mapper(MenuMapper.class)
    List<Menu> show();
  /**
   * @return the particular record according to the food id condition
   * @param foodId to send customerId to display the particular record
   */
  @SqlQuery("Select * from Menu where F_ID = :F_ID")
   @Mapper(MenuMapper.class)
   Menu showById(@Bind ("F_ID") int foodId);
}

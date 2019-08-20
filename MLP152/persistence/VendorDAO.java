package com.hexaware.MLP152.persistence;

import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.customizers.Mapper;
import com.hexaware.MLP152.model.Vendor;

import org.skife.jdbi.v2.sqlobject.Bind;
import java.util.List;
/**
 * VendorDAO class used to fetch data from data base.
 * @author hexware.
 */
public interface VendorDAO {
    /**
     * @return the all the vendor record.
     * @param venId V_ID.
     * @param vPass V_PASSWORD.
     */
  @SqlQuery("SELECT * FROM Vendor where V_ID =:V_ID AND V_PASSWORD =:V_PASSWORD")
  @Mapper(VendorMapper.class)
    Vendor venlogin(@Bind("V_ID") int venId, @Bind("V_PASSWORD") String vPass);
  /**
   * @return specific vendor details.
   *  @param venId parameter.
   */
  @SqlQuery("Select * from Vendor WHERE V_ID=:V_ID")
  @Mapper(VendorMapper.class)
  List<Vendor> showven(@Bind("V_ID")int venId);
}

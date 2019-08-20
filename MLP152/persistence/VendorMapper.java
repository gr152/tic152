package com.hexaware.MLP152.persistence;
import com.hexaware.MLP152.model.Vendor;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.skife.jdbi.v2.tweak.ResultSetMapper;
import org.skife.jdbi.v2.StatementContext;
/**
 * VendorMapper class used to fetch vendor data from database.
 * @author hexware
 */
public class VendorMapper implements ResultSetMapper<Vendor> {
    /**
     * @param idx the index
     * @param rs the resultset
     * @param ctx the context
     * @return the mapped vendor object
     * @throws SQLException in case there is an error in fetching data from the resultset
     */
  public final Vendor map(final int idx, final ResultSet rs, final StatementContext ctx) throws SQLException {
      /**
       * @return Vendor
       */
    return new Vendor(rs.getInt("V_ID"), rs.getString("V_NAME"), rs.getString("V_USERNAME"), rs.getString("V_PASSWORD"),
      rs.getInt("V_CONTACT"), rs.getString("V_EMAIL"), rs.getString("V_ADDRESS"));
  }
}

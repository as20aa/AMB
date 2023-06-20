package com.as.AMB.util;

import org.apache.commons.lang3.StringUtils;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;
import org.apache.ibatis.type.MappedTypes;
import org.apache.ibatis.type.TypeHandler;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

/***
 * ListToStringTypeHandler
 * @description the self-defined type handler to convert list of strings to string to store it in one column
 * @author as
 * @version 1
 * @date 2023-06-19
 */
@MappedJdbcTypes(JdbcType.VARCHAR)
@MappedTypes(List.class)
public class ListToStringTypeHandler implements TypeHandler<List<String>> {
    @Override
    public void setParameter(PreparedStatement ps, int i, List<String> parameter, JdbcType jdbcType) throws SQLException {
        StringBuilder stringBuffer = new StringBuilder();
        for(int j=0; j<parameter.size();j++){
            if(j==parameter.size()-1) {
                stringBuffer.append(parameter.get(j));
            } else {
                stringBuffer.append(parameter.get(j)).append(",");
            }
        }
        ps.setString(i, stringBuffer.toString());
    }

    @Override
    public List<String> getResult(ResultSet rs, String columnName) throws SQLException {
        String resultString = rs.getString(columnName);
        if (StringUtils.isNotEmpty(resultString)) {
            return Arrays.asList(resultString.split(","));
        }
        return null;
    }

    @Override
    public List<String> getResult(ResultSet rs, int columnIndex) throws SQLException {
        String resultString = rs.getString(columnIndex);
        if (StringUtils.isNotEmpty(resultString)) {
            return Arrays.asList(resultString.split(","));
        }
        return null;
    }

    @Override
    public List<String> getResult(CallableStatement cs, int columnIndex) throws SQLException {
        String resultString = cs.getString(columnIndex);
        if (StringUtils.isNotEmpty(resultString)) {
            return Arrays.asList(resultString.split(","));
        }
        return null;
    }
}
